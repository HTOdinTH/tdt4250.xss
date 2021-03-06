/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.xSS;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XMulti Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.xss.xSS.XMultiStatement#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see tdt4250.xss.xSS.XSSPackage#getXMultiStatement()
 * @model
 * @generated
 */
public interface XMultiStatement extends XStatement
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link tdt4250.xss.xSS.State}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see tdt4250.xss.xSS.XSSPackage#getXMultiStatement_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // XMultiStatement
