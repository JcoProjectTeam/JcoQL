package jco.ql.parser.model.fuzzy;

import java.util.ArrayList;
import java.util.List;

public class SetFuzzySets {
	public static final int UNDEFINED = -1;
	public static final int POLICY_DEFAULT = 0;
	public static final int POLICY_AND = 1;
	public static final int POLICY_OR = 2;
	public static final int POLICY_FIRST = 3;
	public static final int POLICY_LAST = 4;

	public static final int KEEP_ALL= 10;
	public static final int KEEP_LEFT = 11;
	public static final int KEEP_RIGHT= 12;	
	public static final int DEFINITION_LIST = 20;

	public int policyType;
	public String policyStr;
	public int setType;
	public String setByKeepStr;
	public List<FuzzySetDefinitionElement> fuzzySetsList;


	public SetFuzzySets () {
		policyType = POLICY_DEFAULT;
		policyStr = "DEFAULT POLICY";
		setType = UNDEFINED;
		setByKeepStr = "";
		fuzzySetsList = new ArrayList<FuzzySetDefinitionElement> ();
	}


	public void setByKeep(String text) {
		setByKeepStr = text;
		if (setByKeepStr.equals("ALL"))
			setType = KEEP_ALL;
		else if (setByKeepStr.equals("LEFT"))
			setType = KEEP_LEFT;
		else if (setByKeepStr.equals("RIGHT"))
			setType = KEEP_RIGHT;
	}


	public void setPolicy(String text) {
		policyStr = text;
		if (policyStr.equals("AND"))
			policyType = POLICY_AND;
		else if (policyStr.equals("OR"))
			policyType = POLICY_OR;
		else if (policyStr.equals("FIRST"))
			policyType = POLICY_FIRST;
		else if (policyStr.equals("LAST"))
			policyType = POLICY_LAST;		
	}


	public boolean hasSetPolicy () {
		return (policyType != POLICY_DEFAULT);
	}


	public void add(String side) {
		setType = DEFINITION_LIST;
		fuzzySetsList.add(new FuzzySetDefinitionElement(null, side, "ALL", null));	
	}


	public void add(String side, String sourceFuzzySet, String newFs) {
		setType = DEFINITION_LIST;
		if (newFs == null)
			fuzzySetsList.add(new FuzzySetDefinitionElement(null, side, sourceFuzzySet, null));	
		else
			fuzzySetsList.add(new FuzzySetDefinitionElement(null, side, sourceFuzzySet, newFs));	
	}


	public void addFunction(String function, String side, String newFuzzySet) {
		setType = DEFINITION_LIST;
		fuzzySetsList.add(new FuzzySetDefinitionElement(function, side, null, newFuzzySet));	
	}


	public String toString() {
		String str = "SET FUZZY SETS ";
		if (setType == DEFINITION_LIST) {
			str += fuzzySetsList.get(0).toString();
			for (int i=1; i<fuzzySetsList.size(); i++)
				str += ", " + fuzzySetsList.get(i).toString();
			str += " ";
		}
		else if (setType != UNDEFINED)
			str += "KEEP " + setByKeepStr + " ";
		
		
		if (hasSetPolicy())
			str += "RESOLVING WITH " + policyStr + " ";

		return str;
	}


	public String toMultilineString(int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "SET FUZZY SETS ";
		tabs += "\t";
		if (setType == DEFINITION_LIST) {
			if (fuzzySetsList.size() == 1)
				str += "\t" + fuzzySetsList.get(0).toString() + ", ";
			else
				for (int i=0; i<fuzzySetsList.size(); i++)
					str += tabs + fuzzySetsList.get(i).toString() + ", ";
			str += "xxx";
			str = str.replace(", xxx", " ");
		}
		else if (setType != UNDEFINED)
			str += "KEEP " + setByKeepStr + " ";
				
		if (hasSetPolicy())
			str += tabs + "RESOLVING WITH " + policyStr + " ";

		return str;
	}


}
