package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 * 21.06.2023 - Generalized class for EXTENT, MEMBERSHIP_TO and DEGREE special function
 * 2025.01.09 - ZUN TODO - Riordinare i metodi nell'Environement e qui
 *
 */
public class ExtentFunction extends SpecialFunctionFactor {
	public String fuzzyset;
	public String degree;
	
	
	public ExtentFunction (int sft, String fs) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = sft;  // EXTENT_FUNCTION or MEMBERSHIP_TO_FUNCTION
		fuzzyset = fs;
		degree = null;
	}
	

	public ExtentFunction (String fs, String dg, boolean t) {
		type = SPECIAL_FUNCTION;
		if (t)										// added 2025.01.09
			specialFuntionType = DEGREE_FUNCTION; 
		else {
			specialFuntionType = DEGREE_SHORTCUT;
			fs = fs.replace("#", "");
		}
		fuzzyset = fs;
		degree = dg;
	}
	
	
	public String getFuzzysetName () {
		return fuzzyset;
	}


	public String getDegreeName () {
		return degree;
	}


	public String toString () {
		String st = "";
		if (specialFuntionType == EXTENT_FUNCTION)
			st = "EXTENT (" + fuzzyset + ")";
		else if (specialFuntionType == MEMBERSHIP_TO_FUNCTION)
			st = "MEMBERSHIP_TO (" + fuzzyset + ")";
		else if (specialFuntionType == DEGREE_FUNCTION) {
			if (degree == null)
				st = "DEGREE (" + fuzzyset + ")";
			else
				st = "DEGREE (" + fuzzyset + degree + ")"; 
			}
		else {	// DEGREE_SHORTCUT
			st = "#" + fuzzyset;
			if (degree != null)
				st += degree; 
		}
		return st;
	}
}
