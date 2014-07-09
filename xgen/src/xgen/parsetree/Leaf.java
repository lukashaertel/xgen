package xgen.parsetree;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import xgen.grammar.Element;

/**
 * Node that does not contain any more nodes
 * 
 * @author Lukas H�rtel
 *
 */
public class Leaf extends Node {
	/**
	 * The value of the leaf
	 */
	public final Object value;

	/**
	 * Constructs the leaf
	 * 
	 * @param value
	 *            The value to use
	 */
	public Leaf(Element label, Object value) {
		super(label);

		this.value = value;
	}

	@Override
	public Node transform(boolean recursive, Function<Node, Node> f) {
		return f.apply(this).clone();
	}

	@Override
	public Node transformContainer(boolean recursive,
			Function<Container, Node> f) {
		return clone();
	}

	@Override
	public Node transformLeaf(boolean recursive, Function<Leaf, Node> f) {
		return f.apply(this).clone();
	}

	@Override
	public void visit(Consumer<? super Node> f) {
		f.accept(this);
	}

	@Override
	public Leaf clone() {
		return new Leaf(label, value);
	}

	@Override
	public void flatten(Setting setting, StringBuilder target, boolean lexical) {
		setting.beforeLeaf(target, this);

		target.append(value);

		setting.afterLeaf(target, this);
	}

	@Override
	public String toString() {
		return Objects.toString(value);
	}

	@Override
	public Optional<Node> find(Predicate<? super Node> f) {
		if (f.test(this))
			return Optional.of(this);
		else
			return Optional.empty();
	}

}
