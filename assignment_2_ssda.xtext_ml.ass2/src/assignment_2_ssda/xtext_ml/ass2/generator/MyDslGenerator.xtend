/*
 * generated by Xtext 2.25.0
 */
package assignment_2_ssda.xtext_ml.ass2.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import assignment_2_ssda.xtext_ml.ass2.myDsl.Patient
import assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines
import assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor
import assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom
import assignment_2_ssda.xtext_ml.ass2.myDsl.Sugar_Test
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms
import assignment_2_ssda.xtext_ml.ass2.MyDslStandaloneSetup
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.common.util.URI

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
public class MyDslGenerator extends AbstractGenerator 
{

override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) 
	{
//fetch eclipse run-time instances 


for(patients: resource.allContents.toIterable.filter(Patient))
		 {
			fsa.generateFile("Objects/"+ patients.name  + ".java", patients.compile)
		}

for(doctors: resource.allContents.toIterable.filter(Doctor))
		 {
			fsa.generateFile("Objects/"+  doctors.name + ".java", doctors.compile)
		}
		
for(ml_algos: resource.allContents.toIterable.filter(Machine_learning_Algorithms))
		 {
	fsa.generateFile("Objects/"+  ml_algos.eClass.name + ".java", ml_algos.compile)
		}
  }
	def getCompile(Patient patient)
    {
    '''
    	public class �patient.name�
    	'{'
    	String patient_Gender = �patient.patient_Gender�
        int patient_Age = �patient.patient_Age�
    	int patient_Height = �patient.patient_Height�
    	int patient_Weight = �patient.patient_Weight�
    	int blood_pressure = �patient.patient_blood_pressure�
    	int pulse_rate = �patient.pulse_rate� 
    
         Records of symptoms that the patient have....
        �FOR symptoms : patient.symptoms�
    	�"\t"�
    	  symptoms_name=�symptoms.name�  
    	 �"\n"�
    	 �ENDFOR�              

         Records of medicines the patient has taking....
         �FOR medicines : patient.medicines�
         �"\t"�
         'medicine_name' = �medicines.medicine_name�
         �"\n"�
         'medicine_dossage' = �medicines.medicine_dossage�
         �ENDFOR�   
 
         Records of patient sugar test....
         �FOR sugar_tests : patient.sugar_tests�
         �"\t"�
         'current_blood_sugar' = �sugar_tests.current_blood_sugar�
         �"\n"�
         'previous_blood_sugar' = �sugar_tests.previous_blood_sugar�
          �ENDFOR�   
       
        
         "All patients with doctor records" �"\n"�      
          ----------------------------------------
           name of patient's doctor= �patient.DOCTORS.filter(typeof(Doctor)).head.name�
           name of patient's doctor's specailization=�patient.DOCTORS.filter(typeof(Doctor)).head.doctor_specailization�
          ---------------------------------------
          	
    '''
     }
     
  def getCompile(Doctor doctor)
    {
    '''
    String Doctor_specailization = �doctor.doctor_specailization�
    name of medicines= �doctor.medicines.filter(typeof(Medicines)).head�
    
    '''
    
  }
  
  def getCompile(Machine_learning_Algorithms ml_algos)
    {
    '''
     here, Used �ml_algos.eClass.name� 
     to  predict symptoms with classes of
     �ml_algos.predict_diabetes.eClass.name� with the �ml_algos.predict_diabetes.name�
     STRING get ml_algo �ml_algos.eClass.name.toUpperCase�
     {
       	return �ml_algos.eClass.name�
     }
     STRING set �ml_algos.eClass.name�
     {
     	�ml_algos.eClass.name� = �ml_algos.eClass.name.concat("Machine learning algorithms have used to predict the diabetes on early stage based, 
                      to reduce the risk of other diseases")� 
       �ml_algos.eClass.name� = �ml_algos.eClass.name.matches("[a-zA-Z0-9]+")� 
     }
    
    '''
    }
  }