package jco.ql.parser.model.predicate;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class IfFunction extends SpecialFunctionFactor {
	public Condition condition;
	public Expression trueCaseExp;
	public Expression falseCaseExp;

	public IfFunction(Condition cond, Expression trueExp, Expression falseExp) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = IF_FUNCTION;
		
		condition = cond;
		trueCaseExp = trueExp;
		falseCaseExp = falseExp;
	}
	
	
	public Condition getCondition () {
		return condition;
	}

	
	public Expression getTrueExpression () {
		return trueCaseExp;
	}

	
	public Expression getFalseExpression () {
		return falseCaseExp;
	}

	
	public String toString () {
		String st = "IF(" ;
		st += "(" + condition.toString() + "), ";
		st += trueCaseExp.toString() + ", ";
		st += falseCaseExp.toString() + ")";
		return st;
	}
}
