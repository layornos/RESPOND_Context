/**
 */
package rESPOND_Correspondence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Self Healing Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rESPOND_Correspondence.SelfHealingService#getCorrespondences <em>Correspondences</em>}</li>
 * </ul>
 *
 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getSelfHealingService()
 * @model
 * @generated
 */
public interface SelfHealingService extends EObject {
	/**
	 * Returns the value of the '<em><b>Correspondences</b></em>' containment reference list.
	 * The list contents are of type {@link rESPOND_Correspondence.Correspondence}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Correspondences</em>' containment reference list.
	 * @see rESPOND_Correspondence.RESPOND_CorrespondencePackage#getSelfHealingService_Correspondences()
	 * @model containment="true"
	 * @generated
	 */
	EList<Correspondence> getCorrespondences();

} // SelfHealingService
