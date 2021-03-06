/**
 */
package org.modelspartiti.infrastructure.tmdl.scenario;

import org.eclipse.emf.common.util.EList;

import org.modelspartiti.infrastructure.tmdl.library.TemplateAtomic;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variant Atomic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.VariantAtomic#getTemplate <em>Template</em>}</li>
 *   <li>{@link org.modelspartiti.infrastructure.tmdl.scenario.VariantAtomic#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getVariantAtomic()
 * @model
 * @generated
 */
public interface VariantAtomic extends Variant {
	/**
	 * Returns the value of the '<em><b>Template</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Template</em>' reference.
	 * @see #setTemplate(TemplateAtomic)
	 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getVariantAtomic_Template()
	 * @model required="true"
	 * @generated
	 */
	TemplateAtomic getTemplate();

	/**
	 * Sets the value of the '{@link org.modelspartiti.infrastructure.tmdl.scenario.VariantAtomic#getTemplate <em>Template</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Template</em>' reference.
	 * @see #getTemplate()
	 * @generated
	 */
	void setTemplate(TemplateAtomic value);

	/**
	 * Returns the value of the '<em><b>Labels</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' attribute list.
	 * @see org.modelspartiti.infrastructure.tmdl.scenario.ScenarioPackage#getVariantAtomic_Labels()
	 * @model
	 * @generated
	 */
	EList<String> getLabels();

} // VariantAtomic
