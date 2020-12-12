package tdt4250.xss.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalXSSLexer extends Lexer {
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

    public InternalXSSLexer() {;} 
    public InternalXSSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXSSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXSS.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:11:7: ( 'XSelectors:' )
            // InternalXSS.g:11:9: 'XSelectors:'
            {
            match("XSelectors:"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:12:7: ( 'sel' )
            // InternalXSS.g:12:9: 'sel'
            {
            match("sel"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:13:7: ( '(' )
            // InternalXSS.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:14:7: ( ')' )
            // InternalXSS.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:15:7: ( ',' )
            // InternalXSS.g:15:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:507:11: ( ( RULE_ID | '-' )+ )
            // InternalXSS.g:507:13: ( RULE_ID | '-' )+
            {
            // InternalXSS.g:507:13: ( RULE_ID | '-' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='^' && LA1_0<='_')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }
                else if ( (LA1_0=='-') ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalXSS.g:507:14: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalXSS.g:507:22: '-'
            	    {
            	    match('-'); 

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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME"

    // $ANTLR start "RULE_SEL"
    public final void mRULE_SEL() throws RecognitionException {
        try {
            int _type = RULE_SEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:509:10: ( ( '::' | ':' | '.' | '#' )? RULE_NAME ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )* )
            // InternalXSS.g:509:12: ( '::' | ':' | '.' | '#' )? RULE_NAME ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )*
            {
            // InternalXSS.g:509:12: ( '::' | ':' | '.' | '#' )?
            int alt2=5;
            switch ( input.LA(1) ) {
                case ':':
                    {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==':') ) {
                        alt2=1;
                    }
                    else if ( (LA2_1=='-'||(LA2_1>='A' && LA2_1<='Z')||(LA2_1>='^' && LA2_1<='_')||(LA2_1>='a' && LA2_1<='z')) ) {
                        alt2=2;
                    }
                    }
                    break;
                case '.':
                    {
                    alt2=3;
                    }
                    break;
                case '#':
                    {
                    alt2=4;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // InternalXSS.g:509:13: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 2 :
                    // InternalXSS.g:509:18: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 3 :
                    // InternalXSS.g:509:22: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 4 :
                    // InternalXSS.g:509:26: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            mRULE_NAME(); 
            // InternalXSS.g:509:42: ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='#'||LA6_0=='+'||LA6_0=='.'||LA6_0==':'||LA6_0=='>'||LA6_0=='~') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXSS.g:509:43: ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME
            	    {
            	    // InternalXSS.g:509:43: ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) )
            	    int alt5=3;
            	    int LA5_0 = input.LA(1);

            	    if ( (LA5_0=='+'||LA5_0=='>'||LA5_0=='~') ) {
            	        int LA5_1 = input.LA(2);

            	        if ( (LA5_1=='-'||(LA5_1>='A' && LA5_1<='Z')||(LA5_1>='^' && LA5_1<='_')||(LA5_1>='a' && LA5_1<='z')) ) {
            	            alt5=1;
            	        }
            	        else if ( (LA5_1=='#'||LA5_1=='.'||LA5_1==':') ) {
            	            alt5=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 5, 1, input);

            	            throw nvae;
            	        }
            	    }
            	    else if ( (LA5_0=='#'||LA5_0=='.'||LA5_0==':') ) {
            	        alt5=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 5, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt5) {
            	        case 1 :
            	            // InternalXSS.g:509:44: ( '>' | '+' | '~' )
            	            {
            	            if ( input.LA(1)=='+'||input.LA(1)=='>'||input.LA(1)=='~' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}


            	            }
            	            break;
            	        case 2 :
            	            // InternalXSS.g:509:58: ( '::' | ':' | '.' | '#' )
            	            {
            	            // InternalXSS.g:509:58: ( '::' | ':' | '.' | '#' )
            	            int alt3=4;
            	            switch ( input.LA(1) ) {
            	            case ':':
            	                {
            	                int LA3_1 = input.LA(2);

            	                if ( (LA3_1==':') ) {
            	                    alt3=1;
            	                }
            	                else if ( (LA3_1=='-'||(LA3_1>='A' && LA3_1<='Z')||(LA3_1>='^' && LA3_1<='_')||(LA3_1>='a' && LA3_1<='z')) ) {
            	                    alt3=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 3, 1, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case '.':
            	                {
            	                alt3=3;
            	                }
            	                break;
            	            case '#':
            	                {
            	                alt3=4;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 3, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt3) {
            	                case 1 :
            	                    // InternalXSS.g:509:59: '::'
            	                    {
            	                    match("::"); 


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalXSS.g:509:64: ':'
            	                    {
            	                    match(':'); 

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalXSS.g:509:68: '.'
            	                    {
            	                    match('.'); 

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalXSS.g:509:72: '#'
            	                    {
            	                    match('#'); 

            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalXSS.g:509:77: ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' )
            	            {
            	            if ( input.LA(1)=='+'||input.LA(1)=='>'||input.LA(1)=='~' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}

            	            // InternalXSS.g:509:91: ( '::' | ':' | '.' | '#' )
            	            int alt4=4;
            	            switch ( input.LA(1) ) {
            	            case ':':
            	                {
            	                int LA4_1 = input.LA(2);

            	                if ( (LA4_1==':') ) {
            	                    alt4=1;
            	                }
            	                else if ( (LA4_1=='-'||(LA4_1>='A' && LA4_1<='Z')||(LA4_1>='^' && LA4_1<='_')||(LA4_1>='a' && LA4_1<='z')) ) {
            	                    alt4=2;
            	                }
            	                else {
            	                    NoViableAltException nvae =
            	                        new NoViableAltException("", 4, 1, input);

            	                    throw nvae;
            	                }
            	                }
            	                break;
            	            case '.':
            	                {
            	                alt4=3;
            	                }
            	                break;
            	            case '#':
            	                {
            	                alt4=4;
            	                }
            	                break;
            	            default:
            	                NoViableAltException nvae =
            	                    new NoViableAltException("", 4, 0, input);

            	                throw nvae;
            	            }

            	            switch (alt4) {
            	                case 1 :
            	                    // InternalXSS.g:509:92: '::'
            	                    {
            	                    match("::"); 


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalXSS.g:509:97: ':'
            	                    {
            	                    match(':'); 

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalXSS.g:509:101: '.'
            	                    {
            	                    match('.'); 

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalXSS.g:509:105: '#'
            	                    {
            	                    match('#'); 

            	                    }
            	                    break;

            	            }


            	            }
            	            break;

            	    }

            	    mRULE_NAME(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SEL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalXSS.g:511:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXSS.g:511:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXSS.g:511:20: ( '^' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='^') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalXSS.g:511:20: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalXSS.g:511:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')||(LA8_0>='A' && LA8_0<='Z')||LA8_0=='_'||(LA8_0>='a' && LA8_0<='z')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalXSS.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:513:10: ( ( '0' .. '9' )+ )
            // InternalXSS.g:513:12: ( '0' .. '9' )+
            {
            // InternalXSS.g:513:12: ( '0' .. '9' )+
            int cnt9=0;
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalXSS.g:513:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:515:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXSS.g:515:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXSS.g:515:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\"') ) {
                alt12=1;
            }
            else if ( (LA12_0=='\'') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // InternalXSS.g:515:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXSS.g:515:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop10:
                    do {
                        int alt10=3;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0=='\\') ) {
                            alt10=1;
                        }
                        else if ( ((LA10_0>='\u0000' && LA10_0<='!')||(LA10_0>='#' && LA10_0<='[')||(LA10_0>=']' && LA10_0<='\uFFFF')) ) {
                            alt10=2;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // InternalXSS.g:515:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXSS.g:515:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXSS.g:515:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXSS.g:515:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='&')||(LA11_0>='(' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXSS.g:515:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXSS.g:515:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:517:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXSS.g:517:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXSS.g:517:24: ( options {greedy=false; } : . )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0=='*') ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1=='/') ) {
                        alt13=2;
                    }
                    else if ( ((LA13_1>='\u0000' && LA13_1<='.')||(LA13_1>='0' && LA13_1<='\uFFFF')) ) {
                        alt13=1;
                    }


                }
                else if ( ((LA13_0>='\u0000' && LA13_0<=')')||(LA13_0>='+' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalXSS.g:517:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:519:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXSS.g:519:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXSS.g:519:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='\u0000' && LA14_0<='\t')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXSS.g:519:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            // InternalXSS.g:519:40: ( ( '\\r' )? '\\n' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='\n'||LA16_0=='\r') ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalXSS.g:519:41: ( '\\r' )? '\\n'
                    {
                    // InternalXSS.g:519:41: ( '\\r' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0=='\r') ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // InternalXSS.g:519:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:521:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXSS.g:521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXSS.g:521:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt17=0;
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalXSS.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:523:16: ( . )
            // InternalXSS.g:523:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalXSS.g:1:8: ( T__13 | T__14 | T__15 | T__16 | T__17 | RULE_NAME | RULE_SEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt18=13;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // InternalXSS.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // InternalXSS.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // InternalXSS.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // InternalXSS.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // InternalXSS.g:1:34: T__17
                {
                mT__17(); 

                }
                break;
            case 6 :
                // InternalXSS.g:1:40: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 7 :
                // InternalXSS.g:1:50: RULE_SEL
                {
                mRULE_SEL(); 

                }
                break;
            case 8 :
                // InternalXSS.g:1:59: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // InternalXSS.g:1:68: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // InternalXSS.g:1:80: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // InternalXSS.g:1:96: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // InternalXSS.g:1:112: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // InternalXSS.g:1:120: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA18_eotS =
        "\1\uffff\2\24\3\uffff\1\21\2\24\3\21\1\uffff\3\21\2\uffff\2\24\3\uffff\3\24\3\uffff\1\24\5\uffff\1\24\1\46\1\24\1\uffff\6\24\1\56\1\uffff";
    static final String DFA18_eofS =
        "\57\uffff";
    static final String DFA18_minS =
        "\1\0\2\43\3\uffff\1\101\2\43\3\55\1\uffff\2\0\1\52\2\uffff\2\43\2\uffff\1\101\3\43\3\uffff\1\43\5\uffff\3\43\1\uffff\6\43\1\55\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\2\176\3\uffff\1\172\2\176\3\172\1\uffff\2\uffff\1\57\2\uffff\2\176\2\uffff\1\172\3\176\3\uffff\1\176\5\uffff\3\176\1\uffff\6\176\1\172\1\uffff";
    static final String DFA18_acceptS =
        "\3\uffff\1\3\1\4\1\5\6\uffff\1\10\3\uffff\1\14\1\15\2\uffff\1\6\1\7\4\uffff\1\3\1\4\1\5\1\uffff\1\10\1\11\1\12\1\13\1\14\3\uffff\1\2\7\uffff\1\1";
    static final String DFA18_specialS =
        "\1\1\14\uffff\1\2\1\0\40\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\21\2\20\2\21\1\20\22\21\1\20\1\21\1\15\1\13\3\21\1\16\1\3\1\4\2\21\1\5\1\10\1\12\1\17\12\14\1\11\6\21\27\7\1\1\2\7\3\21\1\6\1\7\1\21\22\7\1\2\7\7\uff85\21",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\22\23\1\22\7\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\4\23\1\31\25\23\3\uffff\1\25",
            "",
            "",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\13\uffff\1\25\3\uffff\1\25\2\uffff\32\35\3\uffff\1\26\1\35\1\uffff\32\35\3\uffff\1\25",
            "\1\25\14\uffff\1\25\6\uffff\32\25\3\uffff\2\25\1\uffff\32\25",
            "\1\25\23\uffff\32\25\3\uffff\2\25\1\uffff\32\25",
            "\1\25\23\uffff\32\25\3\uffff\2\25\1\uffff\32\25",
            "",
            "\0\37",
            "\0\37",
            "\1\40\4\uffff\1\41",
            "",
            "",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\4\23\1\43\25\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "",
            "",
            "\32\35\4\uffff\1\35\1\uffff\32\35",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\13\uffff\1\25\3\uffff\1\25\2\uffff\32\35\3\uffff\1\26\1\35\1\uffff\32\35\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\13\23\1\44\16\23\3\uffff\1\25",
            "",
            "",
            "",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "",
            "",
            "",
            "",
            "",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\13\23\1\45\16\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\4\23\1\47\25\23\3\uffff\1\25",
            "",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\2\23\1\50\27\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\23\23\1\51\6\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\16\23\1\52\13\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\21\23\1\53\10\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\25\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\22\23\1\54\7\23\3\uffff\1\25",
            "\1\25\7\uffff\1\25\1\uffff\1\30\1\25\1\uffff\12\27\1\55\3\uffff\1\25\2\uffff\32\23\3\uffff\1\26\1\23\1\uffff\32\23\3\uffff\1\25",
            "\1\25\14\uffff\1\25\6\uffff\32\25\3\uffff\2\25\1\uffff\32\25",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | T__17 | RULE_NAME | RULE_SEL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_14 = input.LA(1);

                        s = -1;
                        if ( ((LA18_14>='\u0000' && LA18_14<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='X') ) {s = 1;}

                        else if ( (LA18_0=='s') ) {s = 2;}

                        else if ( (LA18_0=='(') ) {s = 3;}

                        else if ( (LA18_0==')') ) {s = 4;}

                        else if ( (LA18_0==',') ) {s = 5;}

                        else if ( (LA18_0=='^') ) {s = 6;}

                        else if ( ((LA18_0>='A' && LA18_0<='W')||(LA18_0>='Y' && LA18_0<='Z')||LA18_0=='_'||(LA18_0>='a' && LA18_0<='r')||(LA18_0>='t' && LA18_0<='z')) ) {s = 7;}

                        else if ( (LA18_0=='-') ) {s = 8;}

                        else if ( (LA18_0==':') ) {s = 9;}

                        else if ( (LA18_0=='.') ) {s = 10;}

                        else if ( (LA18_0=='#') ) {s = 11;}

                        else if ( ((LA18_0>='0' && LA18_0<='9')) ) {s = 12;}

                        else if ( (LA18_0=='\"') ) {s = 13;}

                        else if ( (LA18_0=='\'') ) {s = 14;}

                        else if ( (LA18_0=='/') ) {s = 15;}

                        else if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {s = 16;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||(LA18_0>='\u000B' && LA18_0<='\f')||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||(LA18_0>='$' && LA18_0<='&')||(LA18_0>='*' && LA18_0<='+')||(LA18_0>=';' && LA18_0<='@')||(LA18_0>='[' && LA18_0<=']')||LA18_0=='`'||(LA18_0>='{' && LA18_0<='\uFFFF')) ) {s = 17;}

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_13 = input.LA(1);

                        s = -1;
                        if ( ((LA18_13>='\u0000' && LA18_13<='\uFFFF')) ) {s = 31;}

                        else s = 17;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}