import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.mwe.internal.core.ast.util.Injector;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.IShouldGenerate;
import org.eclipse.xtext.impl.XtextFactoryImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Patient;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines;
import assignment_2_ssda.xtext_ml.ass2.MyDslStandaloneSetup;
import assignment_2_ssda.xtext_ml.ass2.generator.MyDslGenerator;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Sugar_Test;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceServiceProviderRegistryImpl;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.EcoreFactoryImpl;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import weka.core.Instance;
import weka.core.Instances;
import weka.filters.Filter;
import weka.filters.unsupervised.attribute.Normalize;
import weka.core.Debug.Random;
import weka.core.Drawable;
import weka.core.Utils;
import weka.classifiers.Classifier;
import weka.classifiers.bayes.NaiveBayesUpdateable;
import weka.classifiers.evaluation.Evaluation;
import weka.classifiers.evaluation.output.prediction.CSV;
import weka.classifiers.functions.LinearRegression;
import weka.classifiers.functions.SGD;
import weka.classifiers.functions.SMO;
import weka.classifiers.functions.supportVector.Kernel;
import weka.classifiers.functions.supportVector.RBFKernel;
import weka.classifiers.trees.DecisionStump;
import weka.classifiers.trees.J48;
import weka.classifiers.trees.RandomForest;
import weka.core.converters.CSVLoader;
public class Generator{


	/**
	   * Expects a dataset as first parameter. The last attribute is used
	   * as class attribute.
	 * @param <val>
	 * @param <val>
	   *
	   * @param args	the command-line parameters
	 * @param Resource 
	 * @param IFileSystemAccess2 
	 * @param IGeneratorContext 
	 * @throws IOException 
	   * @throws Exception	if something goes wrong
	   */	

	  public static void main(String[] args) throws Exception 
	  {		 
	

	new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
	com.google.inject.Injector injector = new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
	ResourceSet resourceSet = injector.getInstance(ResourceSet.class);
			
	Resource resource = resourceSet.getResource(URI.createURI("runtime-EclipseXtext/ssda_assignment2.ass2"), true);
}
}
