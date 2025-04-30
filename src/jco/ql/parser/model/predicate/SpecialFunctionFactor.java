package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class SpecialFunctionFactor extends ExpressionFactor {
	public static final int EXTENT_FUNCTION  		= 101;
	public static final int MEMBERSHIP_TO_FUNCTION  = 102;
	public static final int DEGREE_FUNCTION  		= 103;	// added by Balicco
	public static final int DEGREE_SHORTCUT  		= 104;	// added 2025.01.09
	public static final int TRANSLATE_FUNCTION  	= 105;
	public static final int IF_FUNCTION  			= 106;	// added 2025.02.26
	public static final int IF_ERROR_FUNCTION  		= 107;
	public static final int MEMBERSHIP_ARRAY 		= 108;

	public static final int EXTRACT_ARRAY_FUNCTION 	= 199;	// added on 2023.09.04
	public static final int ARRAY_FUNCTION 			= 200;
	public static final int ARRAY_CUMULATE			= 201; 	//Fuzzy aggregation

	int specialFuntionType;
	
	public SpecialFunctionFactor () {
		type = SPECIAL_FUNCTION;
		specialFuntionType = UNDEFINED;
	}

	
	public int getSpecialFuntionType () {
		return specialFuntionType;
	}
	
}
