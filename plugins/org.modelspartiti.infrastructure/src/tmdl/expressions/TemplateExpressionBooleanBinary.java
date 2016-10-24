/**
 */
package tmdl.expressions;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Expression Boolean Binary</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp1 <em>Exp1</em>}</li>
 *   <li>{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp2 <em>Exp2</em>}</li>
 * </ul>
 * </p>
 *
 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanBinary()
 * @model abstract="true"
 * @generated
 */
public interface TemplateExpressionBooleanBinary extends TemplateExpressionBoolean {
	/**
	 * Returns the value of the '<em><b>Exp1</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp1</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp1</em>' containment reference.
	 * @see #setExp1(TemplateExpressionBoolean)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanBinary_Exp1()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getExp1();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp1 <em>Exp1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp1</em>' containment reference.
	 * @see #getExp1()
	 * @generated
	 */
	void setExp1(TemplateExpressionBoolean value);

	/**
	 * Returns the value of the '<em><b>Exp2</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exp2</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exp2</em>' containment reference.
	 * @see #setExp2(TemplateExpressionBoolean)
	 * @see tmdl.expressions.ExpressionsPackage#getTemplateExpressionBooleanBinary_Exp2()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionBoolean getExp2();

	/**
	 * Sets the value of the '{@link tmdl.expressions.TemplateExpressionBooleanBinary#getExp2 <em>Exp2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exp2</em>' containment reference.
	 * @see #getExp2()
	 * @generated
	 */
	void setExp2(TemplateExpressionBoolean value);

} // TemplateExpressionBooleanBinary