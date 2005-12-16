/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLSerializeFunctionEncodingImpl.java,v 1.1 2005/10/25 21:27:09 bpayton Exp $
 */
package org.eclipse.datatools.modelbase.sql.xml.query.impl;



import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.query.impl.SQLQueryObjectImpl;
import org.eclipse.datatools.modelbase.sql.xml.query.SQLXMLQueryPackage;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLSerializeFunctionEncoding;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Serialize Function Encoding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLSerializeFunctionEncodingImpl#getEncodingName <em>Encoding Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLSerializeFunctionEncodingImpl extends SQLQueryObjectImpl implements XMLSerializeFunctionEncoding {
	/**
	 * The default value of the '{@link #getEncodingName() <em>Encoding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEncodingName()
	 * @generated
	 * @ordered
	 */
    protected static final String ENCODING_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncodingName() <em>Encoding Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEncodingName()
	 * @generated
	 * @ordered
	 */
    protected String encodingName = ENCODING_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected XMLSerializeFunctionEncodingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return SQLXMLQueryPackage.eINSTANCE.getXMLSerializeFunctionEncoding();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getEncodingName() {
		return encodingName;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEncodingName(String newEncodingName) {
		String oldEncodingName = encodingName;
		encodingName = newEncodingName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__ENCODING_NAME, oldEncodingName, encodingName));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__EANNOTATIONS:
				return getEAnnotations();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__NAME:
				return getName();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DEPENDENCIES:
				return getDependencies();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DESCRIPTION:
				return getDescription();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__LABEL:
				return getLabel();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__ENCODING_NAME:
				return getEncodingName();
		}
		return eDynamicGet(eFeature, resolve);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eSet(EStructuralFeature eFeature, Object newValue) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__NAME:
				setName((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__LABEL:
				setLabel((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__ENCODING_NAME:
				setEncodingName((String)newValue);
				return;
		}
		eDynamicSet(eFeature, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void eUnset(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__ENCODING_NAME:
				setEncodingName(ENCODING_NAME_EDEFAULT);
				return;
		}
		eDynamicUnset(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean eIsSet(EStructuralFeature eFeature) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLXMLQueryPackage.XML_SERIALIZE_FUNCTION_ENCODING__ENCODING_NAME:
				return ENCODING_NAME_EDEFAULT == null ? encodingName != null : !ENCODING_NAME_EDEFAULT.equals(encodingName);
		}
		return eDynamicIsSet(eFeature);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (encodingName: ");
		result.append(encodingName);
		result.append(')');
		return result.toString();
	}

} //XMLSerializeFunctionEncodingImpl
