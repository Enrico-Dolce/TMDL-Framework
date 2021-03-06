/**
 */
package org.modelspartiti.formalisms.san.san;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.san.InputArc#getSource <em>Source</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.san.InputArc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.san.SANPackage#getInputArc()
 * @model
 * @generated
 */
public interface InputArc extends Arc {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getInputArc_Source()
	 * @model required="true"
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.InputArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Place value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Activity)
	 * @see org.modelspartiti.formalisms.san.san.SANPackage#getInputArc_Target()
	 * @model required="true"
	 * @generated
	 */
	Activity getTarget();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.san.InputArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Activity value);

} // InputArc
