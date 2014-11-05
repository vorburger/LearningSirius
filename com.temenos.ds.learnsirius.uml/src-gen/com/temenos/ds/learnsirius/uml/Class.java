/**
 */
package com.temenos.ds.learnsirius.uml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Class#getName <em>Name</em>}</li>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Class#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link com.temenos.ds.learnsirius.uml.Class#getAssociations <em>Associations</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends EObject {
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
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getClass_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Class#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference.
	 * @see #setAttributes(Attribute)
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getClass_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	Attribute getAttributes();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Class#getAttributes <em>Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes</em>' containment reference.
	 * @see #getAttributes()
	 * @generated
	 */
	void setAttributes(Attribute value);

	/**
	 * Returns the value of the '<em><b>Associations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associations</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associations</em>' containment reference.
	 * @see #setAssociations(Association)
	 * @see com.temenos.ds.learnsirius.uml.UmlPackage#getClass_Associations()
	 * @model containment="true"
	 * @generated
	 */
	Association getAssociations();

	/**
	 * Sets the value of the '{@link com.temenos.ds.learnsirius.uml.Class#getAssociations <em>Associations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associations</em>' containment reference.
	 * @see #getAssociations()
	 * @generated
	 */
	void setAssociations(Association value);

} // Class
