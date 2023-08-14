package jco.ql.parser.model.util;

import jco.ql.parser.model.predicate.Expression;

public class DeriveClause extends ForAllDeriveElement {
	
	public String alias;
	public Expression expression;

	public DeriveClause (String as, Expression e) {
		fadType = DERIVE_CLAUSE;
		alias = as;
		expression = e;
	}
	
	
	public String toString () {
		String str = "DERIVE " + expression.toString() + " AS " + alias;
		return str;
	}

	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";		
		String str = tabs + "DERIVE " + expression.toString() + " AS " + alias;
		return str;
	}
}
