package jco.ql.parser.model.predicate;

import java.util.*;

import jco.ql.parser.model.util.Field;

/**
 * 
 * @author Zunstraal
 *
 */
public class WithPredicate extends Predicate {
	public static final int UNDEFINED 	= -1;	
	public static final int SIMPLE 		= 0;	
	public static final int COMPLEX 	= 1;	
	public static final int ARRAY 		= 2;	
	public static final int STRING 		= 3;	
	public static final int NUMBER 		= 4;	
	public static final int INTEGER 	= 5;	
	public static final int FLOAT 		= 6;	
	public static final int BOOLEAN 	= 7;	
	public static final int GEOMETRY 	= 8;	

	public List<Field> fieldRefs;
	String typeSelectorStr;
	int typeSelector;

	
	public WithPredicate () {	
		type = WITH_PREDICATE;
		fieldRefs = new ArrayList<Field>();
		typeSelector = UNDEFINED;
		typeSelectorStr = "";
	}

	
	public int getSelectorType () {
		return typeSelector;
	}
	
	
	public List<Field> getFieldsList () {
		return fieldRefs;
	}
	
	
	public void addField (Field f) {
		fieldRefs.add(f);
	}

	public void setTypeSelector (int ts, String str) {		
		typeSelector = ts;
		typeSelectorStr = str;
	}

	public int getTypeSelector () {
		return typeSelector;
	}

	public String toString () {
		String str = "WITH ";
		if (typeSelector != UNDEFINED)
			str += typeSelectorStr + " ";
		
		if (fieldRefs.size() > 0)
			str += fieldRefs.get(0).toString();
		else 
			str += " *** ERROR WITH LIST EMPTY";
		for (int i=1; i<fieldRefs.size(); i++)
			str += ", " + fieldRefs.get(i).toString();
		return str;
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String str = tabs + "WITH ";
		if (typeSelector != UNDEFINED)
			str += typeSelectorStr + " ";
		
		if (fieldRefs.size() > 0)
			str += fieldRefs.get(0).toString();
		else 
			str += " *** ERROR WITH LIST EMPTY";
		for (int i=1; i<fieldRefs.size(); i++)
			str += ", " + fieldRefs.get(i).toString();
		return str;
	}

}
