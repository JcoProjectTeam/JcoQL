package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Balicco
 *
 */
public class DegreeFunction extends SpecialFunctionFactor {

	//List per eventuali estensioni
	public List<String> degree;
	
	public DegreeFunction (String m1, String m2) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = DEGREE_FUNCTION;
		degree = new ArrayList<String>();
		degree.add(m1);
		degree.add(m2);
	}
	
	public DegreeFunction (String m1) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = DEGREE_FUNCTION;
		degree = new ArrayList<String>();
		degree.add(m1);
	}
	
	public ArrayList<String> getDegreeFuzzyset () {
		return (ArrayList<String>) degree;
	}


	public String toString () {
			String str;
			str ="DEGREE ("+ degree.get(0);
			if (degree.size() > 1)
				str += degree.get(1);
			str += ")";
			return str;

	}
}
