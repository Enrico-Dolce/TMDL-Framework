/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Exponential</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Exponential#getRate <em>Rate</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExponential()
 * @model
 * @generated
 */
public interface Exponential extends Distribution {
	/**
	 * Returns the value of the '<em><b>Rate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rate</em>' containment reference.
	 * @see #setRate(Expression)
	 * @see sant.SANTPackage#getExponential_Rate()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getRate();

	/**
	 * Sets the value of the '{@link sant.Exponential#getRate <em>Rate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' containment reference.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Expression value);

} // Exponential
