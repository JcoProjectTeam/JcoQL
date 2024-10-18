package jco.ql.parser.model.util;

import jco.ql.parser.model.predicate.Expression;

public class FEDeriveClause extends FEInternalClause {
	public static final int DERIVE_SCALAR = 1;	
	public static final int DERIVE_ARRAY = 2;

	public String alias;
	public Expression expression;
	public int deriveType;

	public FEDeriveClause (String as, Expression e, int dt) {
		feicType = DERIVE_CLAUSE;
		alias = as;
		expression = e;
		deriveType = dt;
	}
	
	
	public boolean isDeriveScalar () {
		return deriveType == DERIVE_SCALAR;				
	}
	public boolean isDeriveArray () {
		return deriveType == DERIVE_ARRAY;				
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
