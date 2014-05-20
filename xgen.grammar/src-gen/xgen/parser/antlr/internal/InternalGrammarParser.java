package xgen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import xgen.services.GrammarGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalGrammarParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_CHAR", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'lexical'", "':'", "';'", "'|'", "'!'", "'{'", "','", "'}'", "'.'", "'('", "')'"
    };
    public static final int RULE_STRING=7;
    public static final int RULE_SL_COMMENT=9;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_CHAR=6;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalGrammarParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalGrammarParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalGrammarParser.tokenNames; }
    public String getGrammarFileName() { return "../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g"; }



     	private GrammarGrammarAccess grammarAccess;
     	
        public InternalGrammarParser(TokenStream input, GrammarGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Grammar";	
       	}
       	
       	@Override
       	protected GrammarGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleGrammar"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:67:1: entryRuleGrammar returns [EObject current=null] : iv_ruleGrammar= ruleGrammar EOF ;
    public final EObject entryRuleGrammar() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrammar = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:68:2: (iv_ruleGrammar= ruleGrammar EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:69:2: iv_ruleGrammar= ruleGrammar EOF
            {
             newCompositeNode(grammarAccess.getGrammarRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleGrammar_in_entryRuleGrammar75);
            iv_ruleGrammar=ruleGrammar();

            state._fsp--;

             current =iv_ruleGrammar; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleGrammar85); 

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
    // $ANTLR end "entryRuleGrammar"


    // $ANTLR start "ruleGrammar"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:76:1: ruleGrammar returns [EObject current=null] : ( () ( (lv_definitions_1_0= ruleDefinition ) )* ) ;
    public final EObject ruleGrammar() throws RecognitionException {
        EObject current = null;

        EObject lv_definitions_1_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:79:28: ( ( () ( (lv_definitions_1_0= ruleDefinition ) )* ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:80:1: ( () ( (lv_definitions_1_0= ruleDefinition ) )* )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:80:1: ( () ( (lv_definitions_1_0= ruleDefinition ) )* )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:80:2: () ( (lv_definitions_1_0= ruleDefinition ) )*
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:80:2: ()
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getGrammarAccess().getGrammarAction_0(),
                        current);
                

            }

            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:86:2: ( (lv_definitions_1_0= ruleDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_ID||LA1_0==11) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:87:1: (lv_definitions_1_0= ruleDefinition )
            	    {
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:87:1: (lv_definitions_1_0= ruleDefinition )
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:88:3: lv_definitions_1_0= ruleDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGrammarAccess().getDefinitionsDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleDefinition_in_ruleGrammar140);
            	    lv_definitions_1_0=ruleDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGrammarRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"definitions",
            	            		lv_definitions_1_0, 
            	            		"Definition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
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
    // $ANTLR end "ruleGrammar"


    // $ANTLR start "entryRuleDefinition"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:112:1: entryRuleDefinition returns [EObject current=null] : iv_ruleDefinition= ruleDefinition EOF ;
    public final EObject entryRuleDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDefinition = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:113:2: (iv_ruleDefinition= ruleDefinition EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:114:2: iv_ruleDefinition= ruleDefinition EOF
            {
             newCompositeNode(grammarAccess.getDefinitionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDefinition_in_entryRuleDefinition177);
            iv_ruleDefinition=ruleDefinition();

            state._fsp--;

             current =iv_ruleDefinition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDefinition187); 

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
    // $ANTLR end "entryRuleDefinition"


    // $ANTLR start "ruleDefinition"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:121:1: ruleDefinition returns [EObject current=null] : ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_lhs_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) ;
    public final EObject ruleDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_lexical_1_0=null;
        Token lv_lhs_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_rhs_4_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:124:28: ( ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_lhs_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:125:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_lhs_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:125:1: ( () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_lhs_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';' )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:125:2: () ( (lv_lexical_1_0= 'lexical' ) )? ( (lv_lhs_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_rhs_4_0= ruleConstruct0 ) ) otherlv_5= ';'
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:125:2: ()
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:126:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDefinitionAccess().getDefinitionAction_0(),
                        current);
                

            }

            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:131:2: ( (lv_lexical_1_0= 'lexical' ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:132:1: (lv_lexical_1_0= 'lexical' )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:132:1: (lv_lexical_1_0= 'lexical' )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:133:3: lv_lexical_1_0= 'lexical'
                    {
                    lv_lexical_1_0=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleDefinition239); 

                            newLeafNode(lv_lexical_1_0, grammarAccess.getDefinitionAccess().getLexicalLexicalKeyword_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "lexical", true, "lexical");
                    	    

                    }


                    }
                    break;

            }

            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:146:3: ( (lv_lhs_2_0= RULE_ID ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:147:1: (lv_lhs_2_0= RULE_ID )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:147:1: (lv_lhs_2_0= RULE_ID )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:148:3: lv_lhs_2_0= RULE_ID
            {
            lv_lhs_2_0=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleDefinition270); 

            			newLeafNode(lv_lhs_2_0, grammarAccess.getDefinitionAccess().getLhsIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getDefinitionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"lhs",
                    		lv_lhs_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleDefinition287); 

                	newLeafNode(otherlv_3, grammarAccess.getDefinitionAccess().getColonKeyword_3());
                
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:168:1: ( (lv_rhs_4_0= ruleConstruct0 ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:169:1: (lv_rhs_4_0= ruleConstruct0 )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:169:1: (lv_rhs_4_0= ruleConstruct0 )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:170:3: lv_rhs_4_0= ruleConstruct0
            {
             
            	        newCompositeNode(grammarAccess.getDefinitionAccess().getRhsConstruct0ParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_ruleDefinition308);
            lv_rhs_4_0=ruleConstruct0();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_4_0, 
                    		"Construct0");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleDefinition320); 

                	newLeafNode(otherlv_5, grammarAccess.getDefinitionAccess().getSemicolonKeyword_5());
                

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
    // $ANTLR end "ruleDefinition"


    // $ANTLR start "entryRuleConstruct0"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:198:1: entryRuleConstruct0 returns [EObject current=null] : iv_ruleConstruct0= ruleConstruct0 EOF ;
    public final EObject entryRuleConstruct0() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct0 = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:199:2: (iv_ruleConstruct0= ruleConstruct0 EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:200:2: iv_ruleConstruct0= ruleConstruct0 EOF
            {
             newCompositeNode(grammarAccess.getConstruct0Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_entryRuleConstruct0356);
            iv_ruleConstruct0=ruleConstruct0();

            state._fsp--;

             current =iv_ruleConstruct0; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct0366); 

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
    // $ANTLR end "entryRuleConstruct0"


    // $ANTLR start "ruleConstruct0"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:207:1: ruleConstruct0 returns [EObject current=null] : (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) ;
    public final EObject ruleConstruct0() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Construct1_0 = null;

        EObject lv_operands_3_0 = null;

        EObject lv_operands_5_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:210:28: ( (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:211:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:211:1: (this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )? )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:212:5: this_Construct1_0= ruleConstruct1 ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct0Access().getConstruct1ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_ruleConstruct0413);
            this_Construct1_0=ruleConstruct1();

            state._fsp--;

             
                    current = this_Construct1_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:220:1: ( () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:220:2: () otherlv_2= '|' ( (lv_operands_3_0= ruleConstruct1 ) ) (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:220:2: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:221:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct0Access().getAlternativeOperandsAction_1_0(),
                                current);
                        

                    }

                    otherlv_2=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstruct0434); 

                        	newLeafNode(otherlv_2, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_1());
                        
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:230:1: ( (lv_operands_3_0= ruleConstruct1 ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:231:1: (lv_operands_3_0= ruleConstruct1 )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:231:1: (lv_operands_3_0= ruleConstruct1 )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:232:3: lv_operands_3_0= ruleConstruct1
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_ruleConstruct0455);
                    lv_operands_3_0=ruleConstruct1();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct0Rule());
                    	        }
                           		add(
                           			current, 
                           			"operands",
                            		lv_operands_3_0, 
                            		"Construct1");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:248:2: (otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==14) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:248:4: otherlv_4= '|' ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    {
                    	    otherlv_4=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleConstruct0468); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getConstruct0Access().getVerticalLineKeyword_1_3_0());
                    	        
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:252:1: ( (lv_operands_5_0= ruleConstruct1 ) )
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:253:1: (lv_operands_5_0= ruleConstruct1 )
                    	    {
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:253:1: (lv_operands_5_0= ruleConstruct1 )
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:254:3: lv_operands_5_0= ruleConstruct1
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct0Access().getOperandsConstruct1ParserRuleCall_1_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_ruleConstruct0489);
                    	    lv_operands_5_0=ruleConstruct1();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstruct0Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operands",
                    	            		lv_operands_5_0, 
                    	            		"Construct1");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
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
    // $ANTLR end "ruleConstruct0"


    // $ANTLR start "entryRuleConstruct1"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:278:1: entryRuleConstruct1 returns [EObject current=null] : iv_ruleConstruct1= ruleConstruct1 EOF ;
    public final EObject entryRuleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct1 = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:279:2: (iv_ruleConstruct1= ruleConstruct1 EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:280:2: iv_ruleConstruct1= ruleConstruct1 EOF
            {
             newCompositeNode(grammarAccess.getConstruct1Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct1_in_entryRuleConstruct1529);
            iv_ruleConstruct1=ruleConstruct1();

            state._fsp--;

             current =iv_ruleConstruct1; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct1539); 

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
    // $ANTLR end "entryRuleConstruct1"


    // $ANTLR start "ruleConstruct1"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:287:1: ruleConstruct1 returns [EObject current=null] : (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) ;
    public final EObject ruleConstruct1() throws RecognitionException {
        EObject current = null;

        EObject this_Construct2_0 = null;

        EObject lv_operands_2_0 = null;

        EObject lv_operands_3_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:290:28: ( (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:291:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:291:1: (this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )? )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:292:5: this_Construct2_0= ruleConstruct2 ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            {
             
                    newCompositeNode(grammarAccess.getConstruct1Access().getConstruct2ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_ruleConstruct1586);
            this_Construct2_0=ruleConstruct2();

            state._fsp--;

             
                    current = this_Construct2_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:300:1: ( () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_ID||(LA6_0>=RULE_CHAR && LA6_0<=RULE_STRING)||LA6_0==15||(LA6_0>=19 && LA6_0<=20)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:300:2: () ( (lv_operands_2_0= ruleConstruct2 ) ) ( (lv_operands_3_0= ruleConstruct2 ) )*
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:300:2: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:301:5: 
                    {

                            current = forceCreateModelElementAndAdd(
                                grammarAccess.getConstruct1Access().getSequenceOperandsAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:306:2: ( (lv_operands_2_0= ruleConstruct2 ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:307:1: (lv_operands_2_0= ruleConstruct2 )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:307:1: (lv_operands_2_0= ruleConstruct2 )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:308:3: lv_operands_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_ruleConstruct1616);
                    lv_operands_2_0=ruleConstruct2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct1Rule());
                    	        }
                           		add(
                           			current, 
                           			"operands",
                            		lv_operands_2_0, 
                            		"Construct2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:324:2: ( (lv_operands_3_0= ruleConstruct2 ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==RULE_ID||(LA5_0>=RULE_CHAR && LA5_0<=RULE_STRING)||LA5_0==15||(LA5_0>=19 && LA5_0<=20)) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:325:1: (lv_operands_3_0= ruleConstruct2 )
                    	    {
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:325:1: (lv_operands_3_0= ruleConstruct2 )
                    	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:326:3: lv_operands_3_0= ruleConstruct2
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getConstruct1Access().getOperandsConstruct2ParserRuleCall_1_2_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_ruleConstruct1637);
                    	    lv_operands_3_0=ruleConstruct2();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getConstruct1Rule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"operands",
                    	            		lv_operands_3_0, 
                    	            		"Construct2");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
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
    // $ANTLR end "ruleConstruct1"


    // $ANTLR start "entryRuleConstruct2"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:350:1: entryRuleConstruct2 returns [EObject current=null] : iv_ruleConstruct2= ruleConstruct2 EOF ;
    public final EObject entryRuleConstruct2() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct2 = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:351:2: (iv_ruleConstruct2= ruleConstruct2 EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:352:2: iv_ruleConstruct2= ruleConstruct2 EOF
            {
             newCompositeNode(grammarAccess.getConstruct2Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_entryRuleConstruct2676);
            iv_ruleConstruct2=ruleConstruct2();

            state._fsp--;

             current =iv_ruleConstruct2; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct2686); 

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
    // $ANTLR end "entryRuleConstruct2"


    // $ANTLR start "ruleConstruct2"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:359:1: ruleConstruct2 returns [EObject current=null] : ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | this_Construct3_3= ruleConstruct3 ) ;
    public final EObject ruleConstruct2() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_operand_2_0 = null;

        EObject this_Construct3_3 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:362:28: ( ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | this_Construct3_3= ruleConstruct3 ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | this_Construct3_3= ruleConstruct3 )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:1: ( ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) ) | this_Construct3_3= ruleConstruct3 )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID||(LA7_0>=RULE_CHAR && LA7_0<=RULE_STRING)||(LA7_0>=19 && LA7_0<=20)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:2: ( () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:3: () otherlv_1= '!' ( (lv_operand_2_0= ruleConstruct2 ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:363:3: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:364:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct2Access().getNotAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConstruct2733); 

                        	newLeafNode(otherlv_1, grammarAccess.getConstruct2Access().getExclamationMarkKeyword_0_1());
                        
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:373:1: ( (lv_operand_2_0= ruleConstruct2 ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:374:1: (lv_operand_2_0= ruleConstruct2 )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:374:1: (lv_operand_2_0= ruleConstruct2 )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:375:3: lv_operand_2_0= ruleConstruct2
                    {
                     
                    	        newCompositeNode(grammarAccess.getConstruct2Access().getOperandConstruct2ParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct2_in_ruleConstruct2754);
                    lv_operand_2_0=ruleConstruct2();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getConstruct2Rule());
                    	        }
                           		set(
                           			current, 
                           			"operand",
                            		lv_operand_2_0, 
                            		"Construct2");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:393:5: this_Construct3_3= ruleConstruct3
                    {
                     
                            newCompositeNode(grammarAccess.getConstruct2Access().getConstruct3ParserRuleCall_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct3_in_ruleConstruct2783);
                    this_Construct3_3=ruleConstruct3();

                    state._fsp--;

                     
                            current = this_Construct3_3; 
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
    // $ANTLR end "ruleConstruct2"


    // $ANTLR start "entryRuleConstruct3"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:409:1: entryRuleConstruct3 returns [EObject current=null] : iv_ruleConstruct3= ruleConstruct3 EOF ;
    public final EObject entryRuleConstruct3() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct3 = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:410:2: (iv_ruleConstruct3= ruleConstruct3 EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:411:2: iv_ruleConstruct3= ruleConstruct3 EOF
            {
             newCompositeNode(grammarAccess.getConstruct3Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct3_in_entryRuleConstruct3818);
            iv_ruleConstruct3=ruleConstruct3();

            state._fsp--;

             current =iv_ruleConstruct3; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct3828); 

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
    // $ANTLR end "entryRuleConstruct3"


    // $ANTLR start "ruleConstruct3"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:418:1: ruleConstruct3 returns [EObject current=null] : (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) ;
    public final EObject ruleConstruct3() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token lv_min_3_0=null;
        Token lv_upperBounded_4_0=null;
        Token lv_max_5_0=null;
        Token otherlv_6=null;
        EObject this_Construct4_0 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:421:28: ( (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:422:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:422:1: (this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )* )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:423:5: this_Construct4_0= ruleConstruct4 ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            {
             
                    newCompositeNode(grammarAccess.getConstruct3Access().getConstruct4ParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleConstruct4_in_ruleConstruct3875);
            this_Construct4_0=ruleConstruct4();

            state._fsp--;

             
                    current = this_Construct4_0; 
                    afterParserOrEnumRuleCall();
                
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:431:1: ( () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}' )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==16) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:431:2: () otherlv_2= '{' ( (lv_min_3_0= RULE_INT ) ) ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )? otherlv_6= '}'
            	    {
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:431:2: ()
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:432:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getConstruct3Access().getMultiplicityOperandAction_1_0(),
            	                current);
            	        

            	    }

            	    otherlv_2=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConstruct3896); 

            	        	newLeafNode(otherlv_2, grammarAccess.getConstruct3Access().getLeftCurlyBracketKeyword_1_1());
            	        
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:441:1: ( (lv_min_3_0= RULE_INT ) )
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:442:1: (lv_min_3_0= RULE_INT )
            	    {
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:442:1: (lv_min_3_0= RULE_INT )
            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:443:3: lv_min_3_0= RULE_INT
            	    {
            	    lv_min_3_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConstruct3913); 

            	    			newLeafNode(lv_min_3_0, grammarAccess.getConstruct3Access().getMinINTTerminalRuleCall_1_2_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"min",
            	            		lv_min_3_0, 
            	            		"INT");
            	    	    

            	    }


            	    }

            	    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:459:2: ( ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) ) )?
            	    int alt8=2;
            	    int LA8_0 = input.LA(1);

            	    if ( (LA8_0==17) ) {
            	        alt8=1;
            	    }
            	    switch (alt8) {
            	        case 1 :
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:459:3: ( (lv_upperBounded_4_0= ',' ) ) ( (lv_max_5_0= RULE_INT ) )
            	            {
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:459:3: ( (lv_upperBounded_4_0= ',' ) )
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:460:1: (lv_upperBounded_4_0= ',' )
            	            {
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:460:1: (lv_upperBounded_4_0= ',' )
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:461:3: lv_upperBounded_4_0= ','
            	            {
            	            lv_upperBounded_4_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleConstruct3937); 

            	                    newLeafNode(lv_upperBounded_4_0, grammarAccess.getConstruct3Access().getUpperBoundedCommaKeyword_1_3_0_0());
            	                

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	            	        }
            	                   		setWithLastConsumed(current, "upperBounded", true, ",");
            	            	    

            	            }


            	            }

            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:474:2: ( (lv_max_5_0= RULE_INT ) )
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:475:1: (lv_max_5_0= RULE_INT )
            	            {
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:475:1: (lv_max_5_0= RULE_INT )
            	            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:476:3: lv_max_5_0= RULE_INT
            	            {
            	            lv_max_5_0=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleConstruct3967); 

            	            			newLeafNode(lv_max_5_0, grammarAccess.getConstruct3Access().getMaxINTTerminalRuleCall_1_3_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getConstruct3Rule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"max",
            	                    		lv_max_5_0, 
            	                    		"INT");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }

            	    otherlv_6=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleConstruct3986); 

            	        	newLeafNode(otherlv_6, grammarAccess.getConstruct3Access().getRightCurlyBracketKeyword_1_4());
            	        

            	    }
            	    break;

            	default :
            	    break loop9;
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
    // $ANTLR end "ruleConstruct3"


    // $ANTLR start "entryRuleConstruct4"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:504:1: entryRuleConstruct4 returns [EObject current=null] : iv_ruleConstruct4= ruleConstruct4 EOF ;
    public final EObject entryRuleConstruct4() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConstruct4 = null;


        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:505:2: (iv_ruleConstruct4= ruleConstruct4 EOF )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:506:2: iv_ruleConstruct4= ruleConstruct4 EOF
            {
             newCompositeNode(grammarAccess.getConstruct4Rule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConstruct4_in_entryRuleConstruct41024);
            iv_ruleConstruct4=ruleConstruct4();

            state._fsp--;

             current =iv_ruleConstruct4; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConstruct41034); 

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
    // $ANTLR end "entryRuleConstruct4"


    // $ANTLR start "ruleConstruct4"
    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:513:1: ruleConstruct4 returns [EObject current=null] : ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () otherlv_8= '.' ) | (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' ) ) ;
    public final EObject ruleConstruct4() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_min_3_0=null;
        Token lv_max_4_0=null;
        Token lv_value_6_0=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        EObject this_Construct0_10 = null;


         enterRule(); 
            
        try {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:516:28: ( ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () otherlv_8= '.' ) | (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' ) ) )
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () otherlv_8= '.' ) | (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' ) )
            {
            // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:1: ( ( () ( (otherlv_1= RULE_ID ) ) ) | ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) ) | ( () ( (lv_value_6_0= RULE_STRING ) ) ) | ( () otherlv_8= '.' ) | (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' ) )
            int alt10=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt10=1;
                }
                break;
            case RULE_CHAR:
                {
                alt10=2;
                }
                break;
            case RULE_STRING:
                {
                alt10=3;
                }
                break;
            case 19:
                {
                alt10=4;
                }
                break;
            case 20:
                {
                alt10=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:2: ( () ( (otherlv_1= RULE_ID ) ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:3: () ( (otherlv_1= RULE_ID ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:517:3: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:518:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getReferenceAction_0_0(),
                                current);
                        

                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:523:2: ( (otherlv_1= RULE_ID ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:524:1: (otherlv_1= RULE_ID )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:524:1: (otherlv_1= RULE_ID )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:525:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleConstruct41089); 

                    		newLeafNode(otherlv_1, grammarAccess.getConstruct4Access().getTargetDefinitionCrossReference_0_1_0()); 
                    	

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:537:6: ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:537:6: ( () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:537:7: () ( (lv_min_3_0= RULE_CHAR ) ) ( (lv_max_4_0= RULE_CHAR ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:537:7: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:538:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getRangeAction_1_0(),
                                current);
                        

                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:543:2: ( (lv_min_3_0= RULE_CHAR ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:544:1: (lv_min_3_0= RULE_CHAR )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:544:1: (lv_min_3_0= RULE_CHAR )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:545:3: lv_min_3_0= RULE_CHAR
                    {
                    lv_min_3_0=(Token)match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_ruleConstruct41123); 

                    			newLeafNode(lv_min_3_0, grammarAccess.getConstruct4Access().getMinCHARTerminalRuleCall_1_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"min",
                            		lv_min_3_0, 
                            		"CHAR");
                    	    

                    }


                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:561:2: ( (lv_max_4_0= RULE_CHAR ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:562:1: (lv_max_4_0= RULE_CHAR )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:562:1: (lv_max_4_0= RULE_CHAR )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:563:3: lv_max_4_0= RULE_CHAR
                    {
                    lv_max_4_0=(Token)match(input,RULE_CHAR,FollowSets000.FOLLOW_RULE_CHAR_in_ruleConstruct41145); 

                    			newLeafNode(lv_max_4_0, grammarAccess.getConstruct4Access().getMaxCHARTerminalRuleCall_1_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"max",
                            		lv_max_4_0, 
                            		"CHAR");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:580:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:580:6: ( () ( (lv_value_6_0= RULE_STRING ) ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:580:7: () ( (lv_value_6_0= RULE_STRING ) )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:580:7: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:581:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getKeywordAction_2_0(),
                                current);
                        

                    }

                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:586:2: ( (lv_value_6_0= RULE_STRING ) )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:587:1: (lv_value_6_0= RULE_STRING )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:587:1: (lv_value_6_0= RULE_STRING )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:588:3: lv_value_6_0= RULE_STRING
                    {
                    lv_value_6_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleConstruct41184); 

                    			newLeafNode(lv_value_6_0, grammarAccess.getConstruct4Access().getValueSTRINGTerminalRuleCall_2_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getConstruct4Rule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_6_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:605:6: ( () otherlv_8= '.' )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:605:6: ( () otherlv_8= '.' )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:605:7: () otherlv_8= '.'
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:605:7: ()
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:606:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getConstruct4Access().getAnyAction_3_0(),
                                current);
                        

                    }

                    otherlv_8=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleConstruct41218); 

                        	newLeafNode(otherlv_8, grammarAccess.getConstruct4Access().getFullStopKeyword_3_1());
                        

                    }


                    }
                    break;
                case 5 :
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:616:6: (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' )
                    {
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:616:6: (otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')' )
                    // ../xgen.grammar/src-gen/xgen/parser/antlr/internal/InternalGrammar.g:616:8: otherlv_9= '(' this_Construct0_10= ruleConstruct0 otherlv_11= ')'
                    {
                    otherlv_9=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleConstruct41238); 

                        	newLeafNode(otherlv_9, grammarAccess.getConstruct4Access().getLeftParenthesisKeyword_4_0());
                        
                     
                            newCompositeNode(grammarAccess.getConstruct4Access().getConstruct0ParserRuleCall_4_1()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleConstruct0_in_ruleConstruct41260);
                    this_Construct0_10=ruleConstruct0();

                    state._fsp--;

                     
                            current = this_Construct0_10; 
                            afterParserOrEnumRuleCall();
                        
                    otherlv_11=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleConstruct41271); 

                        	newLeafNode(otherlv_11, grammarAccess.getConstruct4Access().getRightParenthesisKeyword_4_2());
                        

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
    // $ANTLR end "ruleConstruct4"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleGrammar_in_entryRuleGrammar75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleGrammar85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDefinition_in_ruleGrammar140 = new BitSet(new long[]{0x0000000000000812L});
        public static final BitSet FOLLOW_ruleDefinition_in_entryRuleDefinition177 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDefinition187 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_ruleDefinition239 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleDefinition270 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleDefinition287 = new BitSet(new long[]{0x00000000001880D0L});
        public static final BitSet FOLLOW_ruleConstruct0_in_ruleDefinition308 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleDefinition320 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct0_in_entryRuleConstruct0356 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct0366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct0413 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleConstruct0434 = new BitSet(new long[]{0x00000000001880D0L});
        public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct0455 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_14_in_ruleConstruct0468 = new BitSet(new long[]{0x00000000001880D0L});
        public static final BitSet FOLLOW_ruleConstruct1_in_ruleConstruct0489 = new BitSet(new long[]{0x0000000000004002L});
        public static final BitSet FOLLOW_ruleConstruct1_in_entryRuleConstruct1529 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct1539 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct1586 = new BitSet(new long[]{0x00000000001880D2L});
        public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct1616 = new BitSet(new long[]{0x00000000001880D2L});
        public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct1637 = new BitSet(new long[]{0x00000000001880D2L});
        public static final BitSet FOLLOW_ruleConstruct2_in_entryRuleConstruct2676 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct2686 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleConstruct2733 = new BitSet(new long[]{0x00000000001880D0L});
        public static final BitSet FOLLOW_ruleConstruct2_in_ruleConstruct2754 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct3_in_ruleConstruct2783 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct3_in_entryRuleConstruct3818 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct3828 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConstruct4_in_ruleConstruct3875 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_16_in_ruleConstruct3896 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct3913 = new BitSet(new long[]{0x0000000000060000L});
        public static final BitSet FOLLOW_17_in_ruleConstruct3937 = new BitSet(new long[]{0x0000000000000020L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleConstruct3967 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_ruleConstruct3986 = new BitSet(new long[]{0x0000000000010002L});
        public static final BitSet FOLLOW_ruleConstruct4_in_entryRuleConstruct41024 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConstruct41034 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleConstruct41089 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41123 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_CHAR_in_ruleConstruct41145 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleConstruct41184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleConstruct41218 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleConstruct41238 = new BitSet(new long[]{0x00000000001880D0L});
        public static final BitSet FOLLOW_ruleConstruct0_in_ruleConstruct41260 = new BitSet(new long[]{0x0000000000200000L});
        public static final BitSet FOLLOW_21_in_ruleConstruct41271 = new BitSet(new long[]{0x0000000000000002L});
    }


}