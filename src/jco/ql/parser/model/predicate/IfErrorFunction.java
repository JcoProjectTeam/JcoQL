package jco.ql.parser.model.predicate;

import jco.ql.parser.model.util.Value;

/**
 * 
 * @author Zunstraal
 *
 */
public class IfErrorFunction extends SpecialFunctionFactor {
	public Expression expression2check;
	public Value defalutValue;

	public IfErrorFunction(Expression expr, Value value) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = IF_ERROR_FUNCTION;
		
		expression2check  = expr;
		defalutValue = value;
	}
	
	
	public Expression getExpression2Check () {
		return expression2check;
	}

	
	public Value getDefaultValue () {
		return defalutValue;
	}

	
	public String toString () {
		String st = "IF_ERROR (";
		st += expression2check.toString();
		st += ", " + defalutValue.toString() + ")";
		return st;
	}
}
