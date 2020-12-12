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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME", "RULE_SEL", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XSelectors:'", "'sel'", "'('", "','", "')'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SEL=5;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=8;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

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
    // InternalXSS.g:71:1: ruleStylesheet returns [EObject current=null] : (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleGroupSelector ) )+ ) ;
    public final EObject ruleStylesheet() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_customSelectors_1_0 = null;



        	enterRule();

        try {
            // InternalXSS.g:77:2: ( (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleGroupSelector ) )+ ) )
            // InternalXSS.g:78:2: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleGroupSelector ) )+ )
            {
            // InternalXSS.g:78:2: (otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleGroupSelector ) )+ )
            // InternalXSS.g:79:3: otherlv_0= 'XSelectors:' ( (lv_customSelectors_1_0= ruleGroupSelector ) )+
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getStylesheetAccess().getXSelectorsKeyword_0());
            		
            // InternalXSS.g:83:3: ( (lv_customSelectors_1_0= ruleGroupSelector ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXSS.g:84:4: (lv_customSelectors_1_0= ruleGroupSelector )
            	    {
            	    // InternalXSS.g:84:4: (lv_customSelectors_1_0= ruleGroupSelector )
            	    // InternalXSS.g:85:5: lv_customSelectors_1_0= ruleGroupSelector
            	    {

            	    					newCompositeNode(grammarAccess.getStylesheetAccess().getCustomSelectorsGroupSelectorParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_customSelectors_1_0=ruleGroupSelector();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getStylesheetRule());
            	    					}
            	    					add(
            	    						current,
            	    						"customSelectors",
            	    						lv_customSelectors_1_0,
            	    						"tdt4250.xss.XSS.GroupSelector");
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


    // $ANTLR start "entryRuleGroupSelector"
    // InternalXSS.g:106:1: entryRuleGroupSelector returns [EObject current=null] : iv_ruleGroupSelector= ruleGroupSelector EOF ;
    public final EObject entryRuleGroupSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGroupSelector = null;


        try {
            // InternalXSS.g:106:54: (iv_ruleGroupSelector= ruleGroupSelector EOF )
            // InternalXSS.g:107:2: iv_ruleGroupSelector= ruleGroupSelector EOF
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
    // InternalXSS.g:113:1: ruleGroupSelector returns [EObject current=null] : (otherlv_0= 'sel' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' ) ;
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
            // InternalXSS.g:119:2: ( (otherlv_0= 'sel' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' ) )
            // InternalXSS.g:120:2: (otherlv_0= 'sel' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' )
            {
            // InternalXSS.g:120:2: (otherlv_0= 'sel' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')' )
            // InternalXSS.g:121:3: otherlv_0= 'sel' ( (lv_name_1_0= RULE_NAME ) ) otherlv_2= '(' ( (lv_subSelectors_3_0= ruleSelector ) ) (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )* otherlv_6= ')'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getGroupSelectorAccess().getSelKeyword_0());
            		
            // InternalXSS.g:125:3: ( (lv_name_1_0= RULE_NAME ) )
            // InternalXSS.g:126:4: (lv_name_1_0= RULE_NAME )
            {
            // InternalXSS.g:126:4: (lv_name_1_0= RULE_NAME )
            // InternalXSS.g:127:5: lv_name_1_0= RULE_NAME
            {
            lv_name_1_0=(Token)match(input,RULE_NAME,FOLLOW_6); 

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

            otherlv_2=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_2());
            		
            // InternalXSS.g:147:3: ( (lv_subSelectors_3_0= ruleSelector ) )
            // InternalXSS.g:148:4: (lv_subSelectors_3_0= ruleSelector )
            {
            // InternalXSS.g:148:4: (lv_subSelectors_3_0= ruleSelector )
            // InternalXSS.g:149:5: lv_subSelectors_3_0= ruleSelector
            {

            					newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_8);
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

            // InternalXSS.g:166:3: (otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalXSS.g:167:4: otherlv_4= ',' ( (lv_subSelectors_5_0= ruleSelector ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_7); 

            	    				newLeafNode(otherlv_4, grammarAccess.getGroupSelectorAccess().getCommaKeyword_4_0());
            	    			
            	    // InternalXSS.g:171:4: ( (lv_subSelectors_5_0= ruleSelector ) )
            	    // InternalXSS.g:172:5: (lv_subSelectors_5_0= ruleSelector )
            	    {
            	    // InternalXSS.g:172:5: (lv_subSelectors_5_0= ruleSelector )
            	    // InternalXSS.g:173:6: lv_subSelectors_5_0= ruleSelector
            	    {

            	    						newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_4_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
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
            	    break loop2;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); 

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
    // InternalXSS.g:199:1: entryRuleSelector returns [EObject current=null] : iv_ruleSelector= ruleSelector EOF ;
    public final EObject entryRuleSelector() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSelector = null;


        try {
            // InternalXSS.g:199:49: (iv_ruleSelector= ruleSelector EOF )
            // InternalXSS.g:200:2: iv_ruleSelector= ruleSelector EOF
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
    // InternalXSS.g:206:1: ruleSelector returns [EObject current=null] : ( ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) ) )+ ;
    public final EObject ruleSelector() throws RecognitionException {
        EObject current = null;

        Token lv_names_0_1=null;
        Token lv_names_0_2=null;


        	enterRule();

        try {
            // InternalXSS.g:212:2: ( ( ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) ) )+ )
            // InternalXSS.g:213:2: ( ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) ) )+
            {
            // InternalXSS.g:213:2: ( ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>=RULE_SEL && LA4_0<=RULE_STRING)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXSS.g:214:3: ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) )
            	    {
            	    // InternalXSS.g:214:3: ( (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING ) )
            	    // InternalXSS.g:215:4: (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING )
            	    {
            	    // InternalXSS.g:215:4: (lv_names_0_1= RULE_SEL | lv_names_0_2= RULE_STRING )
            	    int alt3=2;
            	    int LA3_0 = input.LA(1);

            	    if ( (LA3_0==RULE_SEL) ) {
            	        alt3=1;
            	    }
            	    else if ( (LA3_0==RULE_STRING) ) {
            	        alt3=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 3, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt3) {
            	        case 1 :
            	            // InternalXSS.g:216:5: lv_names_0_1= RULE_SEL
            	            {
            	            lv_names_0_1=(Token)match(input,RULE_SEL,FOLLOW_9); 

            	            					newLeafNode(lv_names_0_1, grammarAccess.getSelectorAccess().getNamesSELTerminalRuleCall_0_0());
            	            				

            	            					if (current==null) {
            	            						current = createModelElement(grammarAccess.getSelectorRule());
            	            					}
            	            					addWithLastConsumed(
            	            						current,
            	            						"names",
            	            						lv_names_0_1,
            	            						"tdt4250.xss.XSS.SEL");
            	            				

            	            }
            	            break;
            	        case 2 :
            	            // InternalXSS.g:231:5: lv_names_0_2= RULE_STRING
            	            {
            	            lv_names_0_2=(Token)match(input,RULE_STRING,FOLLOW_9); 

            	            					newLeafNode(lv_names_0_2, grammarAccess.getSelectorAccess().getNamesSTRINGTerminalRuleCall_0_1());
            	            				

            	            					if (current==null) {
            	            						current = createModelElement(grammarAccess.getSelectorRule());
            	            					}
            	            					addWithLastConsumed(
            	            						current,
            	            						"names",
            	            						lv_names_0_2,
            	            						"org.eclipse.xtext.common.Terminals.STRING");
            	            				

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000060L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000000062L});

}