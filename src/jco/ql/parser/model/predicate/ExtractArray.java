package jco.ql.parser.model.predicate;

import jco.ql.parser.model.util.Field;

public class ExtractArray extends SpecialFunctionFactor {
	public Field fieldName;
	public Field arrayName;
	
	
	public ExtractArray (Field f, Field a) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = EXTRACT_ARRAY_FUNCTION;
		fieldName = f;
		arrayName = a;
	}
	
	public String toString () {
		String str = "EXTRACT_ARRAY (" + fieldName.toString()  + " FROM ARRAY " + arrayName.toString() + ")";
		return str;
	}

}
