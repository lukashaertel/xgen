package xgen.postprocess;

import java.util.concurrent.atomic.AtomicReference;

import xgen.index.Index;
import xgen.parsetree.Pair;
import xgen.parsetree.Leaf;
import xgen.parsetree.Node;

/**
 * Applies a transformation to all leafs in the input parse tree
 * 
 * @author Lukas H�rtel
 *
 */
public abstract class TransformAll<UIn, Carrier, UOut> extends SingletonPostProcessor<UIn, UOut>
{

	/**
	 * Transforms a leaf
	 * 
	 * @param leaf
	 *            The input leaf
	 * @return Returns the transformed leaf
	 */
	protected abstract Pair<Carrier, Leaf> transformOneLeaf(Pair<Carrier, Leaf> p);

	protected abstract Carrier supplyCarrier(UIn s);

	protected abstract UOut finalizeCarrier(Carrier c);

	@Override
	protected Pair<UOut, Node> calculate(Pair<UIn, Node> n)
	{
		AtomicReference<Carrier> carrier = new AtomicReference<>(supplyCarrier(n.a));

		Node m = n.b.transformLeaf(true, c -> {
			Pair<Carrier, Leaf> v = transformOneLeaf(new Pair<>(carrier.get(), c));

			carrier.set(v.a);

			return v.b;
		});

		return new Pair<>(finalizeCarrier(carrier.get()), m);

	}
}
