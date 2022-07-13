/**
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.myDsl.impl;

import assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Random_forest;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Random forest</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.impl.Random_forestImpl#getCreate_trees <em>Create trees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Random_forestImpl extends Machine_learning_AlgorithmsImpl implements Random_forest
{
  /**
   * The default value of the '{@link #getCreate_trees() <em>Create trees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate_trees()
   * @generated
   * @ordered
   */
  protected static final String CREATE_TREES_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCreate_trees() <em>Create trees</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreate_trees()
   * @generated
   * @ordered
   */
  protected String create_trees = CREATE_TREES_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Random_forestImpl()
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
    return MyDslPackage.Literals.RANDOM_FOREST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCreate_trees()
  {
    return create_trees;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCreate_trees(String newCreate_trees)
  {
    String oldCreate_trees = create_trees;
    create_trees = newCreate_trees;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.RANDOM_FOREST__CREATE_TREES, oldCreate_trees, create_trees));
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
      case MyDslPackage.RANDOM_FOREST__CREATE_TREES:
        return getCreate_trees();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case MyDslPackage.RANDOM_FOREST__CREATE_TREES:
        setCreate_trees((String)newValue);
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
      case MyDslPackage.RANDOM_FOREST__CREATE_TREES:
        setCreate_trees(CREATE_TREES_EDEFAULT);
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
      case MyDslPackage.RANDOM_FOREST__CREATE_TREES:
        return CREATE_TREES_EDEFAULT == null ? create_trees != null : !CREATE_TREES_EDEFAULT.equals(create_trees);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (create_trees: ");
    result.append(create_trees);
    result.append(')');
    return result.toString();
  }

} //Random_forestImpl