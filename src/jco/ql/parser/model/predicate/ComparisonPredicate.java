package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class ComparisonPredicate extends Predicate {
	public static final int UNDEFINED = -1;
	public static final int COMP_EQ = 0;
	public static final int COMP_NEQ = 1;
	public static final int COMP_LT = 2;
	public static final int COMP_GT = 3;
	public static final int COMP_LE = 4;
	public static final int COMP_GE = 5;

	public static final String EQ = "=";
	public static final String NEQ = "!=";
	public static final String LT = "<";
	public static final String GT = ">";
	public static final String LE = "<=";
	public static final String GE = ">=";

	public Expression expression1;
	public Expression expression2;
	public String comparator;
	public int comparatorType;

	
	public ComparisonPredicate (Expression e1, String c, Expression e2) {
		type = COMPARISON_PREDICATE;
		expression1 = e1;
		comparator = c;
		comparatorType = setComparator (comparator);
		expression2 = e2;
	}

	public int getComparator () {
		return comparatorType;
	}
	public static int setComparator(String comparatorString) {
		if (comparatorString == null)
			return UNDEFINED;
		if (EQ.equals(comparatorString))
			return COMP_EQ;
		if (NEQ.equals(comparatorString))
			return COMP_NEQ;
		if (LT.equals(comparatorString))
			return COMP_LT;
		if (GT.equals(comparatorString))
			return COMP_GT;
		if (LE.equals(comparatorString))
			return COMP_LE;
		if (GE.equals(comparatorString))
			return COMP_GE;

		return UNDEFINED;
	}

	public String toString () {
		String str = expression1.toString() + " " + comparator + " " + expression2.toString();
		return str;		
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + expression1.toString() + " " + comparator + " " + expression2.toString();

		return str;
	}

}
