/**
 *
 * $Id$
 */
package san.validation;

import san.Expression;

/**
 * A sample validator interface for {@link san.HyperExponential}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface HyperExponentialValidator {
	boolean validate();

	boolean validateRate0(Expression value);
	boolean validateP0(Expression value);
}
