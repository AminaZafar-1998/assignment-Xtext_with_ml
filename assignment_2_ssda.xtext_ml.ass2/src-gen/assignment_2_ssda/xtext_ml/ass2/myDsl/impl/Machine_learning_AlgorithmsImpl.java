/**
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.myDsl.impl;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms;
import assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Predict_diabetes;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine learning Algorithms</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.impl.Machine_learning_AlgorithmsImpl#getPredict_diabetes <em>Predict diabetes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Machine_learning_AlgorithmsImpl extends MinimalEObjectImpl.Container implements Machine_learning_Algorithms
{
  /**
   * The cached value of the '{@link #getPredict_diabetes() <em>Predict diabetes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPredict_diabetes()
   * @generated
   * @ordered
   */
  protected Predict_diabetes predict_diabetes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected Machine_learning_AlgorithmsImpl()
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
    return MyDslPackage.Literals.MACHINE_LEARNING_ALGORITHMS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predict_diabetes getPredict_diabetes()
  {
    return predict_diabetes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPredict_diabetes(Predict_diabetes newPredict_diabetes, NotificationChain msgs)
  {
    Predict_diabetes oldPredict_diabetes = predict_diabetes;
    predict_diabetes = newPredict_diabetes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES, oldPredict_diabetes, newPredict_diabetes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setPredict_diabetes(Predict_diabetes newPredict_diabetes)
  {
    if (newPredict_diabetes != predict_diabetes)
    {
      NotificationChain msgs = null;
      if (predict_diabetes != null)
        msgs = ((InternalEObject)predict_diabetes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES, null, msgs);
      if (newPredict_diabetes != null)
        msgs = ((InternalEObject)newPredict_diabetes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES, null, msgs);
      msgs = basicSetPredict_diabetes(newPredict_diabetes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES, newPredict_diabetes, newPredict_diabetes));
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
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES:
        return basicSetPredict_diabetes(null, msgs);
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
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES:
        return getPredict_diabetes();
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
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES:
        setPredict_diabetes((Predict_diabetes)newValue);
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
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES:
        setPredict_diabetes((Predict_diabetes)null);
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
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS__PREDICT_DIABETES:
        return predict_diabetes != null;
    }
    return super.eIsSet(featureID);
  }

} //Machine_learning_AlgorithmsImpl
