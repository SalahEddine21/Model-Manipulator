/**
 */
package Trmodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Update</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link Trmodel.Update#getNewName <em>New Name</em>}</li>
 * </ul>
 *
 * @see Trmodel.TrmodelPackage#getUpdate()
 * @model
 * @generated
 */
public interface Update extends Operation {
	/**
	 * Returns the value of the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Name</em>' attribute.
	 * @see #setNewName(String)
	 * @see Trmodel.TrmodelPackage#getUpdate_NewName()
	 * @model required="true"
	 * @generated
	 */
	String getNewName();

	/**
	 * Sets the value of the '{@link Trmodel.Update#getNewName <em>New Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Name</em>' attribute.
	 * @see #getNewName()
	 * @generated
	 */
	void setNewName(String value);

} // Update
