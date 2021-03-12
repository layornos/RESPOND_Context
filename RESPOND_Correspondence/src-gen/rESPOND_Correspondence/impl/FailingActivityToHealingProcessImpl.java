/**
 */
package rESPOND_Correspondence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rESPOND_Correspondence.FailingActivityToHealingProcess;
import rESPOND_Correspondence.FailingTask;
import rESPOND_Correspondence.HealingProcess;
import rESPOND_Correspondence.RESPOND_CorrespondencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Failing Activity To Healing Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl#getFailingactivity <em>Failingactivity</em>}</li>
 *   <li>{@link rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl#getHealingprocess <em>Healingprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FailingActivityToHealingProcessImpl extends MinimalEObjectImpl.Container
		implements FailingActivityToHealingProcess {
	/**
	 * The cached value of the '{@link #getFailingactivity() <em>Failingactivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailingactivity()
	 * @generated
	 * @ordered
	 */
	protected FailingTask failingactivity;

	/**
	 * The cached value of the '{@link #getHealingprocess() <em>Healingprocess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealingprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<HealingProcess> healingprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FailingActivityToHealingProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESPOND_CorrespondencePackage.Literals.FAILING_ACTIVITY_TO_HEALING_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailingTask getFailingactivity() {
		return failingactivity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFailingactivity(FailingTask newFailingactivity, NotificationChain msgs) {
		FailingTask oldFailingactivity = failingactivity;
		failingactivity = newFailingactivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY,
					oldFailingactivity, newFailingactivity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFailingactivity(FailingTask newFailingactivity) {
		if (newFailingactivity != failingactivity) {
			NotificationChain msgs = null;
			if (failingactivity != null)
				msgs = ((InternalEObject) failingactivity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY,
						null, msgs);
			if (newFailingactivity != null)
				msgs = ((InternalEObject) newFailingactivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY,
						null, msgs);
			msgs = basicSetFailingactivity(newFailingactivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY,
					newFailingactivity, newFailingactivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HealingProcess> getHealingprocess() {
		if (healingprocess == null) {
			healingprocess = new EObjectContainmentEList<HealingProcess>(HealingProcess.class, this,
					RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS);
		}
		return healingprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY:
			return basicSetFailingactivity(null, msgs);
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS:
			return ((InternalEList<?>) getHealingprocess()).basicRemove(otherEnd, msgs);
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
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY:
			return getFailingactivity();
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS:
			return getHealingprocess();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY:
			setFailingactivity((FailingTask) newValue);
			return;
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS:
			getHealingprocess().clear();
			getHealingprocess().addAll((Collection<? extends HealingProcess>) newValue);
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
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY:
			setFailingactivity((FailingTask) null);
			return;
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS:
			getHealingprocess().clear();
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
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY:
			return failingactivity != null;
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS:
			return healingprocess != null && !healingprocess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FailingActivityToHealingProcessImpl
