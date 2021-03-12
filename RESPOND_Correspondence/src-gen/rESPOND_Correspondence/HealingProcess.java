/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Healing Process</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.HealingProcess#getDrawback <em>Drawback</em>}</li>
 * </ul>
 *
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getHealingProcess()
 * @model
 * @generated
 */
public interface HealingProcess extends EObject {
	/**
	 * Returns the value of the '<em><b>Drawback</b></em>' containment reference list.
	 * The list contents are of type {@link rESPOND_Correspondence.Drawback}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawback</em>' containment reference list.
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getHealingProcess_Drawback()
	 * @model containment="true"
	 * @generated
	 */
	EList<Drawback> getDrawback();

} // HealingProcess
