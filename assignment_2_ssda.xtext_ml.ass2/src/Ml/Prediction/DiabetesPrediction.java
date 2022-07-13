package Ml.Prediction;
import java.io.BufferedReader;

import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;
import java.util.List;

import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.PlatformResourceURIHandlerImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;
import org.eclipse.emf.mwe.internal.core.ast.util.Injector;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.generator.IShouldGenerate;
import org.eclipse.xtext.impl.XtextFactoryImpl;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.AbstractNode;
import org.eclipse.xtext.nodemodel.impl.CompositeNode;
import org.eclipse.xtext.nodemodel.impl.LeafNode;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Patient;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Polydipsia;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Polyuria;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Medicines;
import assignment_2_ssda.xtext_ml.ass2.MyDslStandaloneSetup;
import assignment_2_ssda.xtext_ml.ass2.generator.MyDslGenerator;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Diabetes_Prediction_System;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Doctor;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Symptom;
import assignment_2_ssda.xtext_ml.ass2.myDsl.sudden_weight_loss;
import assignment_2_ssda.xtext_ml.ass2.myDsl.Sugar_Test;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.impl.ResourceServiceProviderRegistryImpl;
import org.eclipse.xtext.testing.XtextRunner;
import org.junit.runner.RunWith;

import com.google.inject.Inject;

import assignment_2_ssda.xtext_ml.ass2.myDsl.Machine_learning_Algorithms;

import org.eclipse.core.internal.resources.Container;
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
import weka.core.Environment;
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
import weka.core.pmml.jaxbbindings.Extension;
public class DiabetesPrediction
{

	  public static void main(String[] args) throws Exception 
	  {		 
			
	    Instances train = null;
		Instances test = null;  
			
			// load data
			  CSVLoader loader = new CSVLoader();
			  loader.setSource(new File("/Users/amina/Downloads/dataset_diabetes.csv"));
			  Instances data = loader.getDataSet();
	  
		// uses the last attribute as class attribute
		  if (data.classIndex() == -1)
		  data.setClassIndex(data.numAttributes() - 1);
		// System.out.println("Instances:" +(data.numAttributes() - 1));
		  
		
		//used with randomization method to generate fixed random values 
		  //otherwise it will run at each time, it generates new values.
		  int seeds=1;  //used when splitting the data_set
		  int folds= 5;
			
			//randomize data
			Random rand = new Random(seeds);
			
			//create random dataset
			Instances randData = new Instances(data);
			randData.randomize(rand);


		/*straified k-flold validation is used to balance the proportion of each 
		class outcome in each fold. Basically, 
		K-fold validation is used to set out the train and tesst data into given 
		type-fold, so that train data as well as validate model*/
			
			if(randData.classAttribute().isNominal())
				randData.stratify(folds);
		
			for(int n=0; n< folds; n++)
			{
				
				train =  randData.trainCV(folds, n);
				test = randData.testCV(folds, n);
			}
                               
			 //============================================= For PREDICTING NEW DATA ====================================
			//ICompositeNode node = NodeModelUtils.getNode(resource.getContents().get(0));
			//	node.getText();*/
				
			    System.out.println("For PREDICTING NEW DATA");
				new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
				com.google.inject.Injector injector= new MyDslStandaloneSetup().createInjectorAndDoEMFRegistration();
				XtextResourceSet resourceSet = ((com.google.inject.Injector) injector).getInstance(XtextResourceSet.class);
				resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);				 
				 Resource resource = resourceSet.createResource(URI.createURI("/xtext_ml.ass2"));
				 InputStream in = new ByteArrayInputStream("Diabetes prediction system".getBytes());
				 resource.load(in, resourceSet.getLoadOptions());
				 
			     Diabetes_Prediction_System root = (Diabetes_Prediction_System)resource.getContents().get(0);	 
			     System.out.println(root.eClass().getName() + " "+ root.getName());
			     
			     /*EObject eobject = resource.getContents().get(0);
			     Diabetes_Prediction_System domainModel = (Diabetes_Prediction_System) eobject;
 			     
			     EList<Symptom> symptoms=domainModel.getSymptom();
			     for(Symptom symptom:symptoms) 
			     {
			    	 if(symptom instanceof Polydipsia)
			    	 {
			    		 
			         Polydipsia polydispia = ((Polydipsia)symptom);
			  System.out.println("Polydispia "  + polydispia.getName()+ " extends "+ polydispia.eClass().getESuperTypes().getClass());
			    	 } 
			     
			     else if (symptom instanceof sudden_weight_loss) {
			         sudden_weight_loss sudden_weight_loss_var = (sudden_weight_loss) symptom;
			    	 System.out.println("sudden_weight_loss "+ sudden_weight_loss_var.getName());
			    	 }
			    	}
			    	*/

			    	 
				    
			    
			    	 
			   // Instances unlabeled=new Instances ((Reader) root.getSymptom());
			 
			    
			    	 //IFileSystemAccess2 fsa=null;
			    	 //fsa.generateFile("symptom", ".csv" +symptomslist.getClass());
			         
			   //File file= new File("c:/users");
			   //String read=file.getAbsolutePath();
			
			//============================================ For PREDICTING NEW DATA ====================================
			 
	      String[] options1 = new String[1];
	      
	    /* here string options are used for pruned trees. When un-pruned tree--> trees gets much larger and
	    accuracy generates less than pruned trees. Pruned trees are basically used to select a best attributes on nodes
	    and leaf nodes which provides best information those nodes which doesn't provides 
	    enough information, they neglects by the pruned trees.*/
	      
	      options1[0] = "-U"; // unpruned tree
	      
	    /* j48 Classifier is a top-down decision tree, in which it create the trees based on the best attributes selection procedure 
	    and that procedure split the the nodes into small leaf nodes
	     how J48 classifier selects best attribute selection based on the information gain      
	    which is higher than other info gain of attributes */ 
	
	      J48 tree = new J48(); // new instance of tree
	      
	      try {
	      tree.setOptions(options1); // set the options
	      tree.buildClassifier(train); // build classifier
	  
	    ///------------------------------------------------
	      
	   // output predictions
	      System.out.println("-------------------------------");
	      System.out.println("Using the J48 Classifier for diabetic dataset" +"\n");
	      for (int i = 0; i < test.numInstances(); i++) 
	      {
	      double pred = tree.classifyInstance(test.instance(i));
	      System.out.print("ID = " + (test.instance(i).value(0)) + " - ");
	      System.out.print("( Actual - " + " " +test.classAttribute().value((int) test.instance(i).classValue()) + " ) ");
	      System.out.println(" ( Predicted - " + " " +test.classAttribute().value((int) pred) + " ) ");
	      } 
	      
	      System.out.println("\n");
	      
	      //training evaluation
	      System.out.println("---------------------------------");
	      System.out.println("Results of J48 Classifier ");
	      Evaluation evaluation1= new Evaluation(train);	 
		  evaluation1.evaluateModel(tree, train);
	      System.out.println(evaluation1.toSummaryString("\nResults of training\n\n", false));
	      
	    //Confusion Matrix to determine the performance how much classes as true/false predicted 
		  System.out.println("\n"+"Results of confusion matrix of training set of J48 Classifier" + "\n");
		  System.out.println(evaluation1.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation1.toClassDetailsString());
		  
		  //testing evaluation
	      Evaluation evaluation= new Evaluation(test);	 
		 evaluation.evaluateModel(
	                tree, test);
		  System.out.println(evaluation.toSummaryString("\nResults of testing using J48 Classifier\n\n", false));
		  System.out.println("---------------------------------");
		  
		    //Confusion Matrix to determine the performance how much classes as true/false predicted 
			  System.out.println("\n"+"Results of confusion matrix of testing set of J48 Classifier" + "\n");
			  System.out.println(evaluation.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation.toClassDetailsString());
		
	      }
	      catch (Exception e)
	      {
	    	  e.printStackTrace();
	      }
		  
		  
		  //-------------------------------SMO-------------------------
		  SMO smo = new SMO();
		  RBFKernel rbf =new  RBFKernel();
		  try 
		  {
		  smo.setKernel(rbf);
		  smo.buildClassifier(train);
		  
		// output predictions
	      System.out.println("-------------------------------");
	      System.out.println("Using the SMO for diabetic dataset" +"\n");
	      System.out.println("\n");
	      
	      for (int i = 0; i < test.numInstances(); i++) 
	      {
	      double pred  = smo.classifyInstance(test.instance(i));
	      System.out.print("ID = " + (test.instance(i).value(0)) + " - ");
	      System.out.print("( Actual - " + " " +test.classAttribute().value((int) test.instance(i).classValue()) + " ) ");
	      System.out.println(" ( Predicted - " + " " +test.classAttribute().value((int) pred) + " ) ");
	      }

		  System.out.println("---------------------------------");
	      Evaluation evaluation2= new Evaluation(train);	 
		  evaluation2.evaluateModel(smo, train);
	      System.out.println(evaluation2.toSummaryString("\n" + "Results of Training set using Support vector Algorithm by function of SMO\n\n", false));
	      
	      
		  //Confusion Matrix to determine the performance how much classes as true/false predicted 
		  System.out.println("\n"+"Results of confusion matrix of training set of Support vector machine of SMO Function" + "\n");
		  System.out.println(evaluation2.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation2.toClassDetailsString());	

	      Evaluation evaluation3= new Evaluation(test);	 
	      evaluation3.evaluateModel(
	                smo, test);
	      
		  System.out.println(evaluation3.toSummaryString("\n" + "Results of testing set using Support vector Algorithm by function of SMO \n\n", false));
		 
		  
		 //Confusion Matrix to determine the performance how much classes as true/false predicted 
	     System.out.println("\n"+"Results of confusion matrix of testing set of Support Vector Machine algorithm of smo function" + "\n");
	     System.out.println(evaluation3.toMatrixString());
	     
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation3.toClassDetailsString());
		  
		  //============================================= PREDICTING NEW DATA ====================================
		  System.out.println("-----------------------------------------------");
		  //Instances symptomslist1=new Instances(file);
		  
		  //symptomslist1l
		  }
		  catch (Exception e)
		  {
			  e.printStackTrace();
		  }
		  
		///Randomforest Classifier 
	      //-------------------------------------
	      RandomForest random_forest = new RandomForest();
	      
		  try 
		  {
		 
	      random_forest.buildClassifier(train);
	      //-------------------------------------
	      System.out.println("\n");
	      // output predictions
	      System.out.println("Using the random forest Classifier for diabetic dataset" +"\n");
	      
	      System.out.println("\n");
	      
	      for (int i = 0; i < test.numInstances(); i++) 
	      {
	      double pred = random_forest.classifyInstance(test.instance(i));
	      System.out.print("ID = " + (test.instance(i).value(0)) + " - ");
	      System.out.print("( Actual - " + " " +test.classAttribute().value((int) test.instance(i).classValue()) + " ) ");
	      System.out.println(" ( Predicted - " + " " +test.classAttribute().value((int) pred) + " ) ");
	      }

	      
	      System.out.println("---------------------------------");
	      Evaluation evaluation4= new Evaluation(train);	 
		  evaluation4.evaluateModel(random_forest, train);
	      System.out.println(evaluation4.toSummaryString("\n" + "Results of Random Forest Algorithm of training set\n\n", false));
	      
	    //Confusion Matrix to determine the performance how much classes as true/false predicted
		  System.out.println("\n"+"Results of confusion matrix for training set with random forest" + "\n");
		  System.out.println(evaluation4.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation4.toClassDetailsString());

	      
	      Evaluation evaluation5= new Evaluation(test);	 
	      evaluation5.evaluateModel(random_forest, test);
		  System.out.println(evaluation5.toSummaryString("\n"+ "Results of testing OF Random Forest\n\n",false));
		  System.out.println("---------------------------------");
		  
		  //Confusion Matrix to determine the performance how much classes as true/false predicted
		  System.out.println("\n"+"Results of confusion matrix" + "\n");
		  System.out.println(evaluation5.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation5.toClassDetailsString());

		  //============================================= PREDICTING NEW DATA ====================================
		  }
		  catch (Exception e)
		  {
			  e.printStackTrace();
		  }
		  
	      
		  //train datas on navie bayes
		  NaiveBayesUpdateable nb = new NaiveBayesUpdateable();
		  try
		  {
			  System.out.println("\n");
		      // output predictions
		      System.out.println("Using the  Naive Bayes Classifier for diabetic dataset" +"\n");
		      
		      System.out.println("\n");
		  nb.buildClassifier(train);  
		  
	      for (int i = 0; i < test.numInstances(); i++) 
	      {
	      double pred = nb.classifyInstance(test.instance(i));
	      System.out.print("ID = " + (test.instance(i).value(0)) + " - ");
	      System.out.print("( Actual - " + " " +test.classAttribute().value((int) test.instance(i).classValue()) + " ) ");
	      System.out.println(" ( Predicted - " + " " +test.classAttribute().value((int) pred) + " ) ");
	      }

	      
	      System.out.println("---------------------------------");
	      Evaluation evaluation_nb= new Evaluation(train);	 
		  evaluation_nb.evaluateModel(nb, train);
	      System.out.println(evaluation_nb.toSummaryString("\n" + "Results of  Naive Bayes Algorithm of training set\n\n", false));
	      
	    //Confusion Matrix to determine the performance how much classes as true/false predicted
		  System.out.println("\n"+"Results of confusion matrix for training set with  Naive Bayes" + "\n");
		  System.out.println(evaluation_nb.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation_nb.toClassDetailsString());
		  
	      
	      Evaluation evaluation_nb_test= new Evaluation(test);	 
	      evaluation_nb_test.evaluateModel(nb, test);
		  System.out.println(evaluation_nb_test.toSummaryString("\n"+ "Results of testing of Navie Bayes \n\n", false));
		  System.out.println("---------------------------------");
		  
		  //Confusion Matrix to determine the performance how much classes as true/false predicted
		  System.out.println("\n"+"Results of confusion matrix" + "\n");
		  System.out.println(evaluation_nb_test.toMatrixString());
		  
		  //Precision, recall matrix to determine the performance details
		  System.out.println("\n"+"Results of Performance Parameter Values Details" + "\n");
		  System.out.println(evaluation_nb_test.toClassDetailsString());	
	
		  }
		  
		  catch (Exception e)
		  {
			  e.printStackTrace();
		  }
	      }
}
