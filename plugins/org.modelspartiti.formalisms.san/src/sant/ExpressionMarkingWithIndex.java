/**
 */
package sant;

import tmdl.expressions.TemplateExpressionInteger;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Marking With Index</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link sant.ExpressionMarkingWithIndex#getPlace <em>Place</em>}</li>
 *   <li>{@link sant.ExpressionMarkingWithIndex#getIndex <em>Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see sant.SANTPackage#getExpressionMarkingWithIndex()
 * @model
 * @generated
 */
public interface ExpressionMarkingWithIndex extends ExpressionSegment {
	/**
	 * Returns the value of the '<em><b>Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' reference.
	 * @see #setPlace(Place)
	 * @see sant.SANTPackage#getExpressionMarkingWithIndex_Place()
	 * @model required="true"
	 * @generated
	 */
	Place getPlace();

	/**
	 * Sets the value of the '{@link sant.ExpressionMarkingWithIndex#getPlace <em>Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Place</em>' reference.
	 * @see #getPlace()
	 * @generated
	 */
	void setPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Index</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Index</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Index</em>' containment reference.
	 * @see #setIndex(TemplateExpressionInteger)
	 * @see sant.SANTPackage#getExpressionMarkingWithIndex_Index()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TemplateExpressionInteger getIndex();

	/**
	 * Sets the value of the '{@link sant.ExpressionMarkingWithIndex#getIndex <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Index</em>' containment reference.
	 * @see #getIndex()
	 * @generated
	 */
	void setIndex(TemplateExpressionInteger value);

} // ExpressionMarkingWithIndex
