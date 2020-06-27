/**
 */
package sant;

import org.eclipse.emf.common.util.EList;
import san.Case;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output Gate Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.OutputGateConcrete#getCase <em>Case</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getOutputGateConcrete()
 * @model
 * @generated
 */
public interface OutputGateConcrete extends OutputGate {
	/**
	 * Returns the value of the '<em><b>Case</b></em>' reference list.
	 * The list contents are of type {@link san.Case}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Case</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case</em>' reference list.
	 * @see sant.SANTPackage#getOutputGateConcrete_Case()
	 * @model required="true"
	 * @generated
	 */
	EList<Case> getCase();

} // OutputGateConcrete
