package jco.ql.parser.model.fuzzy;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class FuzzySetDefinition {	
	public String fuzzySet;
	public String type;		// added by Balicco
	public Condition using;
	
	
	public FuzzySetDefinition(String fs, Condition fe) {
		fuzzySet = fs;
		using = fe;
		type = null;
	}
	
	public FuzzySetDefinition(String fs, Condition fe, String ty) {
		fuzzySet = fs;
		using = fe;
		type = ty;
	}

	public String toString() { 
		String str = ""; 
		if(type != null)
			str += type + " ";
		str += "FUZZY SET " + fuzzySet;
		str += " USING " + using.toString() + " ";
		return  str;
	}                                        

	public String toMultilineString(int level) { 
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs;
		if(type != null)
			str += type + " ";
		str	+= "FUZZY SET " + fuzzySet;
		str += " USING " + using.toString();
		return str;
	}                                        

}
