/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rESPOND_Correspondence.RESPOND_CorrespondenceFactory
 * @model kind="package"
 * @generated
 */
public interface RESPOND_CorrespondencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rESPOND_Correspondence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.respont-iot.de/rESPOND_Correspondence";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rESPOND_Correspondence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RESPOND_CorrespondencePackage eINSTANCE = rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl.init();

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl <em>Activity To Context Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getActivityToContextCorrespondence()
	 * @generated
	 */
	int ACTIVITY_TO_CONTEXT_CORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Respondnode</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE = 0;

	/**
	 * The feature id for the '<em><b>Activity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY = 1;

	/**
	 * The number of structural features of the '<em>Activity To Context Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_CONTEXT_CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Activity To Context Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTIVITY_TO_CONTEXT_CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.TaskImpl <em>Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.TaskImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getTask()
	 * @generated
	 */
	int TASK = 1;

	/**
	 * The number of structural features of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.CorrespondenceImpl <em>Correspondence</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.CorrespondenceImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getCorrespondence()
	 * @generated
	 */
	int CORRESPONDENCE = 2;

	/**
	 * The feature id for the '<em><b>Activitytocontextcorrespondence</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE = 0;

	/**
	 * The feature id for the '<em><b>Failingactivitytohealingprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS = 1;

	/**
	 * The number of structural features of the '<em>Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Correspondence</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORRESPONDENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.RespondNodeImpl <em>Respond Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.RespondNodeImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getRespondNode()
	 * @generated
	 */
	int RESPOND_NODE = 3;

	/**
	 * The number of structural features of the '<em>Respond Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOND_NODE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Respond Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPOND_NODE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl <em>Failing Activity To Healing Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getFailingActivityToHealingProcess()
	 * @generated
	 */
	int FAILING_ACTIVITY_TO_HEALING_PROCESS = 4;

	/**
	 * The feature id for the '<em><b>Failingactivity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY = 0;

	/**
	 * The feature id for the '<em><b>Healingprocess</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS = 1;

	/**
	 * The number of structural features of the '<em>Failing Activity To Healing Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_ACTIVITY_TO_HEALING_PROCESS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Failing Activity To Healing Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_ACTIVITY_TO_HEALING_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.FailingTaskImpl <em>Failing Task</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.FailingTaskImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getFailingTask()
	 * @generated
	 */
	int FAILING_TASK = 5;

	/**
	 * The number of structural features of the '<em>Failing Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_TASK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Failing Task</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FAILING_TASK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.HealingProcessImpl <em>Healing Process</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.HealingProcessImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getHealingProcess()
	 * @generated
	 */
	int HEALING_PROCESS = 6;

	/**
	 * The feature id for the '<em><b>Drawback</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALING_PROCESS__DRAWBACK = 0;

	/**
	 * The number of structural features of the '<em>Healing Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALING_PROCESS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Healing Process</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEALING_PROCESS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.Drawback <em>Drawback</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.Drawback
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getDrawback()
	 * @generated
	 */
	int DRAWBACK = 7;

	/**
	 * The number of structural features of the '<em>Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Drawback</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DRAWBACK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.PerformanceImpl <em>Performance</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.PerformanceImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getPerformance()
	 * @generated
	 */
	int PERFORMANCE = 8;

	/**
	 * The number of structural features of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Performance</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERFORMANCE_OPERATION_COUNT = DRAWBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.ReliabilityImpl <em>Reliability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.ReliabilityImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getReliability()
	 * @generated
	 */
	int RELIABILITY = 9;

	/**
	 * The number of structural features of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Reliability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELIABILITY_OPERATION_COUNT = DRAWBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.SecurityImpl <em>Security</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.SecurityImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getSecurity()
	 * @generated
	 */
	int SECURITY = 10;

	/**
	 * The number of structural features of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_FEATURE_COUNT = DRAWBACK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Security</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECURITY_OPERATION_COUNT = DRAWBACK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link rESPOND_Correspondence.impl.SelfHealingServiceImpl <em>Self Healing Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rESPOND_Correspondence.impl.SelfHealingServiceImpl
	 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getSelfHealingService()
	 * @generated
	 */
	int SELF_HEALING_SERVICE = 11;

	/**
	 * The feature id for the '<em><b>Correspondences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_HEALING_SERVICE__CORRESPONDENCES = 0;

	/**
	 * The number of structural features of the '<em>Self Healing Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_HEALING_SERVICE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Self Healing Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SELF_HEALING_SERVICE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.ActivityToContextCorrespondence <em>Activity To Context Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Activity To Context Correspondence</em>'.
	 * @see rESPOND_Correspondence.ActivityToContextCorrespondence
	 * @generated
	 */
	EClass getActivityToContextCorrespondence();

	/**
	 * Returns the meta object for the containment reference '{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getRespondnode <em>Respondnode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Respondnode</em>'.
	 * @see rESPOND_Correspondence.ActivityToContextCorrespondence#getRespondnode()
	 * @see #getActivityToContextCorrespondence()
	 * @generated
	 */
	EReference getActivityToContextCorrespondence_Respondnode();

	/**
	 * Returns the meta object for the containment reference '{@link rESPOND_Correspondence.ActivityToContextCorrespondence#getActivity <em>Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Activity</em>'.
	 * @see rESPOND_Correspondence.ActivityToContextCorrespondence#getActivity()
	 * @see #getActivityToContextCorrespondence()
	 * @generated
	 */
	EReference getActivityToContextCorrespondence_Activity();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Task</em>'.
	 * @see rESPOND_Correspondence.Task
	 * @generated
	 */
	EClass getTask();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Correspondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Correspondence</em>'.
	 * @see rESPOND_Correspondence.Correspondence
	 * @generated
	 */
	EClass getCorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link rESPOND_Correspondence.Correspondence#getActivitytocontextcorrespondence <em>Activitytocontextcorrespondence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Activitytocontextcorrespondence</em>'.
	 * @see rESPOND_Correspondence.Correspondence#getActivitytocontextcorrespondence()
	 * @see #getCorrespondence()
	 * @generated
	 */
	EReference getCorrespondence_Activitytocontextcorrespondence();

	/**
	 * Returns the meta object for the containment reference list '{@link rESPOND_Correspondence.Correspondence#getFailingactivitytohealingprocess <em>Failingactivitytohealingprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Failingactivitytohealingprocess</em>'.
	 * @see rESPOND_Correspondence.Correspondence#getFailingactivitytohealingprocess()
	 * @see #getCorrespondence()
	 * @generated
	 */
	EReference getCorrespondence_Failingactivitytohealingprocess();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.RespondNode <em>Respond Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Respond Node</em>'.
	 * @see rESPOND_Correspondence.RespondNode
	 * @generated
	 */
	EClass getRespondNode();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.FailingActivityToHealingProcess <em>Failing Activity To Healing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failing Activity To Healing Process</em>'.
	 * @see rESPOND_Correspondence.FailingActivityToHealingProcess
	 * @generated
	 */
	EClass getFailingActivityToHealingProcess();

	/**
	 * Returns the meta object for the containment reference '{@link rESPOND_Correspondence.FailingActivityToHealingProcess#getFailingactivity <em>Failingactivity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Failingactivity</em>'.
	 * @see rESPOND_Correspondence.FailingActivityToHealingProcess#getFailingactivity()
	 * @see #getFailingActivityToHealingProcess()
	 * @generated
	 */
	EReference getFailingActivityToHealingProcess_Failingactivity();

	/**
	 * Returns the meta object for the containment reference list '{@link rESPOND_Correspondence.FailingActivityToHealingProcess#getHealingprocess <em>Healingprocess</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Healingprocess</em>'.
	 * @see rESPOND_Correspondence.FailingActivityToHealingProcess#getHealingprocess()
	 * @see #getFailingActivityToHealingProcess()
	 * @generated
	 */
	EReference getFailingActivityToHealingProcess_Healingprocess();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.FailingTask <em>Failing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Failing Task</em>'.
	 * @see rESPOND_Correspondence.FailingTask
	 * @generated
	 */
	EClass getFailingTask();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.HealingProcess <em>Healing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Healing Process</em>'.
	 * @see rESPOND_Correspondence.HealingProcess
	 * @generated
	 */
	EClass getHealingProcess();

	/**
	 * Returns the meta object for the containment reference list '{@link rESPOND_Correspondence.HealingProcess#getDrawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Drawback</em>'.
	 * @see rESPOND_Correspondence.HealingProcess#getDrawback()
	 * @see #getHealingProcess()
	 * @generated
	 */
	EReference getHealingProcess_Drawback();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Drawback</em>'.
	 * @see rESPOND_Correspondence.Drawback
	 * @generated
	 */
	EClass getDrawback();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Performance</em>'.
	 * @see rESPOND_Correspondence.Performance
	 * @generated
	 */
	EClass getPerformance();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reliability</em>'.
	 * @see rESPOND_Correspondence.Reliability
	 * @generated
	 */
	EClass getReliability();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Security</em>'.
	 * @see rESPOND_Correspondence.Security
	 * @generated
	 */
	EClass getSecurity();

	/**
	 * Returns the meta object for class '{@link rESPOND_Correspondence.SelfHealingService <em>Self Healing Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Self Healing Service</em>'.
	 * @see rESPOND_Correspondence.SelfHealingService
	 * @generated
	 */
	EClass getSelfHealingService();

	/**
	 * Returns the meta object for the containment reference list '{@link rESPOND_Correspondence.SelfHealingService#getCorrespondences <em>Correspondences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Correspondences</em>'.
	 * @see rESPOND_Correspondence.SelfHealingService#getCorrespondences()
	 * @see #getSelfHealingService()
	 * @generated
	 */
	EReference getSelfHealingService_Correspondences();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RESPOND_CorrespondenceFactory getRESPOND_CorrespondenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl <em>Activity To Context Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.ActivityToContextCorrespondenceImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getActivityToContextCorrespondence()
		 * @generated
		 */
		EClass ACTIVITY_TO_CONTEXT_CORRESPONDENCE = eINSTANCE.getActivityToContextCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Respondnode</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE = eINSTANCE
				.getActivityToContextCorrespondence_Respondnode();

		/**
		 * The meta object literal for the '<em><b>Activity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY = eINSTANCE
				.getActivityToContextCorrespondence_Activity();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.TaskImpl <em>Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.TaskImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getTask()
		 * @generated
		 */
		EClass TASK = eINSTANCE.getTask();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.CorrespondenceImpl <em>Correspondence</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.CorrespondenceImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getCorrespondence()
		 * @generated
		 */
		EClass CORRESPONDENCE = eINSTANCE.getCorrespondence();

		/**
		 * The meta object literal for the '<em><b>Activitytocontextcorrespondence</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE = eINSTANCE
				.getCorrespondence_Activitytocontextcorrespondence();

		/**
		 * The meta object literal for the '<em><b>Failingactivitytohealingprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS = eINSTANCE
				.getCorrespondence_Failingactivitytohealingprocess();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.RespondNodeImpl <em>Respond Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.RespondNodeImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getRespondNode()
		 * @generated
		 */
		EClass RESPOND_NODE = eINSTANCE.getRespondNode();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl <em>Failing Activity To Healing Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.FailingActivityToHealingProcessImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getFailingActivityToHealingProcess()
		 * @generated
		 */
		EClass FAILING_ACTIVITY_TO_HEALING_PROCESS = eINSTANCE.getFailingActivityToHealingProcess();

		/**
		 * The meta object literal for the '<em><b>Failingactivity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY = eINSTANCE
				.getFailingActivityToHealingProcess_Failingactivity();

		/**
		 * The meta object literal for the '<em><b>Healingprocess</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS = eINSTANCE
				.getFailingActivityToHealingProcess_Healingprocess();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.FailingTaskImpl <em>Failing Task</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.FailingTaskImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getFailingTask()
		 * @generated
		 */
		EClass FAILING_TASK = eINSTANCE.getFailingTask();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.HealingProcessImpl <em>Healing Process</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.HealingProcessImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getHealingProcess()
		 * @generated
		 */
		EClass HEALING_PROCESS = eINSTANCE.getHealingProcess();

		/**
		 * The meta object literal for the '<em><b>Drawback</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEALING_PROCESS__DRAWBACK = eINSTANCE.getHealingProcess_Drawback();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.Drawback <em>Drawback</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.Drawback
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getDrawback()
		 * @generated
		 */
		EClass DRAWBACK = eINSTANCE.getDrawback();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.PerformanceImpl <em>Performance</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.PerformanceImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getPerformance()
		 * @generated
		 */
		EClass PERFORMANCE = eINSTANCE.getPerformance();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.ReliabilityImpl <em>Reliability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.ReliabilityImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getReliability()
		 * @generated
		 */
		EClass RELIABILITY = eINSTANCE.getReliability();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.SecurityImpl <em>Security</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.SecurityImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getSecurity()
		 * @generated
		 */
		EClass SECURITY = eINSTANCE.getSecurity();

		/**
		 * The meta object literal for the '{@link rESPOND_Correspondence.impl.SelfHealingServiceImpl <em>Self Healing Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rESPOND_Correspondence.impl.SelfHealingServiceImpl
		 * @see rESPOND_Correspondence.impl.RESPOND_CorrespondencePackageImpl#getSelfHealingService()
		 * @generated
		 */
		EClass SELF_HEALING_SERVICE = eINSTANCE.getSelfHealingService();

		/**
		 * The meta object literal for the '<em><b>Correspondences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SELF_HEALING_SERVICE__CORRESPONDENCES = eINSTANCE.getSelfHealingService_Correspondences();

	}

} //RESPOND_CorrespondencePackage
