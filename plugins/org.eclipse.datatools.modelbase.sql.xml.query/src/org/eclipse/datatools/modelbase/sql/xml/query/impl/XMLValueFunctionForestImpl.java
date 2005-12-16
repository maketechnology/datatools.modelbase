/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLValueFunctionForestImpl.java,v 1.4 2005/10/22 01:40:26 bpayton Exp $
 */
package org.eclipse.datatools.modelbase.sql.xml.query.impl;



import java.util.Collection;

import org.eclipse.datatools.modelbase.sql.query.GroupingExpression;
import org.eclipse.datatools.modelbase.sql.query.OrderByValueExpression;
import org.eclipse.datatools.modelbase.sql.query.PredicateBasic;
import org.eclipse.datatools.modelbase.sql.query.PredicateBetween;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueList;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueRowSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateInValueSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateIsNull;
import org.eclipse.datatools.modelbase.sql.query.PredicateLike;
import org.eclipse.datatools.modelbase.sql.query.PredicateQuantifiedRowSelect;
import org.eclipse.datatools.modelbase.sql.query.PredicateQuantifiedValueSelect;
import org.eclipse.datatools.modelbase.sql.query.ResultColumn;
import org.eclipse.datatools.modelbase.sql.query.SQLQueryPackage;
import org.eclipse.datatools.modelbase.sql.query.UpdateSourceExprList;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseElse;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSearchContent;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSimple;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCaseSimpleContent;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCast;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionCombined;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionFunction;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionLabeledDuration;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionNested;
import org.eclipse.datatools.modelbase.sql.query.ValueExpressionUnaryOperator;
import org.eclipse.datatools.modelbase.sql.query.ValuesRow;
import org.eclipse.datatools.modelbase.sql.xml.query.SQLXMLQueryPackage;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLNamespacesDeclaration;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLNullHandlingType;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLReturningType;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLValueFunctionForest;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLValueFunctionForestContentItem;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.datatools.modelbase.sql.datatypes.DataType;

import org.eclipse.datatools.modelbase.sql.routines.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Value Function Forest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionForestImpl#getNullHandlingOption <em>Null Handling Option</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionForestImpl#getReturningOption <em>Returning Option</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionForestImpl#getForestContentList <em>Forest Content List</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionForestImpl#getNamespacesDecl <em>Namespaces Decl</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLValueFunctionForestImpl extends XMLValueFunctionImpl implements XMLValueFunctionForest {
	/**
	 * The default value of the '{@link #getNullHandlingOption() <em>Null Handling Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNullHandlingOption()
	 * @generated
	 * @ordered
	 */
    protected static final XMLNullHandlingType NULL_HANDLING_OPTION_EDEFAULT = XMLNullHandlingType.ABSENT_ON_NULL_LITERAL;

	/**
	 * The cached value of the '{@link #getNullHandlingOption() <em>Null Handling Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNullHandlingOption()
	 * @generated
	 * @ordered
	 */
    protected XMLNullHandlingType nullHandlingOption = NULL_HANDLING_OPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getReturningOption() <em>Returning Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReturningOption()
	 * @generated
	 * @ordered
	 */
    protected static final XMLReturningType RETURNING_OPTION_EDEFAULT = XMLReturningType.RETURNING_CONTENT_LITERAL;

	/**
	 * The cached value of the '{@link #getReturningOption() <em>Returning Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getReturningOption()
	 * @generated
	 * @ordered
	 */
    protected XMLReturningType returningOption = RETURNING_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getForestContentList() <em>Forest Content List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getForestContentList()
	 * @generated
	 * @ordered
	 */
    protected EList forestContentList = null;

	/**
	 * The cached value of the '{@link #getNamespacesDecl() <em>Namespaces Decl</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getNamespacesDecl()
	 * @generated
	 * @ordered
	 */
    protected XMLNamespacesDeclaration namespacesDecl = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected XMLValueFunctionForestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return SQLXMLQueryPackage.eINSTANCE.getXMLValueFunctionForest();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLNullHandlingType getNullHandlingOption() {
		return nullHandlingOption;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNullHandlingOption(XMLNullHandlingType newNullHandlingOption) {
		XMLNullHandlingType oldNullHandlingOption = nullHandlingOption;
		nullHandlingOption = newNullHandlingOption == null ? NULL_HANDLING_OPTION_EDEFAULT : newNullHandlingOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NULL_HANDLING_OPTION, oldNullHandlingOption, nullHandlingOption));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLReturningType getReturningOption() {
		return returningOption;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setReturningOption(XMLReturningType newReturningOption) {
		XMLReturningType oldReturningOption = returningOption;
		returningOption = newReturningOption == null ? RETURNING_OPTION_EDEFAULT : newReturningOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RETURNING_OPTION, oldReturningOption, returningOption));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList getForestContentList() {
		if (forestContentList == null) {
			forestContentList = new EObjectContainmentWithInverseEList(XMLValueFunctionForestContentItem.class, this, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST_CONTENT_ITEM__VALUE_FUNCTION_FOREST);
		}
		return forestContentList;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLNamespacesDeclaration getNamespacesDecl() {
		return namespacesDecl;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetNamespacesDecl(XMLNamespacesDeclaration newNamespacesDecl, NotificationChain msgs) {
		XMLNamespacesDeclaration oldNamespacesDecl = namespacesDecl;
		namespacesDecl = newNamespacesDecl;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL, oldNamespacesDecl, newNamespacesDecl);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setNamespacesDecl(XMLNamespacesDeclaration newNamespacesDecl) {
		if (newNamespacesDecl != namespacesDecl) {
			NotificationChain msgs = null;
			if (namespacesDecl != null)
				msgs = ((InternalEObject)namespacesDecl).eInverseRemove(this, SQLXMLQueryPackage.XML_NAMESPACES_DECLARATION__VALUE_FUNCTION_FOREST, XMLNamespacesDeclaration.class, msgs);
			if (newNamespacesDecl != null)
				msgs = ((InternalEObject)newNamespacesDecl).eInverseAdd(this, SQLXMLQueryPackage.XML_NAMESPACES_DECLARATION__VALUE_FUNCTION_FOREST, XMLNamespacesDeclaration.class, msgs);
			msgs = basicSetNamespacesDecl(newNamespacesDecl, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL, newNamespacesDecl, newNamespacesDecl));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
					return ((InternalEList)getParameterList()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
					return ((InternalEList)getForestContentList()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
					if (namespacesDecl != null)
						msgs = ((InternalEObject)namespacesDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL, null, msgs);
					return basicSetNamespacesDecl((XMLNamespacesDeclaration)otherEnd, msgs);
				default:
					return eDynamicInverseAdd(otherEnd, featureID, baseClass, msgs);
			}
		}
		if (eContainer != null)
			msgs = eBasicRemoveFromContainer(msgs);
		return eBasicSetContainer(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DATA_TYPE:
					return basicSetDataType(null, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
					return ((InternalEList)getParameterList()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
					return ((InternalEList)getForestContentList()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
					return basicSetNamespacesDecl(null, msgs);
				default:
					return eDynamicInverseRemove(otherEnd, featureID, baseClass, msgs);
			}
		}
		return eBasicSetContainer(null, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Object eGet(EStructuralFeature eFeature, boolean resolve) {
		switch (eDerivedStructuralFeatureID(eFeature)) {
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
				return getEAnnotations();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAME:
				return getName();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DEPENDENCIES:
				return getDependencies();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DESCRIPTION:
				return getDescription();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LABEL:
				return getLabel();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UNARY_OPERATOR:
				return getUnaryOperator();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DATA_TYPE:
				return getDataType();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
				return getValuesRow();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
				return getResultColumn();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
				return getBasicRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
				return getBasicLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
				return getLikePattern();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
				return getLikeMatching();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
				return getPredicateNull();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
				return getInValueListRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
				return getInValueListLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
				return getBetweenLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
				return getBetweenRight1();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
				return getBetweenRight2();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
				return getValueExprCast();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
				return getValueExprFunction();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
				return getGroupingExpr();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
				return getLikeEscape();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
				return getNest();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__SPECIAL_REGISTER:
				return isSpecialRegister() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DISTINCT:
				return isDistinct() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__COLUMN_FUNCTION:
				return isColumnFunction() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
				return getParameterList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NULL_HANDLING_OPTION:
				return getNullHandlingOption();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RETURNING_OPTION:
				return getReturningOption();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
				return getForestContentList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
				return getNamespacesDecl();
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAME:
				setName((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LABEL:
				setLabel((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UNARY_OPERATOR:
				setUnaryOperator((ValueExpressionUnaryOperator)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
				setValuesRow((ValuesRow)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
				setResultColumn((ResultColumn)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
				setBasicRight((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
				setBasicLeft((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
				setLikePattern((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
				setLikeMatching((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
				setNest((ValueExpressionNested)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__SPECIAL_REGISTER:
				setSpecialRegister(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DISTINCT:
				setDistinct(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__COLUMN_FUNCTION:
				setColumnFunction(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
				getParameterList().clear();
				getParameterList().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NULL_HANDLING_OPTION:
				setNullHandlingOption((XMLNullHandlingType)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RETURNING_OPTION:
				setReturningOption((XMLReturningType)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
				getForestContentList().clear();
				getForestContentList().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
				setNamespacesDecl((XMLNamespacesDeclaration)newValue);
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
				setValuesRow((ValuesRow)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
				setResultColumn((ResultColumn)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
				setBasicRight((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
				setBasicLeft((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
				setLikePattern((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
				setLikeMatching((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
				setNest((ValueExpressionNested)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__SPECIAL_REGISTER:
				setSpecialRegister(SPECIAL_REGISTER_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__COLUMN_FUNCTION:
				setColumnFunction(COLUMN_FUNCTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
				getParameterList().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FUNCTION:
				setFunction((Function)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NULL_HANDLING_OPTION:
				setNullHandlingOption(NULL_HANDLING_OPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RETURNING_OPTION:
				setReturningOption(RETURNING_OPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
				getForestContentList().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
				setNamespacesDecl((XMLNamespacesDeclaration)null);
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DATA_TYPE:
				return dataType != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUES_ROW:
				return getValuesRow() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RESULT_COLUMN:
				return getResultColumn() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_RIGHT:
				return getBasicRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BASIC_LEFT:
				return getBasicLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_PATTERN:
				return getLikePattern() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_MATCHING:
				return getLikeMatching() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PREDICATE_NULL:
				return getPredicateNull() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_RIGHT:
				return getInValueListRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_LIST_LEFT:
				return getInValueListLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_LEFT:
				return getBetweenLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT1:
				return getBetweenRight1() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__BETWEEN_RIGHT2:
				return getBetweenRight2() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CAST:
				return getValueExprCast() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_FUNCTION:
				return getValueExprFunction() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__GROUPING_EXPR:
				return getGroupingExpr() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__LIKE_ESCAPE:
				return getLikeEscape() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NEST:
				return getNest() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__SPECIAL_REGISTER:
				return specialRegister != SPECIAL_REGISTER_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__COLUMN_FUNCTION:
				return columnFunction != COLUMN_FUNCTION_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__PARAMETER_LIST:
				return parameterList != null && !parameterList.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FUNCTION:
				return function != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NULL_HANDLING_OPTION:
				return nullHandlingOption != NULL_HANDLING_OPTION_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__RETURNING_OPTION:
				return returningOption != RETURNING_OPTION_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__FOREST_CONTENT_LIST:
				return forestContentList != null && !forestContentList.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_FOREST__NAMESPACES_DECL:
				return namespacesDecl != null;
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
		result.append(" (nullHandlingOption: ");
		result.append(nullHandlingOption);
		result.append(", returningOption: ");
		result.append(returningOption);
		result.append(')');
		return result.toString();
	}

} //XMLValueFunctionForestImpl
