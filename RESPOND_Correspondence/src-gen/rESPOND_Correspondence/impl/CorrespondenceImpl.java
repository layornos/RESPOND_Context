/**
 */
package rESPOND_Correspondence.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rESPOND_Correspondence.ActivityToContextCorrespondence;
import rESPOND_Correspondence.Correspondence;
import rESPOND_Correspondence.FailingActivityToHealingProcess;
import rESPOND_Correspondence.RESPOND_CorrespondencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.impl.CorrespondenceImpl#getActivitytocontextcorrespondence <em>Activitytocontextcorrespondence</em>}</li>
 *   <li>{@link rESPOND_Correspondence.impl.CorrespondenceImpl#getFailingactivitytohealingprocess <em>Failingactivitytohealingprocess</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CorrespondenceImpl extends MinimalEObjectImpl.Container implements Correspondence {
	/**
	 * The cached value of the '{@link #getActivitytocontextcorrespondence() <em>Activitytocontextcorrespondence</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivitytocontextcorrespondence()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityToContextCorrespondence> activitytocontextcorrespondence;

	/**
	 * The cached value of the '{@link #getFailingactivitytohealingprocess() <em>Failingactivitytohealingprocess</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFailingactivitytohealingprocess()
	 * @generated
	 * @ordered
	 */
	protected EList<FailingActivityToHealingProcess> failingactivitytohealingprocess;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESPOND_CorrespondencePackage.Literals.CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityToContextCorrespondence> getActivitytocontextcorrespondence() {
		if (activitytocontextcorrespondence == null) {
			activitytocontextcorrespondence = new EObjectContainmentEList<ActivityToContextCorrespondence>(
					ActivityToContextCorrespondence.class, this,
					RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE);
		}
		return activitytocontextcorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FailingActivityToHealingProcess> getFailingactivitytohealingprocess() {
		if (failingactivitytohealingprocess == null) {
			failingactivitytohealingprocess = new EObjectContainmentEList<FailingActivityToHealingProcess>(
					FailingActivityToHealingProcess.class, this,
					RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS);
		}
		return failingactivitytohealingprocess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE:
			return ((InternalEList<?>) getActivitytocontextcorrespondence()).basicRemove(otherEnd, msgs);
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS:
			return ((InternalEList<?>) getFailingactivitytohealingprocess()).basicRemove(otherEnd, msgs);
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
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE:
			return getActivitytocontextcorrespondence();
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS:
			return getFailingactivitytohealingprocess();
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
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE:
			getActivitytocontextcorrespondence().clear();
			getActivitytocontextcorrespondence()
					.addAll((Collection<? extends ActivityToContextCorrespondence>) newValue);
			return;
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS:
			getFailingactivitytohealingprocess().clear();
			getFailingactivitytohealingprocess()
					.addAll((Collection<? extends FailingActivityToHealingProcess>) newValue);
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
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE:
			getActivitytocontextcorrespondence().clear();
			return;
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS:
			getFailingactivitytohealingprocess().clear();
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
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE:
			return activitytocontextcorrespondence != null && !activitytocontextcorrespondence.isEmpty();
		case RESPOND_CorrespondencePackage.CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS:
			return failingactivitytohealingprocess != null && !failingactivitytohealingprocess.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CorrespondenceImpl
