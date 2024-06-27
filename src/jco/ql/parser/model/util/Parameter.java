package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class Parameter {
	public static final int UNDEFINED 	= -1;
	public static final int ASCENDING 	= 1;
	public static final int DESCENDING 	= 2;
	public static final String ARRAY 	= "ARRAY";
	public static final String BOOLEAN 	= "BOOLEAN";
	public static final String DOCUMENT = "DOCUMENT";
	public static final String NUMERIC 	= "NUMERIC";
	public static final String STRING 	= "STRING";
	public static final String ASC 		= "ASC";
	public static final String DESC 	= "DESC";
	
	public String name;
	public String type;

	
	public Parameter (String n, String t) {
		name = n;
		type = t;
	}

	public String toString () {
		String st = name + " TYPE " + type;
		return st;
	}
	

	public static boolean knownType (String type) {
		if (ARRAY.equals(type) 		||	BOOLEAN.equals(type)	|| DOCUMENT.equals(type) ||	
			NUMERIC.equals(type) 	||	STRING.equals(type))
			return true;
		return false;
	}
	
	public boolean isArray () {
		return ARRAY.equals(type);
	}
	public boolean isBoolean () {
		return BOOLEAN.equals(type);
	}
	public boolean isDocument () {
		return DOCUMENT.equals(type);
	}
	public boolean isNumeric () {
		return NUMERIC.equals(type);
	}
	public boolean isString () {
		return STRING.equals(type);
	}

}
