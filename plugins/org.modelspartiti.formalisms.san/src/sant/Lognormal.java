/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lognormal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.Lognormal#getMu <em>Mu</em>}</li>
 *   <li>{@link sant.Lognormal#getAlphaSquared <em>Alpha Squared</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getLognormal()
 * @model
 * @generated
 */
public interface Lognormal extends Distribution {
	/**
	 * Returns the value of the '<em><b>Mu</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mu</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mu</em>' containment reference.
	 * @see #setMu(Expression)
	 * @see sant.SANTPackage#getLognormal_Mu()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMu();

	/**
	 * Sets the value of the '{@link sant.Lognormal#getMu <em>Mu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mu</em>' containment reference.
	 * @see #getMu()
	 * @generated
	 */
	void setMu(Expression value);

	/**
	 * Returns the value of the '<em><b>Alpha Squared</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha Squared</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha Squared</em>' containment reference.
	 * @see #setAlphaSquared(Expression)
	 * @see sant.SANTPackage#getLognormal_AlphaSquared()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlphaSquared();

	/**
	 * Sets the value of the '{@link sant.Lognormal#getAlphaSquared <em>Alpha Squared</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha Squared</em>' containment reference.
	 * @see #getAlphaSquared()
	 * @generated
	 */
	void setAlphaSquared(Expression value);

} // Lognormal
