/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage
 * @generated
 */
public interface RESPOND_CorrespondenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESPOND_CorrespondenceFactory eINSTANCE = rESPOND_Correspondence.impl.RESPOND_CorrespondenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Activity To Context Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Activity To Context Correspondence</em>'.
	 * @generated
	 */
	ActivityToContextCorrespondence createActivityToContextCorrespondence();

	/**
	 * Returns a new object of class '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Task</em>'.
	 * @generated
	 */
	Task createTask();

	/**
	 * Returns a new object of class '<em>Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Correspondence</em>'.
	 * @generated
	 */
	Correspondence createCorrespondence();

	/**
	 * Returns a new object of class '<em>Respond Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Respond Node</em>'.
	 * @generated
	 */
	RespondNode createRespondNode();

	/**
	 * Returns a new object of class '<em>Failing Activity To Healing Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failing Activity To Healing Process</em>'.
	 * @generated
	 */
	FailingActivityToHealingProcess createFailingActivityToHealingProcess();

	/**
	 * Returns a new object of class '<em>Failing Task</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Failing Task</em>'.
	 * @generated
	 */
	FailingTask createFailingTask();

	/**
	 * Returns a new object of class '<em>Healing Process</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Healing Process</em>'.
	 * @generated
	 */
	HealingProcess createHealingProcess();

	/**
	 * Returns a new object of class '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Performance</em>'.
	 * @generated
	 */
	Performance createPerformance();

	/**
	 * Returns a new object of class '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Reliability</em>'.
	 * @generated
	 */
	Reliability createReliability();

	/**
	 * Returns a new object of class '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security</em>'.
	 * @generated
	 */
	Security createSecurity();

	/**
	 * Returns a new object of class '<em>Self Healing Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Self Healing Service</em>'.
	 * @generated
	 */
	SelfHealingService createSelfHealingService();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	RESPOND_CorrespondencePackage getRESPOND_CorrespondencePackage();

} //RESPOND_CorrespondenceFactory
