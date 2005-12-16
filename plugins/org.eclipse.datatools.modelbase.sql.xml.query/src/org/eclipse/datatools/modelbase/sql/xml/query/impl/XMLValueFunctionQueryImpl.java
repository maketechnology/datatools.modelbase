/**
 * <copyright>
 * </copyright>
 *
 * $Id: XMLValueFunctionQueryImpl.java,v 1.5 2005/10/22 01:40:26 bpayton Exp $
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
import org.eclipse.datatools.modelbase.sql.xml.query.XMLEmptyHandlingType;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLPassingType;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLQueryArgumentList;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLQueryExpression;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLReturningType;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLValueFunctionQuery;
import org.eclipse.datatools.modelbase.sql.xml.query.XMLValueFunctionQueryReturning;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.datatools.modelbase.sql.datatypes.DataType;

import org.eclipse.datatools.modelbase.sql.routines.Function;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XML Value Function Query</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionQueryImpl#getEmptyHandlingOption <em>Empty Handling Option</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionQueryImpl#getXqueryExpr <em>Xquery Expr</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionQueryImpl#getXqueryArgList <em>Xquery Arg List</em>}</li>
 *   <li>{@link org.eclipse.datatools.modelbase.sql.xml.query.impl.XMLValueFunctionQueryImpl#getQueryReturning <em>Query Returning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XMLValueFunctionQueryImpl extends XMLValueFunctionImpl implements XMLValueFunctionQuery {
	/**
	 * The default value of the '{@link #getEmptyHandlingOption() <em>Empty Handling Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEmptyHandlingOption()
	 * @generated
	 * @ordered
	 */
    protected static final XMLEmptyHandlingType EMPTY_HANDLING_OPTION_EDEFAULT = XMLEmptyHandlingType.EMPTY_ON_EMPTY_LITERAL;

	/**
	 * The cached value of the '{@link #getEmptyHandlingOption() <em>Empty Handling Option</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEmptyHandlingOption()
	 * @generated
	 * @ordered
	 */
    protected XMLEmptyHandlingType emptyHandlingOption = EMPTY_HANDLING_OPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXqueryExpr() <em>Xquery Expr</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXqueryExpr()
	 * @generated
	 * @ordered
	 */
    protected XMLQueryExpression xqueryExpr = null;

	/**
	 * The cached value of the '{@link #getXqueryArgList() <em>Xquery Arg List</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getXqueryArgList()
	 * @generated
	 * @ordered
	 */
    protected XMLQueryArgumentList xqueryArgList = null;

	/**
	 * The cached value of the '{@link #getQueryReturning() <em>Query Returning</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getQueryReturning()
	 * @generated
	 * @ordered
	 */
    protected XMLValueFunctionQueryReturning queryReturning = null;

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected XMLValueFunctionQueryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected EClass eStaticClass() {
		return SQLXMLQueryPackage.eINSTANCE.getXMLValueFunctionQuery();
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLEmptyHandlingType getEmptyHandlingOption() {
		return emptyHandlingOption;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEmptyHandlingOption(XMLEmptyHandlingType newEmptyHandlingOption) {
		XMLEmptyHandlingType oldEmptyHandlingOption = emptyHandlingOption;
		emptyHandlingOption = newEmptyHandlingOption == null ? EMPTY_HANDLING_OPTION_EDEFAULT : newEmptyHandlingOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EMPTY_HANDLING_OPTION, oldEmptyHandlingOption, emptyHandlingOption));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLQueryExpression getXqueryExpr() {
		return xqueryExpr;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetXqueryExpr(XMLQueryExpression newXqueryExpr, NotificationChain msgs) {
		XMLQueryExpression oldXqueryExpr = xqueryExpr;
		xqueryExpr = newXqueryExpr;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR, oldXqueryExpr, newXqueryExpr);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setXqueryExpr(XMLQueryExpression newXqueryExpr) {
		if (newXqueryExpr != xqueryExpr) {
			NotificationChain msgs = null;
			if (xqueryExpr != null)
				msgs = ((InternalEObject)xqueryExpr).eInverseRemove(this, SQLXMLQueryPackage.XML_QUERY_EXPRESSION__VALUE_FUNCTION_QUERY, XMLQueryExpression.class, msgs);
			if (newXqueryExpr != null)
				msgs = ((InternalEObject)newXqueryExpr).eInverseAdd(this, SQLXMLQueryPackage.XML_QUERY_EXPRESSION__VALUE_FUNCTION_QUERY, XMLQueryExpression.class, msgs);
			msgs = basicSetXqueryExpr(newXqueryExpr, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR, newXqueryExpr, newXqueryExpr));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLQueryArgumentList getXqueryArgList() {
		return xqueryArgList;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetXqueryArgList(XMLQueryArgumentList newXqueryArgList, NotificationChain msgs) {
		XMLQueryArgumentList oldXqueryArgList = xqueryArgList;
		xqueryArgList = newXqueryArgList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST, oldXqueryArgList, newXqueryArgList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setXqueryArgList(XMLQueryArgumentList newXqueryArgList) {
		if (newXqueryArgList != xqueryArgList) {
			NotificationChain msgs = null;
			if (xqueryArgList != null)
				msgs = ((InternalEObject)xqueryArgList).eInverseRemove(this, SQLXMLQueryPackage.XML_QUERY_ARGUMENT_LIST__VALUE_FUNCTION_QUERY, XMLQueryArgumentList.class, msgs);
			if (newXqueryArgList != null)
				msgs = ((InternalEObject)newXqueryArgList).eInverseAdd(this, SQLXMLQueryPackage.XML_QUERY_ARGUMENT_LIST__VALUE_FUNCTION_QUERY, XMLQueryArgumentList.class, msgs);
			msgs = basicSetXqueryArgList(newXqueryArgList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST, newXqueryArgList, newXqueryArgList));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public XMLValueFunctionQueryReturning getQueryReturning() {
		return queryReturning;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetQueryReturning(XMLValueFunctionQueryReturning newQueryReturning, NotificationChain msgs) {
		XMLValueFunctionQueryReturning oldQueryReturning = queryReturning;
		queryReturning = newQueryReturning;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING, oldQueryReturning, newQueryReturning);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setQueryReturning(XMLValueFunctionQueryReturning newQueryReturning) {
		if (newQueryReturning != queryReturning) {
			NotificationChain msgs = null;
			if (queryReturning != null)
				msgs = ((InternalEObject)queryReturning).eInverseRemove(this, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY_RETURNING__VALUE_FUNCTION_QUERY, XMLValueFunctionQueryReturning.class, msgs);
			if (newQueryReturning != null)
				msgs = ((InternalEObject)newQueryReturning).eInverseAdd(this, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY_RETURNING__VALUE_FUNCTION_QUERY, XMLValueFunctionQueryReturning.class, msgs);
			msgs = basicSetQueryReturning(newQueryReturning, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING, newQueryReturning, newQueryReturning));
	}

	/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, Class baseClass, NotificationChain msgs) {
		if (featureID >= 0) {
			switch (eDerivedStructuralFeatureID(featureID, baseClass)) {
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
					if (eContainer != null)
						msgs = eBasicRemoveFromContainer(msgs);
					return eBasicSetContainer(otherEnd, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
					return ((InternalEList)getParameterList()).basicAdd(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
					if (xqueryExpr != null)
						msgs = ((InternalEObject)xqueryExpr).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR, null, msgs);
					return basicSetXqueryExpr((XMLQueryExpression)otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
					if (xqueryArgList != null)
						msgs = ((InternalEObject)xqueryArgList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST, null, msgs);
					return basicSetXqueryArgList((XMLQueryArgumentList)otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
					if (queryReturning != null)
						msgs = ((InternalEObject)queryReturning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING, null, msgs);
					return basicSetQueryReturning((XMLValueFunctionQueryReturning)otherEnd, msgs);
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
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
					return ((InternalEList)getEAnnotations()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DEPENDENCIES:
					return ((InternalEList)getDependencies()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DATA_TYPE:
					return basicSetDataType(null, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
					return eBasicSetContainer(null, SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
					return ((InternalEList)getParameterList()).basicRemove(otherEnd, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
					return basicSetXqueryExpr(null, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
					return basicSetXqueryArgList(null, msgs);
				case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
					return basicSetQueryReturning(null, msgs);
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
				return getEAnnotations();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NAME:
				return getName();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DEPENDENCIES:
				return getDependencies();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DESCRIPTION:
				return getDescription();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LABEL:
				return getLabel();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UNARY_OPERATOR:
				return getUnaryOperator();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DATA_TYPE:
				return getDataType();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
				return getValuesRow();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
				return getResultColumn();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
				return getBasicRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
				return getBasicLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
				return getLikePattern();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
				return getLikeMatching();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
				return getPredicateNull();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
				return getInValueListRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
				return getInValueListLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
				return getBetweenLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
				return getBetweenRight1();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
				return getBetweenRight2();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
				return getValueExprCast();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
				return getValueExprFunction();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
				return getGroupingExpr();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
				return getLikeEscape();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
				return getNest();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__SPECIAL_REGISTER:
				return isSpecialRegister() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DISTINCT:
				return isDistinct() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__COLUMN_FUNCTION:
				return isColumnFunction() ? Boolean.TRUE : Boolean.FALSE;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
				return getParameterList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EMPTY_HANDLING_OPTION:
				return getEmptyHandlingOption();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
				return getXqueryExpr();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
				return getXqueryArgList();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
				return getQueryReturning();
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
				getEAnnotations().clear();
				getEAnnotations().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NAME:
				setName((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DEPENDENCIES:
				getDependencies().clear();
				getDependencies().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LABEL:
				setLabel((String)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UNARY_OPERATOR:
				setUnaryOperator((ValueExpressionUnaryOperator)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DATA_TYPE:
				setDataType((DataType)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
				setValuesRow((ValuesRow)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
				setResultColumn((ResultColumn)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
				setBasicRight((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
				setBasicLeft((PredicateBasic)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
				setLikePattern((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
				setLikeMatching((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
				setNest((ValueExpressionNested)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__SPECIAL_REGISTER:
				setSpecialRegister(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DISTINCT:
				setDistinct(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__COLUMN_FUNCTION:
				setColumnFunction(((Boolean)newValue).booleanValue());
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
				getParameterList().clear();
				getParameterList().addAll((Collection)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EMPTY_HANDLING_OPTION:
				setEmptyHandlingOption((XMLEmptyHandlingType)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
				setXqueryExpr((XMLQueryExpression)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
				setXqueryArgList((XMLQueryArgumentList)newValue);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
				setQueryReturning((XMLValueFunctionQueryReturning)newValue);
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
				getEAnnotations().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DEPENDENCIES:
				getDependencies().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UNARY_OPERATOR:
				setUnaryOperator(UNARY_OPERATOR_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DATA_TYPE:
				setDataType((DataType)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
				setValuesRow((ValuesRow)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
				setOrderByValueExpr((OrderByValueExpression)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
				setResultColumn((ResultColumn)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
				setBasicRight((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
				setBasicLeft((PredicateBasic)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
				setLikePattern((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
				setLikeMatching((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
				setPredicateNull((PredicateIsNull)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
				setInValueListRight((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
				setInValueListLeft((PredicateInValueList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
				setInValueRowSelectLeft((PredicateInValueRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
				setInValueSelectLeft((PredicateInValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
				setQuantifiedRowSelectLeft((PredicateQuantifiedRowSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
				setQuantifiedValueSelectLeft((PredicateQuantifiedValueSelect)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
				setBetweenLeft((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
				setBetweenRight1((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
				setBetweenRight2((PredicateBetween)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
				setValueExprCast((ValueExpressionCast)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
				setValueExprFunction((ValueExpressionFunction)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
				setValueExprCombinedLeft((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
				setValueExprCombinedRight((ValueExpressionCombined)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
				setGroupingExpr((GroupingExpression)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
				setValueExprCaseElse((ValueExpressionCaseElse)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
				setValueExprCaseSimple((ValueExpressionCaseSimple)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				setValueExprCaseSimpleContentWhen((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				setValueExprCaseSimpleContentResult((ValueExpressionCaseSimpleContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
				setValueExprCaseSearchContent((ValueExpressionCaseSearchContent)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
				setLikeEscape((PredicateLike)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
				setValueExprLabeledDuration((ValueExpressionLabeledDuration)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
				setNest((ValueExpressionNested)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
				setUpdateSourceExprList((UpdateSourceExprList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__SPECIAL_REGISTER:
				setSpecialRegister(SPECIAL_REGISTER_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DISTINCT:
				setDistinct(DISTINCT_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__COLUMN_FUNCTION:
				setColumnFunction(COLUMN_FUNCTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
				getParameterList().clear();
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__FUNCTION:
				setFunction((Function)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EMPTY_HANDLING_OPTION:
				setEmptyHandlingOption(EMPTY_HANDLING_OPTION_EDEFAULT);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
				setXqueryExpr((XMLQueryExpression)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
				setXqueryArgList((XMLQueryArgumentList)null);
				return;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
				setQueryReturning((XMLValueFunctionQueryReturning)null);
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
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EANNOTATIONS:
				return eAnnotations != null && !eAnnotations.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DEPENDENCIES:
				return dependencies != null && !dependencies.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UNARY_OPERATOR:
				return unaryOperator != UNARY_OPERATOR_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DATA_TYPE:
				return dataType != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUES_ROW:
				return getValuesRow() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__ORDER_BY_VALUE_EXPR:
				return getOrderByValueExpr() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__RESULT_COLUMN:
				return getResultColumn() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_RIGHT:
				return getBasicRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BASIC_LEFT:
				return getBasicLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_PATTERN:
				return getLikePattern() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_MATCHING:
				return getLikeMatching() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PREDICATE_NULL:
				return getPredicateNull() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_RIGHT:
				return getInValueListRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_LIST_LEFT:
				return getInValueListLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_ROW_SELECT_LEFT:
				return getInValueRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__IN_VALUE_SELECT_LEFT:
				return getInValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_ROW_SELECT_LEFT:
				return getQuantifiedRowSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUANTIFIED_VALUE_SELECT_LEFT:
				return getQuantifiedValueSelectLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_LEFT:
				return getBetweenLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT1:
				return getBetweenRight1() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__BETWEEN_RIGHT2:
				return getBetweenRight2() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CAST:
				return getValueExprCast() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_FUNCTION:
				return getValueExprFunction() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_LEFT:
				return getValueExprCombinedLeft() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_COMBINED_RIGHT:
				return getValueExprCombinedRight() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__GROUPING_EXPR:
				return getGroupingExpr() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_ELSE:
				return getValueExprCaseElse() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE:
				return getValueExprCaseSimple() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_WHEN:
				return getValueExprCaseSimpleContentWhen() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SIMPLE_CONTENT_RESULT:
				return getValueExprCaseSimpleContentResult() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_CASE_SEARCH_CONTENT:
				return getValueExprCaseSearchContent() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__LIKE_ESCAPE:
				return getLikeEscape() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__VALUE_EXPR_LABELED_DURATION:
				return getValueExprLabeledDuration() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__NEST:
				return getNest() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__UPDATE_SOURCE_EXPR_LIST:
				return getUpdateSourceExprList() != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__SPECIAL_REGISTER:
				return specialRegister != SPECIAL_REGISTER_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__DISTINCT:
				return distinct != DISTINCT_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__COLUMN_FUNCTION:
				return columnFunction != COLUMN_FUNCTION_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__PARAMETER_LIST:
				return parameterList != null && !parameterList.isEmpty();
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__FUNCTION:
				return function != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__EMPTY_HANDLING_OPTION:
				return emptyHandlingOption != EMPTY_HANDLING_OPTION_EDEFAULT;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_EXPR:
				return xqueryExpr != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__XQUERY_ARG_LIST:
				return xqueryArgList != null;
			case SQLXMLQueryPackage.XML_VALUE_FUNCTION_QUERY__QUERY_RETURNING:
				return queryReturning != null;
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
		result.append(" (emptyHandlingOption: ");
		result.append(emptyHandlingOption);
		result.append(')');
		return result.toString();
	}

} //XMLValueFunctionQueryImpl
