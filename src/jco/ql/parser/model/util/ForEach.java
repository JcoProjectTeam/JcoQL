package jco.ql.parser.model.util;

import java.util.StringJoiner;

import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.predicate.Expression;

public class ForEach {
	public Condition forEachCondition;
	public Expression callExpression;

	
	public ForEach(Condition c, Expression e) {
		forEachCondition = c;
		callExpression = e;
	}

	
	public Condition getForEachCondition () {
		return forEachCondition;
	}

	
	public Expression getCallExpression () {
		return callExpression;
	}
	
	
	public String toString () {
		StringJoiner sj = new StringJoiner(" ", "FOR EACH ", "");
		sj.add(forEachCondition.toString());
		sj.add("CALL " + callExpression.toString());
		return sj.toString();
	}

	
	public String toMultilineString (int level) {
		String tabs ="\n";
		for (int i=0; i<=level; i++)
			tabs += "\t";

		StringJoiner str = new StringJoiner(tabs, "FOR EACH", "");
		str.add(forEachCondition.toMultilineString(level+2));
		str.add("CALL " + callExpression.toMultilineString(level+2).trim());
		return str.toString();
	}
}
