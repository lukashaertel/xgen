/*
* generated by Xtext
*/
package xgen.services;

import java.util.List;

import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

import com.google.inject.Inject;
import com.google.inject.Singleton;


@Singleton
public class GrammarGrammarAccess extends AbstractGrammarElementFinder {
	
	
	public class GrammarElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Grammar");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cGrammarAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cDefinitionsAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cDefinitionsDefinitionParserRuleCall_1_0 = (RuleCall)cDefinitionsAssignment_1.eContents().get(0);
		
		//Grammar:
		//	{Grammar} definitions+=Definition*;
		public ParserRule getRule() { return rule; }

		//{Grammar} definitions+=Definition*
		public Group getGroup() { return cGroup; }

		//{Grammar}
		public Action getGrammarAction_0() { return cGrammarAction_0; }

		//definitions+=Definition*
		public Assignment getDefinitionsAssignment_1() { return cDefinitionsAssignment_1; }

		//Definition
		public RuleCall getDefinitionsDefinitionParserRuleCall_1_0() { return cDefinitionsDefinitionParserRuleCall_1_0; }
	}

	public class DefinitionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Definition");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cDefinitionAction_0 = (Action)cGroup.eContents().get(0);
		private final Assignment cLexicalAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final Keyword cLexicalLexicalKeyword_1_0 = (Keyword)cLexicalAssignment_1.eContents().get(0);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameIDTerminalRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cColonKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Assignment cRhsAssignment_4 = (Assignment)cGroup.eContents().get(4);
		private final RuleCall cRhsConstruct0ParserRuleCall_4_0 = (RuleCall)cRhsAssignment_4.eContents().get(0);
		private final Keyword cSemicolonKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Definition:
		//	{Definition} lexical?="lexical"? name=ID ":" rhs=Construct0 ";";
		public ParserRule getRule() { return rule; }

		//{Definition} lexical?="lexical"? name=ID ":" rhs=Construct0 ";"
		public Group getGroup() { return cGroup; }

		//{Definition}
		public Action getDefinitionAction_0() { return cDefinitionAction_0; }

		//lexical?="lexical"?
		public Assignment getLexicalAssignment_1() { return cLexicalAssignment_1; }

		//"lexical"
		public Keyword getLexicalLexicalKeyword_1_0() { return cLexicalLexicalKeyword_1_0; }

		//name=ID
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }

		//ID
		public RuleCall getNameIDTerminalRuleCall_2_0() { return cNameIDTerminalRuleCall_2_0; }

		//":"
		public Keyword getColonKeyword_3() { return cColonKeyword_3; }

		//rhs=Construct0
		public Assignment getRhsAssignment_4() { return cRhsAssignment_4; }

		//Construct0
		public RuleCall getRhsConstruct0ParserRuleCall_4_0() { return cRhsConstruct0ParserRuleCall_4_0; }

		//";"
		public Keyword getSemicolonKeyword_5() { return cSemicolonKeyword_5; }
	}

	public class Construct0Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Construct0");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConstruct1ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cAlternativeOperandsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cVerticalLineKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cOperandsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cOperandsConstruct1ParserRuleCall_1_2_0 = (RuleCall)cOperandsAssignment_1_2.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Keyword cVerticalLineKeyword_1_3_0 = (Keyword)cGroup_1_3.eContents().get(0);
		private final Assignment cOperandsAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cOperandsConstruct1ParserRuleCall_1_3_1_0 = (RuleCall)cOperandsAssignment_1_3_1.eContents().get(0);
		
		//Construct0 returns Construct:
		//	Construct1 ({Alternative.operands+=current} "|" operands+=Construct1 ("|" operands+=Construct1)*)?;
		public ParserRule getRule() { return rule; }

		//Construct1 ({Alternative.operands+=current} "|" operands+=Construct1 ("|" operands+=Construct1)*)?
		public Group getGroup() { return cGroup; }

		//Construct1
		public RuleCall getConstruct1ParserRuleCall_0() { return cConstruct1ParserRuleCall_0; }

		//({Alternative.operands+=current} "|" operands+=Construct1 ("|" operands+=Construct1)*)?
		public Group getGroup_1() { return cGroup_1; }

		//{Alternative.operands+=current}
		public Action getAlternativeOperandsAction_1_0() { return cAlternativeOperandsAction_1_0; }

		//"|"
		public Keyword getVerticalLineKeyword_1_1() { return cVerticalLineKeyword_1_1; }

		//operands+=Construct1
		public Assignment getOperandsAssignment_1_2() { return cOperandsAssignment_1_2; }

		//Construct1
		public RuleCall getOperandsConstruct1ParserRuleCall_1_2_0() { return cOperandsConstruct1ParserRuleCall_1_2_0; }

		//("|" operands+=Construct1)*
		public Group getGroup_1_3() { return cGroup_1_3; }

		//"|"
		public Keyword getVerticalLineKeyword_1_3_0() { return cVerticalLineKeyword_1_3_0; }

		//operands+=Construct1
		public Assignment getOperandsAssignment_1_3_1() { return cOperandsAssignment_1_3_1; }

		//Construct1
		public RuleCall getOperandsConstruct1ParserRuleCall_1_3_1_0() { return cOperandsConstruct1ParserRuleCall_1_3_1_0; }
	}

	public class Construct1Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Construct1");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConstruct2ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cSequenceOperandsAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cOperandsAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cOperandsConstruct2ParserRuleCall_1_1_0 = (RuleCall)cOperandsAssignment_1_1.eContents().get(0);
		private final Assignment cOperandsAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cOperandsConstruct2ParserRuleCall_1_2_0 = (RuleCall)cOperandsAssignment_1_2.eContents().get(0);
		
		//Construct1 returns Construct:
		//	Construct2 ({Sequence.operands+=current} operands+=Construct2 operands+=Construct2*)?;
		public ParserRule getRule() { return rule; }

		//Construct2 ({Sequence.operands+=current} operands+=Construct2 operands+=Construct2*)?
		public Group getGroup() { return cGroup; }

		//Construct2
		public RuleCall getConstruct2ParserRuleCall_0() { return cConstruct2ParserRuleCall_0; }

		//({Sequence.operands+=current} operands+=Construct2 operands+=Construct2*)?
		public Group getGroup_1() { return cGroup_1; }

		//{Sequence.operands+=current}
		public Action getSequenceOperandsAction_1_0() { return cSequenceOperandsAction_1_0; }

		//operands+=Construct2
		public Assignment getOperandsAssignment_1_1() { return cOperandsAssignment_1_1; }

		//Construct2
		public RuleCall getOperandsConstruct2ParserRuleCall_1_1_0() { return cOperandsConstruct2ParserRuleCall_1_1_0; }

		//operands+=Construct2*
		public Assignment getOperandsAssignment_1_2() { return cOperandsAssignment_1_2; }

		//Construct2
		public RuleCall getOperandsConstruct2ParserRuleCall_1_2_0() { return cOperandsConstruct2ParserRuleCall_1_2_0; }
	}

	public class Construct2Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Construct2");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNotAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Keyword cExclamationMarkKeyword_0_1 = (Keyword)cGroup_0.eContents().get(1);
		private final Assignment cOperandAssignment_0_2 = (Assignment)cGroup_0.eContents().get(2);
		private final RuleCall cOperandConstruct2ParserRuleCall_0_2_0 = (RuleCall)cOperandAssignment_0_2.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cUntilAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cHyphenMinusGreaterThanSignKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cOperandAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cOperandConstruct2ParserRuleCall_1_2_0 = (RuleCall)cOperandAssignment_1_2.eContents().get(0);
		private final RuleCall cConstruct3ParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Construct2 returns Construct:
		//	{Not} "!" operand=Construct2 | {Until} "->" operand=Construct2 | Construct3;
		public ParserRule getRule() { return rule; }

		//{Not} "!" operand=Construct2 | {Until} "->" operand=Construct2 | Construct3
		public Alternatives getAlternatives() { return cAlternatives; }

		//{Not} "!" operand=Construct2
		public Group getGroup_0() { return cGroup_0; }

		//{Not}
		public Action getNotAction_0_0() { return cNotAction_0_0; }

		//"!"
		public Keyword getExclamationMarkKeyword_0_1() { return cExclamationMarkKeyword_0_1; }

		//operand=Construct2
		public Assignment getOperandAssignment_0_2() { return cOperandAssignment_0_2; }

		//Construct2
		public RuleCall getOperandConstruct2ParserRuleCall_0_2_0() { return cOperandConstruct2ParserRuleCall_0_2_0; }

		//{Until} "->" operand=Construct2
		public Group getGroup_1() { return cGroup_1; }

		//{Until}
		public Action getUntilAction_1_0() { return cUntilAction_1_0; }

		//"->"
		public Keyword getHyphenMinusGreaterThanSignKeyword_1_1() { return cHyphenMinusGreaterThanSignKeyword_1_1; }

		//operand=Construct2
		public Assignment getOperandAssignment_1_2() { return cOperandAssignment_1_2; }

		//Construct2
		public RuleCall getOperandConstruct2ParserRuleCall_1_2_0() { return cOperandConstruct2ParserRuleCall_1_2_0; }

		//Construct3
		public RuleCall getConstruct3ParserRuleCall_2() { return cConstruct3ParserRuleCall_2; }
	}

	public class Construct3Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Construct3");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cConstruct4ParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Action cMultiplicityOperandAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_1_1 = (Keyword)cGroup_1.eContents().get(1);
		private final Assignment cMinAssignment_1_2 = (Assignment)cGroup_1.eContents().get(2);
		private final RuleCall cMinINTTerminalRuleCall_1_2_0 = (RuleCall)cMinAssignment_1_2.eContents().get(0);
		private final Group cGroup_1_3 = (Group)cGroup_1.eContents().get(3);
		private final Assignment cUpperBoundedAssignment_1_3_0 = (Assignment)cGroup_1_3.eContents().get(0);
		private final Keyword cUpperBoundedCommaKeyword_1_3_0_0 = (Keyword)cUpperBoundedAssignment_1_3_0.eContents().get(0);
		private final Assignment cMaxAssignment_1_3_1 = (Assignment)cGroup_1_3.eContents().get(1);
		private final RuleCall cMaxINTTerminalRuleCall_1_3_1_0 = (RuleCall)cMaxAssignment_1_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_1_4 = (Keyword)cGroup_1.eContents().get(4);
		
		//Construct3 returns Construct:
		//	Construct4 ({Multiplicity.operand=current} "{" min=INT (upperBounded?="," max=INT)? "}")*;
		public ParserRule getRule() { return rule; }

		//Construct4 ({Multiplicity.operand=current} "{" min=INT (upperBounded?="," max=INT)? "}")*
		public Group getGroup() { return cGroup; }

		//Construct4
		public RuleCall getConstruct4ParserRuleCall_0() { return cConstruct4ParserRuleCall_0; }

		//({Multiplicity.operand=current} "{" min=INT (upperBounded?="," max=INT)? "}")*
		public Group getGroup_1() { return cGroup_1; }

		//{Multiplicity.operand=current}
		public Action getMultiplicityOperandAction_1_0() { return cMultiplicityOperandAction_1_0; }

		//"{"
		public Keyword getLeftCurlyBracketKeyword_1_1() { return cLeftCurlyBracketKeyword_1_1; }

		//min=INT
		public Assignment getMinAssignment_1_2() { return cMinAssignment_1_2; }

		//INT
		public RuleCall getMinINTTerminalRuleCall_1_2_0() { return cMinINTTerminalRuleCall_1_2_0; }

		//(upperBounded?="," max=INT)?
		public Group getGroup_1_3() { return cGroup_1_3; }

		//upperBounded?=","
		public Assignment getUpperBoundedAssignment_1_3_0() { return cUpperBoundedAssignment_1_3_0; }

		//","
		public Keyword getUpperBoundedCommaKeyword_1_3_0_0() { return cUpperBoundedCommaKeyword_1_3_0_0; }

		//max=INT
		public Assignment getMaxAssignment_1_3_1() { return cMaxAssignment_1_3_1; }

		//INT
		public RuleCall getMaxINTTerminalRuleCall_1_3_1_0() { return cMaxINTTerminalRuleCall_1_3_1_0; }

		//"}"
		public Keyword getRightCurlyBracketKeyword_1_4() { return cRightCurlyBracketKeyword_1_4; }
	}

	public class Construct4Elements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "Construct4");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cRangeAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cMinAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cMinCHARTerminalRuleCall_0_1_0 = (RuleCall)cMinAssignment_0_1.eContents().get(0);
		private final Keyword cFullStopFullStopKeyword_0_2 = (Keyword)cGroup_0.eContents().get(2);
		private final Assignment cMaxAssignment_0_3 = (Assignment)cGroup_0.eContents().get(3);
		private final RuleCall cMaxCHARTerminalRuleCall_0_3_0 = (RuleCall)cMaxAssignment_0_3.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cKeywordAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cValueAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cValueSTRINGTerminalRuleCall_1_1_0 = (RuleCall)cValueAssignment_1_1.eContents().get(0);
		private final Group cGroup_2 = (Group)cAlternatives.eContents().get(2);
		private final Action cAnyAction_2_0 = (Action)cGroup_2.eContents().get(0);
		private final Keyword cFullStopKeyword_2_1 = (Keyword)cGroup_2.eContents().get(1);
		private final Group cGroup_3 = (Group)cAlternatives.eContents().get(3);
		private final Action cReferenceAction_3_0 = (Action)cGroup_3.eContents().get(0);
		private final Assignment cTargetAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTargetIDTerminalRuleCall_3_1_0 = (RuleCall)cTargetAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cAlternatives.eContents().get(4);
		private final Keyword cLeftParenthesisKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final RuleCall cConstruct0ParserRuleCall_4_1 = (RuleCall)cGroup_4.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_4_2 = (Keyword)cGroup_4.eContents().get(2);
		
		//Construct4 returns Construct:
		//	{Range} min=CHAR ".." max=CHAR | {Keyword} value=STRING | {Any} "." | {Reference} target=ID | "(" Construct0 ")";
		public ParserRule getRule() { return rule; }

		//{Range} min=CHAR ".." max=CHAR | {Keyword} value=STRING | {Any} "." | {Reference} target=ID | "(" Construct0 ")"
		public Alternatives getAlternatives() { return cAlternatives; }

		//{Range} min=CHAR ".." max=CHAR
		public Group getGroup_0() { return cGroup_0; }

		//{Range}
		public Action getRangeAction_0_0() { return cRangeAction_0_0; }

		//min=CHAR
		public Assignment getMinAssignment_0_1() { return cMinAssignment_0_1; }

		//CHAR
		public RuleCall getMinCHARTerminalRuleCall_0_1_0() { return cMinCHARTerminalRuleCall_0_1_0; }

		//".."
		public Keyword getFullStopFullStopKeyword_0_2() { return cFullStopFullStopKeyword_0_2; }

		//max=CHAR
		public Assignment getMaxAssignment_0_3() { return cMaxAssignment_0_3; }

		//CHAR
		public RuleCall getMaxCHARTerminalRuleCall_0_3_0() { return cMaxCHARTerminalRuleCall_0_3_0; }

		//{Keyword} value=STRING
		public Group getGroup_1() { return cGroup_1; }

		//{Keyword}
		public Action getKeywordAction_1_0() { return cKeywordAction_1_0; }

		//value=STRING
		public Assignment getValueAssignment_1_1() { return cValueAssignment_1_1; }

		//STRING
		public RuleCall getValueSTRINGTerminalRuleCall_1_1_0() { return cValueSTRINGTerminalRuleCall_1_1_0; }

		//{Any} "."
		public Group getGroup_2() { return cGroup_2; }

		//{Any}
		public Action getAnyAction_2_0() { return cAnyAction_2_0; }

		//"."
		public Keyword getFullStopKeyword_2_1() { return cFullStopKeyword_2_1; }

		//{Reference} target=ID
		public Group getGroup_3() { return cGroup_3; }

		//{Reference}
		public Action getReferenceAction_3_0() { return cReferenceAction_3_0; }

		//target=ID
		public Assignment getTargetAssignment_3_1() { return cTargetAssignment_3_1; }

		//ID
		public RuleCall getTargetIDTerminalRuleCall_3_1_0() { return cTargetIDTerminalRuleCall_3_1_0; }

		//"(" Construct0 ")"
		public Group getGroup_4() { return cGroup_4; }

		//"("
		public Keyword getLeftParenthesisKeyword_4_0() { return cLeftParenthesisKeyword_4_0; }

		//Construct0
		public RuleCall getConstruct0ParserRuleCall_4_1() { return cConstruct0ParserRuleCall_4_1; }

		//")"
		public Keyword getRightParenthesisKeyword_4_2() { return cRightParenthesisKeyword_4_2; }
	}
	
	
	private GrammarElements pGrammar;
	private DefinitionElements pDefinition;
	private Construct0Elements pConstruct0;
	private Construct1Elements pConstruct1;
	private Construct2Elements pConstruct2;
	private Construct3Elements pConstruct3;
	private Construct4Elements pConstruct4;
	private TerminalRule tID;
	private TerminalRule tINT;
	private TerminalRule tSTRING;
	private TerminalRule tCHAR;
	private TerminalRule tML_COMMENT;
	private TerminalRule tSL_COMMENT;
	private TerminalRule tWS;
	
	private final Grammar grammar;

	@Inject
	public GrammarGrammarAccess(GrammarProvider grammarProvider) {
		this.grammar = internalFindGrammar(grammarProvider);
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("xgen.Grammar".equals(grammar.getName())) {
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
	
	
	public Grammar getGrammar() {
		return grammar;
	}
	

	
	//Grammar:
	//	{Grammar} definitions+=Definition*;
	public GrammarElements getGrammarAccess() {
		return (pGrammar != null) ? pGrammar : (pGrammar = new GrammarElements());
	}
	
	public ParserRule getGrammarRule() {
		return getGrammarAccess().getRule();
	}

	//Definition:
	//	{Definition} lexical?="lexical"? name=ID ":" rhs=Construct0 ";";
	public DefinitionElements getDefinitionAccess() {
		return (pDefinition != null) ? pDefinition : (pDefinition = new DefinitionElements());
	}
	
	public ParserRule getDefinitionRule() {
		return getDefinitionAccess().getRule();
	}

	//Construct0 returns Construct:
	//	Construct1 ({Alternative.operands+=current} "|" operands+=Construct1 ("|" operands+=Construct1)*)?;
	public Construct0Elements getConstruct0Access() {
		return (pConstruct0 != null) ? pConstruct0 : (pConstruct0 = new Construct0Elements());
	}
	
	public ParserRule getConstruct0Rule() {
		return getConstruct0Access().getRule();
	}

	//Construct1 returns Construct:
	//	Construct2 ({Sequence.operands+=current} operands+=Construct2 operands+=Construct2*)?;
	public Construct1Elements getConstruct1Access() {
		return (pConstruct1 != null) ? pConstruct1 : (pConstruct1 = new Construct1Elements());
	}
	
	public ParserRule getConstruct1Rule() {
		return getConstruct1Access().getRule();
	}

	//Construct2 returns Construct:
	//	{Not} "!" operand=Construct2 | {Until} "->" operand=Construct2 | Construct3;
	public Construct2Elements getConstruct2Access() {
		return (pConstruct2 != null) ? pConstruct2 : (pConstruct2 = new Construct2Elements());
	}
	
	public ParserRule getConstruct2Rule() {
		return getConstruct2Access().getRule();
	}

	//Construct3 returns Construct:
	//	Construct4 ({Multiplicity.operand=current} "{" min=INT (upperBounded?="," max=INT)? "}")*;
	public Construct3Elements getConstruct3Access() {
		return (pConstruct3 != null) ? pConstruct3 : (pConstruct3 = new Construct3Elements());
	}
	
	public ParserRule getConstruct3Rule() {
		return getConstruct3Access().getRule();
	}

	//Construct4 returns Construct:
	//	{Range} min=CHAR ".." max=CHAR | {Keyword} value=STRING | {Any} "." | {Reference} target=ID | "(" Construct0 ")";
	public Construct4Elements getConstruct4Access() {
		return (pConstruct4 != null) ? pConstruct4 : (pConstruct4 = new Construct4Elements());
	}
	
	public ParserRule getConstruct4Rule() {
		return getConstruct4Access().getRule();
	}

	//terminal ID:
	//	"^"? ("a".."z" | "A".."Z" | "_") ("a".."z" | "A".."Z" | "_" | "0".."9")*;
	public TerminalRule getIDRule() {
		return (tID != null) ? tID : (tID = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ID"));
	} 

	//terminal INT returns ecore::EInt:
	//	"0".."9"+;
	public TerminalRule getINTRule() {
		return (tINT != null) ? tINT : (tINT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "INT"));
	} 

	//terminal STRING:
	//	"\"" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\""))* "\"";
	public TerminalRule getSTRINGRule() {
		return (tSTRING != null) ? tSTRING : (tSTRING = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "STRING"));
	} 

	//terminal CHAR returns ecore::EChar:
	//	"\'" ("\\" ("b" | "t" | "n" | "f" | "r" | "u" | "\"" | "\'" | "\\") | !("\\" | "\'")) "\'";
	public TerminalRule getCHARRule() {
		return (tCHAR != null) ? tCHAR : (tCHAR = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "CHAR"));
	} 

	//terminal ML_COMMENT:
	//	"/ *"->"* /";
	public TerminalRule getML_COMMENTRule() {
		return (tML_COMMENT != null) ? tML_COMMENT : (tML_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "ML_COMMENT"));
	} 

	//terminal SL_COMMENT:
	//	"//" !("\n" | "\r")* ("\r"? "\n")?;
	public TerminalRule getSL_COMMENTRule() {
		return (tSL_COMMENT != null) ? tSL_COMMENT : (tSL_COMMENT = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "SL_COMMENT"));
	} 

	//terminal WS:
	//	(" " | "\t" | "\r" | "\n")+;
	public TerminalRule getWSRule() {
		return (tWS != null) ? tWS : (tWS = (TerminalRule) GrammarUtil.findRuleForName(getGrammar(), "WS"));
	} 
}
