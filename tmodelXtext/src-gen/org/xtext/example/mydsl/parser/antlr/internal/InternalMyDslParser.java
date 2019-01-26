package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'loader'", "'{'", "'loadmodel'", "'operations'", "','", "'}'", "'Table'", "'Column'", "'table'", "'Add'", "'Delete'", "'Update'", "'newName'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__20=20;
    public static final int T__21=21;

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
        	return "loader";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleloader"
    // InternalMyDsl.g:64:1: entryRuleloader returns [EObject current=null] : iv_ruleloader= ruleloader EOF ;
    public final EObject entryRuleloader() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleloader = null;


        try {
            // InternalMyDsl.g:64:47: (iv_ruleloader= ruleloader EOF )
            // InternalMyDsl.g:65:2: iv_ruleloader= ruleloader EOF
            {
             newCompositeNode(grammarAccess.getLoaderRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleloader=ruleloader();

            state._fsp--;

             current =iv_ruleloader; 
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
    // $ANTLR end "entryRuleloader"


    // $ANTLR start "ruleloader"
    // InternalMyDsl.g:71:1: ruleloader returns [EObject current=null] : (otherlv_0= 'loader' otherlv_1= '{' otherlv_2= 'loadmodel' ( (lv_loadmodel_3_0= ruleLoadModel ) ) (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) ;
    public final EObject ruleloader() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        EObject lv_loadmodel_3_0 = null;

        EObject lv_operation_6_0 = null;

        EObject lv_operation_8_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'loader' otherlv_1= '{' otherlv_2= 'loadmodel' ( (lv_loadmodel_3_0= ruleLoadModel ) ) (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'loader' otherlv_1= '{' otherlv_2= 'loadmodel' ( (lv_loadmodel_3_0= ruleLoadModel ) ) (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'loader' otherlv_1= '{' otherlv_2= 'loadmodel' ( (lv_loadmodel_3_0= ruleLoadModel ) ) (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}' )
            // InternalMyDsl.g:79:3: otherlv_0= 'loader' otherlv_1= '{' otherlv_2= 'loadmodel' ( (lv_loadmodel_3_0= ruleLoadModel ) ) (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )? otherlv_10= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLoaderAccess().getLoaderKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getLoaderAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getLoaderAccess().getLoadmodelKeyword_2());
            		
            // InternalMyDsl.g:91:3: ( (lv_loadmodel_3_0= ruleLoadModel ) )
            // InternalMyDsl.g:92:4: (lv_loadmodel_3_0= ruleLoadModel )
            {
            // InternalMyDsl.g:92:4: (lv_loadmodel_3_0= ruleLoadModel )
            // InternalMyDsl.g:93:5: lv_loadmodel_3_0= ruleLoadModel
            {

            					newCompositeNode(grammarAccess.getLoaderAccess().getLoadmodelLoadModelParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_6);
            lv_loadmodel_3_0=ruleLoadModel();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLoaderRule());
            					}
            					set(
            						current,
            						"loadmodel",
            						lv_loadmodel_3_0,
            						"org.xtext.example.mydsl.MyDsl.LoadModel");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:110:3: (otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}' )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:111:4: otherlv_4= 'operations' otherlv_5= '{' ( (lv_operation_6_0= ruleOperation ) ) (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )* otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,14,FOLLOW_3); 

                    				newLeafNode(otherlv_4, grammarAccess.getLoaderAccess().getOperationsKeyword_4_0());
                    			
                    otherlv_5=(Token)match(input,12,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getLoaderAccess().getLeftCurlyBracketKeyword_4_1());
                    			
                    // InternalMyDsl.g:119:4: ( (lv_operation_6_0= ruleOperation ) )
                    // InternalMyDsl.g:120:5: (lv_operation_6_0= ruleOperation )
                    {
                    // InternalMyDsl.g:120:5: (lv_operation_6_0= ruleOperation )
                    // InternalMyDsl.g:121:6: lv_operation_6_0= ruleOperation
                    {

                    						newCompositeNode(grammarAccess.getLoaderAccess().getOperationOperationParserRuleCall_4_2_0());
                    					
                    pushFollow(FOLLOW_8);
                    lv_operation_6_0=ruleOperation();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getLoaderRule());
                    						}
                    						add(
                    							current,
                    							"operation",
                    							lv_operation_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Operation");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:138:4: (otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) ) )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==15) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // InternalMyDsl.g:139:5: otherlv_7= ',' ( (lv_operation_8_0= ruleOperation ) )
                    	    {
                    	    otherlv_7=(Token)match(input,15,FOLLOW_7); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getLoaderAccess().getCommaKeyword_4_3_0());
                    	    				
                    	    // InternalMyDsl.g:143:5: ( (lv_operation_8_0= ruleOperation ) )
                    	    // InternalMyDsl.g:144:6: (lv_operation_8_0= ruleOperation )
                    	    {
                    	    // InternalMyDsl.g:144:6: (lv_operation_8_0= ruleOperation )
                    	    // InternalMyDsl.g:145:7: lv_operation_8_0= ruleOperation
                    	    {

                    	    							newCompositeNode(grammarAccess.getLoaderAccess().getOperationOperationParserRuleCall_4_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_8);
                    	    lv_operation_8_0=ruleOperation();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getLoaderRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"operation",
                    	    								lv_operation_8_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Operation");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);

                    otherlv_9=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_9, grammarAccess.getLoaderAccess().getRightCurlyBracketKeyword_4_4());
                    			

                    }
                    break;

            }

            otherlv_10=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_10, grammarAccess.getLoaderAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleloader"


    // $ANTLR start "entryRuleOperation"
    // InternalMyDsl.g:176:1: entryRuleOperation returns [EObject current=null] : iv_ruleOperation= ruleOperation EOF ;
    public final EObject entryRuleOperation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOperation = null;


        try {
            // InternalMyDsl.g:176:50: (iv_ruleOperation= ruleOperation EOF )
            // InternalMyDsl.g:177:2: iv_ruleOperation= ruleOperation EOF
            {
             newCompositeNode(grammarAccess.getOperationRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOperation=ruleOperation();

            state._fsp--;

             current =iv_ruleOperation; 
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
    // $ANTLR end "entryRuleOperation"


    // $ANTLR start "ruleOperation"
    // InternalMyDsl.g:183:1: ruleOperation returns [EObject current=null] : (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Update_2= ruleUpdate ) ;
    public final EObject ruleOperation() throws RecognitionException {
        EObject current = null;

        EObject this_Add_0 = null;

        EObject this_Delete_1 = null;

        EObject this_Update_2 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:189:2: ( (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Update_2= ruleUpdate ) )
            // InternalMyDsl.g:190:2: (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Update_2= ruleUpdate )
            {
            // InternalMyDsl.g:190:2: (this_Add_0= ruleAdd | this_Delete_1= ruleDelete | this_Update_2= ruleUpdate )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt3=1;
                }
                break;
            case 21:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:191:3: this_Add_0= ruleAdd
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getAddParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Add_0=ruleAdd();

                    state._fsp--;


                    			current = this_Add_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:200:3: this_Delete_1= ruleDelete
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getDeleteParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_Delete_1=ruleDelete();

                    state._fsp--;


                    			current = this_Delete_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:209:3: this_Update_2= ruleUpdate
                    {

                    			newCompositeNode(grammarAccess.getOperationAccess().getUpdateParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_Update_2=ruleUpdate();

                    state._fsp--;


                    			current = this_Update_2;
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
    // $ANTLR end "ruleOperation"


    // $ANTLR start "entryRuleLoadModel"
    // InternalMyDsl.g:221:1: entryRuleLoadModel returns [EObject current=null] : iv_ruleLoadModel= ruleLoadModel EOF ;
    public final EObject entryRuleLoadModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLoadModel = null;


        try {
            // InternalMyDsl.g:221:50: (iv_ruleLoadModel= ruleLoadModel EOF )
            // InternalMyDsl.g:222:2: iv_ruleLoadModel= ruleLoadModel EOF
            {
             newCompositeNode(grammarAccess.getLoadModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLoadModel=ruleLoadModel();

            state._fsp--;

             current =iv_ruleLoadModel; 
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
    // $ANTLR end "entryRuleLoadModel"


    // $ANTLR start "ruleLoadModel"
    // InternalMyDsl.g:228:1: ruleLoadModel returns [EObject current=null] : ( () ( (lv_url_1_0= ruleEString ) )? ) ;
    public final EObject ruleLoadModel() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_url_1_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:234:2: ( ( () ( (lv_url_1_0= ruleEString ) )? ) )
            // InternalMyDsl.g:235:2: ( () ( (lv_url_1_0= ruleEString ) )? )
            {
            // InternalMyDsl.g:235:2: ( () ( (lv_url_1_0= ruleEString ) )? )
            // InternalMyDsl.g:236:3: () ( (lv_url_1_0= ruleEString ) )?
            {
            // InternalMyDsl.g:236:3: ()
            // InternalMyDsl.g:237:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getLoadModelAccess().getLoadModelAction_0(),
            					current);
            			

            }

            // InternalMyDsl.g:243:3: ( (lv_url_1_0= ruleEString ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=RULE_STRING && LA4_0<=RULE_ID)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:244:4: (lv_url_1_0= ruleEString )
                    {
                    // InternalMyDsl.g:244:4: (lv_url_1_0= ruleEString )
                    // InternalMyDsl.g:245:5: lv_url_1_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getLoadModelAccess().getUrlEStringParserRuleCall_1_0());
                    				
                    pushFollow(FOLLOW_2);
                    lv_url_1_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getLoadModelRule());
                    					}
                    					set(
                    						current,
                    						"url",
                    						lv_url_1_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


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
    // $ANTLR end "ruleLoadModel"


    // $ANTLR start "entryRuleTable"
    // InternalMyDsl.g:266:1: entryRuleTable returns [EObject current=null] : iv_ruleTable= ruleTable EOF ;
    public final EObject entryRuleTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTable = null;


        try {
            // InternalMyDsl.g:266:46: (iv_ruleTable= ruleTable EOF )
            // InternalMyDsl.g:267:2: iv_ruleTable= ruleTable EOF
            {
             newCompositeNode(grammarAccess.getTableRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTable=ruleTable();

            state._fsp--;

             current =iv_ruleTable; 
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
    // $ANTLR end "entryRuleTable"


    // $ANTLR start "ruleTable"
    // InternalMyDsl.g:273:1: ruleTable returns [EObject current=null] : ( () otherlv_1= 'Table' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? otherlv_4= '}' ) ;
    public final EObject ruleTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:279:2: ( ( () otherlv_1= 'Table' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? otherlv_4= '}' ) )
            // InternalMyDsl.g:280:2: ( () otherlv_1= 'Table' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? otherlv_4= '}' )
            {
            // InternalMyDsl.g:280:2: ( () otherlv_1= 'Table' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? otherlv_4= '}' )
            // InternalMyDsl.g:281:3: () otherlv_1= 'Table' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? otherlv_4= '}'
            {
            // InternalMyDsl.g:281:3: ()
            // InternalMyDsl.g:282:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getTableAccess().getTableAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getTableAccess().getTableKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getTableAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:296:3: ( (lv_Name_3_0= ruleEString ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( ((LA5_0>=RULE_STRING && LA5_0<=RULE_ID)) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:297:4: (lv_Name_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:297:4: (lv_Name_3_0= ruleEString )
                    // InternalMyDsl.g:298:5: lv_Name_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getTableAccess().getNameEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_Name_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getTableRule());
                    					}
                    					set(
                    						current,
                    						"Name",
                    						lv_Name_3_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getTableAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleTable"


    // $ANTLR start "entryRuleColumn"
    // InternalMyDsl.g:323:1: entryRuleColumn returns [EObject current=null] : iv_ruleColumn= ruleColumn EOF ;
    public final EObject entryRuleColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleColumn = null;


        try {
            // InternalMyDsl.g:323:47: (iv_ruleColumn= ruleColumn EOF )
            // InternalMyDsl.g:324:2: iv_ruleColumn= ruleColumn EOF
            {
             newCompositeNode(grammarAccess.getColumnRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleColumn=ruleColumn();

            state._fsp--;

             current =iv_ruleColumn; 
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
    // $ANTLR end "entryRuleColumn"


    // $ANTLR start "ruleColumn"
    // InternalMyDsl.g:330:1: ruleColumn returns [EObject current=null] : ( () otherlv_1= 'Column' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )? otherlv_6= '}' ) ;
    public final EObject ruleColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_Name_3_0 = null;

        AntlrDatatypeRuleToken lv_tableName_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:336:2: ( ( () otherlv_1= 'Column' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:337:2: ( () otherlv_1= 'Column' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:337:2: ( () otherlv_1= 'Column' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:338:3: () otherlv_1= 'Column' otherlv_2= '{' ( (lv_Name_3_0= ruleEString ) )? (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:338:3: ()
            // InternalMyDsl.g:339:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getColumnAccess().getColumnAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getColumnAccess().getColumnKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_11); 

            			newLeafNode(otherlv_2, grammarAccess.getColumnAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:353:3: ( (lv_Name_3_0= ruleEString ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_ID)) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:354:4: (lv_Name_3_0= ruleEString )
                    {
                    // InternalMyDsl.g:354:4: (lv_Name_3_0= ruleEString )
                    // InternalMyDsl.g:355:5: lv_Name_3_0= ruleEString
                    {

                    					newCompositeNode(grammarAccess.getColumnAccess().getNameEStringParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_12);
                    lv_Name_3_0=ruleEString();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getColumnRule());
                    					}
                    					set(
                    						current,
                    						"Name",
                    						lv_Name_3_0,
                    						"org.xtext.example.mydsl.MyDsl.EString");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:372:3: (otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==19) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:373:4: otherlv_4= 'table' ( (lv_tableName_5_0= ruleEString ) )
                    {
                    otherlv_4=(Token)match(input,19,FOLLOW_13); 

                    				newLeafNode(otherlv_4, grammarAccess.getColumnAccess().getTableKeyword_4_0());
                    			
                    // InternalMyDsl.g:377:4: ( (lv_tableName_5_0= ruleEString ) )
                    // InternalMyDsl.g:378:5: (lv_tableName_5_0= ruleEString )
                    {
                    // InternalMyDsl.g:378:5: (lv_tableName_5_0= ruleEString )
                    // InternalMyDsl.g:379:6: lv_tableName_5_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getColumnAccess().getTableNameEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_tableName_5_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getColumnRule());
                    						}
                    						set(
                    							current,
                    							"tableName",
                    							lv_tableName_5_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getColumnAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleColumn"


    // $ANTLR start "entryRuleAdd"
    // InternalMyDsl.g:405:1: entryRuleAdd returns [EObject current=null] : iv_ruleAdd= ruleAdd EOF ;
    public final EObject entryRuleAdd() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAdd = null;


        try {
            // InternalMyDsl.g:405:44: (iv_ruleAdd= ruleAdd EOF )
            // InternalMyDsl.g:406:2: iv_ruleAdd= ruleAdd EOF
            {
             newCompositeNode(grammarAccess.getAddRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAdd=ruleAdd();

            state._fsp--;

             current =iv_ruleAdd; 
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
    // $ANTLR end "entryRuleAdd"


    // $ANTLR start "ruleAdd"
    // InternalMyDsl.g:412:1: ruleAdd returns [EObject current=null] : ( () otherlv_1= 'Add' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' ) ;
    public final EObject ruleAdd() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_table_3_0 = null;

        EObject lv_column_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:418:2: ( ( () otherlv_1= 'Add' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:419:2: ( () otherlv_1= 'Add' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:419:2: ( () otherlv_1= 'Add' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' )
            // InternalMyDsl.g:420:3: () otherlv_1= 'Add' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:420:3: ()
            // InternalMyDsl.g:421:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getAddAccess().getAddAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getAddAccess().getAddKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getAddAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:435:3: ( (lv_table_3_0= ruleTable ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:436:4: (lv_table_3_0= ruleTable )
                    {
                    // InternalMyDsl.g:436:4: (lv_table_3_0= ruleTable )
                    // InternalMyDsl.g:437:5: lv_table_3_0= ruleTable
                    {

                    					newCompositeNode(grammarAccess.getAddAccess().getTableTableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_table_3_0=ruleTable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAddRule());
                    					}
                    					set(
                    						current,
                    						"table",
                    						lv_table_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Table");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:454:3: ( (lv_column_4_0= ruleColumn ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==18) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:455:4: (lv_column_4_0= ruleColumn )
                    {
                    // InternalMyDsl.g:455:4: (lv_column_4_0= ruleColumn )
                    // InternalMyDsl.g:456:5: lv_column_4_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getAddAccess().getColumnColumnParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_column_4_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getAddRule());
                    					}
                    					set(
                    						current,
                    						"column",
                    						lv_column_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getAddAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleAdd"


    // $ANTLR start "entryRuleDelete"
    // InternalMyDsl.g:481:1: entryRuleDelete returns [EObject current=null] : iv_ruleDelete= ruleDelete EOF ;
    public final EObject entryRuleDelete() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDelete = null;


        try {
            // InternalMyDsl.g:481:47: (iv_ruleDelete= ruleDelete EOF )
            // InternalMyDsl.g:482:2: iv_ruleDelete= ruleDelete EOF
            {
             newCompositeNode(grammarAccess.getDeleteRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDelete=ruleDelete();

            state._fsp--;

             current =iv_ruleDelete; 
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
    // $ANTLR end "entryRuleDelete"


    // $ANTLR start "ruleDelete"
    // InternalMyDsl.g:488:1: ruleDelete returns [EObject current=null] : ( () otherlv_1= 'Delete' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' ) ;
    public final EObject ruleDelete() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_table_3_0 = null;

        EObject lv_column_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:494:2: ( ( () otherlv_1= 'Delete' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:495:2: ( () otherlv_1= 'Delete' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:495:2: ( () otherlv_1= 'Delete' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}' )
            // InternalMyDsl.g:496:3: () otherlv_1= 'Delete' otherlv_2= '{' ( (lv_table_3_0= ruleTable ) )? ( (lv_column_4_0= ruleColumn ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:496:3: ()
            // InternalMyDsl.g:497:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getDeleteAccess().getDeleteAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,21,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getDeleteAccess().getDeleteKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_14); 

            			newLeafNode(otherlv_2, grammarAccess.getDeleteAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:511:3: ( (lv_table_3_0= ruleTable ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==17) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:512:4: (lv_table_3_0= ruleTable )
                    {
                    // InternalMyDsl.g:512:4: (lv_table_3_0= ruleTable )
                    // InternalMyDsl.g:513:5: lv_table_3_0= ruleTable
                    {

                    					newCompositeNode(grammarAccess.getDeleteAccess().getTableTableParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_15);
                    lv_table_3_0=ruleTable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeleteRule());
                    					}
                    					set(
                    						current,
                    						"table",
                    						lv_table_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Table");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:530:3: ( (lv_column_4_0= ruleColumn ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==18) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:531:4: (lv_column_4_0= ruleColumn )
                    {
                    // InternalMyDsl.g:531:4: (lv_column_4_0= ruleColumn )
                    // InternalMyDsl.g:532:5: lv_column_4_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getDeleteAccess().getColumnColumnParserRuleCall_4_0());
                    				
                    pushFollow(FOLLOW_9);
                    lv_column_4_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getDeleteRule());
                    					}
                    					set(
                    						current,
                    						"column",
                    						lv_column_4_0,
                    						"org.xtext.example.mydsl.MyDsl.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getDeleteAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleDelete"


    // $ANTLR start "entryRuleUpdate"
    // InternalMyDsl.g:557:1: entryRuleUpdate returns [EObject current=null] : iv_ruleUpdate= ruleUpdate EOF ;
    public final EObject entryRuleUpdate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUpdate = null;


        try {
            // InternalMyDsl.g:557:47: (iv_ruleUpdate= ruleUpdate EOF )
            // InternalMyDsl.g:558:2: iv_ruleUpdate= ruleUpdate EOF
            {
             newCompositeNode(grammarAccess.getUpdateRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUpdate=ruleUpdate();

            state._fsp--;

             current =iv_ruleUpdate; 
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
    // $ANTLR end "entryRuleUpdate"


    // $ANTLR start "ruleUpdate"
    // InternalMyDsl.g:564:1: ruleUpdate returns [EObject current=null] : (otherlv_0= 'Update' otherlv_1= '{' ( (lv_table_2_0= ruleTable ) )? ( (lv_column_3_0= ruleColumn ) )? otherlv_4= 'newName' ( (lv_newName_5_0= ruleEString ) ) otherlv_6= '}' ) ;
    public final EObject ruleUpdate() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_table_2_0 = null;

        EObject lv_column_3_0 = null;

        AntlrDatatypeRuleToken lv_newName_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:570:2: ( (otherlv_0= 'Update' otherlv_1= '{' ( (lv_table_2_0= ruleTable ) )? ( (lv_column_3_0= ruleColumn ) )? otherlv_4= 'newName' ( (lv_newName_5_0= ruleEString ) ) otherlv_6= '}' ) )
            // InternalMyDsl.g:571:2: (otherlv_0= 'Update' otherlv_1= '{' ( (lv_table_2_0= ruleTable ) )? ( (lv_column_3_0= ruleColumn ) )? otherlv_4= 'newName' ( (lv_newName_5_0= ruleEString ) ) otherlv_6= '}' )
            {
            // InternalMyDsl.g:571:2: (otherlv_0= 'Update' otherlv_1= '{' ( (lv_table_2_0= ruleTable ) )? ( (lv_column_3_0= ruleColumn ) )? otherlv_4= 'newName' ( (lv_newName_5_0= ruleEString ) ) otherlv_6= '}' )
            // InternalMyDsl.g:572:3: otherlv_0= 'Update' otherlv_1= '{' ( (lv_table_2_0= ruleTable ) )? ( (lv_column_3_0= ruleColumn ) )? otherlv_4= 'newName' ( (lv_newName_5_0= ruleEString ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getUpdateAccess().getUpdateKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_16); 

            			newLeafNode(otherlv_1, grammarAccess.getUpdateAccess().getLeftCurlyBracketKeyword_1());
            		
            // InternalMyDsl.g:580:3: ( (lv_table_2_0= ruleTable ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==17) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalMyDsl.g:581:4: (lv_table_2_0= ruleTable )
                    {
                    // InternalMyDsl.g:581:4: (lv_table_2_0= ruleTable )
                    // InternalMyDsl.g:582:5: lv_table_2_0= ruleTable
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getTableTableParserRuleCall_2_0());
                    				
                    pushFollow(FOLLOW_17);
                    lv_table_2_0=ruleTable();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpdateRule());
                    					}
                    					set(
                    						current,
                    						"table",
                    						lv_table_2_0,
                    						"org.xtext.example.mydsl.MyDsl.Table");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            // InternalMyDsl.g:599:3: ( (lv_column_3_0= ruleColumn ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==18) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:600:4: (lv_column_3_0= ruleColumn )
                    {
                    // InternalMyDsl.g:600:4: (lv_column_3_0= ruleColumn )
                    // InternalMyDsl.g:601:5: lv_column_3_0= ruleColumn
                    {

                    					newCompositeNode(grammarAccess.getUpdateAccess().getColumnColumnParserRuleCall_3_0());
                    				
                    pushFollow(FOLLOW_18);
                    lv_column_3_0=ruleColumn();

                    state._fsp--;


                    					if (current==null) {
                    						current = createModelElementForParent(grammarAccess.getUpdateRule());
                    					}
                    					set(
                    						current,
                    						"column",
                    						lv_column_3_0,
                    						"org.xtext.example.mydsl.MyDsl.Column");
                    					afterParserOrEnumRuleCall();
                    				

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_13); 

            			newLeafNode(otherlv_4, grammarAccess.getUpdateAccess().getNewNameKeyword_4());
            		
            // InternalMyDsl.g:622:3: ( (lv_newName_5_0= ruleEString ) )
            // InternalMyDsl.g:623:4: (lv_newName_5_0= ruleEString )
            {
            // InternalMyDsl.g:623:4: (lv_newName_5_0= ruleEString )
            // InternalMyDsl.g:624:5: lv_newName_5_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getUpdateAccess().getNewNameEStringParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_9);
            lv_newName_5_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUpdateRule());
            					}
            					set(
            						current,
            						"newName",
            						lv_newName_5_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getUpdateAccess().getRightCurlyBracketKeyword_6());
            		

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
    // $ANTLR end "ruleUpdate"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:649:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:649:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:650:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:656:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:662:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:663:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:663:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_ID) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:664:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:672:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000014030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000700000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090030L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000070000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000860000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000840000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000800000L});

}