package jco.ql.parser.model.predicate;

import jco.ql.parser.model.util.Field;

public class ArrayReference {
	public static final int UNDEFINED 		= -1;
	public static final int ARRAY 			= 1;
	public static final int ARRAY_FIELD 	= 2;
	
	public static final String ARRAY_STRING 	= "ARRAY"; //costante per fare riferimento al tipo dei parametri della CREATE FUZZY AGGREGATOR
	
	
	public String id_array;
	public Expression index; //può essere sia POS che un'espressione
	public Field array_field;
	public int type;
	
	public ArrayReference(String id_array) {
		this.id_array = id_array;
		this.type = UNDEFINED;
		index = null;
		array_field = null;			
	}
	
	public boolean hasFields() {
		return !(array_field == null);
	}
	
	public boolean hasIndexPos() {
		return index == null;
	}
	
	public String toString() {
		String str = id_array + "[" + index.toString() + "]";
		if(type == ARRAY_FIELD)
			str += array_field.toString();
				
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
