/*
 * generated by Xtext
 */
package xgen.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import xgen.grammar.Grammar
import xgen.generate.Iteration
import xgen.postprocess.Processor
import java.util.Collection
import java.util.List
import java.util.Random
import xgen.parsetree.Leaf
import xgen.postprocess.TransformSome
import xgen.postprocess.RemoveAll
import xgen.postprocess.TransformAll

class ReplaceInitial extends TransformSome {

	override protected select(Leaf it) {
		value == "<initial>"
	}

	override protected transform(Leaf it) {
		new Leaf("initial")
	}
	
	override protected selectAmount(int n) {
		n > 1
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
		if (value != "<state ref>")
			return it

		new Leaf(exchange.get(random.nextInt(exchange.size)))
	}
}

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class GrammarGenerator implements IGenerator {

	override void doGenerate(Resource resource, IFileSystemAccess fsa) {

		// Exchange buffer object for the generated states in the replace state name PP
		val s = newArrayList()

		// Processor sequence
		val t = Processor.compose(new ReplaceInitial, new RemoveRemainingInitial, new ReplaceInputValue,
			new ReplaceStateName(s), new ReplaceStateRef(s))

		for (g : resource.allContents.filter(Grammar).toIterable) {

			// Make iteration from g
			val i = new Iteration(g)

			// Iterate the first rule
			val x = i.iterate(g.definitions.get(0))

			// Post-process
			val y = t.postProcess(x)

			// Print some items
			for (p : 0 .. 10) {
				y.get(p).ifPresent[println(p); print("  "); println(flatten(false))]
			}
		}
	}
}
