/**
 */
package san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangular</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link san.Triangular#getMin <em>Min</em>}</li>
 *   <li>{@link san.Triangular#getMiddle <em>Middle</em>}</li>
 *   <li>{@link san.Triangular#getMax <em>Max</em>}</li>
 * </ul>
 * </p>
 *
 * @see san.SANPackage#getTriangular()
 * @model
 * @generated
 */
public interface Triangular extends Distribution {
	/**
	 * Returns the value of the '<em><b>Min</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min</em>' containment reference.
	 * @see #setMin(Expression)
	 * @see san.SANPackage#getTriangular_Min()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMin();

	/**
	 * Sets the value of the '{@link san.Triangular#getMin <em>Min</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min</em>' containment reference.
	 * @see #getMin()
	 * @generated
	 */
	void setMin(Expression value);

	/**
	 * Returns the value of the '<em><b>Middle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle</em>' containment reference.
	 * @see #setMiddle(Expression)
	 * @see san.SANPackage#getTriangular_Middle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMiddle();

	/**
	 * Sets the value of the '{@link san.Triangular#getMiddle <em>Middle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Middle</em>' containment reference.
	 * @see #getMiddle()
	 * @generated
	 */
	void setMiddle(Expression value);

	/**
	 * Returns the value of the '<em><b>Max</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max</em>' containment reference.
	 * @see #setMax(Expression)
	 * @see san.SANPackage#getTriangular_Max()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getMax();

	/**
	 * Sets the value of the '{@link san.Triangular#getMax <em>Max</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max</em>' containment reference.
	 * @see #getMax()
	 * @generated
	 */
	void setMax(Expression value);

} // Triangular
