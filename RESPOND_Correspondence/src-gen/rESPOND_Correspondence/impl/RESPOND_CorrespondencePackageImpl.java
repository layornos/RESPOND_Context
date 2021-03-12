/**
 */
package rESPOND_Correspondence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rESPOND_Correspondence.ActivityToContextCorrespondence;
import rESPOND_Correspondence.Correspondence;
import rESPOND_Correspondence.Drawback;
import rESPOND_Correspondence.FailingActivityToHealingProcess;
import rESPOND_Correspondence.FailingTask;
import rESPOND_Correspondence.HealingProcess;
import rESPOND_Correspondence.Performance;
import rESPOND_Correspondence.RESPOND_CorrespondenceFactory;
import rESPOND_Correspondence.RESPOND_CorrespondencePackage;
import rESPOND_Correspondence.Reliability;
import rESPOND_Correspondence.RespondNode;
import rESPOND_Correspondence.Security;
import rESPOND_Correspondence.SelfHealingService;
import rESPOND_Correspondence.Task;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESPOND_CorrespondencePackageImpl extends EPackageImpl implements RESPOND_CorrespondencePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass activityToContextCorrespondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correspondenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass respondNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failingActivityToHealingProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass failingTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass healingProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass drawbackEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass selfHealingServiceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private RESPOND_CorrespondencePackageImpl() {
		super(eNS_URI, RESPOND_CorrespondenceFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link RESPOND_CorrespondencePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static RESPOND_CorrespondencePackage init() {
		if (isInited)
			return (RESPOND_CorrespondencePackage) EPackage.Registry.INSTANCE
					.getEPackage(RESPOND_CorrespondencePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredRESPOND_CorrespondencePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		RESPOND_CorrespondencePackageImpl theRESPOND_CorrespondencePackage = registeredRESPOND_CorrespondencePackage instanceof RESPOND_CorrespondencePackageImpl
				? (RESPOND_CorrespondencePackageImpl) registeredRESPOND_CorrespondencePackage
				: new RESPOND_CorrespondencePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theRESPOND_CorrespondencePackage.createPackageContents();

		// Initialize created meta-data
		theRESPOND_CorrespondencePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theRESPOND_CorrespondencePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(RESPOND_CorrespondencePackage.eNS_URI, theRESPOND_CorrespondencePackage);
		return theRESPOND_CorrespondencePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActivityToContextCorrespondence() {
		return activityToContextCorrespondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityToContextCorrespondence_Respondnode() {
		return (EReference) activityToContextCorrespondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActivityToContextCorrespondence_Activity() {
		return (EReference) activityToContextCorrespondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrespondence() {
		return correspondenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondence_Activitytocontextcorrespondence() {
		return (EReference) correspondenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrespondence_Failingactivitytohealingprocess() {
		return (EReference) correspondenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRespondNode() {
		return respondNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailingActivityToHealingProcess() {
		return failingActivityToHealingProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailingActivityToHealingProcess_Failingactivity() {
		return (EReference) failingActivityToHealingProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFailingActivityToHealingProcess_Healingprocess() {
		return (EReference) failingActivityToHealingProcessEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFailingTask() {
		return failingTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHealingProcess() {
		return healingProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHealingProcess_Drawback() {
		return (EReference) healingProcessEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDrawback() {
		return drawbackEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformance() {
		return performanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliability() {
		return reliabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurity() {
		return securityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSelfHealingService() {
		return selfHealingServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSelfHealingService_Correspondences() {
		return (EReference) selfHealingServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESPOND_CorrespondenceFactory getRESPOND_CorrespondenceFactory() {
		return (RESPOND_CorrespondenceFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		activityToContextCorrespondenceEClass = createEClass(ACTIVITY_TO_CONTEXT_CORRESPONDENCE);
		createEReference(activityToContextCorrespondenceEClass, ACTIVITY_TO_CONTEXT_CORRESPONDENCE__RESPONDNODE);
		createEReference(activityToContextCorrespondenceEClass, ACTIVITY_TO_CONTEXT_CORRESPONDENCE__ACTIVITY);

		taskEClass = createEClass(TASK);

		correspondenceEClass = createEClass(CORRESPONDENCE);
		createEReference(correspondenceEClass, CORRESPONDENCE__ACTIVITYTOCONTEXTCORRESPONDENCE);
		createEReference(correspondenceEClass, CORRESPONDENCE__FAILINGACTIVITYTOHEALINGPROCESS);

		respondNodeEClass = createEClass(RESPOND_NODE);

		failingActivityToHealingProcessEClass = createEClass(FAILING_ACTIVITY_TO_HEALING_PROCESS);
		createEReference(failingActivityToHealingProcessEClass, FAILING_ACTIVITY_TO_HEALING_PROCESS__FAILINGACTIVITY);
		createEReference(failingActivityToHealingProcessEClass, FAILING_ACTIVITY_TO_HEALING_PROCESS__HEALINGPROCESS);

		failingTaskEClass = createEClass(FAILING_TASK);

		healingProcessEClass = createEClass(HEALING_PROCESS);
		createEReference(healingProcessEClass, HEALING_PROCESS__DRAWBACK);

		drawbackEClass = createEClass(DRAWBACK);

		performanceEClass = createEClass(PERFORMANCE);

		reliabilityEClass = createEClass(RELIABILITY);

		securityEClass = createEClass(SECURITY);

		selfHealingServiceEClass = createEClass(SELF_HEALING_SERVICE);
		createEReference(selfHealingServiceEClass, SELF_HEALING_SERVICE__CORRESPONDENCES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		performanceEClass.getESuperTypes().add(this.getDrawback());
		reliabilityEClass.getESuperTypes().add(this.getDrawback());
		securityEClass.getESuperTypes().add(this.getDrawback());

		// Initialize classes, features, and operations; add parameters
		initEClass(activityToContextCorrespondenceEClass, ActivityToContextCorrespondence.class,
				"ActivityToContextCorrespondence", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActivityToContextCorrespondence_Respondnode(), this.getRespondNode(), null, "respondnode",
				null, 0, 1, ActivityToContextCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActivityToContextCorrespondence_Activity(), this.getTask(), null, "activity", null, 1, 1,
				ActivityToContextCorrespondence.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(taskEClass, Task.class, "Task", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(correspondenceEClass, Correspondence.class, "Correspondence", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCorrespondence_Activitytocontextcorrespondence(), this.getActivityToContextCorrespondence(),
				null, "activitytocontextcorrespondence", null, 0, -1, Correspondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCorrespondence_Failingactivitytohealingprocess(), this.getFailingActivityToHealingProcess(),
				null, "failingactivitytohealingprocess", null, 0, -1, Correspondence.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(respondNodeEClass, RespondNode.class, "RespondNode", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(failingActivityToHealingProcessEClass, FailingActivityToHealingProcess.class,
				"FailingActivityToHealingProcess", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFailingActivityToHealingProcess_Failingactivity(), this.getFailingTask(), null,
				"failingactivity", null, 1, 1, FailingActivityToHealingProcess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFailingActivityToHealingProcess_Healingprocess(), this.getHealingProcess(), null,
				"healingprocess", null, 0, -1, FailingActivityToHealingProcess.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(failingTaskEClass, FailingTask.class, "FailingTask", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(healingProcessEClass, HealingProcess.class, "HealingProcess", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHealingProcess_Drawback(), this.getDrawback(), null, "drawback", null, 0, -1,
				HealingProcess.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(drawbackEClass, Drawback.class, "Drawback", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(performanceEClass, Performance.class, "Performance", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(reliabilityEClass, Reliability.class, "Reliability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(securityEClass, Security.class, "Security", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(selfHealingServiceEClass, SelfHealingService.class, "SelfHealingService", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSelfHealingService_Correspondences(), this.getCorrespondence(), null, "correspondences", null,
				0, -1, SelfHealingService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE,
				!IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //RESPOND_CorrespondencePackageImpl
