/**
 *
 * $Id$
 */
package tmdl.scenario.validation;

import org.eclipse.emf.common.util.EList;

import tmdl.library.TemplateAtomic;

/**
 * A sample validator interface for {@link tmdl.scenario.VariantAtomic}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariantAtomicValidator {
	boolean validate();

	boolean validateTemplate(TemplateAtomic value);
	boolean validateLabels(EList<String> value);
}