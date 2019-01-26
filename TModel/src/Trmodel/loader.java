/**
 */
package Trmodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>loader</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Trmodel.loader#getOperation <em>Operation</em>}</li>
 *   <li>{@link Trmodel.loader#getLoadmodel <em>Loadmodel</em>}</li>
 * </ul>
 *
 * @see Trmodel.TrmodelPackage#getloader()
 * @model
 * @generated
 */
public interface loader extends EObject {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link Trmodel.Operation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see Trmodel.TrmodelPackage#getloader_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Loadmodel</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Loadmodel</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loadmodel</em>' containment reference.
	 * @see #setLoadmodel(LoadModel)
	 * @see Trmodel.TrmodelPackage#getloader_Loadmodel()
	 * @model containment="true" required="true"
	 * @generated
	 */
	LoadModel getLoadmodel();

	/**
	 * Sets the value of the '{@link Trmodel.loader#getLoadmodel <em>Loadmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loadmodel</em>' containment reference.
	 * @see #getLoadmodel()
	 * @generated
	 */
	void setLoadmodel(LoadModel value);

} // loader
