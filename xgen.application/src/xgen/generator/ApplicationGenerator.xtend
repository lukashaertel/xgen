/*
 * generated by Xtext
 */
package xgen.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import xgen.generate.Iteration
import xgen.postprocess.Processor
import java.util.Collection
import java.util.List
import java.util.Random
import xgen.parsetree.Leaf
import xgen.postprocess.TransformSome
import xgen.postprocess.RemoveAll
import xgen.postprocess.TransformAll
import xgen.application.Application
import xgen.grammar.util.GrammarConverter
import xgen.grammar.util.GrammarUtil
import xgen.postprocess.TransformOne
import xgen.grammar.Reference
import org.eclipse.emf.ecore.util.EcoreUtil
import xgen.output.ApplicationOutput
import static xgen.grammar.util.GrammarConstructor.*

class ReplaceInitial extends TransformOne {

	override protected select(Leaf it) {
		value == "<initial>"
	}

	override protected transform(Leaf it) {
		new Leaf("initial")
	}

}

class RemoveRemainingInitial extends RemoveAll {

	override protected remove(Leaf it) {
		value == "<initial>"
	}
}

class ReplaceInputValue extends TransformAll {
	var i = 0
	var j = #["SomeInput", "MoreInput", "SlightlyDifferentInput", "EvenMore"]

	override protected transform(Leaf it) {
		if (value != "<input value>")
			return it

		val r = j.get(i % j.size)

		i = i + 1

		return new Leaf(r)
	}
}

class ReplaceActionValue extends TransformAll {
	var i = 0
	var j = #["DoStuff", "DoOtherStuff", "StopWithSomething", "ForgetSomething"]

	override protected transform(Leaf it) {
		if (value != "<action value>")
			return it

		val r = j.get(i % j.size)

		i = i + 1

		return new Leaf(r)
	}
}

class ReplaceStateName extends TransformAll {
	var i = 0
	val Collection<String> exchange

	new(Collection<String> exchange) {
		this.exchange = exchange
	}

	override protected resetOne() {
		i = 0
		exchange.clear
	}

	override protected transform(Leaf it) {
		if (value != "<state name>")
			return it

		val r = "State" + i

		i = i + 1

		exchange += r
		return new Leaf(r)
	}
}

class ReplaceStateRef extends TransformAll {
	val random = new Random
	val List<String> exchange

	new(List<String> exchange) {
		this.exchange = exchange
	}

	override protected transform(Leaf it) {
		if (value != "<state reference>")
			return it

		new Leaf(exchange.get(random.nextInt(exchange.size)))
	}
}

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class ApplicationGenerator implements IGenerator {

	def getEffectiveGrammar(Application it) {
		val g = GrammarConverter.fromXText(target)

		for (rr : ruleReplacements)
			GrammarUtil.getDefinition(g, rr.target.name).ifPresent[rhs = rr.replacement]

		// Sort by position descending so we don't mess up positions replacing prior candidates
		val crs = constructReplacements.sortBy[if(positioned) -position else 1]
		val mas = multiplicityAdjustments.sortBy[if(positioned) -position else 1]

		for (cs : crs)
			GrammarUtil.getDefinition(g, cs.target.name).ifPresent [
				rhs = GrammarUtil.selectTransform(rhs, [x|EcoreUtil.equals(cs.selector, x)],
					[x|EcoreUtil.copy(cs.replacement)], cs.positioned, cs.position);
			]
			
		for(ma : mas)
			GrammarUtil.getDefinition(g, ma.target.name).ifPresent [
				rhs = GrammarUtil.adjustMultiplicity(rhs, [x|multiplicity(x.operand, ma.min, ma.upperBounded, ma.max)],  ma.positioned, ma.position )
			]
		
		
		return g
	}

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		// Exchange buffer object for the generated states in the replace state name PP
		val s = newArrayList()

		// Processor sequence
		val t = Processor.compose(
			// Replace one <initial> placeholder
			new ReplaceInitial, 
			
			// Remove all remaining <initial> placeholders
			new RemoveRemainingInitial,
			
			// Replace all <input value> positions with a set of values
			new ReplaceInputValue,
			
			// Replace all <action value> positions with a set of values
			new ReplaceActionValue,
			
			// Replace state names and store the defined names in an array list
			new ReplaceStateName(s),
			
			// Replace all referenced names with the ones defined before this
			new ReplaceStateRef(s))

		for (a : resource.allContents.filter(Application).toIterable) {

			// Get effective grammar from application
			val g = a.effectiveGrammar

			// Make iteration from grammar
			val i = new Iteration(g)

			// Iterate the first rule
			val x = i.iterate(g.definitions.findFirst[!lexical])

			// Post-process
			val y = t.postProcess(x)

			ApplicationOutput.print("Iteration", null,
				[ o |
					o.println()
					// Print some items
					for (p : a.min .. a.max) {
						y.get(p).ifPresent [ pt |
							o.println(p.toString);
							o.println(pt.flatten(false));
							o.println();
						]
					}
				])

		}
	}
}
