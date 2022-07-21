package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.util.Field;

/**
 * 
 * @author Zunstraal
 *
 */
public class ArrayFunctionFactor extends SpecialFunctionFactor {
	public static String MAX_FUNCTION_NAME 	= "MAX_ARRAY";
	public static String MIN_FUNCTION_NAME 	= "MIN_ARRAY";
	public static String SUM_FUNCTION_NAME 	= "SUM_ARRAY";
	public static String AVG_FUNCTION_NAME 	= "AVG_ARRAY";
	public static String NUMERIC_TYPE_STR 	= "NUMERIC";
	public static String STRING_TYPE_STR 	= "STRING";
	public static String BOOLEAN_TYPE_STR 	= "BOOLEAN";
	public static String DOCUMENT_TYPE_STR 	= "DOCUMENTS";

	public static int MAX_FUNCTION 	= 201;
	public static int MIN_FUNCTION 	= 202;
	public static int SUM_FUNCTION 	= 203;
	public static int AVG_FUNCTION 	= 204;
	public static int SOURCE_FIELD 	= 205;
	public static int SOURCE_ARRAY 	= 206;
	public static int NUMERIC_TYPE 	= 207;
	public static int STRING_TYPE 	= 208;
	public static int BOOLEAN_TYPE 	= 209;
	
	public static int SEARCH_ALL 	= 210;
	public static int SEARCH_DOC 	= 211;

	public String functionName;
	public int functionType;
	public int sourceType;
	public int fieldType;
	public String fieldTypeString;
	public Field sourceField;
	public List<Expression> sourceArray;
	public int searchType;
	public List<Field> searchingArray;

	public ArrayFunctionFactor(String fn) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = ARRAY_FUNCTION;

		functionName = fn;
		functionType = UNDEFINED;
		sourceType = UNDEFINED;
		sourceField = null;
		fieldType = UNDEFINED;
		sourceArray = new ArrayList<Expression> ();

		searchType = SEARCH_ALL;
		searchingArray = new ArrayList<Field> ();

		if (MAX_FUNCTION_NAME.equals(functionName))
			functionType = MAX_FUNCTION;
		else if (MIN_FUNCTION_NAME.equals(functionName))
			functionType = MIN_FUNCTION;
		if (SUM_FUNCTION_NAME.equals(functionName))
			functionType = SUM_FUNCTION;
		if (AVG_FUNCTION_NAME.equals(functionName))
			functionType = AVG_FUNCTION;
	}

	
	public void setFieldArray(Field fr) {
		sourceType = SOURCE_FIELD;
		sourceField = fr;
	}


	public void addExpressionArray(Expression expr) {
		sourceType = SOURCE_ARRAY;
		sourceArray.add(expr);
	}

	
	public void setFieldType (String type) {
		fieldTypeString = type;
		if (ArrayFunctionFactor.NUMERIC_TYPE_STR.equals(fieldTypeString))
			fieldType = NUMERIC_TYPE;
		else if (ArrayFunctionFactor.STRING_TYPE_STR.equals(fieldTypeString))
			fieldType = STRING_TYPE;
		else if (ArrayFunctionFactor.BOOLEAN_TYPE_STR.equals(fieldTypeString))
			fieldType = BOOLEAN_TYPE;
	}

	
	public void setDocSearchType () {
		searchType = SEARCH_DOC;
	}


	public void addSearchingField(Field fr) {
		searchingArray.add(fr);
	}

	
	public int getFunctionType () {
		return functionType;
	}
	
	
	public boolean isFieldSource () {
		return sourceType == SOURCE_FIELD;
	}
	
	
	public boolean isArraySource () {
		return sourceType == SOURCE_ARRAY;
	}
	
	
	public Field getSourceField () {
		return sourceField;
	}
	
	
	public List<Expression> getSourceArray () {
		return sourceArray;
	}
	
	
	public int getSourceType () {
		return sourceType;
	}
	
	
	public boolean hasSearchArray () {
		return searchingArray.size() > 0;
	}

	
	public int getSearchType () {
		return searchType;
	}

	
	public boolean searchAll () {
		return searchType == SEARCH_ALL;
	}
	
	
	public boolean searchOnlyDoc () {
		return searchType == SEARCH_DOC;
	}
	
	
	public List<Field> getSearchingArray () {
		return searchingArray;
	}
	

	public String toString () {
		String str = functionName + "( ";
		if (isFieldSource())
			str += sourceField.toString();
		else {
			str += "[";
			for (Expression e : sourceArray)
				str += e.toString() + ", ";
			str += "]";
			str = str.replace(", ]", "]");
		}
		str += ", " + fieldTypeString;
		
		if (hasSearchArray()) {
			if (searchOnlyDoc ())
				str += ", " + DOCUMENT_TYPE_STR; 
			for (Field fr : searchingArray)
				str += ", " + fr.toString();
		}
		str += ")";
		return str;
	}
	
	
}
