package jco.ql.parser.model.util;

import jco.ql.parser.model.predicate.Expression;

public class LocallyClause {
	public Expression expression;
	public String alias;
	
	public LocallyClause(Expression e, String alias) {
		this.expression = e;
		this.alias = alias;
	}
	
	public String toString() {
		
		return expression.toString() + " AS " + alias;
	}
	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";		
		String str = tabs + toString();
		
		return str;
	}

}
