package assignment_2_ssda.xtext_ml.ass2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import assignment_2_ssda.xtext_ml.ass2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Diabetes_prediction_System:'", "'Medicines'", "'Medicine_dossage:'", "'Polyuria'", "'name:'", "'Polydipsia'", "'sudden_weight_loss'", "'Polyphagia'", "'Genital_thrush'", "'visual_blurring'", "'Itching'", "'Irritability'", "'delayed_healing'", "'partial_paresis'", "'muscle_stiffness'", "'Alopecia'", "'Obesity'", "'Sugar_test'", "'Previous_blood_sugar'", "'Current_blood_sugar'", "'Doctor'", "'Doctor_specailization'", "'Patient'", "'Patient_Gender'", "'Patient_Age'", "'Patient_Height'", "'Patient_Weight'", "'patients_blood_pressure'", "'pulse_rate'", "'doctor'", "'Predict_diabetes'", "'Random_forest'", "'create_trees'", "'SVM_Classifier'", "'kernel:'", "'J48Classifier'", "'set_pruned_trees:'", "'NavieBayes'", "'Conditional_Probability_based:'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }



     	private MyDslGrammarAccess grammarAccess;

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Diabetes_Prediction_System";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleDiabetes_Prediction_System"
    // InternalMyDsl.g:64:1: entryRuleDiabetes_Prediction_System returns [EObject current=null] : iv_ruleDiabetes_Prediction_System= ruleDiabetes_Prediction_System EOF ;
    public final EObject entryRuleDiabetes_Prediction_System() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDiabetes_Prediction_System = null;


        try {
            // InternalMyDsl.g:64:67: (iv_ruleDiabetes_Prediction_System= ruleDiabetes_Prediction_System EOF )
            // InternalMyDsl.g:65:2: iv_ruleDiabetes_Prediction_System= ruleDiabetes_Prediction_System EOF
            {
             newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDiabetes_Prediction_System=ruleDiabetes_Prediction_System();

            state._fsp--;

             current =iv_ruleDiabetes_Prediction_System; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDiabetes_Prediction_System"


    // $ANTLR start "ruleDiabetes_Prediction_System"
    // InternalMyDsl.g:71:1: ruleDiabetes_Prediction_System returns [EObject current=null] : (otherlv_0= 'Diabetes_prediction_System:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_medicines_2_0= ruleMedicines ) )* ( (lv_symptom_3_0= ruleSymptom ) )* ( (lv_doctors_4_0= ruleDoctor ) )* ( (lv_patient_5_0= rulePatient ) )* ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+ ) ;
    public final EObject ruleDiabetes_Prediction_System() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_medicines_2_0 = null;

        EObject lv_symptom_3_0 = null;

        EObject lv_doctors_4_0 = null;

        EObject lv_patient_5_0 = null;

        EObject lv_Machine_learning_Algorithms_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'Diabetes_prediction_System:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_medicines_2_0= ruleMedicines ) )* ( (lv_symptom_3_0= ruleSymptom ) )* ( (lv_doctors_4_0= ruleDoctor ) )* ( (lv_patient_5_0= rulePatient ) )* ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+ ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'Diabetes_prediction_System:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_medicines_2_0= ruleMedicines ) )* ( (lv_symptom_3_0= ruleSymptom ) )* ( (lv_doctors_4_0= ruleDoctor ) )* ( (lv_patient_5_0= rulePatient ) )* ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+ )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'Diabetes_prediction_System:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_medicines_2_0= ruleMedicines ) )* ( (lv_symptom_3_0= ruleSymptom ) )* ( (lv_doctors_4_0= ruleDoctor ) )* ( (lv_patient_5_0= rulePatient ) )* ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+ )
            // InternalMyDsl.g:79:3: otherlv_0= 'Diabetes_prediction_System:' ( (lv_name_1_0= RULE_ID ) ) ( (lv_medicines_2_0= ruleMedicines ) )* ( (lv_symptom_3_0= ruleSymptom ) )* ( (lv_doctors_4_0= ruleDoctor ) )* ( (lv_patient_5_0= rulePatient ) )* ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDiabetes_Prediction_SystemAccess().getDiabetes_prediction_SystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDiabetes_Prediction_SystemAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDiabetes_Prediction_SystemRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_medicines_2_0= ruleMedicines ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_medicines_2_0= ruleMedicines )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_medicines_2_0= ruleMedicines )
            	    // InternalMyDsl.g:103:5: lv_medicines_2_0= ruleMedicines
            	    {

            	    					newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemAccess().getMedicinesMedicinesParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_medicines_2_0=ruleMedicines();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiabetes_Prediction_SystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"medicines",
            	    						lv_medicines_2_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Medicines");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( (lv_symptom_3_0= ruleSymptom ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14||(LA2_0>=16 && LA2_0<=27)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_symptom_3_0= ruleSymptom )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_symptom_3_0= ruleSymptom )
            	    // InternalMyDsl.g:122:5: lv_symptom_3_0= ruleSymptom
            	    {

            	    					newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemAccess().getSymptomSymptomParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_symptom_3_0=ruleSymptom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiabetes_Prediction_SystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"symptom",
            	    						lv_symptom_3_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Symptom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMyDsl.g:139:3: ( (lv_doctors_4_0= ruleDoctor ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==31) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:140:4: (lv_doctors_4_0= ruleDoctor )
            	    {
            	    // InternalMyDsl.g:140:4: (lv_doctors_4_0= ruleDoctor )
            	    // InternalMyDsl.g:141:5: lv_doctors_4_0= ruleDoctor
            	    {

            	    					newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemAccess().getDoctorsDoctorParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_doctors_4_0=ruleDoctor();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiabetes_Prediction_SystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"doctors",
            	    						lv_doctors_4_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Doctor");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            // InternalMyDsl.g:158:3: ( (lv_patient_5_0= rulePatient ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==33) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:159:4: (lv_patient_5_0= rulePatient )
            	    {
            	    // InternalMyDsl.g:159:4: (lv_patient_5_0= rulePatient )
            	    // InternalMyDsl.g:160:5: lv_patient_5_0= rulePatient
            	    {

            	    					newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemAccess().getPatientPatientParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_patient_5_0=rulePatient();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiabetes_Prediction_SystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"patient",
            	    						lv_patient_5_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Patient");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            // InternalMyDsl.g:177:3: ( (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==42||LA5_0==44||LA5_0==46||LA5_0==48) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:178:4: (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms )
            	    {
            	    // InternalMyDsl.g:178:4: (lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms )
            	    // InternalMyDsl.g:179:5: lv_Machine_learning_Algorithms_6_0= ruleMachine_learning_Algorithms
            	    {

            	    					newCompositeNode(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsMachine_learning_AlgorithmsParserRuleCall_6_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_Machine_learning_Algorithms_6_0=ruleMachine_learning_Algorithms();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDiabetes_Prediction_SystemRule());
            	    					}
            	    					add(
            	    						current,
            	    						"Machine_learning_Algorithms",
            	    						lv_Machine_learning_Algorithms_6_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Machine_learning_Algorithms");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDiabetes_Prediction_System"


    // $ANTLR start "entryRuleMedicines"
    // InternalMyDsl.g:200:1: entryRuleMedicines returns [EObject current=null] : iv_ruleMedicines= ruleMedicines EOF ;
    public final EObject entryRuleMedicines() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMedicines = null;


        try {
            // InternalMyDsl.g:200:50: (iv_ruleMedicines= ruleMedicines EOF )
            // InternalMyDsl.g:201:2: iv_ruleMedicines= ruleMedicines EOF
            {
             newCompositeNode(grammarAccess.getMedicinesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMedicines=ruleMedicines();

            state._fsp--;

             current =iv_ruleMedicines; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMedicines"


    // $ANTLR start "ruleMedicines"
    // InternalMyDsl.g:207:1: ruleMedicines returns [EObject current=null] : (otherlv_0= 'Medicines' ( (lv_Medicine_name_1_0= RULE_ID ) ) otherlv_2= 'Medicine_dossage:' ( (lv_Medicine_dossage_3_0= RULE_STRING ) ) ) ;
    public final EObject ruleMedicines() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_Medicine_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Medicine_dossage_3_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:213:2: ( (otherlv_0= 'Medicines' ( (lv_Medicine_name_1_0= RULE_ID ) ) otherlv_2= 'Medicine_dossage:' ( (lv_Medicine_dossage_3_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:214:2: (otherlv_0= 'Medicines' ( (lv_Medicine_name_1_0= RULE_ID ) ) otherlv_2= 'Medicine_dossage:' ( (lv_Medicine_dossage_3_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:214:2: (otherlv_0= 'Medicines' ( (lv_Medicine_name_1_0= RULE_ID ) ) otherlv_2= 'Medicine_dossage:' ( (lv_Medicine_dossage_3_0= RULE_STRING ) ) )
            // InternalMyDsl.g:215:3: otherlv_0= 'Medicines' ( (lv_Medicine_name_1_0= RULE_ID ) ) otherlv_2= 'Medicine_dossage:' ( (lv_Medicine_dossage_3_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getMedicinesAccess().getMedicinesKeyword_0());
            		
            // InternalMyDsl.g:219:3: ( (lv_Medicine_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:220:4: (lv_Medicine_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:220:4: (lv_Medicine_name_1_0= RULE_ID )
            // InternalMyDsl.g:221:5: lv_Medicine_name_1_0= RULE_ID
            {
            lv_Medicine_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_Medicine_name_1_0, grammarAccess.getMedicinesAccess().getMedicine_nameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMedicinesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Medicine_name",
            						lv_Medicine_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getMedicinesAccess().getMedicine_dossageKeyword_2());
            		
            // InternalMyDsl.g:241:3: ( (lv_Medicine_dossage_3_0= RULE_STRING ) )
            // InternalMyDsl.g:242:4: (lv_Medicine_dossage_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:242:4: (lv_Medicine_dossage_3_0= RULE_STRING )
            // InternalMyDsl.g:243:5: lv_Medicine_dossage_3_0= RULE_STRING
            {
            lv_Medicine_dossage_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Medicine_dossage_3_0, grammarAccess.getMedicinesAccess().getMedicine_dossageSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMedicinesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Medicine_dossage",
            						lv_Medicine_dossage_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMedicines"


    // $ANTLR start "entryRuleSymptom"
    // InternalMyDsl.g:263:1: entryRuleSymptom returns [EObject current=null] : iv_ruleSymptom= ruleSymptom EOF ;
    public final EObject entryRuleSymptom() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSymptom = null;


        try {
            // InternalMyDsl.g:263:48: (iv_ruleSymptom= ruleSymptom EOF )
            // InternalMyDsl.g:264:2: iv_ruleSymptom= ruleSymptom EOF
            {
             newCompositeNode(grammarAccess.getSymptomRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSymptom=ruleSymptom();

            state._fsp--;

             current =iv_ruleSymptom; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSymptom"


    // $ANTLR start "ruleSymptom"
    // InternalMyDsl.g:270:1: ruleSymptom returns [EObject current=null] : (this_Polyuria_0= rulePolyuria | this_Polydipsia_1= rulePolydipsia | this_sudden_weight_loss_2= rulesudden_weight_loss | this_Polyphagia_3= rulePolyphagia | this_Genital_thrush_4= ruleGenital_thrush | this_visual_blurring_5= rulevisual_blurring | this_Itching_6= ruleItching | this_Irritability_7= ruleIrritability | this_delayed_healing_8= ruledelayed_healing | this_partial_paresis_9= rulepartial_paresis | this_muscle_stiffness_10= rulemuscle_stiffness | this_Alopecia_11= ruleAlopecia | this_Obesity_12= ruleObesity ) ;
    public final EObject ruleSymptom() throws RecognitionException {
        EObject current = null;

        EObject this_Polyuria_0 = null;

        EObject this_Polydipsia_1 = null;

        EObject this_sudden_weight_loss_2 = null;

        EObject this_Polyphagia_3 = null;

        EObject this_Genital_thrush_4 = null;

        EObject this_visual_blurring_5 = null;

        EObject this_Itching_6 = null;

        EObject this_Irritability_7 = null;

        EObject this_delayed_healing_8 = null;

        EObject this_partial_paresis_9 = null;

        EObject this_muscle_stiffness_10 = null;

        EObject this_Alopecia_11 = null;

        EObject this_Obesity_12 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:276:2: ( (this_Polyuria_0= rulePolyuria | this_Polydipsia_1= rulePolydipsia | this_sudden_weight_loss_2= rulesudden_weight_loss | this_Polyphagia_3= rulePolyphagia | this_Genital_thrush_4= ruleGenital_thrush | this_visual_blurring_5= rulevisual_blurring | this_Itching_6= ruleItching | this_Irritability_7= ruleIrritability | this_delayed_healing_8= ruledelayed_healing | this_partial_paresis_9= rulepartial_paresis | this_muscle_stiffness_10= rulemuscle_stiffness | this_Alopecia_11= ruleAlopecia | this_Obesity_12= ruleObesity ) )
            // InternalMyDsl.g:277:2: (this_Polyuria_0= rulePolyuria | this_Polydipsia_1= rulePolydipsia | this_sudden_weight_loss_2= rulesudden_weight_loss | this_Polyphagia_3= rulePolyphagia | this_Genital_thrush_4= ruleGenital_thrush | this_visual_blurring_5= rulevisual_blurring | this_Itching_6= ruleItching | this_Irritability_7= ruleIrritability | this_delayed_healing_8= ruledelayed_healing | this_partial_paresis_9= rulepartial_paresis | this_muscle_stiffness_10= rulemuscle_stiffness | this_Alopecia_11= ruleAlopecia | this_Obesity_12= ruleObesity )
            {
            // InternalMyDsl.g:277:2: (this_Polyuria_0= rulePolyuria | this_Polydipsia_1= rulePolydipsia | this_sudden_weight_loss_2= rulesudden_weight_loss | this_Polyphagia_3= rulePolyphagia | this_Genital_thrush_4= ruleGenital_thrush | this_visual_blurring_5= rulevisual_blurring | this_Itching_6= ruleItching | this_Irritability_7= ruleIrritability | this_delayed_healing_8= ruledelayed_healing | this_partial_paresis_9= rulepartial_paresis | this_muscle_stiffness_10= rulemuscle_stiffness | this_Alopecia_11= ruleAlopecia | this_Obesity_12= ruleObesity )
            int alt6=13;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt6=1;
                }
                break;
            case 16:
                {
                alt6=2;
                }
                break;
            case 17:
                {
                alt6=3;
                }
                break;
            case 18:
                {
                alt6=4;
                }
                break;
            case 19:
                {
                alt6=5;
                }
                break;
            case 20:
                {
                alt6=6;
                }
                break;
            case 21:
                {
                alt6=7;
                }
                break;
            case 22:
                {
                alt6=8;
                }
                break;
            case 23:
                {
                alt6=9;
                }
                break;
            case 24:
                {
                alt6=10;
                }
                break;
            case 25:
                {
                alt6=11;
                }
                break;
            case 26:
                {
                alt6=12;
                }
                break;
            case 27:
                {
                alt6=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:278:3: this_Polyuria_0= rulePolyuria
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getPolyuriaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polyuria_0=rulePolyuria();

                    state._fsp--;


                    			current = this_Polyuria_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:287:3: this_Polydipsia_1= rulePolydipsia
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getPolydipsiaParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polydipsia_1=rulePolydipsia();

                    state._fsp--;


                    			current = this_Polydipsia_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:296:3: this_sudden_weight_loss_2= rulesudden_weight_loss
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getSudden_weight_lossParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_sudden_weight_loss_2=rulesudden_weight_loss();

                    state._fsp--;


                    			current = this_sudden_weight_loss_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:305:3: this_Polyphagia_3= rulePolyphagia
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getPolyphagiaParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_Polyphagia_3=rulePolyphagia();

                    state._fsp--;


                    			current = this_Polyphagia_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:314:3: this_Genital_thrush_4= ruleGenital_thrush
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getGenital_thrushParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_Genital_thrush_4=ruleGenital_thrush();

                    state._fsp--;


                    			current = this_Genital_thrush_4;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:323:3: this_visual_blurring_5= rulevisual_blurring
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getVisual_blurringParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_visual_blurring_5=rulevisual_blurring();

                    state._fsp--;


                    			current = this_visual_blurring_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:332:3: this_Itching_6= ruleItching
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getItchingParserRuleCall_6());
                    		
                    pushFollow(FOLLOW_2);
                    this_Itching_6=ruleItching();

                    state._fsp--;


                    			current = this_Itching_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:341:3: this_Irritability_7= ruleIrritability
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getIrritabilityParserRuleCall_7());
                    		
                    pushFollow(FOLLOW_2);
                    this_Irritability_7=ruleIrritability();

                    state._fsp--;


                    			current = this_Irritability_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:350:3: this_delayed_healing_8= ruledelayed_healing
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getDelayed_healingParserRuleCall_8());
                    		
                    pushFollow(FOLLOW_2);
                    this_delayed_healing_8=ruledelayed_healing();

                    state._fsp--;


                    			current = this_delayed_healing_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:359:3: this_partial_paresis_9= rulepartial_paresis
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getPartial_paresisParserRuleCall_9());
                    		
                    pushFollow(FOLLOW_2);
                    this_partial_paresis_9=rulepartial_paresis();

                    state._fsp--;


                    			current = this_partial_paresis_9;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:368:3: this_muscle_stiffness_10= rulemuscle_stiffness
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getMuscle_stiffnessParserRuleCall_10());
                    		
                    pushFollow(FOLLOW_2);
                    this_muscle_stiffness_10=rulemuscle_stiffness();

                    state._fsp--;


                    			current = this_muscle_stiffness_10;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:377:3: this_Alopecia_11= ruleAlopecia
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getAlopeciaParserRuleCall_11());
                    		
                    pushFollow(FOLLOW_2);
                    this_Alopecia_11=ruleAlopecia();

                    state._fsp--;


                    			current = this_Alopecia_11;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:386:3: this_Obesity_12= ruleObesity
                    {

                    			newCompositeNode(grammarAccess.getSymptomAccess().getObesityParserRuleCall_12());
                    		
                    pushFollow(FOLLOW_2);
                    this_Obesity_12=ruleObesity();

                    state._fsp--;


                    			current = this_Obesity_12;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSymptom"


    // $ANTLR start "entryRulePolyuria"
    // InternalMyDsl.g:398:1: entryRulePolyuria returns [EObject current=null] : iv_rulePolyuria= rulePolyuria EOF ;
    public final EObject entryRulePolyuria() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyuria = null;


        try {
            // InternalMyDsl.g:398:49: (iv_rulePolyuria= rulePolyuria EOF )
            // InternalMyDsl.g:399:2: iv_rulePolyuria= rulePolyuria EOF
            {
             newCompositeNode(grammarAccess.getPolyuriaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyuria=rulePolyuria();

            state._fsp--;

             current =iv_rulePolyuria; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyuria"


    // $ANTLR start "rulePolyuria"
    // InternalMyDsl.g:405:1: rulePolyuria returns [EObject current=null] : (otherlv_0= 'Polyuria' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePolyuria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:411:2: ( (otherlv_0= 'Polyuria' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:412:2: (otherlv_0= 'Polyuria' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:412:2: (otherlv_0= 'Polyuria' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:413:3: otherlv_0= 'Polyuria' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyuriaAccess().getPolyuriaKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyuriaAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:421:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:422:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:422:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:423:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPolyuriaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyuriaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyuria"


    // $ANTLR start "entryRulePolydipsia"
    // InternalMyDsl.g:443:1: entryRulePolydipsia returns [EObject current=null] : iv_rulePolydipsia= rulePolydipsia EOF ;
    public final EObject entryRulePolydipsia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolydipsia = null;


        try {
            // InternalMyDsl.g:443:51: (iv_rulePolydipsia= rulePolydipsia EOF )
            // InternalMyDsl.g:444:2: iv_rulePolydipsia= rulePolydipsia EOF
            {
             newCompositeNode(grammarAccess.getPolydipsiaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolydipsia=rulePolydipsia();

            state._fsp--;

             current =iv_rulePolydipsia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolydipsia"


    // $ANTLR start "rulePolydipsia"
    // InternalMyDsl.g:450:1: rulePolydipsia returns [EObject current=null] : (otherlv_0= 'Polydipsia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePolydipsia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:456:2: ( (otherlv_0= 'Polydipsia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:457:2: (otherlv_0= 'Polydipsia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:457:2: (otherlv_0= 'Polydipsia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:458:3: otherlv_0= 'Polydipsia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPolydipsiaAccess().getPolydipsiaKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPolydipsiaAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:466:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:467:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:467:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:468:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPolydipsiaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolydipsiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolydipsia"


    // $ANTLR start "entryRulesudden_weight_loss"
    // InternalMyDsl.g:488:1: entryRulesudden_weight_loss returns [EObject current=null] : iv_rulesudden_weight_loss= rulesudden_weight_loss EOF ;
    public final EObject entryRulesudden_weight_loss() throws RecognitionException {
        EObject current = null;

        EObject iv_rulesudden_weight_loss = null;


        try {
            // InternalMyDsl.g:488:59: (iv_rulesudden_weight_loss= rulesudden_weight_loss EOF )
            // InternalMyDsl.g:489:2: iv_rulesudden_weight_loss= rulesudden_weight_loss EOF
            {
             newCompositeNode(grammarAccess.getSudden_weight_lossRule()); 
            pushFollow(FOLLOW_1);
            iv_rulesudden_weight_loss=rulesudden_weight_loss();

            state._fsp--;

             current =iv_rulesudden_weight_loss; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulesudden_weight_loss"


    // $ANTLR start "rulesudden_weight_loss"
    // InternalMyDsl.g:495:1: rulesudden_weight_loss returns [EObject current=null] : (otherlv_0= 'sudden_weight_loss' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulesudden_weight_loss() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:501:2: ( (otherlv_0= 'sudden_weight_loss' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:502:2: (otherlv_0= 'sudden_weight_loss' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:502:2: (otherlv_0= 'sudden_weight_loss' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:503:3: otherlv_0= 'sudden_weight_loss' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSudden_weight_lossAccess().getSudden_weight_lossKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getSudden_weight_lossAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:511:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:512:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:512:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:513:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getSudden_weight_lossAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSudden_weight_lossRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulesudden_weight_loss"


    // $ANTLR start "entryRulePolyphagia"
    // InternalMyDsl.g:533:1: entryRulePolyphagia returns [EObject current=null] : iv_rulePolyphagia= rulePolyphagia EOF ;
    public final EObject entryRulePolyphagia() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePolyphagia = null;


        try {
            // InternalMyDsl.g:533:51: (iv_rulePolyphagia= rulePolyphagia EOF )
            // InternalMyDsl.g:534:2: iv_rulePolyphagia= rulePolyphagia EOF
            {
             newCompositeNode(grammarAccess.getPolyphagiaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePolyphagia=rulePolyphagia();

            state._fsp--;

             current =iv_rulePolyphagia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePolyphagia"


    // $ANTLR start "rulePolyphagia"
    // InternalMyDsl.g:540:1: rulePolyphagia returns [EObject current=null] : (otherlv_0= 'Polyphagia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulePolyphagia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:546:2: ( (otherlv_0= 'Polyphagia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:547:2: (otherlv_0= 'Polyphagia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:547:2: (otherlv_0= 'Polyphagia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:548:3: otherlv_0= 'Polyphagia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPolyphagiaAccess().getPolyphagiaKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPolyphagiaAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:556:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:557:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:557:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:558:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPolyphagiaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPolyphagiaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePolyphagia"


    // $ANTLR start "entryRuleGenital_thrush"
    // InternalMyDsl.g:578:1: entryRuleGenital_thrush returns [EObject current=null] : iv_ruleGenital_thrush= ruleGenital_thrush EOF ;
    public final EObject entryRuleGenital_thrush() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGenital_thrush = null;


        try {
            // InternalMyDsl.g:578:55: (iv_ruleGenital_thrush= ruleGenital_thrush EOF )
            // InternalMyDsl.g:579:2: iv_ruleGenital_thrush= ruleGenital_thrush EOF
            {
             newCompositeNode(grammarAccess.getGenital_thrushRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGenital_thrush=ruleGenital_thrush();

            state._fsp--;

             current =iv_ruleGenital_thrush; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGenital_thrush"


    // $ANTLR start "ruleGenital_thrush"
    // InternalMyDsl.g:585:1: ruleGenital_thrush returns [EObject current=null] : (otherlv_0= 'Genital_thrush' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleGenital_thrush() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:591:2: ( (otherlv_0= 'Genital_thrush' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:592:2: (otherlv_0= 'Genital_thrush' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:592:2: (otherlv_0= 'Genital_thrush' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:593:3: otherlv_0= 'Genital_thrush' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getGenital_thrushAccess().getGenital_thrushKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getGenital_thrushAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:601:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:602:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:602:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:603:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getGenital_thrushAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGenital_thrushRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGenital_thrush"


    // $ANTLR start "entryRulevisual_blurring"
    // InternalMyDsl.g:623:1: entryRulevisual_blurring returns [EObject current=null] : iv_rulevisual_blurring= rulevisual_blurring EOF ;
    public final EObject entryRulevisual_blurring() throws RecognitionException {
        EObject current = null;

        EObject iv_rulevisual_blurring = null;


        try {
            // InternalMyDsl.g:623:56: (iv_rulevisual_blurring= rulevisual_blurring EOF )
            // InternalMyDsl.g:624:2: iv_rulevisual_blurring= rulevisual_blurring EOF
            {
             newCompositeNode(grammarAccess.getVisual_blurringRule()); 
            pushFollow(FOLLOW_1);
            iv_rulevisual_blurring=rulevisual_blurring();

            state._fsp--;

             current =iv_rulevisual_blurring; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulevisual_blurring"


    // $ANTLR start "rulevisual_blurring"
    // InternalMyDsl.g:630:1: rulevisual_blurring returns [EObject current=null] : (otherlv_0= 'visual_blurring' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulevisual_blurring() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:636:2: ( (otherlv_0= 'visual_blurring' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:637:2: (otherlv_0= 'visual_blurring' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:637:2: (otherlv_0= 'visual_blurring' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:638:3: otherlv_0= 'visual_blurring' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,20,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getVisual_blurringAccess().getVisual_blurringKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getVisual_blurringAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:646:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:647:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:647:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:648:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getVisual_blurringAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVisual_blurringRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulevisual_blurring"


    // $ANTLR start "entryRuleItching"
    // InternalMyDsl.g:668:1: entryRuleItching returns [EObject current=null] : iv_ruleItching= ruleItching EOF ;
    public final EObject entryRuleItching() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleItching = null;


        try {
            // InternalMyDsl.g:668:48: (iv_ruleItching= ruleItching EOF )
            // InternalMyDsl.g:669:2: iv_ruleItching= ruleItching EOF
            {
             newCompositeNode(grammarAccess.getItchingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleItching=ruleItching();

            state._fsp--;

             current =iv_ruleItching; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleItching"


    // $ANTLR start "ruleItching"
    // InternalMyDsl.g:675:1: ruleItching returns [EObject current=null] : (otherlv_0= 'Itching' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleItching() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:681:2: ( (otherlv_0= 'Itching' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:682:2: (otherlv_0= 'Itching' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:682:2: (otherlv_0= 'Itching' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:683:3: otherlv_0= 'Itching' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,21,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getItchingAccess().getItchingKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getItchingAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:691:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:692:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:692:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:693:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getItchingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getItchingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleItching"


    // $ANTLR start "entryRuleIrritability"
    // InternalMyDsl.g:713:1: entryRuleIrritability returns [EObject current=null] : iv_ruleIrritability= ruleIrritability EOF ;
    public final EObject entryRuleIrritability() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIrritability = null;


        try {
            // InternalMyDsl.g:713:53: (iv_ruleIrritability= ruleIrritability EOF )
            // InternalMyDsl.g:714:2: iv_ruleIrritability= ruleIrritability EOF
            {
             newCompositeNode(grammarAccess.getIrritabilityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleIrritability=ruleIrritability();

            state._fsp--;

             current =iv_ruleIrritability; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleIrritability"


    // $ANTLR start "ruleIrritability"
    // InternalMyDsl.g:720:1: ruleIrritability returns [EObject current=null] : (otherlv_0= 'Irritability' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleIrritability() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:726:2: ( (otherlv_0= 'Irritability' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:727:2: (otherlv_0= 'Irritability' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:727:2: (otherlv_0= 'Irritability' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:728:3: otherlv_0= 'Irritability' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getIrritabilityAccess().getIrritabilityKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getIrritabilityAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:736:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:737:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:737:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:738:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getIrritabilityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getIrritabilityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleIrritability"


    // $ANTLR start "entryRuledelayed_healing"
    // InternalMyDsl.g:758:1: entryRuledelayed_healing returns [EObject current=null] : iv_ruledelayed_healing= ruledelayed_healing EOF ;
    public final EObject entryRuledelayed_healing() throws RecognitionException {
        EObject current = null;

        EObject iv_ruledelayed_healing = null;


        try {
            // InternalMyDsl.g:758:56: (iv_ruledelayed_healing= ruledelayed_healing EOF )
            // InternalMyDsl.g:759:2: iv_ruledelayed_healing= ruledelayed_healing EOF
            {
             newCompositeNode(grammarAccess.getDelayed_healingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruledelayed_healing=ruledelayed_healing();

            state._fsp--;

             current =iv_ruledelayed_healing; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuledelayed_healing"


    // $ANTLR start "ruledelayed_healing"
    // InternalMyDsl.g:765:1: ruledelayed_healing returns [EObject current=null] : (otherlv_0= 'delayed_healing' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruledelayed_healing() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:771:2: ( (otherlv_0= 'delayed_healing' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:772:2: (otherlv_0= 'delayed_healing' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:772:2: (otherlv_0= 'delayed_healing' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:773:3: otherlv_0= 'delayed_healing' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getDelayed_healingAccess().getDelayed_healingKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDelayed_healingAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:781:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:782:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:782:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:783:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getDelayed_healingAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDelayed_healingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruledelayed_healing"


    // $ANTLR start "entryRulepartial_paresis"
    // InternalMyDsl.g:803:1: entryRulepartial_paresis returns [EObject current=null] : iv_rulepartial_paresis= rulepartial_paresis EOF ;
    public final EObject entryRulepartial_paresis() throws RecognitionException {
        EObject current = null;

        EObject iv_rulepartial_paresis = null;


        try {
            // InternalMyDsl.g:803:56: (iv_rulepartial_paresis= rulepartial_paresis EOF )
            // InternalMyDsl.g:804:2: iv_rulepartial_paresis= rulepartial_paresis EOF
            {
             newCompositeNode(grammarAccess.getPartial_paresisRule()); 
            pushFollow(FOLLOW_1);
            iv_rulepartial_paresis=rulepartial_paresis();

            state._fsp--;

             current =iv_rulepartial_paresis; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulepartial_paresis"


    // $ANTLR start "rulepartial_paresis"
    // InternalMyDsl.g:810:1: rulepartial_paresis returns [EObject current=null] : (otherlv_0= 'partial_paresis' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulepartial_paresis() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:816:2: ( (otherlv_0= 'partial_paresis' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:817:2: (otherlv_0= 'partial_paresis' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:817:2: (otherlv_0= 'partial_paresis' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:818:3: otherlv_0= 'partial_paresis' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPartial_paresisAccess().getPartial_paresisKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPartial_paresisAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:826:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:827:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:827:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:828:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getPartial_paresisAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPartial_paresisRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulepartial_paresis"


    // $ANTLR start "entryRulemuscle_stiffness"
    // InternalMyDsl.g:848:1: entryRulemuscle_stiffness returns [EObject current=null] : iv_rulemuscle_stiffness= rulemuscle_stiffness EOF ;
    public final EObject entryRulemuscle_stiffness() throws RecognitionException {
        EObject current = null;

        EObject iv_rulemuscle_stiffness = null;


        try {
            // InternalMyDsl.g:848:57: (iv_rulemuscle_stiffness= rulemuscle_stiffness EOF )
            // InternalMyDsl.g:849:2: iv_rulemuscle_stiffness= rulemuscle_stiffness EOF
            {
             newCompositeNode(grammarAccess.getMuscle_stiffnessRule()); 
            pushFollow(FOLLOW_1);
            iv_rulemuscle_stiffness=rulemuscle_stiffness();

            state._fsp--;

             current =iv_rulemuscle_stiffness; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulemuscle_stiffness"


    // $ANTLR start "rulemuscle_stiffness"
    // InternalMyDsl.g:855:1: rulemuscle_stiffness returns [EObject current=null] : (otherlv_0= 'muscle_stiffness' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject rulemuscle_stiffness() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:861:2: ( (otherlv_0= 'muscle_stiffness' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:862:2: (otherlv_0= 'muscle_stiffness' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:862:2: (otherlv_0= 'muscle_stiffness' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:863:3: otherlv_0= 'muscle_stiffness' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getMuscle_stiffnessAccess().getMuscle_stiffnessKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getMuscle_stiffnessAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:871:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:872:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:872:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:873:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getMuscle_stiffnessAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMuscle_stiffnessRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulemuscle_stiffness"


    // $ANTLR start "entryRuleAlopecia"
    // InternalMyDsl.g:893:1: entryRuleAlopecia returns [EObject current=null] : iv_ruleAlopecia= ruleAlopecia EOF ;
    public final EObject entryRuleAlopecia() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlopecia = null;


        try {
            // InternalMyDsl.g:893:49: (iv_ruleAlopecia= ruleAlopecia EOF )
            // InternalMyDsl.g:894:2: iv_ruleAlopecia= ruleAlopecia EOF
            {
             newCompositeNode(grammarAccess.getAlopeciaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlopecia=ruleAlopecia();

            state._fsp--;

             current =iv_ruleAlopecia; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlopecia"


    // $ANTLR start "ruleAlopecia"
    // InternalMyDsl.g:900:1: ruleAlopecia returns [EObject current=null] : (otherlv_0= 'Alopecia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleAlopecia() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:906:2: ( (otherlv_0= 'Alopecia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:907:2: (otherlv_0= 'Alopecia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:907:2: (otherlv_0= 'Alopecia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:908:3: otherlv_0= 'Alopecia' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getAlopeciaAccess().getAlopeciaKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAlopeciaAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:916:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:917:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:917:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:918:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getAlopeciaAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlopeciaRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlopecia"


    // $ANTLR start "entryRuleObesity"
    // InternalMyDsl.g:938:1: entryRuleObesity returns [EObject current=null] : iv_ruleObesity= ruleObesity EOF ;
    public final EObject entryRuleObesity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleObesity = null;


        try {
            // InternalMyDsl.g:938:48: (iv_ruleObesity= ruleObesity EOF )
            // InternalMyDsl.g:939:2: iv_ruleObesity= ruleObesity EOF
            {
             newCompositeNode(grammarAccess.getObesityRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleObesity=ruleObesity();

            state._fsp--;

             current =iv_ruleObesity; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleObesity"


    // $ANTLR start "ruleObesity"
    // InternalMyDsl.g:945:1: ruleObesity returns [EObject current=null] : (otherlv_0= 'Obesity' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) ;
    public final EObject ruleObesity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:951:2: ( (otherlv_0= 'Obesity' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) ) )
            // InternalMyDsl.g:952:2: (otherlv_0= 'Obesity' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            {
            // InternalMyDsl.g:952:2: (otherlv_0= 'Obesity' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) ) )
            // InternalMyDsl.g:953:3: otherlv_0= 'Obesity' otherlv_1= 'name:' ( (lv_name_2_0= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getObesityAccess().getObesityKeyword_0());
            		
            otherlv_1=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getObesityAccess().getNameKeyword_1());
            		
            // InternalMyDsl.g:961:3: ( (lv_name_2_0= RULE_ID ) )
            // InternalMyDsl.g:962:4: (lv_name_2_0= RULE_ID )
            {
            // InternalMyDsl.g:962:4: (lv_name_2_0= RULE_ID )
            // InternalMyDsl.g:963:5: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(lv_name_2_0, grammarAccess.getObesityAccess().getNameIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getObesityRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleObesity"


    // $ANTLR start "entryRuleSugar_Test"
    // InternalMyDsl.g:983:1: entryRuleSugar_Test returns [EObject current=null] : iv_ruleSugar_Test= ruleSugar_Test EOF ;
    public final EObject entryRuleSugar_Test() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSugar_Test = null;


        try {
            // InternalMyDsl.g:983:51: (iv_ruleSugar_Test= ruleSugar_Test EOF )
            // InternalMyDsl.g:984:2: iv_ruleSugar_Test= ruleSugar_Test EOF
            {
             newCompositeNode(grammarAccess.getSugar_TestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSugar_Test=ruleSugar_Test();

            state._fsp--;

             current =iv_ruleSugar_Test; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSugar_Test"


    // $ANTLR start "ruleSugar_Test"
    // InternalMyDsl.g:990:1: ruleSugar_Test returns [EObject current=null] : (otherlv_0= 'Sugar_test' otherlv_1= 'Previous_blood_sugar' ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) ) otherlv_3= 'Current_blood_sugar' ( (lv_Current_blood_sugar_4_0= RULE_STRING ) ) ) ;
    public final EObject ruleSugar_Test() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Previous_blood_sugar_2_0=null;
        Token otherlv_3=null;
        Token lv_Current_blood_sugar_4_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:996:2: ( (otherlv_0= 'Sugar_test' otherlv_1= 'Previous_blood_sugar' ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) ) otherlv_3= 'Current_blood_sugar' ( (lv_Current_blood_sugar_4_0= RULE_STRING ) ) ) )
            // InternalMyDsl.g:997:2: (otherlv_0= 'Sugar_test' otherlv_1= 'Previous_blood_sugar' ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) ) otherlv_3= 'Current_blood_sugar' ( (lv_Current_blood_sugar_4_0= RULE_STRING ) ) )
            {
            // InternalMyDsl.g:997:2: (otherlv_0= 'Sugar_test' otherlv_1= 'Previous_blood_sugar' ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) ) otherlv_3= 'Current_blood_sugar' ( (lv_Current_blood_sugar_4_0= RULE_STRING ) ) )
            // InternalMyDsl.g:998:3: otherlv_0= 'Sugar_test' otherlv_1= 'Previous_blood_sugar' ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) ) otherlv_3= 'Current_blood_sugar' ( (lv_Current_blood_sugar_4_0= RULE_STRING ) )
            {
            otherlv_0=(Token)match(input,28,FOLLOW_9); 

            			newLeafNode(otherlv_0, grammarAccess.getSugar_TestAccess().getSugar_testKeyword_0());
            		
            otherlv_1=(Token)match(input,29,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarKeyword_1());
            		
            // InternalMyDsl.g:1006:3: ( (lv_Previous_blood_sugar_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1007:4: (lv_Previous_blood_sugar_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1007:4: (lv_Previous_blood_sugar_2_0= RULE_STRING )
            // InternalMyDsl.g:1008:5: lv_Previous_blood_sugar_2_0= RULE_STRING
            {
            lv_Previous_blood_sugar_2_0=(Token)match(input,RULE_STRING,FOLLOW_10); 

            					newLeafNode(lv_Previous_blood_sugar_2_0, grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSugar_TestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Previous_blood_sugar",
            						lv_Previous_blood_sugar_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarKeyword_3());
            		
            // InternalMyDsl.g:1028:3: ( (lv_Current_blood_sugar_4_0= RULE_STRING ) )
            // InternalMyDsl.g:1029:4: (lv_Current_blood_sugar_4_0= RULE_STRING )
            {
            // InternalMyDsl.g:1029:4: (lv_Current_blood_sugar_4_0= RULE_STRING )
            // InternalMyDsl.g:1030:5: lv_Current_blood_sugar_4_0= RULE_STRING
            {
            lv_Current_blood_sugar_4_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_Current_blood_sugar_4_0, grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSugar_TestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Current_blood_sugar",
            						lv_Current_blood_sugar_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSugar_Test"


    // $ANTLR start "entryRuleDoctor"
    // InternalMyDsl.g:1050:1: entryRuleDoctor returns [EObject current=null] : iv_ruleDoctor= ruleDoctor EOF ;
    public final EObject entryRuleDoctor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDoctor = null;


        try {
            // InternalMyDsl.g:1050:47: (iv_ruleDoctor= ruleDoctor EOF )
            // InternalMyDsl.g:1051:2: iv_ruleDoctor= ruleDoctor EOF
            {
             newCompositeNode(grammarAccess.getDoctorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDoctor=ruleDoctor();

            state._fsp--;

             current =iv_ruleDoctor; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDoctor"


    // $ANTLR start "ruleDoctor"
    // InternalMyDsl.g:1057:1: ruleDoctor returns [EObject current=null] : (otherlv_0= 'Doctor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Doctor_specailization' ( (lv_Doctor_specailization_3_0= RULE_STRING ) ) ( (lv_medicines_4_0= ruleMedicines ) )* ( (lv_symptoms_5_0= ruleSymptom ) )* ) ;
    public final EObject ruleDoctor() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Doctor_specailization_3_0=null;
        EObject lv_medicines_4_0 = null;

        EObject lv_symptoms_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1063:2: ( (otherlv_0= 'Doctor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Doctor_specailization' ( (lv_Doctor_specailization_3_0= RULE_STRING ) ) ( (lv_medicines_4_0= ruleMedicines ) )* ( (lv_symptoms_5_0= ruleSymptom ) )* ) )
            // InternalMyDsl.g:1064:2: (otherlv_0= 'Doctor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Doctor_specailization' ( (lv_Doctor_specailization_3_0= RULE_STRING ) ) ( (lv_medicines_4_0= ruleMedicines ) )* ( (lv_symptoms_5_0= ruleSymptom ) )* )
            {
            // InternalMyDsl.g:1064:2: (otherlv_0= 'Doctor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Doctor_specailization' ( (lv_Doctor_specailization_3_0= RULE_STRING ) ) ( (lv_medicines_4_0= ruleMedicines ) )* ( (lv_symptoms_5_0= ruleSymptom ) )* )
            // InternalMyDsl.g:1065:3: otherlv_0= 'Doctor' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Doctor_specailization' ( (lv_Doctor_specailization_3_0= RULE_STRING ) ) ( (lv_medicines_4_0= ruleMedicines ) )* ( (lv_symptoms_5_0= ruleSymptom ) )*
            {
            otherlv_0=(Token)match(input,31,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDoctorAccess().getDoctorKeyword_0());
            		
            // InternalMyDsl.g:1069:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1070:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1070:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1071:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_11); 

            					newLeafNode(lv_name_1_0, grammarAccess.getDoctorAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoctorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,32,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getDoctorAccess().getDoctor_specailizationKeyword_2());
            		
            // InternalMyDsl.g:1091:3: ( (lv_Doctor_specailization_3_0= RULE_STRING ) )
            // InternalMyDsl.g:1092:4: (lv_Doctor_specailization_3_0= RULE_STRING )
            {
            // InternalMyDsl.g:1092:4: (lv_Doctor_specailization_3_0= RULE_STRING )
            // InternalMyDsl.g:1093:5: lv_Doctor_specailization_3_0= RULE_STRING
            {
            lv_Doctor_specailization_3_0=(Token)match(input,RULE_STRING,FOLLOW_12); 

            					newLeafNode(lv_Doctor_specailization_3_0, grammarAccess.getDoctorAccess().getDoctor_specailizationSTRINGTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getDoctorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Doctor_specailization",
            						lv_Doctor_specailization_3_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1109:3: ( (lv_medicines_4_0= ruleMedicines ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==12) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:1110:4: (lv_medicines_4_0= ruleMedicines )
            	    {
            	    // InternalMyDsl.g:1110:4: (lv_medicines_4_0= ruleMedicines )
            	    // InternalMyDsl.g:1111:5: lv_medicines_4_0= ruleMedicines
            	    {

            	    					newCompositeNode(grammarAccess.getDoctorAccess().getMedicinesMedicinesParserRuleCall_4_0());
            	    				
            	    pushFollow(FOLLOW_12);
            	    lv_medicines_4_0=ruleMedicines();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoctorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"medicines",
            	    						lv_medicines_4_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Medicines");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            // InternalMyDsl.g:1128:3: ( (lv_symptoms_5_0= ruleSymptom ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==14||(LA8_0>=16 && LA8_0<=27)) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:1129:4: (lv_symptoms_5_0= ruleSymptom )
            	    {
            	    // InternalMyDsl.g:1129:4: (lv_symptoms_5_0= ruleSymptom )
            	    // InternalMyDsl.g:1130:5: lv_symptoms_5_0= ruleSymptom
            	    {

            	    					newCompositeNode(grammarAccess.getDoctorAccess().getSymptomsSymptomParserRuleCall_5_0());
            	    				
            	    pushFollow(FOLLOW_13);
            	    lv_symptoms_5_0=ruleSymptom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getDoctorRule());
            	    					}
            	    					add(
            	    						current,
            	    						"symptoms",
            	    						lv_symptoms_5_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Symptom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDoctor"


    // $ANTLR start "entryRulePatient"
    // InternalMyDsl.g:1151:1: entryRulePatient returns [EObject current=null] : iv_rulePatient= rulePatient EOF ;
    public final EObject entryRulePatient() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePatient = null;


        try {
            // InternalMyDsl.g:1151:48: (iv_rulePatient= rulePatient EOF )
            // InternalMyDsl.g:1152:2: iv_rulePatient= rulePatient EOF
            {
             newCompositeNode(grammarAccess.getPatientRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePatient=rulePatient();

            state._fsp--;

             current =iv_rulePatient; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePatient"


    // $ANTLR start "rulePatient"
    // InternalMyDsl.g:1158:1: rulePatient returns [EObject current=null] : (otherlv_0= 'Patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Patient_Gender' ( (lv_Patient_Gender_3_0= RULE_ID ) ) otherlv_4= 'Patient_Age' ( (lv_Patient_Age_5_0= RULE_INT ) ) otherlv_6= 'Patient_Height' ( (lv_Patient_Height_7_0= RULE_STRING ) ) otherlv_8= 'Patient_Weight' ( (lv_Patient_Weight_9_0= RULE_STRING ) ) otherlv_10= 'patients_blood_pressure' ( (lv_patient_blood_pressure_11_0= RULE_INT ) ) otherlv_12= 'pulse_rate' ( (lv_pulse_rate_13_0= RULE_INT ) ) ( (lv_symptoms_14_0= ruleSymptom ) )+ ( (lv_medicines_15_0= ruleMedicines ) )* ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+ otherlv_17= 'doctor' ( (otherlv_18= RULE_ID ) )+ ) ;
    public final EObject rulePatient() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token lv_Patient_Gender_3_0=null;
        Token otherlv_4=null;
        Token lv_Patient_Age_5_0=null;
        Token otherlv_6=null;
        Token lv_Patient_Height_7_0=null;
        Token otherlv_8=null;
        Token lv_Patient_Weight_9_0=null;
        Token otherlv_10=null;
        Token lv_patient_blood_pressure_11_0=null;
        Token otherlv_12=null;
        Token lv_pulse_rate_13_0=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        EObject lv_symptoms_14_0 = null;

        EObject lv_medicines_15_0 = null;

        EObject lv_sugar_tests_16_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1164:2: ( (otherlv_0= 'Patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Patient_Gender' ( (lv_Patient_Gender_3_0= RULE_ID ) ) otherlv_4= 'Patient_Age' ( (lv_Patient_Age_5_0= RULE_INT ) ) otherlv_6= 'Patient_Height' ( (lv_Patient_Height_7_0= RULE_STRING ) ) otherlv_8= 'Patient_Weight' ( (lv_Patient_Weight_9_0= RULE_STRING ) ) otherlv_10= 'patients_blood_pressure' ( (lv_patient_blood_pressure_11_0= RULE_INT ) ) otherlv_12= 'pulse_rate' ( (lv_pulse_rate_13_0= RULE_INT ) ) ( (lv_symptoms_14_0= ruleSymptom ) )+ ( (lv_medicines_15_0= ruleMedicines ) )* ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+ otherlv_17= 'doctor' ( (otherlv_18= RULE_ID ) )+ ) )
            // InternalMyDsl.g:1165:2: (otherlv_0= 'Patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Patient_Gender' ( (lv_Patient_Gender_3_0= RULE_ID ) ) otherlv_4= 'Patient_Age' ( (lv_Patient_Age_5_0= RULE_INT ) ) otherlv_6= 'Patient_Height' ( (lv_Patient_Height_7_0= RULE_STRING ) ) otherlv_8= 'Patient_Weight' ( (lv_Patient_Weight_9_0= RULE_STRING ) ) otherlv_10= 'patients_blood_pressure' ( (lv_patient_blood_pressure_11_0= RULE_INT ) ) otherlv_12= 'pulse_rate' ( (lv_pulse_rate_13_0= RULE_INT ) ) ( (lv_symptoms_14_0= ruleSymptom ) )+ ( (lv_medicines_15_0= ruleMedicines ) )* ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+ otherlv_17= 'doctor' ( (otherlv_18= RULE_ID ) )+ )
            {
            // InternalMyDsl.g:1165:2: (otherlv_0= 'Patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Patient_Gender' ( (lv_Patient_Gender_3_0= RULE_ID ) ) otherlv_4= 'Patient_Age' ( (lv_Patient_Age_5_0= RULE_INT ) ) otherlv_6= 'Patient_Height' ( (lv_Patient_Height_7_0= RULE_STRING ) ) otherlv_8= 'Patient_Weight' ( (lv_Patient_Weight_9_0= RULE_STRING ) ) otherlv_10= 'patients_blood_pressure' ( (lv_patient_blood_pressure_11_0= RULE_INT ) ) otherlv_12= 'pulse_rate' ( (lv_pulse_rate_13_0= RULE_INT ) ) ( (lv_symptoms_14_0= ruleSymptom ) )+ ( (lv_medicines_15_0= ruleMedicines ) )* ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+ otherlv_17= 'doctor' ( (otherlv_18= RULE_ID ) )+ )
            // InternalMyDsl.g:1166:3: otherlv_0= 'Patient' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= 'Patient_Gender' ( (lv_Patient_Gender_3_0= RULE_ID ) ) otherlv_4= 'Patient_Age' ( (lv_Patient_Age_5_0= RULE_INT ) ) otherlv_6= 'Patient_Height' ( (lv_Patient_Height_7_0= RULE_STRING ) ) otherlv_8= 'Patient_Weight' ( (lv_Patient_Weight_9_0= RULE_STRING ) ) otherlv_10= 'patients_blood_pressure' ( (lv_patient_blood_pressure_11_0= RULE_INT ) ) otherlv_12= 'pulse_rate' ( (lv_pulse_rate_13_0= RULE_INT ) ) ( (lv_symptoms_14_0= ruleSymptom ) )+ ( (lv_medicines_15_0= ruleMedicines ) )* ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+ otherlv_17= 'doctor' ( (otherlv_18= RULE_ID ) )+
            {
            otherlv_0=(Token)match(input,33,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getPatientAccess().getPatientKeyword_0());
            		
            // InternalMyDsl.g:1170:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:1171:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:1171:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:1172:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_14); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,34,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getPatientAccess().getPatient_GenderKeyword_2());
            		
            // InternalMyDsl.g:1192:3: ( (lv_Patient_Gender_3_0= RULE_ID ) )
            // InternalMyDsl.g:1193:4: (lv_Patient_Gender_3_0= RULE_ID )
            {
            // InternalMyDsl.g:1193:4: (lv_Patient_Gender_3_0= RULE_ID )
            // InternalMyDsl.g:1194:5: lv_Patient_Gender_3_0= RULE_ID
            {
            lv_Patient_Gender_3_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_Patient_Gender_3_0, grammarAccess.getPatientAccess().getPatient_GenderIDTerminalRuleCall_3_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Patient_Gender",
            						lv_Patient_Gender_3_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_4=(Token)match(input,35,FOLLOW_16); 

            			newLeafNode(otherlv_4, grammarAccess.getPatientAccess().getPatient_AgeKeyword_4());
            		
            // InternalMyDsl.g:1214:3: ( (lv_Patient_Age_5_0= RULE_INT ) )
            // InternalMyDsl.g:1215:4: (lv_Patient_Age_5_0= RULE_INT )
            {
            // InternalMyDsl.g:1215:4: (lv_Patient_Age_5_0= RULE_INT )
            // InternalMyDsl.g:1216:5: lv_Patient_Age_5_0= RULE_INT
            {
            lv_Patient_Age_5_0=(Token)match(input,RULE_INT,FOLLOW_17); 

            					newLeafNode(lv_Patient_Age_5_0, grammarAccess.getPatientAccess().getPatient_AgeINTTerminalRuleCall_5_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Patient_Age",
            						lv_Patient_Age_5_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_6=(Token)match(input,36,FOLLOW_7); 

            			newLeafNode(otherlv_6, grammarAccess.getPatientAccess().getPatient_HeightKeyword_6());
            		
            // InternalMyDsl.g:1236:3: ( (lv_Patient_Height_7_0= RULE_STRING ) )
            // InternalMyDsl.g:1237:4: (lv_Patient_Height_7_0= RULE_STRING )
            {
            // InternalMyDsl.g:1237:4: (lv_Patient_Height_7_0= RULE_STRING )
            // InternalMyDsl.g:1238:5: lv_Patient_Height_7_0= RULE_STRING
            {
            lv_Patient_Height_7_0=(Token)match(input,RULE_STRING,FOLLOW_18); 

            					newLeafNode(lv_Patient_Height_7_0, grammarAccess.getPatientAccess().getPatient_HeightSTRINGTerminalRuleCall_7_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Patient_Height",
            						lv_Patient_Height_7_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_8=(Token)match(input,37,FOLLOW_7); 

            			newLeafNode(otherlv_8, grammarAccess.getPatientAccess().getPatient_WeightKeyword_8());
            		
            // InternalMyDsl.g:1258:3: ( (lv_Patient_Weight_9_0= RULE_STRING ) )
            // InternalMyDsl.g:1259:4: (lv_Patient_Weight_9_0= RULE_STRING )
            {
            // InternalMyDsl.g:1259:4: (lv_Patient_Weight_9_0= RULE_STRING )
            // InternalMyDsl.g:1260:5: lv_Patient_Weight_9_0= RULE_STRING
            {
            lv_Patient_Weight_9_0=(Token)match(input,RULE_STRING,FOLLOW_19); 

            					newLeafNode(lv_Patient_Weight_9_0, grammarAccess.getPatientAccess().getPatient_WeightSTRINGTerminalRuleCall_9_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Patient_Weight",
            						lv_Patient_Weight_9_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_10=(Token)match(input,38,FOLLOW_16); 

            			newLeafNode(otherlv_10, grammarAccess.getPatientAccess().getPatients_blood_pressureKeyword_10());
            		
            // InternalMyDsl.g:1280:3: ( (lv_patient_blood_pressure_11_0= RULE_INT ) )
            // InternalMyDsl.g:1281:4: (lv_patient_blood_pressure_11_0= RULE_INT )
            {
            // InternalMyDsl.g:1281:4: (lv_patient_blood_pressure_11_0= RULE_INT )
            // InternalMyDsl.g:1282:5: lv_patient_blood_pressure_11_0= RULE_INT
            {
            lv_patient_blood_pressure_11_0=(Token)match(input,RULE_INT,FOLLOW_20); 

            					newLeafNode(lv_patient_blood_pressure_11_0, grammarAccess.getPatientAccess().getPatient_blood_pressureINTTerminalRuleCall_11_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"patient_blood_pressure",
            						lv_patient_blood_pressure_11_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            otherlv_12=(Token)match(input,39,FOLLOW_16); 

            			newLeafNode(otherlv_12, grammarAccess.getPatientAccess().getPulse_rateKeyword_12());
            		
            // InternalMyDsl.g:1302:3: ( (lv_pulse_rate_13_0= RULE_INT ) )
            // InternalMyDsl.g:1303:4: (lv_pulse_rate_13_0= RULE_INT )
            {
            // InternalMyDsl.g:1303:4: (lv_pulse_rate_13_0= RULE_INT )
            // InternalMyDsl.g:1304:5: lv_pulse_rate_13_0= RULE_INT
            {
            lv_pulse_rate_13_0=(Token)match(input,RULE_INT,FOLLOW_21); 

            					newLeafNode(lv_pulse_rate_13_0, grammarAccess.getPatientAccess().getPulse_rateINTTerminalRuleCall_13_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPatientRule());
            					}
            					setWithLastConsumed(
            						current,
            						"pulse_rate",
            						lv_pulse_rate_13_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }

            // InternalMyDsl.g:1320:3: ( (lv_symptoms_14_0= ruleSymptom ) )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||(LA9_0>=16 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:1321:4: (lv_symptoms_14_0= ruleSymptom )
            	    {
            	    // InternalMyDsl.g:1321:4: (lv_symptoms_14_0= ruleSymptom )
            	    // InternalMyDsl.g:1322:5: lv_symptoms_14_0= ruleSymptom
            	    {

            	    					newCompositeNode(grammarAccess.getPatientAccess().getSymptomsSymptomParserRuleCall_14_0());
            	    				
            	    pushFollow(FOLLOW_22);
            	    lv_symptoms_14_0=ruleSymptom();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatientRule());
            	    					}
            	    					add(
            	    						current,
            	    						"symptoms",
            	    						lv_symptoms_14_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Symptom");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt9 >= 1 ) break loop9;
                        EarlyExitException eee =
                            new EarlyExitException(9, input);
                        throw eee;
                }
                cnt9++;
            } while (true);

            // InternalMyDsl.g:1339:3: ( (lv_medicines_15_0= ruleMedicines ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==12) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1340:4: (lv_medicines_15_0= ruleMedicines )
            	    {
            	    // InternalMyDsl.g:1340:4: (lv_medicines_15_0= ruleMedicines )
            	    // InternalMyDsl.g:1341:5: lv_medicines_15_0= ruleMedicines
            	    {

            	    					newCompositeNode(grammarAccess.getPatientAccess().getMedicinesMedicinesParserRuleCall_15_0());
            	    				
            	    pushFollow(FOLLOW_23);
            	    lv_medicines_15_0=ruleMedicines();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatientRule());
            	    					}
            	    					add(
            	    						current,
            	    						"medicines",
            	    						lv_medicines_15_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Medicines");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // InternalMyDsl.g:1358:3: ( (lv_sugar_tests_16_0= ruleSugar_Test ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==28) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:1359:4: (lv_sugar_tests_16_0= ruleSugar_Test )
            	    {
            	    // InternalMyDsl.g:1359:4: (lv_sugar_tests_16_0= ruleSugar_Test )
            	    // InternalMyDsl.g:1360:5: lv_sugar_tests_16_0= ruleSugar_Test
            	    {

            	    					newCompositeNode(grammarAccess.getPatientAccess().getSugar_testsSugar_TestParserRuleCall_16_0());
            	    				
            	    pushFollow(FOLLOW_24);
            	    lv_sugar_tests_16_0=ruleSugar_Test();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getPatientRule());
            	    					}
            	    					add(
            	    						current,
            	    						"sugar_tests",
            	    						lv_sugar_tests_16_0,
            	    						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Sugar_Test");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            otherlv_17=(Token)match(input,40,FOLLOW_3); 

            			newLeafNode(otherlv_17, grammarAccess.getPatientAccess().getDoctorKeyword_17());
            		
            // InternalMyDsl.g:1381:3: ( (otherlv_18= RULE_ID ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_ID) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1382:4: (otherlv_18= RULE_ID )
            	    {
            	    // InternalMyDsl.g:1382:4: (otherlv_18= RULE_ID )
            	    // InternalMyDsl.g:1383:5: otherlv_18= RULE_ID
            	    {

            	    					if (current==null) {
            	    						current = createModelElement(grammarAccess.getPatientRule());
            	    					}
            	    				
            	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_25); 

            	    					newLeafNode(otherlv_18, grammarAccess.getPatientAccess().getDOCTORSDoctorCrossReference_18_0());
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePatient"


    // $ANTLR start "entryRulePredict_diabetes"
    // InternalMyDsl.g:1398:1: entryRulePredict_diabetes returns [EObject current=null] : iv_rulePredict_diabetes= rulePredict_diabetes EOF ;
    public final EObject entryRulePredict_diabetes() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredict_diabetes = null;


        try {
            // InternalMyDsl.g:1398:57: (iv_rulePredict_diabetes= rulePredict_diabetes EOF )
            // InternalMyDsl.g:1399:2: iv_rulePredict_diabetes= rulePredict_diabetes EOF
            {
             newCompositeNode(grammarAccess.getPredict_diabetesRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePredict_diabetes=rulePredict_diabetes();

            state._fsp--;

             current =iv_rulePredict_diabetes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredict_diabetes"


    // $ANTLR start "rulePredict_diabetes"
    // InternalMyDsl.g:1405:1: rulePredict_diabetes returns [EObject current=null] : (otherlv_0= 'Predict_diabetes' ( (lv_name_1_0= RULE_INT ) ) ) ;
    public final EObject rulePredict_diabetes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:1411:2: ( (otherlv_0= 'Predict_diabetes' ( (lv_name_1_0= RULE_INT ) ) ) )
            // InternalMyDsl.g:1412:2: (otherlv_0= 'Predict_diabetes' ( (lv_name_1_0= RULE_INT ) ) )
            {
            // InternalMyDsl.g:1412:2: (otherlv_0= 'Predict_diabetes' ( (lv_name_1_0= RULE_INT ) ) )
            // InternalMyDsl.g:1413:3: otherlv_0= 'Predict_diabetes' ( (lv_name_1_0= RULE_INT ) )
            {
            otherlv_0=(Token)match(input,41,FOLLOW_16); 

            			newLeafNode(otherlv_0, grammarAccess.getPredict_diabetesAccess().getPredict_diabetesKeyword_0());
            		
            // InternalMyDsl.g:1417:3: ( (lv_name_1_0= RULE_INT ) )
            // InternalMyDsl.g:1418:4: (lv_name_1_0= RULE_INT )
            {
            // InternalMyDsl.g:1418:4: (lv_name_1_0= RULE_INT )
            // InternalMyDsl.g:1419:5: lv_name_1_0= RULE_INT
            {
            lv_name_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            					newLeafNode(lv_name_1_0, grammarAccess.getPredict_diabetesAccess().getNameINTTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPredict_diabetesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.INT");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredict_diabetes"


    // $ANTLR start "entryRuleMachine_learning_Algorithms"
    // InternalMyDsl.g:1439:1: entryRuleMachine_learning_Algorithms returns [EObject current=null] : iv_ruleMachine_learning_Algorithms= ruleMachine_learning_Algorithms EOF ;
    public final EObject entryRuleMachine_learning_Algorithms() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMachine_learning_Algorithms = null;


        try {
            // InternalMyDsl.g:1439:68: (iv_ruleMachine_learning_Algorithms= ruleMachine_learning_Algorithms EOF )
            // InternalMyDsl.g:1440:2: iv_ruleMachine_learning_Algorithms= ruleMachine_learning_Algorithms EOF
            {
             newCompositeNode(grammarAccess.getMachine_learning_AlgorithmsRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMachine_learning_Algorithms=ruleMachine_learning_Algorithms();

            state._fsp--;

             current =iv_ruleMachine_learning_Algorithms; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMachine_learning_Algorithms"


    // $ANTLR start "ruleMachine_learning_Algorithms"
    // InternalMyDsl.g:1446:1: ruleMachine_learning_Algorithms returns [EObject current=null] : (this_Random_forest_0= ruleRandom_forest | this_SVM_Classifier_1= ruleSVM_Classifier | this_J48Classifier_2= ruleJ48Classifier | this_NavieBayes_3= ruleNavieBayes ) ;
    public final EObject ruleMachine_learning_Algorithms() throws RecognitionException {
        EObject current = null;

        EObject this_Random_forest_0 = null;

        EObject this_SVM_Classifier_1 = null;

        EObject this_J48Classifier_2 = null;

        EObject this_NavieBayes_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1452:2: ( (this_Random_forest_0= ruleRandom_forest | this_SVM_Classifier_1= ruleSVM_Classifier | this_J48Classifier_2= ruleJ48Classifier | this_NavieBayes_3= ruleNavieBayes ) )
            // InternalMyDsl.g:1453:2: (this_Random_forest_0= ruleRandom_forest | this_SVM_Classifier_1= ruleSVM_Classifier | this_J48Classifier_2= ruleJ48Classifier | this_NavieBayes_3= ruleNavieBayes )
            {
            // InternalMyDsl.g:1453:2: (this_Random_forest_0= ruleRandom_forest | this_SVM_Classifier_1= ruleSVM_Classifier | this_J48Classifier_2= ruleJ48Classifier | this_NavieBayes_3= ruleNavieBayes )
            int alt13=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt13=1;
                }
                break;
            case 44:
                {
                alt13=2;
                }
                break;
            case 46:
                {
                alt13=3;
                }
                break;
            case 48:
                {
                alt13=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1454:3: this_Random_forest_0= ruleRandom_forest
                    {

                    			newCompositeNode(grammarAccess.getMachine_learning_AlgorithmsAccess().getRandom_forestParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Random_forest_0=ruleRandom_forest();

                    state._fsp--;


                    			current = this_Random_forest_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:1463:3: this_SVM_Classifier_1= ruleSVM_Classifier
                    {

                    			newCompositeNode(grammarAccess.getMachine_learning_AlgorithmsAccess().getSVM_ClassifierParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SVM_Classifier_1=ruleSVM_Classifier();

                    state._fsp--;


                    			current = this_SVM_Classifier_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:1472:3: this_J48Classifier_2= ruleJ48Classifier
                    {

                    			newCompositeNode(grammarAccess.getMachine_learning_AlgorithmsAccess().getJ48ClassifierParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_J48Classifier_2=ruleJ48Classifier();

                    state._fsp--;


                    			current = this_J48Classifier_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:1481:3: this_NavieBayes_3= ruleNavieBayes
                    {

                    			newCompositeNode(grammarAccess.getMachine_learning_AlgorithmsAccess().getNavieBayesParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_NavieBayes_3=ruleNavieBayes();

                    state._fsp--;


                    			current = this_NavieBayes_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMachine_learning_Algorithms"


    // $ANTLR start "entryRuleRandom_forest"
    // InternalMyDsl.g:1493:1: entryRuleRandom_forest returns [EObject current=null] : iv_ruleRandom_forest= ruleRandom_forest EOF ;
    public final EObject entryRuleRandom_forest() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRandom_forest = null;


        try {
            // InternalMyDsl.g:1493:54: (iv_ruleRandom_forest= ruleRandom_forest EOF )
            // InternalMyDsl.g:1494:2: iv_ruleRandom_forest= ruleRandom_forest EOF
            {
             newCompositeNode(grammarAccess.getRandom_forestRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRandom_forest=ruleRandom_forest();

            state._fsp--;

             current =iv_ruleRandom_forest; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRandom_forest"


    // $ANTLR start "ruleRandom_forest"
    // InternalMyDsl.g:1500:1: ruleRandom_forest returns [EObject current=null] : (otherlv_0= 'Random_forest' otherlv_1= 'create_trees' ( (lv_create_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) ;
    public final EObject ruleRandom_forest() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_create_trees_2_0=null;
        EObject lv_Predict_diabetes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1506:2: ( (otherlv_0= 'Random_forest' otherlv_1= 'create_trees' ( (lv_create_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) )
            // InternalMyDsl.g:1507:2: (otherlv_0= 'Random_forest' otherlv_1= 'create_trees' ( (lv_create_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            {
            // InternalMyDsl.g:1507:2: (otherlv_0= 'Random_forest' otherlv_1= 'create_trees' ( (lv_create_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            // InternalMyDsl.g:1508:3: otherlv_0= 'Random_forest' otherlv_1= 'create_trees' ( (lv_create_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            {
            otherlv_0=(Token)match(input,42,FOLLOW_26); 

            			newLeafNode(otherlv_0, grammarAccess.getRandom_forestAccess().getRandom_forestKeyword_0());
            		
            otherlv_1=(Token)match(input,43,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRandom_forestAccess().getCreate_treesKeyword_1());
            		
            // InternalMyDsl.g:1516:3: ( (lv_create_trees_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1517:4: (lv_create_trees_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1517:4: (lv_create_trees_2_0= RULE_STRING )
            // InternalMyDsl.g:1518:5: lv_create_trees_2_0= RULE_STRING
            {
            lv_create_trees_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_create_trees_2_0, grammarAccess.getRandom_forestAccess().getCreate_treesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRandom_forestRule());
            					}
            					setWithLastConsumed(
            						current,
            						"create_trees",
            						lv_create_trees_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1534:3: ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            // InternalMyDsl.g:1535:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            {
            // InternalMyDsl.g:1535:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            // InternalMyDsl.g:1536:5: lv_Predict_diabetes_3_0= rulePredict_diabetes
            {

            					newCompositeNode(grammarAccess.getRandom_forestAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_Predict_diabetes_3_0=rulePredict_diabetes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRandom_forestRule());
            					}
            					set(
            						current,
            						"Predict_diabetes",
            						lv_Predict_diabetes_3_0,
            						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Predict_diabetes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRandom_forest"


    // $ANTLR start "entryRuleSVM_Classifier"
    // InternalMyDsl.g:1557:1: entryRuleSVM_Classifier returns [EObject current=null] : iv_ruleSVM_Classifier= ruleSVM_Classifier EOF ;
    public final EObject entryRuleSVM_Classifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSVM_Classifier = null;


        try {
            // InternalMyDsl.g:1557:55: (iv_ruleSVM_Classifier= ruleSVM_Classifier EOF )
            // InternalMyDsl.g:1558:2: iv_ruleSVM_Classifier= ruleSVM_Classifier EOF
            {
             newCompositeNode(grammarAccess.getSVM_ClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSVM_Classifier=ruleSVM_Classifier();

            state._fsp--;

             current =iv_ruleSVM_Classifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSVM_Classifier"


    // $ANTLR start "ruleSVM_Classifier"
    // InternalMyDsl.g:1564:1: ruleSVM_Classifier returns [EObject current=null] : (otherlv_0= 'SVM_Classifier' otherlv_1= 'kernel:' ( (lv_Kernel_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) ;
    public final EObject ruleSVM_Classifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Kernel_2_0=null;
        EObject lv_Predict_diabetes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1570:2: ( (otherlv_0= 'SVM_Classifier' otherlv_1= 'kernel:' ( (lv_Kernel_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) )
            // InternalMyDsl.g:1571:2: (otherlv_0= 'SVM_Classifier' otherlv_1= 'kernel:' ( (lv_Kernel_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            {
            // InternalMyDsl.g:1571:2: (otherlv_0= 'SVM_Classifier' otherlv_1= 'kernel:' ( (lv_Kernel_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            // InternalMyDsl.g:1572:3: otherlv_0= 'SVM_Classifier' otherlv_1= 'kernel:' ( (lv_Kernel_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            {
            otherlv_0=(Token)match(input,44,FOLLOW_28); 

            			newLeafNode(otherlv_0, grammarAccess.getSVM_ClassifierAccess().getSVM_ClassifierKeyword_0());
            		
            otherlv_1=(Token)match(input,45,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getSVM_ClassifierAccess().getKernelKeyword_1());
            		
            // InternalMyDsl.g:1580:3: ( (lv_Kernel_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1581:4: (lv_Kernel_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1581:4: (lv_Kernel_2_0= RULE_STRING )
            // InternalMyDsl.g:1582:5: lv_Kernel_2_0= RULE_STRING
            {
            lv_Kernel_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_Kernel_2_0, grammarAccess.getSVM_ClassifierAccess().getKernelSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSVM_ClassifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Kernel",
            						lv_Kernel_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1598:3: ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            // InternalMyDsl.g:1599:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            {
            // InternalMyDsl.g:1599:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            // InternalMyDsl.g:1600:5: lv_Predict_diabetes_3_0= rulePredict_diabetes
            {

            					newCompositeNode(grammarAccess.getSVM_ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_Predict_diabetes_3_0=rulePredict_diabetes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSVM_ClassifierRule());
            					}
            					set(
            						current,
            						"Predict_diabetes",
            						lv_Predict_diabetes_3_0,
            						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Predict_diabetes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSVM_Classifier"


    // $ANTLR start "entryRuleJ48Classifier"
    // InternalMyDsl.g:1621:1: entryRuleJ48Classifier returns [EObject current=null] : iv_ruleJ48Classifier= ruleJ48Classifier EOF ;
    public final EObject entryRuleJ48Classifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJ48Classifier = null;


        try {
            // InternalMyDsl.g:1621:54: (iv_ruleJ48Classifier= ruleJ48Classifier EOF )
            // InternalMyDsl.g:1622:2: iv_ruleJ48Classifier= ruleJ48Classifier EOF
            {
             newCompositeNode(grammarAccess.getJ48ClassifierRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleJ48Classifier=ruleJ48Classifier();

            state._fsp--;

             current =iv_ruleJ48Classifier; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJ48Classifier"


    // $ANTLR start "ruleJ48Classifier"
    // InternalMyDsl.g:1628:1: ruleJ48Classifier returns [EObject current=null] : (otherlv_0= 'J48Classifier' otherlv_1= 'set_pruned_trees:' ( (lv_set_pruned_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) ;
    public final EObject ruleJ48Classifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_set_pruned_trees_2_0=null;
        EObject lv_Predict_diabetes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1634:2: ( (otherlv_0= 'J48Classifier' otherlv_1= 'set_pruned_trees:' ( (lv_set_pruned_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) )
            // InternalMyDsl.g:1635:2: (otherlv_0= 'J48Classifier' otherlv_1= 'set_pruned_trees:' ( (lv_set_pruned_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            {
            // InternalMyDsl.g:1635:2: (otherlv_0= 'J48Classifier' otherlv_1= 'set_pruned_trees:' ( (lv_set_pruned_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            // InternalMyDsl.g:1636:3: otherlv_0= 'J48Classifier' otherlv_1= 'set_pruned_trees:' ( (lv_set_pruned_trees_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            {
            otherlv_0=(Token)match(input,46,FOLLOW_29); 

            			newLeafNode(otherlv_0, grammarAccess.getJ48ClassifierAccess().getJ48ClassifierKeyword_0());
            		
            otherlv_1=(Token)match(input,47,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesKeyword_1());
            		
            // InternalMyDsl.g:1644:3: ( (lv_set_pruned_trees_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1645:4: (lv_set_pruned_trees_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1645:4: (lv_set_pruned_trees_2_0= RULE_STRING )
            // InternalMyDsl.g:1646:5: lv_set_pruned_trees_2_0= RULE_STRING
            {
            lv_set_pruned_trees_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_set_pruned_trees_2_0, grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getJ48ClassifierRule());
            					}
            					setWithLastConsumed(
            						current,
            						"set_pruned_trees",
            						lv_set_pruned_trees_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1662:3: ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            // InternalMyDsl.g:1663:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            {
            // InternalMyDsl.g:1663:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            // InternalMyDsl.g:1664:5: lv_Predict_diabetes_3_0= rulePredict_diabetes
            {

            					newCompositeNode(grammarAccess.getJ48ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_Predict_diabetes_3_0=rulePredict_diabetes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getJ48ClassifierRule());
            					}
            					set(
            						current,
            						"Predict_diabetes",
            						lv_Predict_diabetes_3_0,
            						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Predict_diabetes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJ48Classifier"


    // $ANTLR start "entryRuleNavieBayes"
    // InternalMyDsl.g:1685:1: entryRuleNavieBayes returns [EObject current=null] : iv_ruleNavieBayes= ruleNavieBayes EOF ;
    public final EObject entryRuleNavieBayes() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNavieBayes = null;


        try {
            // InternalMyDsl.g:1685:51: (iv_ruleNavieBayes= ruleNavieBayes EOF )
            // InternalMyDsl.g:1686:2: iv_ruleNavieBayes= ruleNavieBayes EOF
            {
             newCompositeNode(grammarAccess.getNavieBayesRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNavieBayes=ruleNavieBayes();

            state._fsp--;

             current =iv_ruleNavieBayes; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNavieBayes"


    // $ANTLR start "ruleNavieBayes"
    // InternalMyDsl.g:1692:1: ruleNavieBayes returns [EObject current=null] : (otherlv_0= 'NavieBayes' otherlv_1= 'Conditional_Probability_based:' ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) ;
    public final EObject ruleNavieBayes() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_Conditional_Probability_based_2_0=null;
        EObject lv_Predict_diabetes_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:1698:2: ( (otherlv_0= 'NavieBayes' otherlv_1= 'Conditional_Probability_based:' ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) ) )
            // InternalMyDsl.g:1699:2: (otherlv_0= 'NavieBayes' otherlv_1= 'Conditional_Probability_based:' ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            {
            // InternalMyDsl.g:1699:2: (otherlv_0= 'NavieBayes' otherlv_1= 'Conditional_Probability_based:' ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) ) )
            // InternalMyDsl.g:1700:3: otherlv_0= 'NavieBayes' otherlv_1= 'Conditional_Probability_based:' ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) ) ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            {
            otherlv_0=(Token)match(input,48,FOLLOW_30); 

            			newLeafNode(otherlv_0, grammarAccess.getNavieBayesAccess().getNavieBayesKeyword_0());
            		
            otherlv_1=(Token)match(input,49,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getNavieBayesAccess().getConditional_Probability_basedKeyword_1());
            		
            // InternalMyDsl.g:1708:3: ( (lv_Conditional_Probability_based_2_0= RULE_STRING ) )
            // InternalMyDsl.g:1709:4: (lv_Conditional_Probability_based_2_0= RULE_STRING )
            {
            // InternalMyDsl.g:1709:4: (lv_Conditional_Probability_based_2_0= RULE_STRING )
            // InternalMyDsl.g:1710:5: lv_Conditional_Probability_based_2_0= RULE_STRING
            {
            lv_Conditional_Probability_based_2_0=(Token)match(input,RULE_STRING,FOLLOW_27); 

            					newLeafNode(lv_Conditional_Probability_based_2_0, grammarAccess.getNavieBayesAccess().getConditional_Probability_basedSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getNavieBayesRule());
            					}
            					setWithLastConsumed(
            						current,
            						"Conditional_Probability_based",
            						lv_Conditional_Probability_based_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            // InternalMyDsl.g:1726:3: ( (lv_Predict_diabetes_3_0= rulePredict_diabetes ) )
            // InternalMyDsl.g:1727:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            {
            // InternalMyDsl.g:1727:4: (lv_Predict_diabetes_3_0= rulePredict_diabetes )
            // InternalMyDsl.g:1728:5: lv_Predict_diabetes_3_0= rulePredict_diabetes
            {

            					newCompositeNode(grammarAccess.getNavieBayesAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_Predict_diabetes_3_0=rulePredict_diabetes();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getNavieBayesRule());
            					}
            					set(
            						current,
            						"Predict_diabetes",
            						lv_Predict_diabetes_3_0,
            						"assignment_2_ssda.xtext_ml.ass2.MyDsl.Predict_diabetes");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNavieBayes"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000154028FFF5000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000154028FFF5002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x000000000FFF5002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x000000000FFF4002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000FFF4000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x000000001FFF5000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000010010001000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0002000000000000L});

}