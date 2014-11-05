/**
 */
package com.temenos.ds.learnsirius.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Association#getName <em>Name</em>}</li>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Association#getRefClass <em>Ref Class</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends EObject {
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
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getAssociation_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Association#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Ref Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref Class</em>' reference.
	 * @see #setRefClass(com.temenos.ds.learnsirius.uml.Class)
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getAssociation_RefClass()
	 * @model
	 * @generated
	 */
	com.temenos.ds.learnsirius.uml.Class getRefClass();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Association#getRefClass <em>Ref Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref Class</em>' reference.
	 * @see #getRefClass()
	 * @generated
	 */
	void setRefClass(com.temenos.ds.learnsirius.uml.Class value);

} // Association
