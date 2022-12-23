package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class SpecialFunctionFactor extends ExpressionFactor {
	public static final int MEMBERSHIP_OF_FUNCTION  = 101;
	public static final int TRANSLATE_FUNCTION  	= 102;
	public static final int IF_ERROR_FUNCTION  		= 103;

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
