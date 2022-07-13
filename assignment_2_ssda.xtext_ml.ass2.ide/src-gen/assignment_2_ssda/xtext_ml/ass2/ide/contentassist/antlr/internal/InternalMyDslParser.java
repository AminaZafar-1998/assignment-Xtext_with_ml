package assignment_2_ssda.xtext_ml.ass2.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import assignment_2_ssda.xtext_ml.ass2.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleDiabetes_Prediction_System"
    // InternalMyDsl.g:53:1: entryRuleDiabetes_Prediction_System : ruleDiabetes_Prediction_System EOF ;
    public final void entryRuleDiabetes_Prediction_System() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleDiabetes_Prediction_System EOF )
            // InternalMyDsl.g:55:1: ruleDiabetes_Prediction_System EOF
            {
             before(grammarAccess.getDiabetes_Prediction_SystemRule()); 
            pushFollow(FOLLOW_1);
            ruleDiabetes_Prediction_System();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDiabetes_Prediction_System"


    // $ANTLR start "ruleDiabetes_Prediction_System"
    // InternalMyDsl.g:62:1: ruleDiabetes_Prediction_System : ( ( rule__Diabetes_Prediction_System__Group__0 ) ) ;
    public final void ruleDiabetes_Prediction_System() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Diabetes_Prediction_System__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Diabetes_Prediction_System__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Diabetes_Prediction_System__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Diabetes_Prediction_System__Group__0 )
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Diabetes_Prediction_System__Group__0 )
            // InternalMyDsl.g:69:4: rule__Diabetes_Prediction_System__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDiabetes_Prediction_System"


    // $ANTLR start "entryRuleMedicines"
    // InternalMyDsl.g:78:1: entryRuleMedicines : ruleMedicines EOF ;
    public final void entryRuleMedicines() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleMedicines EOF )
            // InternalMyDsl.g:80:1: ruleMedicines EOF
            {
             before(grammarAccess.getMedicinesRule()); 
            pushFollow(FOLLOW_1);
            ruleMedicines();

            state._fsp--;

             after(grammarAccess.getMedicinesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMedicines"


    // $ANTLR start "ruleMedicines"
    // InternalMyDsl.g:87:1: ruleMedicines : ( ( rule__Medicines__Group__0 ) ) ;
    public final void ruleMedicines() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Medicines__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Medicines__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Medicines__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Medicines__Group__0 )
            {
             before(grammarAccess.getMedicinesAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Medicines__Group__0 )
            // InternalMyDsl.g:94:4: rule__Medicines__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Medicines__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMedicinesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMedicines"


    // $ANTLR start "entryRuleSymptom"
    // InternalMyDsl.g:103:1: entryRuleSymptom : ruleSymptom EOF ;
    public final void entryRuleSymptom() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleSymptom EOF )
            // InternalMyDsl.g:105:1: ruleSymptom EOF
            {
             before(grammarAccess.getSymptomRule()); 
            pushFollow(FOLLOW_1);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getSymptomRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSymptom"


    // $ANTLR start "ruleSymptom"
    // InternalMyDsl.g:112:1: ruleSymptom : ( ( rule__Symptom__Alternatives ) ) ;
    public final void ruleSymptom() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Symptom__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Symptom__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Symptom__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__Symptom__Alternatives )
            {
             before(grammarAccess.getSymptomAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__Symptom__Alternatives )
            // InternalMyDsl.g:119:4: rule__Symptom__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Symptom__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSymptomAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSymptom"


    // $ANTLR start "entryRulePolyuria"
    // InternalMyDsl.g:128:1: entryRulePolyuria : rulePolyuria EOF ;
    public final void entryRulePolyuria() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( rulePolyuria EOF )
            // InternalMyDsl.g:130:1: rulePolyuria EOF
            {
             before(grammarAccess.getPolyuriaRule()); 
            pushFollow(FOLLOW_1);
            rulePolyuria();

            state._fsp--;

             after(grammarAccess.getPolyuriaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolyuria"


    // $ANTLR start "rulePolyuria"
    // InternalMyDsl.g:137:1: rulePolyuria : ( ( rule__Polyuria__Group__0 ) ) ;
    public final void rulePolyuria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Polyuria__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Polyuria__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Polyuria__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Polyuria__Group__0 )
            {
             before(grammarAccess.getPolyuriaAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Polyuria__Group__0 )
            // InternalMyDsl.g:144:4: rule__Polyuria__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polyuria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyuriaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyuria"


    // $ANTLR start "entryRulePolydipsia"
    // InternalMyDsl.g:153:1: entryRulePolydipsia : rulePolydipsia EOF ;
    public final void entryRulePolydipsia() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( rulePolydipsia EOF )
            // InternalMyDsl.g:155:1: rulePolydipsia EOF
            {
             before(grammarAccess.getPolydipsiaRule()); 
            pushFollow(FOLLOW_1);
            rulePolydipsia();

            state._fsp--;

             after(grammarAccess.getPolydipsiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolydipsia"


    // $ANTLR start "rulePolydipsia"
    // InternalMyDsl.g:162:1: rulePolydipsia : ( ( rule__Polydipsia__Group__0 ) ) ;
    public final void rulePolydipsia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Polydipsia__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Polydipsia__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Polydipsia__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Polydipsia__Group__0 )
            {
             before(grammarAccess.getPolydipsiaAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Polydipsia__Group__0 )
            // InternalMyDsl.g:169:4: rule__Polydipsia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polydipsia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolydipsiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolydipsia"


    // $ANTLR start "entryRulesudden_weight_loss"
    // InternalMyDsl.g:178:1: entryRulesudden_weight_loss : rulesudden_weight_loss EOF ;
    public final void entryRulesudden_weight_loss() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( rulesudden_weight_loss EOF )
            // InternalMyDsl.g:180:1: rulesudden_weight_loss EOF
            {
             before(grammarAccess.getSudden_weight_lossRule()); 
            pushFollow(FOLLOW_1);
            rulesudden_weight_loss();

            state._fsp--;

             after(grammarAccess.getSudden_weight_lossRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulesudden_weight_loss"


    // $ANTLR start "rulesudden_weight_loss"
    // InternalMyDsl.g:187:1: rulesudden_weight_loss : ( ( rule__Sudden_weight_loss__Group__0 ) ) ;
    public final void rulesudden_weight_loss() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__Sudden_weight_loss__Group__0 ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__Sudden_weight_loss__Group__0 ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__Sudden_weight_loss__Group__0 ) )
            // InternalMyDsl.g:193:3: ( rule__Sudden_weight_loss__Group__0 )
            {
             before(grammarAccess.getSudden_weight_lossAccess().getGroup()); 
            // InternalMyDsl.g:194:3: ( rule__Sudden_weight_loss__Group__0 )
            // InternalMyDsl.g:194:4: rule__Sudden_weight_loss__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sudden_weight_loss__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSudden_weight_lossAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulesudden_weight_loss"


    // $ANTLR start "entryRulePolyphagia"
    // InternalMyDsl.g:203:1: entryRulePolyphagia : rulePolyphagia EOF ;
    public final void entryRulePolyphagia() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( rulePolyphagia EOF )
            // InternalMyDsl.g:205:1: rulePolyphagia EOF
            {
             before(grammarAccess.getPolyphagiaRule()); 
            pushFollow(FOLLOW_1);
            rulePolyphagia();

            state._fsp--;

             after(grammarAccess.getPolyphagiaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePolyphagia"


    // $ANTLR start "rulePolyphagia"
    // InternalMyDsl.g:212:1: rulePolyphagia : ( ( rule__Polyphagia__Group__0 ) ) ;
    public final void rulePolyphagia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__Polyphagia__Group__0 ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__Polyphagia__Group__0 ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__Polyphagia__Group__0 ) )
            // InternalMyDsl.g:218:3: ( rule__Polyphagia__Group__0 )
            {
             before(grammarAccess.getPolyphagiaAccess().getGroup()); 
            // InternalMyDsl.g:219:3: ( rule__Polyphagia__Group__0 )
            // InternalMyDsl.g:219:4: rule__Polyphagia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Polyphagia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPolyphagiaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePolyphagia"


    // $ANTLR start "entryRuleGenital_thrush"
    // InternalMyDsl.g:228:1: entryRuleGenital_thrush : ruleGenital_thrush EOF ;
    public final void entryRuleGenital_thrush() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleGenital_thrush EOF )
            // InternalMyDsl.g:230:1: ruleGenital_thrush EOF
            {
             before(grammarAccess.getGenital_thrushRule()); 
            pushFollow(FOLLOW_1);
            ruleGenital_thrush();

            state._fsp--;

             after(grammarAccess.getGenital_thrushRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGenital_thrush"


    // $ANTLR start "ruleGenital_thrush"
    // InternalMyDsl.g:237:1: ruleGenital_thrush : ( ( rule__Genital_thrush__Group__0 ) ) ;
    public final void ruleGenital_thrush() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__Genital_thrush__Group__0 ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__Genital_thrush__Group__0 ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__Genital_thrush__Group__0 ) )
            // InternalMyDsl.g:243:3: ( rule__Genital_thrush__Group__0 )
            {
             before(grammarAccess.getGenital_thrushAccess().getGroup()); 
            // InternalMyDsl.g:244:3: ( rule__Genital_thrush__Group__0 )
            // InternalMyDsl.g:244:4: rule__Genital_thrush__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Genital_thrush__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGenital_thrushAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGenital_thrush"


    // $ANTLR start "entryRulevisual_blurring"
    // InternalMyDsl.g:253:1: entryRulevisual_blurring : rulevisual_blurring EOF ;
    public final void entryRulevisual_blurring() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( rulevisual_blurring EOF )
            // InternalMyDsl.g:255:1: rulevisual_blurring EOF
            {
             before(grammarAccess.getVisual_blurringRule()); 
            pushFollow(FOLLOW_1);
            rulevisual_blurring();

            state._fsp--;

             after(grammarAccess.getVisual_blurringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulevisual_blurring"


    // $ANTLR start "rulevisual_blurring"
    // InternalMyDsl.g:262:1: rulevisual_blurring : ( ( rule__Visual_blurring__Group__0 ) ) ;
    public final void rulevisual_blurring() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__Visual_blurring__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__Visual_blurring__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__Visual_blurring__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__Visual_blurring__Group__0 )
            {
             before(grammarAccess.getVisual_blurringAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__Visual_blurring__Group__0 )
            // InternalMyDsl.g:269:4: rule__Visual_blurring__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Visual_blurring__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVisual_blurringAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulevisual_blurring"


    // $ANTLR start "entryRuleItching"
    // InternalMyDsl.g:278:1: entryRuleItching : ruleItching EOF ;
    public final void entryRuleItching() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleItching EOF )
            // InternalMyDsl.g:280:1: ruleItching EOF
            {
             before(grammarAccess.getItchingRule()); 
            pushFollow(FOLLOW_1);
            ruleItching();

            state._fsp--;

             after(grammarAccess.getItchingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleItching"


    // $ANTLR start "ruleItching"
    // InternalMyDsl.g:287:1: ruleItching : ( ( rule__Itching__Group__0 ) ) ;
    public final void ruleItching() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__Itching__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__Itching__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__Itching__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__Itching__Group__0 )
            {
             before(grammarAccess.getItchingAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__Itching__Group__0 )
            // InternalMyDsl.g:294:4: rule__Itching__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Itching__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getItchingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleItching"


    // $ANTLR start "entryRuleIrritability"
    // InternalMyDsl.g:303:1: entryRuleIrritability : ruleIrritability EOF ;
    public final void entryRuleIrritability() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleIrritability EOF )
            // InternalMyDsl.g:305:1: ruleIrritability EOF
            {
             before(grammarAccess.getIrritabilityRule()); 
            pushFollow(FOLLOW_1);
            ruleIrritability();

            state._fsp--;

             after(grammarAccess.getIrritabilityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleIrritability"


    // $ANTLR start "ruleIrritability"
    // InternalMyDsl.g:312:1: ruleIrritability : ( ( rule__Irritability__Group__0 ) ) ;
    public final void ruleIrritability() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__Irritability__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__Irritability__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__Irritability__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__Irritability__Group__0 )
            {
             before(grammarAccess.getIrritabilityAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__Irritability__Group__0 )
            // InternalMyDsl.g:319:4: rule__Irritability__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Irritability__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIrritabilityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleIrritability"


    // $ANTLR start "entryRuledelayed_healing"
    // InternalMyDsl.g:328:1: entryRuledelayed_healing : ruledelayed_healing EOF ;
    public final void entryRuledelayed_healing() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruledelayed_healing EOF )
            // InternalMyDsl.g:330:1: ruledelayed_healing EOF
            {
             before(grammarAccess.getDelayed_healingRule()); 
            pushFollow(FOLLOW_1);
            ruledelayed_healing();

            state._fsp--;

             after(grammarAccess.getDelayed_healingRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuledelayed_healing"


    // $ANTLR start "ruledelayed_healing"
    // InternalMyDsl.g:337:1: ruledelayed_healing : ( ( rule__Delayed_healing__Group__0 ) ) ;
    public final void ruledelayed_healing() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Delayed_healing__Group__0 ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Delayed_healing__Group__0 ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Delayed_healing__Group__0 ) )
            // InternalMyDsl.g:343:3: ( rule__Delayed_healing__Group__0 )
            {
             before(grammarAccess.getDelayed_healingAccess().getGroup()); 
            // InternalMyDsl.g:344:3: ( rule__Delayed_healing__Group__0 )
            // InternalMyDsl.g:344:4: rule__Delayed_healing__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Delayed_healing__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDelayed_healingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruledelayed_healing"


    // $ANTLR start "entryRulepartial_paresis"
    // InternalMyDsl.g:353:1: entryRulepartial_paresis : rulepartial_paresis EOF ;
    public final void entryRulepartial_paresis() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( rulepartial_paresis EOF )
            // InternalMyDsl.g:355:1: rulepartial_paresis EOF
            {
             before(grammarAccess.getPartial_paresisRule()); 
            pushFollow(FOLLOW_1);
            rulepartial_paresis();

            state._fsp--;

             after(grammarAccess.getPartial_paresisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulepartial_paresis"


    // $ANTLR start "rulepartial_paresis"
    // InternalMyDsl.g:362:1: rulepartial_paresis : ( ( rule__Partial_paresis__Group__0 ) ) ;
    public final void rulepartial_paresis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__Partial_paresis__Group__0 ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__Partial_paresis__Group__0 ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__Partial_paresis__Group__0 ) )
            // InternalMyDsl.g:368:3: ( rule__Partial_paresis__Group__0 )
            {
             before(grammarAccess.getPartial_paresisAccess().getGroup()); 
            // InternalMyDsl.g:369:3: ( rule__Partial_paresis__Group__0 )
            // InternalMyDsl.g:369:4: rule__Partial_paresis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Partial_paresis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPartial_paresisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulepartial_paresis"


    // $ANTLR start "entryRulemuscle_stiffness"
    // InternalMyDsl.g:378:1: entryRulemuscle_stiffness : rulemuscle_stiffness EOF ;
    public final void entryRulemuscle_stiffness() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( rulemuscle_stiffness EOF )
            // InternalMyDsl.g:380:1: rulemuscle_stiffness EOF
            {
             before(grammarAccess.getMuscle_stiffnessRule()); 
            pushFollow(FOLLOW_1);
            rulemuscle_stiffness();

            state._fsp--;

             after(grammarAccess.getMuscle_stiffnessRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulemuscle_stiffness"


    // $ANTLR start "rulemuscle_stiffness"
    // InternalMyDsl.g:387:1: rulemuscle_stiffness : ( ( rule__Muscle_stiffness__Group__0 ) ) ;
    public final void rulemuscle_stiffness() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__Muscle_stiffness__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__Muscle_stiffness__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__Muscle_stiffness__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__Muscle_stiffness__Group__0 )
            {
             before(grammarAccess.getMuscle_stiffnessAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__Muscle_stiffness__Group__0 )
            // InternalMyDsl.g:394:4: rule__Muscle_stiffness__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Muscle_stiffness__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMuscle_stiffnessAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulemuscle_stiffness"


    // $ANTLR start "entryRuleAlopecia"
    // InternalMyDsl.g:403:1: entryRuleAlopecia : ruleAlopecia EOF ;
    public final void entryRuleAlopecia() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleAlopecia EOF )
            // InternalMyDsl.g:405:1: ruleAlopecia EOF
            {
             before(grammarAccess.getAlopeciaRule()); 
            pushFollow(FOLLOW_1);
            ruleAlopecia();

            state._fsp--;

             after(grammarAccess.getAlopeciaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlopecia"


    // $ANTLR start "ruleAlopecia"
    // InternalMyDsl.g:412:1: ruleAlopecia : ( ( rule__Alopecia__Group__0 ) ) ;
    public final void ruleAlopecia() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Alopecia__Group__0 ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Alopecia__Group__0 ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Alopecia__Group__0 ) )
            // InternalMyDsl.g:418:3: ( rule__Alopecia__Group__0 )
            {
             before(grammarAccess.getAlopeciaAccess().getGroup()); 
            // InternalMyDsl.g:419:3: ( rule__Alopecia__Group__0 )
            // InternalMyDsl.g:419:4: rule__Alopecia__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Alopecia__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlopeciaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlopecia"


    // $ANTLR start "entryRuleObesity"
    // InternalMyDsl.g:428:1: entryRuleObesity : ruleObesity EOF ;
    public final void entryRuleObesity() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleObesity EOF )
            // InternalMyDsl.g:430:1: ruleObesity EOF
            {
             before(grammarAccess.getObesityRule()); 
            pushFollow(FOLLOW_1);
            ruleObesity();

            state._fsp--;

             after(grammarAccess.getObesityRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleObesity"


    // $ANTLR start "ruleObesity"
    // InternalMyDsl.g:437:1: ruleObesity : ( ( rule__Obesity__Group__0 ) ) ;
    public final void ruleObesity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__Obesity__Group__0 ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__Obesity__Group__0 ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__Obesity__Group__0 ) )
            // InternalMyDsl.g:443:3: ( rule__Obesity__Group__0 )
            {
             before(grammarAccess.getObesityAccess().getGroup()); 
            // InternalMyDsl.g:444:3: ( rule__Obesity__Group__0 )
            // InternalMyDsl.g:444:4: rule__Obesity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Obesity__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getObesityAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleObesity"


    // $ANTLR start "entryRuleSugar_Test"
    // InternalMyDsl.g:453:1: entryRuleSugar_Test : ruleSugar_Test EOF ;
    public final void entryRuleSugar_Test() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleSugar_Test EOF )
            // InternalMyDsl.g:455:1: ruleSugar_Test EOF
            {
             before(grammarAccess.getSugar_TestRule()); 
            pushFollow(FOLLOW_1);
            ruleSugar_Test();

            state._fsp--;

             after(grammarAccess.getSugar_TestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSugar_Test"


    // $ANTLR start "ruleSugar_Test"
    // InternalMyDsl.g:462:1: ruleSugar_Test : ( ( rule__Sugar_Test__Group__0 ) ) ;
    public final void ruleSugar_Test() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__Sugar_Test__Group__0 ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__Sugar_Test__Group__0 ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__Sugar_Test__Group__0 ) )
            // InternalMyDsl.g:468:3: ( rule__Sugar_Test__Group__0 )
            {
             before(grammarAccess.getSugar_TestAccess().getGroup()); 
            // InternalMyDsl.g:469:3: ( rule__Sugar_Test__Group__0 )
            // InternalMyDsl.g:469:4: rule__Sugar_Test__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSugar_TestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSugar_Test"


    // $ANTLR start "entryRuleDoctor"
    // InternalMyDsl.g:478:1: entryRuleDoctor : ruleDoctor EOF ;
    public final void entryRuleDoctor() throws RecognitionException {
        try {
            // InternalMyDsl.g:479:1: ( ruleDoctor EOF )
            // InternalMyDsl.g:480:1: ruleDoctor EOF
            {
             before(grammarAccess.getDoctorRule()); 
            pushFollow(FOLLOW_1);
            ruleDoctor();

            state._fsp--;

             after(grammarAccess.getDoctorRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDoctor"


    // $ANTLR start "ruleDoctor"
    // InternalMyDsl.g:487:1: ruleDoctor : ( ( rule__Doctor__Group__0 ) ) ;
    public final void ruleDoctor() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:491:2: ( ( ( rule__Doctor__Group__0 ) ) )
            // InternalMyDsl.g:492:2: ( ( rule__Doctor__Group__0 ) )
            {
            // InternalMyDsl.g:492:2: ( ( rule__Doctor__Group__0 ) )
            // InternalMyDsl.g:493:3: ( rule__Doctor__Group__0 )
            {
             before(grammarAccess.getDoctorAccess().getGroup()); 
            // InternalMyDsl.g:494:3: ( rule__Doctor__Group__0 )
            // InternalMyDsl.g:494:4: rule__Doctor__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Doctor__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDoctorAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDoctor"


    // $ANTLR start "entryRulePatient"
    // InternalMyDsl.g:503:1: entryRulePatient : rulePatient EOF ;
    public final void entryRulePatient() throws RecognitionException {
        try {
            // InternalMyDsl.g:504:1: ( rulePatient EOF )
            // InternalMyDsl.g:505:1: rulePatient EOF
            {
             before(grammarAccess.getPatientRule()); 
            pushFollow(FOLLOW_1);
            rulePatient();

            state._fsp--;

             after(grammarAccess.getPatientRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePatient"


    // $ANTLR start "rulePatient"
    // InternalMyDsl.g:512:1: rulePatient : ( ( rule__Patient__Group__0 ) ) ;
    public final void rulePatient() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:516:2: ( ( ( rule__Patient__Group__0 ) ) )
            // InternalMyDsl.g:517:2: ( ( rule__Patient__Group__0 ) )
            {
            // InternalMyDsl.g:517:2: ( ( rule__Patient__Group__0 ) )
            // InternalMyDsl.g:518:3: ( rule__Patient__Group__0 )
            {
             before(grammarAccess.getPatientAccess().getGroup()); 
            // InternalMyDsl.g:519:3: ( rule__Patient__Group__0 )
            // InternalMyDsl.g:519:4: rule__Patient__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePatient"


    // $ANTLR start "entryRulePredict_diabetes"
    // InternalMyDsl.g:528:1: entryRulePredict_diabetes : rulePredict_diabetes EOF ;
    public final void entryRulePredict_diabetes() throws RecognitionException {
        try {
            // InternalMyDsl.g:529:1: ( rulePredict_diabetes EOF )
            // InternalMyDsl.g:530:1: rulePredict_diabetes EOF
            {
             before(grammarAccess.getPredict_diabetesRule()); 
            pushFollow(FOLLOW_1);
            rulePredict_diabetes();

            state._fsp--;

             after(grammarAccess.getPredict_diabetesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePredict_diabetes"


    // $ANTLR start "rulePredict_diabetes"
    // InternalMyDsl.g:537:1: rulePredict_diabetes : ( ( rule__Predict_diabetes__Group__0 ) ) ;
    public final void rulePredict_diabetes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:541:2: ( ( ( rule__Predict_diabetes__Group__0 ) ) )
            // InternalMyDsl.g:542:2: ( ( rule__Predict_diabetes__Group__0 ) )
            {
            // InternalMyDsl.g:542:2: ( ( rule__Predict_diabetes__Group__0 ) )
            // InternalMyDsl.g:543:3: ( rule__Predict_diabetes__Group__0 )
            {
             before(grammarAccess.getPredict_diabetesAccess().getGroup()); 
            // InternalMyDsl.g:544:3: ( rule__Predict_diabetes__Group__0 )
            // InternalMyDsl.g:544:4: rule__Predict_diabetes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Predict_diabetes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPredict_diabetesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePredict_diabetes"


    // $ANTLR start "entryRuleMachine_learning_Algorithms"
    // InternalMyDsl.g:553:1: entryRuleMachine_learning_Algorithms : ruleMachine_learning_Algorithms EOF ;
    public final void entryRuleMachine_learning_Algorithms() throws RecognitionException {
        try {
            // InternalMyDsl.g:554:1: ( ruleMachine_learning_Algorithms EOF )
            // InternalMyDsl.g:555:1: ruleMachine_learning_Algorithms EOF
            {
             before(grammarAccess.getMachine_learning_AlgorithmsRule()); 
            pushFollow(FOLLOW_1);
            ruleMachine_learning_Algorithms();

            state._fsp--;

             after(grammarAccess.getMachine_learning_AlgorithmsRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMachine_learning_Algorithms"


    // $ANTLR start "ruleMachine_learning_Algorithms"
    // InternalMyDsl.g:562:1: ruleMachine_learning_Algorithms : ( ( rule__Machine_learning_Algorithms__Alternatives ) ) ;
    public final void ruleMachine_learning_Algorithms() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:566:2: ( ( ( rule__Machine_learning_Algorithms__Alternatives ) ) )
            // InternalMyDsl.g:567:2: ( ( rule__Machine_learning_Algorithms__Alternatives ) )
            {
            // InternalMyDsl.g:567:2: ( ( rule__Machine_learning_Algorithms__Alternatives ) )
            // InternalMyDsl.g:568:3: ( rule__Machine_learning_Algorithms__Alternatives )
            {
             before(grammarAccess.getMachine_learning_AlgorithmsAccess().getAlternatives()); 
            // InternalMyDsl.g:569:3: ( rule__Machine_learning_Algorithms__Alternatives )
            // InternalMyDsl.g:569:4: rule__Machine_learning_Algorithms__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Machine_learning_Algorithms__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMachine_learning_AlgorithmsAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMachine_learning_Algorithms"


    // $ANTLR start "entryRuleRandom_forest"
    // InternalMyDsl.g:578:1: entryRuleRandom_forest : ruleRandom_forest EOF ;
    public final void entryRuleRandom_forest() throws RecognitionException {
        try {
            // InternalMyDsl.g:579:1: ( ruleRandom_forest EOF )
            // InternalMyDsl.g:580:1: ruleRandom_forest EOF
            {
             before(grammarAccess.getRandom_forestRule()); 
            pushFollow(FOLLOW_1);
            ruleRandom_forest();

            state._fsp--;

             after(grammarAccess.getRandom_forestRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRandom_forest"


    // $ANTLR start "ruleRandom_forest"
    // InternalMyDsl.g:587:1: ruleRandom_forest : ( ( rule__Random_forest__Group__0 ) ) ;
    public final void ruleRandom_forest() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:2: ( ( ( rule__Random_forest__Group__0 ) ) )
            // InternalMyDsl.g:592:2: ( ( rule__Random_forest__Group__0 ) )
            {
            // InternalMyDsl.g:592:2: ( ( rule__Random_forest__Group__0 ) )
            // InternalMyDsl.g:593:3: ( rule__Random_forest__Group__0 )
            {
             before(grammarAccess.getRandom_forestAccess().getGroup()); 
            // InternalMyDsl.g:594:3: ( rule__Random_forest__Group__0 )
            // InternalMyDsl.g:594:4: rule__Random_forest__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Random_forest__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRandom_forestAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRandom_forest"


    // $ANTLR start "entryRuleSVM_Classifier"
    // InternalMyDsl.g:603:1: entryRuleSVM_Classifier : ruleSVM_Classifier EOF ;
    public final void entryRuleSVM_Classifier() throws RecognitionException {
        try {
            // InternalMyDsl.g:604:1: ( ruleSVM_Classifier EOF )
            // InternalMyDsl.g:605:1: ruleSVM_Classifier EOF
            {
             before(grammarAccess.getSVM_ClassifierRule()); 
            pushFollow(FOLLOW_1);
            ruleSVM_Classifier();

            state._fsp--;

             after(grammarAccess.getSVM_ClassifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSVM_Classifier"


    // $ANTLR start "ruleSVM_Classifier"
    // InternalMyDsl.g:612:1: ruleSVM_Classifier : ( ( rule__SVM_Classifier__Group__0 ) ) ;
    public final void ruleSVM_Classifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:2: ( ( ( rule__SVM_Classifier__Group__0 ) ) )
            // InternalMyDsl.g:617:2: ( ( rule__SVM_Classifier__Group__0 ) )
            {
            // InternalMyDsl.g:617:2: ( ( rule__SVM_Classifier__Group__0 ) )
            // InternalMyDsl.g:618:3: ( rule__SVM_Classifier__Group__0 )
            {
             before(grammarAccess.getSVM_ClassifierAccess().getGroup()); 
            // InternalMyDsl.g:619:3: ( rule__SVM_Classifier__Group__0 )
            // InternalMyDsl.g:619:4: rule__SVM_Classifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSVM_ClassifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSVM_Classifier"


    // $ANTLR start "entryRuleJ48Classifier"
    // InternalMyDsl.g:628:1: entryRuleJ48Classifier : ruleJ48Classifier EOF ;
    public final void entryRuleJ48Classifier() throws RecognitionException {
        try {
            // InternalMyDsl.g:629:1: ( ruleJ48Classifier EOF )
            // InternalMyDsl.g:630:1: ruleJ48Classifier EOF
            {
             before(grammarAccess.getJ48ClassifierRule()); 
            pushFollow(FOLLOW_1);
            ruleJ48Classifier();

            state._fsp--;

             after(grammarAccess.getJ48ClassifierRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleJ48Classifier"


    // $ANTLR start "ruleJ48Classifier"
    // InternalMyDsl.g:637:1: ruleJ48Classifier : ( ( rule__J48Classifier__Group__0 ) ) ;
    public final void ruleJ48Classifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:641:2: ( ( ( rule__J48Classifier__Group__0 ) ) )
            // InternalMyDsl.g:642:2: ( ( rule__J48Classifier__Group__0 ) )
            {
            // InternalMyDsl.g:642:2: ( ( rule__J48Classifier__Group__0 ) )
            // InternalMyDsl.g:643:3: ( rule__J48Classifier__Group__0 )
            {
             before(grammarAccess.getJ48ClassifierAccess().getGroup()); 
            // InternalMyDsl.g:644:3: ( rule__J48Classifier__Group__0 )
            // InternalMyDsl.g:644:4: rule__J48Classifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__J48Classifier__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJ48ClassifierAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleJ48Classifier"


    // $ANTLR start "entryRuleNavieBayes"
    // InternalMyDsl.g:653:1: entryRuleNavieBayes : ruleNavieBayes EOF ;
    public final void entryRuleNavieBayes() throws RecognitionException {
        try {
            // InternalMyDsl.g:654:1: ( ruleNavieBayes EOF )
            // InternalMyDsl.g:655:1: ruleNavieBayes EOF
            {
             before(grammarAccess.getNavieBayesRule()); 
            pushFollow(FOLLOW_1);
            ruleNavieBayes();

            state._fsp--;

             after(grammarAccess.getNavieBayesRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNavieBayes"


    // $ANTLR start "ruleNavieBayes"
    // InternalMyDsl.g:662:1: ruleNavieBayes : ( ( rule__NavieBayes__Group__0 ) ) ;
    public final void ruleNavieBayes() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:666:2: ( ( ( rule__NavieBayes__Group__0 ) ) )
            // InternalMyDsl.g:667:2: ( ( rule__NavieBayes__Group__0 ) )
            {
            // InternalMyDsl.g:667:2: ( ( rule__NavieBayes__Group__0 ) )
            // InternalMyDsl.g:668:3: ( rule__NavieBayes__Group__0 )
            {
             before(grammarAccess.getNavieBayesAccess().getGroup()); 
            // InternalMyDsl.g:669:3: ( rule__NavieBayes__Group__0 )
            // InternalMyDsl.g:669:4: rule__NavieBayes__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__NavieBayes__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getNavieBayesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNavieBayes"


    // $ANTLR start "rule__Symptom__Alternatives"
    // InternalMyDsl.g:677:1: rule__Symptom__Alternatives : ( ( rulePolyuria ) | ( rulePolydipsia ) | ( rulesudden_weight_loss ) | ( rulePolyphagia ) | ( ruleGenital_thrush ) | ( rulevisual_blurring ) | ( ruleItching ) | ( ruleIrritability ) | ( ruledelayed_healing ) | ( rulepartial_paresis ) | ( rulemuscle_stiffness ) | ( ruleAlopecia ) | ( ruleObesity ) );
    public final void rule__Symptom__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:681:1: ( ( rulePolyuria ) | ( rulePolydipsia ) | ( rulesudden_weight_loss ) | ( rulePolyphagia ) | ( ruleGenital_thrush ) | ( rulevisual_blurring ) | ( ruleItching ) | ( ruleIrritability ) | ( ruledelayed_healing ) | ( rulepartial_paresis ) | ( rulemuscle_stiffness ) | ( ruleAlopecia ) | ( ruleObesity ) )
            int alt1=13;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt1=1;
                }
                break;
            case 16:
                {
                alt1=2;
                }
                break;
            case 17:
                {
                alt1=3;
                }
                break;
            case 18:
                {
                alt1=4;
                }
                break;
            case 19:
                {
                alt1=5;
                }
                break;
            case 20:
                {
                alt1=6;
                }
                break;
            case 21:
                {
                alt1=7;
                }
                break;
            case 22:
                {
                alt1=8;
                }
                break;
            case 23:
                {
                alt1=9;
                }
                break;
            case 24:
                {
                alt1=10;
                }
                break;
            case 25:
                {
                alt1=11;
                }
                break;
            case 26:
                {
                alt1=12;
                }
                break;
            case 27:
                {
                alt1=13;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:682:2: ( rulePolyuria )
                    {
                    // InternalMyDsl.g:682:2: ( rulePolyuria )
                    // InternalMyDsl.g:683:3: rulePolyuria
                    {
                     before(grammarAccess.getSymptomAccess().getPolyuriaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePolyuria();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getPolyuriaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:688:2: ( rulePolydipsia )
                    {
                    // InternalMyDsl.g:688:2: ( rulePolydipsia )
                    // InternalMyDsl.g:689:3: rulePolydipsia
                    {
                     before(grammarAccess.getSymptomAccess().getPolydipsiaParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePolydipsia();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getPolydipsiaParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:694:2: ( rulesudden_weight_loss )
                    {
                    // InternalMyDsl.g:694:2: ( rulesudden_weight_loss )
                    // InternalMyDsl.g:695:3: rulesudden_weight_loss
                    {
                     before(grammarAccess.getSymptomAccess().getSudden_weight_lossParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    rulesudden_weight_loss();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getSudden_weight_lossParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:700:2: ( rulePolyphagia )
                    {
                    // InternalMyDsl.g:700:2: ( rulePolyphagia )
                    // InternalMyDsl.g:701:3: rulePolyphagia
                    {
                     before(grammarAccess.getSymptomAccess().getPolyphagiaParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    rulePolyphagia();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getPolyphagiaParserRuleCall_3()); 

                    }


                    }
                    break;
                case 5 :
                    // InternalMyDsl.g:706:2: ( ruleGenital_thrush )
                    {
                    // InternalMyDsl.g:706:2: ( ruleGenital_thrush )
                    // InternalMyDsl.g:707:3: ruleGenital_thrush
                    {
                     before(grammarAccess.getSymptomAccess().getGenital_thrushParserRuleCall_4()); 
                    pushFollow(FOLLOW_2);
                    ruleGenital_thrush();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getGenital_thrushParserRuleCall_4()); 

                    }


                    }
                    break;
                case 6 :
                    // InternalMyDsl.g:712:2: ( rulevisual_blurring )
                    {
                    // InternalMyDsl.g:712:2: ( rulevisual_blurring )
                    // InternalMyDsl.g:713:3: rulevisual_blurring
                    {
                     before(grammarAccess.getSymptomAccess().getVisual_blurringParserRuleCall_5()); 
                    pushFollow(FOLLOW_2);
                    rulevisual_blurring();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getVisual_blurringParserRuleCall_5()); 

                    }


                    }
                    break;
                case 7 :
                    // InternalMyDsl.g:718:2: ( ruleItching )
                    {
                    // InternalMyDsl.g:718:2: ( ruleItching )
                    // InternalMyDsl.g:719:3: ruleItching
                    {
                     before(grammarAccess.getSymptomAccess().getItchingParserRuleCall_6()); 
                    pushFollow(FOLLOW_2);
                    ruleItching();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getItchingParserRuleCall_6()); 

                    }


                    }
                    break;
                case 8 :
                    // InternalMyDsl.g:724:2: ( ruleIrritability )
                    {
                    // InternalMyDsl.g:724:2: ( ruleIrritability )
                    // InternalMyDsl.g:725:3: ruleIrritability
                    {
                     before(grammarAccess.getSymptomAccess().getIrritabilityParserRuleCall_7()); 
                    pushFollow(FOLLOW_2);
                    ruleIrritability();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getIrritabilityParserRuleCall_7()); 

                    }


                    }
                    break;
                case 9 :
                    // InternalMyDsl.g:730:2: ( ruledelayed_healing )
                    {
                    // InternalMyDsl.g:730:2: ( ruledelayed_healing )
                    // InternalMyDsl.g:731:3: ruledelayed_healing
                    {
                     before(grammarAccess.getSymptomAccess().getDelayed_healingParserRuleCall_8()); 
                    pushFollow(FOLLOW_2);
                    ruledelayed_healing();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getDelayed_healingParserRuleCall_8()); 

                    }


                    }
                    break;
                case 10 :
                    // InternalMyDsl.g:736:2: ( rulepartial_paresis )
                    {
                    // InternalMyDsl.g:736:2: ( rulepartial_paresis )
                    // InternalMyDsl.g:737:3: rulepartial_paresis
                    {
                     before(grammarAccess.getSymptomAccess().getPartial_paresisParserRuleCall_9()); 
                    pushFollow(FOLLOW_2);
                    rulepartial_paresis();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getPartial_paresisParserRuleCall_9()); 

                    }


                    }
                    break;
                case 11 :
                    // InternalMyDsl.g:742:2: ( rulemuscle_stiffness )
                    {
                    // InternalMyDsl.g:742:2: ( rulemuscle_stiffness )
                    // InternalMyDsl.g:743:3: rulemuscle_stiffness
                    {
                     before(grammarAccess.getSymptomAccess().getMuscle_stiffnessParserRuleCall_10()); 
                    pushFollow(FOLLOW_2);
                    rulemuscle_stiffness();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getMuscle_stiffnessParserRuleCall_10()); 

                    }


                    }
                    break;
                case 12 :
                    // InternalMyDsl.g:748:2: ( ruleAlopecia )
                    {
                    // InternalMyDsl.g:748:2: ( ruleAlopecia )
                    // InternalMyDsl.g:749:3: ruleAlopecia
                    {
                     before(grammarAccess.getSymptomAccess().getAlopeciaParserRuleCall_11()); 
                    pushFollow(FOLLOW_2);
                    ruleAlopecia();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getAlopeciaParserRuleCall_11()); 

                    }


                    }
                    break;
                case 13 :
                    // InternalMyDsl.g:754:2: ( ruleObesity )
                    {
                    // InternalMyDsl.g:754:2: ( ruleObesity )
                    // InternalMyDsl.g:755:3: ruleObesity
                    {
                     before(grammarAccess.getSymptomAccess().getObesityParserRuleCall_12()); 
                    pushFollow(FOLLOW_2);
                    ruleObesity();

                    state._fsp--;

                     after(grammarAccess.getSymptomAccess().getObesityParserRuleCall_12()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Symptom__Alternatives"


    // $ANTLR start "rule__Machine_learning_Algorithms__Alternatives"
    // InternalMyDsl.g:764:1: rule__Machine_learning_Algorithms__Alternatives : ( ( ruleRandom_forest ) | ( ruleSVM_Classifier ) | ( ruleJ48Classifier ) | ( ruleNavieBayes ) );
    public final void rule__Machine_learning_Algorithms__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:768:1: ( ( ruleRandom_forest ) | ( ruleSVM_Classifier ) | ( ruleJ48Classifier ) | ( ruleNavieBayes ) )
            int alt2=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt2=1;
                }
                break;
            case 44:
                {
                alt2=2;
                }
                break;
            case 46:
                {
                alt2=3;
                }
                break;
            case 48:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:769:2: ( ruleRandom_forest )
                    {
                    // InternalMyDsl.g:769:2: ( ruleRandom_forest )
                    // InternalMyDsl.g:770:3: ruleRandom_forest
                    {
                     before(grammarAccess.getMachine_learning_AlgorithmsAccess().getRandom_forestParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleRandom_forest();

                    state._fsp--;

                     after(grammarAccess.getMachine_learning_AlgorithmsAccess().getRandom_forestParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:775:2: ( ruleSVM_Classifier )
                    {
                    // InternalMyDsl.g:775:2: ( ruleSVM_Classifier )
                    // InternalMyDsl.g:776:3: ruleSVM_Classifier
                    {
                     before(grammarAccess.getMachine_learning_AlgorithmsAccess().getSVM_ClassifierParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleSVM_Classifier();

                    state._fsp--;

                     after(grammarAccess.getMachine_learning_AlgorithmsAccess().getSVM_ClassifierParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:781:2: ( ruleJ48Classifier )
                    {
                    // InternalMyDsl.g:781:2: ( ruleJ48Classifier )
                    // InternalMyDsl.g:782:3: ruleJ48Classifier
                    {
                     before(grammarAccess.getMachine_learning_AlgorithmsAccess().getJ48ClassifierParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleJ48Classifier();

                    state._fsp--;

                     after(grammarAccess.getMachine_learning_AlgorithmsAccess().getJ48ClassifierParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:787:2: ( ruleNavieBayes )
                    {
                    // InternalMyDsl.g:787:2: ( ruleNavieBayes )
                    // InternalMyDsl.g:788:3: ruleNavieBayes
                    {
                     before(grammarAccess.getMachine_learning_AlgorithmsAccess().getNavieBayesParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleNavieBayes();

                    state._fsp--;

                     after(grammarAccess.getMachine_learning_AlgorithmsAccess().getNavieBayesParserRuleCall_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Machine_learning_Algorithms__Alternatives"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__0"
    // InternalMyDsl.g:797:1: rule__Diabetes_Prediction_System__Group__0 : rule__Diabetes_Prediction_System__Group__0__Impl rule__Diabetes_Prediction_System__Group__1 ;
    public final void rule__Diabetes_Prediction_System__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:801:1: ( rule__Diabetes_Prediction_System__Group__0__Impl rule__Diabetes_Prediction_System__Group__1 )
            // InternalMyDsl.g:802:2: rule__Diabetes_Prediction_System__Group__0__Impl rule__Diabetes_Prediction_System__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Diabetes_Prediction_System__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__0"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__0__Impl"
    // InternalMyDsl.g:809:1: rule__Diabetes_Prediction_System__Group__0__Impl : ( 'Diabetes_prediction_System:' ) ;
    public final void rule__Diabetes_Prediction_System__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:813:1: ( ( 'Diabetes_prediction_System:' ) )
            // InternalMyDsl.g:814:1: ( 'Diabetes_prediction_System:' )
            {
            // InternalMyDsl.g:814:1: ( 'Diabetes_prediction_System:' )
            // InternalMyDsl.g:815:2: 'Diabetes_prediction_System:'
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getDiabetes_prediction_SystemKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getDiabetes_prediction_SystemKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__0__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__1"
    // InternalMyDsl.g:824:1: rule__Diabetes_Prediction_System__Group__1 : rule__Diabetes_Prediction_System__Group__1__Impl rule__Diabetes_Prediction_System__Group__2 ;
    public final void rule__Diabetes_Prediction_System__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:828:1: ( rule__Diabetes_Prediction_System__Group__1__Impl rule__Diabetes_Prediction_System__Group__2 )
            // InternalMyDsl.g:829:2: rule__Diabetes_Prediction_System__Group__1__Impl rule__Diabetes_Prediction_System__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Diabetes_Prediction_System__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__1"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__1__Impl"
    // InternalMyDsl.g:836:1: rule__Diabetes_Prediction_System__Group__1__Impl : ( ( rule__Diabetes_Prediction_System__NameAssignment_1 ) ) ;
    public final void rule__Diabetes_Prediction_System__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:840:1: ( ( ( rule__Diabetes_Prediction_System__NameAssignment_1 ) ) )
            // InternalMyDsl.g:841:1: ( ( rule__Diabetes_Prediction_System__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:841:1: ( ( rule__Diabetes_Prediction_System__NameAssignment_1 ) )
            // InternalMyDsl.g:842:2: ( rule__Diabetes_Prediction_System__NameAssignment_1 )
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:843:2: ( rule__Diabetes_Prediction_System__NameAssignment_1 )
            // InternalMyDsl.g:843:3: rule__Diabetes_Prediction_System__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__1__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__2"
    // InternalMyDsl.g:851:1: rule__Diabetes_Prediction_System__Group__2 : rule__Diabetes_Prediction_System__Group__2__Impl rule__Diabetes_Prediction_System__Group__3 ;
    public final void rule__Diabetes_Prediction_System__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:855:1: ( rule__Diabetes_Prediction_System__Group__2__Impl rule__Diabetes_Prediction_System__Group__3 )
            // InternalMyDsl.g:856:2: rule__Diabetes_Prediction_System__Group__2__Impl rule__Diabetes_Prediction_System__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Diabetes_Prediction_System__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__2"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__2__Impl"
    // InternalMyDsl.g:863:1: rule__Diabetes_Prediction_System__Group__2__Impl : ( ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )* ) ;
    public final void rule__Diabetes_Prediction_System__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:867:1: ( ( ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )* ) )
            // InternalMyDsl.g:868:1: ( ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )* )
            {
            // InternalMyDsl.g:868:1: ( ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )* )
            // InternalMyDsl.g:869:2: ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )*
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getMedicinesAssignment_2()); 
            // InternalMyDsl.g:870:2: ( rule__Diabetes_Prediction_System__MedicinesAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==12) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMyDsl.g:870:3: rule__Diabetes_Prediction_System__MedicinesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Diabetes_Prediction_System__MedicinesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getMedicinesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__2__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__3"
    // InternalMyDsl.g:878:1: rule__Diabetes_Prediction_System__Group__3 : rule__Diabetes_Prediction_System__Group__3__Impl rule__Diabetes_Prediction_System__Group__4 ;
    public final void rule__Diabetes_Prediction_System__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:882:1: ( rule__Diabetes_Prediction_System__Group__3__Impl rule__Diabetes_Prediction_System__Group__4 )
            // InternalMyDsl.g:883:2: rule__Diabetes_Prediction_System__Group__3__Impl rule__Diabetes_Prediction_System__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__Diabetes_Prediction_System__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__3"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__3__Impl"
    // InternalMyDsl.g:890:1: rule__Diabetes_Prediction_System__Group__3__Impl : ( ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )* ) ;
    public final void rule__Diabetes_Prediction_System__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:894:1: ( ( ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )* ) )
            // InternalMyDsl.g:895:1: ( ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )* )
            {
            // InternalMyDsl.g:895:1: ( ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )* )
            // InternalMyDsl.g:896:2: ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )*
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getSymptomAssignment_3()); 
            // InternalMyDsl.g:897:2: ( rule__Diabetes_Prediction_System__SymptomAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||(LA4_0>=16 && LA4_0<=27)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMyDsl.g:897:3: rule__Diabetes_Prediction_System__SymptomAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Diabetes_Prediction_System__SymptomAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getSymptomAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__3__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__4"
    // InternalMyDsl.g:905:1: rule__Diabetes_Prediction_System__Group__4 : rule__Diabetes_Prediction_System__Group__4__Impl rule__Diabetes_Prediction_System__Group__5 ;
    public final void rule__Diabetes_Prediction_System__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:909:1: ( rule__Diabetes_Prediction_System__Group__4__Impl rule__Diabetes_Prediction_System__Group__5 )
            // InternalMyDsl.g:910:2: rule__Diabetes_Prediction_System__Group__4__Impl rule__Diabetes_Prediction_System__Group__5
            {
            pushFollow(FOLLOW_4);
            rule__Diabetes_Prediction_System__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__4"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__4__Impl"
    // InternalMyDsl.g:917:1: rule__Diabetes_Prediction_System__Group__4__Impl : ( ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )* ) ;
    public final void rule__Diabetes_Prediction_System__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:921:1: ( ( ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )* ) )
            // InternalMyDsl.g:922:1: ( ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )* )
            {
            // InternalMyDsl.g:922:1: ( ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )* )
            // InternalMyDsl.g:923:2: ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )*
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getDoctorsAssignment_4()); 
            // InternalMyDsl.g:924:2: ( rule__Diabetes_Prediction_System__DoctorsAssignment_4 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==31) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:924:3: rule__Diabetes_Prediction_System__DoctorsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__Diabetes_Prediction_System__DoctorsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getDoctorsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__4__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__5"
    // InternalMyDsl.g:932:1: rule__Diabetes_Prediction_System__Group__5 : rule__Diabetes_Prediction_System__Group__5__Impl rule__Diabetes_Prediction_System__Group__6 ;
    public final void rule__Diabetes_Prediction_System__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:936:1: ( rule__Diabetes_Prediction_System__Group__5__Impl rule__Diabetes_Prediction_System__Group__6 )
            // InternalMyDsl.g:937:2: rule__Diabetes_Prediction_System__Group__5__Impl rule__Diabetes_Prediction_System__Group__6
            {
            pushFollow(FOLLOW_4);
            rule__Diabetes_Prediction_System__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__5"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__5__Impl"
    // InternalMyDsl.g:944:1: rule__Diabetes_Prediction_System__Group__5__Impl : ( ( rule__Diabetes_Prediction_System__PatientAssignment_5 )* ) ;
    public final void rule__Diabetes_Prediction_System__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:948:1: ( ( ( rule__Diabetes_Prediction_System__PatientAssignment_5 )* ) )
            // InternalMyDsl.g:949:1: ( ( rule__Diabetes_Prediction_System__PatientAssignment_5 )* )
            {
            // InternalMyDsl.g:949:1: ( ( rule__Diabetes_Prediction_System__PatientAssignment_5 )* )
            // InternalMyDsl.g:950:2: ( rule__Diabetes_Prediction_System__PatientAssignment_5 )*
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getPatientAssignment_5()); 
            // InternalMyDsl.g:951:2: ( rule__Diabetes_Prediction_System__PatientAssignment_5 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==33) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:951:3: rule__Diabetes_Prediction_System__PatientAssignment_5
            	    {
            	    pushFollow(FOLLOW_8);
            	    rule__Diabetes_Prediction_System__PatientAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getPatientAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__5__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__6"
    // InternalMyDsl.g:959:1: rule__Diabetes_Prediction_System__Group__6 : rule__Diabetes_Prediction_System__Group__6__Impl ;
    public final void rule__Diabetes_Prediction_System__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:963:1: ( rule__Diabetes_Prediction_System__Group__6__Impl )
            // InternalMyDsl.g:964:2: rule__Diabetes_Prediction_System__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Diabetes_Prediction_System__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__6"


    // $ANTLR start "rule__Diabetes_Prediction_System__Group__6__Impl"
    // InternalMyDsl.g:970:1: rule__Diabetes_Prediction_System__Group__6__Impl : ( ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) ) ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* ) ) ;
    public final void rule__Diabetes_Prediction_System__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:974:1: ( ( ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) ) ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* ) ) )
            // InternalMyDsl.g:975:1: ( ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) ) ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* ) )
            {
            // InternalMyDsl.g:975:1: ( ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) ) ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* ) )
            // InternalMyDsl.g:976:2: ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) ) ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* )
            {
            // InternalMyDsl.g:976:2: ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 ) )
            // InternalMyDsl.g:977:3: ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsAssignment_6()); 
            // InternalMyDsl.g:978:3: ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )
            // InternalMyDsl.g:978:4: rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6
            {
            pushFollow(FOLLOW_9);
            rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsAssignment_6()); 

            }

            // InternalMyDsl.g:981:2: ( ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )* )
            // InternalMyDsl.g:982:3: ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )*
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsAssignment_6()); 
            // InternalMyDsl.g:983:3: ( rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==42||LA7_0==44||LA7_0==46||LA7_0==48) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMyDsl.g:983:4: rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsAssignment_6()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Group__6__Impl"


    // $ANTLR start "rule__Medicines__Group__0"
    // InternalMyDsl.g:993:1: rule__Medicines__Group__0 : rule__Medicines__Group__0__Impl rule__Medicines__Group__1 ;
    public final void rule__Medicines__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( rule__Medicines__Group__0__Impl rule__Medicines__Group__1 )
            // InternalMyDsl.g:998:2: rule__Medicines__Group__0__Impl rule__Medicines__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Medicines__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Medicines__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__0"


    // $ANTLR start "rule__Medicines__Group__0__Impl"
    // InternalMyDsl.g:1005:1: rule__Medicines__Group__0__Impl : ( 'Medicines' ) ;
    public final void rule__Medicines__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( ( 'Medicines' ) )
            // InternalMyDsl.g:1010:1: ( 'Medicines' )
            {
            // InternalMyDsl.g:1010:1: ( 'Medicines' )
            // InternalMyDsl.g:1011:2: 'Medicines'
            {
             before(grammarAccess.getMedicinesAccess().getMedicinesKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMedicinesAccess().getMedicinesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__0__Impl"


    // $ANTLR start "rule__Medicines__Group__1"
    // InternalMyDsl.g:1020:1: rule__Medicines__Group__1 : rule__Medicines__Group__1__Impl rule__Medicines__Group__2 ;
    public final void rule__Medicines__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1024:1: ( rule__Medicines__Group__1__Impl rule__Medicines__Group__2 )
            // InternalMyDsl.g:1025:2: rule__Medicines__Group__1__Impl rule__Medicines__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Medicines__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Medicines__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__1"


    // $ANTLR start "rule__Medicines__Group__1__Impl"
    // InternalMyDsl.g:1032:1: rule__Medicines__Group__1__Impl : ( ( rule__Medicines__Medicine_nameAssignment_1 ) ) ;
    public final void rule__Medicines__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( ( ( rule__Medicines__Medicine_nameAssignment_1 ) ) )
            // InternalMyDsl.g:1037:1: ( ( rule__Medicines__Medicine_nameAssignment_1 ) )
            {
            // InternalMyDsl.g:1037:1: ( ( rule__Medicines__Medicine_nameAssignment_1 ) )
            // InternalMyDsl.g:1038:2: ( rule__Medicines__Medicine_nameAssignment_1 )
            {
             before(grammarAccess.getMedicinesAccess().getMedicine_nameAssignment_1()); 
            // InternalMyDsl.g:1039:2: ( rule__Medicines__Medicine_nameAssignment_1 )
            // InternalMyDsl.g:1039:3: rule__Medicines__Medicine_nameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Medicines__Medicine_nameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMedicinesAccess().getMedicine_nameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__1__Impl"


    // $ANTLR start "rule__Medicines__Group__2"
    // InternalMyDsl.g:1047:1: rule__Medicines__Group__2 : rule__Medicines__Group__2__Impl rule__Medicines__Group__3 ;
    public final void rule__Medicines__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( rule__Medicines__Group__2__Impl rule__Medicines__Group__3 )
            // InternalMyDsl.g:1052:2: rule__Medicines__Group__2__Impl rule__Medicines__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Medicines__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Medicines__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__2"


    // $ANTLR start "rule__Medicines__Group__2__Impl"
    // InternalMyDsl.g:1059:1: rule__Medicines__Group__2__Impl : ( 'Medicine_dossage:' ) ;
    public final void rule__Medicines__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( ( 'Medicine_dossage:' ) )
            // InternalMyDsl.g:1064:1: ( 'Medicine_dossage:' )
            {
            // InternalMyDsl.g:1064:1: ( 'Medicine_dossage:' )
            // InternalMyDsl.g:1065:2: 'Medicine_dossage:'
            {
             before(grammarAccess.getMedicinesAccess().getMedicine_dossageKeyword_2()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getMedicinesAccess().getMedicine_dossageKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__2__Impl"


    // $ANTLR start "rule__Medicines__Group__3"
    // InternalMyDsl.g:1074:1: rule__Medicines__Group__3 : rule__Medicines__Group__3__Impl ;
    public final void rule__Medicines__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1078:1: ( rule__Medicines__Group__3__Impl )
            // InternalMyDsl.g:1079:2: rule__Medicines__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Medicines__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__3"


    // $ANTLR start "rule__Medicines__Group__3__Impl"
    // InternalMyDsl.g:1085:1: rule__Medicines__Group__3__Impl : ( ( rule__Medicines__Medicine_dossageAssignment_3 ) ) ;
    public final void rule__Medicines__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1089:1: ( ( ( rule__Medicines__Medicine_dossageAssignment_3 ) ) )
            // InternalMyDsl.g:1090:1: ( ( rule__Medicines__Medicine_dossageAssignment_3 ) )
            {
            // InternalMyDsl.g:1090:1: ( ( rule__Medicines__Medicine_dossageAssignment_3 ) )
            // InternalMyDsl.g:1091:2: ( rule__Medicines__Medicine_dossageAssignment_3 )
            {
             before(grammarAccess.getMedicinesAccess().getMedicine_dossageAssignment_3()); 
            // InternalMyDsl.g:1092:2: ( rule__Medicines__Medicine_dossageAssignment_3 )
            // InternalMyDsl.g:1092:3: rule__Medicines__Medicine_dossageAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Medicines__Medicine_dossageAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMedicinesAccess().getMedicine_dossageAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Group__3__Impl"


    // $ANTLR start "rule__Polyuria__Group__0"
    // InternalMyDsl.g:1101:1: rule__Polyuria__Group__0 : rule__Polyuria__Group__0__Impl rule__Polyuria__Group__1 ;
    public final void rule__Polyuria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( rule__Polyuria__Group__0__Impl rule__Polyuria__Group__1 )
            // InternalMyDsl.g:1106:2: rule__Polyuria__Group__0__Impl rule__Polyuria__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Polyuria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyuria__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__0"


    // $ANTLR start "rule__Polyuria__Group__0__Impl"
    // InternalMyDsl.g:1113:1: rule__Polyuria__Group__0__Impl : ( 'Polyuria' ) ;
    public final void rule__Polyuria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( ( 'Polyuria' ) )
            // InternalMyDsl.g:1118:1: ( 'Polyuria' )
            {
            // InternalMyDsl.g:1118:1: ( 'Polyuria' )
            // InternalMyDsl.g:1119:2: 'Polyuria'
            {
             before(grammarAccess.getPolyuriaAccess().getPolyuriaKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPolyuriaAccess().getPolyuriaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__0__Impl"


    // $ANTLR start "rule__Polyuria__Group__1"
    // InternalMyDsl.g:1128:1: rule__Polyuria__Group__1 : rule__Polyuria__Group__1__Impl rule__Polyuria__Group__2 ;
    public final void rule__Polyuria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1132:1: ( rule__Polyuria__Group__1__Impl rule__Polyuria__Group__2 )
            // InternalMyDsl.g:1133:2: rule__Polyuria__Group__1__Impl rule__Polyuria__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Polyuria__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyuria__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__1"


    // $ANTLR start "rule__Polyuria__Group__1__Impl"
    // InternalMyDsl.g:1140:1: rule__Polyuria__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Polyuria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1145:1: ( 'name:' )
            {
            // InternalMyDsl.g:1145:1: ( 'name:' )
            // InternalMyDsl.g:1146:2: 'name:'
            {
             before(grammarAccess.getPolyuriaAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPolyuriaAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__1__Impl"


    // $ANTLR start "rule__Polyuria__Group__2"
    // InternalMyDsl.g:1155:1: rule__Polyuria__Group__2 : rule__Polyuria__Group__2__Impl ;
    public final void rule__Polyuria__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1159:1: ( rule__Polyuria__Group__2__Impl )
            // InternalMyDsl.g:1160:2: rule__Polyuria__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polyuria__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__2"


    // $ANTLR start "rule__Polyuria__Group__2__Impl"
    // InternalMyDsl.g:1166:1: rule__Polyuria__Group__2__Impl : ( ( rule__Polyuria__NameAssignment_2 ) ) ;
    public final void rule__Polyuria__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1170:1: ( ( ( rule__Polyuria__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1171:1: ( ( rule__Polyuria__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1171:1: ( ( rule__Polyuria__NameAssignment_2 ) )
            // InternalMyDsl.g:1172:2: ( rule__Polyuria__NameAssignment_2 )
            {
             before(grammarAccess.getPolyuriaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1173:2: ( rule__Polyuria__NameAssignment_2 )
            // InternalMyDsl.g:1173:3: rule__Polyuria__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Polyuria__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolyuriaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__Group__2__Impl"


    // $ANTLR start "rule__Polydipsia__Group__0"
    // InternalMyDsl.g:1182:1: rule__Polydipsia__Group__0 : rule__Polydipsia__Group__0__Impl rule__Polydipsia__Group__1 ;
    public final void rule__Polydipsia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1186:1: ( rule__Polydipsia__Group__0__Impl rule__Polydipsia__Group__1 )
            // InternalMyDsl.g:1187:2: rule__Polydipsia__Group__0__Impl rule__Polydipsia__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Polydipsia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polydipsia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__0"


    // $ANTLR start "rule__Polydipsia__Group__0__Impl"
    // InternalMyDsl.g:1194:1: rule__Polydipsia__Group__0__Impl : ( 'Polydipsia' ) ;
    public final void rule__Polydipsia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( ( 'Polydipsia' ) )
            // InternalMyDsl.g:1199:1: ( 'Polydipsia' )
            {
            // InternalMyDsl.g:1199:1: ( 'Polydipsia' )
            // InternalMyDsl.g:1200:2: 'Polydipsia'
            {
             before(grammarAccess.getPolydipsiaAccess().getPolydipsiaKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPolydipsiaAccess().getPolydipsiaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__0__Impl"


    // $ANTLR start "rule__Polydipsia__Group__1"
    // InternalMyDsl.g:1209:1: rule__Polydipsia__Group__1 : rule__Polydipsia__Group__1__Impl rule__Polydipsia__Group__2 ;
    public final void rule__Polydipsia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1213:1: ( rule__Polydipsia__Group__1__Impl rule__Polydipsia__Group__2 )
            // InternalMyDsl.g:1214:2: rule__Polydipsia__Group__1__Impl rule__Polydipsia__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Polydipsia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polydipsia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__1"


    // $ANTLR start "rule__Polydipsia__Group__1__Impl"
    // InternalMyDsl.g:1221:1: rule__Polydipsia__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Polydipsia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1226:1: ( 'name:' )
            {
            // InternalMyDsl.g:1226:1: ( 'name:' )
            // InternalMyDsl.g:1227:2: 'name:'
            {
             before(grammarAccess.getPolydipsiaAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPolydipsiaAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__1__Impl"


    // $ANTLR start "rule__Polydipsia__Group__2"
    // InternalMyDsl.g:1236:1: rule__Polydipsia__Group__2 : rule__Polydipsia__Group__2__Impl ;
    public final void rule__Polydipsia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1240:1: ( rule__Polydipsia__Group__2__Impl )
            // InternalMyDsl.g:1241:2: rule__Polydipsia__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polydipsia__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__2"


    // $ANTLR start "rule__Polydipsia__Group__2__Impl"
    // InternalMyDsl.g:1247:1: rule__Polydipsia__Group__2__Impl : ( ( rule__Polydipsia__NameAssignment_2 ) ) ;
    public final void rule__Polydipsia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1251:1: ( ( ( rule__Polydipsia__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1252:1: ( ( rule__Polydipsia__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1252:1: ( ( rule__Polydipsia__NameAssignment_2 ) )
            // InternalMyDsl.g:1253:2: ( rule__Polydipsia__NameAssignment_2 )
            {
             before(grammarAccess.getPolydipsiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1254:2: ( rule__Polydipsia__NameAssignment_2 )
            // InternalMyDsl.g:1254:3: rule__Polydipsia__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Polydipsia__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolydipsiaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__Group__2__Impl"


    // $ANTLR start "rule__Sudden_weight_loss__Group__0"
    // InternalMyDsl.g:1263:1: rule__Sudden_weight_loss__Group__0 : rule__Sudden_weight_loss__Group__0__Impl rule__Sudden_weight_loss__Group__1 ;
    public final void rule__Sudden_weight_loss__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1267:1: ( rule__Sudden_weight_loss__Group__0__Impl rule__Sudden_weight_loss__Group__1 )
            // InternalMyDsl.g:1268:2: rule__Sudden_weight_loss__Group__0__Impl rule__Sudden_weight_loss__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Sudden_weight_loss__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sudden_weight_loss__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__0"


    // $ANTLR start "rule__Sudden_weight_loss__Group__0__Impl"
    // InternalMyDsl.g:1275:1: rule__Sudden_weight_loss__Group__0__Impl : ( 'sudden_weight_loss' ) ;
    public final void rule__Sudden_weight_loss__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( ( 'sudden_weight_loss' ) )
            // InternalMyDsl.g:1280:1: ( 'sudden_weight_loss' )
            {
            // InternalMyDsl.g:1280:1: ( 'sudden_weight_loss' )
            // InternalMyDsl.g:1281:2: 'sudden_weight_loss'
            {
             before(grammarAccess.getSudden_weight_lossAccess().getSudden_weight_lossKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getSudden_weight_lossAccess().getSudden_weight_lossKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__0__Impl"


    // $ANTLR start "rule__Sudden_weight_loss__Group__1"
    // InternalMyDsl.g:1290:1: rule__Sudden_weight_loss__Group__1 : rule__Sudden_weight_loss__Group__1__Impl rule__Sudden_weight_loss__Group__2 ;
    public final void rule__Sudden_weight_loss__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1294:1: ( rule__Sudden_weight_loss__Group__1__Impl rule__Sudden_weight_loss__Group__2 )
            // InternalMyDsl.g:1295:2: rule__Sudden_weight_loss__Group__1__Impl rule__Sudden_weight_loss__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Sudden_weight_loss__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sudden_weight_loss__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__1"


    // $ANTLR start "rule__Sudden_weight_loss__Group__1__Impl"
    // InternalMyDsl.g:1302:1: rule__Sudden_weight_loss__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Sudden_weight_loss__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1307:1: ( 'name:' )
            {
            // InternalMyDsl.g:1307:1: ( 'name:' )
            // InternalMyDsl.g:1308:2: 'name:'
            {
             before(grammarAccess.getSudden_weight_lossAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getSudden_weight_lossAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__1__Impl"


    // $ANTLR start "rule__Sudden_weight_loss__Group__2"
    // InternalMyDsl.g:1317:1: rule__Sudden_weight_loss__Group__2 : rule__Sudden_weight_loss__Group__2__Impl ;
    public final void rule__Sudden_weight_loss__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1321:1: ( rule__Sudden_weight_loss__Group__2__Impl )
            // InternalMyDsl.g:1322:2: rule__Sudden_weight_loss__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sudden_weight_loss__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__2"


    // $ANTLR start "rule__Sudden_weight_loss__Group__2__Impl"
    // InternalMyDsl.g:1328:1: rule__Sudden_weight_loss__Group__2__Impl : ( ( rule__Sudden_weight_loss__NameAssignment_2 ) ) ;
    public final void rule__Sudden_weight_loss__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1332:1: ( ( ( rule__Sudden_weight_loss__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1333:1: ( ( rule__Sudden_weight_loss__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1333:1: ( ( rule__Sudden_weight_loss__NameAssignment_2 ) )
            // InternalMyDsl.g:1334:2: ( rule__Sudden_weight_loss__NameAssignment_2 )
            {
             before(grammarAccess.getSudden_weight_lossAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1335:2: ( rule__Sudden_weight_loss__NameAssignment_2 )
            // InternalMyDsl.g:1335:3: rule__Sudden_weight_loss__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sudden_weight_loss__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSudden_weight_lossAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__Group__2__Impl"


    // $ANTLR start "rule__Polyphagia__Group__0"
    // InternalMyDsl.g:1344:1: rule__Polyphagia__Group__0 : rule__Polyphagia__Group__0__Impl rule__Polyphagia__Group__1 ;
    public final void rule__Polyphagia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1348:1: ( rule__Polyphagia__Group__0__Impl rule__Polyphagia__Group__1 )
            // InternalMyDsl.g:1349:2: rule__Polyphagia__Group__0__Impl rule__Polyphagia__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Polyphagia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyphagia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__0"


    // $ANTLR start "rule__Polyphagia__Group__0__Impl"
    // InternalMyDsl.g:1356:1: rule__Polyphagia__Group__0__Impl : ( 'Polyphagia' ) ;
    public final void rule__Polyphagia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( ( 'Polyphagia' ) )
            // InternalMyDsl.g:1361:1: ( 'Polyphagia' )
            {
            // InternalMyDsl.g:1361:1: ( 'Polyphagia' )
            // InternalMyDsl.g:1362:2: 'Polyphagia'
            {
             before(grammarAccess.getPolyphagiaAccess().getPolyphagiaKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPolyphagiaAccess().getPolyphagiaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__0__Impl"


    // $ANTLR start "rule__Polyphagia__Group__1"
    // InternalMyDsl.g:1371:1: rule__Polyphagia__Group__1 : rule__Polyphagia__Group__1__Impl rule__Polyphagia__Group__2 ;
    public final void rule__Polyphagia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1375:1: ( rule__Polyphagia__Group__1__Impl rule__Polyphagia__Group__2 )
            // InternalMyDsl.g:1376:2: rule__Polyphagia__Group__1__Impl rule__Polyphagia__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Polyphagia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Polyphagia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__1"


    // $ANTLR start "rule__Polyphagia__Group__1__Impl"
    // InternalMyDsl.g:1383:1: rule__Polyphagia__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Polyphagia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1388:1: ( 'name:' )
            {
            // InternalMyDsl.g:1388:1: ( 'name:' )
            // InternalMyDsl.g:1389:2: 'name:'
            {
             before(grammarAccess.getPolyphagiaAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPolyphagiaAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__1__Impl"


    // $ANTLR start "rule__Polyphagia__Group__2"
    // InternalMyDsl.g:1398:1: rule__Polyphagia__Group__2 : rule__Polyphagia__Group__2__Impl ;
    public final void rule__Polyphagia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1402:1: ( rule__Polyphagia__Group__2__Impl )
            // InternalMyDsl.g:1403:2: rule__Polyphagia__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Polyphagia__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__2"


    // $ANTLR start "rule__Polyphagia__Group__2__Impl"
    // InternalMyDsl.g:1409:1: rule__Polyphagia__Group__2__Impl : ( ( rule__Polyphagia__NameAssignment_2 ) ) ;
    public final void rule__Polyphagia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1413:1: ( ( ( rule__Polyphagia__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1414:1: ( ( rule__Polyphagia__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1414:1: ( ( rule__Polyphagia__NameAssignment_2 ) )
            // InternalMyDsl.g:1415:2: ( rule__Polyphagia__NameAssignment_2 )
            {
             before(grammarAccess.getPolyphagiaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1416:2: ( rule__Polyphagia__NameAssignment_2 )
            // InternalMyDsl.g:1416:3: rule__Polyphagia__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Polyphagia__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPolyphagiaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__Group__2__Impl"


    // $ANTLR start "rule__Genital_thrush__Group__0"
    // InternalMyDsl.g:1425:1: rule__Genital_thrush__Group__0 : rule__Genital_thrush__Group__0__Impl rule__Genital_thrush__Group__1 ;
    public final void rule__Genital_thrush__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1429:1: ( rule__Genital_thrush__Group__0__Impl rule__Genital_thrush__Group__1 )
            // InternalMyDsl.g:1430:2: rule__Genital_thrush__Group__0__Impl rule__Genital_thrush__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Genital_thrush__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Genital_thrush__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__0"


    // $ANTLR start "rule__Genital_thrush__Group__0__Impl"
    // InternalMyDsl.g:1437:1: rule__Genital_thrush__Group__0__Impl : ( 'Genital_thrush' ) ;
    public final void rule__Genital_thrush__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( ( 'Genital_thrush' ) )
            // InternalMyDsl.g:1442:1: ( 'Genital_thrush' )
            {
            // InternalMyDsl.g:1442:1: ( 'Genital_thrush' )
            // InternalMyDsl.g:1443:2: 'Genital_thrush'
            {
             before(grammarAccess.getGenital_thrushAccess().getGenital_thrushKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getGenital_thrushAccess().getGenital_thrushKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__0__Impl"


    // $ANTLR start "rule__Genital_thrush__Group__1"
    // InternalMyDsl.g:1452:1: rule__Genital_thrush__Group__1 : rule__Genital_thrush__Group__1__Impl rule__Genital_thrush__Group__2 ;
    public final void rule__Genital_thrush__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1456:1: ( rule__Genital_thrush__Group__1__Impl rule__Genital_thrush__Group__2 )
            // InternalMyDsl.g:1457:2: rule__Genital_thrush__Group__1__Impl rule__Genital_thrush__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Genital_thrush__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Genital_thrush__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__1"


    // $ANTLR start "rule__Genital_thrush__Group__1__Impl"
    // InternalMyDsl.g:1464:1: rule__Genital_thrush__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Genital_thrush__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1469:1: ( 'name:' )
            {
            // InternalMyDsl.g:1469:1: ( 'name:' )
            // InternalMyDsl.g:1470:2: 'name:'
            {
             before(grammarAccess.getGenital_thrushAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGenital_thrushAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__1__Impl"


    // $ANTLR start "rule__Genital_thrush__Group__2"
    // InternalMyDsl.g:1479:1: rule__Genital_thrush__Group__2 : rule__Genital_thrush__Group__2__Impl ;
    public final void rule__Genital_thrush__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1483:1: ( rule__Genital_thrush__Group__2__Impl )
            // InternalMyDsl.g:1484:2: rule__Genital_thrush__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Genital_thrush__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__2"


    // $ANTLR start "rule__Genital_thrush__Group__2__Impl"
    // InternalMyDsl.g:1490:1: rule__Genital_thrush__Group__2__Impl : ( ( rule__Genital_thrush__NameAssignment_2 ) ) ;
    public final void rule__Genital_thrush__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1494:1: ( ( ( rule__Genital_thrush__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1495:1: ( ( rule__Genital_thrush__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1495:1: ( ( rule__Genital_thrush__NameAssignment_2 ) )
            // InternalMyDsl.g:1496:2: ( rule__Genital_thrush__NameAssignment_2 )
            {
             before(grammarAccess.getGenital_thrushAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1497:2: ( rule__Genital_thrush__NameAssignment_2 )
            // InternalMyDsl.g:1497:3: rule__Genital_thrush__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Genital_thrush__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getGenital_thrushAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__Group__2__Impl"


    // $ANTLR start "rule__Visual_blurring__Group__0"
    // InternalMyDsl.g:1506:1: rule__Visual_blurring__Group__0 : rule__Visual_blurring__Group__0__Impl rule__Visual_blurring__Group__1 ;
    public final void rule__Visual_blurring__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1510:1: ( rule__Visual_blurring__Group__0__Impl rule__Visual_blurring__Group__1 )
            // InternalMyDsl.g:1511:2: rule__Visual_blurring__Group__0__Impl rule__Visual_blurring__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Visual_blurring__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual_blurring__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__0"


    // $ANTLR start "rule__Visual_blurring__Group__0__Impl"
    // InternalMyDsl.g:1518:1: rule__Visual_blurring__Group__0__Impl : ( 'visual_blurring' ) ;
    public final void rule__Visual_blurring__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( ( 'visual_blurring' ) )
            // InternalMyDsl.g:1523:1: ( 'visual_blurring' )
            {
            // InternalMyDsl.g:1523:1: ( 'visual_blurring' )
            // InternalMyDsl.g:1524:2: 'visual_blurring'
            {
             before(grammarAccess.getVisual_blurringAccess().getVisual_blurringKeyword_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getVisual_blurringAccess().getVisual_blurringKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__0__Impl"


    // $ANTLR start "rule__Visual_blurring__Group__1"
    // InternalMyDsl.g:1533:1: rule__Visual_blurring__Group__1 : rule__Visual_blurring__Group__1__Impl rule__Visual_blurring__Group__2 ;
    public final void rule__Visual_blurring__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1537:1: ( rule__Visual_blurring__Group__1__Impl rule__Visual_blurring__Group__2 )
            // InternalMyDsl.g:1538:2: rule__Visual_blurring__Group__1__Impl rule__Visual_blurring__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Visual_blurring__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Visual_blurring__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__1"


    // $ANTLR start "rule__Visual_blurring__Group__1__Impl"
    // InternalMyDsl.g:1545:1: rule__Visual_blurring__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Visual_blurring__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1550:1: ( 'name:' )
            {
            // InternalMyDsl.g:1550:1: ( 'name:' )
            // InternalMyDsl.g:1551:2: 'name:'
            {
             before(grammarAccess.getVisual_blurringAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVisual_blurringAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__1__Impl"


    // $ANTLR start "rule__Visual_blurring__Group__2"
    // InternalMyDsl.g:1560:1: rule__Visual_blurring__Group__2 : rule__Visual_blurring__Group__2__Impl ;
    public final void rule__Visual_blurring__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1564:1: ( rule__Visual_blurring__Group__2__Impl )
            // InternalMyDsl.g:1565:2: rule__Visual_blurring__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Visual_blurring__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__2"


    // $ANTLR start "rule__Visual_blurring__Group__2__Impl"
    // InternalMyDsl.g:1571:1: rule__Visual_blurring__Group__2__Impl : ( ( rule__Visual_blurring__NameAssignment_2 ) ) ;
    public final void rule__Visual_blurring__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1575:1: ( ( ( rule__Visual_blurring__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1576:1: ( ( rule__Visual_blurring__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1576:1: ( ( rule__Visual_blurring__NameAssignment_2 ) )
            // InternalMyDsl.g:1577:2: ( rule__Visual_blurring__NameAssignment_2 )
            {
             before(grammarAccess.getVisual_blurringAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1578:2: ( rule__Visual_blurring__NameAssignment_2 )
            // InternalMyDsl.g:1578:3: rule__Visual_blurring__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Visual_blurring__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVisual_blurringAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__Group__2__Impl"


    // $ANTLR start "rule__Itching__Group__0"
    // InternalMyDsl.g:1587:1: rule__Itching__Group__0 : rule__Itching__Group__0__Impl rule__Itching__Group__1 ;
    public final void rule__Itching__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1591:1: ( rule__Itching__Group__0__Impl rule__Itching__Group__1 )
            // InternalMyDsl.g:1592:2: rule__Itching__Group__0__Impl rule__Itching__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Itching__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itching__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__0"


    // $ANTLR start "rule__Itching__Group__0__Impl"
    // InternalMyDsl.g:1599:1: rule__Itching__Group__0__Impl : ( 'Itching' ) ;
    public final void rule__Itching__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( ( 'Itching' ) )
            // InternalMyDsl.g:1604:1: ( 'Itching' )
            {
            // InternalMyDsl.g:1604:1: ( 'Itching' )
            // InternalMyDsl.g:1605:2: 'Itching'
            {
             before(grammarAccess.getItchingAccess().getItchingKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getItchingAccess().getItchingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__0__Impl"


    // $ANTLR start "rule__Itching__Group__1"
    // InternalMyDsl.g:1614:1: rule__Itching__Group__1 : rule__Itching__Group__1__Impl rule__Itching__Group__2 ;
    public final void rule__Itching__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1618:1: ( rule__Itching__Group__1__Impl rule__Itching__Group__2 )
            // InternalMyDsl.g:1619:2: rule__Itching__Group__1__Impl rule__Itching__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Itching__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Itching__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__1"


    // $ANTLR start "rule__Itching__Group__1__Impl"
    // InternalMyDsl.g:1626:1: rule__Itching__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Itching__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1631:1: ( 'name:' )
            {
            // InternalMyDsl.g:1631:1: ( 'name:' )
            // InternalMyDsl.g:1632:2: 'name:'
            {
             before(grammarAccess.getItchingAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getItchingAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__1__Impl"


    // $ANTLR start "rule__Itching__Group__2"
    // InternalMyDsl.g:1641:1: rule__Itching__Group__2 : rule__Itching__Group__2__Impl ;
    public final void rule__Itching__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1645:1: ( rule__Itching__Group__2__Impl )
            // InternalMyDsl.g:1646:2: rule__Itching__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Itching__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__2"


    // $ANTLR start "rule__Itching__Group__2__Impl"
    // InternalMyDsl.g:1652:1: rule__Itching__Group__2__Impl : ( ( rule__Itching__NameAssignment_2 ) ) ;
    public final void rule__Itching__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1656:1: ( ( ( rule__Itching__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1657:1: ( ( rule__Itching__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1657:1: ( ( rule__Itching__NameAssignment_2 ) )
            // InternalMyDsl.g:1658:2: ( rule__Itching__NameAssignment_2 )
            {
             before(grammarAccess.getItchingAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1659:2: ( rule__Itching__NameAssignment_2 )
            // InternalMyDsl.g:1659:3: rule__Itching__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Itching__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getItchingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__Group__2__Impl"


    // $ANTLR start "rule__Irritability__Group__0"
    // InternalMyDsl.g:1668:1: rule__Irritability__Group__0 : rule__Irritability__Group__0__Impl rule__Irritability__Group__1 ;
    public final void rule__Irritability__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1672:1: ( rule__Irritability__Group__0__Impl rule__Irritability__Group__1 )
            // InternalMyDsl.g:1673:2: rule__Irritability__Group__0__Impl rule__Irritability__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Irritability__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Irritability__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__0"


    // $ANTLR start "rule__Irritability__Group__0__Impl"
    // InternalMyDsl.g:1680:1: rule__Irritability__Group__0__Impl : ( 'Irritability' ) ;
    public final void rule__Irritability__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( ( 'Irritability' ) )
            // InternalMyDsl.g:1685:1: ( 'Irritability' )
            {
            // InternalMyDsl.g:1685:1: ( 'Irritability' )
            // InternalMyDsl.g:1686:2: 'Irritability'
            {
             before(grammarAccess.getIrritabilityAccess().getIrritabilityKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getIrritabilityAccess().getIrritabilityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__0__Impl"


    // $ANTLR start "rule__Irritability__Group__1"
    // InternalMyDsl.g:1695:1: rule__Irritability__Group__1 : rule__Irritability__Group__1__Impl rule__Irritability__Group__2 ;
    public final void rule__Irritability__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1699:1: ( rule__Irritability__Group__1__Impl rule__Irritability__Group__2 )
            // InternalMyDsl.g:1700:2: rule__Irritability__Group__1__Impl rule__Irritability__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Irritability__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Irritability__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__1"


    // $ANTLR start "rule__Irritability__Group__1__Impl"
    // InternalMyDsl.g:1707:1: rule__Irritability__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Irritability__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1712:1: ( 'name:' )
            {
            // InternalMyDsl.g:1712:1: ( 'name:' )
            // InternalMyDsl.g:1713:2: 'name:'
            {
             before(grammarAccess.getIrritabilityAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getIrritabilityAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__1__Impl"


    // $ANTLR start "rule__Irritability__Group__2"
    // InternalMyDsl.g:1722:1: rule__Irritability__Group__2 : rule__Irritability__Group__2__Impl ;
    public final void rule__Irritability__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1726:1: ( rule__Irritability__Group__2__Impl )
            // InternalMyDsl.g:1727:2: rule__Irritability__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Irritability__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__2"


    // $ANTLR start "rule__Irritability__Group__2__Impl"
    // InternalMyDsl.g:1733:1: rule__Irritability__Group__2__Impl : ( ( rule__Irritability__NameAssignment_2 ) ) ;
    public final void rule__Irritability__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1737:1: ( ( ( rule__Irritability__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1738:1: ( ( rule__Irritability__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1738:1: ( ( rule__Irritability__NameAssignment_2 ) )
            // InternalMyDsl.g:1739:2: ( rule__Irritability__NameAssignment_2 )
            {
             before(grammarAccess.getIrritabilityAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1740:2: ( rule__Irritability__NameAssignment_2 )
            // InternalMyDsl.g:1740:3: rule__Irritability__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Irritability__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getIrritabilityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__Group__2__Impl"


    // $ANTLR start "rule__Delayed_healing__Group__0"
    // InternalMyDsl.g:1749:1: rule__Delayed_healing__Group__0 : rule__Delayed_healing__Group__0__Impl rule__Delayed_healing__Group__1 ;
    public final void rule__Delayed_healing__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1753:1: ( rule__Delayed_healing__Group__0__Impl rule__Delayed_healing__Group__1 )
            // InternalMyDsl.g:1754:2: rule__Delayed_healing__Group__0__Impl rule__Delayed_healing__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Delayed_healing__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delayed_healing__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__0"


    // $ANTLR start "rule__Delayed_healing__Group__0__Impl"
    // InternalMyDsl.g:1761:1: rule__Delayed_healing__Group__0__Impl : ( 'delayed_healing' ) ;
    public final void rule__Delayed_healing__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( ( 'delayed_healing' ) )
            // InternalMyDsl.g:1766:1: ( 'delayed_healing' )
            {
            // InternalMyDsl.g:1766:1: ( 'delayed_healing' )
            // InternalMyDsl.g:1767:2: 'delayed_healing'
            {
             before(grammarAccess.getDelayed_healingAccess().getDelayed_healingKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getDelayed_healingAccess().getDelayed_healingKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__0__Impl"


    // $ANTLR start "rule__Delayed_healing__Group__1"
    // InternalMyDsl.g:1776:1: rule__Delayed_healing__Group__1 : rule__Delayed_healing__Group__1__Impl rule__Delayed_healing__Group__2 ;
    public final void rule__Delayed_healing__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1780:1: ( rule__Delayed_healing__Group__1__Impl rule__Delayed_healing__Group__2 )
            // InternalMyDsl.g:1781:2: rule__Delayed_healing__Group__1__Impl rule__Delayed_healing__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Delayed_healing__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Delayed_healing__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__1"


    // $ANTLR start "rule__Delayed_healing__Group__1__Impl"
    // InternalMyDsl.g:1788:1: rule__Delayed_healing__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Delayed_healing__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1793:1: ( 'name:' )
            {
            // InternalMyDsl.g:1793:1: ( 'name:' )
            // InternalMyDsl.g:1794:2: 'name:'
            {
             before(grammarAccess.getDelayed_healingAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getDelayed_healingAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__1__Impl"


    // $ANTLR start "rule__Delayed_healing__Group__2"
    // InternalMyDsl.g:1803:1: rule__Delayed_healing__Group__2 : rule__Delayed_healing__Group__2__Impl ;
    public final void rule__Delayed_healing__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1807:1: ( rule__Delayed_healing__Group__2__Impl )
            // InternalMyDsl.g:1808:2: rule__Delayed_healing__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Delayed_healing__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__2"


    // $ANTLR start "rule__Delayed_healing__Group__2__Impl"
    // InternalMyDsl.g:1814:1: rule__Delayed_healing__Group__2__Impl : ( ( rule__Delayed_healing__NameAssignment_2 ) ) ;
    public final void rule__Delayed_healing__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1818:1: ( ( ( rule__Delayed_healing__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1819:1: ( ( rule__Delayed_healing__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1819:1: ( ( rule__Delayed_healing__NameAssignment_2 ) )
            // InternalMyDsl.g:1820:2: ( rule__Delayed_healing__NameAssignment_2 )
            {
             before(grammarAccess.getDelayed_healingAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1821:2: ( rule__Delayed_healing__NameAssignment_2 )
            // InternalMyDsl.g:1821:3: rule__Delayed_healing__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Delayed_healing__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getDelayed_healingAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__Group__2__Impl"


    // $ANTLR start "rule__Partial_paresis__Group__0"
    // InternalMyDsl.g:1830:1: rule__Partial_paresis__Group__0 : rule__Partial_paresis__Group__0__Impl rule__Partial_paresis__Group__1 ;
    public final void rule__Partial_paresis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( rule__Partial_paresis__Group__0__Impl rule__Partial_paresis__Group__1 )
            // InternalMyDsl.g:1835:2: rule__Partial_paresis__Group__0__Impl rule__Partial_paresis__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Partial_paresis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partial_paresis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__0"


    // $ANTLR start "rule__Partial_paresis__Group__0__Impl"
    // InternalMyDsl.g:1842:1: rule__Partial_paresis__Group__0__Impl : ( 'partial_paresis' ) ;
    public final void rule__Partial_paresis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1846:1: ( ( 'partial_paresis' ) )
            // InternalMyDsl.g:1847:1: ( 'partial_paresis' )
            {
            // InternalMyDsl.g:1847:1: ( 'partial_paresis' )
            // InternalMyDsl.g:1848:2: 'partial_paresis'
            {
             before(grammarAccess.getPartial_paresisAccess().getPartial_paresisKeyword_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getPartial_paresisAccess().getPartial_paresisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__0__Impl"


    // $ANTLR start "rule__Partial_paresis__Group__1"
    // InternalMyDsl.g:1857:1: rule__Partial_paresis__Group__1 : rule__Partial_paresis__Group__1__Impl rule__Partial_paresis__Group__2 ;
    public final void rule__Partial_paresis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1861:1: ( rule__Partial_paresis__Group__1__Impl rule__Partial_paresis__Group__2 )
            // InternalMyDsl.g:1862:2: rule__Partial_paresis__Group__1__Impl rule__Partial_paresis__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Partial_paresis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Partial_paresis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__1"


    // $ANTLR start "rule__Partial_paresis__Group__1__Impl"
    // InternalMyDsl.g:1869:1: rule__Partial_paresis__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Partial_paresis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1873:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1874:1: ( 'name:' )
            {
            // InternalMyDsl.g:1874:1: ( 'name:' )
            // InternalMyDsl.g:1875:2: 'name:'
            {
             before(grammarAccess.getPartial_paresisAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPartial_paresisAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__1__Impl"


    // $ANTLR start "rule__Partial_paresis__Group__2"
    // InternalMyDsl.g:1884:1: rule__Partial_paresis__Group__2 : rule__Partial_paresis__Group__2__Impl ;
    public final void rule__Partial_paresis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1888:1: ( rule__Partial_paresis__Group__2__Impl )
            // InternalMyDsl.g:1889:2: rule__Partial_paresis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Partial_paresis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__2"


    // $ANTLR start "rule__Partial_paresis__Group__2__Impl"
    // InternalMyDsl.g:1895:1: rule__Partial_paresis__Group__2__Impl : ( ( rule__Partial_paresis__NameAssignment_2 ) ) ;
    public final void rule__Partial_paresis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1899:1: ( ( ( rule__Partial_paresis__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1900:1: ( ( rule__Partial_paresis__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1900:1: ( ( rule__Partial_paresis__NameAssignment_2 ) )
            // InternalMyDsl.g:1901:2: ( rule__Partial_paresis__NameAssignment_2 )
            {
             before(grammarAccess.getPartial_paresisAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1902:2: ( rule__Partial_paresis__NameAssignment_2 )
            // InternalMyDsl.g:1902:3: rule__Partial_paresis__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Partial_paresis__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPartial_paresisAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__Group__2__Impl"


    // $ANTLR start "rule__Muscle_stiffness__Group__0"
    // InternalMyDsl.g:1911:1: rule__Muscle_stiffness__Group__0 : rule__Muscle_stiffness__Group__0__Impl rule__Muscle_stiffness__Group__1 ;
    public final void rule__Muscle_stiffness__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1915:1: ( rule__Muscle_stiffness__Group__0__Impl rule__Muscle_stiffness__Group__1 )
            // InternalMyDsl.g:1916:2: rule__Muscle_stiffness__Group__0__Impl rule__Muscle_stiffness__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Muscle_stiffness__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Muscle_stiffness__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__0"


    // $ANTLR start "rule__Muscle_stiffness__Group__0__Impl"
    // InternalMyDsl.g:1923:1: rule__Muscle_stiffness__Group__0__Impl : ( 'muscle_stiffness' ) ;
    public final void rule__Muscle_stiffness__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1927:1: ( ( 'muscle_stiffness' ) )
            // InternalMyDsl.g:1928:1: ( 'muscle_stiffness' )
            {
            // InternalMyDsl.g:1928:1: ( 'muscle_stiffness' )
            // InternalMyDsl.g:1929:2: 'muscle_stiffness'
            {
             before(grammarAccess.getMuscle_stiffnessAccess().getMuscle_stiffnessKeyword_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getMuscle_stiffnessAccess().getMuscle_stiffnessKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__0__Impl"


    // $ANTLR start "rule__Muscle_stiffness__Group__1"
    // InternalMyDsl.g:1938:1: rule__Muscle_stiffness__Group__1 : rule__Muscle_stiffness__Group__1__Impl rule__Muscle_stiffness__Group__2 ;
    public final void rule__Muscle_stiffness__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1942:1: ( rule__Muscle_stiffness__Group__1__Impl rule__Muscle_stiffness__Group__2 )
            // InternalMyDsl.g:1943:2: rule__Muscle_stiffness__Group__1__Impl rule__Muscle_stiffness__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Muscle_stiffness__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Muscle_stiffness__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__1"


    // $ANTLR start "rule__Muscle_stiffness__Group__1__Impl"
    // InternalMyDsl.g:1950:1: rule__Muscle_stiffness__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Muscle_stiffness__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( 'name:' ) )
            // InternalMyDsl.g:1955:1: ( 'name:' )
            {
            // InternalMyDsl.g:1955:1: ( 'name:' )
            // InternalMyDsl.g:1956:2: 'name:'
            {
             before(grammarAccess.getMuscle_stiffnessAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMuscle_stiffnessAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__1__Impl"


    // $ANTLR start "rule__Muscle_stiffness__Group__2"
    // InternalMyDsl.g:1965:1: rule__Muscle_stiffness__Group__2 : rule__Muscle_stiffness__Group__2__Impl ;
    public final void rule__Muscle_stiffness__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1969:1: ( rule__Muscle_stiffness__Group__2__Impl )
            // InternalMyDsl.g:1970:2: rule__Muscle_stiffness__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Muscle_stiffness__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__2"


    // $ANTLR start "rule__Muscle_stiffness__Group__2__Impl"
    // InternalMyDsl.g:1976:1: rule__Muscle_stiffness__Group__2__Impl : ( ( rule__Muscle_stiffness__NameAssignment_2 ) ) ;
    public final void rule__Muscle_stiffness__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1980:1: ( ( ( rule__Muscle_stiffness__NameAssignment_2 ) ) )
            // InternalMyDsl.g:1981:1: ( ( rule__Muscle_stiffness__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:1981:1: ( ( rule__Muscle_stiffness__NameAssignment_2 ) )
            // InternalMyDsl.g:1982:2: ( rule__Muscle_stiffness__NameAssignment_2 )
            {
             before(grammarAccess.getMuscle_stiffnessAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:1983:2: ( rule__Muscle_stiffness__NameAssignment_2 )
            // InternalMyDsl.g:1983:3: rule__Muscle_stiffness__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Muscle_stiffness__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getMuscle_stiffnessAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__Group__2__Impl"


    // $ANTLR start "rule__Alopecia__Group__0"
    // InternalMyDsl.g:1992:1: rule__Alopecia__Group__0 : rule__Alopecia__Group__0__Impl rule__Alopecia__Group__1 ;
    public final void rule__Alopecia__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1996:1: ( rule__Alopecia__Group__0__Impl rule__Alopecia__Group__1 )
            // InternalMyDsl.g:1997:2: rule__Alopecia__Group__0__Impl rule__Alopecia__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Alopecia__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alopecia__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__0"


    // $ANTLR start "rule__Alopecia__Group__0__Impl"
    // InternalMyDsl.g:2004:1: rule__Alopecia__Group__0__Impl : ( 'Alopecia' ) ;
    public final void rule__Alopecia__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2008:1: ( ( 'Alopecia' ) )
            // InternalMyDsl.g:2009:1: ( 'Alopecia' )
            {
            // InternalMyDsl.g:2009:1: ( 'Alopecia' )
            // InternalMyDsl.g:2010:2: 'Alopecia'
            {
             before(grammarAccess.getAlopeciaAccess().getAlopeciaKeyword_0()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getAlopeciaAccess().getAlopeciaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__0__Impl"


    // $ANTLR start "rule__Alopecia__Group__1"
    // InternalMyDsl.g:2019:1: rule__Alopecia__Group__1 : rule__Alopecia__Group__1__Impl rule__Alopecia__Group__2 ;
    public final void rule__Alopecia__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2023:1: ( rule__Alopecia__Group__1__Impl rule__Alopecia__Group__2 )
            // InternalMyDsl.g:2024:2: rule__Alopecia__Group__1__Impl rule__Alopecia__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Alopecia__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Alopecia__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__1"


    // $ANTLR start "rule__Alopecia__Group__1__Impl"
    // InternalMyDsl.g:2031:1: rule__Alopecia__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Alopecia__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2035:1: ( ( 'name:' ) )
            // InternalMyDsl.g:2036:1: ( 'name:' )
            {
            // InternalMyDsl.g:2036:1: ( 'name:' )
            // InternalMyDsl.g:2037:2: 'name:'
            {
             before(grammarAccess.getAlopeciaAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getAlopeciaAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__1__Impl"


    // $ANTLR start "rule__Alopecia__Group__2"
    // InternalMyDsl.g:2046:1: rule__Alopecia__Group__2 : rule__Alopecia__Group__2__Impl ;
    public final void rule__Alopecia__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2050:1: ( rule__Alopecia__Group__2__Impl )
            // InternalMyDsl.g:2051:2: rule__Alopecia__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Alopecia__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__2"


    // $ANTLR start "rule__Alopecia__Group__2__Impl"
    // InternalMyDsl.g:2057:1: rule__Alopecia__Group__2__Impl : ( ( rule__Alopecia__NameAssignment_2 ) ) ;
    public final void rule__Alopecia__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2061:1: ( ( ( rule__Alopecia__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2062:1: ( ( rule__Alopecia__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2062:1: ( ( rule__Alopecia__NameAssignment_2 ) )
            // InternalMyDsl.g:2063:2: ( rule__Alopecia__NameAssignment_2 )
            {
             before(grammarAccess.getAlopeciaAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2064:2: ( rule__Alopecia__NameAssignment_2 )
            // InternalMyDsl.g:2064:3: rule__Alopecia__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Alopecia__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAlopeciaAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__Group__2__Impl"


    // $ANTLR start "rule__Obesity__Group__0"
    // InternalMyDsl.g:2073:1: rule__Obesity__Group__0 : rule__Obesity__Group__0__Impl rule__Obesity__Group__1 ;
    public final void rule__Obesity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2077:1: ( rule__Obesity__Group__0__Impl rule__Obesity__Group__1 )
            // InternalMyDsl.g:2078:2: rule__Obesity__Group__0__Impl rule__Obesity__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Obesity__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obesity__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__0"


    // $ANTLR start "rule__Obesity__Group__0__Impl"
    // InternalMyDsl.g:2085:1: rule__Obesity__Group__0__Impl : ( 'Obesity' ) ;
    public final void rule__Obesity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2089:1: ( ( 'Obesity' ) )
            // InternalMyDsl.g:2090:1: ( 'Obesity' )
            {
            // InternalMyDsl.g:2090:1: ( 'Obesity' )
            // InternalMyDsl.g:2091:2: 'Obesity'
            {
             before(grammarAccess.getObesityAccess().getObesityKeyword_0()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getObesityAccess().getObesityKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__0__Impl"


    // $ANTLR start "rule__Obesity__Group__1"
    // InternalMyDsl.g:2100:1: rule__Obesity__Group__1 : rule__Obesity__Group__1__Impl rule__Obesity__Group__2 ;
    public final void rule__Obesity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2104:1: ( rule__Obesity__Group__1__Impl rule__Obesity__Group__2 )
            // InternalMyDsl.g:2105:2: rule__Obesity__Group__1__Impl rule__Obesity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Obesity__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Obesity__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__1"


    // $ANTLR start "rule__Obesity__Group__1__Impl"
    // InternalMyDsl.g:2112:1: rule__Obesity__Group__1__Impl : ( 'name:' ) ;
    public final void rule__Obesity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( 'name:' ) )
            // InternalMyDsl.g:2117:1: ( 'name:' )
            {
            // InternalMyDsl.g:2117:1: ( 'name:' )
            // InternalMyDsl.g:2118:2: 'name:'
            {
             before(grammarAccess.getObesityAccess().getNameKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getObesityAccess().getNameKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__1__Impl"


    // $ANTLR start "rule__Obesity__Group__2"
    // InternalMyDsl.g:2127:1: rule__Obesity__Group__2 : rule__Obesity__Group__2__Impl ;
    public final void rule__Obesity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( rule__Obesity__Group__2__Impl )
            // InternalMyDsl.g:2132:2: rule__Obesity__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Obesity__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__2"


    // $ANTLR start "rule__Obesity__Group__2__Impl"
    // InternalMyDsl.g:2138:1: rule__Obesity__Group__2__Impl : ( ( rule__Obesity__NameAssignment_2 ) ) ;
    public final void rule__Obesity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2142:1: ( ( ( rule__Obesity__NameAssignment_2 ) ) )
            // InternalMyDsl.g:2143:1: ( ( rule__Obesity__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:2143:1: ( ( rule__Obesity__NameAssignment_2 ) )
            // InternalMyDsl.g:2144:2: ( rule__Obesity__NameAssignment_2 )
            {
             before(grammarAccess.getObesityAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:2145:2: ( rule__Obesity__NameAssignment_2 )
            // InternalMyDsl.g:2145:3: rule__Obesity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Obesity__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getObesityAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__Group__2__Impl"


    // $ANTLR start "rule__Sugar_Test__Group__0"
    // InternalMyDsl.g:2154:1: rule__Sugar_Test__Group__0 : rule__Sugar_Test__Group__0__Impl rule__Sugar_Test__Group__1 ;
    public final void rule__Sugar_Test__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2158:1: ( rule__Sugar_Test__Group__0__Impl rule__Sugar_Test__Group__1 )
            // InternalMyDsl.g:2159:2: rule__Sugar_Test__Group__0__Impl rule__Sugar_Test__Group__1
            {
            pushFollow(FOLLOW_13);
            rule__Sugar_Test__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__0"


    // $ANTLR start "rule__Sugar_Test__Group__0__Impl"
    // InternalMyDsl.g:2166:1: rule__Sugar_Test__Group__0__Impl : ( 'Sugar_test' ) ;
    public final void rule__Sugar_Test__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2170:1: ( ( 'Sugar_test' ) )
            // InternalMyDsl.g:2171:1: ( 'Sugar_test' )
            {
            // InternalMyDsl.g:2171:1: ( 'Sugar_test' )
            // InternalMyDsl.g:2172:2: 'Sugar_test'
            {
             before(grammarAccess.getSugar_TestAccess().getSugar_testKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getSugar_TestAccess().getSugar_testKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__0__Impl"


    // $ANTLR start "rule__Sugar_Test__Group__1"
    // InternalMyDsl.g:2181:1: rule__Sugar_Test__Group__1 : rule__Sugar_Test__Group__1__Impl rule__Sugar_Test__Group__2 ;
    public final void rule__Sugar_Test__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2185:1: ( rule__Sugar_Test__Group__1__Impl rule__Sugar_Test__Group__2 )
            // InternalMyDsl.g:2186:2: rule__Sugar_Test__Group__1__Impl rule__Sugar_Test__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Sugar_Test__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__1"


    // $ANTLR start "rule__Sugar_Test__Group__1__Impl"
    // InternalMyDsl.g:2193:1: rule__Sugar_Test__Group__1__Impl : ( 'Previous_blood_sugar' ) ;
    public final void rule__Sugar_Test__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2197:1: ( ( 'Previous_blood_sugar' ) )
            // InternalMyDsl.g:2198:1: ( 'Previous_blood_sugar' )
            {
            // InternalMyDsl.g:2198:1: ( 'Previous_blood_sugar' )
            // InternalMyDsl.g:2199:2: 'Previous_blood_sugar'
            {
             before(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarKeyword_1()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__1__Impl"


    // $ANTLR start "rule__Sugar_Test__Group__2"
    // InternalMyDsl.g:2208:1: rule__Sugar_Test__Group__2 : rule__Sugar_Test__Group__2__Impl rule__Sugar_Test__Group__3 ;
    public final void rule__Sugar_Test__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2212:1: ( rule__Sugar_Test__Group__2__Impl rule__Sugar_Test__Group__3 )
            // InternalMyDsl.g:2213:2: rule__Sugar_Test__Group__2__Impl rule__Sugar_Test__Group__3
            {
            pushFollow(FOLLOW_14);
            rule__Sugar_Test__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__2"


    // $ANTLR start "rule__Sugar_Test__Group__2__Impl"
    // InternalMyDsl.g:2220:1: rule__Sugar_Test__Group__2__Impl : ( ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 ) ) ;
    public final void rule__Sugar_Test__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2224:1: ( ( ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 ) ) )
            // InternalMyDsl.g:2225:1: ( ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 ) )
            {
            // InternalMyDsl.g:2225:1: ( ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 ) )
            // InternalMyDsl.g:2226:2: ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 )
            {
             before(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarAssignment_2()); 
            // InternalMyDsl.g:2227:2: ( rule__Sugar_Test__Previous_blood_sugarAssignment_2 )
            // InternalMyDsl.g:2227:3: rule__Sugar_Test__Previous_blood_sugarAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Previous_blood_sugarAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__2__Impl"


    // $ANTLR start "rule__Sugar_Test__Group__3"
    // InternalMyDsl.g:2235:1: rule__Sugar_Test__Group__3 : rule__Sugar_Test__Group__3__Impl rule__Sugar_Test__Group__4 ;
    public final void rule__Sugar_Test__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2239:1: ( rule__Sugar_Test__Group__3__Impl rule__Sugar_Test__Group__4 )
            // InternalMyDsl.g:2240:2: rule__Sugar_Test__Group__3__Impl rule__Sugar_Test__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Sugar_Test__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__3"


    // $ANTLR start "rule__Sugar_Test__Group__3__Impl"
    // InternalMyDsl.g:2247:1: rule__Sugar_Test__Group__3__Impl : ( 'Current_blood_sugar' ) ;
    public final void rule__Sugar_Test__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2251:1: ( ( 'Current_blood_sugar' ) )
            // InternalMyDsl.g:2252:1: ( 'Current_blood_sugar' )
            {
            // InternalMyDsl.g:2252:1: ( 'Current_blood_sugar' )
            // InternalMyDsl.g:2253:2: 'Current_blood_sugar'
            {
             before(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarKeyword_3()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__3__Impl"


    // $ANTLR start "rule__Sugar_Test__Group__4"
    // InternalMyDsl.g:2262:1: rule__Sugar_Test__Group__4 : rule__Sugar_Test__Group__4__Impl ;
    public final void rule__Sugar_Test__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2266:1: ( rule__Sugar_Test__Group__4__Impl )
            // InternalMyDsl.g:2267:2: rule__Sugar_Test__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__4"


    // $ANTLR start "rule__Sugar_Test__Group__4__Impl"
    // InternalMyDsl.g:2273:1: rule__Sugar_Test__Group__4__Impl : ( ( rule__Sugar_Test__Current_blood_sugarAssignment_4 ) ) ;
    public final void rule__Sugar_Test__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2277:1: ( ( ( rule__Sugar_Test__Current_blood_sugarAssignment_4 ) ) )
            // InternalMyDsl.g:2278:1: ( ( rule__Sugar_Test__Current_blood_sugarAssignment_4 ) )
            {
            // InternalMyDsl.g:2278:1: ( ( rule__Sugar_Test__Current_blood_sugarAssignment_4 ) )
            // InternalMyDsl.g:2279:2: ( rule__Sugar_Test__Current_blood_sugarAssignment_4 )
            {
             before(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarAssignment_4()); 
            // InternalMyDsl.g:2280:2: ( rule__Sugar_Test__Current_blood_sugarAssignment_4 )
            // InternalMyDsl.g:2280:3: rule__Sugar_Test__Current_blood_sugarAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Sugar_Test__Current_blood_sugarAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Group__4__Impl"


    // $ANTLR start "rule__Doctor__Group__0"
    // InternalMyDsl.g:2289:1: rule__Doctor__Group__0 : rule__Doctor__Group__0__Impl rule__Doctor__Group__1 ;
    public final void rule__Doctor__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2293:1: ( rule__Doctor__Group__0__Impl rule__Doctor__Group__1 )
            // InternalMyDsl.g:2294:2: rule__Doctor__Group__0__Impl rule__Doctor__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Doctor__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doctor__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__0"


    // $ANTLR start "rule__Doctor__Group__0__Impl"
    // InternalMyDsl.g:2301:1: rule__Doctor__Group__0__Impl : ( 'Doctor' ) ;
    public final void rule__Doctor__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2305:1: ( ( 'Doctor' ) )
            // InternalMyDsl.g:2306:1: ( 'Doctor' )
            {
            // InternalMyDsl.g:2306:1: ( 'Doctor' )
            // InternalMyDsl.g:2307:2: 'Doctor'
            {
             before(grammarAccess.getDoctorAccess().getDoctorKeyword_0()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getDoctorAccess().getDoctorKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__0__Impl"


    // $ANTLR start "rule__Doctor__Group__1"
    // InternalMyDsl.g:2316:1: rule__Doctor__Group__1 : rule__Doctor__Group__1__Impl rule__Doctor__Group__2 ;
    public final void rule__Doctor__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2320:1: ( rule__Doctor__Group__1__Impl rule__Doctor__Group__2 )
            // InternalMyDsl.g:2321:2: rule__Doctor__Group__1__Impl rule__Doctor__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Doctor__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doctor__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__1"


    // $ANTLR start "rule__Doctor__Group__1__Impl"
    // InternalMyDsl.g:2328:1: rule__Doctor__Group__1__Impl : ( ( rule__Doctor__NameAssignment_1 ) ) ;
    public final void rule__Doctor__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2332:1: ( ( ( rule__Doctor__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2333:1: ( ( rule__Doctor__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2333:1: ( ( rule__Doctor__NameAssignment_1 ) )
            // InternalMyDsl.g:2334:2: ( rule__Doctor__NameAssignment_1 )
            {
             before(grammarAccess.getDoctorAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2335:2: ( rule__Doctor__NameAssignment_1 )
            // InternalMyDsl.g:2335:3: rule__Doctor__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Doctor__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDoctorAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__1__Impl"


    // $ANTLR start "rule__Doctor__Group__2"
    // InternalMyDsl.g:2343:1: rule__Doctor__Group__2 : rule__Doctor__Group__2__Impl rule__Doctor__Group__3 ;
    public final void rule__Doctor__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2347:1: ( rule__Doctor__Group__2__Impl rule__Doctor__Group__3 )
            // InternalMyDsl.g:2348:2: rule__Doctor__Group__2__Impl rule__Doctor__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Doctor__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doctor__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__2"


    // $ANTLR start "rule__Doctor__Group__2__Impl"
    // InternalMyDsl.g:2355:1: rule__Doctor__Group__2__Impl : ( 'Doctor_specailization' ) ;
    public final void rule__Doctor__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2359:1: ( ( 'Doctor_specailization' ) )
            // InternalMyDsl.g:2360:1: ( 'Doctor_specailization' )
            {
            // InternalMyDsl.g:2360:1: ( 'Doctor_specailization' )
            // InternalMyDsl.g:2361:2: 'Doctor_specailization'
            {
             before(grammarAccess.getDoctorAccess().getDoctor_specailizationKeyword_2()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getDoctorAccess().getDoctor_specailizationKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__2__Impl"


    // $ANTLR start "rule__Doctor__Group__3"
    // InternalMyDsl.g:2370:1: rule__Doctor__Group__3 : rule__Doctor__Group__3__Impl rule__Doctor__Group__4 ;
    public final void rule__Doctor__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2374:1: ( rule__Doctor__Group__3__Impl rule__Doctor__Group__4 )
            // InternalMyDsl.g:2375:2: rule__Doctor__Group__3__Impl rule__Doctor__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__Doctor__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doctor__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__3"


    // $ANTLR start "rule__Doctor__Group__3__Impl"
    // InternalMyDsl.g:2382:1: rule__Doctor__Group__3__Impl : ( ( rule__Doctor__Doctor_specailizationAssignment_3 ) ) ;
    public final void rule__Doctor__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2386:1: ( ( ( rule__Doctor__Doctor_specailizationAssignment_3 ) ) )
            // InternalMyDsl.g:2387:1: ( ( rule__Doctor__Doctor_specailizationAssignment_3 ) )
            {
            // InternalMyDsl.g:2387:1: ( ( rule__Doctor__Doctor_specailizationAssignment_3 ) )
            // InternalMyDsl.g:2388:2: ( rule__Doctor__Doctor_specailizationAssignment_3 )
            {
             before(grammarAccess.getDoctorAccess().getDoctor_specailizationAssignment_3()); 
            // InternalMyDsl.g:2389:2: ( rule__Doctor__Doctor_specailizationAssignment_3 )
            // InternalMyDsl.g:2389:3: rule__Doctor__Doctor_specailizationAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Doctor__Doctor_specailizationAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getDoctorAccess().getDoctor_specailizationAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__3__Impl"


    // $ANTLR start "rule__Doctor__Group__4"
    // InternalMyDsl.g:2397:1: rule__Doctor__Group__4 : rule__Doctor__Group__4__Impl rule__Doctor__Group__5 ;
    public final void rule__Doctor__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2401:1: ( rule__Doctor__Group__4__Impl rule__Doctor__Group__5 )
            // InternalMyDsl.g:2402:2: rule__Doctor__Group__4__Impl rule__Doctor__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__Doctor__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Doctor__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__4"


    // $ANTLR start "rule__Doctor__Group__4__Impl"
    // InternalMyDsl.g:2409:1: rule__Doctor__Group__4__Impl : ( ( rule__Doctor__MedicinesAssignment_4 )* ) ;
    public final void rule__Doctor__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2413:1: ( ( ( rule__Doctor__MedicinesAssignment_4 )* ) )
            // InternalMyDsl.g:2414:1: ( ( rule__Doctor__MedicinesAssignment_4 )* )
            {
            // InternalMyDsl.g:2414:1: ( ( rule__Doctor__MedicinesAssignment_4 )* )
            // InternalMyDsl.g:2415:2: ( rule__Doctor__MedicinesAssignment_4 )*
            {
             before(grammarAccess.getDoctorAccess().getMedicinesAssignment_4()); 
            // InternalMyDsl.g:2416:2: ( rule__Doctor__MedicinesAssignment_4 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:2416:3: rule__Doctor__MedicinesAssignment_4
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Doctor__MedicinesAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getDoctorAccess().getMedicinesAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__4__Impl"


    // $ANTLR start "rule__Doctor__Group__5"
    // InternalMyDsl.g:2424:1: rule__Doctor__Group__5 : rule__Doctor__Group__5__Impl ;
    public final void rule__Doctor__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2428:1: ( rule__Doctor__Group__5__Impl )
            // InternalMyDsl.g:2429:2: rule__Doctor__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Doctor__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__5"


    // $ANTLR start "rule__Doctor__Group__5__Impl"
    // InternalMyDsl.g:2435:1: rule__Doctor__Group__5__Impl : ( ( rule__Doctor__SymptomsAssignment_5 )* ) ;
    public final void rule__Doctor__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2439:1: ( ( ( rule__Doctor__SymptomsAssignment_5 )* ) )
            // InternalMyDsl.g:2440:1: ( ( rule__Doctor__SymptomsAssignment_5 )* )
            {
            // InternalMyDsl.g:2440:1: ( ( rule__Doctor__SymptomsAssignment_5 )* )
            // InternalMyDsl.g:2441:2: ( rule__Doctor__SymptomsAssignment_5 )*
            {
             before(grammarAccess.getDoctorAccess().getSymptomsAssignment_5()); 
            // InternalMyDsl.g:2442:2: ( rule__Doctor__SymptomsAssignment_5 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==14||(LA9_0>=16 && LA9_0<=27)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalMyDsl.g:2442:3: rule__Doctor__SymptomsAssignment_5
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Doctor__SymptomsAssignment_5();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

             after(grammarAccess.getDoctorAccess().getSymptomsAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Group__5__Impl"


    // $ANTLR start "rule__Patient__Group__0"
    // InternalMyDsl.g:2451:1: rule__Patient__Group__0 : rule__Patient__Group__0__Impl rule__Patient__Group__1 ;
    public final void rule__Patient__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2455:1: ( rule__Patient__Group__0__Impl rule__Patient__Group__1 )
            // InternalMyDsl.g:2456:2: rule__Patient__Group__0__Impl rule__Patient__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Patient__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__0"


    // $ANTLR start "rule__Patient__Group__0__Impl"
    // InternalMyDsl.g:2463:1: rule__Patient__Group__0__Impl : ( 'Patient' ) ;
    public final void rule__Patient__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2467:1: ( ( 'Patient' ) )
            // InternalMyDsl.g:2468:1: ( 'Patient' )
            {
            // InternalMyDsl.g:2468:1: ( 'Patient' )
            // InternalMyDsl.g:2469:2: 'Patient'
            {
             before(grammarAccess.getPatientAccess().getPatientKeyword_0()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatientKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__0__Impl"


    // $ANTLR start "rule__Patient__Group__1"
    // InternalMyDsl.g:2478:1: rule__Patient__Group__1 : rule__Patient__Group__1__Impl rule__Patient__Group__2 ;
    public final void rule__Patient__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2482:1: ( rule__Patient__Group__1__Impl rule__Patient__Group__2 )
            // InternalMyDsl.g:2483:2: rule__Patient__Group__1__Impl rule__Patient__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__Patient__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__1"


    // $ANTLR start "rule__Patient__Group__1__Impl"
    // InternalMyDsl.g:2490:1: rule__Patient__Group__1__Impl : ( ( rule__Patient__NameAssignment_1 ) ) ;
    public final void rule__Patient__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2494:1: ( ( ( rule__Patient__NameAssignment_1 ) ) )
            // InternalMyDsl.g:2495:1: ( ( rule__Patient__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:2495:1: ( ( rule__Patient__NameAssignment_1 ) )
            // InternalMyDsl.g:2496:2: ( rule__Patient__NameAssignment_1 )
            {
             before(grammarAccess.getPatientAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:2497:2: ( rule__Patient__NameAssignment_1 )
            // InternalMyDsl.g:2497:3: rule__Patient__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Patient__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__1__Impl"


    // $ANTLR start "rule__Patient__Group__2"
    // InternalMyDsl.g:2505:1: rule__Patient__Group__2 : rule__Patient__Group__2__Impl rule__Patient__Group__3 ;
    public final void rule__Patient__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2509:1: ( rule__Patient__Group__2__Impl rule__Patient__Group__3 )
            // InternalMyDsl.g:2510:2: rule__Patient__Group__2__Impl rule__Patient__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__Patient__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__2"


    // $ANTLR start "rule__Patient__Group__2__Impl"
    // InternalMyDsl.g:2517:1: rule__Patient__Group__2__Impl : ( 'Patient_Gender' ) ;
    public final void rule__Patient__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2521:1: ( ( 'Patient_Gender' ) )
            // InternalMyDsl.g:2522:1: ( 'Patient_Gender' )
            {
            // InternalMyDsl.g:2522:1: ( 'Patient_Gender' )
            // InternalMyDsl.g:2523:2: 'Patient_Gender'
            {
             before(grammarAccess.getPatientAccess().getPatient_GenderKeyword_2()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_GenderKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__2__Impl"


    // $ANTLR start "rule__Patient__Group__3"
    // InternalMyDsl.g:2532:1: rule__Patient__Group__3 : rule__Patient__Group__3__Impl rule__Patient__Group__4 ;
    public final void rule__Patient__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2536:1: ( rule__Patient__Group__3__Impl rule__Patient__Group__4 )
            // InternalMyDsl.g:2537:2: rule__Patient__Group__3__Impl rule__Patient__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__Patient__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__3"


    // $ANTLR start "rule__Patient__Group__3__Impl"
    // InternalMyDsl.g:2544:1: rule__Patient__Group__3__Impl : ( ( rule__Patient__Patient_GenderAssignment_3 ) ) ;
    public final void rule__Patient__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2548:1: ( ( ( rule__Patient__Patient_GenderAssignment_3 ) ) )
            // InternalMyDsl.g:2549:1: ( ( rule__Patient__Patient_GenderAssignment_3 ) )
            {
            // InternalMyDsl.g:2549:1: ( ( rule__Patient__Patient_GenderAssignment_3 ) )
            // InternalMyDsl.g:2550:2: ( rule__Patient__Patient_GenderAssignment_3 )
            {
             before(grammarAccess.getPatientAccess().getPatient_GenderAssignment_3()); 
            // InternalMyDsl.g:2551:2: ( rule__Patient__Patient_GenderAssignment_3 )
            // InternalMyDsl.g:2551:3: rule__Patient__Patient_GenderAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Patient_GenderAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPatient_GenderAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__3__Impl"


    // $ANTLR start "rule__Patient__Group__4"
    // InternalMyDsl.g:2559:1: rule__Patient__Group__4 : rule__Patient__Group__4__Impl rule__Patient__Group__5 ;
    public final void rule__Patient__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2563:1: ( rule__Patient__Group__4__Impl rule__Patient__Group__5 )
            // InternalMyDsl.g:2564:2: rule__Patient__Group__4__Impl rule__Patient__Group__5
            {
            pushFollow(FOLLOW_19);
            rule__Patient__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__4"


    // $ANTLR start "rule__Patient__Group__4__Impl"
    // InternalMyDsl.g:2571:1: rule__Patient__Group__4__Impl : ( 'Patient_Age' ) ;
    public final void rule__Patient__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2575:1: ( ( 'Patient_Age' ) )
            // InternalMyDsl.g:2576:1: ( 'Patient_Age' )
            {
            // InternalMyDsl.g:2576:1: ( 'Patient_Age' )
            // InternalMyDsl.g:2577:2: 'Patient_Age'
            {
             before(grammarAccess.getPatientAccess().getPatient_AgeKeyword_4()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_AgeKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__4__Impl"


    // $ANTLR start "rule__Patient__Group__5"
    // InternalMyDsl.g:2586:1: rule__Patient__Group__5 : rule__Patient__Group__5__Impl rule__Patient__Group__6 ;
    public final void rule__Patient__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2590:1: ( rule__Patient__Group__5__Impl rule__Patient__Group__6 )
            // InternalMyDsl.g:2591:2: rule__Patient__Group__5__Impl rule__Patient__Group__6
            {
            pushFollow(FOLLOW_20);
            rule__Patient__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__5"


    // $ANTLR start "rule__Patient__Group__5__Impl"
    // InternalMyDsl.g:2598:1: rule__Patient__Group__5__Impl : ( ( rule__Patient__Patient_AgeAssignment_5 ) ) ;
    public final void rule__Patient__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2602:1: ( ( ( rule__Patient__Patient_AgeAssignment_5 ) ) )
            // InternalMyDsl.g:2603:1: ( ( rule__Patient__Patient_AgeAssignment_5 ) )
            {
            // InternalMyDsl.g:2603:1: ( ( rule__Patient__Patient_AgeAssignment_5 ) )
            // InternalMyDsl.g:2604:2: ( rule__Patient__Patient_AgeAssignment_5 )
            {
             before(grammarAccess.getPatientAccess().getPatient_AgeAssignment_5()); 
            // InternalMyDsl.g:2605:2: ( rule__Patient__Patient_AgeAssignment_5 )
            // InternalMyDsl.g:2605:3: rule__Patient__Patient_AgeAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Patient_AgeAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPatient_AgeAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__5__Impl"


    // $ANTLR start "rule__Patient__Group__6"
    // InternalMyDsl.g:2613:1: rule__Patient__Group__6 : rule__Patient__Group__6__Impl rule__Patient__Group__7 ;
    public final void rule__Patient__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2617:1: ( rule__Patient__Group__6__Impl rule__Patient__Group__7 )
            // InternalMyDsl.g:2618:2: rule__Patient__Group__6__Impl rule__Patient__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Patient__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__6"


    // $ANTLR start "rule__Patient__Group__6__Impl"
    // InternalMyDsl.g:2625:1: rule__Patient__Group__6__Impl : ( 'Patient_Height' ) ;
    public final void rule__Patient__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2629:1: ( ( 'Patient_Height' ) )
            // InternalMyDsl.g:2630:1: ( 'Patient_Height' )
            {
            // InternalMyDsl.g:2630:1: ( 'Patient_Height' )
            // InternalMyDsl.g:2631:2: 'Patient_Height'
            {
             before(grammarAccess.getPatientAccess().getPatient_HeightKeyword_6()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_HeightKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__6__Impl"


    // $ANTLR start "rule__Patient__Group__7"
    // InternalMyDsl.g:2640:1: rule__Patient__Group__7 : rule__Patient__Group__7__Impl rule__Patient__Group__8 ;
    public final void rule__Patient__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2644:1: ( rule__Patient__Group__7__Impl rule__Patient__Group__8 )
            // InternalMyDsl.g:2645:2: rule__Patient__Group__7__Impl rule__Patient__Group__8
            {
            pushFollow(FOLLOW_21);
            rule__Patient__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__7"


    // $ANTLR start "rule__Patient__Group__7__Impl"
    // InternalMyDsl.g:2652:1: rule__Patient__Group__7__Impl : ( ( rule__Patient__Patient_HeightAssignment_7 ) ) ;
    public final void rule__Patient__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2656:1: ( ( ( rule__Patient__Patient_HeightAssignment_7 ) ) )
            // InternalMyDsl.g:2657:1: ( ( rule__Patient__Patient_HeightAssignment_7 ) )
            {
            // InternalMyDsl.g:2657:1: ( ( rule__Patient__Patient_HeightAssignment_7 ) )
            // InternalMyDsl.g:2658:2: ( rule__Patient__Patient_HeightAssignment_7 )
            {
             before(grammarAccess.getPatientAccess().getPatient_HeightAssignment_7()); 
            // InternalMyDsl.g:2659:2: ( rule__Patient__Patient_HeightAssignment_7 )
            // InternalMyDsl.g:2659:3: rule__Patient__Patient_HeightAssignment_7
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Patient_HeightAssignment_7();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPatient_HeightAssignment_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__7__Impl"


    // $ANTLR start "rule__Patient__Group__8"
    // InternalMyDsl.g:2667:1: rule__Patient__Group__8 : rule__Patient__Group__8__Impl rule__Patient__Group__9 ;
    public final void rule__Patient__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2671:1: ( rule__Patient__Group__8__Impl rule__Patient__Group__9 )
            // InternalMyDsl.g:2672:2: rule__Patient__Group__8__Impl rule__Patient__Group__9
            {
            pushFollow(FOLLOW_11);
            rule__Patient__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__8"


    // $ANTLR start "rule__Patient__Group__8__Impl"
    // InternalMyDsl.g:2679:1: rule__Patient__Group__8__Impl : ( 'Patient_Weight' ) ;
    public final void rule__Patient__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2683:1: ( ( 'Patient_Weight' ) )
            // InternalMyDsl.g:2684:1: ( 'Patient_Weight' )
            {
            // InternalMyDsl.g:2684:1: ( 'Patient_Weight' )
            // InternalMyDsl.g:2685:2: 'Patient_Weight'
            {
             before(grammarAccess.getPatientAccess().getPatient_WeightKeyword_8()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_WeightKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__8__Impl"


    // $ANTLR start "rule__Patient__Group__9"
    // InternalMyDsl.g:2694:1: rule__Patient__Group__9 : rule__Patient__Group__9__Impl rule__Patient__Group__10 ;
    public final void rule__Patient__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2698:1: ( rule__Patient__Group__9__Impl rule__Patient__Group__10 )
            // InternalMyDsl.g:2699:2: rule__Patient__Group__9__Impl rule__Patient__Group__10
            {
            pushFollow(FOLLOW_22);
            rule__Patient__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__9"


    // $ANTLR start "rule__Patient__Group__9__Impl"
    // InternalMyDsl.g:2706:1: rule__Patient__Group__9__Impl : ( ( rule__Patient__Patient_WeightAssignment_9 ) ) ;
    public final void rule__Patient__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2710:1: ( ( ( rule__Patient__Patient_WeightAssignment_9 ) ) )
            // InternalMyDsl.g:2711:1: ( ( rule__Patient__Patient_WeightAssignment_9 ) )
            {
            // InternalMyDsl.g:2711:1: ( ( rule__Patient__Patient_WeightAssignment_9 ) )
            // InternalMyDsl.g:2712:2: ( rule__Patient__Patient_WeightAssignment_9 )
            {
             before(grammarAccess.getPatientAccess().getPatient_WeightAssignment_9()); 
            // InternalMyDsl.g:2713:2: ( rule__Patient__Patient_WeightAssignment_9 )
            // InternalMyDsl.g:2713:3: rule__Patient__Patient_WeightAssignment_9
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Patient_WeightAssignment_9();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPatient_WeightAssignment_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__9__Impl"


    // $ANTLR start "rule__Patient__Group__10"
    // InternalMyDsl.g:2721:1: rule__Patient__Group__10 : rule__Patient__Group__10__Impl rule__Patient__Group__11 ;
    public final void rule__Patient__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2725:1: ( rule__Patient__Group__10__Impl rule__Patient__Group__11 )
            // InternalMyDsl.g:2726:2: rule__Patient__Group__10__Impl rule__Patient__Group__11
            {
            pushFollow(FOLLOW_19);
            rule__Patient__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__10"


    // $ANTLR start "rule__Patient__Group__10__Impl"
    // InternalMyDsl.g:2733:1: rule__Patient__Group__10__Impl : ( 'patients_blood_pressure' ) ;
    public final void rule__Patient__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2737:1: ( ( 'patients_blood_pressure' ) )
            // InternalMyDsl.g:2738:1: ( 'patients_blood_pressure' )
            {
            // InternalMyDsl.g:2738:1: ( 'patients_blood_pressure' )
            // InternalMyDsl.g:2739:2: 'patients_blood_pressure'
            {
             before(grammarAccess.getPatientAccess().getPatients_blood_pressureKeyword_10()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatients_blood_pressureKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__10__Impl"


    // $ANTLR start "rule__Patient__Group__11"
    // InternalMyDsl.g:2748:1: rule__Patient__Group__11 : rule__Patient__Group__11__Impl rule__Patient__Group__12 ;
    public final void rule__Patient__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2752:1: ( rule__Patient__Group__11__Impl rule__Patient__Group__12 )
            // InternalMyDsl.g:2753:2: rule__Patient__Group__11__Impl rule__Patient__Group__12
            {
            pushFollow(FOLLOW_23);
            rule__Patient__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__11"


    // $ANTLR start "rule__Patient__Group__11__Impl"
    // InternalMyDsl.g:2760:1: rule__Patient__Group__11__Impl : ( ( rule__Patient__Patient_blood_pressureAssignment_11 ) ) ;
    public final void rule__Patient__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2764:1: ( ( ( rule__Patient__Patient_blood_pressureAssignment_11 ) ) )
            // InternalMyDsl.g:2765:1: ( ( rule__Patient__Patient_blood_pressureAssignment_11 ) )
            {
            // InternalMyDsl.g:2765:1: ( ( rule__Patient__Patient_blood_pressureAssignment_11 ) )
            // InternalMyDsl.g:2766:2: ( rule__Patient__Patient_blood_pressureAssignment_11 )
            {
             before(grammarAccess.getPatientAccess().getPatient_blood_pressureAssignment_11()); 
            // InternalMyDsl.g:2767:2: ( rule__Patient__Patient_blood_pressureAssignment_11 )
            // InternalMyDsl.g:2767:3: rule__Patient__Patient_blood_pressureAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Patient_blood_pressureAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPatient_blood_pressureAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__11__Impl"


    // $ANTLR start "rule__Patient__Group__12"
    // InternalMyDsl.g:2775:1: rule__Patient__Group__12 : rule__Patient__Group__12__Impl rule__Patient__Group__13 ;
    public final void rule__Patient__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2779:1: ( rule__Patient__Group__12__Impl rule__Patient__Group__13 )
            // InternalMyDsl.g:2780:2: rule__Patient__Group__12__Impl rule__Patient__Group__13
            {
            pushFollow(FOLLOW_19);
            rule__Patient__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__12"


    // $ANTLR start "rule__Patient__Group__12__Impl"
    // InternalMyDsl.g:2787:1: rule__Patient__Group__12__Impl : ( 'pulse_rate' ) ;
    public final void rule__Patient__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2791:1: ( ( 'pulse_rate' ) )
            // InternalMyDsl.g:2792:1: ( 'pulse_rate' )
            {
            // InternalMyDsl.g:2792:1: ( 'pulse_rate' )
            // InternalMyDsl.g:2793:2: 'pulse_rate'
            {
             before(grammarAccess.getPatientAccess().getPulse_rateKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPulse_rateKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__12__Impl"


    // $ANTLR start "rule__Patient__Group__13"
    // InternalMyDsl.g:2802:1: rule__Patient__Group__13 : rule__Patient__Group__13__Impl rule__Patient__Group__14 ;
    public final void rule__Patient__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2806:1: ( rule__Patient__Group__13__Impl rule__Patient__Group__14 )
            // InternalMyDsl.g:2807:2: rule__Patient__Group__13__Impl rule__Patient__Group__14
            {
            pushFollow(FOLLOW_24);
            rule__Patient__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__13"


    // $ANTLR start "rule__Patient__Group__13__Impl"
    // InternalMyDsl.g:2814:1: rule__Patient__Group__13__Impl : ( ( rule__Patient__Pulse_rateAssignment_13 ) ) ;
    public final void rule__Patient__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2818:1: ( ( ( rule__Patient__Pulse_rateAssignment_13 ) ) )
            // InternalMyDsl.g:2819:1: ( ( rule__Patient__Pulse_rateAssignment_13 ) )
            {
            // InternalMyDsl.g:2819:1: ( ( rule__Patient__Pulse_rateAssignment_13 ) )
            // InternalMyDsl.g:2820:2: ( rule__Patient__Pulse_rateAssignment_13 )
            {
             before(grammarAccess.getPatientAccess().getPulse_rateAssignment_13()); 
            // InternalMyDsl.g:2821:2: ( rule__Patient__Pulse_rateAssignment_13 )
            // InternalMyDsl.g:2821:3: rule__Patient__Pulse_rateAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Pulse_rateAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getPulse_rateAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__13__Impl"


    // $ANTLR start "rule__Patient__Group__14"
    // InternalMyDsl.g:2829:1: rule__Patient__Group__14 : rule__Patient__Group__14__Impl rule__Patient__Group__15 ;
    public final void rule__Patient__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2833:1: ( rule__Patient__Group__14__Impl rule__Patient__Group__15 )
            // InternalMyDsl.g:2834:2: rule__Patient__Group__14__Impl rule__Patient__Group__15
            {
            pushFollow(FOLLOW_25);
            rule__Patient__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__14"


    // $ANTLR start "rule__Patient__Group__14__Impl"
    // InternalMyDsl.g:2841:1: rule__Patient__Group__14__Impl : ( ( ( rule__Patient__SymptomsAssignment_14 ) ) ( ( rule__Patient__SymptomsAssignment_14 )* ) ) ;
    public final void rule__Patient__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2845:1: ( ( ( ( rule__Patient__SymptomsAssignment_14 ) ) ( ( rule__Patient__SymptomsAssignment_14 )* ) ) )
            // InternalMyDsl.g:2846:1: ( ( ( rule__Patient__SymptomsAssignment_14 ) ) ( ( rule__Patient__SymptomsAssignment_14 )* ) )
            {
            // InternalMyDsl.g:2846:1: ( ( ( rule__Patient__SymptomsAssignment_14 ) ) ( ( rule__Patient__SymptomsAssignment_14 )* ) )
            // InternalMyDsl.g:2847:2: ( ( rule__Patient__SymptomsAssignment_14 ) ) ( ( rule__Patient__SymptomsAssignment_14 )* )
            {
            // InternalMyDsl.g:2847:2: ( ( rule__Patient__SymptomsAssignment_14 ) )
            // InternalMyDsl.g:2848:3: ( rule__Patient__SymptomsAssignment_14 )
            {
             before(grammarAccess.getPatientAccess().getSymptomsAssignment_14()); 
            // InternalMyDsl.g:2849:3: ( rule__Patient__SymptomsAssignment_14 )
            // InternalMyDsl.g:2849:4: rule__Patient__SymptomsAssignment_14
            {
            pushFollow(FOLLOW_6);
            rule__Patient__SymptomsAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getSymptomsAssignment_14()); 

            }

            // InternalMyDsl.g:2852:2: ( ( rule__Patient__SymptomsAssignment_14 )* )
            // InternalMyDsl.g:2853:3: ( rule__Patient__SymptomsAssignment_14 )*
            {
             before(grammarAccess.getPatientAccess().getSymptomsAssignment_14()); 
            // InternalMyDsl.g:2854:3: ( rule__Patient__SymptomsAssignment_14 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14||(LA10_0>=16 && LA10_0<=27)) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:2854:4: rule__Patient__SymptomsAssignment_14
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Patient__SymptomsAssignment_14();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getPatientAccess().getSymptomsAssignment_14()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__14__Impl"


    // $ANTLR start "rule__Patient__Group__15"
    // InternalMyDsl.g:2863:1: rule__Patient__Group__15 : rule__Patient__Group__15__Impl rule__Patient__Group__16 ;
    public final void rule__Patient__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2867:1: ( rule__Patient__Group__15__Impl rule__Patient__Group__16 )
            // InternalMyDsl.g:2868:2: rule__Patient__Group__15__Impl rule__Patient__Group__16
            {
            pushFollow(FOLLOW_25);
            rule__Patient__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__15"


    // $ANTLR start "rule__Patient__Group__15__Impl"
    // InternalMyDsl.g:2875:1: rule__Patient__Group__15__Impl : ( ( rule__Patient__MedicinesAssignment_15 )* ) ;
    public final void rule__Patient__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2879:1: ( ( ( rule__Patient__MedicinesAssignment_15 )* ) )
            // InternalMyDsl.g:2880:1: ( ( rule__Patient__MedicinesAssignment_15 )* )
            {
            // InternalMyDsl.g:2880:1: ( ( rule__Patient__MedicinesAssignment_15 )* )
            // InternalMyDsl.g:2881:2: ( rule__Patient__MedicinesAssignment_15 )*
            {
             before(grammarAccess.getPatientAccess().getMedicinesAssignment_15()); 
            // InternalMyDsl.g:2882:2: ( rule__Patient__MedicinesAssignment_15 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==12) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalMyDsl.g:2882:3: rule__Patient__MedicinesAssignment_15
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Patient__MedicinesAssignment_15();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

             after(grammarAccess.getPatientAccess().getMedicinesAssignment_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__15__Impl"


    // $ANTLR start "rule__Patient__Group__16"
    // InternalMyDsl.g:2890:1: rule__Patient__Group__16 : rule__Patient__Group__16__Impl rule__Patient__Group__17 ;
    public final void rule__Patient__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2894:1: ( rule__Patient__Group__16__Impl rule__Patient__Group__17 )
            // InternalMyDsl.g:2895:2: rule__Patient__Group__16__Impl rule__Patient__Group__17
            {
            pushFollow(FOLLOW_26);
            rule__Patient__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__16"


    // $ANTLR start "rule__Patient__Group__16__Impl"
    // InternalMyDsl.g:2902:1: rule__Patient__Group__16__Impl : ( ( ( rule__Patient__Sugar_testsAssignment_16 ) ) ( ( rule__Patient__Sugar_testsAssignment_16 )* ) ) ;
    public final void rule__Patient__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2906:1: ( ( ( ( rule__Patient__Sugar_testsAssignment_16 ) ) ( ( rule__Patient__Sugar_testsAssignment_16 )* ) ) )
            // InternalMyDsl.g:2907:1: ( ( ( rule__Patient__Sugar_testsAssignment_16 ) ) ( ( rule__Patient__Sugar_testsAssignment_16 )* ) )
            {
            // InternalMyDsl.g:2907:1: ( ( ( rule__Patient__Sugar_testsAssignment_16 ) ) ( ( rule__Patient__Sugar_testsAssignment_16 )* ) )
            // InternalMyDsl.g:2908:2: ( ( rule__Patient__Sugar_testsAssignment_16 ) ) ( ( rule__Patient__Sugar_testsAssignment_16 )* )
            {
            // InternalMyDsl.g:2908:2: ( ( rule__Patient__Sugar_testsAssignment_16 ) )
            // InternalMyDsl.g:2909:3: ( rule__Patient__Sugar_testsAssignment_16 )
            {
             before(grammarAccess.getPatientAccess().getSugar_testsAssignment_16()); 
            // InternalMyDsl.g:2910:3: ( rule__Patient__Sugar_testsAssignment_16 )
            // InternalMyDsl.g:2910:4: rule__Patient__Sugar_testsAssignment_16
            {
            pushFollow(FOLLOW_27);
            rule__Patient__Sugar_testsAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getSugar_testsAssignment_16()); 

            }

            // InternalMyDsl.g:2913:2: ( ( rule__Patient__Sugar_testsAssignment_16 )* )
            // InternalMyDsl.g:2914:3: ( rule__Patient__Sugar_testsAssignment_16 )*
            {
             before(grammarAccess.getPatientAccess().getSugar_testsAssignment_16()); 
            // InternalMyDsl.g:2915:3: ( rule__Patient__Sugar_testsAssignment_16 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:2915:4: rule__Patient__Sugar_testsAssignment_16
            	    {
            	    pushFollow(FOLLOW_27);
            	    rule__Patient__Sugar_testsAssignment_16();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getPatientAccess().getSugar_testsAssignment_16()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__16__Impl"


    // $ANTLR start "rule__Patient__Group__17"
    // InternalMyDsl.g:2924:1: rule__Patient__Group__17 : rule__Patient__Group__17__Impl rule__Patient__Group__18 ;
    public final void rule__Patient__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2928:1: ( rule__Patient__Group__17__Impl rule__Patient__Group__18 )
            // InternalMyDsl.g:2929:2: rule__Patient__Group__17__Impl rule__Patient__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__Patient__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Patient__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__17"


    // $ANTLR start "rule__Patient__Group__17__Impl"
    // InternalMyDsl.g:2936:1: rule__Patient__Group__17__Impl : ( 'doctor' ) ;
    public final void rule__Patient__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2940:1: ( ( 'doctor' ) )
            // InternalMyDsl.g:2941:1: ( 'doctor' )
            {
            // InternalMyDsl.g:2941:1: ( 'doctor' )
            // InternalMyDsl.g:2942:2: 'doctor'
            {
             before(grammarAccess.getPatientAccess().getDoctorKeyword_17()); 
            match(input,40,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getDoctorKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__17__Impl"


    // $ANTLR start "rule__Patient__Group__18"
    // InternalMyDsl.g:2951:1: rule__Patient__Group__18 : rule__Patient__Group__18__Impl ;
    public final void rule__Patient__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2955:1: ( rule__Patient__Group__18__Impl )
            // InternalMyDsl.g:2956:2: rule__Patient__Group__18__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Patient__Group__18__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__18"


    // $ANTLR start "rule__Patient__Group__18__Impl"
    // InternalMyDsl.g:2962:1: rule__Patient__Group__18__Impl : ( ( ( rule__Patient__DOCTORSAssignment_18 ) ) ( ( rule__Patient__DOCTORSAssignment_18 )* ) ) ;
    public final void rule__Patient__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2966:1: ( ( ( ( rule__Patient__DOCTORSAssignment_18 ) ) ( ( rule__Patient__DOCTORSAssignment_18 )* ) ) )
            // InternalMyDsl.g:2967:1: ( ( ( rule__Patient__DOCTORSAssignment_18 ) ) ( ( rule__Patient__DOCTORSAssignment_18 )* ) )
            {
            // InternalMyDsl.g:2967:1: ( ( ( rule__Patient__DOCTORSAssignment_18 ) ) ( ( rule__Patient__DOCTORSAssignment_18 )* ) )
            // InternalMyDsl.g:2968:2: ( ( rule__Patient__DOCTORSAssignment_18 ) ) ( ( rule__Patient__DOCTORSAssignment_18 )* )
            {
            // InternalMyDsl.g:2968:2: ( ( rule__Patient__DOCTORSAssignment_18 ) )
            // InternalMyDsl.g:2969:3: ( rule__Patient__DOCTORSAssignment_18 )
            {
             before(grammarAccess.getPatientAccess().getDOCTORSAssignment_18()); 
            // InternalMyDsl.g:2970:3: ( rule__Patient__DOCTORSAssignment_18 )
            // InternalMyDsl.g:2970:4: rule__Patient__DOCTORSAssignment_18
            {
            pushFollow(FOLLOW_28);
            rule__Patient__DOCTORSAssignment_18();

            state._fsp--;


            }

             after(grammarAccess.getPatientAccess().getDOCTORSAssignment_18()); 

            }

            // InternalMyDsl.g:2973:2: ( ( rule__Patient__DOCTORSAssignment_18 )* )
            // InternalMyDsl.g:2974:3: ( rule__Patient__DOCTORSAssignment_18 )*
            {
             before(grammarAccess.getPatientAccess().getDOCTORSAssignment_18()); 
            // InternalMyDsl.g:2975:3: ( rule__Patient__DOCTORSAssignment_18 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_ID) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalMyDsl.g:2975:4: rule__Patient__DOCTORSAssignment_18
            	    {
            	    pushFollow(FOLLOW_28);
            	    rule__Patient__DOCTORSAssignment_18();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getPatientAccess().getDOCTORSAssignment_18()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Group__18__Impl"


    // $ANTLR start "rule__Predict_diabetes__Group__0"
    // InternalMyDsl.g:2985:1: rule__Predict_diabetes__Group__0 : rule__Predict_diabetes__Group__0__Impl rule__Predict_diabetes__Group__1 ;
    public final void rule__Predict_diabetes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2989:1: ( rule__Predict_diabetes__Group__0__Impl rule__Predict_diabetes__Group__1 )
            // InternalMyDsl.g:2990:2: rule__Predict_diabetes__Group__0__Impl rule__Predict_diabetes__Group__1
            {
            pushFollow(FOLLOW_19);
            rule__Predict_diabetes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Predict_diabetes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predict_diabetes__Group__0"


    // $ANTLR start "rule__Predict_diabetes__Group__0__Impl"
    // InternalMyDsl.g:2997:1: rule__Predict_diabetes__Group__0__Impl : ( 'Predict_diabetes' ) ;
    public final void rule__Predict_diabetes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3001:1: ( ( 'Predict_diabetes' ) )
            // InternalMyDsl.g:3002:1: ( 'Predict_diabetes' )
            {
            // InternalMyDsl.g:3002:1: ( 'Predict_diabetes' )
            // InternalMyDsl.g:3003:2: 'Predict_diabetes'
            {
             before(grammarAccess.getPredict_diabetesAccess().getPredict_diabetesKeyword_0()); 
            match(input,41,FOLLOW_2); 
             after(grammarAccess.getPredict_diabetesAccess().getPredict_diabetesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predict_diabetes__Group__0__Impl"


    // $ANTLR start "rule__Predict_diabetes__Group__1"
    // InternalMyDsl.g:3012:1: rule__Predict_diabetes__Group__1 : rule__Predict_diabetes__Group__1__Impl ;
    public final void rule__Predict_diabetes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3016:1: ( rule__Predict_diabetes__Group__1__Impl )
            // InternalMyDsl.g:3017:2: rule__Predict_diabetes__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Predict_diabetes__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predict_diabetes__Group__1"


    // $ANTLR start "rule__Predict_diabetes__Group__1__Impl"
    // InternalMyDsl.g:3023:1: rule__Predict_diabetes__Group__1__Impl : ( ( rule__Predict_diabetes__NameAssignment_1 ) ) ;
    public final void rule__Predict_diabetes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3027:1: ( ( ( rule__Predict_diabetes__NameAssignment_1 ) ) )
            // InternalMyDsl.g:3028:1: ( ( rule__Predict_diabetes__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:3028:1: ( ( rule__Predict_diabetes__NameAssignment_1 ) )
            // InternalMyDsl.g:3029:2: ( rule__Predict_diabetes__NameAssignment_1 )
            {
             before(grammarAccess.getPredict_diabetesAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:3030:2: ( rule__Predict_diabetes__NameAssignment_1 )
            // InternalMyDsl.g:3030:3: rule__Predict_diabetes__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Predict_diabetes__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPredict_diabetesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predict_diabetes__Group__1__Impl"


    // $ANTLR start "rule__Random_forest__Group__0"
    // InternalMyDsl.g:3039:1: rule__Random_forest__Group__0 : rule__Random_forest__Group__0__Impl rule__Random_forest__Group__1 ;
    public final void rule__Random_forest__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3043:1: ( rule__Random_forest__Group__0__Impl rule__Random_forest__Group__1 )
            // InternalMyDsl.g:3044:2: rule__Random_forest__Group__0__Impl rule__Random_forest__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__Random_forest__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Random_forest__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__0"


    // $ANTLR start "rule__Random_forest__Group__0__Impl"
    // InternalMyDsl.g:3051:1: rule__Random_forest__Group__0__Impl : ( 'Random_forest' ) ;
    public final void rule__Random_forest__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3055:1: ( ( 'Random_forest' ) )
            // InternalMyDsl.g:3056:1: ( 'Random_forest' )
            {
            // InternalMyDsl.g:3056:1: ( 'Random_forest' )
            // InternalMyDsl.g:3057:2: 'Random_forest'
            {
             before(grammarAccess.getRandom_forestAccess().getRandom_forestKeyword_0()); 
            match(input,42,FOLLOW_2); 
             after(grammarAccess.getRandom_forestAccess().getRandom_forestKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__0__Impl"


    // $ANTLR start "rule__Random_forest__Group__1"
    // InternalMyDsl.g:3066:1: rule__Random_forest__Group__1 : rule__Random_forest__Group__1__Impl rule__Random_forest__Group__2 ;
    public final void rule__Random_forest__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3070:1: ( rule__Random_forest__Group__1__Impl rule__Random_forest__Group__2 )
            // InternalMyDsl.g:3071:2: rule__Random_forest__Group__1__Impl rule__Random_forest__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__Random_forest__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Random_forest__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__1"


    // $ANTLR start "rule__Random_forest__Group__1__Impl"
    // InternalMyDsl.g:3078:1: rule__Random_forest__Group__1__Impl : ( 'create_trees' ) ;
    public final void rule__Random_forest__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3082:1: ( ( 'create_trees' ) )
            // InternalMyDsl.g:3083:1: ( 'create_trees' )
            {
            // InternalMyDsl.g:3083:1: ( 'create_trees' )
            // InternalMyDsl.g:3084:2: 'create_trees'
            {
             before(grammarAccess.getRandom_forestAccess().getCreate_treesKeyword_1()); 
            match(input,43,FOLLOW_2); 
             after(grammarAccess.getRandom_forestAccess().getCreate_treesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__1__Impl"


    // $ANTLR start "rule__Random_forest__Group__2"
    // InternalMyDsl.g:3093:1: rule__Random_forest__Group__2 : rule__Random_forest__Group__2__Impl rule__Random_forest__Group__3 ;
    public final void rule__Random_forest__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3097:1: ( rule__Random_forest__Group__2__Impl rule__Random_forest__Group__3 )
            // InternalMyDsl.g:3098:2: rule__Random_forest__Group__2__Impl rule__Random_forest__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__Random_forest__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Random_forest__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__2"


    // $ANTLR start "rule__Random_forest__Group__2__Impl"
    // InternalMyDsl.g:3105:1: rule__Random_forest__Group__2__Impl : ( ( rule__Random_forest__Create_treesAssignment_2 ) ) ;
    public final void rule__Random_forest__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3109:1: ( ( ( rule__Random_forest__Create_treesAssignment_2 ) ) )
            // InternalMyDsl.g:3110:1: ( ( rule__Random_forest__Create_treesAssignment_2 ) )
            {
            // InternalMyDsl.g:3110:1: ( ( rule__Random_forest__Create_treesAssignment_2 ) )
            // InternalMyDsl.g:3111:2: ( rule__Random_forest__Create_treesAssignment_2 )
            {
             before(grammarAccess.getRandom_forestAccess().getCreate_treesAssignment_2()); 
            // InternalMyDsl.g:3112:2: ( rule__Random_forest__Create_treesAssignment_2 )
            // InternalMyDsl.g:3112:3: rule__Random_forest__Create_treesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Random_forest__Create_treesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRandom_forestAccess().getCreate_treesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__2__Impl"


    // $ANTLR start "rule__Random_forest__Group__3"
    // InternalMyDsl.g:3120:1: rule__Random_forest__Group__3 : rule__Random_forest__Group__3__Impl ;
    public final void rule__Random_forest__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3124:1: ( rule__Random_forest__Group__3__Impl )
            // InternalMyDsl.g:3125:2: rule__Random_forest__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Random_forest__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__3"


    // $ANTLR start "rule__Random_forest__Group__3__Impl"
    // InternalMyDsl.g:3131:1: rule__Random_forest__Group__3__Impl : ( ( rule__Random_forest__Predict_diabetesAssignment_3 ) ) ;
    public final void rule__Random_forest__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3135:1: ( ( ( rule__Random_forest__Predict_diabetesAssignment_3 ) ) )
            // InternalMyDsl.g:3136:1: ( ( rule__Random_forest__Predict_diabetesAssignment_3 ) )
            {
            // InternalMyDsl.g:3136:1: ( ( rule__Random_forest__Predict_diabetesAssignment_3 ) )
            // InternalMyDsl.g:3137:2: ( rule__Random_forest__Predict_diabetesAssignment_3 )
            {
             before(grammarAccess.getRandom_forestAccess().getPredict_diabetesAssignment_3()); 
            // InternalMyDsl.g:3138:2: ( rule__Random_forest__Predict_diabetesAssignment_3 )
            // InternalMyDsl.g:3138:3: rule__Random_forest__Predict_diabetesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Random_forest__Predict_diabetesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getRandom_forestAccess().getPredict_diabetesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Group__3__Impl"


    // $ANTLR start "rule__SVM_Classifier__Group__0"
    // InternalMyDsl.g:3147:1: rule__SVM_Classifier__Group__0 : rule__SVM_Classifier__Group__0__Impl rule__SVM_Classifier__Group__1 ;
    public final void rule__SVM_Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3151:1: ( rule__SVM_Classifier__Group__0__Impl rule__SVM_Classifier__Group__1 )
            // InternalMyDsl.g:3152:2: rule__SVM_Classifier__Group__0__Impl rule__SVM_Classifier__Group__1
            {
            pushFollow(FOLLOW_31);
            rule__SVM_Classifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__0"


    // $ANTLR start "rule__SVM_Classifier__Group__0__Impl"
    // InternalMyDsl.g:3159:1: rule__SVM_Classifier__Group__0__Impl : ( 'SVM_Classifier' ) ;
    public final void rule__SVM_Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3163:1: ( ( 'SVM_Classifier' ) )
            // InternalMyDsl.g:3164:1: ( 'SVM_Classifier' )
            {
            // InternalMyDsl.g:3164:1: ( 'SVM_Classifier' )
            // InternalMyDsl.g:3165:2: 'SVM_Classifier'
            {
             before(grammarAccess.getSVM_ClassifierAccess().getSVM_ClassifierKeyword_0()); 
            match(input,44,FOLLOW_2); 
             after(grammarAccess.getSVM_ClassifierAccess().getSVM_ClassifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__0__Impl"


    // $ANTLR start "rule__SVM_Classifier__Group__1"
    // InternalMyDsl.g:3174:1: rule__SVM_Classifier__Group__1 : rule__SVM_Classifier__Group__1__Impl rule__SVM_Classifier__Group__2 ;
    public final void rule__SVM_Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3178:1: ( rule__SVM_Classifier__Group__1__Impl rule__SVM_Classifier__Group__2 )
            // InternalMyDsl.g:3179:2: rule__SVM_Classifier__Group__1__Impl rule__SVM_Classifier__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__SVM_Classifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__1"


    // $ANTLR start "rule__SVM_Classifier__Group__1__Impl"
    // InternalMyDsl.g:3186:1: rule__SVM_Classifier__Group__1__Impl : ( 'kernel:' ) ;
    public final void rule__SVM_Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3190:1: ( ( 'kernel:' ) )
            // InternalMyDsl.g:3191:1: ( 'kernel:' )
            {
            // InternalMyDsl.g:3191:1: ( 'kernel:' )
            // InternalMyDsl.g:3192:2: 'kernel:'
            {
             before(grammarAccess.getSVM_ClassifierAccess().getKernelKeyword_1()); 
            match(input,45,FOLLOW_2); 
             after(grammarAccess.getSVM_ClassifierAccess().getKernelKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__1__Impl"


    // $ANTLR start "rule__SVM_Classifier__Group__2"
    // InternalMyDsl.g:3201:1: rule__SVM_Classifier__Group__2 : rule__SVM_Classifier__Group__2__Impl rule__SVM_Classifier__Group__3 ;
    public final void rule__SVM_Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3205:1: ( rule__SVM_Classifier__Group__2__Impl rule__SVM_Classifier__Group__3 )
            // InternalMyDsl.g:3206:2: rule__SVM_Classifier__Group__2__Impl rule__SVM_Classifier__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__SVM_Classifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__2"


    // $ANTLR start "rule__SVM_Classifier__Group__2__Impl"
    // InternalMyDsl.g:3213:1: rule__SVM_Classifier__Group__2__Impl : ( ( rule__SVM_Classifier__KernelAssignment_2 ) ) ;
    public final void rule__SVM_Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3217:1: ( ( ( rule__SVM_Classifier__KernelAssignment_2 ) ) )
            // InternalMyDsl.g:3218:1: ( ( rule__SVM_Classifier__KernelAssignment_2 ) )
            {
            // InternalMyDsl.g:3218:1: ( ( rule__SVM_Classifier__KernelAssignment_2 ) )
            // InternalMyDsl.g:3219:2: ( rule__SVM_Classifier__KernelAssignment_2 )
            {
             before(grammarAccess.getSVM_ClassifierAccess().getKernelAssignment_2()); 
            // InternalMyDsl.g:3220:2: ( rule__SVM_Classifier__KernelAssignment_2 )
            // InternalMyDsl.g:3220:3: rule__SVM_Classifier__KernelAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__KernelAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getSVM_ClassifierAccess().getKernelAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__2__Impl"


    // $ANTLR start "rule__SVM_Classifier__Group__3"
    // InternalMyDsl.g:3228:1: rule__SVM_Classifier__Group__3 : rule__SVM_Classifier__Group__3__Impl ;
    public final void rule__SVM_Classifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3232:1: ( rule__SVM_Classifier__Group__3__Impl )
            // InternalMyDsl.g:3233:2: rule__SVM_Classifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__3"


    // $ANTLR start "rule__SVM_Classifier__Group__3__Impl"
    // InternalMyDsl.g:3239:1: rule__SVM_Classifier__Group__3__Impl : ( ( rule__SVM_Classifier__Predict_diabetesAssignment_3 ) ) ;
    public final void rule__SVM_Classifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3243:1: ( ( ( rule__SVM_Classifier__Predict_diabetesAssignment_3 ) ) )
            // InternalMyDsl.g:3244:1: ( ( rule__SVM_Classifier__Predict_diabetesAssignment_3 ) )
            {
            // InternalMyDsl.g:3244:1: ( ( rule__SVM_Classifier__Predict_diabetesAssignment_3 ) )
            // InternalMyDsl.g:3245:2: ( rule__SVM_Classifier__Predict_diabetesAssignment_3 )
            {
             before(grammarAccess.getSVM_ClassifierAccess().getPredict_diabetesAssignment_3()); 
            // InternalMyDsl.g:3246:2: ( rule__SVM_Classifier__Predict_diabetesAssignment_3 )
            // InternalMyDsl.g:3246:3: rule__SVM_Classifier__Predict_diabetesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__SVM_Classifier__Predict_diabetesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSVM_ClassifierAccess().getPredict_diabetesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Group__3__Impl"


    // $ANTLR start "rule__J48Classifier__Group__0"
    // InternalMyDsl.g:3255:1: rule__J48Classifier__Group__0 : rule__J48Classifier__Group__0__Impl rule__J48Classifier__Group__1 ;
    public final void rule__J48Classifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3259:1: ( rule__J48Classifier__Group__0__Impl rule__J48Classifier__Group__1 )
            // InternalMyDsl.g:3260:2: rule__J48Classifier__Group__0__Impl rule__J48Classifier__Group__1
            {
            pushFollow(FOLLOW_32);
            rule__J48Classifier__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__J48Classifier__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__0"


    // $ANTLR start "rule__J48Classifier__Group__0__Impl"
    // InternalMyDsl.g:3267:1: rule__J48Classifier__Group__0__Impl : ( 'J48Classifier' ) ;
    public final void rule__J48Classifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3271:1: ( ( 'J48Classifier' ) )
            // InternalMyDsl.g:3272:1: ( 'J48Classifier' )
            {
            // InternalMyDsl.g:3272:1: ( 'J48Classifier' )
            // InternalMyDsl.g:3273:2: 'J48Classifier'
            {
             before(grammarAccess.getJ48ClassifierAccess().getJ48ClassifierKeyword_0()); 
            match(input,46,FOLLOW_2); 
             after(grammarAccess.getJ48ClassifierAccess().getJ48ClassifierKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__0__Impl"


    // $ANTLR start "rule__J48Classifier__Group__1"
    // InternalMyDsl.g:3282:1: rule__J48Classifier__Group__1 : rule__J48Classifier__Group__1__Impl rule__J48Classifier__Group__2 ;
    public final void rule__J48Classifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3286:1: ( rule__J48Classifier__Group__1__Impl rule__J48Classifier__Group__2 )
            // InternalMyDsl.g:3287:2: rule__J48Classifier__Group__1__Impl rule__J48Classifier__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__J48Classifier__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__J48Classifier__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__1"


    // $ANTLR start "rule__J48Classifier__Group__1__Impl"
    // InternalMyDsl.g:3294:1: rule__J48Classifier__Group__1__Impl : ( 'set_pruned_trees:' ) ;
    public final void rule__J48Classifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3298:1: ( ( 'set_pruned_trees:' ) )
            // InternalMyDsl.g:3299:1: ( 'set_pruned_trees:' )
            {
            // InternalMyDsl.g:3299:1: ( 'set_pruned_trees:' )
            // InternalMyDsl.g:3300:2: 'set_pruned_trees:'
            {
             before(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesKeyword_1()); 
            match(input,47,FOLLOW_2); 
             after(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__1__Impl"


    // $ANTLR start "rule__J48Classifier__Group__2"
    // InternalMyDsl.g:3309:1: rule__J48Classifier__Group__2 : rule__J48Classifier__Group__2__Impl rule__J48Classifier__Group__3 ;
    public final void rule__J48Classifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3313:1: ( rule__J48Classifier__Group__2__Impl rule__J48Classifier__Group__3 )
            // InternalMyDsl.g:3314:2: rule__J48Classifier__Group__2__Impl rule__J48Classifier__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__J48Classifier__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__J48Classifier__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__2"


    // $ANTLR start "rule__J48Classifier__Group__2__Impl"
    // InternalMyDsl.g:3321:1: rule__J48Classifier__Group__2__Impl : ( ( rule__J48Classifier__Set_pruned_treesAssignment_2 ) ) ;
    public final void rule__J48Classifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3325:1: ( ( ( rule__J48Classifier__Set_pruned_treesAssignment_2 ) ) )
            // InternalMyDsl.g:3326:1: ( ( rule__J48Classifier__Set_pruned_treesAssignment_2 ) )
            {
            // InternalMyDsl.g:3326:1: ( ( rule__J48Classifier__Set_pruned_treesAssignment_2 ) )
            // InternalMyDsl.g:3327:2: ( rule__J48Classifier__Set_pruned_treesAssignment_2 )
            {
             before(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesAssignment_2()); 
            // InternalMyDsl.g:3328:2: ( rule__J48Classifier__Set_pruned_treesAssignment_2 )
            // InternalMyDsl.g:3328:3: rule__J48Classifier__Set_pruned_treesAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__J48Classifier__Set_pruned_treesAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__2__Impl"


    // $ANTLR start "rule__J48Classifier__Group__3"
    // InternalMyDsl.g:3336:1: rule__J48Classifier__Group__3 : rule__J48Classifier__Group__3__Impl ;
    public final void rule__J48Classifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3340:1: ( rule__J48Classifier__Group__3__Impl )
            // InternalMyDsl.g:3341:2: rule__J48Classifier__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__J48Classifier__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__3"


    // $ANTLR start "rule__J48Classifier__Group__3__Impl"
    // InternalMyDsl.g:3347:1: rule__J48Classifier__Group__3__Impl : ( ( rule__J48Classifier__Predict_diabetesAssignment_3 ) ) ;
    public final void rule__J48Classifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3351:1: ( ( ( rule__J48Classifier__Predict_diabetesAssignment_3 ) ) )
            // InternalMyDsl.g:3352:1: ( ( rule__J48Classifier__Predict_diabetesAssignment_3 ) )
            {
            // InternalMyDsl.g:3352:1: ( ( rule__J48Classifier__Predict_diabetesAssignment_3 ) )
            // InternalMyDsl.g:3353:2: ( rule__J48Classifier__Predict_diabetesAssignment_3 )
            {
             before(grammarAccess.getJ48ClassifierAccess().getPredict_diabetesAssignment_3()); 
            // InternalMyDsl.g:3354:2: ( rule__J48Classifier__Predict_diabetesAssignment_3 )
            // InternalMyDsl.g:3354:3: rule__J48Classifier__Predict_diabetesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__J48Classifier__Predict_diabetesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJ48ClassifierAccess().getPredict_diabetesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Group__3__Impl"


    // $ANTLR start "rule__NavieBayes__Group__0"
    // InternalMyDsl.g:3363:1: rule__NavieBayes__Group__0 : rule__NavieBayes__Group__0__Impl rule__NavieBayes__Group__1 ;
    public final void rule__NavieBayes__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3367:1: ( rule__NavieBayes__Group__0__Impl rule__NavieBayes__Group__1 )
            // InternalMyDsl.g:3368:2: rule__NavieBayes__Group__0__Impl rule__NavieBayes__Group__1
            {
            pushFollow(FOLLOW_33);
            rule__NavieBayes__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavieBayes__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__0"


    // $ANTLR start "rule__NavieBayes__Group__0__Impl"
    // InternalMyDsl.g:3375:1: rule__NavieBayes__Group__0__Impl : ( 'NavieBayes' ) ;
    public final void rule__NavieBayes__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3379:1: ( ( 'NavieBayes' ) )
            // InternalMyDsl.g:3380:1: ( 'NavieBayes' )
            {
            // InternalMyDsl.g:3380:1: ( 'NavieBayes' )
            // InternalMyDsl.g:3381:2: 'NavieBayes'
            {
             before(grammarAccess.getNavieBayesAccess().getNavieBayesKeyword_0()); 
            match(input,48,FOLLOW_2); 
             after(grammarAccess.getNavieBayesAccess().getNavieBayesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__0__Impl"


    // $ANTLR start "rule__NavieBayes__Group__1"
    // InternalMyDsl.g:3390:1: rule__NavieBayes__Group__1 : rule__NavieBayes__Group__1__Impl rule__NavieBayes__Group__2 ;
    public final void rule__NavieBayes__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3394:1: ( rule__NavieBayes__Group__1__Impl rule__NavieBayes__Group__2 )
            // InternalMyDsl.g:3395:2: rule__NavieBayes__Group__1__Impl rule__NavieBayes__Group__2
            {
            pushFollow(FOLLOW_11);
            rule__NavieBayes__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavieBayes__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__1"


    // $ANTLR start "rule__NavieBayes__Group__1__Impl"
    // InternalMyDsl.g:3402:1: rule__NavieBayes__Group__1__Impl : ( 'Conditional_Probability_based:' ) ;
    public final void rule__NavieBayes__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3406:1: ( ( 'Conditional_Probability_based:' ) )
            // InternalMyDsl.g:3407:1: ( 'Conditional_Probability_based:' )
            {
            // InternalMyDsl.g:3407:1: ( 'Conditional_Probability_based:' )
            // InternalMyDsl.g:3408:2: 'Conditional_Probability_based:'
            {
             before(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedKeyword_1()); 
            match(input,49,FOLLOW_2); 
             after(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__1__Impl"


    // $ANTLR start "rule__NavieBayes__Group__2"
    // InternalMyDsl.g:3417:1: rule__NavieBayes__Group__2 : rule__NavieBayes__Group__2__Impl rule__NavieBayes__Group__3 ;
    public final void rule__NavieBayes__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3421:1: ( rule__NavieBayes__Group__2__Impl rule__NavieBayes__Group__3 )
            // InternalMyDsl.g:3422:2: rule__NavieBayes__Group__2__Impl rule__NavieBayes__Group__3
            {
            pushFollow(FOLLOW_30);
            rule__NavieBayes__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__NavieBayes__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__2"


    // $ANTLR start "rule__NavieBayes__Group__2__Impl"
    // InternalMyDsl.g:3429:1: rule__NavieBayes__Group__2__Impl : ( ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 ) ) ;
    public final void rule__NavieBayes__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3433:1: ( ( ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 ) ) )
            // InternalMyDsl.g:3434:1: ( ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 ) )
            {
            // InternalMyDsl.g:3434:1: ( ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 ) )
            // InternalMyDsl.g:3435:2: ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 )
            {
             before(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedAssignment_2()); 
            // InternalMyDsl.g:3436:2: ( rule__NavieBayes__Conditional_Probability_basedAssignment_2 )
            // InternalMyDsl.g:3436:3: rule__NavieBayes__Conditional_Probability_basedAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__NavieBayes__Conditional_Probability_basedAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__2__Impl"


    // $ANTLR start "rule__NavieBayes__Group__3"
    // InternalMyDsl.g:3444:1: rule__NavieBayes__Group__3 : rule__NavieBayes__Group__3__Impl ;
    public final void rule__NavieBayes__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3448:1: ( rule__NavieBayes__Group__3__Impl )
            // InternalMyDsl.g:3449:2: rule__NavieBayes__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__NavieBayes__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__3"


    // $ANTLR start "rule__NavieBayes__Group__3__Impl"
    // InternalMyDsl.g:3455:1: rule__NavieBayes__Group__3__Impl : ( ( rule__NavieBayes__Predict_diabetesAssignment_3 ) ) ;
    public final void rule__NavieBayes__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3459:1: ( ( ( rule__NavieBayes__Predict_diabetesAssignment_3 ) ) )
            // InternalMyDsl.g:3460:1: ( ( rule__NavieBayes__Predict_diabetesAssignment_3 ) )
            {
            // InternalMyDsl.g:3460:1: ( ( rule__NavieBayes__Predict_diabetesAssignment_3 ) )
            // InternalMyDsl.g:3461:2: ( rule__NavieBayes__Predict_diabetesAssignment_3 )
            {
             before(grammarAccess.getNavieBayesAccess().getPredict_diabetesAssignment_3()); 
            // InternalMyDsl.g:3462:2: ( rule__NavieBayes__Predict_diabetesAssignment_3 )
            // InternalMyDsl.g:3462:3: rule__NavieBayes__Predict_diabetesAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__NavieBayes__Predict_diabetesAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getNavieBayesAccess().getPredict_diabetesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Group__3__Impl"


    // $ANTLR start "rule__Diabetes_Prediction_System__NameAssignment_1"
    // InternalMyDsl.g:3471:1: rule__Diabetes_Prediction_System__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Diabetes_Prediction_System__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3475:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3476:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3476:2: ( RULE_ID )
            // InternalMyDsl.g:3477:3: RULE_ID
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__NameAssignment_1"


    // $ANTLR start "rule__Diabetes_Prediction_System__MedicinesAssignment_2"
    // InternalMyDsl.g:3486:1: rule__Diabetes_Prediction_System__MedicinesAssignment_2 : ( ruleMedicines ) ;
    public final void rule__Diabetes_Prediction_System__MedicinesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3490:1: ( ( ruleMedicines ) )
            // InternalMyDsl.g:3491:2: ( ruleMedicines )
            {
            // InternalMyDsl.g:3491:2: ( ruleMedicines )
            // InternalMyDsl.g:3492:3: ruleMedicines
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getMedicinesMedicinesParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicines();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getMedicinesMedicinesParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__MedicinesAssignment_2"


    // $ANTLR start "rule__Diabetes_Prediction_System__SymptomAssignment_3"
    // InternalMyDsl.g:3501:1: rule__Diabetes_Prediction_System__SymptomAssignment_3 : ( ruleSymptom ) ;
    public final void rule__Diabetes_Prediction_System__SymptomAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3505:1: ( ( ruleSymptom ) )
            // InternalMyDsl.g:3506:2: ( ruleSymptom )
            {
            // InternalMyDsl.g:3506:2: ( ruleSymptom )
            // InternalMyDsl.g:3507:3: ruleSymptom
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getSymptomSymptomParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getSymptomSymptomParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__SymptomAssignment_3"


    // $ANTLR start "rule__Diabetes_Prediction_System__DoctorsAssignment_4"
    // InternalMyDsl.g:3516:1: rule__Diabetes_Prediction_System__DoctorsAssignment_4 : ( ruleDoctor ) ;
    public final void rule__Diabetes_Prediction_System__DoctorsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3520:1: ( ( ruleDoctor ) )
            // InternalMyDsl.g:3521:2: ( ruleDoctor )
            {
            // InternalMyDsl.g:3521:2: ( ruleDoctor )
            // InternalMyDsl.g:3522:3: ruleDoctor
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getDoctorsDoctorParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleDoctor();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getDoctorsDoctorParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__DoctorsAssignment_4"


    // $ANTLR start "rule__Diabetes_Prediction_System__PatientAssignment_5"
    // InternalMyDsl.g:3531:1: rule__Diabetes_Prediction_System__PatientAssignment_5 : ( rulePatient ) ;
    public final void rule__Diabetes_Prediction_System__PatientAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3535:1: ( ( rulePatient ) )
            // InternalMyDsl.g:3536:2: ( rulePatient )
            {
            // InternalMyDsl.g:3536:2: ( rulePatient )
            // InternalMyDsl.g:3537:3: rulePatient
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getPatientPatientParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            rulePatient();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getPatientPatientParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__PatientAssignment_5"


    // $ANTLR start "rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6"
    // InternalMyDsl.g:3546:1: rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6 : ( ruleMachine_learning_Algorithms ) ;
    public final void rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3550:1: ( ( ruleMachine_learning_Algorithms ) )
            // InternalMyDsl.g:3551:2: ( ruleMachine_learning_Algorithms )
            {
            // InternalMyDsl.g:3551:2: ( ruleMachine_learning_Algorithms )
            // InternalMyDsl.g:3552:3: ruleMachine_learning_Algorithms
            {
             before(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsMachine_learning_AlgorithmsParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleMachine_learning_Algorithms();

            state._fsp--;

             after(grammarAccess.getDiabetes_Prediction_SystemAccess().getMachine_learning_AlgorithmsMachine_learning_AlgorithmsParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Diabetes_Prediction_System__Machine_learning_AlgorithmsAssignment_6"


    // $ANTLR start "rule__Medicines__Medicine_nameAssignment_1"
    // InternalMyDsl.g:3561:1: rule__Medicines__Medicine_nameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Medicines__Medicine_nameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3565:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3566:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3566:2: ( RULE_ID )
            // InternalMyDsl.g:3567:3: RULE_ID
            {
             before(grammarAccess.getMedicinesAccess().getMedicine_nameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMedicinesAccess().getMedicine_nameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Medicine_nameAssignment_1"


    // $ANTLR start "rule__Medicines__Medicine_dossageAssignment_3"
    // InternalMyDsl.g:3576:1: rule__Medicines__Medicine_dossageAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Medicines__Medicine_dossageAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3580:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3581:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3581:2: ( RULE_STRING )
            // InternalMyDsl.g:3582:3: RULE_STRING
            {
             before(grammarAccess.getMedicinesAccess().getMedicine_dossageSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getMedicinesAccess().getMedicine_dossageSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Medicines__Medicine_dossageAssignment_3"


    // $ANTLR start "rule__Polyuria__NameAssignment_2"
    // InternalMyDsl.g:3591:1: rule__Polyuria__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Polyuria__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3595:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3596:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3596:2: ( RULE_ID )
            // InternalMyDsl.g:3597:3: RULE_ID
            {
             before(grammarAccess.getPolyuriaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyuriaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyuria__NameAssignment_2"


    // $ANTLR start "rule__Polydipsia__NameAssignment_2"
    // InternalMyDsl.g:3606:1: rule__Polydipsia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Polydipsia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3610:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3611:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3611:2: ( RULE_ID )
            // InternalMyDsl.g:3612:3: RULE_ID
            {
             before(grammarAccess.getPolydipsiaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolydipsiaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polydipsia__NameAssignment_2"


    // $ANTLR start "rule__Sudden_weight_loss__NameAssignment_2"
    // InternalMyDsl.g:3621:1: rule__Sudden_weight_loss__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Sudden_weight_loss__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3625:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3626:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3626:2: ( RULE_ID )
            // InternalMyDsl.g:3627:3: RULE_ID
            {
             before(grammarAccess.getSudden_weight_lossAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getSudden_weight_lossAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sudden_weight_loss__NameAssignment_2"


    // $ANTLR start "rule__Polyphagia__NameAssignment_2"
    // InternalMyDsl.g:3636:1: rule__Polyphagia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Polyphagia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3640:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3641:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3641:2: ( RULE_ID )
            // InternalMyDsl.g:3642:3: RULE_ID
            {
             before(grammarAccess.getPolyphagiaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPolyphagiaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Polyphagia__NameAssignment_2"


    // $ANTLR start "rule__Genital_thrush__NameAssignment_2"
    // InternalMyDsl.g:3651:1: rule__Genital_thrush__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Genital_thrush__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3655:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3656:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3656:2: ( RULE_ID )
            // InternalMyDsl.g:3657:3: RULE_ID
            {
             before(grammarAccess.getGenital_thrushAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getGenital_thrushAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Genital_thrush__NameAssignment_2"


    // $ANTLR start "rule__Visual_blurring__NameAssignment_2"
    // InternalMyDsl.g:3666:1: rule__Visual_blurring__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Visual_blurring__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3670:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3671:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3671:2: ( RULE_ID )
            // InternalMyDsl.g:3672:3: RULE_ID
            {
             before(grammarAccess.getVisual_blurringAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVisual_blurringAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Visual_blurring__NameAssignment_2"


    // $ANTLR start "rule__Itching__NameAssignment_2"
    // InternalMyDsl.g:3681:1: rule__Itching__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Itching__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3685:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3686:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3686:2: ( RULE_ID )
            // InternalMyDsl.g:3687:3: RULE_ID
            {
             before(grammarAccess.getItchingAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getItchingAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Itching__NameAssignment_2"


    // $ANTLR start "rule__Irritability__NameAssignment_2"
    // InternalMyDsl.g:3696:1: rule__Irritability__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Irritability__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3700:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3701:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3701:2: ( RULE_ID )
            // InternalMyDsl.g:3702:3: RULE_ID
            {
             before(grammarAccess.getIrritabilityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getIrritabilityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Irritability__NameAssignment_2"


    // $ANTLR start "rule__Delayed_healing__NameAssignment_2"
    // InternalMyDsl.g:3711:1: rule__Delayed_healing__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Delayed_healing__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3715:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3716:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3716:2: ( RULE_ID )
            // InternalMyDsl.g:3717:3: RULE_ID
            {
             before(grammarAccess.getDelayed_healingAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDelayed_healingAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Delayed_healing__NameAssignment_2"


    // $ANTLR start "rule__Partial_paresis__NameAssignment_2"
    // InternalMyDsl.g:3726:1: rule__Partial_paresis__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Partial_paresis__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3730:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3731:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3731:2: ( RULE_ID )
            // InternalMyDsl.g:3732:3: RULE_ID
            {
             before(grammarAccess.getPartial_paresisAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPartial_paresisAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Partial_paresis__NameAssignment_2"


    // $ANTLR start "rule__Muscle_stiffness__NameAssignment_2"
    // InternalMyDsl.g:3741:1: rule__Muscle_stiffness__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Muscle_stiffness__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3745:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3746:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3746:2: ( RULE_ID )
            // InternalMyDsl.g:3747:3: RULE_ID
            {
             before(grammarAccess.getMuscle_stiffnessAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMuscle_stiffnessAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Muscle_stiffness__NameAssignment_2"


    // $ANTLR start "rule__Alopecia__NameAssignment_2"
    // InternalMyDsl.g:3756:1: rule__Alopecia__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Alopecia__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3760:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3761:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3761:2: ( RULE_ID )
            // InternalMyDsl.g:3762:3: RULE_ID
            {
             before(grammarAccess.getAlopeciaAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlopeciaAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alopecia__NameAssignment_2"


    // $ANTLR start "rule__Obesity__NameAssignment_2"
    // InternalMyDsl.g:3771:1: rule__Obesity__NameAssignment_2 : ( RULE_ID ) ;
    public final void rule__Obesity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3775:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3776:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3776:2: ( RULE_ID )
            // InternalMyDsl.g:3777:3: RULE_ID
            {
             before(grammarAccess.getObesityAccess().getNameIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getObesityAccess().getNameIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Obesity__NameAssignment_2"


    // $ANTLR start "rule__Sugar_Test__Previous_blood_sugarAssignment_2"
    // InternalMyDsl.g:3786:1: rule__Sugar_Test__Previous_blood_sugarAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Sugar_Test__Previous_blood_sugarAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3790:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3791:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3791:2: ( RULE_STRING )
            // InternalMyDsl.g:3792:3: RULE_STRING
            {
             before(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSugar_TestAccess().getPrevious_blood_sugarSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Previous_blood_sugarAssignment_2"


    // $ANTLR start "rule__Sugar_Test__Current_blood_sugarAssignment_4"
    // InternalMyDsl.g:3801:1: rule__Sugar_Test__Current_blood_sugarAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Sugar_Test__Current_blood_sugarAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3805:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3806:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3806:2: ( RULE_STRING )
            // InternalMyDsl.g:3807:3: RULE_STRING
            {
             before(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSugar_TestAccess().getCurrent_blood_sugarSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sugar_Test__Current_blood_sugarAssignment_4"


    // $ANTLR start "rule__Doctor__NameAssignment_1"
    // InternalMyDsl.g:3816:1: rule__Doctor__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Doctor__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3820:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3821:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3821:2: ( RULE_ID )
            // InternalMyDsl.g:3822:3: RULE_ID
            {
             before(grammarAccess.getDoctorAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getDoctorAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__NameAssignment_1"


    // $ANTLR start "rule__Doctor__Doctor_specailizationAssignment_3"
    // InternalMyDsl.g:3831:1: rule__Doctor__Doctor_specailizationAssignment_3 : ( RULE_STRING ) ;
    public final void rule__Doctor__Doctor_specailizationAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3835:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3836:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3836:2: ( RULE_STRING )
            // InternalMyDsl.g:3837:3: RULE_STRING
            {
             before(grammarAccess.getDoctorAccess().getDoctor_specailizationSTRINGTerminalRuleCall_3_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getDoctorAccess().getDoctor_specailizationSTRINGTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__Doctor_specailizationAssignment_3"


    // $ANTLR start "rule__Doctor__MedicinesAssignment_4"
    // InternalMyDsl.g:3846:1: rule__Doctor__MedicinesAssignment_4 : ( ruleMedicines ) ;
    public final void rule__Doctor__MedicinesAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3850:1: ( ( ruleMedicines ) )
            // InternalMyDsl.g:3851:2: ( ruleMedicines )
            {
            // InternalMyDsl.g:3851:2: ( ruleMedicines )
            // InternalMyDsl.g:3852:3: ruleMedicines
            {
             before(grammarAccess.getDoctorAccess().getMedicinesMedicinesParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicines();

            state._fsp--;

             after(grammarAccess.getDoctorAccess().getMedicinesMedicinesParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__MedicinesAssignment_4"


    // $ANTLR start "rule__Doctor__SymptomsAssignment_5"
    // InternalMyDsl.g:3861:1: rule__Doctor__SymptomsAssignment_5 : ( ruleSymptom ) ;
    public final void rule__Doctor__SymptomsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3865:1: ( ( ruleSymptom ) )
            // InternalMyDsl.g:3866:2: ( ruleSymptom )
            {
            // InternalMyDsl.g:3866:2: ( ruleSymptom )
            // InternalMyDsl.g:3867:3: ruleSymptom
            {
             before(grammarAccess.getDoctorAccess().getSymptomsSymptomParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getDoctorAccess().getSymptomsSymptomParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Doctor__SymptomsAssignment_5"


    // $ANTLR start "rule__Patient__NameAssignment_1"
    // InternalMyDsl.g:3876:1: rule__Patient__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Patient__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3880:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3881:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3881:2: ( RULE_ID )
            // InternalMyDsl.g:3882:3: RULE_ID
            {
             before(grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__NameAssignment_1"


    // $ANTLR start "rule__Patient__Patient_GenderAssignment_3"
    // InternalMyDsl.g:3891:1: rule__Patient__Patient_GenderAssignment_3 : ( RULE_ID ) ;
    public final void rule__Patient__Patient_GenderAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3895:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:3896:2: ( RULE_ID )
            {
            // InternalMyDsl.g:3896:2: ( RULE_ID )
            // InternalMyDsl.g:3897:3: RULE_ID
            {
             before(grammarAccess.getPatientAccess().getPatient_GenderIDTerminalRuleCall_3_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_GenderIDTerminalRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Patient_GenderAssignment_3"


    // $ANTLR start "rule__Patient__Patient_AgeAssignment_5"
    // InternalMyDsl.g:3906:1: rule__Patient__Patient_AgeAssignment_5 : ( RULE_INT ) ;
    public final void rule__Patient__Patient_AgeAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3910:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3911:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3911:2: ( RULE_INT )
            // InternalMyDsl.g:3912:3: RULE_INT
            {
             before(grammarAccess.getPatientAccess().getPatient_AgeINTTerminalRuleCall_5_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_AgeINTTerminalRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Patient_AgeAssignment_5"


    // $ANTLR start "rule__Patient__Patient_HeightAssignment_7"
    // InternalMyDsl.g:3921:1: rule__Patient__Patient_HeightAssignment_7 : ( RULE_STRING ) ;
    public final void rule__Patient__Patient_HeightAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3925:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3926:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3926:2: ( RULE_STRING )
            // InternalMyDsl.g:3927:3: RULE_STRING
            {
             before(grammarAccess.getPatientAccess().getPatient_HeightSTRINGTerminalRuleCall_7_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_HeightSTRINGTerminalRuleCall_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Patient_HeightAssignment_7"


    // $ANTLR start "rule__Patient__Patient_WeightAssignment_9"
    // InternalMyDsl.g:3936:1: rule__Patient__Patient_WeightAssignment_9 : ( RULE_STRING ) ;
    public final void rule__Patient__Patient_WeightAssignment_9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3940:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:3941:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:3941:2: ( RULE_STRING )
            // InternalMyDsl.g:3942:3: RULE_STRING
            {
             before(grammarAccess.getPatientAccess().getPatient_WeightSTRINGTerminalRuleCall_9_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_WeightSTRINGTerminalRuleCall_9_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Patient_WeightAssignment_9"


    // $ANTLR start "rule__Patient__Patient_blood_pressureAssignment_11"
    // InternalMyDsl.g:3951:1: rule__Patient__Patient_blood_pressureAssignment_11 : ( RULE_INT ) ;
    public final void rule__Patient__Patient_blood_pressureAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3955:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3956:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3956:2: ( RULE_INT )
            // InternalMyDsl.g:3957:3: RULE_INT
            {
             before(grammarAccess.getPatientAccess().getPatient_blood_pressureINTTerminalRuleCall_11_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPatient_blood_pressureINTTerminalRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Patient_blood_pressureAssignment_11"


    // $ANTLR start "rule__Patient__Pulse_rateAssignment_13"
    // InternalMyDsl.g:3966:1: rule__Patient__Pulse_rateAssignment_13 : ( RULE_INT ) ;
    public final void rule__Patient__Pulse_rateAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3970:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:3971:2: ( RULE_INT )
            {
            // InternalMyDsl.g:3971:2: ( RULE_INT )
            // InternalMyDsl.g:3972:3: RULE_INT
            {
             before(grammarAccess.getPatientAccess().getPulse_rateINTTerminalRuleCall_13_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getPulse_rateINTTerminalRuleCall_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Pulse_rateAssignment_13"


    // $ANTLR start "rule__Patient__SymptomsAssignment_14"
    // InternalMyDsl.g:3981:1: rule__Patient__SymptomsAssignment_14 : ( ruleSymptom ) ;
    public final void rule__Patient__SymptomsAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:3985:1: ( ( ruleSymptom ) )
            // InternalMyDsl.g:3986:2: ( ruleSymptom )
            {
            // InternalMyDsl.g:3986:2: ( ruleSymptom )
            // InternalMyDsl.g:3987:3: ruleSymptom
            {
             before(grammarAccess.getPatientAccess().getSymptomsSymptomParserRuleCall_14_0()); 
            pushFollow(FOLLOW_2);
            ruleSymptom();

            state._fsp--;

             after(grammarAccess.getPatientAccess().getSymptomsSymptomParserRuleCall_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__SymptomsAssignment_14"


    // $ANTLR start "rule__Patient__MedicinesAssignment_15"
    // InternalMyDsl.g:3996:1: rule__Patient__MedicinesAssignment_15 : ( ruleMedicines ) ;
    public final void rule__Patient__MedicinesAssignment_15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4000:1: ( ( ruleMedicines ) )
            // InternalMyDsl.g:4001:2: ( ruleMedicines )
            {
            // InternalMyDsl.g:4001:2: ( ruleMedicines )
            // InternalMyDsl.g:4002:3: ruleMedicines
            {
             before(grammarAccess.getPatientAccess().getMedicinesMedicinesParserRuleCall_15_0()); 
            pushFollow(FOLLOW_2);
            ruleMedicines();

            state._fsp--;

             after(grammarAccess.getPatientAccess().getMedicinesMedicinesParserRuleCall_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__MedicinesAssignment_15"


    // $ANTLR start "rule__Patient__Sugar_testsAssignment_16"
    // InternalMyDsl.g:4011:1: rule__Patient__Sugar_testsAssignment_16 : ( ruleSugar_Test ) ;
    public final void rule__Patient__Sugar_testsAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4015:1: ( ( ruleSugar_Test ) )
            // InternalMyDsl.g:4016:2: ( ruleSugar_Test )
            {
            // InternalMyDsl.g:4016:2: ( ruleSugar_Test )
            // InternalMyDsl.g:4017:3: ruleSugar_Test
            {
             before(grammarAccess.getPatientAccess().getSugar_testsSugar_TestParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleSugar_Test();

            state._fsp--;

             after(grammarAccess.getPatientAccess().getSugar_testsSugar_TestParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__Sugar_testsAssignment_16"


    // $ANTLR start "rule__Patient__DOCTORSAssignment_18"
    // InternalMyDsl.g:4026:1: rule__Patient__DOCTORSAssignment_18 : ( ( RULE_ID ) ) ;
    public final void rule__Patient__DOCTORSAssignment_18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4030:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:4031:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:4031:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:4032:3: ( RULE_ID )
            {
             before(grammarAccess.getPatientAccess().getDOCTORSDoctorCrossReference_18_0()); 
            // InternalMyDsl.g:4033:3: ( RULE_ID )
            // InternalMyDsl.g:4034:4: RULE_ID
            {
             before(grammarAccess.getPatientAccess().getDOCTORSDoctorIDTerminalRuleCall_18_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPatientAccess().getDOCTORSDoctorIDTerminalRuleCall_18_0_1()); 

            }

             after(grammarAccess.getPatientAccess().getDOCTORSDoctorCrossReference_18_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Patient__DOCTORSAssignment_18"


    // $ANTLR start "rule__Predict_diabetes__NameAssignment_1"
    // InternalMyDsl.g:4045:1: rule__Predict_diabetes__NameAssignment_1 : ( RULE_INT ) ;
    public final void rule__Predict_diabetes__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4049:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:4050:2: ( RULE_INT )
            {
            // InternalMyDsl.g:4050:2: ( RULE_INT )
            // InternalMyDsl.g:4051:3: RULE_INT
            {
             before(grammarAccess.getPredict_diabetesAccess().getNameINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getPredict_diabetesAccess().getNameINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Predict_diabetes__NameAssignment_1"


    // $ANTLR start "rule__Random_forest__Create_treesAssignment_2"
    // InternalMyDsl.g:4060:1: rule__Random_forest__Create_treesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Random_forest__Create_treesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4064:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4065:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4065:2: ( RULE_STRING )
            // InternalMyDsl.g:4066:3: RULE_STRING
            {
             before(grammarAccess.getRandom_forestAccess().getCreate_treesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRandom_forestAccess().getCreate_treesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Create_treesAssignment_2"


    // $ANTLR start "rule__Random_forest__Predict_diabetesAssignment_3"
    // InternalMyDsl.g:4075:1: rule__Random_forest__Predict_diabetesAssignment_3 : ( rulePredict_diabetes ) ;
    public final void rule__Random_forest__Predict_diabetesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4079:1: ( ( rulePredict_diabetes ) )
            // InternalMyDsl.g:4080:2: ( rulePredict_diabetes )
            {
            // InternalMyDsl.g:4080:2: ( rulePredict_diabetes )
            // InternalMyDsl.g:4081:3: rulePredict_diabetes
            {
             before(grammarAccess.getRandom_forestAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePredict_diabetes();

            state._fsp--;

             after(grammarAccess.getRandom_forestAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Random_forest__Predict_diabetesAssignment_3"


    // $ANTLR start "rule__SVM_Classifier__KernelAssignment_2"
    // InternalMyDsl.g:4090:1: rule__SVM_Classifier__KernelAssignment_2 : ( RULE_STRING ) ;
    public final void rule__SVM_Classifier__KernelAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4094:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4095:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4095:2: ( RULE_STRING )
            // InternalMyDsl.g:4096:3: RULE_STRING
            {
             before(grammarAccess.getSVM_ClassifierAccess().getKernelSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getSVM_ClassifierAccess().getKernelSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__KernelAssignment_2"


    // $ANTLR start "rule__SVM_Classifier__Predict_diabetesAssignment_3"
    // InternalMyDsl.g:4105:1: rule__SVM_Classifier__Predict_diabetesAssignment_3 : ( rulePredict_diabetes ) ;
    public final void rule__SVM_Classifier__Predict_diabetesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4109:1: ( ( rulePredict_diabetes ) )
            // InternalMyDsl.g:4110:2: ( rulePredict_diabetes )
            {
            // InternalMyDsl.g:4110:2: ( rulePredict_diabetes )
            // InternalMyDsl.g:4111:3: rulePredict_diabetes
            {
             before(grammarAccess.getSVM_ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePredict_diabetes();

            state._fsp--;

             after(grammarAccess.getSVM_ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SVM_Classifier__Predict_diabetesAssignment_3"


    // $ANTLR start "rule__J48Classifier__Set_pruned_treesAssignment_2"
    // InternalMyDsl.g:4120:1: rule__J48Classifier__Set_pruned_treesAssignment_2 : ( RULE_STRING ) ;
    public final void rule__J48Classifier__Set_pruned_treesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4124:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4125:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4125:2: ( RULE_STRING )
            // InternalMyDsl.g:4126:3: RULE_STRING
            {
             before(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getJ48ClassifierAccess().getSet_pruned_treesSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Set_pruned_treesAssignment_2"


    // $ANTLR start "rule__J48Classifier__Predict_diabetesAssignment_3"
    // InternalMyDsl.g:4135:1: rule__J48Classifier__Predict_diabetesAssignment_3 : ( rulePredict_diabetes ) ;
    public final void rule__J48Classifier__Predict_diabetesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4139:1: ( ( rulePredict_diabetes ) )
            // InternalMyDsl.g:4140:2: ( rulePredict_diabetes )
            {
            // InternalMyDsl.g:4140:2: ( rulePredict_diabetes )
            // InternalMyDsl.g:4141:3: rulePredict_diabetes
            {
             before(grammarAccess.getJ48ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePredict_diabetes();

            state._fsp--;

             after(grammarAccess.getJ48ClassifierAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__J48Classifier__Predict_diabetesAssignment_3"


    // $ANTLR start "rule__NavieBayes__Conditional_Probability_basedAssignment_2"
    // InternalMyDsl.g:4150:1: rule__NavieBayes__Conditional_Probability_basedAssignment_2 : ( RULE_STRING ) ;
    public final void rule__NavieBayes__Conditional_Probability_basedAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4154:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:4155:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:4155:2: ( RULE_STRING )
            // InternalMyDsl.g:4156:3: RULE_STRING
            {
             before(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getNavieBayesAccess().getConditional_Probability_basedSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Conditional_Probability_basedAssignment_2"


    // $ANTLR start "rule__NavieBayes__Predict_diabetesAssignment_3"
    // InternalMyDsl.g:4165:1: rule__NavieBayes__Predict_diabetesAssignment_3 : ( rulePredict_diabetes ) ;
    public final void rule__NavieBayes__Predict_diabetesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:4169:1: ( ( rulePredict_diabetes ) )
            // InternalMyDsl.g:4170:2: ( rulePredict_diabetes )
            {
            // InternalMyDsl.g:4170:2: ( rulePredict_diabetes )
            // InternalMyDsl.g:4171:3: rulePredict_diabetes
            {
             before(grammarAccess.getNavieBayesAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            rulePredict_diabetes();

            state._fsp--;

             after(grammarAccess.getNavieBayesAccess().getPredict_diabetesPredict_diabetesParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__NavieBayes__Predict_diabetesAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000154028FFF5000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000FFF4002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x000154028FFF5002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000000FFF5000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x000000000FFF4000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000010001000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000010001002L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0002000000000000L});

}