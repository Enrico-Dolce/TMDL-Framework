/**
 *
 * $Id$
 */
package san.validation;

import san.Distribution;
import san.Expression;

/**
 * A sample validator interface for {@link san.TimedActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TimedActivityValidator {
	boolean validate();

	boolean validateTimeDistribution(Distribution value);
	boolean validateActivation(Expression value);
	boolean validateReactivation(Expression value);
}