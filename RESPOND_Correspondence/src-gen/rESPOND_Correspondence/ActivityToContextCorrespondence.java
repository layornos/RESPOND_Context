/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity To Context Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getRespondnode <em>Respondnode</em>}</li>
 *   <li>{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getActivity <em>Activity</em>}</li>
 * </ul>
 *
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getActivityToContextCorrespondence()
 * @model
 * @generated
 */
public interface ActivityToContextCorrespondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Respondnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Respondnode</em>' containment reference.
	 * @see #setRespondnode(RespondNode)
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getActivityToContextCorrespondence_Respondnode()
	 * @model containment="true"
	 * @generated
	 */
	RespondNode getRespondnode();

	/**
	 * Sets the value of the '{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getRespondnode <em>Respondnode</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Respondnode</em>' containment reference.
	 * @see #getRespondnode()
	 * @generated
	 */
	void setRespondnode(RespondNode value);

	/**
	 * Returns the value of the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activity</em>' containment reference.
	 * @see #setActivity(Task)
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getActivityToContextCorrespondence_Activity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Task getActivity();

	/**
	 * Sets the value of the '{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getActivity <em>Activity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Activity</em>' containment reference.
	 * @see #getActivity()
	 * @generated
	 */
	void setActivity(Task value);

} // ActivityToContextCorrespondence
