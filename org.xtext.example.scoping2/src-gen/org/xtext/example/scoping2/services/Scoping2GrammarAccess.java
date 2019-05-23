/*
 * generated by Xtext 2.17.1
 */
package org.xtext.example.scoping2.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class Scoping2GrammarAccess extends AbstractGrammarElementFinder {
	
	public class BookElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.Book");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cBookKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameQualifiedNameParserRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Assignment cImportsAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cImportsDImportParserRuleCall_2_0 = (RuleCall)cImportsAssignment_2.eContents().get(0);
		private final Assignment cChaptersAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cChaptersChapterParserRuleCall_3_0 = (RuleCall)cChaptersAssignment_3.eContents().get(0);
		
		//Book:
		//	'book'
		//	name=QualifiedName
		//	imports+=DImport*
		//	chapters+=Chapter*;
		@Override public ParserRule getRule() { return rule; }
		
		//'book' name=QualifiedName imports+=DImport* chapters+=Chapter*
		public Group getGroup() { return cGroup; }
		
		//'book'
		public Keyword getBookKeyword_0() { return cBookKeyword_0; }
		
		//name=QualifiedName
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//QualifiedName
		public RuleCall getNameQualifiedNameParserRuleCall_1_0() { return cNameQualifiedNameParserRuleCall_1_0; }
		
		//imports+=DImport*
		public Assignment getImportsAssignment_2() { return cImportsAssignment_2; }
		
		//DImport
		public RuleCall getImportsDImportParserRuleCall_2_0() { return cImportsDImportParserRuleCall_2_0; }
		
		//chapters+=Chapter*
		public Assignment getChaptersAssignment_3() { return cChaptersAssignment_3; }
		
		//Chapter
		public RuleCall getChaptersChapterParserRuleCall_3_0() { return cChaptersChapterParserRuleCall_3_0; }
	}
	public class DImportElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.DImport");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cImportKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cImportedNamespaceAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0 = (RuleCall)cImportedNamespaceAssignment_1.eContents().get(0);
		
		//DImport:
		//	'import' importedNamespace=QualifiedNameWithWildcard;
		@Override public ParserRule getRule() { return rule; }
		
		//'import' importedNamespace=QualifiedNameWithWildcard
		public Group getGroup() { return cGroup; }
		
		//'import'
		public Keyword getImportKeyword_0() { return cImportKeyword_0; }
		
		//importedNamespace=QualifiedNameWithWildcard
		public Assignment getImportedNamespaceAssignment_1() { return cImportedNamespaceAssignment_1; }
		
		//QualifiedNameWithWildcard
		public RuleCall getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0() { return cImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0; }
	}
	public class QualifiedNameWithWildcardElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.QualifiedNameWithWildcard");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cQualifiedNameParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Keyword cFullStopAsteriskKeyword_1 = (Keyword)cGroup.eContents().get(1);
		
		//QualifiedNameWithWildcard:
		//	QualifiedName '.*'?;
		@Override public ParserRule getRule() { return rule; }
		
		//QualifiedName '.*'?
		public Group getGroup() { return cGroup; }
		
		//QualifiedName
		public RuleCall getQualifiedNameParserRuleCall_0() { return cQualifiedNameParserRuleCall_0; }
		
		//'.*'?
		public Keyword getFullStopAsteriskKeyword_1() { return cFullStopAsteriskKeyword_1; }
	}
	public class QualifiedNameElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.QualifiedName");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cIDTerminalRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Keyword cFullStopKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		
		//QualifiedName:
		//	ID ('.' ID)*;
		@Override public ParserRule getRule() { return rule; }
		
		//ID ('.' ID)*
		public Group getGroup() { return cGroup; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_0() { return cIDTerminalRuleCall_0; }
		
		//('.' ID)*
		public Group getGroup_1() { return cGroup_1; }
		
		//'.'
		public Keyword getFullStopKeyword_1_0() { return cFullStopKeyword_1_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1_1() { return cIDTerminalRuleCall_1_1; }
	}
	public class ChapterElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.Chapter");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cChapterKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Alternatives cAlternatives_3 = (Alternatives)cGroup.eContents().get(3);
		private final Assignment cParagraphsAssignment_3_0 = (Assignment)cAlternatives_3.eContents().get(0);
		private final RuleCall cParagraphsParagraphParserRuleCall_3_0_0 = (RuleCall)cParagraphsAssignment_3_0.eContents().get(0);
		private final Assignment cReferencesAssignment_3_1 = (Assignment)cAlternatives_3.eContents().get(1);
		private final RuleCall cReferencesReferenceParserRuleCall_3_1_0 = (RuleCall)cReferencesAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//Chapter:
		//	'chapter' name=ID '{' (paragraphs+=Paragraph | references+=Reference)* '}';
		@Override public ParserRule getRule() { return rule; }
		
		//'chapter' name=ID '{' (paragraphs+=Paragraph | references+=Reference)* '}'
		public Group getGroup() { return cGroup; }
		
		//'chapter'
		public Keyword getChapterKeyword_0() { return cChapterKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//(paragraphs+=Paragraph | references+=Reference)*
		public Alternatives getAlternatives_3() { return cAlternatives_3; }
		
		//paragraphs+=Paragraph
		public Assignment getParagraphsAssignment_3_0() { return cParagraphsAssignment_3_0; }
		
		//Paragraph
		public RuleCall getParagraphsParagraphParserRuleCall_3_0_0() { return cParagraphsParagraphParserRuleCall_3_0_0; }
		
		//references+=Reference
		public Assignment getReferencesAssignment_3_1() { return cReferencesAssignment_3_1; }
		
		//Reference
		public RuleCall getReferencesReferenceParserRuleCall_3_1_0() { return cReferencesReferenceParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class ParagraphElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.Paragraph");
		private final Assignment cTextAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cTextSTRINGTerminalRuleCall_0 = (RuleCall)cTextAssignment.eContents().get(0);
		
		//Paragraph:
		//	text=STRING;
		@Override public ParserRule getRule() { return rule; }
		
		//text=STRING
		public Assignment getTextAssignment() { return cTextAssignment; }
		
		//STRING
		public RuleCall getTextSTRINGTerminalRuleCall_0() { return cTextSTRINGTerminalRuleCall_0; }
	}
	public class ReferenceElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.scoping2.Scoping2.Reference");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cRefKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cRefAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final CrossReference cRefChapterCrossReference_1_0 = (CrossReference)cRefAssignment_1.eContents().get(0);
		private final RuleCall cRefChapterIDTerminalRuleCall_1_0_1 = (RuleCall)cRefChapterCrossReference_1_0.eContents().get(1);
		
		//Reference:
		//	'ref' ref=[Chapter];
		@Override public ParserRule getRule() { return rule; }
		
		//'ref' ref=[Chapter]
		public Group getGroup() { return cGroup; }
		
		//'ref'
		public Keyword getRefKeyword_0() { return cRefKeyword_0; }
		
		//ref=[Chapter]
		public Assignment getRefAssignment_1() { return cRefAssignment_1; }
		
		//[Chapter]
		public CrossReference getRefChapterCrossReference_1_0() { return cRefChapterCrossReference_1_0; }
		
		//ID
		public RuleCall getRefChapterIDTerminalRuleCall_1_0_1() { return cRefChapterIDTerminalRuleCall_1_0_1; }
	}
	
	
	private final BookElements pBook;
	private final DImportElements pDImport;
	private final QualifiedNameWithWildcardElements pQualifiedNameWithWildcard;
	private final QualifiedNameElements pQualifiedName;
	private final ChapterElements pChapter;
	private final ParagraphElements pParagraph;
	private final ReferenceElements pReference;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public Scoping2GrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pBook = new BookElements();
		this.pDImport = new DImportElements();
		this.pQualifiedNameWithWildcard = new QualifiedNameWithWildcardElements();
		this.pQualifiedName = new QualifiedNameElements();
		this.pChapter = new ChapterElements();
		this.pParagraph = new ParagraphElements();
		this.pReference = new ReferenceElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.scoping2.Scoping2".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Book:
	//	'book'
	//	name=QualifiedName
	//	imports+=DImport*
	//	chapters+=Chapter*;
	public BookElements getBookAccess() {
		return pBook;
	}
	
	public ParserRule getBookRule() {
		return getBookAccess().getRule();
	}
	
	//DImport:
	//	'import' importedNamespace=QualifiedNameWithWildcard;
	public DImportElements getDImportAccess() {
		return pDImport;
	}
	
	public ParserRule getDImportRule() {
		return getDImportAccess().getRule();
	}
	
	//QualifiedNameWithWildcard:
	//	QualifiedName '.*'?;
	public QualifiedNameWithWildcardElements getQualifiedNameWithWildcardAccess() {
		return pQualifiedNameWithWildcard;
	}
	
	public ParserRule getQualifiedNameWithWildcardRule() {
		return getQualifiedNameWithWildcardAccess().getRule();
	}
	
	//QualifiedName:
	//	ID ('.' ID)*;
	public QualifiedNameElements getQualifiedNameAccess() {
		return pQualifiedName;
	}
	
	public ParserRule getQualifiedNameRule() {
		return getQualifiedNameAccess().getRule();
	}
	
	//Chapter:
	//	'chapter' name=ID '{' (paragraphs+=Paragraph | references+=Reference)* '}';
	public ChapterElements getChapterAccess() {
		return pChapter;
	}
	
	public ParserRule getChapterRule() {
		return getChapterAccess().getRule();
	}
	
	//Paragraph:
	//	text=STRING;
	public ParagraphElements getParagraphAccess() {
		return pParagraph;
	}
	
	public ParserRule getParagraphRule() {
		return getParagraphAccess().getRule();
	}
	
	//Reference:
	//	'ref' ref=[Chapter];
	public ReferenceElements getReferenceAccess() {
		return pReference;
	}
	
	public ParserRule getReferenceRule() {
		return getReferenceAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' |
	//	"'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}