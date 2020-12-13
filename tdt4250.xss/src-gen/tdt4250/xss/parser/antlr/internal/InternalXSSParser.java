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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_SEL", "RULE_NAME", "RULE_VAL", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XSelectors:'", "'XProperties:'", "'('", "','", "')'", "'$'", "';'", "'='"
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
    public static final int RULE_ML_COMMENT=10;
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
    // InternalXSS.g:71:1: ruleStylesheet returns [EObject current=null] : ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ ) (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? ) ;
    public final EObject ruleStylesheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_customSelectors_1_0 = null;

        EObject lv_customProperties_3_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:77:2: ( ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ ) (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? ) )
            // InternalXSS.g:78:2: ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ ) (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? )
            {
            // InternalXSS.g:78:2: ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ ) (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )? )
            // InternalXSS.g:79:3: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ ) (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )?
            {
            // InternalXSS.g:79:3: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleXSelector ) )+ )
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

                if ( (LA1_0==RULE_NAME) ) {
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

            // InternalXSS.g:104:3: (otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+ )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==15) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalXSS.g:105:4: otherlv_2= 'XProperties:' ( (lv_customProperties_3_0= ruleXProperty ) )+
                    {
                    otherlv_2=(Token)match(input,15,FOLLOW_5); 

                    				newLeafNode(otherlv_2, grammarAccess.getStylesheetAccess().getXPropertiesKeyword_1_0());
                    			
                    // InternalXSS.g:109:4: ( (lv_customProperties_3_0= ruleXProperty ) )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==RULE_NAME||LA2_0==19) ) {
                            alt2=1;
                        }


                        switch (alt2) {
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
                    	    if ( cnt2 >= 1 ) break loop2;
                                EarlyExitException eee =
                                    new EarlyExitException(2, input);
                                throw eee;
                        }
                        cnt2++;
                    } while (true);


                    }
                    break;

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
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleSTRING_OR_SEL"
    // InternalXSS.g:133:1: entryRuleSTRING_OR_SEL returns [String current=null] : iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF ;
    public final String entryRuleSTRING_OR_SEL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_OR_SEL = null;


        try {
            // InternalXSS.g:133:53: (iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF )
            // InternalXSS.g:134:2: iv_ruleSTRING_OR_SEL= ruleSTRING_OR_SEL EOF
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
    // InternalXSS.g:140:1: ruleSTRING_OR_SEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleSTRING_OR_SEL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_SEL_1=null;
        Token this_NAME_2=null;


        	enterRule();

        try {
            // InternalXSS.g:146:2: ( (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME ) )
            // InternalXSS.g:147:2: (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME )
            {
            // InternalXSS.g:147:2: (this_STRING_0= RULE_STRING | this_SEL_1= RULE_SEL | this_NAME_2= RULE_NAME )
            int alt4=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt4=1;
                }
                break;
            case RULE_SEL:
                {
                alt4=2;
                }
                break;
            case RULE_NAME:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // InternalXSS.g:148:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_SELAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXSS.g:156:3: this_SEL_1= RULE_SEL
                    {
                    this_SEL_1=(Token)match(input,RULE_SEL,FOLLOW_2); 

                    			current.merge(this_SEL_1);
                    		

                    			newLeafNode(this_SEL_1, grammarAccess.getSTRING_OR_SELAccess().getSELTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXSS.g:164:3: this_NAME_2= RULE_NAME
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
    // InternalXSS.g:175:1: entryRuleSTRING_OR_VAL returns [String current=null] : iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF ;
    public final String entryRuleSTRING_OR_VAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSTRING_OR_VAL = null;


        try {
            // InternalXSS.g:175:53: (iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF )
            // InternalXSS.g:176:2: iv_ruleSTRING_OR_VAL= ruleSTRING_OR_VAL EOF
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
    // InternalXSS.g:182:1: ruleSTRING_OR_VAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME ) ;
    public final AntlrDatatypeRuleToken ruleSTRING_OR_VAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_VAL_1=null;
        Token this_NAME_2=null;


        	enterRule();

        try {
            // InternalXSS.g:188:2: ( (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME ) )
            // InternalXSS.g:189:2: (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME )
            {
            // InternalXSS.g:189:2: (this_STRING_0= RULE_STRING | this_VAL_1= RULE_VAL | this_NAME_2= RULE_NAME )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt5=1;
                }
                break;
            case RULE_VAL:
                {
                alt5=2;
                }
                break;
            case RULE_NAME:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalXSS.g:190:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_VALAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalXSS.g:198:3: this_VAL_1= RULE_VAL
                    {
                    this_VAL_1=(Token)match(input,RULE_VAL,FOLLOW_2); 

                    			current.merge(this_VAL_1);
                    		

                    			newLeafNode(this_VAL_1, grammarAccess.getSTRING_OR_VALAccess().getVALTerminalRuleCall_1());
                    		

                    }
                    break;
                case 3 :
                    // InternalXSS.g:206:3: this_NAME_2= RULE_NAME
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
    // InternalXSS.g:217:1: entryRuleXSelector returns [EObject current=null] : iv_ruleXSelector= ruleXSelector EOF ;
    public final EObject entryRuleXSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSelector = null;


        try {
            // InternalXSS.g:217:50: (iv_ruleXSelector= ruleXSelector EOF )
            // InternalXSS.g:218:2: iv_ruleXSelector= ruleXSelector EOF
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
    // InternalXSS.g:224:1: ruleXSelector returns [EObject current=null] : this_GroupSelector_0= ruleGroupSelector ;
    public final EObject ruleXSelector() throws RecognitionException {
        EObject current = null;

        EObject this_GroupSelector_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:230:2: (this_GroupSelector_0= ruleGroupSelector )
            // InternalXSS.g:231:2: this_GroupSelector_0= ruleGroupSelector
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
    // InternalXSS.g:242:1: entryRuleGroupSelector returns [EObject current=null] : iv_ruleGroupSelector= ruleGroupSelector EOF ;
    public final EObject entryRuleGroupSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSelector = null;


        try {
            // InternalXSS.g:242:54: (iv_ruleGroupSelector= ruleGroupSelector EOF )
            // InternalXSS.g:243:2: iv_ruleGroupSelector= ruleGroupSelector EOF
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
    // InternalXSS.g:249:1: ruleGroupSelector returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( (lv_subSelectors_2_0= ruleSelector ) ) (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )* otherlv_5= ')' ) ;
    public final EObject ruleGroupSelector() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_subSelectors_2_0 = null;

        EObject lv_subSelectors_4_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:255:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( (lv_subSelectors_2_0= ruleSelector ) ) (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )* otherlv_5= ')' ) )
            // InternalXSS.g:256:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( (lv_subSelectors_2_0= ruleSelector ) ) (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )* otherlv_5= ')' )
            {
            // InternalXSS.g:256:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( (lv_subSelectors_2_0= ruleSelector ) ) (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )* otherlv_5= ')' )
            // InternalXSS.g:257:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( (lv_subSelectors_2_0= ruleSelector ) ) (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )* otherlv_5= ')'
            {
            // InternalXSS.g:257:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalXSS.g:258:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalXSS.g:258:4: (lv_name_0_0= RULE_NAME )
            // InternalXSS.g:259:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(lv_name_0_0, grammarAccess.getGroupSelectorAccess().getNameNAMETerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getGroupSelectorRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"tdt4250.xss.XSS.NAME");
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:279:3: ( (lv_subSelectors_2_0= ruleSelector ) )
            // InternalXSS.g:280:4: (lv_subSelectors_2_0= ruleSelector )
            {
            // InternalXSS.g:280:4: (lv_subSelectors_2_0= ruleSelector )
            // InternalXSS.g:281:5: lv_subSelectors_2_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_9);
            lv_subSelectors_2_0=ruleSelector();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
            					}
            					add(
            						current,
            						"subSelectors",
            						lv_subSelectors_2_0,
            						"tdt4250.xss.XSS.Selector");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalXSS.g:298:3: (otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==17) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXSS.g:299:4: otherlv_3= ',' ( (lv_subSelectors_4_0= ruleSelector ) )
            	    {
            	    otherlv_3=(Token)match(input,17,FOLLOW_8); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGroupSelectorAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalXSS.g:303:4: ( (lv_subSelectors_4_0= ruleSelector ) )
            	    // InternalXSS.g:304:5: (lv_subSelectors_4_0= ruleSelector )
            	    {
            	    // InternalXSS.g:304:5: (lv_subSelectors_4_0= ruleSelector )
            	    // InternalXSS.g:305:6: lv_subSelectors_4_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_subSelectors_4_0=ruleSelector();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subSelectors",
            	    							lv_subSelectors_4_0,
            	    							"tdt4250.xss.XSS.Selector");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getGroupSelectorAccess().getRightParenthesisKeyword_4());
            		

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
    // InternalXSS.g:331:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalXSS.g:331:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalXSS.g:332:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalXSS.g:338:1: ruleSelector returns [EObject current=null] : ( (lv_name_0_0= ruleSTRING_OR_SEL ) ) ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:344:2: ( ( (lv_name_0_0= ruleSTRING_OR_SEL ) ) )
            // InternalXSS.g:345:2: ( (lv_name_0_0= ruleSTRING_OR_SEL ) )
            {
            // InternalXSS.g:345:2: ( (lv_name_0_0= ruleSTRING_OR_SEL ) )
            // InternalXSS.g:346:3: (lv_name_0_0= ruleSTRING_OR_SEL )
            {
            // InternalXSS.g:346:3: (lv_name_0_0= ruleSTRING_OR_SEL )
            // InternalXSS.g:347:4: lv_name_0_0= ruleSTRING_OR_SEL
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
    // InternalXSS.g:367:1: entryRuleXProperty returns [EObject current=null] : iv_ruleXProperty= ruleXProperty EOF ;
    public final EObject entryRuleXProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXProperty = null;


        try {
            // InternalXSS.g:367:50: (iv_ruleXProperty= ruleXProperty EOF )
            // InternalXSS.g:368:2: iv_ruleXProperty= ruleXProperty EOF
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
    // InternalXSS.g:374:1: ruleXProperty returns [EObject current=null] : ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | this_GroupProperty_2= ruleGroupProperty ) ;
    public final EObject ruleXProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_CustomProperty_1 = null;

        EObject this_GroupProperty_2 = null;



        	enterRule();

        try {
            // InternalXSS.g:380:2: ( ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | this_GroupProperty_2= ruleGroupProperty ) )
            // InternalXSS.g:381:2: ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | this_GroupProperty_2= ruleGroupProperty )
            {
            // InternalXSS.g:381:2: ( (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty ) | this_GroupProperty_2= ruleGroupProperty )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_NAME) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalXSS.g:382:3: (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty )
                    {
                    // InternalXSS.g:382:3: (otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty )
                    // InternalXSS.g:383:4: otherlv_0= '$' this_CustomProperty_1= ruleCustomProperty
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_3); 

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
                    // InternalXSS.g:397:3: this_GroupProperty_2= ruleGroupProperty
                    {

                    			newCompositeNode(grammarAccess.getXPropertyAccess().getGroupPropertyParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_GroupProperty_2=ruleGroupProperty();

                    state._fsp--;


                    			current = this_GroupProperty_2;
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
    // $ANTLR end "ruleXProperty"


    // $ANTLR start "entryRuleCustomProperty"
    // InternalXSS.g:409:1: entryRuleCustomProperty returns [EObject current=null] : iv_ruleCustomProperty= ruleCustomProperty EOF ;
    public final EObject entryRuleCustomProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCustomProperty = null;


        try {
            // InternalXSS.g:409:55: (iv_ruleCustomProperty= ruleCustomProperty EOF )
            // InternalXSS.g:410:2: iv_ruleCustomProperty= ruleCustomProperty EOF
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
    // InternalXSS.g:416:1: ruleCustomProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleCustomProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_subRule_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:422:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:423:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:423:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:424:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:424:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalXSS.g:425:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalXSS.g:425:4: (lv_name_0_0= RULE_NAME )
            // InternalXSS.g:426:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:446:3: ( ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_NAME) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXSS.g:447:4: ( (lv_subRule_2_0= ruleSubRule ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:447:4: ( (lv_subRule_2_0= ruleSubRule ) )
            	    // InternalXSS.g:448:5: (lv_subRule_2_0= ruleSubRule )
            	    {
            	    // InternalXSS.g:448:5: (lv_subRule_2_0= ruleSubRule )
            	    // InternalXSS.g:449:6: lv_subRule_2_0= ruleSubRule
            	    {

            	    						newCompositeNode(grammarAccess.getCustomPropertyAccess().getSubRuleSubRuleParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_subRule_2_0=ruleSubRule();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCustomPropertyRule());
            	    						}
            	    						add(
            	    							current,
            	    							"subRule",
            	    							lv_subRule_2_0,
            	    							"tdt4250.xss.XSS.SubRule");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }

            	    otherlv_3=(Token)match(input,20,FOLLOW_11); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCustomPropertyAccess().getSemicolonKeyword_2_1());
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXSS.g:479:1: entryRuleSubRule returns [EObject current=null] : iv_ruleSubRule= ruleSubRule EOF ;
    public final EObject entryRuleSubRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSubRule = null;


        try {
            // InternalXSS.g:479:48: (iv_ruleSubRule= ruleSubRule EOF )
            // InternalXSS.g:480:2: iv_ruleSubRule= ruleSubRule EOF
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
    // InternalXSS.g:486:1: ruleSubRule returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) ;
    public final EObject ruleSubRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:492:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) ) )
            // InternalXSS.g:493:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            {
            // InternalXSS.g:493:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) ) )
            // InternalXSS.g:494:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_expression_2_0= ruleExpression ) )
            {
            // InternalXSS.g:494:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:495:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:495:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:496:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getSubRuleAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSubRuleAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:517:3: ( (lv_expression_2_0= ruleExpression ) )
            // InternalXSS.g:518:4: (lv_expression_2_0= ruleExpression )
            {
            // InternalXSS.g:518:4: (lv_expression_2_0= ruleExpression )
            // InternalXSS.g:519:5: lv_expression_2_0= ruleExpression
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
    // InternalXSS.g:540:1: entryRuleExpression returns [EObject current=null] : iv_ruleExpression= ruleExpression EOF ;
    public final EObject entryRuleExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExpression = null;


        try {
            // InternalXSS.g:540:51: (iv_ruleExpression= ruleExpression EOF )
            // InternalXSS.g:541:2: iv_ruleExpression= ruleExpression EOF
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
    // InternalXSS.g:547:1: ruleExpression returns [EObject current=null] : ( (lv_name_0_0= ruleSTRING_OR_VAL ) ) ;
    public final EObject ruleExpression() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:553:2: ( ( (lv_name_0_0= ruleSTRING_OR_VAL ) ) )
            // InternalXSS.g:554:2: ( (lv_name_0_0= ruleSTRING_OR_VAL ) )
            {
            // InternalXSS.g:554:2: ( (lv_name_0_0= ruleSTRING_OR_VAL ) )
            // InternalXSS.g:555:3: (lv_name_0_0= ruleSTRING_OR_VAL )
            {
            // InternalXSS.g:555:3: (lv_name_0_0= ruleSTRING_OR_VAL )
            // InternalXSS.g:556:4: lv_name_0_0= ruleSTRING_OR_VAL
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
    // InternalXSS.g:576:1: entryRuleGroupProperty returns [EObject current=null] : iv_ruleGroupProperty= ruleGroupProperty EOF ;
    public final EObject entryRuleGroupProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupProperty = null;


        try {
            // InternalXSS.g:576:54: (iv_ruleGroupProperty= ruleGroupProperty EOF )
            // InternalXSS.g:577:2: iv_ruleGroupProperty= ruleGroupProperty EOF
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
    // InternalXSS.g:583:1: ruleGroupProperty returns [EObject current=null] : ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleGroupProperty() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:589:2: ( ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:590:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:590:2: ( ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:591:3: ( (lv_name_0_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:591:3: ( (lv_name_0_0= RULE_NAME ) )
            // InternalXSS.g:592:4: (lv_name_0_0= RULE_NAME )
            {
            // InternalXSS.g:592:4: (lv_name_0_0= RULE_NAME )
            // InternalXSS.g:593:5: lv_name_0_0= RULE_NAME
            {
            lv_name_0_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

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

            otherlv_1=(Token)match(input,16,FOLLOW_5); 

            			newLeafNode(otherlv_1, grammarAccess.getGroupPropertyAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:613:3: ( ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==RULE_NAME||LA9_0==19) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXSS.g:614:4: ( (lv_statements_2_0= ruleXStatement ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:614:4: ( (lv_statements_2_0= ruleXStatement ) )
            	    // InternalXSS.g:615:5: (lv_statements_2_0= ruleXStatement )
            	    {
            	    // InternalXSS.g:615:5: (lv_statements_2_0= ruleXStatement )
            	    // InternalXSS.g:616:6: lv_statements_2_0= ruleXStatement
            	    {

            	    						newCompositeNode(grammarAccess.getGroupPropertyAccess().getStatementsXStatementParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_3=(Token)match(input,20,FOLLOW_14); 

            	    				newLeafNode(otherlv_3, grammarAccess.getGroupPropertyAccess().getSemicolonKeyword_2_1());
            	    			

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXSS.g:646:1: entryRuleXStatement returns [EObject current=null] : iv_ruleXStatement= ruleXStatement EOF ;
    public final EObject entryRuleXStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXStatement = null;


        try {
            // InternalXSS.g:646:51: (iv_ruleXStatement= ruleXStatement EOF )
            // InternalXSS.g:647:2: iv_ruleXStatement= ruleXStatement EOF
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
    // InternalXSS.g:653:1: ruleXStatement returns [EObject current=null] : this_XSingleStatement_0= ruleXSingleStatement ;
    public final EObject ruleXStatement() throws RecognitionException {
        EObject current = null;

        EObject this_XSingleStatement_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:659:2: (this_XSingleStatement_0= ruleXSingleStatement )
            // InternalXSS.g:660:2: this_XSingleStatement_0= ruleXSingleStatement
            {

            		newCompositeNode(grammarAccess.getXStatementAccess().getXSingleStatementParserRuleCall());
            	
            pushFollow(FOLLOW_2);
            this_XSingleStatement_0=ruleXSingleStatement();

            state._fsp--;


            		current = this_XSingleStatement_0;
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
    // $ANTLR end "ruleXStatement"


    // $ANTLR start "entryRuleXSingleStatement"
    // InternalXSS.g:671:1: entryRuleXSingleStatement returns [EObject current=null] : iv_ruleXSingleStatement= ruleXSingleStatement EOF ;
    public final EObject entryRuleXSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXSingleStatement = null;


        try {
            // InternalXSS.g:671:57: (iv_ruleXSingleStatement= ruleXSingleStatement EOF )
            // InternalXSS.g:672:2: iv_ruleXSingleStatement= ruleXSingleStatement EOF
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
    // InternalXSS.g:678:1: ruleXSingleStatement returns [EObject current=null] : ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement ) ;
    public final EObject ruleXSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject this_SingleRefStatement_1 = null;

        EObject this_SingleStatement_2 = null;



        	enterRule();

        try {
            // InternalXSS.g:684:2: ( ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement ) )
            // InternalXSS.g:685:2: ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement )
            {
            // InternalXSS.g:685:2: ( (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement ) | this_SingleStatement_2= ruleSingleStatement )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==19) ) {
                alt10=1;
            }
            else if ( (LA10_0==RULE_NAME) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // InternalXSS.g:686:3: (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement )
                    {
                    // InternalXSS.g:686:3: (otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement )
                    // InternalXSS.g:687:4: otherlv_0= '$' this_SingleRefStatement_1= ruleSingleRefStatement
                    {
                    otherlv_0=(Token)match(input,19,FOLLOW_3); 

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
                    // InternalXSS.g:701:3: this_SingleStatement_2= ruleSingleStatement
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
    // InternalXSS.g:713:1: entryRuleSingleRefStatement returns [EObject current=null] : iv_ruleSingleRefStatement= ruleSingleRefStatement EOF ;
    public final EObject entryRuleSingleRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleRefStatement = null;


        try {
            // InternalXSS.g:713:59: (iv_ruleSingleRefStatement= ruleSingleRefStatement EOF )
            // InternalXSS.g:714:2: iv_ruleSingleRefStatement= ruleSingleRefStatement EOF
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
    // InternalXSS.g:720:1: ruleSingleRefStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleSingleRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:726:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:727:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:727:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:728:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:728:3: ( (otherlv_0= RULE_NAME ) )
            // InternalXSS.g:729:4: (otherlv_0= RULE_NAME )
            {
            // InternalXSS.g:729:4: (otherlv_0= RULE_NAME )
            // InternalXSS.g:730:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getSingleRefStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_12); 

            					newLeafNode(otherlv_0, grammarAccess.getSingleRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleRefStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:745:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:746:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:746:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:747:5: lv_value_2_0= ruleVALUE
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
    // InternalXSS.g:768:1: entryRuleSingleStatement returns [EObject current=null] : iv_ruleSingleStatement= ruleSingleStatement EOF ;
    public final EObject entryRuleSingleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSingleStatement = null;


        try {
            // InternalXSS.g:768:56: (iv_ruleSingleStatement= ruleSingleStatement EOF )
            // InternalXSS.g:769:2: iv_ruleSingleStatement= ruleSingleStatement EOF
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
    // InternalXSS.g:775:1: ruleSingleStatement returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleSingleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:781:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:782:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:782:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:783:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:783:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:784:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:784:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:785:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getSingleStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:806:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:807:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:807:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:808:5: lv_value_2_0= ruleVALUE
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


    // $ANTLR start "entryRuleMultiRefStatement"
    // InternalXSS.g:829:1: entryRuleMultiRefStatement returns [EObject current=null] : iv_ruleMultiRefStatement= ruleMultiRefStatement EOF ;
    public final EObject entryRuleMultiRefStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiRefStatement = null;


        try {
            // InternalXSS.g:829:58: (iv_ruleMultiRefStatement= ruleMultiRefStatement EOF )
            // InternalXSS.g:830:2: iv_ruleMultiRefStatement= ruleMultiRefStatement EOF
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
    // InternalXSS.g:836:1: ruleMultiRefStatement returns [EObject current=null] : ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleMultiRefStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:842:2: ( ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:843:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:843:2: ( ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:844:3: ( (otherlv_0= RULE_NAME ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:844:3: ( (otherlv_0= RULE_NAME ) )
            // InternalXSS.g:845:4: (otherlv_0= RULE_NAME )
            {
            // InternalXSS.g:845:4: (otherlv_0= RULE_NAME )
            // InternalXSS.g:846:5: otherlv_0= RULE_NAME
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getMultiRefStatementRule());
            					}
            				
            otherlv_0=(Token)match(input,RULE_NAME,FOLLOW_7); 

            					newLeafNode(otherlv_0, grammarAccess.getMultiRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
            				

            }


            }

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiRefStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:861:3: ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=RULE_STRING && LA11_0<=RULE_NAME)) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalXSS.g:862:4: ( (lv_states_2_0= ruleState ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:862:4: ( (lv_states_2_0= ruleState ) )
            	    // InternalXSS.g:863:5: (lv_states_2_0= ruleState )
            	    {
            	    // InternalXSS.g:863:5: (lv_states_2_0= ruleState )
            	    // InternalXSS.g:864:6: lv_states_2_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMultiRefStatementAccess().getStatesStateParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_3=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiRefStatementAccess().getSemicolonKeyword_2_1());
            	    			

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXSS.g:894:1: entryRuleMultiStatement returns [EObject current=null] : iv_ruleMultiStatement= ruleMultiStatement EOF ;
    public final EObject entryRuleMultiStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMultiStatement = null;


        try {
            // InternalXSS.g:894:55: (iv_ruleMultiStatement= ruleMultiStatement EOF )
            // InternalXSS.g:895:2: iv_ruleMultiStatement= ruleMultiStatement EOF
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
    // InternalXSS.g:901:1: ruleMultiStatement returns [EObject current=null] : ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) ;
    public final EObject ruleMultiStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_property_0_0 = null;

        EObject lv_states_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:907:2: ( ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' ) )
            // InternalXSS.g:908:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            {
            // InternalXSS.g:908:2: ( ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')' )
            // InternalXSS.g:909:3: ( (lv_property_0_0= rulePROPERTY ) ) otherlv_1= '(' ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+ otherlv_4= ')'
            {
            // InternalXSS.g:909:3: ( (lv_property_0_0= rulePROPERTY ) )
            // InternalXSS.g:910:4: (lv_property_0_0= rulePROPERTY )
            {
            // InternalXSS.g:910:4: (lv_property_0_0= rulePROPERTY )
            // InternalXSS.g:911:5: lv_property_0_0= rulePROPERTY
            {

            					newCompositeNode(grammarAccess.getMultiStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_7);
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

            otherlv_1=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
            		
            // InternalXSS.g:932:3: ( ( (lv_states_2_0= ruleState ) ) otherlv_3= ';' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>=RULE_STRING && LA12_0<=RULE_NAME)) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalXSS.g:933:4: ( (lv_states_2_0= ruleState ) ) otherlv_3= ';'
            	    {
            	    // InternalXSS.g:933:4: ( (lv_states_2_0= ruleState ) )
            	    // InternalXSS.g:934:5: (lv_states_2_0= ruleState )
            	    {
            	    // InternalXSS.g:934:5: (lv_states_2_0= ruleState )
            	    // InternalXSS.g:935:6: lv_states_2_0= ruleState
            	    {

            	    						newCompositeNode(grammarAccess.getMultiStatementAccess().getStatesStateParserRuleCall_2_0_0());
            	    					
            	    pushFollow(FOLLOW_10);
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

            	    otherlv_3=(Token)match(input,20,FOLLOW_15); 

            	    				newLeafNode(otherlv_3, grammarAccess.getMultiStatementAccess().getSemicolonKeyword_2_1());
            	    			

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

            otherlv_4=(Token)match(input,18,FOLLOW_2); 

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
    // InternalXSS.g:965:1: entryRuleState returns [EObject current=null] : iv_ruleState= ruleState EOF ;
    public final EObject entryRuleState() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleState = null;


        try {
            // InternalXSS.g:965:46: (iv_ruleState= ruleState EOF )
            // InternalXSS.g:966:2: iv_ruleState= ruleState EOF
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
    // InternalXSS.g:972:1: ruleState returns [EObject current=null] : ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) ;
    public final EObject ruleState() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_modifier_0_0 = null;

        AntlrDatatypeRuleToken lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:978:2: ( ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) ) )
            // InternalXSS.g:979:2: ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            {
            // InternalXSS.g:979:2: ( ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) ) )
            // InternalXSS.g:980:3: ( (lv_modifier_0_0= ruleSelector ) ) otherlv_1= '=' ( (lv_value_2_0= ruleVALUE ) )
            {
            // InternalXSS.g:980:3: ( (lv_modifier_0_0= ruleSelector ) )
            // InternalXSS.g:981:4: (lv_modifier_0_0= ruleSelector )
            {
            // InternalXSS.g:981:4: (lv_modifier_0_0= ruleSelector )
            // InternalXSS.g:982:5: lv_modifier_0_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getStateAccess().getModifierSelectorParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
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

            otherlv_1=(Token)match(input,21,FOLLOW_13); 

            			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getEqualsSignKeyword_1());
            		
            // InternalXSS.g:1003:3: ( (lv_value_2_0= ruleVALUE ) )
            // InternalXSS.g:1004:4: (lv_value_2_0= ruleVALUE )
            {
            // InternalXSS.g:1004:4: (lv_value_2_0= ruleVALUE )
            // InternalXSS.g:1005:5: lv_value_2_0= ruleVALUE
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
    // InternalXSS.g:1026:1: entryRulePROPERTY returns [String current=null] : iv_rulePROPERTY= rulePROPERTY EOF ;
    public final String entryRulePROPERTY() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePROPERTY = null;


        try {
            // InternalXSS.g:1026:48: (iv_rulePROPERTY= rulePROPERTY EOF )
            // InternalXSS.g:1027:2: iv_rulePROPERTY= rulePROPERTY EOF
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
    // InternalXSS.g:1033:1: rulePROPERTY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_0= RULE_NAME ;
    public final AntlrDatatypeRuleToken rulePROPERTY() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_0=null;


        	enterRule();

        try {
            // InternalXSS.g:1039:2: (this_NAME_0= RULE_NAME )
            // InternalXSS.g:1040:2: this_NAME_0= RULE_NAME
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
    // InternalXSS.g:1050:1: entryRuleVALUE returns [String current=null] : iv_ruleVALUE= ruleVALUE EOF ;
    public final String entryRuleVALUE() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVALUE = null;


        try {
            // InternalXSS.g:1050:45: (iv_ruleVALUE= ruleVALUE EOF )
            // InternalXSS.g:1051:2: iv_ruleVALUE= ruleVALUE EOF
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
    // InternalXSS.g:1057:1: ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_OR_VAL_0= ruleSTRING_OR_VAL ;
    public final AntlrDatatypeRuleToken ruleVALUE() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_STRING_OR_VAL_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:1063:2: (this_STRING_OR_VAL_0= ruleSTRING_OR_VAL )
            // InternalXSS.g:1064:2: this_STRING_OR_VAL_0= ruleSTRING_OR_VAL
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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008042L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000080040L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000080042L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000070L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040040L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x00000000000C0040L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000040070L});

}