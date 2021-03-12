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

import rESPOND_Correspondence.Drawback;
import rESPOND_Correspondence.HealingProcess;
import rESPOND_Correspondence.RESPOND_CorrespondencePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Healing Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.impl.HealingProcessImpl#getDrawback <em>Drawback</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HealingProcessImpl extends MinimalEObjectImpl.Container implements HealingProcess {
	/**
	 * The cached value of the '{@link #getDrawback() <em>Drawback</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDrawback()
	 * @generated
	 * @ordered
	 */
	protected EList<Drawback> drawback;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HealingProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESPOND_CorrespondencePackage.Literals.HEALING_PROCESS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Drawback> getDrawback() {
		if (drawback == null) {
			drawback = new EObjectContainmentEList<Drawback>(Drawback.class, this,
					RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK);
		}
		return drawback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK:
			return ((InternalEList<?>) getDrawback()).basicRemove(otherEnd, msgs);
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
		case RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK:
			return getDrawback();
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
		case RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK:
			getDrawback().clear();
			getDrawback().addAll((Collection<? extends Drawback>) newValue);
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
		case RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK:
			getDrawback().clear();
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
		case RESPOND_CorrespondencePackage.HEALING_PROCESS__DRAWBACK:
			return drawback != null && !drawback.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //HealingProcessImpl
