/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.xSS;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.xss.xSS.State#getModifier <em>Modifier</em>}</li>
 *   <li>{@link tdt4250.xss.xSS.State#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see tdt4250.xss.xSS.XSSPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject
{
  /**
   * Returns the value of the '<em><b>Modifier</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifier</em>' containment reference.
   * @see #setModifier(Selector)
   * @see tdt4250.xss.xSS.XSSPackage#getState_Modifier()
   * @model containment="true"
   * @generated
   */
  Selector getModifier();

  /**
   * Sets the value of the '{@link tdt4250.xss.xSS.State#getModifier <em>Modifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Modifier</em>' containment reference.
   * @see #getModifier()
   * @generated
   */
  void setModifier(Selector value);

  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see tdt4250.xss.xSS.XSSPackage#getState_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link tdt4250.xss.xSS.State#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

} // State
