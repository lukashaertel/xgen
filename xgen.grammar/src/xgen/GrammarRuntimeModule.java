/*
 * generated by Xtext
 */
package xgen;

import org.eclipse.xtext.conversion.IValueConverterService;

import xgen.converters.GrammarValueConverters;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class GrammarRuntimeModule extends xgen.AbstractGrammarRuntimeModule {
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return GrammarValueConverters.class;
	}
}
