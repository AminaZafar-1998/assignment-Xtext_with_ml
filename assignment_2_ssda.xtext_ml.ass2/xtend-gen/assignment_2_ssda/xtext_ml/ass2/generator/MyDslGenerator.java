/**
 * generated by Xtext 2.25.0
 */
package assignment_2_ssda.xtext_ml.ass2.generator;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Patient;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Sugar_Test;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom;
import com.google.common.collect.Iterables;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MyDslGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    Iterable<Patient> _filter = Iterables.<Patient>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Patient.class);
    for (final Patient patients : _filter) {
      String _name = patients.getName();
      String _plus = ("Objects/" + _name);
      String _plus_1 = (_plus + ".java");
      fsa.generateFile(_plus_1, this.getCompile(patients));
    }
    Iterable<Doctor> _filter_1 = Iterables.<Doctor>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Doctor.class);
    for (final Doctor doctors : _filter_1) {
      String _name_1 = doctors.getName();
      String _plus_2 = ("Objects/" + _name_1);
      String _plus_3 = (_plus_2 + ".java");
      fsa.generateFile(_plus_3, this.getCompile(doctors));
    }
    Iterable<Machine_learning_Algorithms> _filter_2 = Iterables.<Machine_learning_Algorithms>filter(IteratorExtensions.<EObject>toIterable(resource.getAllContents()), Machine_learning_Algorithms.class);
    for (final Machine_learning_Algorithms ml_algos : _filter_2) {
      String _name_2 = ml_algos.eClass().getName();
      String _plus_4 = ("Objects/" + _name_2);
      String _plus_5 = (_plus_4 + ".java");
      fsa.generateFile(_plus_5, this.getCompile(ml_algos));
    }
  }
  
  public CharSequence getCompile(final Patient patient) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("   \t");
    _builder.append("public class ");
    String _name = patient.getName();
    _builder.append(_name, "   \t");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("\'{\'");
    _builder.newLine();
    _builder.append("   \t");
    _builder.append("String patient_Gender = ");
    String _patient_Gender = patient.getPatient_Gender();
    _builder.append(_patient_Gender, "   \t");
    _builder.newLineIfNotEmpty();
    _builder.append("       ");
    _builder.append("int patient_Age = ");
    int _patient_Age = patient.getPatient_Age();
    _builder.append(_patient_Age, "       ");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("int patient_Height = ");
    String _patient_Height = patient.getPatient_Height();
    _builder.append(_patient_Height, "   \t");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("int patient_Weight = ");
    String _patient_Weight = patient.getPatient_Weight();
    _builder.append(_patient_Weight, "   \t");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("int blood_pressure = ");
    int _patient_blood_pressure = patient.getPatient_blood_pressure();
    _builder.append(_patient_blood_pressure, "   \t");
    _builder.newLineIfNotEmpty();
    _builder.append("   \t");
    _builder.append("int pulse_rate = ");
    int _pulse_rate = patient.getPulse_rate();
    _builder.append(_pulse_rate, "   \t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("   ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Records of symptoms that the patient have....");
    _builder.newLine();
    {
      EList<Symptom> _symptoms = patient.getSymptoms();
      for(final Symptom symptoms : _symptoms) {
        _builder.append("\t");
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.append("symptoms_name=");
        String _name_1 = symptoms.getName();
        _builder.append(_name_1, "  ");
        _builder.append("  ");
        _builder.newLineIfNotEmpty();
        _builder.append(" ");
        _builder.append("\n", " ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Records of medicines the patient has taking....");
    _builder.newLine();
    {
      EList<Medicines> _medicines = patient.getMedicines();
      for(final Medicines medicines : _medicines) {
        _builder.append("        ");
        _builder.append("\t", "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\'medicine_name\' = ");
        String _medicine_name = medicines.getMedicine_name();
        _builder.append(_medicine_name, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\n", "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\'medicine_dossage\' = ");
        String _medicine_dossage = medicines.getMedicine_dossage();
        _builder.append(_medicine_dossage, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.newLine();
    _builder.append("        ");
    _builder.append("Records of patient sugar test....");
    _builder.newLine();
    {
      EList<Sugar_Test> _sugar_tests = patient.getSugar_tests();
      for(final Sugar_Test sugar_tests : _sugar_tests) {
        _builder.append("        ");
        _builder.append("\t", "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\'current_blood_sugar\' = ");
        String _current_blood_sugar = sugar_tests.getCurrent_blood_sugar();
        _builder.append(_current_blood_sugar, "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\n", "        ");
        _builder.newLineIfNotEmpty();
        _builder.append("        ");
        _builder.append("\'previous_blood_sugar\' = ");
        String _previous_blood_sugar = sugar_tests.getPrevious_blood_sugar();
        _builder.append(_previous_blood_sugar, "        ");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("      ");
    _builder.newLine();
    _builder.append("       ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("\"All patients with doctor records\" ");
    _builder.append("\n", "        ");
    _builder.append("      ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("----------------------------------------");
    _builder.newLine();
    _builder.append("          ");
    _builder.append("name of patient\'s doctor= ");
    String _name_2 = IterableExtensions.<Doctor>head(Iterables.<Doctor>filter(patient.getDOCTORS(), Doctor.class)).getName();
    _builder.append(_name_2, "          ");
    _builder.newLineIfNotEmpty();
    _builder.append("          ");
    _builder.append("name of patient\'s doctor\'s specailization=");
    String _doctor_specailization = IterableExtensions.<Doctor>head(Iterables.<Doctor>filter(patient.getDOCTORS(), Doctor.class)).getDoctor_specailization();
    _builder.append(_doctor_specailization, "          ");
    _builder.newLineIfNotEmpty();
    _builder.append("         ");
    _builder.append("---------------------------------------");
    _builder.newLine();
    _builder.append("         \t");
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCompile(final Doctor doctor) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("String Doctor_specailization = ");
    String _doctor_specailization = doctor.getDoctor_specailization();
    _builder.append(_doctor_specailization);
    _builder.newLineIfNotEmpty();
    _builder.append("name of medicines= ");
    Medicines _head = IterableExtensions.<Medicines>head(Iterables.<Medicines>filter(doctor.getMedicines(), Medicines.class));
    _builder.append(_head);
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    return _builder;
  }
  
  public CharSequence getCompile(final Machine_learning_Algorithms ml_algos) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("here, Used ");
    String _name = ml_algos.eClass().getName();
    _builder.append(_name);
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("to  predict symptoms with classes of");
    _builder.newLine();
    String _name_1 = ml_algos.getPredict_diabetes().eClass().getName();
    _builder.append(_name_1);
    _builder.append(" with the ");
    int _name_2 = ml_algos.getPredict_diabetes().getName();
    _builder.append(_name_2);
    _builder.newLineIfNotEmpty();
    _builder.append("STRING get ml_algo ");
    String _upperCase = ml_algos.eClass().getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("  \t");
    _builder.append("return ");
    String _name_3 = ml_algos.eClass().getName();
    _builder.append(_name_3, "  \t");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("STRING set ");
    String _name_4 = ml_algos.eClass().getName();
    _builder.append(_name_4);
    _builder.newLineIfNotEmpty();
    _builder.append("{");
    _builder.newLine();
    _builder.append("\t");
    String _name_5 = ml_algos.eClass().getName();
    _builder.append(_name_5, "\t");
    _builder.append(" = ");
    String _concat = ml_algos.eClass().getName().concat("Machine learning algorithms have used to predict the diabetes on early stage based, \r\n                      to reduce the risk of other diseases");
    _builder.append(_concat, "\t");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("  ");
    String _name_6 = ml_algos.eClass().getName();
    _builder.append(_name_6, "  ");
    _builder.append(" = ");
    boolean _matches = ml_algos.eClass().getName().matches("[a-zA-Z0-9]+");
    _builder.append(_matches, "  ");
    _builder.append(" ");
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.append("    ");
    _builder.newLine();
    return _builder;
  }
}