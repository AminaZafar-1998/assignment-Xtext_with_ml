/**
 * generated by Xtext 2.26.0
 */
package assignment_2_ssda.xtext_ml.ass2.myDsl.impl;

import assignment_2_ssda.xtext_ml.ass2.myDsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MyDslFactoryImpl extends EFactoryImpl implements MyDslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MyDslFactory init()
  {
    try
    {
      MyDslFactory theMyDslFactory = (MyDslFactory)EPackage.Registry.INSTANCE.getEFactory(MyDslPackage.eNS_URI);
      if (theMyDslFactory != null)
      {
        return theMyDslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MyDslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MyDslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case MyDslPackage.DIABETES_PREDICTION_SYSTEM: return createDiabetes_Prediction_System();
      case MyDslPackage.MEDICINES: return createMedicines();
      case MyDslPackage.SYMPTOM: return createSymptom();
      case MyDslPackage.POLYURIA: return createPolyuria();
      case MyDslPackage.POLYDIPSIA: return createPolydipsia();
      case MyDslPackage.SUDDEN_WEIGHT_LOSS: return createsudden_weight_loss();
      case MyDslPackage.POLYPHAGIA: return createPolyphagia();
      case MyDslPackage.GENITAL_THRUSH: return createGenital_thrush();
      case MyDslPackage.VISUAL_BLURRING: return createvisual_blurring();
      case MyDslPackage.ITCHING: return createItching();
      case MyDslPackage.IRRITABILITY: return createIrritability();
      case MyDslPackage.DELAYED_HEALING: return createdelayed_healing();
      case MyDslPackage.PARTIAL_PARESIS: return createpartial_paresis();
      case MyDslPackage.MUSCLE_STIFFNESS: return createmuscle_stiffness();
      case MyDslPackage.ALOPECIA: return createAlopecia();
      case MyDslPackage.OBESITY: return createObesity();
      case MyDslPackage.SUGAR_TEST: return createSugar_Test();
      case MyDslPackage.DOCTOR: return createDoctor();
      case MyDslPackage.PATIENT: return createPatient();
      case MyDslPackage.PREDICT_DIABETES: return createPredict_diabetes();
      case MyDslPackage.MACHINE_LEARNING_ALGORITHMS: return createMachine_learning_Algorithms();
      case MyDslPackage.RANDOM_FOREST: return createRandom_forest();
      case MyDslPackage.SVM_CLASSIFIER: return createSVM_Classifier();
      case MyDslPackage.J48_CLASSIFIER: return createJ48Classifier();
      case MyDslPackage.NAVIE_BAYES: return createNavieBayes();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Diabetes_Prediction_System createDiabetes_Prediction_System()
  {
    Diabetes_Prediction_SystemImpl diabetes_Prediction_System = new Diabetes_Prediction_SystemImpl();
    return diabetes_Prediction_System;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Medicines createMedicines()
  {
    MedicinesImpl medicines = new MedicinesImpl();
    return medicines;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Symptom createSymptom()
  {
    SymptomImpl symptom = new SymptomImpl();
    return symptom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Polyuria createPolyuria()
  {
    PolyuriaImpl polyuria = new PolyuriaImpl();
    return polyuria;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Polydipsia createPolydipsia()
  {
    PolydipsiaImpl polydipsia = new PolydipsiaImpl();
    return polydipsia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public sudden_weight_loss createsudden_weight_loss()
  {
    sudden_weight_lossImpl sudden_weight_loss = new sudden_weight_lossImpl();
    return sudden_weight_loss;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Polyphagia createPolyphagia()
  {
    PolyphagiaImpl polyphagia = new PolyphagiaImpl();
    return polyphagia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Genital_thrush createGenital_thrush()
  {
    Genital_thrushImpl genital_thrush = new Genital_thrushImpl();
    return genital_thrush;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public visual_blurring createvisual_blurring()
  {
    visual_blurringImpl visual_blurring = new visual_blurringImpl();
    return visual_blurring;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Itching createItching()
  {
    ItchingImpl itching = new ItchingImpl();
    return itching;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Irritability createIrritability()
  {
    IrritabilityImpl irritability = new IrritabilityImpl();
    return irritability;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public delayed_healing createdelayed_healing()
  {
    delayed_healingImpl delayed_healing = new delayed_healingImpl();
    return delayed_healing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public partial_paresis createpartial_paresis()
  {
    partial_paresisImpl partial_paresis = new partial_paresisImpl();
    return partial_paresis;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public muscle_stiffness createmuscle_stiffness()
  {
    muscle_stiffnessImpl muscle_stiffness = new muscle_stiffnessImpl();
    return muscle_stiffness;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Alopecia createAlopecia()
  {
    AlopeciaImpl alopecia = new AlopeciaImpl();
    return alopecia;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Obesity createObesity()
  {
    ObesityImpl obesity = new ObesityImpl();
    return obesity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Sugar_Test createSugar_Test()
  {
    Sugar_TestImpl sugar_Test = new Sugar_TestImpl();
    return sugar_Test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Doctor createDoctor()
  {
    DoctorImpl doctor = new DoctorImpl();
    return doctor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Patient createPatient()
  {
    PatientImpl patient = new PatientImpl();
    return patient;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Predict_diabetes createPredict_diabetes()
  {
    Predict_diabetesImpl predict_diabetes = new Predict_diabetesImpl();
    return predict_diabetes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Machine_learning_Algorithms createMachine_learning_Algorithms()
  {
    Machine_learning_AlgorithmsImpl machine_learning_Algorithms = new Machine_learning_AlgorithmsImpl();
    return machine_learning_Algorithms;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Random_forest createRandom_forest()
  {
    Random_forestImpl random_forest = new Random_forestImpl();
    return random_forest;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public SVM_Classifier createSVM_Classifier()
  {
    SVM_ClassifierImpl svM_Classifier = new SVM_ClassifierImpl();
    return svM_Classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public J48Classifier createJ48Classifier()
  {
    J48ClassifierImpl j48Classifier = new J48ClassifierImpl();
    return j48Classifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NavieBayes createNavieBayes()
  {
    NavieBayesImpl navieBayes = new NavieBayesImpl();
    return navieBayes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public MyDslPackage getMyDslPackage()
  {
    return (MyDslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MyDslPackage getPackage()
  {
    return MyDslPackage.eINSTANCE;
  }

} //MyDslFactoryImpl
