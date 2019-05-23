package org.xtext.example.scoping2.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.scoping2.services.Scoping2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScoping2Parser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'book'", "'import'", "'.*'", "'.'", "'chapter'", "'{'", "'}'", "'ref'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=5;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalScoping2Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalScoping2Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalScoping2Parser.tokenNames; }
    public String getGrammarFileName() { return "InternalScoping2.g"; }



     	private Scoping2GrammarAccess grammarAccess;

        public InternalScoping2Parser(TokenStream input, Scoping2GrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Book";
       	}

       	@Override
       	protected Scoping2GrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleBook"
    // InternalScoping2.g:64:1: entryRuleBook returns [EObject current=null] : iv_ruleBook= ruleBook EOF ;
    public final EObject entryRuleBook() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBook = null;


        try {
            // InternalScoping2.g:64:45: (iv_ruleBook= ruleBook EOF )
            // InternalScoping2.g:65:2: iv_ruleBook= ruleBook EOF
            {
             newCompositeNode(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleBook=ruleBook();

            state._fsp--;

             current =iv_ruleBook; 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalScoping2.g:71:1: ruleBook returns [EObject current=null] : (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* ) ;
    public final EObject ruleBook() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_2_0 = null;

        EObject lv_chapters_3_0 = null;



        	enterRule();

        try {
            // InternalScoping2.g:77:2: ( (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* ) )
            // InternalScoping2.g:78:2: (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* )
            {
            // InternalScoping2.g:78:2: (otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )* )
            // InternalScoping2.g:79:3: otherlv_0= 'book' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_imports_2_0= ruleDImport ) )* ( (lv_chapters_3_0= ruleChapter ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getBookAccess().getBookKeyword_0());
            		
            // InternalScoping2.g:83:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalScoping2.g:84:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalScoping2.g:84:4: (lv_name_1_0= ruleQualifiedName )
            // InternalScoping2.g:85:5: lv_name_1_0= ruleQualifiedName
            {

            					newCompositeNode(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getBookRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.xtext.example.scoping2.Scoping2.QualifiedName");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalScoping2.g:102:3: ( (lv_imports_2_0= ruleDImport ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalScoping2.g:103:4: (lv_imports_2_0= ruleDImport )
            	    {
            	    // InternalScoping2.g:103:4: (lv_imports_2_0= ruleDImport )
            	    // InternalScoping2.g:104:5: lv_imports_2_0= ruleDImport
            	    {

            	    					newCompositeNode(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_imports_2_0=ruleDImport();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBookRule());
            	    					}
            	    					add(
            	    						current,
            	    						"imports",
            	    						lv_imports_2_0,
            	    						"org.xtext.example.scoping2.Scoping2.DImport");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalScoping2.g:121:3: ( (lv_chapters_3_0= ruleChapter ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScoping2.g:122:4: (lv_chapters_3_0= ruleChapter )
            	    {
            	    // InternalScoping2.g:122:4: (lv_chapters_3_0= ruleChapter )
            	    // InternalScoping2.g:123:5: lv_chapters_3_0= ruleChapter
            	    {

            	    					newCompositeNode(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_chapters_3_0=ruleChapter();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getBookRule());
            	    					}
            	    					add(
            	    						current,
            	    						"chapters",
            	    						lv_chapters_3_0,
            	    						"org.xtext.example.scoping2.Scoping2.Chapter");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleDImport"
    // InternalScoping2.g:144:1: entryRuleDImport returns [EObject current=null] : iv_ruleDImport= ruleDImport EOF ;
    public final EObject entryRuleDImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDImport = null;


        try {
            // InternalScoping2.g:144:48: (iv_ruleDImport= ruleDImport EOF )
            // InternalScoping2.g:145:2: iv_ruleDImport= ruleDImport EOF
            {
             newCompositeNode(grammarAccess.getDImportRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleDImport=ruleDImport();

            state._fsp--;

             current =iv_ruleDImport; 
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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalScoping2.g:151:1: ruleDImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) ;
    public final EObject ruleDImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalScoping2.g:157:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) ) )
            // InternalScoping2.g:158:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            {
            // InternalScoping2.g:158:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) )
            // InternalScoping2.g:159:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getDImportAccess().getImportKeyword_0());
            		
            // InternalScoping2.g:163:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalScoping2.g:164:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalScoping2.g:164:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalScoping2.g:165:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {

            					newCompositeNode(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_2);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getDImportRule());
            					}
            					set(
            						current,
            						"importedNamespace",
            						lv_importedNamespace_1_0,
            						"org.xtext.example.scoping2.Scoping2.QualifiedNameWithWildcard");
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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalScoping2.g:186:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalScoping2.g:186:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalScoping2.g:187:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;

             current =iv_ruleQualifiedNameWithWildcard.getText(); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalScoping2.g:193:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalScoping2.g:199:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalScoping2.g:200:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalScoping2.g:200:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalScoping2.g:201:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {

            			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
            		
            pushFollow(FOLLOW_6);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;


            			current.merge(this_QualifiedName_0);
            		

            			afterParserOrEnumRuleCall();
            		
            // InternalScoping2.g:211:3: (kw= '.*' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==13) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalScoping2.g:212:4: kw= '.*'
                    {
                    kw=(Token)match(input,13,FOLLOW_2); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                    			

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalScoping2.g:222:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalScoping2.g:222:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalScoping2.g:223:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalScoping2.g:229:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;


        	enterRule();

        try {
            // InternalScoping2.g:235:2: ( (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* ) )
            // InternalScoping2.g:236:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            {
            // InternalScoping2.g:236:2: (this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )* )
            // InternalScoping2.g:237:3: this_ID_0= RULE_ID (kw= '.' this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            			current.merge(this_ID_0);
            		

            			newLeafNode(this_ID_0, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0());
            		
            // InternalScoping2.g:244:3: (kw= '.' this_ID_2= RULE_ID )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalScoping2.g:245:4: kw= '.' this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,14,FOLLOW_3); 

            	    				current.merge(kw);
            	    				newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	    			
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_7); 

            	    				current.merge(this_ID_2);
            	    			

            	    				newLeafNode(this_ID_2, grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1());
            	    			

            	    }
            	    break;

            	default :
            	    break loop4;
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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleChapter"
    // InternalScoping2.g:262:1: entryRuleChapter returns [EObject current=null] : iv_ruleChapter= ruleChapter EOF ;
    public final EObject entryRuleChapter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleChapter = null;


        try {
            // InternalScoping2.g:262:48: (iv_ruleChapter= ruleChapter EOF )
            // InternalScoping2.g:263:2: iv_ruleChapter= ruleChapter EOF
            {
             newCompositeNode(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleChapter=ruleChapter();

            state._fsp--;

             current =iv_ruleChapter; 
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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalScoping2.g:269:1: ruleChapter returns [EObject current=null] : (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )* otherlv_5= '}' ) ;
    public final EObject ruleChapter() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        EObject lv_paragraphs_3_0 = null;

        EObject lv_references_4_0 = null;



        	enterRule();

        try {
            // InternalScoping2.g:275:2: ( (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )* otherlv_5= '}' ) )
            // InternalScoping2.g:276:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )* otherlv_5= '}' )
            {
            // InternalScoping2.g:276:2: (otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )* otherlv_5= '}' )
            // InternalScoping2.g:277:3: otherlv_0= 'chapter' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '{' ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )* otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getChapterAccess().getChapterKeyword_0());
            		
            // InternalScoping2.g:281:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalScoping2.g:282:4: (lv_name_1_0= RULE_ID )
            {
            // InternalScoping2.g:282:4: (lv_name_1_0= RULE_ID )
            // InternalScoping2.g:283:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_8); 

            					newLeafNode(lv_name_1_0, grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getChapterRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_2, grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalScoping2.g:303:3: ( ( (lv_paragraphs_3_0= ruleParagraph ) ) | ( (lv_references_4_0= ruleReference ) ) )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==RULE_STRING) ) {
                    alt5=1;
                }
                else if ( (LA5_0==18) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScoping2.g:304:4: ( (lv_paragraphs_3_0= ruleParagraph ) )
            	    {
            	    // InternalScoping2.g:304:4: ( (lv_paragraphs_3_0= ruleParagraph ) )
            	    // InternalScoping2.g:305:5: (lv_paragraphs_3_0= ruleParagraph )
            	    {
            	    // InternalScoping2.g:305:5: (lv_paragraphs_3_0= ruleParagraph )
            	    // InternalScoping2.g:306:6: lv_paragraphs_3_0= ruleParagraph
            	    {

            	    						newCompositeNode(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_0_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_paragraphs_3_0=ruleParagraph();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChapterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"paragraphs",
            	    							lv_paragraphs_3_0,
            	    							"org.xtext.example.scoping2.Scoping2.Paragraph");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // InternalScoping2.g:324:4: ( (lv_references_4_0= ruleReference ) )
            	    {
            	    // InternalScoping2.g:324:4: ( (lv_references_4_0= ruleReference ) )
            	    // InternalScoping2.g:325:5: (lv_references_4_0= ruleReference )
            	    {
            	    // InternalScoping2.g:325:5: (lv_references_4_0= ruleReference )
            	    // InternalScoping2.g:326:6: lv_references_4_0= ruleReference
            	    {

            	    						newCompositeNode(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_references_4_0=ruleReference();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getChapterRule());
            	    						}
            	    						add(
            	    							current,
            	    							"references",
            	    							lv_references_4_0,
            	    							"org.xtext.example.scoping2.Scoping2.Reference");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            otherlv_5=(Token)match(input,17,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleParagraph"
    // InternalScoping2.g:352:1: entryRuleParagraph returns [EObject current=null] : iv_ruleParagraph= ruleParagraph EOF ;
    public final EObject entryRuleParagraph() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleParagraph = null;


        try {
            // InternalScoping2.g:352:50: (iv_ruleParagraph= ruleParagraph EOF )
            // InternalScoping2.g:353:2: iv_ruleParagraph= ruleParagraph EOF
            {
             newCompositeNode(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleParagraph=ruleParagraph();

            state._fsp--;

             current =iv_ruleParagraph; 
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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalScoping2.g:359:1: ruleParagraph returns [EObject current=null] : ( (lv_text_0_0= RULE_STRING ) ) ;
    public final EObject ruleParagraph() throws RecognitionException {
        EObject current = null;

        Token lv_text_0_0=null;


        	enterRule();

        try {
            // InternalScoping2.g:365:2: ( ( (lv_text_0_0= RULE_STRING ) ) )
            // InternalScoping2.g:366:2: ( (lv_text_0_0= RULE_STRING ) )
            {
            // InternalScoping2.g:366:2: ( (lv_text_0_0= RULE_STRING ) )
            // InternalScoping2.g:367:3: (lv_text_0_0= RULE_STRING )
            {
            // InternalScoping2.g:367:3: (lv_text_0_0= RULE_STRING )
            // InternalScoping2.g:368:4: lv_text_0_0= RULE_STRING
            {
            lv_text_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_text_0_0, grammarAccess.getParagraphAccess().getTextSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getParagraphRule());
            				}
            				setWithLastConsumed(
            					current,
            					"text",
            					lv_text_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // InternalScoping2.g:387:1: entryRuleReference returns [EObject current=null] : iv_ruleReference= ruleReference EOF ;
    public final EObject entryRuleReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleReference = null;


        try {
            // InternalScoping2.g:387:50: (iv_ruleReference= ruleReference EOF )
            // InternalScoping2.g:388:2: iv_ruleReference= ruleReference EOF
            {
             newCompositeNode(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleReference=ruleReference();

            state._fsp--;

             current =iv_ruleReference; 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalScoping2.g:394:1: ruleReference returns [EObject current=null] : (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;


        	enterRule();

        try {
            // InternalScoping2.g:400:2: ( (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) ) )
            // InternalScoping2.g:401:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            {
            // InternalScoping2.g:401:2: (otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) ) )
            // InternalScoping2.g:402:3: otherlv_0= 'ref' ( (otherlv_1= RULE_ID ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getReferenceAccess().getRefKeyword_0());
            		
            // InternalScoping2.g:406:3: ( (otherlv_1= RULE_ID ) )
            // InternalScoping2.g:407:4: (otherlv_1= RULE_ID )
            {
            // InternalScoping2.g:407:4: (otherlv_1= RULE_ID )
            // InternalScoping2.g:408:5: otherlv_1= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getReferenceRule());
            					}
            				
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_2); 

            					newLeafNode(otherlv_1, grammarAccess.getReferenceAccess().getRefChapterCrossReference_1_0());
            				

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
    // $ANTLR end "ruleReference"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000060020L});

}