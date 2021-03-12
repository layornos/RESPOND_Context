/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Correspondence</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.Correspondence#getActivitytocontextcorrespondence <em>Activitytocontextcorrespondence</em>}</li>
 *   <li>{@link rESPOND_Correspondence.Correspondence#getFailingactivitytohealingprocess <em>Failingactivitytohealingprocess</em>}</li>
 * </ul>
 *
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getCorrespondence()
 * @model
 * @generated
 */
public interface Correspondence extends EObject {
	/**
	 * Returns the value of the '<em><b>Activitytocontextcorrespondence</b></em>' containment reference list.
	 * The list contents are of type {@link rESPOND_Correspondence.ActivityToContextCorrespondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Activitytocontextcorrespondence</em>' containment reference list.
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getCorrespondence_Activitytocontextcorrespondence()
	 * @model containment="true"
	 * @generated
	 */
	EList<ActivityToContextCorrespondence> getActivitytocontextcorrespondence();

	/**
	 * Returns the value of the '<em><b>Failingactivitytohealingprocess</b></em>' containment reference list.
	 * The list contents are of type {@link rESPOND_Correspondence.FailingActivityToHealingProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failingactivitytohealingprocess</em>' containment reference list.
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getCorrespondence_Failingactivitytohealingprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<FailingActivityToHealingProcess> getFailingactivitytohealingprocess();

} // Correspondence
