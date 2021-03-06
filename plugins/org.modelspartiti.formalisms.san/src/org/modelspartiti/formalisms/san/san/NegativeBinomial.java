/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Negative Binomial</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getS <em>S</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getP <em>P</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getNegativeBinomial()
 * @model
 * @generated
 */
public interface NegativeBinomial extends Distribution {
	/**
	 * Returns the value of the '<em><b>S</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>S</em>' containment reference.
	 * @see #setS(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getNegativeBinomial_S()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getS();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getS <em>S</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' containment reference.
	 * @see #getS()
	 * @generated
	 */
	void setS(Expression value);

	/**
	 * Returns the value of the '<em><b>P</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>P</em>' containment reference.
	 * @see #setP(Expression)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getNegativeBinomial_P()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getP();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.NegativeBinomial#getP <em>P</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' containment reference.
	 * @see #getP()
	 * @generated
	 */
	void setP(Expression value);

} // NegativeBinomial
