/*
 * generated by Xtext 2.22.0
 */
grammar InternalXSS;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package tdt4250.xss.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
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

}

@parser::members {

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

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleStylesheet
entryRuleStylesheet returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStylesheetRule()); }
	iv_ruleStylesheet=ruleStylesheet
	{ $current=$iv_ruleStylesheet.current; }
	EOF;

// Rule Stylesheet
ruleStylesheet returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='XSelectors:'
			{
				newLeafNode(otherlv_0, grammarAccess.getStylesheetAccess().getXSelectorsKeyword_0_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStylesheetAccess().getCustomSelectorsXSelectorParserRuleCall_0_1_0());
					}
					lv_customSelectors_1_0=ruleXSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStylesheetRule());
						}
						add(
							$current,
							"customSelectors",
							lv_customSelectors_1_0,
							"tdt4250.xss.XSS.XSelector");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		(
			otherlv_2='XProperties:'
			{
				newLeafNode(otherlv_2, grammarAccess.getStylesheetAccess().getXPropertiesKeyword_1_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getStylesheetAccess().getCustomPropertiesXPropertyParserRuleCall_1_1_0());
					}
					lv_customProperties_3_0=ruleXProperty
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getStylesheetRule());
						}
						add(
							$current,
							"customProperties",
							lv_customProperties_3_0,
							"tdt4250.xss.XSS.XProperty");
						afterParserOrEnumRuleCall();
					}
				)
			)+
		)?
		otherlv_4='Rules:'
		{
			newLeafNode(otherlv_4, grammarAccess.getStylesheetAccess().getRulesKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStylesheetAccess().getRulesRuleParserRuleCall_3_0());
				}
				lv_rules_5_0=ruleRule
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStylesheetRule());
					}
					add(
						$current,
						"rules",
						lv_rules_5_0,
						"tdt4250.xss.XSS.Rule");
					afterParserOrEnumRuleCall();
				}
			)
		)+
	)
;

// Entry rule entryRuleSTRING_OR_SEL
entryRuleSTRING_OR_SEL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSTRING_OR_SELRule()); }
	iv_ruleSTRING_OR_SEL=ruleSTRING_OR_SEL
	{ $current=$iv_ruleSTRING_OR_SEL.current.getText(); }
	EOF;

// Rule STRING_OR_SEL
ruleSTRING_OR_SEL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_SELAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_SEL_1=RULE_SEL
		{
			$current.merge(this_SEL_1);
		}
		{
			newLeafNode(this_SEL_1, grammarAccess.getSTRING_OR_SELAccess().getSELTerminalRuleCall_1());
		}
		    |
		this_NAME_2=RULE_NAME
		{
			$current.merge(this_NAME_2);
		}
		{
			newLeafNode(this_NAME_2, grammarAccess.getSTRING_OR_SELAccess().getNAMETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleSTRING_OR_VAL
entryRuleSTRING_OR_VAL returns [String current=null]:
	{ newCompositeNode(grammarAccess.getSTRING_OR_VALRule()); }
	iv_ruleSTRING_OR_VAL=ruleSTRING_OR_VAL
	{ $current=$iv_ruleSTRING_OR_VAL.current.getText(); }
	EOF;

// Rule STRING_OR_VAL
ruleSTRING_OR_VAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		this_STRING_0=RULE_STRING
		{
			$current.merge(this_STRING_0);
		}
		{
			newLeafNode(this_STRING_0, grammarAccess.getSTRING_OR_VALAccess().getSTRINGTerminalRuleCall_0());
		}
		    |
		this_VAL_1=RULE_VAL
		{
			$current.merge(this_VAL_1);
		}
		{
			newLeafNode(this_VAL_1, grammarAccess.getSTRING_OR_VALAccess().getVALTerminalRuleCall_1());
		}
		    |
		this_NAME_2=RULE_NAME
		{
			$current.merge(this_NAME_2);
		}
		{
			newLeafNode(this_NAME_2, grammarAccess.getSTRING_OR_VALAccess().getNAMETerminalRuleCall_2());
		}
	)
;

// Entry rule entryRuleXSelector
entryRuleXSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXSelectorRule()); }
	iv_ruleXSelector=ruleXSelector
	{ $current=$iv_ruleXSelector.current; }
	EOF;

// Rule XSelector
ruleXSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getXSelectorAccess().getGroupSelectorParserRuleCall());
	}
	this_GroupSelector_0=ruleGroupSelector
	{
		$current = $this_GroupSelector_0.current;
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleGroupSelector
entryRuleGroupSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupSelectorRule()); }
	iv_ruleGroupSelector=ruleGroupSelector
	{ $current=$iv_ruleGroupSelector.current; }
	EOF;

// Rule GroupSelector
ruleGroupSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='@'
			{
				newLeafNode(otherlv_0, grammarAccess.getGroupSelectorAccess().getCommercialAtKeyword_0());
			}
		)?
		(
			(
				lv_name_1_0=RULE_NAME
				{
					newLeafNode(lv_name_1_0, grammarAccess.getGroupSelectorAccess().getNameNAMETerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupSelectorRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"tdt4250.xss.XSS.NAME");
				}
			)
		)
		otherlv_2='('
		{
			newLeafNode(otherlv_2, grammarAccess.getGroupSelectorAccess().getLeftParenthesisKeyword_2());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_3_0());
				}
				lv_subSelectors_3_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
					}
					add(
						$current,
						"subSelectors",
						lv_subSelectors_3_0,
						"tdt4250.xss.XSS.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		(
			otherlv_4=','
			{
				newLeafNode(otherlv_4, grammarAccess.getGroupSelectorAccess().getCommaKeyword_4_0());
			}
			(
				(
					{
						newCompositeNode(grammarAccess.getGroupSelectorAccess().getSubSelectorsSelectorParserRuleCall_4_1_0());
					}
					lv_subSelectors_5_0=ruleSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGroupSelectorRule());
						}
						add(
							$current,
							"subSelectors",
							lv_subSelectors_5_0,
							"tdt4250.xss.XSS.Selector");
						afterParserOrEnumRuleCall();
					}
				)
			)
		)*
		otherlv_6=')'
		{
			newLeafNode(otherlv_6, grammarAccess.getGroupSelectorAccess().getRightParenthesisKeyword_5());
		}
	)
;

// Entry rule entryRuleSelector
entryRuleSelector returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSelectorRule()); }
	iv_ruleSelector=ruleSelector
	{ $current=$iv_ruleSelector.current; }
	EOF;

// Rule Selector
ruleSelector returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getSelectorAccess().getNameSTRING_OR_SELParserRuleCall_0());
			}
			lv_name_0_0=ruleSTRING_OR_SEL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getSelectorRule());
				}
				set(
					$current,
					"name",
					lv_name_0_0,
					"tdt4250.xss.XSS.STRING_OR_SEL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleXProperty
entryRuleXProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXPropertyRule()); }
	iv_ruleXProperty=ruleXProperty
	{ $current=$iv_ruleXProperty.current; }
	EOF;

// Rule XProperty
ruleXProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='$'
			{
				newLeafNode(otherlv_0, grammarAccess.getXPropertyAccess().getDollarSignKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getXPropertyAccess().getCustomPropertyParserRuleCall_0_1());
			}
			this_CustomProperty_1=ruleCustomProperty
			{
				$current = $this_CustomProperty_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		(
			(
				otherlv_2='@'
				{
					newLeafNode(otherlv_2, grammarAccess.getXPropertyAccess().getCommercialAtKeyword_1_0());
				}
			)?
			{
				newCompositeNode(grammarAccess.getXPropertyAccess().getGroupPropertyParserRuleCall_1_1());
			}
			this_GroupProperty_3=ruleGroupProperty
			{
				$current = $this_GroupProperty_3.current;
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleCustomProperty
entryRuleCustomProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getCustomPropertyRule()); }
	iv_ruleCustomProperty=ruleCustomProperty
	{ $current=$iv_ruleCustomProperty.current; }
	EOF;

// Rule CustomProperty
ruleCustomProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_NAME
				{
					newLeafNode(lv_name_0_0, grammarAccess.getCustomPropertyAccess().getNameNAMETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getCustomPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"tdt4250.xss.XSS.NAME");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getCustomPropertyAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getCustomPropertyAccess().getSubRuleSubRuleParserRuleCall_2_0_0());
					}
					lv_subRule_2_0=ruleSubRule
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getCustomPropertyRule());
						}
						add(
							$current,
							"subRule",
							lv_subRule_2_0,
							"tdt4250.xss.XSS.SubRule");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getCustomPropertyAccess().getSemicolonKeyword_2_1());
			}
		)+
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getCustomPropertyAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleSubRule
entryRuleSubRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSubRuleRule()); }
	iv_ruleSubRule=ruleSubRule
	{ $current=$iv_ruleSubRule.current; }
	EOF;

// Rule SubRule
ruleSubRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSubRuleAccess().getPropertyPROPERTYParserRuleCall_0_0());
				}
				lv_property_0_0=rulePROPERTY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubRuleRule());
					}
					set(
						$current,
						"property",
						lv_property_0_0,
						"tdt4250.xss.XSS.PROPERTY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getSubRuleAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSubRuleAccess().getExpressionExpressionParserRuleCall_2_0());
				}
				lv_expression_2_0=ruleExpression
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSubRuleRule());
					}
					set(
						$current,
						"expression",
						lv_expression_2_0,
						"tdt4250.xss.XSS.Expression");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleExpression
entryRuleExpression returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getExpressionRule()); }
	iv_ruleExpression=ruleExpression
	{ $current=$iv_ruleExpression.current; }
	EOF;

// Rule Expression
ruleExpression returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getExpressionAccess().getNameSTRING_OR_VALParserRuleCall_0());
			}
			lv_name_0_0=ruleSTRING_OR_VAL
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getExpressionRule());
				}
				set(
					$current,
					"name",
					lv_name_0_0,
					"tdt4250.xss.XSS.STRING_OR_VAL");
				afterParserOrEnumRuleCall();
			}
		)
	)
;

// Entry rule entryRuleGroupProperty
entryRuleGroupProperty returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getGroupPropertyRule()); }
	iv_ruleGroupProperty=ruleGroupProperty
	{ $current=$iv_ruleGroupProperty.current; }
	EOF;

// Rule GroupProperty
ruleGroupProperty returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				lv_name_0_0=RULE_NAME
				{
					newLeafNode(lv_name_0_0, grammarAccess.getGroupPropertyAccess().getNameNAMETerminalRuleCall_0_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getGroupPropertyRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_0_0,
						"tdt4250.xss.XSS.NAME");
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getGroupPropertyAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getGroupPropertyAccess().getStatementsXStatementParserRuleCall_2_0_0());
					}
					lv_statements_2_0=ruleXStatement
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getGroupPropertyRule());
						}
						add(
							$current,
							"statements",
							lv_statements_2_0,
							"tdt4250.xss.XSS.XStatement");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getGroupPropertyAccess().getSemicolonKeyword_2_1());
			}
		)+
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getGroupPropertyAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleXStatement
entryRuleXStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXStatementRule()); }
	iv_ruleXStatement=ruleXStatement
	{ $current=$iv_ruleXStatement.current; }
	EOF;

// Rule XStatement
ruleXStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getXStatementAccess().getXSingleStatementParserRuleCall_0());
		}
		this_XSingleStatement_0=ruleXSingleStatement
		{
			$current = $this_XSingleStatement_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getXStatementAccess().getXMultiStatementParserRuleCall_1());
		}
		this_XMultiStatement_1=ruleXMultiStatement
		{
			$current = $this_XMultiStatement_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleXSingleStatement
entryRuleXSingleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXSingleStatementRule()); }
	iv_ruleXSingleStatement=ruleXSingleStatement
	{ $current=$iv_ruleXSingleStatement.current; }
	EOF;

// Rule XSingleStatement
ruleXSingleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='$'
			{
				newLeafNode(otherlv_0, grammarAccess.getXSingleStatementAccess().getDollarSignKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getXSingleStatementAccess().getSingleRefStatementParserRuleCall_0_1());
			}
			this_SingleRefStatement_1=ruleSingleRefStatement
			{
				$current = $this_SingleRefStatement_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getXSingleStatementAccess().getSingleStatementParserRuleCall_1());
		}
		this_SingleStatement_2=ruleSingleStatement
		{
			$current = $this_SingleStatement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleSingleRefStatement
entryRuleSingleRefStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleRefStatementRule()); }
	iv_ruleSingleRefStatement=ruleSingleRefStatement
	{ $current=$iv_ruleSingleRefStatement.current; }
	EOF;

// Rule SingleRefStatement
ruleSingleRefStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getSingleRefStatementRule());
					}
				}
				otherlv_0=RULE_NAME
				{
					newLeafNode(otherlv_0, grammarAccess.getSingleRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getSingleRefStatementAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleRefStatementAccess().getValueVALUEParserRuleCall_2_0());
				}
				lv_value_2_0=ruleVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleRefStatementRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"tdt4250.xss.XSS.VALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleSingleStatement
entryRuleSingleStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getSingleStatementRule()); }
	iv_ruleSingleStatement=ruleSingleStatement
	{ $current=$iv_ruleSingleStatement.current; }
	EOF;

// Rule SingleStatement
ruleSingleStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
				}
				lv_property_0_0=rulePROPERTY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleStatementRule());
					}
					set(
						$current,
						"property",
						lv_property_0_0,
						"tdt4250.xss.XSS.PROPERTY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getSingleStatementAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getSingleStatementAccess().getValueVALUEParserRuleCall_2_0());
				}
				lv_value_2_0=ruleVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getSingleStatementRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"tdt4250.xss.XSS.VALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRuleXMultiStatement
entryRuleXMultiStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getXMultiStatementRule()); }
	iv_ruleXMultiStatement=ruleXMultiStatement
	{ $current=$iv_ruleXMultiStatement.current; }
	EOF;

// Rule XMultiStatement
ruleXMultiStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			otherlv_0='$'
			{
				newLeafNode(otherlv_0, grammarAccess.getXMultiStatementAccess().getDollarSignKeyword_0_0());
			}
			{
				newCompositeNode(grammarAccess.getXMultiStatementAccess().getMultiRefStatementParserRuleCall_0_1());
			}
			this_MultiRefStatement_1=ruleMultiRefStatement
			{
				$current = $this_MultiRefStatement_1.current;
				afterParserOrEnumRuleCall();
			}
		)
		    |
		{
			newCompositeNode(grammarAccess.getXMultiStatementAccess().getMultiStatementParserRuleCall_1());
		}
		this_MultiStatement_2=ruleMultiStatement
		{
			$current = $this_MultiStatement_2.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleMultiRefStatement
entryRuleMultiRefStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiRefStatementRule()); }
	iv_ruleMultiRefStatement=ruleMultiRefStatement
	{ $current=$iv_ruleMultiRefStatement.current; }
	EOF;

// Rule MultiRefStatement
ruleMultiRefStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getMultiRefStatementRule());
					}
				}
				otherlv_0=RULE_NAME
				{
					newLeafNode(otherlv_0, grammarAccess.getMultiRefStatementAccess().getPropertyCustomPropertyCrossReference_0_0());
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMultiRefStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiRefStatementAccess().getStatesStateParserRuleCall_2_0_0());
					}
					lv_states_2_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiRefStatementRule());
						}
						add(
							$current,
							"states",
							lv_states_2_0,
							"tdt4250.xss.XSS.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getMultiRefStatementAccess().getSemicolonKeyword_2_1());
			}
		)+
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiRefStatementAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleMultiStatement
entryRuleMultiStatement returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getMultiStatementRule()); }
	iv_ruleMultiStatement=ruleMultiStatement
	{ $current=$iv_ruleMultiStatement.current; }
	EOF;

// Rule MultiStatement
ruleMultiStatement returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getMultiStatementAccess().getPropertyPROPERTYParserRuleCall_0_0());
				}
				lv_property_0_0=rulePROPERTY
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getMultiStatementRule());
					}
					set(
						$current,
						"property",
						lv_property_0_0,
						"tdt4250.xss.XSS.PROPERTY");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getMultiStatementAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getMultiStatementAccess().getStatesStateParserRuleCall_2_0_0());
					}
					lv_states_2_0=ruleState
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getMultiStatementRule());
						}
						add(
							$current,
							"states",
							lv_states_2_0,
							"tdt4250.xss.XSS.State");
						afterParserOrEnumRuleCall();
					}
				)
			)
			otherlv_3=';'
			{
				newLeafNode(otherlv_3, grammarAccess.getMultiStatementAccess().getSemicolonKeyword_2_1());
			}
		)+
		otherlv_4=')'
		{
			newLeafNode(otherlv_4, grammarAccess.getMultiStatementAccess().getRightParenthesisKeyword_3());
		}
	)
;

// Entry rule entryRuleState
entryRuleState returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getStateRule()); }
	iv_ruleState=ruleState
	{ $current=$iv_ruleState.current; }
	EOF;

// Rule State
ruleState returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getModifierSelectorParserRuleCall_0_0());
				}
				lv_modifier_0_0=ruleSelector
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"modifier",
						lv_modifier_0_0,
						"tdt4250.xss.XSS.Selector");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_1='='
		{
			newLeafNode(otherlv_1, grammarAccess.getStateAccess().getEqualsSignKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getStateAccess().getValueVALUEParserRuleCall_2_0());
				}
				lv_value_2_0=ruleVALUE
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getStateRule());
					}
					set(
						$current,
						"value",
						lv_value_2_0,
						"tdt4250.xss.XSS.VALUE");
					afterParserOrEnumRuleCall();
				}
			)
		)
	)
;

// Entry rule entryRulePROPERTY
entryRulePROPERTY returns [String current=null]:
	{ newCompositeNode(grammarAccess.getPROPERTYRule()); }
	iv_rulePROPERTY=rulePROPERTY
	{ $current=$iv_rulePROPERTY.current.getText(); }
	EOF;

// Rule PROPERTY
rulePROPERTY returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	this_NAME_0=RULE_NAME
	{
		$current.merge(this_NAME_0);
	}
	{
		newLeafNode(this_NAME_0, grammarAccess.getPROPERTYAccess().getNAMETerminalRuleCall());
	}
;

// Entry rule entryRuleVALUE
entryRuleVALUE returns [String current=null]:
	{ newCompositeNode(grammarAccess.getVALUERule()); }
	iv_ruleVALUE=ruleVALUE
	{ $current=$iv_ruleVALUE.current.getText(); }
	EOF;

// Rule VALUE
ruleVALUE returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	{
		newCompositeNode(grammarAccess.getVALUEAccess().getSTRING_OR_VALParserRuleCall());
	}
	this_STRING_OR_VAL_0=ruleSTRING_OR_VAL
	{
		$current.merge(this_STRING_OR_VAL_0);
	}
	{
		afterParserOrEnumRuleCall();
	}
;

// Entry rule entryRuleRule
entryRuleRule returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRuleRule()); }
	iv_ruleRule=ruleRule
	{ $current=$iv_ruleRule.current; }
	EOF;

// Rule Rule
ruleRule returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			(
				(
					{
						newCompositeNode(grammarAccess.getRuleAccess().getSelectorsSelectorParserRuleCall_0_0_0());
					}
					lv_selectors_0_0=ruleSelector
					{
						if ($current==null) {
							$current = createModelElementForParent(grammarAccess.getRuleRule());
						}
						add(
							$current,
							"selectors",
							lv_selectors_0_0,
							"tdt4250.xss.XSS.Selector");
						afterParserOrEnumRuleCall();
					}
				)
			)
			    |
			(
				otherlv_1='@'
				{
					newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getCommercialAtKeyword_0_1_0());
				}
				(
					(
						{
							if ($current==null) {
								$current = createModelElement(grammarAccess.getRuleRule());
							}
						}
						otherlv_2=RULE_NAME
						{
							newLeafNode(otherlv_2, grammarAccess.getRuleAccess().getGroupSelectorsGroupSelectorCrossReference_0_1_1_0());
						}
					)
				)
			)
		)
		(
			otherlv_3=','
			{
				newLeafNode(otherlv_3, grammarAccess.getRuleAccess().getCommaKeyword_1_0());
			}
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getSelectorsSelectorParserRuleCall_1_1_0_0());
						}
						lv_selectors_4_0=ruleSelector
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							add(
								$current,
								"selectors",
								lv_selectors_4_0,
								"tdt4250.xss.XSS.Selector");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_5='@'
					{
						newLeafNode(otherlv_5, grammarAccess.getRuleAccess().getCommercialAtKeyword_1_1_1_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRuleRule());
								}
							}
							otherlv_6=RULE_NAME
							{
								newLeafNode(otherlv_6, grammarAccess.getRuleAccess().getGroupSelectorsGroupSelectorCrossReference_1_1_1_1_0());
							}
						)
					)
				)
			)
		)*
		otherlv_7=':'
		{
			newLeafNode(otherlv_7, grammarAccess.getRuleAccess().getColonKeyword_2());
		}
		(
			(
				(
					(
						{
							newCompositeNode(grammarAccess.getRuleAccess().getXStatementsXStatementParserRuleCall_3_0_0_0());
						}
						lv_xStatements_8_0=ruleXStatement
						{
							if ($current==null) {
								$current = createModelElementForParent(grammarAccess.getRuleRule());
							}
							add(
								$current,
								"xStatements",
								lv_xStatements_8_0,
								"tdt4250.xss.XSS.XStatement");
							afterParserOrEnumRuleCall();
						}
					)
				)
				    |
				(
					otherlv_9='@'
					{
						newLeafNode(otherlv_9, grammarAccess.getRuleAccess().getCommercialAtKeyword_3_0_1_0());
					}
					(
						(
							{
								if ($current==null) {
									$current = createModelElement(grammarAccess.getRuleRule());
								}
							}
							otherlv_10=RULE_NAME
							{
								newLeafNode(otherlv_10, grammarAccess.getRuleAccess().getGroupStatementsGroupPropertyCrossReference_3_0_1_1_0());
							}
						)
					)
				)
			)
			otherlv_11=';'
			{
				newLeafNode(otherlv_11, grammarAccess.getRuleAccess().getSemicolonKeyword_3_1());
			}
		)+
	)
;

RULE_NAME : (RULE_ID|'-')+;

RULE_SEL : ('::'|':'|'.'|'#')? RULE_NAME ((('>'|'+'|'~')|('::'|':'|'.'|'#')|('>'|'+'|'~') ('::'|':'|'.'|'#')) RULE_NAME)*;

RULE_VAL : ('a'..'z'|'A'..'Z'|'-'|'0'..'9'|'.'|'%'|'{'|'}'|'*'|'+')+;

fragment RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
