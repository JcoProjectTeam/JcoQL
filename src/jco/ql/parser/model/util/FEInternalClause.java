package jco.ql.parser.model.util;

// Container class for SORT, DERIVE and FOR ALL
public abstract class FEInternalClause {
	public static final int SORT_CLAUSE 	= 0;
	public static final int DERIVE_CLAUSE 	= 1;
	public static final int FOR_ALL_CLAUSE 	= 2;
	
	public int feicType;

	public abstract String toMultilineString (int level) ;
	
	public boolean isSortClause () {
		return feicType == SORT_CLAUSE;
	}
	public boolean isDeriveClause () {
		return feicType == DERIVE_CLAUSE;
	}
	public boolean isForAllClause () {
		return feicType == FOR_ALL_CLAUSE;
	}
}
