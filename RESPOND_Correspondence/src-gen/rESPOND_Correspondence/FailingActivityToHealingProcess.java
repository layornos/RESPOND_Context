/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Failing Activity To Healing Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.FailingActivityToHealingProcess#getFailingactivity <em>Failingactivity</em>}</li>
 *   <li>{@link rESPOND_Correspondence.FailingActivityToHealingProcess#getHealingprocess <em>Healingprocess</em>}</li>
 * </ul>
 *
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getFailingActivityToHealingProcess()
 * @model
 * @generated
 */
public interface FailingActivityToHealingProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Failingactivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Failingactivity</em>' containment reference.
	 * @see #setFailingactivity(FailingTask)
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getFailingActivityToHealingProcess_Failingactivity()
	 * @model containment="true" required="true"
	 * @generated
	 */
	FailingTask getFailingactivity();

	/**
	 * Sets the value of the '{@link rESPOND_Correspondence.FailingActivityToHealingProcess#getFailingactivity <em>Failingactivity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Failingactivity</em>' containment reference.
	 * @see #getFailingactivity()
	 * @generated
	 */
	void setFailingactivity(FailingTask value);

	/**
	 * Returns the value of the '<em><b>Healingprocess</b></em>' containment reference list.
	 * The list contents are of type {@link rESPOND_Correspondence.HealingProcess}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Healingprocess</em>' containment reference list.
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getFailingActivityToHealingProcess_Healingprocess()
	 * @model containment="true"
	 * @generated
	 */
	EList<HealingProcess> getHealingprocess();

} // FailingActivityToHealingProcess
