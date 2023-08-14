package jco.ql.parser.model.predicate;

import jco.ql.parser.model.util.Field;

public class ArrayReference {
	public static final int UNDEFINED 		= -1;
	public static final int ARRAY 			= 1;
	public static final int ARRAY_FIELD 	= 2;
	
	public static final String ARRAY_STRING 	= "ARRAY"; //costante per fare riferimento al tipo dei parametri della CREATE FUZZY AGGREGATOR
	
	
	public String idArray;
	public Expression index; //può essere sia POS che un'espressione
	public Field arrayField;
	public int type;
	
	public ArrayReference(String id_array) {
		this.idArray = id_array;
		this.type = UNDEFINED;
		index = null;
		arrayField = null;			
	}
	
	public boolean hasFields() {
		return !(arrayField == null);
	}
	
	public boolean hasIndexPos() {
		return index == null;
	}
	
	public String toString() {
		String str = idArray + "[" + index.toString() + "]";
		if(type == ARRAY_FIELD)
			str += arrayField.toString();
				
		return str;
	}
	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + toString ();
		return str;
	}

}
