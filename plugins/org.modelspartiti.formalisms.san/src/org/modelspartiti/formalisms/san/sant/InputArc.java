/**
 */
package org.modelspartiti.formalisms.san.sant;

import org.modelspartiti.formalisms.san.san.Place;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.InputArc#getSource <em>Source</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.InputArc#getTarget <em>Target</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.InputArc#getTemplateSource <em>Template Source</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputArc()
 * @model
 * @generated
 */
public interface InputArc extends ArcTemplate {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Place)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputArc_Source()
	 * @model
	 * @generated
	 */
	Place getSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.InputArc#getSource <em>Source</em>}' reference.
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
	 * @see #setTarget(ActivityTemplate)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputArc_Target()
	 * @model
	 * @generated
	 */
	ActivityTemplate getTarget();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.InputArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ActivityTemplate value);

	/**
	 * Returns the value of the '<em><b>Template Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template Source</em>' reference.
	 * @see #setTemplateSource(PlaceTemplate)
	 * @see org.modelspartiti.formalisms.san.sant.SANTPackage#getInputArc_TemplateSource()
	 * @model
	 * @generated
	 */
	PlaceTemplate getTemplateSource();

	/**
	 * Sets the value of the '{@link org.modelspartiti.formalisms.san.sant.InputArc#getTemplateSource <em>Template Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template Source</em>' reference.
	 * @see #getTemplateSource()
	 * @generated
	 */
	void setTemplateSource(PlaceTemplate value);

} // InputArc
