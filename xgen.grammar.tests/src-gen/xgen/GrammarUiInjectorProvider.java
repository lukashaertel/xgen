/*
* generated by Xtext
*/
package xgen;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class GrammarUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return xgen.ui.internal.GrammarActivator.getInstance().getInjector("xgen.Grammar");
	}
	
}
