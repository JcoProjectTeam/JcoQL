package jco.ql.parser.model.condition;

import jco.ql.parser.model.predicate.Predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class Condition {
	public static int UNDEFINED  = -1;
	public static int SIMPLE_CONDITION  = 0;	// unused
	public static int NOT_CONDITION  = 1;
	public static int AND_CONDITION  = 2;
	public static int OR_CONDITION  = 3;
	public static int PREDICATE_CONDITION  = 4;
	
	public Predicate predicate = null;
	public int type = UNDEFINED;

	
	public Condition () {
		predicate = null;
		type = UNDEFINED;
	}
	public Condition (Predicate p) {
		predicate = p;
		type = PREDICATE_CONDITION;
	}


	public int getType () {
		return type;
	}


	public Predicate getPredicate () {
		return predicate;
	}


	public String toString () {
		if (type == PREDICATE_CONDITION)
			return predicate.toString();
		return "CONDITION UNDEFINED";
	}


	public String toMultilineString (int level) {
		String tabs = "";
		for (int i=0; i<level; i++)
			tabs += "\t";
		if (type == PREDICATE_CONDITION)
			return predicate.toMultilineString(level);
		return tabs + "CONDITION UNDEFINED";
	}

}
