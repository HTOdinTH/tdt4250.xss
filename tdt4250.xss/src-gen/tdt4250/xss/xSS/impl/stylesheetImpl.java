/**
 * generated by Xtext 2.22.0
 */
package tdt4250.xss.xSS.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.xss.xSS.XProperty;
import tdt4250.xss.xSS.XSSPackage;
import tdt4250.xss.xSS.XSelector;
import tdt4250.xss.xSS.stylesheet;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>stylesheet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.xss.xSS.impl.stylesheetImpl#getCustomSelectors <em>Custom Selectors</em>}</li>
 *   <li>{@link tdt4250.xss.xSS.impl.stylesheetImpl#getCustomProperties <em>Custom Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class stylesheetImpl extends MinimalEObjectImpl.Container implements stylesheet
{
  /**
   * The cached value of the '{@link #getCustomSelectors() <em>Custom Selectors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomSelectors()
   * @generated
   * @ordered
   */
  protected EList<XSelector> customSelectors;

  /**
   * The cached value of the '{@link #getCustomProperties() <em>Custom Properties</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCustomProperties()
   * @generated
   * @ordered
   */
  protected EList<XProperty> customProperties;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected stylesheetImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return XSSPackage.Literals.STYLESHEET;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<XSelector> getCustomSelectors()
  {
    if (customSelectors == null)
    {
      customSelectors = new EObjectContainmentEList<XSelector>(XSelector.class, this, XSSPackage.STYLESHEET__CUSTOM_SELECTORS);
    }
    return customSelectors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<XProperty> getCustomProperties()
  {
    if (customProperties == null)
    {
      customProperties = new EObjectContainmentEList<XProperty>(XProperty.class, this, XSSPackage.STYLESHEET__CUSTOM_PROPERTIES);
    }
    return customProperties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XSSPackage.STYLESHEET__CUSTOM_SELECTORS:
        return ((InternalEList<?>)getCustomSelectors()).basicRemove(otherEnd, msgs);
      case XSSPackage.STYLESHEET__CUSTOM_PROPERTIES:
        return ((InternalEList<?>)getCustomProperties()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case XSSPackage.STYLESHEET__CUSTOM_SELECTORS:
        return getCustomSelectors();
      case XSSPackage.STYLESHEET__CUSTOM_PROPERTIES:
        return getCustomProperties();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XSSPackage.STYLESHEET__CUSTOM_SELECTORS:
        getCustomSelectors().clear();
        getCustomSelectors().addAll((Collection<? extends XSelector>)newValue);
        return;
      case XSSPackage.STYLESHEET__CUSTOM_PROPERTIES:
        getCustomProperties().clear();
        getCustomProperties().addAll((Collection<? extends XProperty>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case XSSPackage.STYLESHEET__CUSTOM_SELECTORS:
        getCustomSelectors().clear();
        return;
      case XSSPackage.STYLESHEET__CUSTOM_PROPERTIES:
        getCustomProperties().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case XSSPackage.STYLESHEET__CUSTOM_SELECTORS:
        return customSelectors != null && !customSelectors.isEmpty();
      case XSSPackage.STYLESHEET__CUSTOM_PROPERTIES:
        return customProperties != null && !customProperties.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //stylesheetImpl
