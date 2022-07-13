/**
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.myDsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Diabetes Prediction System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getName <em>Name</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getMedicines <em>Medicines</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getSymptom <em>Symptom</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getDoctors <em>Doctors</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getPatient <em>Patient</em>}</li>
 *   <li>{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getMachine_learning_Algorithms <em>Machine learning Algorithms</em>}</li>
 * </ul>
 *
 * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System()
 * @model
 * @generated
 */
public interface Diabetes_Prediction_System extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Medicines</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Medicines</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Medicines()
   * @model containment="true"
   * @generated
   */
  EList<Medicines> getMedicines();

  /**
   * Returns the value of the '<em><b>Symptom</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Symptom</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Symptom()
   * @model containment="true"
   * @generated
   */
  EList<Symptom> getSymptom();

  /**
   * Returns the value of the '<em><b>Doctors</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doctors</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Doctors()
   * @model containment="true"
   * @generated
   */
  EList<Doctor> getDoctors();

  /**
   * Returns the value of the '<em><b>Patient</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Patient}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Patient</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Patient()
   * @model containment="true"
   * @generated
   */
  EList<Patient> getPatient();

  /**
   * Returns the value of the '<em><b>Machine learning Algorithms</b></em>' containment reference list.
   * The list contents are of type {@link assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine learning Algorithms</em>' containment reference list.
   * @see assignment_2_ssda.xtext_ml.ass2.myDsl.MyDslPackage#getDiabetes_Prediction_System_Machine_learning_Algorithms()
   * @model containment="true"
   * @generated
   */
  EList<Machine_learning_Algorithms> getMachine_learning_Algorithms();

} // Diabetes_Prediction_System
