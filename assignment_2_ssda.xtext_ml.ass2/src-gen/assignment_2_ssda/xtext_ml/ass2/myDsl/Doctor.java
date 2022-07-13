/**
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Doctor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getName <em>Name</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getDoctor_specailization <em>Doctor specailization</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getSymptoms <em>Symptoms</em>}</li>
 * </ul>
 *
 * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDoctor()
 * @model
 * @generated
 */
public interface Doctor extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDoctor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Doctor specailization</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doctor specailization</em>' attribute.
   * @see #setDoctor_specailization(String)
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDoctor_Doctor_specailization()
   * @model
   * @generated
   */
  String getDoctor_specailization();

  /**
   * Sets the value of the '{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor#getDoctor_specailization <em>Doctor specailization</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doctor specailization</em>' attribute.
   * @see #getDoctor_specailization()
   * @generated
   */
  void setDoctor_specailization(String value);

  /**
   * Returns the value of the '<em><b>Medicines</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Medicines</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDoctor_Medicines()
   * @model containment="true"
   * @generated
   */
  EList<Medicines> getMedicines();

  /**
   * Returns the value of the '<em><b>Symptoms</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symptoms</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDoctor_Symptoms()
   * @model containment="true"
   * @generated
   */
  EList<Symptom> getSymptoms();

} // Doctor
