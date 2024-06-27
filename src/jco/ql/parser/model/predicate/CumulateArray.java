package jco.ql.parser.model.predicate;

public class CumulateArray extends SpecialFunctionFactor {
	public String arrayName;

	public CumulateArray(String an) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = ARRAY_CUMULATE;
		arrayName = an;
	}

	public String getArrayToCumulate ( ) {
		return arrayName;
	}

	public String toString () {
		return "CUMULATE (" + arrayName + ")"; 
	}
}
