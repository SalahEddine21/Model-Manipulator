/**
 */
package Trmodel.impl;

import Trmodel.LoadModel;
import Trmodel.Operation;
import Trmodel.TrmodelPackage;
import Trmodel.loader;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>loader</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link Trmodel.impl.loaderImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link Trmodel.impl.loaderImpl#getLoadmodel <em>Loadmodel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class loaderImpl extends MinimalEObjectImpl.Container implements loader {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getLoadmodel() <em>Loadmodel</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadmodel()
	 * @generated
	 * @ordered
	 */
	protected LoadModel loadmodel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected loaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TrmodelPackage.Literals.LOADER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this, TrmodelPackage.LOADER__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadModel getLoadmodel() {
		return loadmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadmodel(LoadModel newLoadmodel, NotificationChain msgs) {
		LoadModel oldLoadmodel = loadmodel;
		loadmodel = newLoadmodel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TrmodelPackage.LOADER__LOADMODEL, oldLoadmodel, newLoadmodel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadmodel(LoadModel newLoadmodel) {
		if (newLoadmodel != loadmodel) {
			NotificationChain msgs = null;
			if (loadmodel != null)
				msgs = ((InternalEObject)loadmodel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TrmodelPackage.LOADER__LOADMODEL, null, msgs);
			if (newLoadmodel != null)
				msgs = ((InternalEObject)newLoadmodel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TrmodelPackage.LOADER__LOADMODEL, null, msgs);
			msgs = basicSetLoadmodel(newLoadmodel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TrmodelPackage.LOADER__LOADMODEL, newLoadmodel, newLoadmodel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TrmodelPackage.LOADER__OPERATION:
				return ((InternalEList<?>)getOperation()).basicRemove(otherEnd, msgs);
			case TrmodelPackage.LOADER__LOADMODEL:
				return basicSetLoadmodel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TrmodelPackage.LOADER__OPERATION:
				return getOperation();
			case TrmodelPackage.LOADER__LOADMODEL:
				return getLoadmodel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TrmodelPackage.LOADER__OPERATION:
				getOperation().clear();
				getOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case TrmodelPackage.LOADER__LOADMODEL:
				setLoadmodel((LoadModel)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TrmodelPackage.LOADER__OPERATION:
				getOperation().clear();
				return;
			case TrmodelPackage.LOADER__LOADMODEL:
				setLoadmodel((LoadModel)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TrmodelPackage.LOADER__OPERATION:
				return operation != null && !operation.isEmpty();
			case TrmodelPackage.LOADER__LOADMODEL:
				return loadmodel != null;
		}
		return super.eIsSet(featureID);
	}

} //loaderImpl
