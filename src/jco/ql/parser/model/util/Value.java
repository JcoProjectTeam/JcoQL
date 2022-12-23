package jco.ql.parser.model.util;

/**
 * Value descriptor
 * in terms of value and type both as strings
 * 
 * @author Zunstraal
 *
 */
public class Value {
	public static final int NULL 	= 0;
	public static final int INT 	= 1;
	public static final int FLOAT 	= 2;
	public static final int APEX 	= 3;
	public static final int QUOTED	= 4;
	public static final int BOOLEAN	= 5;
	/*Modifiche*/
	public static final int POS	= 6;
			
	public String value;
	public int type;   						// INT, FLOAT, APEX, QUOTED, BOOLEAN, POS
	
/**
 * 	
 * @param type: String
 * @param value: String
 */
	public Value (int type, String value) {
		this.value = value;
		this.type = type;
	}
	public Value () {
		this.value = null;
		this.type = NULL;
	}

	public boolean isNull () {
		return (type == NULL);
	}

	public boolean isInt () {
		return (type == INT);
	}

	public boolean isFloat () {
		return (type == FLOAT);
	}

	public boolean isQuoted () {
		return (type == QUOTED);
	}

	public boolean isApex () {
		return (type == APEX);
	}

	public boolean isBoolean () {
		return (type == BOOLEAN);
	}
	
	public boolean isPos () {
		return (type == POS);
	}
	
	public String toString () {
		return value;
	}

}
