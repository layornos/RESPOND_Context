/**
 */
package rESPOND_Correspondence.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rESPOND_Correspondence.ActivityToContextCorrespondence;
import rESPOND_Correspondence.RESPOND_CorrespondencePackage;
import rESPOND_Correspondence.RespondNode;
import rESPOND_Correspondence.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Activity To Context Correspondence</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl#getRespondnode <em>Respondnode</em>}</li>
 *   <li>{@link rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActivityToContextCorrespondenceImpl extends MinimalEObjectImpl.Container
		implements ActivityToContextCorrespondence {
	/**
	 * The cached value of the '{@link #getRespondnode() <em>Respondnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRespondnode()
	 * @generated
	 * @ordered
	 */
	protected RespondNode respondnode;

	/**
	 * The cached value of the '{@link #getActivity() <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActivity()
	 * @generated
	 * @ordered
	 */
	protected Task activity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActivityToContextCorrespondenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RESPOND_CorrespondencePackage.Literals.ACTIVITY_TO_CONTEXT_CORRESPONDENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondNode getRespondnode() {
		return respondnode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRespondnode(RespondNode newRespondnode, NotificationChain msgs) {
		RespondNode oldRespondnode = respondnode;
		respondnode = newRespondnode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE, oldRespondnode,
					newRespondnode);
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
	public void setRespondnode(RespondNode newRespondnode) {
		if (newRespondnode != respondnode) {
			NotificationChain msgs = null;
			if (respondnode != null)
				msgs = ((InternalEObject) respondnode).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE,
						null, msgs);
			if (newRespondnode != null)
				msgs = ((InternalEObject) newRespondnode).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE,
						null, msgs);
			msgs = basicSetRespondnode(newRespondnode, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE, newRespondnode,
					newRespondnode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task getActivity() {
		return activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActivity(Task newActivity, NotificationChain msgs) {
		Task oldActivity = activity;
		activity = newActivity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY, oldActivity,
					newActivity);
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
	public void setActivity(Task newActivity) {
		if (newActivity != activity) {
			NotificationChain msgs = null;
			if (activity != null)
				msgs = ((InternalEObject) activity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY,
						null, msgs);
			if (newActivity != null)
				msgs = ((InternalEObject) newActivity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE
								- RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY,
						null, msgs);
			msgs = basicSetActivity(newActivity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY, newActivity,
					newActivity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE:
			return basicSetRespondnode(null, msgs);
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY:
			return basicSetActivity(null, msgs);
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
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE:
			return getRespondnode();
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY:
			return getActivity();
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
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE:
			setRespondnode((RespondNode) newValue);
			return;
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY:
			setActivity((Task) newValue);
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
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE:
			setRespondnode((RespondNode) null);
			return;
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY:
			setActivity((Task) null);
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
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE:
			return respondnode != null;
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY:
			return activity != null;
		}
		return super.eIsSet(featureID);
	}

} //ActivityToContextCorrespondenceImpl
