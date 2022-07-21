package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class Predicate {
	public static final int UNDEFINED = -1;
	public static final int WITH_PREDICATE = 0;
	public static final int WITHOUT_PREDICATE = 1;
	public static final int EXPRESSION_PREDICATE = 2;
	public static final int COMPARISON_PREDICATE = 3;
	public static final int IN_RANGE_PREDICATE = 4;
	public static final int NULL_PREDICATE = 5;

	//fuzzy
	public static final int WUK_PREDICATE = 10;	
	public static final int USING_PREDICATE = 11;	

	public int type;

	public Predicate () {
		type = UNDEFINED;		
	}
	
	
	public int getType () {
		return type;
	}

	
	public String toString () {
		String str = "UNDEFINED PREDICATE";
		return str;		
	}

	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "UNDEFINED PREDICATE ML";

		return str;
	}
	
}
