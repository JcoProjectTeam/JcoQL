package jco.ql.parser.model.fuzzy;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class FuzzySetDefinition {	
	public String fuzzySet;
	public Condition using;
	
	
	public FuzzySetDefinition(String fs, Condition fe) {
		fuzzySet = fs;
		using = fe;
	}

	public String toString() { 
		String str = "FUZZY SET " + fuzzySet;
		str += " USING " + using.toString() + " ";
		return  str;
	}                                        

	public String toMultilineString(int level) { 
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "FUZZY SET " + fuzzySet;
		str += " USING " + using.toString();
		return str;
	}                                        

}
