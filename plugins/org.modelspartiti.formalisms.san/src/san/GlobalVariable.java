/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Global Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.GlobalVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getGlobalVariable()
 * @model
 * @generated
 */
public interface GlobalVariable extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The default value is <code>"int"</code>.
	 * The literals are from the enumeration {@link san.VariableType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see san.VariableType
	 * @see #setType(VariableType)
	 * @see san.SANPackage#getGlobalVariable_Type()
	 * @model default="int" required="true"
	 * @generated
	 */
	VariableType getType();

	/**
	 * Sets the value of the '{@link san.GlobalVariable#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see san.VariableType
	 * @see #getType()
	 * @generated
	 */
	void setType(VariableType value);

} // GlobalVariable
