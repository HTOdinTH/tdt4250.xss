package tdt4250.xss.ide.contentassist.antlr.internal;

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
import tdt4250.xss.services.XSSGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXSSParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_SEL", "RULE_STRING", "RULE_NAME", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'XSelectors:'", "'sel'", "'('", "')'", "','"
    };
    public static final int RULE_ID=7;
    public static final int RULE_WS=11;
    public static final int RULE_NAME=6;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_SEL=4;
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

    	public void setGrammarAccess(XSSGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleStylesheet"
    // InternalXSS.g:53:1: entryRuleStylesheet : ruleStylesheet EOF ;
    public final void entryRuleStylesheet() throws RecognitionException {
        try {
            // InternalXSS.g:54:1: ( ruleStylesheet EOF )
            // InternalXSS.g:55:1: ruleStylesheet EOF
            {
             before(grammarAccess.getStylesheetRule()); 
            pushFollow(FOLLOW_1);
            ruleStylesheet();

            state._fsp--;

             after(grammarAccess.getStylesheetRule()); 
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
    // $ANTLR end "entryRuleStylesheet"


    // $ANTLR start "ruleStylesheet"
    // InternalXSS.g:62:1: ruleStylesheet : ( ( rule__Stylesheet__Group__0 ) ) ;
    public final void ruleStylesheet() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:66:2: ( ( ( rule__Stylesheet__Group__0 ) ) )
            // InternalXSS.g:67:2: ( ( rule__Stylesheet__Group__0 ) )
            {
            // InternalXSS.g:67:2: ( ( rule__Stylesheet__Group__0 ) )
            // InternalXSS.g:68:3: ( rule__Stylesheet__Group__0 )
            {
             before(grammarAccess.getStylesheetAccess().getGroup()); 
            // InternalXSS.g:69:3: ( rule__Stylesheet__Group__0 )
            // InternalXSS.g:69:4: rule__Stylesheet__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStylesheetAccess().getGroup()); 

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
    // $ANTLR end "ruleStylesheet"


    // $ANTLR start "entryRuleGroupSelector"
    // InternalXSS.g:78:1: entryRuleGroupSelector : ruleGroupSelector EOF ;
    public final void entryRuleGroupSelector() throws RecognitionException {
        try {
            // InternalXSS.g:79:1: ( ruleGroupSelector EOF )
            // InternalXSS.g:80:1: ruleGroupSelector EOF
            {
             before(grammarAccess.getGroupSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleGroupSelector();

            state._fsp--;

             after(grammarAccess.getGroupSelectorRule()); 
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
    // $ANTLR end "entryRuleGroupSelector"


    // $ANTLR start "ruleGroupSelector"
    // InternalXSS.g:87:1: ruleGroupSelector : ( ( rule__GroupSelector__Group__0 ) ) ;
    public final void ruleGroupSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:91:2: ( ( ( rule__GroupSelector__Group__0 ) ) )
            // InternalXSS.g:92:2: ( ( rule__GroupSelector__Group__0 ) )
            {
            // InternalXSS.g:92:2: ( ( rule__GroupSelector__Group__0 ) )
            // InternalXSS.g:93:3: ( rule__GroupSelector__Group__0 )
            {
             before(grammarAccess.getGroupSelectorAccess().getGroup()); 
            // InternalXSS.g:94:3: ( rule__GroupSelector__Group__0 )
            // InternalXSS.g:94:4: rule__GroupSelector__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupSelectorAccess().getGroup()); 

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
    // $ANTLR end "ruleGroupSelector"


    // $ANTLR start "entryRuleSelector"
    // InternalXSS.g:103:1: entryRuleSelector : ruleSelector EOF ;
    public final void entryRuleSelector() throws RecognitionException {
        try {
            // InternalXSS.g:104:1: ( ruleSelector EOF )
            // InternalXSS.g:105:1: ruleSelector EOF
            {
             before(grammarAccess.getSelectorRule()); 
            pushFollow(FOLLOW_1);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getSelectorRule()); 
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
    // $ANTLR end "entryRuleSelector"


    // $ANTLR start "ruleSelector"
    // InternalXSS.g:112:1: ruleSelector : ( ( ( rule__Selector__NamesAssignment ) ) ( ( rule__Selector__NamesAssignment )* ) ) ;
    public final void ruleSelector() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:116:2: ( ( ( ( rule__Selector__NamesAssignment ) ) ( ( rule__Selector__NamesAssignment )* ) ) )
            // InternalXSS.g:117:2: ( ( ( rule__Selector__NamesAssignment ) ) ( ( rule__Selector__NamesAssignment )* ) )
            {
            // InternalXSS.g:117:2: ( ( ( rule__Selector__NamesAssignment ) ) ( ( rule__Selector__NamesAssignment )* ) )
            // InternalXSS.g:118:3: ( ( rule__Selector__NamesAssignment ) ) ( ( rule__Selector__NamesAssignment )* )
            {
            // InternalXSS.g:118:3: ( ( rule__Selector__NamesAssignment ) )
            // InternalXSS.g:119:4: ( rule__Selector__NamesAssignment )
            {
             before(grammarAccess.getSelectorAccess().getNamesAssignment()); 
            // InternalXSS.g:120:4: ( rule__Selector__NamesAssignment )
            // InternalXSS.g:120:5: rule__Selector__NamesAssignment
            {
            pushFollow(FOLLOW_3);
            rule__Selector__NamesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNamesAssignment()); 

            }

            // InternalXSS.g:123:3: ( ( rule__Selector__NamesAssignment )* )
            // InternalXSS.g:124:4: ( rule__Selector__NamesAssignment )*
            {
             before(grammarAccess.getSelectorAccess().getNamesAssignment()); 
            // InternalXSS.g:125:4: ( rule__Selector__NamesAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_SEL && LA1_0<=RULE_STRING)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXSS.g:125:5: rule__Selector__NamesAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__Selector__NamesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getSelectorAccess().getNamesAssignment()); 

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
    // $ANTLR end "ruleSelector"


    // $ANTLR start "rule__Selector__NamesAlternatives_0"
    // InternalXSS.g:134:1: rule__Selector__NamesAlternatives_0 : ( ( RULE_SEL ) | ( RULE_STRING ) );
    public final void rule__Selector__NamesAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:138:1: ( ( RULE_SEL ) | ( RULE_STRING ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_SEL) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_STRING) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalXSS.g:139:2: ( RULE_SEL )
                    {
                    // InternalXSS.g:139:2: ( RULE_SEL )
                    // InternalXSS.g:140:3: RULE_SEL
                    {
                     before(grammarAccess.getSelectorAccess().getNamesSELTerminalRuleCall_0_0()); 
                    match(input,RULE_SEL,FOLLOW_2); 
                     after(grammarAccess.getSelectorAccess().getNamesSELTerminalRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalXSS.g:145:2: ( RULE_STRING )
                    {
                    // InternalXSS.g:145:2: ( RULE_STRING )
                    // InternalXSS.g:146:3: RULE_STRING
                    {
                     before(grammarAccess.getSelectorAccess().getNamesSTRINGTerminalRuleCall_0_1()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getSelectorAccess().getNamesSTRINGTerminalRuleCall_0_1()); 

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
    // $ANTLR end "rule__Selector__NamesAlternatives_0"


    // $ANTLR start "rule__Stylesheet__Group__0"
    // InternalXSS.g:155:1: rule__Stylesheet__Group__0 : rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 ;
    public final void rule__Stylesheet__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:159:1: ( rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1 )
            // InternalXSS.g:160:2: rule__Stylesheet__Group__0__Impl rule__Stylesheet__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Stylesheet__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__1();

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
    // $ANTLR end "rule__Stylesheet__Group__0"


    // $ANTLR start "rule__Stylesheet__Group__0__Impl"
    // InternalXSS.g:167:1: rule__Stylesheet__Group__0__Impl : ( 'XSelectors:' ) ;
    public final void rule__Stylesheet__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:171:1: ( ( 'XSelectors:' ) )
            // InternalXSS.g:172:1: ( 'XSelectors:' )
            {
            // InternalXSS.g:172:1: ( 'XSelectors:' )
            // InternalXSS.g:173:2: 'XSelectors:'
            {
             before(grammarAccess.getStylesheetAccess().getXSelectorsKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getStylesheetAccess().getXSelectorsKeyword_0()); 

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
    // $ANTLR end "rule__Stylesheet__Group__0__Impl"


    // $ANTLR start "rule__Stylesheet__Group__1"
    // InternalXSS.g:182:1: rule__Stylesheet__Group__1 : rule__Stylesheet__Group__1__Impl ;
    public final void rule__Stylesheet__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:186:1: ( rule__Stylesheet__Group__1__Impl )
            // InternalXSS.g:187:2: rule__Stylesheet__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Stylesheet__Group__1__Impl();

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
    // $ANTLR end "rule__Stylesheet__Group__1"


    // $ANTLR start "rule__Stylesheet__Group__1__Impl"
    // InternalXSS.g:193:1: rule__Stylesheet__Group__1__Impl : ( ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) ) ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* ) ) ;
    public final void rule__Stylesheet__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:197:1: ( ( ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) ) ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* ) ) )
            // InternalXSS.g:198:1: ( ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) ) ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* ) )
            {
            // InternalXSS.g:198:1: ( ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) ) ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* ) )
            // InternalXSS.g:199:2: ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) ) ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* )
            {
            // InternalXSS.g:199:2: ( ( rule__Stylesheet__CustomSelectorsAssignment_1 ) )
            // InternalXSS.g:200:3: ( rule__Stylesheet__CustomSelectorsAssignment_1 )
            {
             before(grammarAccess.getStylesheetAccess().getCustomSelectorsAssignment_1()); 
            // InternalXSS.g:201:3: ( rule__Stylesheet__CustomSelectorsAssignment_1 )
            // InternalXSS.g:201:4: rule__Stylesheet__CustomSelectorsAssignment_1
            {
            pushFollow(FOLLOW_5);
            rule__Stylesheet__CustomSelectorsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getStylesheetAccess().getCustomSelectorsAssignment_1()); 

            }

            // InternalXSS.g:204:2: ( ( rule__Stylesheet__CustomSelectorsAssignment_1 )* )
            // InternalXSS.g:205:3: ( rule__Stylesheet__CustomSelectorsAssignment_1 )*
            {
             before(grammarAccess.getStylesheetAccess().getCustomSelectorsAssignment_1()); 
            // InternalXSS.g:206:3: ( rule__Stylesheet__CustomSelectorsAssignment_1 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalXSS.g:206:4: rule__Stylesheet__CustomSelectorsAssignment_1
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Stylesheet__CustomSelectorsAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getStylesheetAccess().getCustomSelectorsAssignment_1()); 

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
    // $ANTLR end "rule__Stylesheet__Group__1__Impl"


    // $ANTLR start "rule__GroupSelector__Group__0"
    // InternalXSS.g:216:1: rule__GroupSelector__Group__0 : rule__GroupSelector__Group__0__Impl rule__GroupSelector__Group__1 ;
    public final void rule__GroupSelector__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:220:1: ( rule__GroupSelector__Group__0__Impl rule__GroupSelector__Group__1 )
            // InternalXSS.g:221:2: rule__GroupSelector__Group__0__Impl rule__GroupSelector__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__GroupSelector__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__1();

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
    // $ANTLR end "rule__GroupSelector__Group__0"


    // $ANTLR start "rule__GroupSelector__Group__0__Impl"
    // InternalXSS.g:228:1: rule__GroupSelector__Group__0__Impl : ( 'sel' ) ;
    public final void rule__GroupSelector__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:232:1: ( ( 'sel' ) )
            // InternalXSS.g:233:1: ( 'sel' )
            {
            // InternalXSS.g:233:1: ( 'sel' )
            // InternalXSS.g:234:2: 'sel'
            {
             before(grammarAccess.getGroupSelectorAccess().getSelKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getGroupSelectorAccess().getSelKeyword_0()); 

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
    // $ANTLR end "rule__GroupSelector__Group__0__Impl"


    // $ANTLR start "rule__GroupSelector__Group__1"
    // InternalXSS.g:243:1: rule__GroupSelector__Group__1 : rule__GroupSelector__Group__1__Impl rule__GroupSelector__Group__2 ;
    public final void rule__GroupSelector__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:247:1: ( rule__GroupSelector__Group__1__Impl rule__GroupSelector__Group__2 )
            // InternalXSS.g:248:2: rule__GroupSelector__Group__1__Impl rule__GroupSelector__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__GroupSelector__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__2();

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
    // $ANTLR end "rule__GroupSelector__Group__1"


    // $ANTLR start "rule__GroupSelector__Group__1__Impl"
    // InternalXSS.g:255:1: rule__GroupSelector__Group__1__Impl : ( ( rule__GroupSelector__NameAssignment_1 ) ) ;
    public final void rule__GroupSelector__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:259:1: ( ( ( rule__GroupSelector__NameAssignment_1 ) ) )
            // InternalXSS.g:260:1: ( ( rule__GroupSelector__NameAssignment_1 ) )
            {
            // InternalXSS.g:260:1: ( ( rule__GroupSelector__NameAssignment_1 ) )
            // InternalXSS.g:261:2: ( rule__GroupSelector__NameAssignment_1 )
            {
             before(grammarAccess.getGroupSelectorAccess().getNameAssignment_1()); 
            // InternalXSS.g:262:2: ( rule__GroupSelector__NameAssignment_1 )
            // InternalXSS.g:262:3: rule__GroupSelector__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupSelectorAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__GroupSelector__Group__1__Impl"


    // $ANTLR start "rule__GroupSelector__Group__2"
    // InternalXSS.g:270:1: rule__GroupSelector__Group__2 : rule__GroupSelector__Group__2__Impl rule__GroupSelector__Group__3 ;
    public final void rule__GroupSelector__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:274:1: ( rule__GroupSelector__Group__2__Impl rule__GroupSelector__Group__3 )
            // InternalXSS.g:275:2: rule__GroupSelector__Group__2__Impl rule__GroupSelector__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__GroupSelector__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__3();

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
    // $ANTLR end "rule__GroupSelector__Group__2"


    // $ANTLR start "rule__GroupSelector__Group__2__Impl"
    // InternalXSS.g:282:1: rule__GroupSelector__Group__2__Impl : ( '(' ) ;
    public final void rule__GroupSelector__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:286:1: ( ( '(' ) )
            // InternalXSS.g:287:1: ( '(' )
            {
            // InternalXSS.g:287:1: ( '(' )
            // InternalXSS.g:288:2: '('
            {
             before(grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_2()); 

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
    // $ANTLR end "rule__GroupSelector__Group__2__Impl"


    // $ANTLR start "rule__GroupSelector__Group__3"
    // InternalXSS.g:297:1: rule__GroupSelector__Group__3 : rule__GroupSelector__Group__3__Impl rule__GroupSelector__Group__4 ;
    public final void rule__GroupSelector__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:301:1: ( rule__GroupSelector__Group__3__Impl rule__GroupSelector__Group__4 )
            // InternalXSS.g:302:2: rule__GroupSelector__Group__3__Impl rule__GroupSelector__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__GroupSelector__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__4();

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
    // $ANTLR end "rule__GroupSelector__Group__3"


    // $ANTLR start "rule__GroupSelector__Group__3__Impl"
    // InternalXSS.g:309:1: rule__GroupSelector__Group__3__Impl : ( ( rule__GroupSelector__SubSelectorsAssignment_3 ) ) ;
    public final void rule__GroupSelector__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:313:1: ( ( ( rule__GroupSelector__SubSelectorsAssignment_3 ) ) )
            // InternalXSS.g:314:1: ( ( rule__GroupSelector__SubSelectorsAssignment_3 ) )
            {
            // InternalXSS.g:314:1: ( ( rule__GroupSelector__SubSelectorsAssignment_3 ) )
            // InternalXSS.g:315:2: ( rule__GroupSelector__SubSelectorsAssignment_3 )
            {
             before(grammarAccess.getGroupSelectorAccess().getSubSelectorsAssignment_3()); 
            // InternalXSS.g:316:2: ( rule__GroupSelector__SubSelectorsAssignment_3 )
            // InternalXSS.g:316:3: rule__GroupSelector__SubSelectorsAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__SubSelectorsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getGroupSelectorAccess().getSubSelectorsAssignment_3()); 

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
    // $ANTLR end "rule__GroupSelector__Group__3__Impl"


    // $ANTLR start "rule__GroupSelector__Group__4"
    // InternalXSS.g:324:1: rule__GroupSelector__Group__4 : rule__GroupSelector__Group__4__Impl rule__GroupSelector__Group__5 ;
    public final void rule__GroupSelector__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:328:1: ( rule__GroupSelector__Group__4__Impl rule__GroupSelector__Group__5 )
            // InternalXSS.g:329:2: rule__GroupSelector__Group__4__Impl rule__GroupSelector__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__GroupSelector__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__5();

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
    // $ANTLR end "rule__GroupSelector__Group__4"


    // $ANTLR start "rule__GroupSelector__Group__4__Impl"
    // InternalXSS.g:336:1: rule__GroupSelector__Group__4__Impl : ( ( rule__GroupSelector__Group_4__0 )* ) ;
    public final void rule__GroupSelector__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:340:1: ( ( ( rule__GroupSelector__Group_4__0 )* ) )
            // InternalXSS.g:341:1: ( ( rule__GroupSelector__Group_4__0 )* )
            {
            // InternalXSS.g:341:1: ( ( rule__GroupSelector__Group_4__0 )* )
            // InternalXSS.g:342:2: ( rule__GroupSelector__Group_4__0 )*
            {
             before(grammarAccess.getGroupSelectorAccess().getGroup_4()); 
            // InternalXSS.g:343:2: ( rule__GroupSelector__Group_4__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalXSS.g:343:3: rule__GroupSelector__Group_4__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__GroupSelector__Group_4__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getGroupSelectorAccess().getGroup_4()); 

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
    // $ANTLR end "rule__GroupSelector__Group__4__Impl"


    // $ANTLR start "rule__GroupSelector__Group__5"
    // InternalXSS.g:351:1: rule__GroupSelector__Group__5 : rule__GroupSelector__Group__5__Impl ;
    public final void rule__GroupSelector__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:355:1: ( rule__GroupSelector__Group__5__Impl )
            // InternalXSS.g:356:2: rule__GroupSelector__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group__5__Impl();

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
    // $ANTLR end "rule__GroupSelector__Group__5"


    // $ANTLR start "rule__GroupSelector__Group__5__Impl"
    // InternalXSS.g:362:1: rule__GroupSelector__Group__5__Impl : ( ')' ) ;
    public final void rule__GroupSelector__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:366:1: ( ( ')' ) )
            // InternalXSS.g:367:1: ( ')' )
            {
            // InternalXSS.g:367:1: ( ')' )
            // InternalXSS.g:368:2: ')'
            {
             before(grammarAccess.getGroupSelectorAccess().getRightParenthesisKeyword_5()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getGroupSelectorAccess().getRightParenthesisKeyword_5()); 

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
    // $ANTLR end "rule__GroupSelector__Group__5__Impl"


    // $ANTLR start "rule__GroupSelector__Group_4__0"
    // InternalXSS.g:378:1: rule__GroupSelector__Group_4__0 : rule__GroupSelector__Group_4__0__Impl rule__GroupSelector__Group_4__1 ;
    public final void rule__GroupSelector__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:382:1: ( rule__GroupSelector__Group_4__0__Impl rule__GroupSelector__Group_4__1 )
            // InternalXSS.g:383:2: rule__GroupSelector__Group_4__0__Impl rule__GroupSelector__Group_4__1
            {
            pushFollow(FOLLOW_8);
            rule__GroupSelector__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group_4__1();

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
    // $ANTLR end "rule__GroupSelector__Group_4__0"


    // $ANTLR start "rule__GroupSelector__Group_4__0__Impl"
    // InternalXSS.g:390:1: rule__GroupSelector__Group_4__0__Impl : ( ',' ) ;
    public final void rule__GroupSelector__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:394:1: ( ( ',' ) )
            // InternalXSS.g:395:1: ( ',' )
            {
            // InternalXSS.g:395:1: ( ',' )
            // InternalXSS.g:396:2: ','
            {
             before(grammarAccess.getGroupSelectorAccess().getCommaKeyword_4_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getGroupSelectorAccess().getCommaKeyword_4_0()); 

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
    // $ANTLR end "rule__GroupSelector__Group_4__0__Impl"


    // $ANTLR start "rule__GroupSelector__Group_4__1"
    // InternalXSS.g:405:1: rule__GroupSelector__Group_4__1 : rule__GroupSelector__Group_4__1__Impl ;
    public final void rule__GroupSelector__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:409:1: ( rule__GroupSelector__Group_4__1__Impl )
            // InternalXSS.g:410:2: rule__GroupSelector__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__Group_4__1__Impl();

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
    // $ANTLR end "rule__GroupSelector__Group_4__1"


    // $ANTLR start "rule__GroupSelector__Group_4__1__Impl"
    // InternalXSS.g:416:1: rule__GroupSelector__Group_4__1__Impl : ( ( rule__GroupSelector__SubSelectorsAssignment_4_1 ) ) ;
    public final void rule__GroupSelector__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:420:1: ( ( ( rule__GroupSelector__SubSelectorsAssignment_4_1 ) ) )
            // InternalXSS.g:421:1: ( ( rule__GroupSelector__SubSelectorsAssignment_4_1 ) )
            {
            // InternalXSS.g:421:1: ( ( rule__GroupSelector__SubSelectorsAssignment_4_1 ) )
            // InternalXSS.g:422:2: ( rule__GroupSelector__SubSelectorsAssignment_4_1 )
            {
             before(grammarAccess.getGroupSelectorAccess().getSubSelectorsAssignment_4_1()); 
            // InternalXSS.g:423:2: ( rule__GroupSelector__SubSelectorsAssignment_4_1 )
            // InternalXSS.g:423:3: rule__GroupSelector__SubSelectorsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__GroupSelector__SubSelectorsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupSelectorAccess().getSubSelectorsAssignment_4_1()); 

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
    // $ANTLR end "rule__GroupSelector__Group_4__1__Impl"


    // $ANTLR start "rule__Stylesheet__CustomSelectorsAssignment_1"
    // InternalXSS.g:432:1: rule__Stylesheet__CustomSelectorsAssignment_1 : ( ruleGroupSelector ) ;
    public final void rule__Stylesheet__CustomSelectorsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:436:1: ( ( ruleGroupSelector ) )
            // InternalXSS.g:437:2: ( ruleGroupSelector )
            {
            // InternalXSS.g:437:2: ( ruleGroupSelector )
            // InternalXSS.g:438:3: ruleGroupSelector
            {
             before(grammarAccess.getStylesheetAccess().getCustomSelectorsGroupSelectorParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleGroupSelector();

            state._fsp--;

             after(grammarAccess.getStylesheetAccess().getCustomSelectorsGroupSelectorParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Stylesheet__CustomSelectorsAssignment_1"


    // $ANTLR start "rule__GroupSelector__NameAssignment_1"
    // InternalXSS.g:447:1: rule__GroupSelector__NameAssignment_1 : ( RULE_NAME ) ;
    public final void rule__GroupSelector__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:451:1: ( ( RULE_NAME ) )
            // InternalXSS.g:452:2: ( RULE_NAME )
            {
            // InternalXSS.g:452:2: ( RULE_NAME )
            // InternalXSS.g:453:3: RULE_NAME
            {
             before(grammarAccess.getGroupSelectorAccess().getNameNAMETerminalRuleCall_1_0()); 
            match(input,RULE_NAME,FOLLOW_2); 
             after(grammarAccess.getGroupSelectorAccess().getNameNAMETerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__GroupSelector__NameAssignment_1"


    // $ANTLR start "rule__GroupSelector__SubSelectorsAssignment_3"
    // InternalXSS.g:462:1: rule__GroupSelector__SubSelectorsAssignment_3 : ( ruleSelector ) ;
    public final void rule__GroupSelector__SubSelectorsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:466:1: ( ( ruleSelector ) )
            // InternalXSS.g:467:2: ( ruleSelector )
            {
            // InternalXSS.g:467:2: ( ruleSelector )
            // InternalXSS.g:468:3: ruleSelector
            {
             before(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__GroupSelector__SubSelectorsAssignment_3"


    // $ANTLR start "rule__GroupSelector__SubSelectorsAssignment_4_1"
    // InternalXSS.g:477:1: rule__GroupSelector__SubSelectorsAssignment_4_1 : ( ruleSelector ) ;
    public final void rule__GroupSelector__SubSelectorsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:481:1: ( ( ruleSelector ) )
            // InternalXSS.g:482:2: ( ruleSelector )
            {
            // InternalXSS.g:482:2: ( ruleSelector )
            // InternalXSS.g:483:3: ruleSelector
            {
             before(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSelector();

            state._fsp--;

             after(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__GroupSelector__SubSelectorsAssignment_4_1"


    // $ANTLR start "rule__Selector__NamesAssignment"
    // InternalXSS.g:492:1: rule__Selector__NamesAssignment : ( ( rule__Selector__NamesAlternatives_0 ) ) ;
    public final void rule__Selector__NamesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalXSS.g:496:1: ( ( ( rule__Selector__NamesAlternatives_0 ) ) )
            // InternalXSS.g:497:2: ( ( rule__Selector__NamesAlternatives_0 ) )
            {
            // InternalXSS.g:497:2: ( ( rule__Selector__NamesAlternatives_0 ) )
            // InternalXSS.g:498:3: ( rule__Selector__NamesAlternatives_0 )
            {
             before(grammarAccess.getSelectorAccess().getNamesAlternatives_0()); 
            // InternalXSS.g:499:3: ( rule__Selector__NamesAlternatives_0 )
            // InternalXSS.g:499:4: rule__Selector__NamesAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__Selector__NamesAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getSelectorAccess().getNamesAlternatives_0()); 

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
    // $ANTLR end "rule__Selector__NamesAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020002L});

}