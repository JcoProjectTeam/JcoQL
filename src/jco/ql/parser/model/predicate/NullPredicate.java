package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
import jco.ql.parser.model.util.Field;

/**
 * 
 * @author Zunstraal
 *
 */
public class NullPredicate extends Predicate {
	public static final int CHECK_NULL = 0;
	public static final int CHECK_NOT_NULL = 1;

	public Field fieldRef;
	public int nullType;
	
	public NullPredicate (Field f, int t) {
		type = NULL_PREDICATE;
		fieldRef = f;
		nullType = t;
	}
	
	public int getCheckType ( ) {
		return nullType;
	}

	public String toString () {
		String str = "FIELD " + fieldRef + " ";
		if (nullType == CHECK_NULL)
			str += "IS NULL";
		else
			str += "IS NOT NULL";

		return str;
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String str = tabs + "FIELD " + fieldRef + " ";
		if (nullType == CHECK_NULL)
			str += "IS NULL";
		else
			str += "IS NOT NULL";
		
		return str;
	}
}
