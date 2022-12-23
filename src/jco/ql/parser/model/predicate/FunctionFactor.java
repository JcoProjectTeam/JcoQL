package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * 
 * @author Zunstraal
 *
 */
public class FunctionFactor extends ExpressionFactor {
	public static final int COUNT_FUNCTION 				= 11;
	public static final int TO_STRING_FUNCTION	 		= 12;
	public static final int TO_INT_FUNCTION 			= 13;
	public static final int TO_FLOAT_FUNCTION 			= 14;
	public static final int TO_BOOL_FUNCTION  			= 15;
	public static final int SERIALIZE_FUNCTION 			= 16;
	public static final int MAX_FUNCTION				= 17;
	public static final int MIN_FUNCTION				= 18;
	public static final int ABS_FUNCTION				= 19;
	public static final int GEO_DISTANCE_FUNCTION		= 21;
	public static final int JARO_WINKLER_FUNCTION		= 22;
	public static final int GEOMETRY_FIELD_FUNCTION		= 31;
	public static final int GEOMETRY_LENGTH_FUNCTION	= 32;
	public static final int GEOMETRY_AREA_FUNCTION		= 33;

	public static final String COUNT_STRING 			= "COUNT";
	public static final String TO_STRING_STRING 		= "TO_STRING";
	public static final String TO_INT_STRING 			= "TO_INT";
	public static final String TO_FLOAT_STRING 			= "TO_FLOAT";
	public static final String TO_BOOL_STRING 	 		= "TO_BOOL";
	public static final String SERIALIZE_STRING 		= "SERIALIZE";
	public static final String MAX_STRING				= "MAX";
	public static final String MIN_STRING				= "MIN";
	public static final String ABS_STRING				= "ABS";
	public static final String GEO_DISTANCE_STRING		= "GEODESIC_DISTANCE";
	public static final String JARO_WINKLER_STRING		= "JARO_WINKLER_SIMILARITY";
	public static final String GEOMETRY_FIELD_STRING	= "GEOMETRY_FIELD";
	public static final String GEOMETRY_LENGTH_STRING	= "GEOMETRY_LENGTH";
	public static final String GEOMETRY_AREA_STRING		= "GEOMETRY_AREA";

	public int functionType;
	public String functionName;
	public List<Expression> functionParams;
	private static Hashtable <String, Integer> functionMap;


	public FunctionFactor () {
		type = FUNCTION;
		loadFunctionMap ();

		functionType = UNDEFINED;
		functionName = "UNDEFINED_FUNCTION";
		functionParams = new ArrayList<Expression>();
	}

	
	public FunctionFactor(String functionName, List<Expression> params) {
		type = FUNCTION;
		loadFunctionMap ();

		this.functionName = functionName;
		functionType = getFunctionType(functionName);
		if (params == null)
			functionParams = new ArrayList<Expression>();
		else
			functionParams = params;
	}

	private void loadFunctionMap () {
		functionMap = new Hashtable<String, Integer>(31);
		functionMap.put(COUNT_STRING, COUNT_FUNCTION);
		functionMap.put(TO_STRING_STRING, TO_STRING_FUNCTION );
		functionMap.put(TO_INT_STRING, TO_INT_FUNCTION);
		functionMap.put(TO_FLOAT_STRING, TO_FLOAT_FUNCTION);
		functionMap.put(TO_BOOL_STRING, TO_BOOL_FUNCTION);
		functionMap.put(SERIALIZE_STRING, SERIALIZE_FUNCTION);
		functionMap.put(MAX_STRING, MAX_FUNCTION);
		functionMap.put(MIN_STRING, MIN_FUNCTION);
		functionMap.put(ABS_STRING, ABS_FUNCTION);
		functionMap.put(GEO_DISTANCE_STRING, GEO_DISTANCE_FUNCTION);		
		functionMap.put(JARO_WINKLER_STRING, JARO_WINKLER_FUNCTION);		
		functionMap.put(JARO_WINKLER_STRING, JARO_WINKLER_FUNCTION);		
		functionMap.put(JARO_WINKLER_STRING, JARO_WINKLER_FUNCTION);		
		functionMap.put(GEOMETRY_FIELD_STRING, GEOMETRY_FIELD_FUNCTION);		
		functionMap.put(GEOMETRY_LENGTH_STRING, GEOMETRY_LENGTH_FUNCTION);		
		functionMap.put(GEOMETRY_AREA_STRING, GEOMETRY_AREA_FUNCTION);		
	}
	
	
	public boolean isPredefinedFunction () {
		return functionType > FUNCTION;
	}
	
	
	public boolean checkPredefinedFunction (String fName) {
		return functionMap.containsKey(fName);
	}
	
	
	public int getFunctionType () {
		return functionType;
	}
	
	
	private int getFunctionType (String fName) {
		if (functionMap.containsKey(fName))
			return functionMap.get(fName);
		return FUNCTION;
	}
	
	
	public String getFunctionName (){
		return functionName;
	}

	
	public List<Expression> getFunctionParams () {
		return functionParams;
	}
	
	public boolean checkParamNumber () {
		// Generic functions have no constraints of parameter number
		if (functionType == FUNCTION)
			return true;

		if (functionType == GEO_DISTANCE_FUNCTION) 
			if (functionParams.size() == 4)
				return true;
			else 
				return false;

		if (functionType == MAX_FUNCTION || functionType == MIN_FUNCTION || functionType == JARO_WINKLER_FUNCTION ) 
			if (functionParams.size() == 2)
				return true;
			else 
				return false;
			
		if (functionType == GEOMETRY_FIELD_FUNCTION) 
			if (functionParams.size() == 0)
				return true;
			else 
				return false;
		// Other Prefedined functions have just 1 parameter by default
		return (functionParams.size() == 1);
	}

	
	public String toString () {
		String st = functionName + "(";			
		if (functionParams != null) {
			for (Expression e : functionParams)				
				st += e.toString() + ", ";
		}
		st += "#####)####";
		st = st.replace(", #####)####", ")").replace("#####)####", ")");
		return st;
	}
}
