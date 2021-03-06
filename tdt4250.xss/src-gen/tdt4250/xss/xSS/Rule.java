/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.xSS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.xss.xSS.Rule#getSelectors <em>Selectors</em>}</li>
 *   <li>{@link tdt4250.xss.xSS.Rule#getGroupSelectors <em>Group Selectors</em>}</li>
 *   <li>{@link tdt4250.xss.xSS.Rule#getXStatements <em>XStatements</em>}</li>
 *   <li>{@link tdt4250.xss.xSS.Rule#getGroupStatements <em>Group Statements</em>}</li>
 * </ul>
 *
 * @see tdt4250.xss.xSS.XSSPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Selectors</b></em>' containment reference list.
   * The list contents are of type {@link tdt4250.xss.xSS.Selector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Selectors</em>' containment reference list.
   * @see tdt4250.xss.xSS.XSSPackage#getRule_Selectors()
   * @model containment="true"
   * @generated
   */
  EList<Selector> getSelectors();

  /**
   * Returns the value of the '<em><b>Group Selectors</b></em>' reference list.
   * The list contents are of type {@link tdt4250.xss.xSS.GroupSelector}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Selectors</em>' reference list.
   * @see tdt4250.xss.xSS.XSSPackage#getRule_GroupSelectors()
   * @model
   * @generated
   */
  EList<GroupSelector> getGroupSelectors();

  /**
   * Returns the value of the '<em><b>XStatements</b></em>' containment reference list.
   * The list contents are of type {@link tdt4250.xss.xSS.XStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>XStatements</em>' containment reference list.
   * @see tdt4250.xss.xSS.XSSPackage#getRule_XStatements()
   * @model containment="true"
   * @generated
   */
  EList<XStatement> getXStatements();

  /**
   * Returns the value of the '<em><b>Group Statements</b></em>' reference list.
   * The list contents are of type {@link tdt4250.xss.xSS.GroupProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Group Statements</em>' reference list.
   * @see tdt4250.xss.xSS.XSSPackage#getRule_GroupStatements()
   * @model
   * @generated
   */
  EList<GroupProperty> getGroupStatements();

} // Rule
