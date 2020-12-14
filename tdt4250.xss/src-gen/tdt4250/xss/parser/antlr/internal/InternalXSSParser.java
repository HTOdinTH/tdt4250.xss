package tdt4250.xss.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import tdt4250.xss.services.XSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXSSParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SEL", "RULE_NAME", "RULE_VAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XSelectors:'", "'XProperties:'", "'Rules:'", "'@'", "'('", "','", "')'", "'$'", "';'", "'='", "':'"
    };
    public static final int RULE_VAL=7;
    public static final int RULE_NAME=6;
    public static final int RULE_STRING=4;
    public static final int RULE_SEL=5;
    public static final int RULE_SL_COMMENT=11;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=8;
    public static final int RULE_WS=12;
    public static final int RULE_ANY_OTHER=13;
    public static final int RULE_INT=9;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=10;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalXSSParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalXSSParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalXSSParser.tokenNames; }
    public String getGrammarFileName() { return "InternalXSS.g"; }



     	private XSSGrammarAccess grammarAccess;

        public InternalXSSParser(TokenStream input, XSSGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Stylesheet";
       	}

       	@Override
       	protected XSSGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleStylesheet"
    // InternalXSS.g:64:1: entryRuleStylesheet returns [EObject current=null] : iv_ruleStylesheet= ruleStylesheet EOF ;
    public final EObject entryRuleStylesheet() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStylesheet = null;


        try {
            // InternalXSS.g:64:51: (iv_ruleStylesheet= ruleStylesheet EOF )
            // InternalXSS.g:65:2: iv_ruleStylesheet= ruleStylesheet EOF
            {
             newCompositeNode(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStylesheet=ruleStylesheet();

            state._fsp--;

             current =iv_ruleStylesheet; 
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
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // InternalXSS.g:71:1: ruleStylesheet returns [EObject current=null] : ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )? (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? otherlv_4= 'Rules:' ( (lv_rules_5_0= ruleRule ) )+ ) ;
    public final EObject ruleStylesheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_customSelectors_1_0 = null;

        EObject lv_customProperties_3_0 = null;

        EObject lv_rules_5_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:77:2: ( ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )? (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? otherlv_4= 'Rules:' ( (lv_rules_5_0= ruleRule ) )+ ) )
            // InternalXSS.g:78:2: ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )? (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? otherlv_4= 'Rules:' ( (lv_rules_5_0= ruleRule ) )+ )
            {
            // InternalXSS.g:78:2: ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )? (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? otherlv_4= 'Rules:' ( (lv_rules_5_0= ruleRule ) )+ )
            // InternalXSS.g:79:3: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )? (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? otherlv_4= 'Rules:' ( (lv_rules_5_0= ruleRule ) )+
            {
            // InternalXSS.g:79:3: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalXSS.g:80:4: otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_0, grammarAccess.getStylesheetAccess().getXSelectorsKeyword_0_0());
                    			
                    // InternalXSS.g:84:4: ( (lv_customSelectors_1_0= ruleXSelector ) )+
                    int cnt1=0;
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==RULE_NAME||LA1_0==17) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalXSS.g:85:5: (lv_customSelectors_1_0= ruleXSelector )
                    	    {
                    	    // InternalXSS.g:85:5: (lv_customSelectors_1_0= ruleXSelector )
                    	    // InternalXSS.g:86:6: lv_customSelectors_1_0= ruleXSelector
                    	    {

                    	    						newCompositeNode(grammarAccess.getStylesheetAccess().getCustomSelectorsXSelectorParserRuleCall_0_1_0());
                    	    					
                    	    pushFollow(FOLLOW_4);
                    	    lv_customSelectors_1_0=ruleXSelector();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStylesheetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"customSelectors",
                    	    							lv_customSelectors_1_0,
                    	    							"tdt4250.xss.XSS.XSelector");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt1 >= 1 ) break loop1;
                                EarlyExitException eee =
                                    new EarlyExitException(1, input);
                                throw eee;
                        }
                        cnt1++;
                    } while (true);


                    }
                    break;

            }

            // InternalXSS.g:104:3: (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==15) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalXSS.g:105:4: otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStylesheetAccess().getXPropertiesKeyword_1_0());
                    			
                    // InternalXSS.g:109:4: ( (lv_customProperties_3_0= ruleXProperty ) )+
                    int cnt3=0;
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==RULE_NAME||LA3_0==17||LA3_0==21) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalXSS.g:110:5: (lv_customProperties_3_0= ruleXProperty )
                    	    {
                    	    // InternalXSS.g:110:5: (lv_customProperties_3_0= ruleXProperty )
                    	    // InternalXSS.g:111:6: lv_customProperties_3_0= ruleXProperty
                    	    {

                    	    						newCompositeNode(grammarAccess.getStylesheetAccess().getCustomPropertiesXPropertyParserRuleCall_1_1_0());
                    	    					
                    	    pushFollow(FOLLOW_6);
                    	    lv_customProperties_3_0=ruleXProperty();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getStylesheetRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"customProperties",
                    	    							lv_customProperties_3_0,
                    	    							"tdt4250.xss.XSS.XProperty");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt3 >= 1 ) break loop3;
                                EarlyExitException eee =
                                    new EarlyExitException(3, input);
                                throw eee;
                        }
                        cnt3++;
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getStylesheetAccess().getRulesKeyword_2());
            		
            // InternalXSS.g:133:3: ( (lv_rules_5_0= ruleRule ) )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_NAME)||LA5_0==17) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalXSS.g:134:4: (lv_rules_5_0= ruleRule )
            	    {
            	    // InternalXSS.g:134:4: (lv_rules_5_0= ruleRule )
            	    // InternalXSS.g:135:5: lv_rules_5_0= ruleRule
            	    {

            	    					newCompositeNode(grammarAccess.getStylesheetAccess().getRulesRuleParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_8);
            	    lv_rules_5_0=ruleRule();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"rules",
            	    						lv_rules_5_0,
            	    						"tdt4250.xss.XSS.Rule");
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
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleSTRING_OR_SEL"
    // InternalXSS.g:156:1: entryRuleSTRING_OR_SEL returns [String current=null] : iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF ;
    public final String entryRuleSTRING_OR_SEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_OR_SEL = null;


        try {
            // InternalXSS.g:156:53: (iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF )
            // InternalXSS.g:157:2: iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF
            {
             newCompositeNode(grammarAccess.getSTRING_OR_SELRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTRING_OR_SEL=ruleSTRING_OR_SEL();

            state._fsp--;

             current =iv_ruleSTRING_OR_SEL.getText(); 
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
    // $ANTLR end "entryRuleSTRING_OR_SEL"


    // $ANTLR start "ruleSTRING_OR_SEL"
    // InternalXSS.g:163:1: ruleSTRING_OR_SEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleSTRING_OR_SEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_SEL_1=null;
        Token this_NAME_2=null;


        	enterRule();

        try {
            // InternalXSS.g:169:2: ( (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME ) )
            // InternalXSS.g:170:2: (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME )
            {
            // InternalXSS.g:170:2: (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_SEL:
                {
                alt6=2;
                }
                break;
            case RULE_NAME:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // InternalXSS.g:171:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_SELAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXSS.g:179:3: this_SEL_1= RULE_SEL
                    {
                    this_SEL_1=(Token)match(input,RULE_SEL,FOLLOW_2); 

                    			current.merge(this_SEL_1);
                    		

                    			newLeafNode(this_SEL_1, grammarAccess.getSTRING_OR_SELAccess().getSELTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXSS.g:187:3: this_NAME_2= RULE_NAME
                    {
                    this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_2); 

                    			current.merge(this_NAME_2);
                    		

                    			newLeafNode(this_NAME_2, grammarAccess.getSTRING_OR_SELAccess().getNAMETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleSTRING_OR_SEL"


    // $ANTLR start "entryRuleSTRING_OR_VAL"
    // InternalXSS.g:198:1: entryRuleSTRING_OR_VAL returns [String current=null] : iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF ;
    public final String entryRuleSTRING_OR_VAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_OR_VAL = null;


        try {
            // InternalXSS.g:198:53: (iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF )
            // InternalXSS.g:199:2: iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF
            {
             newCompositeNode(grammarAccess.getSTRING_OR_VALRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSTRING_OR_VAL=ruleSTRING_OR_VAL();

            state._fsp--;

             current =iv_ruleSTRING_OR_VAL.getText(); 
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
    // $ANTLR end "entryRuleSTRING_OR_VAL"


    // $ANTLR start "ruleSTRING_OR_VAL"
    // InternalXSS.g:205:1: ruleSTRING_OR_VAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleSTRING_OR_VAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_VAL_1=null;
        Token this_NAME_2=null;


        	enterRule();

        try {
            // InternalXSS.g:211:2: ( (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME ) )
            // InternalXSS.g:212:2: (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME )
            {
            // InternalXSS.g:212:2: (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME )
            int alt7=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_VAL:
                {
                alt7=2;
                }
                break;
            case RULE_NAME:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalXSS.g:213:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_VALAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXSS.g:221:3: this_VAL_1= RULE_VAL
                    {
                    this_VAL_1=(Token)match(input,RULE_VAL,FOLLOW_2); 

                    			current.merge(this_VAL_1);
                    		

                    			newLeafNode(this_VAL_1, grammarAccess.getSTRING_OR_VALAccess().getVALTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXSS.g:229:3: this_NAME_2= RULE_NAME
                    {
                    this_NAME_2=(Token)match(input,RULE_NAME,FOLLOW_2); 

                    			current.merge(this_NAME_2);
                    		

                    			newLeafNode(this_NAME_2, grammarAccess.getSTRING_OR_VALAccess().getNAMETerminalRuleCall_2());
                    		

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
    // $ANTLR end "ruleSTRING_OR_VAL"


    // $ANTLR start "entryRuleXSelector"
    // InternalXSS.g:240:1: entryRuleXSelector returns [EObject current=null] : iv_ruleXSelector= ruleXSelector EOF ;
    public final EObject entryRuleXSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSelector = null;


        try {
            // InternalXSS.g:240:50: (iv_ruleXSelector= ruleXSelector EOF )
            // InternalXSS.g:241:2: iv_ruleXSelector= ruleXSelector EOF
            {
             newCompositeNode(grammarAccess.getXSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSelector=ruleXSelector();

            state._fsp--;

             current =iv_ruleXSelector; 
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
    // $ANTLR end "entryRuleXSelector"


    // $ANTLR start "ruleXSelector"
    // InternalXSS.g:247:1: ruleXSelector returns [EObject current=null] : this_GroupSelector_0= ruleGroupSelector ;
    public final EObject ruleXSelector() throws RecognitionException {
        EObject current = null;

        EObject this_GroupSelector_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:253:2: (this_GroupSelector_0= ruleGroupSelector )
            // InternalXSS.g:254:2: this_GroupSelector_0= ruleGroupSelector
            {

            		newCompositeNode(grammarAccess.getXSelectorAccess().getGroupSelectorParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_GroupSelector_0=ruleGroupSelector();

            state._fsp--;


            		current = this_GroupSelector_0;
            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleXSelector"


    // $ANTLR start "entryRuleGroupSelector"
    // InternalXSS.g:265:1: entryRuleGroupSelector returns [EObject current=null] : iv_ruleGroupSelector= ruleGroupSelector EOF ;
    public final EObject entryRuleGroupSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSelector = null;


        try {
            // InternalXSS.g:265:54: (iv_ruleGroupSelector= ruleGroupSelector EOF )
            // InternalXSS.g:266:2: iv_ruleGroupSelector= ruleGroupSelector EOF
            {
             newCompositeNode(grammarAccess.getGroupSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupSelector=ruleGroupSelector();

            state._fsp--;

             current =iv_ruleGroupSelector; 
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
    // $ANTLR end "entryRuleGroupSelector"


    // $ANTLR start "ruleGroupSelector"
    // InternalXSS.g:272:1: ruleGroupSelector returns [EObject current=null] : ( (otherlv_0= '@' )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' ) ;
    public final EObject ruleGroupSelector() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_subSelectors_3_0 = null;

        EObject lv_subSelectors_5_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:278:2: ( ( (otherlv_0= '@' )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' ) )
            // InternalXSS.g:279:2: ( (otherlv_0= '@' )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' )
            {
            // InternalXSS.g:279:2: ( (otherlv_0= '@' )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' )
            // InternalXSS.g:280:3: (otherlv_0= '@' )? ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')'
            {
            // InternalXSS.g:280:3: (otherlv_0= '@' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXSS.g:281:4: otherlv_0= '@'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getGroupSelectorAccess().getCommercialAtKeyword_0());
                    			

                    }
                    break;

            }

            // InternalXSS.g:286:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalXSS.g:287:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalXSS.g:287:4: (lv_name_1_0= RULE_NAME )
            // InternalXSS.g:288:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getGroupSelectorAccess().getNameNAMETerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"tdt4250.xss.XSS.NAME");
            				

            }


            }

            otherlv_2=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalXSS.g:308:3: ( (lv_subSelectors_3_0= ruleSelector ) )
            // InternalXSS.g:309:4: (lv_subSelectors_3_0= ruleSelector )
            {
            // InternalXSS.g:309:4: (lv_subSelectors_3_0= ruleSelector )
            // InternalXSS.g:310:5: lv_subSelectors_3_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_12);
            lv_subSelectors_3_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
            					}
            					add(
            						current,
            						"subSelectors",
            						lv_subSelectors_3_0,
            						"tdt4250.xss.XSS.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXSS.g:327:3: (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXSS.g:328:4: otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupSelectorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXSS.g:332:4: ( (lv_subSelectors_5_0= ruleSelector ) )
            	    // InternalXSS.g:333:5: (lv_subSelectors_5_0= ruleSelector )
            	    {
            	    // InternalXSS.g:333:5: (lv_subSelectors_5_0= ruleSelector )
            	    // InternalXSS.g:334:6: lv_subSelectors_5_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_12);
            	    lv_subSelectors_5_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subSelectors",
            	    							lv_subSelectors_5_0,
            	    							"tdt4250.xss.XSS.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_6=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getGroupSelectorAccess().getRightParenthesisKeyword_5());
            		

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
    // $ANTLR end "ruleGroupSelector"


    // $ANTLR start "entryRuleSelector"
    // InternalXSS.g:360:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalXSS.g:360:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalXSS.g:361:2: iv_ruleSelector= ruleSelector EOF
            {
             newCompositeNode(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSelector=ruleSelector();

            state._fsp--;

             current =iv_ruleSelector; 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalXSS.g:367:1: ruleSelector returns [EObject current=null] : ( (lv_name_0_0= ruleSTRING_OR_SEL ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:373:2: ( ( (lv_name_0_0= ruleSTRING_OR_SEL ) ) )
            // InternalXSS.g:374:2: ( (lv_name_0_0= ruleSTRING_OR_SEL ) )
            {
            // InternalXSS.g:374:2: ( (lv_name_0_0= ruleSTRING_OR_SEL ) )
            // InternalXSS.g:375:3: (lv_name_0_0= ruleSTRING_OR_SEL )
            {
            // InternalXSS.g:375:3: (lv_name_0_0= ruleSTRING_OR_SEL )
            // InternalXSS.g:376:4: lv_name_0_0= ruleSTRING_OR_SEL
            {

            				newCompositeNode(grammarAccess.getSelectorAccess().getNameSTRING_OR_SELParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleSTRING_OR_SEL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getSelectorRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"tdt4250.xss.XSS.STRING_OR_SEL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "entryRuleXProperty"
    // InternalXSS.g:396:1: entryRuleXProperty returns [EObject current=null] : iv_ruleXProperty= ruleXProperty EOF ;
    public final EObject entryRuleXProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXProperty = null;


        try {
            // InternalXSS.g:396:50: (iv_ruleXProperty= ruleXProperty EOF )
            // InternalXSS.g:397:2: iv_ruleXProperty= ruleXProperty EOF
            {
             newCompositeNode(grammarAccess.getXPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXProperty=ruleXProperty();

            state._fsp--;

             current =iv_ruleXProperty; 
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
    // $ANTLR end "entryRuleXProperty"


    // $ANTLR start "ruleXProperty"
    // InternalXSS.g:403:1: ruleXProperty returns [EObject current=null] : ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty ) ) ;
    public final EObject ruleXProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_CustomProperty_1 = null;

        EObject this_GroupProperty_3 = null;



        	enterRule();

        try {
            // InternalXSS.g:409:2: ( ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty ) ) )
            // InternalXSS.g:410:2: ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty ) )
            {
            // InternalXSS.g:410:2: ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty ) )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==21) ) {
                alt11=1;
            }
            else if ( (LA11_0==RULE_NAME||LA11_0==17) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // InternalXSS.g:411:3: (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty )
                    {
                    // InternalXSS.g:411:3: (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty )
                    // InternalXSS.g:412:4: otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getXPropertyAccess().getDollarSignKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getXPropertyAccess().getCustomPropertyParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_CustomProperty_1=ruleCustomProperty();

                    state._fsp--;


                    				current = this_CustomProperty_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXSS.g:426:3: ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty )
                    {
                    // InternalXSS.g:426:3: ( (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty )
                    // InternalXSS.g:427:4: (otherlv_2= '@' )? this_GroupProperty_3= ruleGroupProperty
                    {
                    // InternalXSS.g:427:4: (otherlv_2= '@' )?
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==17) ) {
                        alt10=1;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalXSS.g:428:5: otherlv_2= '@'
                            {
                            otherlv_2=(Token)match(input,17,FOLLOW_5); 

                            					newLeafNode(otherlv_2, grammarAccess.getXPropertyAccess().getCommercialAtKeyword_1_0());
                            				

                            }
                            break;

                    }


                    				newCompositeNode(grammarAccess.getXPropertyAccess().getGroupPropertyParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_GroupProperty_3=ruleGroupProperty();

                    state._fsp--;


                    				current = this_GroupProperty_3;
                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "ruleXProperty"


    // $ANTLR start "entryRuleCustomProperty"
    // InternalXSS.g:446:1: entryRuleCustomProperty returns [EObject current=null] : iv_ruleCustomProperty= ruleCustomProperty EOF ;
    public final EObject entryRuleCustomProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomProperty = null;


        try {
            // InternalXSS.g:446:55: (iv_ruleCustomProperty= ruleCustomProperty EOF )
            // InternalXSS.g:447:2: iv_ruleCustomProperty= ruleCustomProperty EOF
            {
             newCompositeNode(grammarAccess.getCustomPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCustomProperty=ruleCustomProperty();

            state._fsp--;

             current =iv_ruleCustomProperty; 
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
    // $ANTLR end "entryRuleCustomProperty"


    // $ANTLR start "ruleCustomProperty"
    // InternalXSS.g:453:1: ruleCustomProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleCustomProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_subRules_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:459:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:460:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:460:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:461:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:461:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalXSS.g:462:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalXSS.g:462:4: (lv_name_0_0= RULE_NAME )
            // InternalXSS.g:463:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getCustomPropertyAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCustomPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"tdt4250.xss.XSS.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_9); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:483:3: ( ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==RULE_NAME) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXSS.g:484:4: ( (lv_subRules_2_0= ruleSubRule ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:484:4: ( (lv_subRules_2_0= ruleSubRule ) )
            	    // InternalXSS.g:485:5: (lv_subRules_2_0= ruleSubRule )
            	    {
            	    // InternalXSS.g:485:5: (lv_subRules_2_0= ruleSubRule )
            	    // InternalXSS.g:486:6: lv_subRules_2_0= ruleSubRule
            	    {

            	    						newCompositeNode(grammarAccess.getCustomPropertyAccess().getSubRulesSubRuleParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_subRules_2_0=ruleSubRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCustomPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subRules",
            	    							lv_subRules_2_0,
            	    							"tdt4250.xss.XSS.SubRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCustomPropertyAccess().getSemicolonKeyword_2_1());
            	    			

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

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleCustomProperty"


    // $ANTLR start "entryRuleSubRule"
    // InternalXSS.g:516:1: entryRuleSubRule returns [EObject current=null] : iv_ruleSubRule= ruleSubRule EOF ;
    public final EObject entryRuleSubRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRule = null;


        try {
            // InternalXSS.g:516:48: (iv_ruleSubRule= ruleSubRule EOF )
            // InternalXSS.g:517:2: iv_ruleSubRule= ruleSubRule EOF
            {
             newCompositeNode(grammarAccess.getSubRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSubRule=ruleSubRule();

            state._fsp--;

             current =iv_ruleSubRule; 
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
    // $ANTLR end "entryRuleSubRule"


    // $ANTLR start "ruleSubRule"
    // InternalXSS.g:523:1: ruleSubRule returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSubRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:529:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalXSS.g:530:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalXSS.g:530:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalXSS.g:531:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalXSS.g:531:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:532:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:532:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:533:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getSubRuleAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_property_0_0=rulePROPERTY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRuleRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_0_0,
            						"tdt4250.xss.XSS.PROPERTY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSubRuleAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:554:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalXSS.g:555:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalXSS.g:555:4: (lv_expression_2_0= ruleExpression )
            // InternalXSS.g:556:5: lv_expression_2_0= ruleExpression
            {

            					newCompositeNode(grammarAccess.getSubRuleAccess().getExpressionExpressionParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleExpression();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSubRuleRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_2_0,
            						"tdt4250.xss.XSS.Expression");
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
    // $ANTLR end "ruleSubRule"


    // $ANTLR start "entryRuleExpression"
    // InternalXSS.g:577:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalXSS.g:577:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalXSS.g:578:2: iv_ruleExpression= ruleExpression EOF
            {
             newCompositeNode(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExpression=ruleExpression();

            state._fsp--;

             current =iv_ruleExpression; 
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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalXSS.g:584:1: ruleExpression returns [EObject current=null] : ( (lv_name_0_0= ruleSTRING_OR_VAL ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:590:2: ( ( (lv_name_0_0= ruleSTRING_OR_VAL ) ) )
            // InternalXSS.g:591:2: ( (lv_name_0_0= ruleSTRING_OR_VAL ) )
            {
            // InternalXSS.g:591:2: ( (lv_name_0_0= ruleSTRING_OR_VAL ) )
            // InternalXSS.g:592:3: (lv_name_0_0= ruleSTRING_OR_VAL )
            {
            // InternalXSS.g:592:3: (lv_name_0_0= ruleSTRING_OR_VAL )
            // InternalXSS.g:593:4: lv_name_0_0= ruleSTRING_OR_VAL
            {

            				newCompositeNode(grammarAccess.getExpressionAccess().getNameSTRING_OR_VALParserRuleCall_0());
            			
            pushFollow(FOLLOW_2);
            lv_name_0_0=ruleSTRING_OR_VAL();

            state._fsp--;


            				if (current==null) {
            					current = createModelElementForParent(grammarAccess.getExpressionRule());
            				}
            				set(
            					current,
            					"name",
            					lv_name_0_0,
            					"tdt4250.xss.XSS.STRING_OR_VAL");
            				afterParserOrEnumRuleCall();
            			

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRuleGroupProperty"
    // InternalXSS.g:613:1: entryRuleGroupProperty returns [EObject current=null] : iv_ruleGroupProperty= ruleGroupProperty EOF ;
    public final EObject entryRuleGroupProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupProperty = null;


        try {
            // InternalXSS.g:613:54: (iv_ruleGroupProperty= ruleGroupProperty EOF )
            // InternalXSS.g:614:2: iv_ruleGroupProperty= ruleGroupProperty EOF
            {
             newCompositeNode(grammarAccess.getGroupPropertyRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleGroupProperty=ruleGroupProperty();

            state._fsp--;

             current =iv_ruleGroupProperty; 
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
    // $ANTLR end "entryRuleGroupProperty"


    // $ANTLR start "ruleGroupProperty"
    // InternalXSS.g:620:1: ruleGroupProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleGroupProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:626:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:627:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:627:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:628:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:628:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalXSS.g:629:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalXSS.g:629:4: (lv_name_0_0= RULE_NAME )
            // InternalXSS.g:630:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGroupPropertyAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupPropertyRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"tdt4250.xss.XSS.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_17); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:650:3: ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==RULE_NAME||LA13_0==21) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXSS.g:651:4: ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:651:4: ( (lv_statements_2_0= ruleXStatement ) )
            	    // InternalXSS.g:652:5: (lv_statements_2_0= ruleXStatement )
            	    {
            	    // InternalXSS.g:652:5: (lv_statements_2_0= ruleXStatement )
            	    // InternalXSS.g:653:6: lv_statements_2_0= ruleXStatement
            	    {

            	    						newCompositeNode(grammarAccess.getGroupPropertyAccess().getStatementsXStatementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_statements_2_0=ruleXStatement();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"statements",
            	    							lv_statements_2_0,
            	    							"tdt4250.xss.XSS.XStatement");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_18); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGroupPropertyAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getGroupPropertyAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleGroupProperty"


    // $ANTLR start "entryRuleXStatement"
    // InternalXSS.g:683:1: entryRuleXStatement returns [EObject current=null] : iv_ruleXStatement= ruleXStatement EOF ;
    public final EObject entryRuleXStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStatement = null;


        try {
            // InternalXSS.g:683:51: (iv_ruleXStatement= ruleXStatement EOF )
            // InternalXSS.g:684:2: iv_ruleXStatement= ruleXStatement EOF
            {
             newCompositeNode(grammarAccess.getXStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXStatement=ruleXStatement();

            state._fsp--;

             current =iv_ruleXStatement; 
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
    // $ANTLR end "entryRuleXStatement"


    // $ANTLR start "ruleXStatement"
    // InternalXSS.g:690:1: ruleXStatement returns [EObject current=null] : (this_XSingleStatement_0= ruleXSingleStatement | this_XMultiStatement_1= ruleXMultiStatement ) ;
    public final EObject ruleXStatement() throws RecognitionException {
        EObject current = null;

        EObject this_XSingleStatement_0 = null;

        EObject this_XMultiStatement_1 = null;



        	enterRule();

        try {
            // InternalXSS.g:696:2: ( (this_XSingleStatement_0= ruleXSingleStatement | this_XMultiStatement_1= ruleXMultiStatement ) )
            // InternalXSS.g:697:2: (this_XSingleStatement_0= ruleXSingleStatement | this_XMultiStatement_1= ruleXMultiStatement )
            {
            // InternalXSS.g:697:2: (this_XSingleStatement_0= ruleXSingleStatement | this_XMultiStatement_1= ruleXMultiStatement )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==RULE_NAME) ) {
                    int LA14_3 = input.LA(3);

                    if ( (LA14_3==18) ) {
                        alt14=2;
                    }
                    else if ( (LA14_3==23) ) {
                        alt14=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 3, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA14_0==RULE_NAME) ) {
                int LA14_2 = input.LA(2);

                if ( (LA14_2==23) ) {
                    alt14=1;
                }
                else if ( (LA14_2==18) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 2, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalXSS.g:698:3: this_XSingleStatement_0= ruleXSingleStatement
                    {

                    			newCompositeNode(grammarAccess.getXStatementAccess().getXSingleStatementParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_XSingleStatement_0=ruleXSingleStatement();

                    state._fsp--;


                    			current = this_XSingleStatement_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalXSS.g:707:3: this_XMultiStatement_1= ruleXMultiStatement
                    {

                    			newCompositeNode(grammarAccess.getXStatementAccess().getXMultiStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_XMultiStatement_1=ruleXMultiStatement();

                    state._fsp--;


                    			current = this_XMultiStatement_1;
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
    // $ANTLR end "ruleXStatement"


    // $ANTLR start "entryRuleXSingleStatement"
    // InternalXSS.g:719:1: entryRuleXSingleStatement returns [EObject current=null] : iv_ruleXSingleStatement= ruleXSingleStatement EOF ;
    public final EObject entryRuleXSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSingleStatement = null;


        try {
            // InternalXSS.g:719:57: (iv_ruleXSingleStatement= ruleXSingleStatement EOF )
            // InternalXSS.g:720:2: iv_ruleXSingleStatement= ruleXSingleStatement EOF
            {
             newCompositeNode(grammarAccess.getXSingleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXSingleStatement=ruleXSingleStatement();

            state._fsp--;

             current =iv_ruleXSingleStatement; 
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
    // $ANTLR end "entryRuleXSingleStatement"


    // $ANTLR start "ruleXSingleStatement"
    // InternalXSS.g:726:1: ruleXSingleStatement returns [EObject current=null] : ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement ) ;
    public final EObject ruleXSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SingleRefStatement_1 = null;

        EObject this_SingleStatement_2 = null;



        	enterRule();

        try {
            // InternalXSS.g:732:2: ( ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement ) )
            // InternalXSS.g:733:2: ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement )
            {
            // InternalXSS.g:733:2: ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_NAME) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // InternalXSS.g:734:3: (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement )
                    {
                    // InternalXSS.g:734:3: (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement )
                    // InternalXSS.g:735:4: otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getXSingleStatementAccess().getDollarSignKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getXSingleStatementAccess().getSingleRefStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_SingleRefStatement_1=ruleSingleRefStatement();

                    state._fsp--;


                    				current = this_SingleRefStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXSS.g:749:3: this_SingleStatement_2= ruleSingleStatement
                    {

                    			newCompositeNode(grammarAccess.getXSingleStatementAccess().getSingleStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_SingleStatement_2=ruleSingleStatement();

                    state._fsp--;


                    			current = this_SingleStatement_2;
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
    // $ANTLR end "ruleXSingleStatement"


    // $ANTLR start "entryRuleSingleRefStatement"
    // InternalXSS.g:761:1: entryRuleSingleRefStatement returns [EObject current=null] : iv_ruleSingleRefStatement= ruleSingleRefStatement EOF ;
    public final EObject entryRuleSingleRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRefStatement = null;


        try {
            // InternalXSS.g:761:59: (iv_ruleSingleRefStatement= ruleSingleRefStatement EOF )
            // InternalXSS.g:762:2: iv_ruleSingleRefStatement= ruleSingleRefStatement EOF
            {
             newCompositeNode(grammarAccess.getSingleRefStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleRefStatement=ruleSingleRefStatement();

            state._fsp--;

             current =iv_ruleSingleRefStatement; 
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
    // $ANTLR end "entryRuleSingleRefStatement"


    // $ANTLR start "ruleSingleRefStatement"
    // InternalXSS.g:768:1: ruleSingleRefStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleSingleRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:774:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:775:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:775:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:776:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:776:3: ( (otherlv_0= RULE_NAME ) )
            // InternalXSS.g:777:4: (otherlv_0= RULE_NAME )
            {
            // InternalXSS.g:777:4: (otherlv_0= RULE_NAME )
            // InternalXSS.g:778:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRefStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_15); 

            					newLeafNode(otherlv_0, grammarAccess.getSingleRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleRefStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:793:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:794:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:794:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:795:5: lv_value_2_0= ruleVALUE
            {

            					newCompositeNode(grammarAccess.getSingleRefStatementAccess().getValueVALUEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleRefStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"tdt4250.xss.XSS.VALUE");
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
    // $ANTLR end "ruleSingleRefStatement"


    // $ANTLR start "entryRuleSingleStatement"
    // InternalXSS.g:816:1: entryRuleSingleStatement returns [EObject current=null] : iv_ruleSingleStatement= ruleSingleStatement EOF ;
    public final EObject entryRuleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStatement = null;


        try {
            // InternalXSS.g:816:56: (iv_ruleSingleStatement= ruleSingleStatement EOF )
            // InternalXSS.g:817:2: iv_ruleSingleStatement= ruleSingleStatement EOF
            {
             newCompositeNode(grammarAccess.getSingleStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSingleStatement=ruleSingleStatement();

            state._fsp--;

             current =iv_ruleSingleStatement; 
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
    // $ANTLR end "entryRuleSingleStatement"


    // $ANTLR start "ruleSingleStatement"
    // InternalXSS.g:823:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:829:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:830:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:830:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:831:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:831:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:832:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:832:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:833:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getSingleStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_property_0_0=rulePROPERTY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleStatementRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_0_0,
            						"tdt4250.xss.XSS.PROPERTY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:854:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:855:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:855:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:856:5: lv_value_2_0= ruleVALUE
            {

            					newCompositeNode(grammarAccess.getSingleStatementAccess().getValueVALUEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSingleStatementRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"tdt4250.xss.XSS.VALUE");
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
    // $ANTLR end "ruleSingleStatement"


    // $ANTLR start "entryRuleXMultiStatement"
    // InternalXSS.g:877:1: entryRuleXMultiStatement returns [EObject current=null] : iv_ruleXMultiStatement= ruleXMultiStatement EOF ;
    public final EObject entryRuleXMultiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXMultiStatement = null;


        try {
            // InternalXSS.g:877:56: (iv_ruleXMultiStatement= ruleXMultiStatement EOF )
            // InternalXSS.g:878:2: iv_ruleXMultiStatement= ruleXMultiStatement EOF
            {
             newCompositeNode(grammarAccess.getXMultiStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleXMultiStatement=ruleXMultiStatement();

            state._fsp--;

             current =iv_ruleXMultiStatement; 
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
    // $ANTLR end "entryRuleXMultiStatement"


    // $ANTLR start "ruleXMultiStatement"
    // InternalXSS.g:884:1: ruleXMultiStatement returns [EObject current=null] : ( (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement ) | this_MultiStatement_2= ruleMultiStatement ) ;
    public final EObject ruleXMultiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_MultiRefStatement_1 = null;

        EObject this_MultiStatement_2 = null;



        	enterRule();

        try {
            // InternalXSS.g:890:2: ( ( (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement ) | this_MultiStatement_2= ruleMultiStatement ) )
            // InternalXSS.g:891:2: ( (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement ) | this_MultiStatement_2= ruleMultiStatement )
            {
            // InternalXSS.g:891:2: ( (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement ) | this_MultiStatement_2= ruleMultiStatement )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==21) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_NAME) ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // InternalXSS.g:892:3: (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement )
                    {
                    // InternalXSS.g:892:3: (otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement )
                    // InternalXSS.g:893:4: otherlv_0= '$' this_MultiRefStatement_1= ruleMultiRefStatement
                    {
                    otherlv_0=(Token)match(input,21,FOLLOW_9); 

                    				newLeafNode(otherlv_0, grammarAccess.getXMultiStatementAccess().getDollarSignKeyword_0_0());
                    			

                    				newCompositeNode(grammarAccess.getXMultiStatementAccess().getMultiRefStatementParserRuleCall_0_1());
                    			
                    pushFollow(FOLLOW_2);
                    this_MultiRefStatement_1=ruleMultiRefStatement();

                    state._fsp--;


                    				current = this_MultiRefStatement_1;
                    				afterParserOrEnumRuleCall();
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalXSS.g:907:3: this_MultiStatement_2= ruleMultiStatement
                    {

                    			newCompositeNode(grammarAccess.getXMultiStatementAccess().getMultiStatementParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_MultiStatement_2=ruleMultiStatement();

                    state._fsp--;


                    			current = this_MultiStatement_2;
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
    // $ANTLR end "ruleXMultiStatement"


    // $ANTLR start "entryRuleMultiRefStatement"
    // InternalXSS.g:919:1: entryRuleMultiRefStatement returns [EObject current=null] : iv_ruleMultiRefStatement= ruleMultiRefStatement EOF ;
    public final EObject entryRuleMultiRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiRefStatement = null;


        try {
            // InternalXSS.g:919:58: (iv_ruleMultiRefStatement= ruleMultiRefStatement EOF )
            // InternalXSS.g:920:2: iv_ruleMultiRefStatement= ruleMultiRefStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiRefStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiRefStatement=ruleMultiRefStatement();

            state._fsp--;

             current =iv_ruleMultiRefStatement; 
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
    // $ANTLR end "entryRuleMultiRefStatement"


    // $ANTLR start "ruleMultiRefStatement"
    // InternalXSS.g:926:1: ruleMultiRefStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleMultiRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:932:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:933:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:933:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:934:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:934:3: ( (otherlv_0= RULE_NAME ) )
            // InternalXSS.g:935:4: (otherlv_0= RULE_NAME )
            {
            // InternalXSS.g:935:4: (otherlv_0= RULE_NAME )
            // InternalXSS.g:936:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiRefStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_10); 

            					newLeafNode(otherlv_0, grammarAccess.getMultiRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiRefStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:951:3: ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=RULE_STRING && LA17_0<=RULE_NAME)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXSS.g:952:4: ( (lv_states_2_0= ruleState ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:952:4: ( (lv_states_2_0= ruleState ) )
            	    // InternalXSS.g:953:5: (lv_states_2_0= ruleState )
            	    {
            	    // InternalXSS.g:953:5: (lv_states_2_0= ruleState )
            	    // InternalXSS.g:954:6: lv_states_2_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMultiRefStatementAccess().getStatesStateParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_states_2_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiRefStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_2_0,
            	    							"tdt4250.xss.XSS.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiRefStatementAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiRefStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMultiRefStatement"


    // $ANTLR start "entryRuleMultiStatement"
    // InternalXSS.g:984:1: entryRuleMultiStatement returns [EObject current=null] : iv_ruleMultiStatement= ruleMultiStatement EOF ;
    public final EObject entryRuleMultiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStatement = null;


        try {
            // InternalXSS.g:984:55: (iv_ruleMultiStatement= ruleMultiStatement EOF )
            // InternalXSS.g:985:2: iv_ruleMultiStatement= ruleMultiStatement EOF
            {
             newCompositeNode(grammarAccess.getMultiStatementRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMultiStatement=ruleMultiStatement();

            state._fsp--;

             current =iv_ruleMultiStatement; 
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
    // $ANTLR end "entryRuleMultiStatement"


    // $ANTLR start "ruleMultiStatement"
    // InternalXSS.g:991:1: ruleMultiStatement returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleMultiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:997:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:998:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:998:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:999:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:999:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:1000:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:1000:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:1001:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getMultiStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_10);
            lv_property_0_0=rulePROPERTY();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getMultiStatementRule());
            					}
            					set(
            						current,
            						"property",
            						lv_property_0_0,
            						"tdt4250.xss.XSS.PROPERTY");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:1022:3: ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=RULE_STRING && LA18_0<=RULE_NAME)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalXSS.g:1023:4: ( (lv_states_2_0= ruleState ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:1023:4: ( (lv_states_2_0= ruleState ) )
            	    // InternalXSS.g:1024:5: (lv_states_2_0= ruleState )
            	    {
            	    // InternalXSS.g:1024:5: (lv_states_2_0= ruleState )
            	    // InternalXSS.g:1025:6: lv_states_2_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMultiStatementAccess().getStatesStateParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_states_2_0=ruleState();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getMultiStatementRule());
            	    						}
            	    						add(
            	    							current,
            	    							"states",
            	    							lv_states_2_0,
            	    							"tdt4250.xss.XSS.State");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,22,FOLLOW_19); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiStatementAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            otherlv_4=(Token)match(input,20,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3());
            		

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
    // $ANTLR end "ruleMultiStatement"


    // $ANTLR start "entryRuleState"
    // InternalXSS.g:1055:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalXSS.g:1055:46: (iv_ruleState= ruleState EOF )
            // InternalXSS.g:1056:2: iv_ruleState= ruleState EOF
            {
             newCompositeNode(grammarAccess.getStateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleState=ruleState();

            state._fsp--;

             current =iv_ruleState; 
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
    // $ANTLR end "entryRuleState"


    // $ANTLR start "ruleState"
    // InternalXSS.g:1062:1: ruleState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:1068:2: ( ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:1069:2: ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:1069:2: ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:1070:3: ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:1070:3: ( (lv_modifier_0_0= ruleSelector ) )
            // InternalXSS.g:1071:4: (lv_modifier_0_0= ruleSelector )
            {
            // InternalXSS.g:1071:4: (lv_modifier_0_0= ruleSelector )
            // InternalXSS.g:1072:5: lv_modifier_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getStateAccess().getModifierSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_15);
            lv_modifier_0_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"modifier",
            						lv_modifier_0_0,
            						"tdt4250.xss.XSS.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,23,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:1093:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:1094:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:1094:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:1095:5: lv_value_2_0= ruleVALUE
            {

            					newCompositeNode(grammarAccess.getStateAccess().getValueVALUEParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleVALUE();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getStateRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"tdt4250.xss.XSS.VALUE");
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
    // $ANTLR end "ruleState"


    // $ANTLR start "entryRulePROPERTY"
    // InternalXSS.g:1116:1: entryRulePROPERTY returns [String current=null] : iv_rulePROPERTY= rulePROPERTY EOF ;
    public final String entryRulePROPERTY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROPERTY = null;


        try {
            // InternalXSS.g:1116:48: (iv_rulePROPERTY= rulePROPERTY EOF )
            // InternalXSS.g:1117:2: iv_rulePROPERTY= rulePROPERTY EOF
            {
             newCompositeNode(grammarAccess.getPROPERTYRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePROPERTY=rulePROPERTY();

            state._fsp--;

             current =iv_rulePROPERTY.getText(); 
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
    // $ANTLR end "entryRulePROPERTY"


    // $ANTLR start "rulePROPERTY"
    // InternalXSS.g:1123:1: rulePROPERTY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_0= RULE_NAME ;
    public final AntlrDatatypeRuleToken rulePROPERTY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;


        	enterRule();

        try {
            // InternalXSS.g:1129:2: (this_NAME_0= RULE_NAME )
            // InternalXSS.g:1130:2: this_NAME_0= RULE_NAME
            {
            this_NAME_0=(Token)match(input,RULE_NAME,FOLLOW_2); 

            		current.merge(this_NAME_0);
            	

            		newLeafNode(this_NAME_0, grammarAccess.getPROPERTYAccess().getNAMETerminalRuleCall());
            	

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
    // $ANTLR end "rulePROPERTY"


    // $ANTLR start "entryRuleVALUE"
    // InternalXSS.g:1140:1: entryRuleVALUE returns [String current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final String entryRuleVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE = null;


        try {
            // InternalXSS.g:1140:45: (iv_ruleVALUE= ruleVALUE EOF )
            // InternalXSS.g:1141:2: iv_ruleVALUE= ruleVALUE EOF
            {
             newCompositeNode(grammarAccess.getVALUERule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVALUE=ruleVALUE();

            state._fsp--;

             current =iv_ruleVALUE.getText(); 
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
    // $ANTLR end "entryRuleVALUE"


    // $ANTLR start "ruleVALUE"
    // InternalXSS.g:1147:1: ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_OR_VAL_0= ruleSTRING_OR_VAL ;
    public final AntlrDatatypeRuleToken ruleVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STRING_OR_VAL_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:1153:2: (this_STRING_OR_VAL_0= ruleSTRING_OR_VAL )
            // InternalXSS.g:1154:2: this_STRING_OR_VAL_0= ruleSTRING_OR_VAL
            {

            		newCompositeNode(grammarAccess.getVALUEAccess().getSTRING_OR_VALParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_STRING_OR_VAL_0=ruleSTRING_OR_VAL();

            state._fsp--;


            		current.merge(this_STRING_OR_VAL_0);
            	

            		afterParserOrEnumRuleCall();
            	

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
    // $ANTLR end "ruleVALUE"


    // $ANTLR start "entryRuleRule"
    // InternalXSS.g:1167:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // InternalXSS.g:1167:45: (iv_ruleRule= ruleRule EOF )
            // InternalXSS.g:1168:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
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
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // InternalXSS.g:1174:1: ruleRule returns [EObject current=null] : ( ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) ) (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )* otherlv_7= ':' ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+ ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_selectors_0_0 = null;

        EObject lv_selectors_4_0 = null;

        EObject lv_xStatements_8_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:1180:2: ( ( ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) ) (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )* otherlv_7= ':' ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+ ) )
            // InternalXSS.g:1181:2: ( ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) ) (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )* otherlv_7= ':' ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+ )
            {
            // InternalXSS.g:1181:2: ( ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) ) (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )* otherlv_7= ':' ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+ )
            // InternalXSS.g:1182:3: ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) ) (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )* otherlv_7= ':' ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+
            {
            // InternalXSS.g:1182:3: ( ( (lv_selectors_0_0= ruleSelector ) ) | (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( ((LA19_0>=RULE_STRING && LA19_0<=RULE_NAME)) ) {
                alt19=1;
            }
            else if ( (LA19_0==17) ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // InternalXSS.g:1183:4: ( (lv_selectors_0_0= ruleSelector ) )
                    {
                    // InternalXSS.g:1183:4: ( (lv_selectors_0_0= ruleSelector ) )
                    // InternalXSS.g:1184:5: (lv_selectors_0_0= ruleSelector )
                    {
                    // InternalXSS.g:1184:5: (lv_selectors_0_0= ruleSelector )
                    // InternalXSS.g:1185:6: lv_selectors_0_0= ruleSelector
                    {

                    						newCompositeNode(grammarAccess.getRuleAccess().getSelectorsSelectorParserRuleCall_0_0_0());
                    					
                    pushFollow(FOLLOW_20);
                    lv_selectors_0_0=ruleSelector();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getRuleRule());
                    						}
                    						add(
                    							current,
                    							"selectors",
                    							lv_selectors_0_0,
                    							"tdt4250.xss.XSS.Selector");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalXSS.g:1203:4: (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) )
                    {
                    // InternalXSS.g:1203:4: (otherlv_1= '@' ( (otherlv_2= RULE_NAME ) ) )
                    // InternalXSS.g:1204:5: otherlv_1= '@' ( (otherlv_2= RULE_NAME ) )
                    {
                    otherlv_1=(Token)match(input,17,FOLLOW_9); 

                    					newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getCommercialAtKeyword_0_1_0());
                    				
                    // InternalXSS.g:1208:5: ( (otherlv_2= RULE_NAME ) )
                    // InternalXSS.g:1209:6: (otherlv_2= RULE_NAME )
                    {
                    // InternalXSS.g:1209:6: (otherlv_2= RULE_NAME )
                    // InternalXSS.g:1210:7: otherlv_2= RULE_NAME
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getRuleRule());
                    							}
                    						
                    otherlv_2=(Token)match(input,RULE_NAME,FOLLOW_20); 

                    							newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getGroupSelectorsGroupSelectorCrossReference_0_1_1_0());
                    						

                    }


                    }


                    }


                    }
                    break;

            }

            // InternalXSS.g:1223:3: (otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==19) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalXSS.g:1224:4: otherlv_3= ',' ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) )
            	    {
            	    otherlv_3=(Token)match(input,19,FOLLOW_7); 

            	    				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getCommaKeyword_1_0());
            	    			
            	    // InternalXSS.g:1228:4: ( ( (lv_selectors_4_0= ruleSelector ) ) | (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) ) )
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( ((LA20_0>=RULE_STRING && LA20_0<=RULE_NAME)) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==17) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // InternalXSS.g:1229:5: ( (lv_selectors_4_0= ruleSelector ) )
            	            {
            	            // InternalXSS.g:1229:5: ( (lv_selectors_4_0= ruleSelector ) )
            	            // InternalXSS.g:1230:6: (lv_selectors_4_0= ruleSelector )
            	            {
            	            // InternalXSS.g:1230:6: (lv_selectors_4_0= ruleSelector )
            	            // InternalXSS.g:1231:7: lv_selectors_4_0= ruleSelector
            	            {

            	            							newCompositeNode(grammarAccess.getRuleAccess().getSelectorsSelectorParserRuleCall_1_1_0_0());
            	            						
            	            pushFollow(FOLLOW_20);
            	            lv_selectors_4_0=ruleSelector();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRuleRule());
            	            							}
            	            							add(
            	            								current,
            	            								"selectors",
            	            								lv_selectors_4_0,
            	            								"tdt4250.xss.XSS.Selector");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXSS.g:1249:5: (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) )
            	            {
            	            // InternalXSS.g:1249:5: (otherlv_5= '@' ( (otherlv_6= RULE_NAME ) ) )
            	            // InternalXSS.g:1250:6: otherlv_5= '@' ( (otherlv_6= RULE_NAME ) )
            	            {
            	            otherlv_5=(Token)match(input,17,FOLLOW_9); 

            	            						newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getCommercialAtKeyword_1_1_1_0());
            	            					
            	            // InternalXSS.g:1254:6: ( (otherlv_6= RULE_NAME ) )
            	            // InternalXSS.g:1255:7: (otherlv_6= RULE_NAME )
            	            {
            	            // InternalXSS.g:1255:7: (otherlv_6= RULE_NAME )
            	            // InternalXSS.g:1256:8: otherlv_6= RULE_NAME
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getRuleRule());
            	            								}
            	            							
            	            otherlv_6=(Token)match(input,RULE_NAME,FOLLOW_20); 

            	            								newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getGroupSelectorsGroupSelectorCrossReference_1_1_1_1_0());
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,24,FOLLOW_5); 

            			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getColonKeyword_2());
            		
            // InternalXSS.g:1274:3: ( ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';' )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                switch ( input.LA(1) ) {
                case RULE_NAME:
                    {
                    int LA23_2 = input.LA(2);

                    if ( (LA23_2==18||LA23_2==23) ) {
                        alt23=1;
                    }


                    }
                    break;
                case 17:
                    {
                    int LA23_3 = input.LA(2);

                    if ( (LA23_3==RULE_NAME) ) {
                        int LA23_5 = input.LA(3);

                        if ( (LA23_5==22) ) {
                            alt23=1;
                        }


                    }


                    }
                    break;
                case 21:
                    {
                    alt23=1;
                    }
                    break;

                }

                switch (alt23) {
            	case 1 :
            	    // InternalXSS.g:1275:4: ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) ) otherlv_11= ';'
            	    {
            	    // InternalXSS.g:1275:4: ( ( (lv_xStatements_8_0= ruleXStatement ) ) | (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) ) )
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==RULE_NAME||LA22_0==21) ) {
            	        alt22=1;
            	    }
            	    else if ( (LA22_0==17) ) {
            	        alt22=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // InternalXSS.g:1276:5: ( (lv_xStatements_8_0= ruleXStatement ) )
            	            {
            	            // InternalXSS.g:1276:5: ( (lv_xStatements_8_0= ruleXStatement ) )
            	            // InternalXSS.g:1277:6: (lv_xStatements_8_0= ruleXStatement )
            	            {
            	            // InternalXSS.g:1277:6: (lv_xStatements_8_0= ruleXStatement )
            	            // InternalXSS.g:1278:7: lv_xStatements_8_0= ruleXStatement
            	            {

            	            							newCompositeNode(grammarAccess.getRuleAccess().getXStatementsXStatementParserRuleCall_3_0_0_0());
            	            						
            	            pushFollow(FOLLOW_13);
            	            lv_xStatements_8_0=ruleXStatement();

            	            state._fsp--;


            	            							if (current==null) {
            	            								current = createModelElementForParent(grammarAccess.getRuleRule());
            	            							}
            	            							add(
            	            								current,
            	            								"xStatements",
            	            								lv_xStatements_8_0,
            	            								"tdt4250.xss.XSS.XStatement");
            	            							afterParserOrEnumRuleCall();
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalXSS.g:1296:5: (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) )
            	            {
            	            // InternalXSS.g:1296:5: (otherlv_9= '@' ( (otherlv_10= RULE_NAME ) ) )
            	            // InternalXSS.g:1297:6: otherlv_9= '@' ( (otherlv_10= RULE_NAME ) )
            	            {
            	            otherlv_9=(Token)match(input,17,FOLLOW_9); 

            	            						newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getCommercialAtKeyword_3_0_1_0());
            	            					
            	            // InternalXSS.g:1301:6: ( (otherlv_10= RULE_NAME ) )
            	            // InternalXSS.g:1302:7: (otherlv_10= RULE_NAME )
            	            {
            	            // InternalXSS.g:1302:7: (otherlv_10= RULE_NAME )
            	            // InternalXSS.g:1303:8: otherlv_10= RULE_NAME
            	            {

            	            								if (current==null) {
            	            									current = createModelElement(grammarAccess.getRuleRule());
            	            								}
            	            							
            	            otherlv_10=(Token)match(input,RULE_NAME,FOLLOW_13); 

            	            								newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getGroupStatementsGroupPropertyCrossReference_3_0_1_1_0());
            	            							

            	            }


            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_11=(Token)match(input,22,FOLLOW_21); 

            	    				newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getSemicolonKeyword_3_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
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
    // $ANTLR end "ruleRule"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000020040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000038040L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000220040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000230040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020070L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020072L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000180000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000100040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000200040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000300040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000100070L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000220042L});

}