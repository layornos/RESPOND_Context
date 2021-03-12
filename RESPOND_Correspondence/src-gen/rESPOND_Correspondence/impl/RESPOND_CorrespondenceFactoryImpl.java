/**
 */
package rESPOND_Correspondence.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import rESPOND_Correspondence.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class RESPOND_CorrespondenceFactoryImpl extends EFactoryImpl implements RESPOND_CorrespondenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RESPOND_CorrespondenceFactory init() {
		try {
			RESPOND_CorrespondenceFactory theRESPOND_CorrespondenceFactory = (RESPOND_CorrespondenceFactory) EPackage.Registry.INSTANCE
					.getEFactory(RESPOND_CorrespondencePackage.eNS_URI);
			if (theRESPOND_CorrespondenceFactory != null) {
				return theRESPOND_CorrespondenceFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new RESPOND_CorrespondenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESPOND_CorrespondenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE:
			return createActivityToContextCorrespondence();
		case RESPOND_CorrespondencePackage.TASK:
			return createTask();
		case RESPOND_CorrespondencePackage.CORRESPONDENCE:
			return createCorrespondence();
		case RESPOND_CorrespondencePackage.RESPOND_NODE:
			return createRespondNode();
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS:
			return createFailingActivityToHealingProcess();
		case RESPOND_CorrespondencePackage.FAILING_TASK:
			return createFailingTask();
		case RESPOND_CorrespondencePackage.HEALING_PROCESS:
			return createHealingProcess();
		case RESPOND_CorrespondencePackage.PERFORMANCE:
			return createPerformance();
		case RESPOND_CorrespondencePackage.RELIABILITY:
			return createReliability();
		case RESPOND_CorrespondencePackage.SECURITY:
			return createSecurity();
		case RESPOND_CorrespondencePackage.SELF_HEALING_SERVICE:
			return createSelfHealingService();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityToContextCorrespondence createActivityToContextCorrespondence() {
		ActivityToContextCorrespondenceImpl activityToContextCorrespondence = new ActivityToContextCorrespondenceImpl();
		return activityToContextCorrespondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Task createTask() {
		TaskImpl task = new TaskImpl();
		return task;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Correspondence createCorrespondence() {
		CorrespondenceImpl correspondence = new CorrespondenceImpl();
		return correspondence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RespondNode createRespondNode() {
		RespondNodeImpl respondNode = new RespondNodeImpl();
		return respondNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailingActivityToHealingProcess createFailingActivityToHealingProcess() {
		FailingActivityToHealingProcessImpl failingActivityToHealingProcess = new FailingActivityToHealingProcessImpl();
		return failingActivityToHealingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FailingTask createFailingTask() {
		FailingTaskImpl failingTask = new FailingTaskImpl();
		return failingTask;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HealingProcess createHealingProcess() {
		HealingProcessImpl healingProcess = new HealingProcessImpl();
		return healingProcess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Performance createPerformance() {
		PerformanceImpl performance = new PerformanceImpl();
		return performance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Reliability createReliability() {
		ReliabilityImpl reliability = new ReliabilityImpl();
		return reliability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Security createSecurity() {
		SecurityImpl security = new SecurityImpl();
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SelfHealingService createSelfHealingService() {
		SelfHealingServiceImpl selfHealingService = new SelfHealingServiceImpl();
		return selfHealingService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESPOND_CorrespondencePackage getRESPOND_CorrespondencePackage() {
		return (RESPOND_CorrespondencePackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static RESPOND_CorrespondencePackage getPackage() {
		return RESPOND_CorrespondencePackage.eINSTANCE;
	}

} //RESPOND_CorrespondenceFactoryImpl
