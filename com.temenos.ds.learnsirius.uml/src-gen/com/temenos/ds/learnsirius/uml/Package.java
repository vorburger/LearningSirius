/**
 */
package com.temenos.ds.learnsirius.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Package#getClasses <em>Classes</em>}</li>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Package#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getPackage()
 * @model
 * @generated
 */
public interface Package extends EObject {
	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference.
	 * @see #setClasses(com.temenos.ds.learnsirius.uml.Class)
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getPackage_Classes()
	 * @model containment="true"
	 * @generated
	 */
	com.temenos.ds.learnsirius.uml.Class getClasses();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Package#getClasses <em>Classes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Classes</em>' containment reference.
	 * @see #getClasses()
	 * @generated
	 */
	void setClasses(com.temenos.ds.learnsirius.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getPackage_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Package#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Package
