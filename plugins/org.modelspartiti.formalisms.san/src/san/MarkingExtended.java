/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marking Extended</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link san.MarkingExtended#getNode <em>Node</em>}</li>
 * </ul>
 *
 * @see san.SANPackage#getMarkingExtended()
 * @model
 * @generated
 */
public interface MarkingExtended extends Marking {
	/**
	 * Returns the value of the '<em><b>Node</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node</em>' containment reference.
	 * @see #setNode(Node)
	 * @see san.SANPackage#getMarkingExtended_Node()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Node getNode();

	/**
	 * Sets the value of the '{@link san.MarkingExtended#getNode <em>Node</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Node</em>' containment reference.
	 * @see #getNode()
	 * @generated
	 */
	void setNode(Node value);

} // MarkingExtended
