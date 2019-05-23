package org.xtext.example.scoping2.ide.contentassist.antlr.internal;

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
import org.xtext.example.scoping2.services.Scoping2GrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalScoping2Parser extends AbstractInternalContentAssistParser {
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

    	public void setGrammarAccess(Scoping2GrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleBook"
    // InternalScoping2.g:53:1: entryRuleBook : ruleBook EOF ;
    public final void entryRuleBook() throws RecognitionException {
        try {
            // InternalScoping2.g:54:1: ( ruleBook EOF )
            // InternalScoping2.g:55:1: ruleBook EOF
            {
             before(grammarAccess.getBookRule()); 
            pushFollow(FOLLOW_1);
            ruleBook();

            state._fsp--;

             after(grammarAccess.getBookRule()); 
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
    // $ANTLR end "entryRuleBook"


    // $ANTLR start "ruleBook"
    // InternalScoping2.g:62:1: ruleBook : ( ( rule__Book__Group__0 ) ) ;
    public final void ruleBook() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:66:2: ( ( ( rule__Book__Group__0 ) ) )
            // InternalScoping2.g:67:2: ( ( rule__Book__Group__0 ) )
            {
            // InternalScoping2.g:67:2: ( ( rule__Book__Group__0 ) )
            // InternalScoping2.g:68:3: ( rule__Book__Group__0 )
            {
             before(grammarAccess.getBookAccess().getGroup()); 
            // InternalScoping2.g:69:3: ( rule__Book__Group__0 )
            // InternalScoping2.g:69:4: rule__Book__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getGroup()); 

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
    // $ANTLR end "ruleBook"


    // $ANTLR start "entryRuleDImport"
    // InternalScoping2.g:78:1: entryRuleDImport : ruleDImport EOF ;
    public final void entryRuleDImport() throws RecognitionException {
        try {
            // InternalScoping2.g:79:1: ( ruleDImport EOF )
            // InternalScoping2.g:80:1: ruleDImport EOF
            {
             before(grammarAccess.getDImportRule()); 
            pushFollow(FOLLOW_1);
            ruleDImport();

            state._fsp--;

             after(grammarAccess.getDImportRule()); 
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
    // $ANTLR end "entryRuleDImport"


    // $ANTLR start "ruleDImport"
    // InternalScoping2.g:87:1: ruleDImport : ( ( rule__DImport__Group__0 ) ) ;
    public final void ruleDImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:91:2: ( ( ( rule__DImport__Group__0 ) ) )
            // InternalScoping2.g:92:2: ( ( rule__DImport__Group__0 ) )
            {
            // InternalScoping2.g:92:2: ( ( rule__DImport__Group__0 ) )
            // InternalScoping2.g:93:3: ( rule__DImport__Group__0 )
            {
             before(grammarAccess.getDImportAccess().getGroup()); 
            // InternalScoping2.g:94:3: ( rule__DImport__Group__0 )
            // InternalScoping2.g:94:4: rule__DImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__DImport__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getDImportAccess().getGroup()); 

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
    // $ANTLR end "ruleDImport"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalScoping2.g:103:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalScoping2.g:104:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalScoping2.g:105:1: ruleQualifiedNameWithWildcard EOF
            {
             before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardRule()); 
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
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalScoping2.g:112:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:116:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalScoping2.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalScoping2.g:117:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalScoping2.g:118:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            // InternalScoping2.g:119:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalScoping2.g:119:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalScoping2.g:128:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalScoping2.g:129:1: ( ruleQualifiedName EOF )
            // InternalScoping2.g:130:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
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
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalScoping2.g:137:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:141:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalScoping2.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalScoping2.g:142:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalScoping2.g:143:3: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // InternalScoping2.g:144:3: ( rule__QualifiedName__Group__0 )
            // InternalScoping2.g:144:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

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
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleChapter"
    // InternalScoping2.g:153:1: entryRuleChapter : ruleChapter EOF ;
    public final void entryRuleChapter() throws RecognitionException {
        try {
            // InternalScoping2.g:154:1: ( ruleChapter EOF )
            // InternalScoping2.g:155:1: ruleChapter EOF
            {
             before(grammarAccess.getChapterRule()); 
            pushFollow(FOLLOW_1);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getChapterRule()); 
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
    // $ANTLR end "entryRuleChapter"


    // $ANTLR start "ruleChapter"
    // InternalScoping2.g:162:1: ruleChapter : ( ( rule__Chapter__Group__0 ) ) ;
    public final void ruleChapter() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:166:2: ( ( ( rule__Chapter__Group__0 ) ) )
            // InternalScoping2.g:167:2: ( ( rule__Chapter__Group__0 ) )
            {
            // InternalScoping2.g:167:2: ( ( rule__Chapter__Group__0 ) )
            // InternalScoping2.g:168:3: ( rule__Chapter__Group__0 )
            {
             before(grammarAccess.getChapterAccess().getGroup()); 
            // InternalScoping2.g:169:3: ( rule__Chapter__Group__0 )
            // InternalScoping2.g:169:4: rule__Chapter__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getGroup()); 

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
    // $ANTLR end "ruleChapter"


    // $ANTLR start "entryRuleParagraph"
    // InternalScoping2.g:178:1: entryRuleParagraph : ruleParagraph EOF ;
    public final void entryRuleParagraph() throws RecognitionException {
        try {
            // InternalScoping2.g:179:1: ( ruleParagraph EOF )
            // InternalScoping2.g:180:1: ruleParagraph EOF
            {
             before(grammarAccess.getParagraphRule()); 
            pushFollow(FOLLOW_1);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getParagraphRule()); 
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
    // $ANTLR end "entryRuleParagraph"


    // $ANTLR start "ruleParagraph"
    // InternalScoping2.g:187:1: ruleParagraph : ( ( rule__Paragraph__TextAssignment ) ) ;
    public final void ruleParagraph() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:191:2: ( ( ( rule__Paragraph__TextAssignment ) ) )
            // InternalScoping2.g:192:2: ( ( rule__Paragraph__TextAssignment ) )
            {
            // InternalScoping2.g:192:2: ( ( rule__Paragraph__TextAssignment ) )
            // InternalScoping2.g:193:3: ( rule__Paragraph__TextAssignment )
            {
             before(grammarAccess.getParagraphAccess().getTextAssignment()); 
            // InternalScoping2.g:194:3: ( rule__Paragraph__TextAssignment )
            // InternalScoping2.g:194:4: rule__Paragraph__TextAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Paragraph__TextAssignment();

            state._fsp--;


            }

             after(grammarAccess.getParagraphAccess().getTextAssignment()); 

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
    // $ANTLR end "ruleParagraph"


    // $ANTLR start "entryRuleReference"
    // InternalScoping2.g:203:1: entryRuleReference : ruleReference EOF ;
    public final void entryRuleReference() throws RecognitionException {
        try {
            // InternalScoping2.g:204:1: ( ruleReference EOF )
            // InternalScoping2.g:205:1: ruleReference EOF
            {
             before(grammarAccess.getReferenceRule()); 
            pushFollow(FOLLOW_1);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getReferenceRule()); 
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
    // $ANTLR end "entryRuleReference"


    // $ANTLR start "ruleReference"
    // InternalScoping2.g:212:1: ruleReference : ( ( rule__Reference__Group__0 ) ) ;
    public final void ruleReference() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:216:2: ( ( ( rule__Reference__Group__0 ) ) )
            // InternalScoping2.g:217:2: ( ( rule__Reference__Group__0 ) )
            {
            // InternalScoping2.g:217:2: ( ( rule__Reference__Group__0 ) )
            // InternalScoping2.g:218:3: ( rule__Reference__Group__0 )
            {
             before(grammarAccess.getReferenceAccess().getGroup()); 
            // InternalScoping2.g:219:3: ( rule__Reference__Group__0 )
            // InternalScoping2.g:219:4: rule__Reference__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getGroup()); 

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
    // $ANTLR end "ruleReference"


    // $ANTLR start "rule__Chapter__Alternatives_3"
    // InternalScoping2.g:227:1: rule__Chapter__Alternatives_3 : ( ( ( rule__Chapter__ParagraphsAssignment_3_0 ) ) | ( ( rule__Chapter__ReferencesAssignment_3_1 ) ) );
    public final void rule__Chapter__Alternatives_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:231:1: ( ( ( rule__Chapter__ParagraphsAssignment_3_0 ) ) | ( ( rule__Chapter__ReferencesAssignment_3_1 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
                alt1=1;
            }
            else if ( (LA1_0==18) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalScoping2.g:232:2: ( ( rule__Chapter__ParagraphsAssignment_3_0 ) )
                    {
                    // InternalScoping2.g:232:2: ( ( rule__Chapter__ParagraphsAssignment_3_0 ) )
                    // InternalScoping2.g:233:3: ( rule__Chapter__ParagraphsAssignment_3_0 )
                    {
                     before(grammarAccess.getChapterAccess().getParagraphsAssignment_3_0()); 
                    // InternalScoping2.g:234:3: ( rule__Chapter__ParagraphsAssignment_3_0 )
                    // InternalScoping2.g:234:4: rule__Chapter__ParagraphsAssignment_3_0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__ParagraphsAssignment_3_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getParagraphsAssignment_3_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalScoping2.g:238:2: ( ( rule__Chapter__ReferencesAssignment_3_1 ) )
                    {
                    // InternalScoping2.g:238:2: ( ( rule__Chapter__ReferencesAssignment_3_1 ) )
                    // InternalScoping2.g:239:3: ( rule__Chapter__ReferencesAssignment_3_1 )
                    {
                     before(grammarAccess.getChapterAccess().getReferencesAssignment_3_1()); 
                    // InternalScoping2.g:240:3: ( rule__Chapter__ReferencesAssignment_3_1 )
                    // InternalScoping2.g:240:4: rule__Chapter__ReferencesAssignment_3_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Chapter__ReferencesAssignment_3_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getChapterAccess().getReferencesAssignment_3_1()); 

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
    // $ANTLR end "rule__Chapter__Alternatives_3"


    // $ANTLR start "rule__Book__Group__0"
    // InternalScoping2.g:248:1: rule__Book__Group__0 : rule__Book__Group__0__Impl rule__Book__Group__1 ;
    public final void rule__Book__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:252:1: ( rule__Book__Group__0__Impl rule__Book__Group__1 )
            // InternalScoping2.g:253:2: rule__Book__Group__0__Impl rule__Book__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Book__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__1();

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
    // $ANTLR end "rule__Book__Group__0"


    // $ANTLR start "rule__Book__Group__0__Impl"
    // InternalScoping2.g:260:1: rule__Book__Group__0__Impl : ( 'book' ) ;
    public final void rule__Book__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:264:1: ( ( 'book' ) )
            // InternalScoping2.g:265:1: ( 'book' )
            {
            // InternalScoping2.g:265:1: ( 'book' )
            // InternalScoping2.g:266:2: 'book'
            {
             before(grammarAccess.getBookAccess().getBookKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getBookAccess().getBookKeyword_0()); 

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
    // $ANTLR end "rule__Book__Group__0__Impl"


    // $ANTLR start "rule__Book__Group__1"
    // InternalScoping2.g:275:1: rule__Book__Group__1 : rule__Book__Group__1__Impl rule__Book__Group__2 ;
    public final void rule__Book__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:279:1: ( rule__Book__Group__1__Impl rule__Book__Group__2 )
            // InternalScoping2.g:280:2: rule__Book__Group__1__Impl rule__Book__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__2();

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
    // $ANTLR end "rule__Book__Group__1"


    // $ANTLR start "rule__Book__Group__1__Impl"
    // InternalScoping2.g:287:1: rule__Book__Group__1__Impl : ( ( rule__Book__NameAssignment_1 ) ) ;
    public final void rule__Book__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:291:1: ( ( ( rule__Book__NameAssignment_1 ) ) )
            // InternalScoping2.g:292:1: ( ( rule__Book__NameAssignment_1 ) )
            {
            // InternalScoping2.g:292:1: ( ( rule__Book__NameAssignment_1 ) )
            // InternalScoping2.g:293:2: ( rule__Book__NameAssignment_1 )
            {
             before(grammarAccess.getBookAccess().getNameAssignment_1()); 
            // InternalScoping2.g:294:2: ( rule__Book__NameAssignment_1 )
            // InternalScoping2.g:294:3: rule__Book__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Book__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getBookAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Book__Group__1__Impl"


    // $ANTLR start "rule__Book__Group__2"
    // InternalScoping2.g:302:1: rule__Book__Group__2 : rule__Book__Group__2__Impl rule__Book__Group__3 ;
    public final void rule__Book__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:306:1: ( rule__Book__Group__2__Impl rule__Book__Group__3 )
            // InternalScoping2.g:307:2: rule__Book__Group__2__Impl rule__Book__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Book__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Book__Group__3();

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
    // $ANTLR end "rule__Book__Group__2"


    // $ANTLR start "rule__Book__Group__2__Impl"
    // InternalScoping2.g:314:1: rule__Book__Group__2__Impl : ( ( rule__Book__ImportsAssignment_2 )* ) ;
    public final void rule__Book__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:318:1: ( ( ( rule__Book__ImportsAssignment_2 )* ) )
            // InternalScoping2.g:319:1: ( ( rule__Book__ImportsAssignment_2 )* )
            {
            // InternalScoping2.g:319:1: ( ( rule__Book__ImportsAssignment_2 )* )
            // InternalScoping2.g:320:2: ( rule__Book__ImportsAssignment_2 )*
            {
             before(grammarAccess.getBookAccess().getImportsAssignment_2()); 
            // InternalScoping2.g:321:2: ( rule__Book__ImportsAssignment_2 )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalScoping2.g:321:3: rule__Book__ImportsAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Book__ImportsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getBookAccess().getImportsAssignment_2()); 

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
    // $ANTLR end "rule__Book__Group__2__Impl"


    // $ANTLR start "rule__Book__Group__3"
    // InternalScoping2.g:329:1: rule__Book__Group__3 : rule__Book__Group__3__Impl ;
    public final void rule__Book__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:333:1: ( rule__Book__Group__3__Impl )
            // InternalScoping2.g:334:2: rule__Book__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Book__Group__3__Impl();

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
    // $ANTLR end "rule__Book__Group__3"


    // $ANTLR start "rule__Book__Group__3__Impl"
    // InternalScoping2.g:340:1: rule__Book__Group__3__Impl : ( ( rule__Book__ChaptersAssignment_3 )* ) ;
    public final void rule__Book__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:344:1: ( ( ( rule__Book__ChaptersAssignment_3 )* ) )
            // InternalScoping2.g:345:1: ( ( rule__Book__ChaptersAssignment_3 )* )
            {
            // InternalScoping2.g:345:1: ( ( rule__Book__ChaptersAssignment_3 )* )
            // InternalScoping2.g:346:2: ( rule__Book__ChaptersAssignment_3 )*
            {
             before(grammarAccess.getBookAccess().getChaptersAssignment_3()); 
            // InternalScoping2.g:347:2: ( rule__Book__ChaptersAssignment_3 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==15) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalScoping2.g:347:3: rule__Book__ChaptersAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Book__ChaptersAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getBookAccess().getChaptersAssignment_3()); 

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
    // $ANTLR end "rule__Book__Group__3__Impl"


    // $ANTLR start "rule__DImport__Group__0"
    // InternalScoping2.g:356:1: rule__DImport__Group__0 : rule__DImport__Group__0__Impl rule__DImport__Group__1 ;
    public final void rule__DImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:360:1: ( rule__DImport__Group__0__Impl rule__DImport__Group__1 )
            // InternalScoping2.g:361:2: rule__DImport__Group__0__Impl rule__DImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__DImport__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__DImport__Group__1();

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
    // $ANTLR end "rule__DImport__Group__0"


    // $ANTLR start "rule__DImport__Group__0__Impl"
    // InternalScoping2.g:368:1: rule__DImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__DImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:372:1: ( ( 'import' ) )
            // InternalScoping2.g:373:1: ( 'import' )
            {
            // InternalScoping2.g:373:1: ( 'import' )
            // InternalScoping2.g:374:2: 'import'
            {
             before(grammarAccess.getDImportAccess().getImportKeyword_0()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getDImportAccess().getImportKeyword_0()); 

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
    // $ANTLR end "rule__DImport__Group__0__Impl"


    // $ANTLR start "rule__DImport__Group__1"
    // InternalScoping2.g:383:1: rule__DImport__Group__1 : rule__DImport__Group__1__Impl ;
    public final void rule__DImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:387:1: ( rule__DImport__Group__1__Impl )
            // InternalScoping2.g:388:2: rule__DImport__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__DImport__Group__1__Impl();

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
    // $ANTLR end "rule__DImport__Group__1"


    // $ANTLR start "rule__DImport__Group__1__Impl"
    // InternalScoping2.g:394:1: rule__DImport__Group__1__Impl : ( ( rule__DImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__DImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:398:1: ( ( ( rule__DImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalScoping2.g:399:1: ( ( rule__DImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalScoping2.g:399:1: ( ( rule__DImport__ImportedNamespaceAssignment_1 ) )
            // InternalScoping2.g:400:2: ( rule__DImport__ImportedNamespaceAssignment_1 )
            {
             before(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1()); 
            // InternalScoping2.g:401:2: ( rule__DImport__ImportedNamespaceAssignment_1 )
            // InternalScoping2.g:401:3: rule__DImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__DImport__ImportedNamespaceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getDImportAccess().getImportedNamespaceAssignment_1()); 

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
    // $ANTLR end "rule__DImport__Group__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalScoping2.g:410:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:414:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalScoping2.g:415:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_7);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalScoping2.g:422:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:426:1: ( ( ruleQualifiedName ) )
            // InternalScoping2.g:427:1: ( ruleQualifiedName )
            {
            // InternalScoping2.g:427:1: ( ruleQualifiedName )
            // InternalScoping2.g:428:2: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalScoping2.g:437:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:441:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalScoping2.g:442:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalScoping2.g:448:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:452:1: ( ( ( '.*' )? ) )
            // InternalScoping2.g:453:1: ( ( '.*' )? )
            {
            // InternalScoping2.g:453:1: ( ( '.*' )? )
            // InternalScoping2.g:454:2: ( '.*' )?
            {
             before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            // InternalScoping2.g:455:2: ( '.*' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==13) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalScoping2.g:455:3: '.*'
                    {
                    match(input,13,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 

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
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalScoping2.g:464:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:468:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalScoping2.g:469:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

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
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalScoping2.g:476:1: rule__QualifiedName__Group__0__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:480:1: ( ( RULE_ID ) )
            // InternalScoping2.g:481:1: ( RULE_ID )
            {
            // InternalScoping2.g:481:1: ( RULE_ID )
            // InternalScoping2.g:482:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalScoping2.g:491:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:495:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalScoping2.g:496:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalScoping2.g:502:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:506:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalScoping2.g:507:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalScoping2.g:507:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalScoping2.g:508:2: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // InternalScoping2.g:509:2: ( rule__QualifiedName__Group_1__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalScoping2.g:509:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalScoping2.g:518:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:522:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalScoping2.g:523:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

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
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalScoping2.g:530:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:534:1: ( ( '.' ) )
            // InternalScoping2.g:535:1: ( '.' )
            {
            // InternalScoping2.g:535:1: ( '.' )
            // InternalScoping2.g:536:2: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalScoping2.g:545:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:549:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalScoping2.g:550:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

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
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalScoping2.g:556:1: rule__QualifiedName__Group_1__1__Impl : ( RULE_ID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:560:1: ( ( RULE_ID ) )
            // InternalScoping2.g:561:1: ( RULE_ID )
            {
            // InternalScoping2.g:561:1: ( RULE_ID )
            // InternalScoping2.g:562:2: RULE_ID
            {
             before(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getQualifiedNameAccess().getIDTerminalRuleCall_1_1()); 

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
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Chapter__Group__0"
    // InternalScoping2.g:572:1: rule__Chapter__Group__0 : rule__Chapter__Group__0__Impl rule__Chapter__Group__1 ;
    public final void rule__Chapter__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:576:1: ( rule__Chapter__Group__0__Impl rule__Chapter__Group__1 )
            // InternalScoping2.g:577:2: rule__Chapter__Group__0__Impl rule__Chapter__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Chapter__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__1();

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
    // $ANTLR end "rule__Chapter__Group__0"


    // $ANTLR start "rule__Chapter__Group__0__Impl"
    // InternalScoping2.g:584:1: rule__Chapter__Group__0__Impl : ( 'chapter' ) ;
    public final void rule__Chapter__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:588:1: ( ( 'chapter' ) )
            // InternalScoping2.g:589:1: ( 'chapter' )
            {
            // InternalScoping2.g:589:1: ( 'chapter' )
            // InternalScoping2.g:590:2: 'chapter'
            {
             before(grammarAccess.getChapterAccess().getChapterKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getChapterKeyword_0()); 

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
    // $ANTLR end "rule__Chapter__Group__0__Impl"


    // $ANTLR start "rule__Chapter__Group__1"
    // InternalScoping2.g:599:1: rule__Chapter__Group__1 : rule__Chapter__Group__1__Impl rule__Chapter__Group__2 ;
    public final void rule__Chapter__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:603:1: ( rule__Chapter__Group__1__Impl rule__Chapter__Group__2 )
            // InternalScoping2.g:604:2: rule__Chapter__Group__1__Impl rule__Chapter__Group__2
            {
            pushFollow(FOLLOW_10);
            rule__Chapter__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__2();

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
    // $ANTLR end "rule__Chapter__Group__1"


    // $ANTLR start "rule__Chapter__Group__1__Impl"
    // InternalScoping2.g:611:1: rule__Chapter__Group__1__Impl : ( ( rule__Chapter__NameAssignment_1 ) ) ;
    public final void rule__Chapter__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:615:1: ( ( ( rule__Chapter__NameAssignment_1 ) ) )
            // InternalScoping2.g:616:1: ( ( rule__Chapter__NameAssignment_1 ) )
            {
            // InternalScoping2.g:616:1: ( ( rule__Chapter__NameAssignment_1 ) )
            // InternalScoping2.g:617:2: ( rule__Chapter__NameAssignment_1 )
            {
             before(grammarAccess.getChapterAccess().getNameAssignment_1()); 
            // InternalScoping2.g:618:2: ( rule__Chapter__NameAssignment_1 )
            // InternalScoping2.g:618:3: rule__Chapter__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getChapterAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Chapter__Group__1__Impl"


    // $ANTLR start "rule__Chapter__Group__2"
    // InternalScoping2.g:626:1: rule__Chapter__Group__2 : rule__Chapter__Group__2__Impl rule__Chapter__Group__3 ;
    public final void rule__Chapter__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:630:1: ( rule__Chapter__Group__2__Impl rule__Chapter__Group__3 )
            // InternalScoping2.g:631:2: rule__Chapter__Group__2__Impl rule__Chapter__Group__3
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__3();

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
    // $ANTLR end "rule__Chapter__Group__2"


    // $ANTLR start "rule__Chapter__Group__2__Impl"
    // InternalScoping2.g:638:1: rule__Chapter__Group__2__Impl : ( '{' ) ;
    public final void rule__Chapter__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:642:1: ( ( '{' ) )
            // InternalScoping2.g:643:1: ( '{' )
            {
            // InternalScoping2.g:643:1: ( '{' )
            // InternalScoping2.g:644:2: '{'
            {
             before(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Chapter__Group__2__Impl"


    // $ANTLR start "rule__Chapter__Group__3"
    // InternalScoping2.g:653:1: rule__Chapter__Group__3 : rule__Chapter__Group__3__Impl rule__Chapter__Group__4 ;
    public final void rule__Chapter__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:657:1: ( rule__Chapter__Group__3__Impl rule__Chapter__Group__4 )
            // InternalScoping2.g:658:2: rule__Chapter__Group__3__Impl rule__Chapter__Group__4
            {
            pushFollow(FOLLOW_11);
            rule__Chapter__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4();

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
    // $ANTLR end "rule__Chapter__Group__3"


    // $ANTLR start "rule__Chapter__Group__3__Impl"
    // InternalScoping2.g:665:1: rule__Chapter__Group__3__Impl : ( ( rule__Chapter__Alternatives_3 )* ) ;
    public final void rule__Chapter__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:669:1: ( ( ( rule__Chapter__Alternatives_3 )* ) )
            // InternalScoping2.g:670:1: ( ( rule__Chapter__Alternatives_3 )* )
            {
            // InternalScoping2.g:670:1: ( ( rule__Chapter__Alternatives_3 )* )
            // InternalScoping2.g:671:2: ( rule__Chapter__Alternatives_3 )*
            {
             before(grammarAccess.getChapterAccess().getAlternatives_3()); 
            // InternalScoping2.g:672:2: ( rule__Chapter__Alternatives_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==RULE_STRING||LA6_0==18) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalScoping2.g:672:3: rule__Chapter__Alternatives_3
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Chapter__Alternatives_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getChapterAccess().getAlternatives_3()); 

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
    // $ANTLR end "rule__Chapter__Group__3__Impl"


    // $ANTLR start "rule__Chapter__Group__4"
    // InternalScoping2.g:680:1: rule__Chapter__Group__4 : rule__Chapter__Group__4__Impl ;
    public final void rule__Chapter__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:684:1: ( rule__Chapter__Group__4__Impl )
            // InternalScoping2.g:685:2: rule__Chapter__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Chapter__Group__4__Impl();

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
    // $ANTLR end "rule__Chapter__Group__4"


    // $ANTLR start "rule__Chapter__Group__4__Impl"
    // InternalScoping2.g:691:1: rule__Chapter__Group__4__Impl : ( '}' ) ;
    public final void rule__Chapter__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:695:1: ( ( '}' ) )
            // InternalScoping2.g:696:1: ( '}' )
            {
            // InternalScoping2.g:696:1: ( '}' )
            // InternalScoping2.g:697:2: '}'
            {
             before(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__Chapter__Group__4__Impl"


    // $ANTLR start "rule__Reference__Group__0"
    // InternalScoping2.g:707:1: rule__Reference__Group__0 : rule__Reference__Group__0__Impl rule__Reference__Group__1 ;
    public final void rule__Reference__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:711:1: ( rule__Reference__Group__0__Impl rule__Reference__Group__1 )
            // InternalScoping2.g:712:2: rule__Reference__Group__0__Impl rule__Reference__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Reference__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Reference__Group__1();

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
    // $ANTLR end "rule__Reference__Group__0"


    // $ANTLR start "rule__Reference__Group__0__Impl"
    // InternalScoping2.g:719:1: rule__Reference__Group__0__Impl : ( 'ref' ) ;
    public final void rule__Reference__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:723:1: ( ( 'ref' ) )
            // InternalScoping2.g:724:1: ( 'ref' )
            {
            // InternalScoping2.g:724:1: ( 'ref' )
            // InternalScoping2.g:725:2: 'ref'
            {
             before(grammarAccess.getReferenceAccess().getRefKeyword_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefKeyword_0()); 

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
    // $ANTLR end "rule__Reference__Group__0__Impl"


    // $ANTLR start "rule__Reference__Group__1"
    // InternalScoping2.g:734:1: rule__Reference__Group__1 : rule__Reference__Group__1__Impl ;
    public final void rule__Reference__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:738:1: ( rule__Reference__Group__1__Impl )
            // InternalScoping2.g:739:2: rule__Reference__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Reference__Group__1__Impl();

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
    // $ANTLR end "rule__Reference__Group__1"


    // $ANTLR start "rule__Reference__Group__1__Impl"
    // InternalScoping2.g:745:1: rule__Reference__Group__1__Impl : ( ( rule__Reference__RefAssignment_1 ) ) ;
    public final void rule__Reference__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:749:1: ( ( ( rule__Reference__RefAssignment_1 ) ) )
            // InternalScoping2.g:750:1: ( ( rule__Reference__RefAssignment_1 ) )
            {
            // InternalScoping2.g:750:1: ( ( rule__Reference__RefAssignment_1 ) )
            // InternalScoping2.g:751:2: ( rule__Reference__RefAssignment_1 )
            {
             before(grammarAccess.getReferenceAccess().getRefAssignment_1()); 
            // InternalScoping2.g:752:2: ( rule__Reference__RefAssignment_1 )
            // InternalScoping2.g:752:3: rule__Reference__RefAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Reference__RefAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getReferenceAccess().getRefAssignment_1()); 

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
    // $ANTLR end "rule__Reference__Group__1__Impl"


    // $ANTLR start "rule__Book__NameAssignment_1"
    // InternalScoping2.g:761:1: rule__Book__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Book__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:765:1: ( ( ruleQualifiedName ) )
            // InternalScoping2.g:766:2: ( ruleQualifiedName )
            {
            // InternalScoping2.g:766:2: ( ruleQualifiedName )
            // InternalScoping2.g:767:3: ruleQualifiedName
            {
             before(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getBookAccess().getNameQualifiedNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__Book__NameAssignment_1"


    // $ANTLR start "rule__Book__ImportsAssignment_2"
    // InternalScoping2.g:776:1: rule__Book__ImportsAssignment_2 : ( ruleDImport ) ;
    public final void rule__Book__ImportsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:780:1: ( ( ruleDImport ) )
            // InternalScoping2.g:781:2: ( ruleDImport )
            {
            // InternalScoping2.g:781:2: ( ruleDImport )
            // InternalScoping2.g:782:3: ruleDImport
            {
             before(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleDImport();

            state._fsp--;

             after(grammarAccess.getBookAccess().getImportsDImportParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Book__ImportsAssignment_2"


    // $ANTLR start "rule__Book__ChaptersAssignment_3"
    // InternalScoping2.g:791:1: rule__Book__ChaptersAssignment_3 : ( ruleChapter ) ;
    public final void rule__Book__ChaptersAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:795:1: ( ( ruleChapter ) )
            // InternalScoping2.g:796:2: ( ruleChapter )
            {
            // InternalScoping2.g:796:2: ( ruleChapter )
            // InternalScoping2.g:797:3: ruleChapter
            {
             before(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleChapter();

            state._fsp--;

             after(grammarAccess.getBookAccess().getChaptersChapterParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Book__ChaptersAssignment_3"


    // $ANTLR start "rule__DImport__ImportedNamespaceAssignment_1"
    // InternalScoping2.g:806:1: rule__DImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__DImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:810:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalScoping2.g:811:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalScoping2.g:811:2: ( ruleQualifiedNameWithWildcard )
            // InternalScoping2.g:812:3: ruleQualifiedNameWithWildcard
            {
             before(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;

             after(grammarAccess.getDImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__DImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__Chapter__NameAssignment_1"
    // InternalScoping2.g:821:1: rule__Chapter__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Chapter__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:825:1: ( ( RULE_ID ) )
            // InternalScoping2.g:826:2: ( RULE_ID )
            {
            // InternalScoping2.g:826:2: ( RULE_ID )
            // InternalScoping2.g:827:3: RULE_ID
            {
             before(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getChapterAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Chapter__NameAssignment_1"


    // $ANTLR start "rule__Chapter__ParagraphsAssignment_3_0"
    // InternalScoping2.g:836:1: rule__Chapter__ParagraphsAssignment_3_0 : ( ruleParagraph ) ;
    public final void rule__Chapter__ParagraphsAssignment_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:840:1: ( ( ruleParagraph ) )
            // InternalScoping2.g:841:2: ( ruleParagraph )
            {
            // InternalScoping2.g:841:2: ( ruleParagraph )
            // InternalScoping2.g:842:3: ruleParagraph
            {
             before(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_0_0()); 
            pushFollow(FOLLOW_2);
            ruleParagraph();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getParagraphsParagraphParserRuleCall_3_0_0()); 

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
    // $ANTLR end "rule__Chapter__ParagraphsAssignment_3_0"


    // $ANTLR start "rule__Chapter__ReferencesAssignment_3_1"
    // InternalScoping2.g:851:1: rule__Chapter__ReferencesAssignment_3_1 : ( ruleReference ) ;
    public final void rule__Chapter__ReferencesAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:855:1: ( ( ruleReference ) )
            // InternalScoping2.g:856:2: ( ruleReference )
            {
            // InternalScoping2.g:856:2: ( ruleReference )
            // InternalScoping2.g:857:3: ruleReference
            {
             before(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleReference();

            state._fsp--;

             after(grammarAccess.getChapterAccess().getReferencesReferenceParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Chapter__ReferencesAssignment_3_1"


    // $ANTLR start "rule__Paragraph__TextAssignment"
    // InternalScoping2.g:866:1: rule__Paragraph__TextAssignment : ( RULE_STRING ) ;
    public final void rule__Paragraph__TextAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:870:1: ( ( RULE_STRING ) )
            // InternalScoping2.g:871:2: ( RULE_STRING )
            {
            // InternalScoping2.g:871:2: ( RULE_STRING )
            // InternalScoping2.g:872:3: RULE_STRING
            {
             before(grammarAccess.getParagraphAccess().getTextSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getParagraphAccess().getTextSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__Paragraph__TextAssignment"


    // $ANTLR start "rule__Reference__RefAssignment_1"
    // InternalScoping2.g:881:1: rule__Reference__RefAssignment_1 : ( ( RULE_ID ) ) ;
    public final void rule__Reference__RefAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalScoping2.g:885:1: ( ( ( RULE_ID ) ) )
            // InternalScoping2.g:886:2: ( ( RULE_ID ) )
            {
            // InternalScoping2.g:886:2: ( ( RULE_ID ) )
            // InternalScoping2.g:887:3: ( RULE_ID )
            {
             before(grammarAccess.getReferenceAccess().getRefChapterCrossReference_1_0()); 
            // InternalScoping2.g:888:3: ( RULE_ID )
            // InternalScoping2.g:889:4: RULE_ID
            {
             before(grammarAccess.getReferenceAccess().getRefChapterIDTerminalRuleCall_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getReferenceAccess().getRefChapterIDTerminalRuleCall_1_0_1()); 

            }

             after(grammarAccess.getReferenceAccess().getRefChapterCrossReference_1_0()); 

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
    // $ANTLR end "rule__Reference__RefAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000060020L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040022L});

}