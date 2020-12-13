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
    public static final int RULE_VAL=7;
    public static final int RULE_NAME=4;
    public static final int RULE_STRING=5;
    public static final int RULE_SEL=6;
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

    public InternalXSSLexer() {;} 
    public InternalXSSLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalXSSLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalXSS.g"; }

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
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
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:12:7: ( 'XProperties:' )
            // InternalXSS.g:12:9: 'XProperties:'
            {
            match("XProperties:"); 


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
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
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
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
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
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:16:7: ( '$' )
            // InternalXSS.g:16:9: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:17:7: ( ';' )
            // InternalXSS.g:17:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:18:7: ( '=' )
            // InternalXSS.g:18:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "RULE_NAME"
    public final void mRULE_NAME() throws RecognitionException {
        try {
            int _type = RULE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:2474:11: ( ( RULE_ID | '-' )+ )
            // InternalXSS.g:2474:13: ( RULE_ID | '-' )+
            {
            // InternalXSS.g:2474:13: ( RULE_ID | '-' )+
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
            	    // InternalXSS.g:2474:14: RULE_ID
            	    {
            	    mRULE_ID(); 

            	    }
            	    break;
            	case 2 :
            	    // InternalXSS.g:2474:22: '-'
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
            // InternalXSS.g:2476:10: ( ( '::' | ':' | '.' | '#' )? RULE_NAME ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )* )
            // InternalXSS.g:2476:12: ( '::' | ':' | '.' | '#' )? RULE_NAME ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )*
            {
            // InternalXSS.g:2476:12: ( '::' | ':' | '.' | '#' )?
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
                    // InternalXSS.g:2476:13: '::'
                    {
                    match("::"); 


                    }
                    break;
                case 2 :
                    // InternalXSS.g:2476:18: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 3 :
                    // InternalXSS.g:2476:22: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 4 :
                    // InternalXSS.g:2476:26: '#'
                    {
                    match('#'); 

                    }
                    break;

            }

            mRULE_NAME(); 
            // InternalXSS.g:2476:42: ( ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='#'||LA6_0=='+'||LA6_0=='.'||LA6_0==':'||LA6_0=='>'||LA6_0=='~') ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalXSS.g:2476:43: ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) ) RULE_NAME
            	    {
            	    // InternalXSS.g:2476:43: ( ( '>' | '+' | '~' ) | ( '::' | ':' | '.' | '#' ) | ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' ) )
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
            	            // InternalXSS.g:2476:44: ( '>' | '+' | '~' )
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
            	            // InternalXSS.g:2476:58: ( '::' | ':' | '.' | '#' )
            	            {
            	            // InternalXSS.g:2476:58: ( '::' | ':' | '.' | '#' )
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
            	                    // InternalXSS.g:2476:59: '::'
            	                    {
            	                    match("::"); 


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalXSS.g:2476:64: ':'
            	                    {
            	                    match(':'); 

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalXSS.g:2476:68: '.'
            	                    {
            	                    match('.'); 

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalXSS.g:2476:72: '#'
            	                    {
            	                    match('#'); 

            	                    }
            	                    break;

            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalXSS.g:2476:77: ( '>' | '+' | '~' ) ( '::' | ':' | '.' | '#' )
            	            {
            	            if ( input.LA(1)=='+'||input.LA(1)=='>'||input.LA(1)=='~' ) {
            	                input.consume();

            	            }
            	            else {
            	                MismatchedSetException mse = new MismatchedSetException(null,input);
            	                recover(mse);
            	                throw mse;}

            	            // InternalXSS.g:2476:91: ( '::' | ':' | '.' | '#' )
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
            	                    // InternalXSS.g:2476:92: '::'
            	                    {
            	                    match("::"); 


            	                    }
            	                    break;
            	                case 2 :
            	                    // InternalXSS.g:2476:97: ':'
            	                    {
            	                    match(':'); 

            	                    }
            	                    break;
            	                case 3 :
            	                    // InternalXSS.g:2476:101: '.'
            	                    {
            	                    match('.'); 

            	                    }
            	                    break;
            	                case 4 :
            	                    // InternalXSS.g:2476:105: '#'
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

    // $ANTLR start "RULE_VAL"
    public final void mRULE_VAL() throws RecognitionException {
        try {
            int _type = RULE_VAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalXSS.g:2478:10: ( ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' | '{' | '}' )+ )
            // InternalXSS.g:2478:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' | '{' | '}' )+
            {
            // InternalXSS.g:2478:12: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '-' | '%' | '{' | '}' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='%'||LA7_0=='-'||(LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||(LA7_0>='a' && LA7_0<='{')||LA7_0=='}') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalXSS.g:
            	    {
            	    if ( input.LA(1)=='%'||input.LA(1)=='-'||(input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='{')||input.LA(1)=='}' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_VAL"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            // InternalXSS.g:2480:18: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalXSS.g:2480:20: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalXSS.g:2480:20: ( '^' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='^') ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalXSS.g:2480:20: '^'
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

            // InternalXSS.g:2480:49: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')||(LA9_0>='A' && LA9_0<='Z')||LA9_0=='_'||(LA9_0>='a' && LA9_0<='z')) ) {
                    alt9=1;
                }


                switch (alt9) {
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
            	    break loop9;
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
            // InternalXSS.g:2482:10: ( ( '0' .. '9' )+ )
            // InternalXSS.g:2482:12: ( '0' .. '9' )+
            {
            // InternalXSS.g:2482:12: ( '0' .. '9' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalXSS.g:2482:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
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
            // InternalXSS.g:2484:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalXSS.g:2484:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalXSS.g:2484:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='\"') ) {
                alt13=1;
            }
            else if ( (LA13_0=='\'') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // InternalXSS.g:2484:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalXSS.g:2484:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop11:
                    do {
                        int alt11=3;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0=='\\') ) {
                            alt11=1;
                        }
                        else if ( ((LA11_0>='\u0000' && LA11_0<='!')||(LA11_0>='#' && LA11_0<='[')||(LA11_0>=']' && LA11_0<='\uFFFF')) ) {
                            alt11=2;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // InternalXSS.g:2484:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXSS.g:2484:28: ~ ( ( '\\\\' | '\"' ) )
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
                    	    break loop11;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalXSS.g:2484:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalXSS.g:2484:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop12:
                    do {
                        int alt12=3;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0=='\\') ) {
                            alt12=1;
                        }
                        else if ( ((LA12_0>='\u0000' && LA12_0<='&')||(LA12_0>='(' && LA12_0<='[')||(LA12_0>=']' && LA12_0<='\uFFFF')) ) {
                            alt12=2;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalXSS.g:2484:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalXSS.g:2484:61: ~ ( ( '\\\\' | '\\'' ) )
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
                    	    break loop12;
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
            // InternalXSS.g:2486:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalXSS.g:2486:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalXSS.g:2486:24: ( options {greedy=false; } : . )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0=='*') ) {
                    int LA14_1 = input.LA(2);

                    if ( (LA14_1=='/') ) {
                        alt14=2;
                    }
                    else if ( ((LA14_1>='\u0000' && LA14_1<='.')||(LA14_1>='0' && LA14_1<='\uFFFF')) ) {
                        alt14=1;
                    }


                }
                else if ( ((LA14_0>='\u0000' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='\uFFFF')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalXSS.g:2486:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop14;
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
            // InternalXSS.g:2488:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalXSS.g:2488:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalXSS.g:2488:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='\u0000' && LA15_0<='\t')||(LA15_0>='\u000B' && LA15_0<='\f')||(LA15_0>='\u000E' && LA15_0<='\uFFFF')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalXSS.g:2488:24: ~ ( ( '\\n' | '\\r' ) )
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
            	    break loop15;
                }
            } while (true);

            // InternalXSS.g:2488:40: ( ( '\\r' )? '\\n' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='\n'||LA17_0=='\r') ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalXSS.g:2488:41: ( '\\r' )? '\\n'
                    {
                    // InternalXSS.g:2488:41: ( '\\r' )?
                    int alt16=2;
                    int LA16_0 = input.LA(1);

                    if ( (LA16_0=='\r') ) {
                        alt16=1;
                    }
                    switch (alt16) {
                        case 1 :
                            // InternalXSS.g:2488:41: '\\r'
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
            // InternalXSS.g:2490:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalXSS.g:2490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalXSS.g:2490:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>='\t' && LA18_0<='\n')||LA18_0=='\r'||LA18_0==' ') ) {
                    alt18=1;
                }


                switch (alt18) {
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
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
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
            // InternalXSS.g:2492:16: ( . )
            // InternalXSS.g:2492:18: .
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
        // InternalXSS.g:1:8: ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_NAME | RULE_SEL | RULE_VAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt19=17;
        alt19 = dfa19.predict(input);
        switch (alt19) {
            case 1 :
                // InternalXSS.g:1:10: T__14
                {
                mT__14(); 

                }
                break;
            case 2 :
                // InternalXSS.g:1:16: T__15
                {
                mT__15(); 

                }
                break;
            case 3 :
                // InternalXSS.g:1:22: T__16
                {
                mT__16(); 

                }
                break;
            case 4 :
                // InternalXSS.g:1:28: T__17
                {
                mT__17(); 

                }
                break;
            case 5 :
                // InternalXSS.g:1:34: T__18
                {
                mT__18(); 

                }
                break;
            case 6 :
                // InternalXSS.g:1:40: T__19
                {
                mT__19(); 

                }
                break;
            case 7 :
                // InternalXSS.g:1:46: T__20
                {
                mT__20(); 

                }
                break;
            case 8 :
                // InternalXSS.g:1:52: T__21
                {
                mT__21(); 

                }
                break;
            case 9 :
                // InternalXSS.g:1:58: RULE_NAME
                {
                mRULE_NAME(); 

                }
                break;
            case 10 :
                // InternalXSS.g:1:68: RULE_SEL
                {
                mRULE_SEL(); 

                }
                break;
            case 11 :
                // InternalXSS.g:1:77: RULE_VAL
                {
                mRULE_VAL(); 

                }
                break;
            case 12 :
                // InternalXSS.g:1:86: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 13 :
                // InternalXSS.g:1:95: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 14 :
                // InternalXSS.g:1:107: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 15 :
                // InternalXSS.g:1:123: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 16 :
                // InternalXSS.g:1:139: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 17 :
                // InternalXSS.g:1:147: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA19 dfa19 = new DFA19(this);
    static final String DFA19_eotS =
        "\1\uffff\1\30\6\uffff\1\25\2\30\3\25\1\30\1\37\1\uffff\3\25\2\uffff\2\30\1\uffff\3\30\2\uffff\1\30\7\uffff\4\30\1\37\4\uffff\20\30\1\101\1\30\1\uffff\1\103\1\uffff";
    static final String DFA19_eofS =
        "\104\uffff";
    static final String DFA19_minS =
        "\1\0\1\43\6\uffff\1\101\2\43\3\55\1\43\1\60\1\uffff\2\0\1\52\2\uffff\2\43\1\uffff\3\43\1\uffff\1\101\1\43\7\uffff\4\43\1\60\4\uffff\20\43\1\55\1\43\1\uffff\1\55\1\uffff";
    static final String DFA19_maxS =
        "\1\uffff\1\176\6\uffff\1\172\2\176\3\172\1\176\1\71\1\uffff\2\uffff\1\57\2\uffff\2\176\1\uffff\3\176\1\uffff\1\172\1\176\7\uffff\4\176\1\71\4\uffff\20\176\1\172\1\176\1\uffff\1\172\1\uffff";
    static final String DFA19_acceptS =
        "\2\uffff\1\3\1\4\1\5\1\6\1\7\1\10\10\uffff\1\13\3\uffff\1\20\1\21\2\uffff\1\11\3\uffff\1\12\2\uffff\1\13\1\3\1\4\1\5\1\6\1\7\1\10\5\uffff\1\15\1\16\1\17\1\20\22\uffff\1\1\1\uffff\1\2";
    static final String DFA19_specialS =
        "\1\0\20\uffff\1\1\1\2\61\uffff}>";
    static final String[] DFA19_transitionS = {
            "\11\25\2\24\2\25\1\24\22\25\1\24\1\25\1\21\1\15\1\5\1\20\1\25\1\22\1\2\1\3\2\25\1\4\1\12\1\14\1\23\12\17\1\13\1\6\1\25\1\7\3\25\27\11\1\1\2\11\3\25\1\10\1\16\1\25\32\11\1\20\1\25\1\20\uff82\25",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\17\31\1\27\2\31\1\26\7\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\37\1\34\3\uffff\1\34\2\uffff\32\47\3\uffff\1\35\1\46\1\uffff\32\47\1\37\1\uffff\1\37\1\34",
            "\1\34\14\uffff\1\34\6\uffff\32\34\3\uffff\2\34\1\uffff\32\34",
            "\1\34\23\uffff\32\34\3\uffff\2\34\1\uffff\32\34",
            "\1\34\23\uffff\32\34\3\uffff\2\34\1\uffff\32\34",
            "\1\34\7\uffff\1\34\1\uffff\1\51\1\34\1\uffff\12\50\1\34\3\uffff\1\34\2\uffff\32\33\3\uffff\1\35\1\33\1\uffff\32\33\3\uffff\1\34",
            "\12\52",
            "",
            "\0\53",
            "\0\53",
            "\1\54\4\uffff\1\55",
            "",
            "",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\4\31\1\57\25\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\21\31\1\60\10\31\1\37\1\uffff\1\37\1\34",
            "",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\37\1\34\3\uffff\1\34\2\uffff\32\47\3\uffff\1\35\1\46\1\uffff\32\47\1\37\1\uffff\1\37\1\34",
            "\1\34\7\uffff\1\34\1\uffff\1\51\1\34\1\uffff\12\50\1\34\3\uffff\1\34\2\uffff\32\33\3\uffff\1\35\1\33\1\uffff\32\33\3\uffff\1\34",
            "",
            "\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\34\7\uffff\1\34\1\uffff\1\51\1\34\1\uffff\12\50\1\34\3\uffff\1\34\2\uffff\32\33\3\uffff\1\35\1\33\1\uffff\32\33\3\uffff\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "\1\34\7\uffff\1\34\1\uffff\1\51\1\34\1\uffff\12\50\1\34\3\uffff\1\34\2\uffff\32\33\3\uffff\1\35\1\33\1\uffff\32\33\3\uffff\1\34",
            "\1\34\7\uffff\1\34\1\uffff\1\51\1\34\13\uffff\1\34\3\uffff\1\34\2\uffff\32\46\3\uffff\1\35\1\46\1\uffff\32\46\3\uffff\1\34",
            "\12\52",
            "",
            "",
            "",
            "",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\13\31\1\61\16\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\16\31\1\62\13\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\4\31\1\63\25\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\17\31\1\64\12\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\2\31\1\65\27\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\4\31\1\66\25\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\23\31\1\67\6\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\21\31\1\70\10\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\16\31\1\71\13\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\23\31\1\72\6\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\21\31\1\73\10\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\10\31\1\74\21\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\22\31\1\75\7\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\4\31\1\76\25\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\77\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\34\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\22\31\1\100\7\31\1\37\1\uffff\1\37\1\34",
            "\1\34\14\uffff\1\34\6\uffff\32\34\3\uffff\2\34\1\uffff\32\34",
            "\1\34\1\uffff\1\37\5\uffff\1\34\1\uffff\1\32\1\34\1\uffff\12\36\1\102\3\uffff\1\34\2\uffff\32\31\3\uffff\1\35\1\33\1\uffff\32\31\1\37\1\uffff\1\37\1\34",
            "",
            "\1\34\14\uffff\1\34\6\uffff\32\34\3\uffff\2\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | RULE_NAME | RULE_SEL | RULE_VAL | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA19_0 = input.LA(1);

                        s = -1;
                        if ( (LA19_0=='X') ) {s = 1;}

                        else if ( (LA19_0=='(') ) {s = 2;}

                        else if ( (LA19_0==')') ) {s = 3;}

                        else if ( (LA19_0==',') ) {s = 4;}

                        else if ( (LA19_0=='$') ) {s = 5;}

                        else if ( (LA19_0==';') ) {s = 6;}

                        else if ( (LA19_0=='=') ) {s = 7;}

                        else if ( (LA19_0=='^') ) {s = 8;}

                        else if ( ((LA19_0>='A' && LA19_0<='W')||(LA19_0>='Y' && LA19_0<='Z')||(LA19_0>='a' && LA19_0<='z')) ) {s = 9;}

                        else if ( (LA19_0=='-') ) {s = 10;}

                        else if ( (LA19_0==':') ) {s = 11;}

                        else if ( (LA19_0=='.') ) {s = 12;}

                        else if ( (LA19_0=='#') ) {s = 13;}

                        else if ( (LA19_0=='_') ) {s = 14;}

                        else if ( ((LA19_0>='0' && LA19_0<='9')) ) {s = 15;}

                        else if ( (LA19_0=='%'||LA19_0=='{'||LA19_0=='}') ) {s = 16;}

                        else if ( (LA19_0=='\"') ) {s = 17;}

                        else if ( (LA19_0=='\'') ) {s = 18;}

                        else if ( (LA19_0=='/') ) {s = 19;}

                        else if ( ((LA19_0>='\t' && LA19_0<='\n')||LA19_0=='\r'||LA19_0==' ') ) {s = 20;}

                        else if ( ((LA19_0>='\u0000' && LA19_0<='\b')||(LA19_0>='\u000B' && LA19_0<='\f')||(LA19_0>='\u000E' && LA19_0<='\u001F')||LA19_0=='!'||LA19_0=='&'||(LA19_0>='*' && LA19_0<='+')||LA19_0=='<'||(LA19_0>='>' && LA19_0<='@')||(LA19_0>='[' && LA19_0<=']')||LA19_0=='`'||LA19_0=='|'||(LA19_0>='~' && LA19_0<='\uFFFF')) ) {s = 21;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA19_17 = input.LA(1);

                        s = -1;
                        if ( ((LA19_17>='\u0000' && LA19_17<='\uFFFF')) ) {s = 43;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA19_18 = input.LA(1);

                        s = -1;
                        if ( ((LA19_18>='\u0000' && LA19_18<='\uFFFF')) ) {s = 43;}

                        else s = 21;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 19, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}