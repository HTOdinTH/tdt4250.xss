/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.xSS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see tdt4250.xss.xSS.XSSPackage
 * @generated
 */
public interface XSSFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  XSSFactory eINSTANCE = tdt4250.xss.xSS.impl.XSSFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Stylesheet</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Stylesheet</em>'.
   * @generated
   */
  Stylesheet createStylesheet();

  /**
   * Returns a new object of class '<em>XSelector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSelector</em>'.
   * @generated
   */
  XSelector createXSelector();

  /**
   * Returns a new object of class '<em>Group Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Selector</em>'.
   * @generated
   */
  GroupSelector createGroupSelector();

  /**
   * Returns a new object of class '<em>Selector</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Selector</em>'.
   * @generated
   */
  Selector createSelector();

  /**
   * Returns a new object of class '<em>XProperty</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XProperty</em>'.
   * @generated
   */
  XProperty createXProperty();

  /**
   * Returns a new object of class '<em>Custom Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Custom Property</em>'.
   * @generated
   */
  CustomProperty createCustomProperty();

  /**
   * Returns a new object of class '<em>Sub Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Rule</em>'.
   * @generated
   */
  SubRule createSubRule();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  Expression createExpression();

  /**
   * Returns a new object of class '<em>Group Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Group Property</em>'.
   * @generated
   */
  GroupProperty createGroupProperty();

  /**
   * Returns a new object of class '<em>XStatement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XStatement</em>'.
   * @generated
   */
  XStatement createXStatement();

  /**
   * Returns a new object of class '<em>XSingle Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XSingle Statement</em>'.
   * @generated
   */
  XSingleStatement createXSingleStatement();

  /**
   * Returns a new object of class '<em>Single Ref Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Ref Statement</em>'.
   * @generated
   */
  SingleRefStatement createSingleRefStatement();

  /**
   * Returns a new object of class '<em>Single Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Single Statement</em>'.
   * @generated
   */
  SingleStatement createSingleStatement();

  /**
   * Returns a new object of class '<em>XMulti Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>XMulti Statement</em>'.
   * @generated
   */
  XMultiStatement createXMultiStatement();

  /**
   * Returns a new object of class '<em>Multi Ref Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Ref Statement</em>'.
   * @generated
   */
  MultiRefStatement createMultiRefStatement();

  /**
   * Returns a new object of class '<em>Multi Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Multi Statement</em>'.
   * @generated
   */
  MultiStatement createMultiStatement();

  /**
   * Returns a new object of class '<em>State</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>State</em>'.
   * @generated
   */
  State createState();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  Rule createRule();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  XSSPackage getXSSPackage();

} //XSSFactory
