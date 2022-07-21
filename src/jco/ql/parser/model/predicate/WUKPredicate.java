package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Zunstraal
 *
 */
public class WUKPredicate extends Predicate {
	public static final int UNDEFINED_PREDICATE = -1;
	public static final int WITHIN_PREDICATE = 17;
	public static final int KNOWN_PREDICATE = 18;
	public static final int UNKNOWN_PREDICATE = 19;

	public List<String> fuzzySets;
	public int wukType;
	public String predicateName;

	public WUKPredicate (String pn) {
		type = WUK_PREDICATE;
		fuzzySets = new ArrayList<String>();
		predicateName = pn;
		wukType = UNDEFINED_PREDICATE;
		if ("WITHIN".equals(predicateName))
			wukType = WITHIN_PREDICATE;
		else if ("KNOWN".equals(predicateName)) 
			wukType = KNOWN_PREDICATE;
		else if ("UNKNOWN".equals(predicateName)) 
			wukType = UNKNOWN_PREDICATE;
	}
	

	public int getWUKType () {
		return wukType;
	}
	
	
	public List<String> getFuzzySetsList () {
		return fuzzySets;
	}

	
	
	public void addFuzzySet (String fs) {
		fuzzySets.add(fs);
	}

	public String toString () {
		String str = predicateName + " FUZZY SETS ";
		for (int i = 0; i < fuzzySets.size()-1; i++)
			str += fuzzySets.get(i) + ", ";
		if (fuzzySets.size() > 0)
			str += fuzzySets.get(fuzzySets.size()-1) + " ";			

		return str;		
	}

	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + predicateName + " FUZZY SETS ";
		for (int i = 0; i < fuzzySets.size()-1; i++)
			str += fuzzySets.get(i) + ", ";		
		if (fuzzySets.size() > 0)
			str += fuzzySets.get(fuzzySets.size()-1) + " ";			

		return str;
	}
	
}
