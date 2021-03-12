/**
 */
package rESPOND_Correspondence.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import rESPOND_Correspondence.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage
 * @generated
 */
public class RESPOND_CorrespondenceSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static RESPOND_CorrespondencePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RESPOND_CorrespondenceSwitch() {
		if (modelPackage == null) {
			modelPackage = RESPOND_CorrespondencePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case RESPOND_CorrespondencePackage.ACTIVITY_TO_CONTEXT_CORRESPONDENCE: {
			ActivityToContextCorrespondence activityToContextCorrespondence = (ActivityToContextCorrespondence) theEObject;
			T result = caseActivityToContextCorrespondence(activityToContextCorrespondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.TASK: {
			Task task = (Task) theEObject;
			T result = caseTask(task);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.CORRESPONDENCE: {
			Correspondence correspondence = (Correspondence) theEObject;
			T result = caseCorrespondence(correspondence);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.RESPOND_NODE: {
			RespondNode respondNode = (RespondNode) theEObject;
			T result = caseRespondNode(respondNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.FAILING_ACTIVITY_TO_HEALING_PROCESS: {
			FailingActivityToHealingProcess failingActivityToHealingProcess = (FailingActivityToHealingProcess) theEObject;
			T result = caseFailingActivityToHealingProcess(failingActivityToHealingProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.FAILING_TASK: {
			FailingTask failingTask = (FailingTask) theEObject;
			T result = caseFailingTask(failingTask);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.HEALING_PROCESS: {
			HealingProcess healingProcess = (HealingProcess) theEObject;
			T result = caseHealingProcess(healingProcess);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.DRAWBACK: {
			Drawback drawback = (Drawback) theEObject;
			T result = caseDrawback(drawback);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.PERFORMANCE: {
			Performance performance = (Performance) theEObject;
			T result = casePerformance(performance);
			if (result == null)
				result = caseDrawback(performance);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.RELIABILITY: {
			Reliability reliability = (Reliability) theEObject;
			T result = caseReliability(reliability);
			if (result == null)
				result = caseDrawback(reliability);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.SECURITY: {
			Security security = (Security) theEObject;
			T result = caseSecurity(security);
			if (result == null)
				result = caseDrawback(security);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case RESPOND_CorrespondencePackage.SELF_HEALING_SERVICE: {
			SelfHealingService selfHealingService = (SelfHealingService) theEObject;
			T result = caseSelfHealingService(selfHealingService);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Activity To Context Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Activity To Context Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActivityToContextCorrespondence(ActivityToContextCorrespondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTask(Task object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Correspondence</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Correspondence</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorrespondence(Correspondence object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Respond Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Respond Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRespondNode(RespondNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failing Activity To Healing Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failing Activity To Healing Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailingActivityToHealingProcess(FailingActivityToHealingProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Failing Task</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Failing Task</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFailingTask(FailingTask object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Healing Process</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Healing Process</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHealingProcess(HealingProcess object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Drawback</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDrawback(Drawback object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Performance</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePerformance(Performance object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reliability</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReliability(Reliability object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurity(Security object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Self Healing Service</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Self Healing Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSelfHealingService(SelfHealingService object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //RESPOND_CorrespondenceSwitch
