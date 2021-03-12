/**
 */
package rESPOND_Correspondence.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rESPOND_Correspondence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage
 * @generated
 */
public class RESPOND_CorrespondenceAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESPOND_CorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESPOND_CorrespondenceAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = RESPOND_CorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RESPOND_CorrespondenceSwitch<Adapter> modelSwitch = new RESPOND_CorrespondenceSwitch<Adapter>() {
		@Override
		public Adapter caseActivityToContextCorrespondence(ActivityToContextCorrespondence object) {
			return createActivityToContextCorrespondenceAdapter();
		}

		@Override
		public Adapter caseTask(Task object) {
			return createTaskAdapter();
		}

		@Override
		public Adapter caseCorrespondence(Correspondence object) {
			return createCorrespondenceAdapter();
		}

		@Override
		public Adapter caseRespondNode(RespondNode object) {
			return createRespondNodeAdapter();
		}

		@Override
		public Adapter caseFailingActivityToHealingProcess(FailingActivityToHealingProcess object) {
			return createFailingActivityToHealingProcessAdapter();
		}

		@Override
		public Adapter caseFailingTask(FailingTask object) {
			return createFailingTaskAdapter();
		}

		@Override
		public Adapter caseHealingProcess(HealingProcess object) {
			return createHealingProcessAdapter();
		}

		@Override
		public Adapter caseDrawback(Drawback object) {
			return createDrawbackAdapter();
		}

		@Override
		public Adapter casePerformance(Performance object) {
			return createPerformanceAdapter();
		}

		@Override
		public Adapter caseReliability(Reliability object) {
			return createReliabilityAdapter();
		}

		@Override
		public Adapter caseSecurity(Security object) {
			return createSecurityAdapter();
		}

		@Override
		public Adapter caseSelfHealingService(SelfHealingService object) {
			return createSelfHealingServiceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.ActivityToContextCorrespondence <em>Activity To Context Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.ActivityToContextCorrespondence
	 * @generated
	 */
	public Adapter createActivityToContextCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Task <em>Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Task
	 * @generated
	 */
	public Adapter createTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Correspondence <em>Correspondence</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Correspondence
	 * @generated
	 */
	public Adapter createCorrespondenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.RespondNode <em>Respond Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.RespondNode
	 * @generated
	 */
	public Adapter createRespondNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.FailingActivityToHealingProcess <em>Failing Activity To Healing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.FailingActivityToHealingProcess
	 * @generated
	 */
	public Adapter createFailingActivityToHealingProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.FailingTask <em>Failing Task</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.FailingTask
	 * @generated
	 */
	public Adapter createFailingTaskAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.HealingProcess <em>Healing Process</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.HealingProcess
	 * @generated
	 */
	public Adapter createHealingProcessAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Drawback <em>Drawback</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Drawback
	 * @generated
	 */
	public Adapter createDrawbackAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Performance <em>Performance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Performance
	 * @generated
	 */
	public Adapter createPerformanceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Reliability <em>Reliability</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Reliability
	 * @generated
	 */
	public Adapter createReliabilityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.Security <em>Security</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.Security
	 * @generated
	 */
	public Adapter createSecurityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rESPOND_Correspondence.SelfHealingService <em>Self Healing Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rESPOND_Correspondence.SelfHealingService
	 * @generated
	 */
	public Adapter createSelfHealingServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //RESPOND_CorrespondenceAdapterFactory
