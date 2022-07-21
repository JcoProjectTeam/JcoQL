package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class SortField {
	public static int UNDEFINED = -1;
	public static int DEFAULT = 0;
	public static int ASCENDING = 1;
	public static int DESCENDING = 2;

	public static int NUMERIC = 1;
	public static int STRING = 2;
	public static int BOOLEAN = 3;
	public static String NUMERIC_STR = "NUMERIC";
	public static String STRING_STR = "STRING";
	public static String BOOLEAN_STR = "BOOLEAN";
	
	public Field field;
	public int versus;
	public String versusStr;
	public int fieldType;
	public String fieldTypeStr;
	
	public SortField (Field f, String ft) {
		field = f;
		versus = DEFAULT;
		versusStr = "";
		fieldTypeStr = ft;
		fieldType = getType (ft);
	}

	
	public void setVersus(String v) {
		versusStr = v;
		if ("DESC".equals(versusStr))
			versus = DESCENDING;
		else 
			versus = ASCENDING;
		
	}

	
	public String toString () {
		String st = field.toString() + " TYPE " + fieldTypeStr;
		if (versus != DEFAULT)
			st += " " + versusStr;
		return st;
	}

	
	public static boolean checkType (String type) {
		if (NUMERIC_STR.equals(type))
			return true;
		if (STRING_STR.equals(type))
			return true;
		if (BOOLEAN_STR.equals(type))
			return true;
		return false;
	}

	public static int getType (String type) {
		if (NUMERIC_STR.equals(type))
			return NUMERIC;
		if (STRING_STR.equals(type))
			return STRING;
		if (BOOLEAN_STR.equals(type))
			return BOOLEAN;

		return UNDEFINED;
	}
}
