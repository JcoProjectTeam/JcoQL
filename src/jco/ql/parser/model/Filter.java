package jco.ql.parser.model;

import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class Filter extends Instruction {
	public static final int UNDEFINED 			= -1;
	public static final int CASE_FILTER	 		= 1;
	public static final int GENERATE_FILTER		= 2; 

	public int type;
	public CaseClause caseClause;
	public GenerateSection generateSection;
	public boolean removeDuplicates;

	public Filter (int seq, CaseClause cc) {
		type = CASE_FILTER;
		id = FILTER_INSTRUCTION;
		instructionName = "Filter";
		sequence = seq;		
		caseClause = cc;
		generateSection = null;
		removeDuplicates = false;
	}
	
	public Filter(int seq, GenerateSection gs) {
		type = GENERATE_FILTER;
		id = FILTER_INSTRUCTION;
		instructionName = "Filter";
		sequence = seq;		
		caseClause = null;
		generateSection = gs;
		removeDuplicates = false;
	}

	public void setRemoveDuplicates() {
		removeDuplicates = true;
	}
	public boolean isRemoveDuplicates () {
		return removeDuplicates;
	}

	public int getType () {
		return type;
	}
	
	public boolean isCaseFilter () {
		return type == CASE_FILTER;
	}
	
	public boolean isGenerateFilter () {
		return type == GENERATE_FILTER;
	}
	
	
	public String toString () {
		String st = instructionName.toUpperCase() + " ";
		if (isCaseFilter())
			st += caseClause.toString();
		else
			st += generateSection.toString();

		if (removeDuplicates)
			st += " REMOVE DUPLICATES";
		return st.trim() + ";";
	}

	public String toMultilineString () {
		String st = instructionName.toUpperCase() + " ";
		if (isCaseFilter())
			st += caseClause.toMultilineString(1);
		else
			st += generateSection.toMultilineString(1);

		if (removeDuplicates)
			st += "\n\tREMOVE DUPLICATES";
		return st.trim() + ";\n";
	}

}
