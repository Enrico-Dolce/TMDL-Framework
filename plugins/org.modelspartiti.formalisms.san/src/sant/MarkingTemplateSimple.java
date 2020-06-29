/**
 */
package sant;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Template Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sant.MarkingTemplateSimple#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see sant.SANTPackage#getMarkingTemplateSimple()
 * @model
 * @generated
 */
public interface MarkingTemplateSimple extends MarkingTemplate {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(short)
	 * @see sant.SANTPackage#getMarkingTemplateSimple_Value()
	 * @model required="true"
	 * @generated
	 */
	short getValue();

	/**
	 * Sets the value of the '{@link sant.MarkingTemplateSimple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(short value);

} // MarkingTemplateSimple
