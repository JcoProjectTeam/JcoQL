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
	public static final int TRANSLATE_FUNCTION  	= 104;
	public static final int IF_ERROR_FUNCTION  		= 105;
	public static final int MEMBERSHIP_ARRAY 		= 106;

	public static final int ARRAY_FUNCTION 			= 200;

	int specialFuntionType;
	
	public SpecialFunctionFactor () {
		type = SPECIAL_FUNCTION;
		specialFuntionType = UNDEFINED;
	}

	
	public int getSpecialFuntionType () {
		return specialFuntionType;
	}
	
}
