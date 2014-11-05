/**
 */
package com.temenos.ds.learnsirius.uml.impl;

import com.temenos.ds.learnsirius.uml.Association;
import com.temenos.ds.learnsirius.uml.UmlPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.temenos.ds.learnsirius.uml.impl.AssociationImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.temenos.ds.learnsirius.uml.impl.AssociationImpl#getRefClass <em>Ref Class</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends MinimalEObjectImpl.Container implements Association {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRefClass() <em>Ref Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefClass()
	 * @generated
	 * @ordered
	 */
	protected com.temenos.ds.learnsirius.uml.Class refClass;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.temenos.ds.learnsirius.uml.Class getRefClass() {
		if (refClass != null && refClass.eIsProxy()) {
			InternalEObject oldRefClass = (InternalEObject)refClass;
			refClass = (com.temenos.ds.learnsirius.uml.Class)eResolveProxy(oldRefClass);
			if (refClass != oldRefClass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ASSOCIATION__REF_CLASS, oldRefClass, refClass));
			}
		}
		return refClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public com.temenos.ds.learnsirius.uml.Class basicGetRefClass() {
		return refClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefClass(com.temenos.ds.learnsirius.uml.Class newRefClass) {
		com.temenos.ds.learnsirius.uml.Class oldRefClass = refClass;
		refClass = newRefClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__REF_CLASS, oldRefClass, refClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.ASSOCIATION__NAME:
				return getName();
			case UmlPackage.ASSOCIATION__REF_CLASS:
				if (resolve) return getRefClass();
				return basicGetRefClass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case UmlPackage.ASSOCIATION__NAME:
				setName((String)newValue);
				return;
			case UmlPackage.ASSOCIATION__REF_CLASS:
				setRefClass((com.temenos.ds.learnsirius.uml.Class)newValue);
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
			case UmlPackage.ASSOCIATION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case UmlPackage.ASSOCIATION__REF_CLASS:
				setRefClass((com.temenos.ds.learnsirius.uml.Class)null);
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
			case UmlPackage.ASSOCIATION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case UmlPackage.ASSOCIATION__REF_CLASS:
				return refClass != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
