/**
 */
package org.modelspartiti.infrastructure.tmdl.core;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assignment Simple</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentSimple()
 * @model
 * @generated
 */
public interface AssignmentSimple extends Assignment {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(ParameterSimple)
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentSimple_Parameter()
	 * @model required="true"
	 * @generated
	 */
	ParameterSimple getParameter();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterSimple value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(double)
	 * @see org.modelspartiti.infrastructure.tmdl.core.CorePackage#getAssignmentSimple_Value()
	 * @model required="true"
	 * @generated
	 */
	double getValue();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.core.AssignmentSimple#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(double value);

} // AssignmentSimple
