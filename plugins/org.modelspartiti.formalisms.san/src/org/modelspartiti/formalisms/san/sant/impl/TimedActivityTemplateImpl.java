/**
 */
package org.modelspartiti.formalisms.san.sant.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.modelspartiti.formalisms.san.san.Distribution;
import org.modelspartiti.formalisms.san.san.Expression;

import org.modelspartiti.formalisms.san.sant.SANTPackage;
import org.modelspartiti.formalisms.san.sant.TimedActivityTemplate;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timed Activity Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.impl.TimedActivityTemplateImpl#getTimeDistribution <em>Time Distribution</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.impl.TimedActivityTemplateImpl#getActivation <em>Activation</em>}</li>
 *   <li>{@link org.modelspartiti.formalisms.san.sant.impl.TimedActivityTemplateImpl#getReactivation <em>Reactivation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TimedActivityTemplateImpl extends ActivityTemplateImpl implements TimedActivityTemplate {
	/**
	 * The cached value of the '{@link #getTimeDistribution() <em>Time Distribution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDistribution()
	 * @generated
	 * @ordered
	 */
	protected Distribution timeDistribution;

	/**
	 * The cached value of the '{@link #getActivation() <em>Activation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivation()
	 * @generated
	 * @ordered
	 */
	protected Expression activation;

	/**
	 * The cached value of the '{@link #getReactivation() <em>Reactivation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReactivation()
	 * @generated
	 * @ordered
	 */
	protected Expression reactivation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimedActivityTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SANTPackage.Literals.TIMED_ACTIVITY_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Distribution getTimeDistribution() {
		return timeDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeDistribution(Distribution newTimeDistribution, NotificationChain msgs) {
		Distribution oldTimeDistribution = timeDistribution;
		timeDistribution = newTimeDistribution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION, oldTimeDistribution, newTimeDistribution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeDistribution(Distribution newTimeDistribution) {
		if (newTimeDistribution != timeDistribution) {
			NotificationChain msgs = null;
			if (timeDistribution != null)
				msgs = ((InternalEObject)timeDistribution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION, null, msgs);
			if (newTimeDistribution != null)
				msgs = ((InternalEObject)newTimeDistribution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION, null, msgs);
			msgs = basicSetTimeDistribution(newTimeDistribution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION, newTimeDistribution, newTimeDistribution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getActivation() {
		return activation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivation(Expression newActivation, NotificationChain msgs) {
		Expression oldActivation = activation;
		activation = newActivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION, oldActivation, newActivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setActivation(Expression newActivation) {
		if (newActivation != activation) {
			NotificationChain msgs = null;
			if (activation != null)
				msgs = ((InternalEObject)activation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION, null, msgs);
			if (newActivation != null)
				msgs = ((InternalEObject)newActivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION, null, msgs);
			msgs = basicSetActivation(newActivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION, newActivation, newActivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getReactivation() {
		return reactivation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReactivation(Expression newReactivation, NotificationChain msgs) {
		Expression oldReactivation = reactivation;
		reactivation = newReactivation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION, oldReactivation, newReactivation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReactivation(Expression newReactivation) {
		if (newReactivation != reactivation) {
			NotificationChain msgs = null;
			if (reactivation != null)
				msgs = ((InternalEObject)reactivation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION, null, msgs);
			if (newReactivation != null)
				msgs = ((InternalEObject)newReactivation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION, null, msgs);
			msgs = basicSetReactivation(newReactivation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION, newReactivation, newReactivation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION:
				return basicSetTimeDistribution(null, msgs);
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION:
				return basicSetActivation(null, msgs);
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION:
				return basicSetReactivation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION:
				return getTimeDistribution();
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION:
				return getActivation();
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION:
				return getReactivation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION:
				setTimeDistribution((Distribution)newValue);
				return;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION:
				setActivation((Expression)newValue);
				return;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION:
				setReactivation((Expression)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION:
				setTimeDistribution((Distribution)null);
				return;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION:
				setActivation((Expression)null);
				return;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION:
				setReactivation((Expression)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__TIME_DISTRIBUTION:
				return timeDistribution != null;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__ACTIVATION:
				return activation != null;
			case SANTPackage.TIMED_ACTIVITY_TEMPLATE__REACTIVATION:
				return reactivation != null;
		}
		return super.eIsSet(featureID);
	}

} //TimedActivityTemplateImpl
