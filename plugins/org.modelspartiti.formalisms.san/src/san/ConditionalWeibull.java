/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Weibull</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.ConditionalWeibull#getAlpha <em>Alpha</em>}</li>
 *   <li>{@link san.ConditionalWeibull#getBeta <em>Beta</em>}</li>
 *   <li>{@link san.ConditionalWeibull#getT <em>T</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getConditionalWeibull()
 * @model
 * @generated
 */
public interface ConditionalWeibull extends Distribution {
	/**
	 * Returns the value of the '<em><b>Alpha</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alpha</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alpha</em>' containment reference.
	 * @see #setAlpha(Expression)
	 * @see san.SANPackage#getConditionalWeibull_Alpha()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getAlpha();

	/**
	 * Sets the value of the '{@link san.ConditionalWeibull#getAlpha <em>Alpha</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alpha</em>' containment reference.
	 * @see #getAlpha()
	 * @generated
	 */
	void setAlpha(Expression value);

	/**
	 * Returns the value of the '<em><b>Beta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Beta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Beta</em>' containment reference.
	 * @see #setBeta(Expression)
	 * @see san.SANPackage#getConditionalWeibull_Beta()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getBeta();

	/**
	 * Sets the value of the '{@link san.ConditionalWeibull#getBeta <em>Beta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Beta</em>' containment reference.
	 * @see #getBeta()
	 * @generated
	 */
	void setBeta(Expression value);

	/**
	 * Returns the value of the '<em><b>T</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>T</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>T</em>' containment reference.
	 * @see #setT(Expression)
	 * @see san.SANPackage#getConditionalWeibull_T()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getT();

	/**
	 * Sets the value of the '{@link san.ConditionalWeibull#getT <em>T</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>T</em>' containment reference.
	 * @see #getT()
	 * @generated
	 */
	void setT(Expression value);

} // ConditionalWeibull
