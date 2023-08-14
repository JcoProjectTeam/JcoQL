package jco.ql.parser.model.util;

public abstract class ForAllDeriveElement {
	public static final int FOR_ALL_CLAUSE = 0;
	public static final int DERIVE_CLAUSE 	= 1;
	
	public int fadType;

	public abstract String toMultilineString (int level) ;
	
	public boolean isDeriveClause () {
		return fadType == DERIVE_CLAUSE;
	}
	public boolean isForAllClause () {
		return fadType == FOR_ALL_CLAUSE;
	}
}
