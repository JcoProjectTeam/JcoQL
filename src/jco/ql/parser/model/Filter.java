package jco.ql.parser.model;

import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class Filter extends Instruction {
	public CaseClause caseClause;
	public boolean removeDuplicates;

	public Filter (int seq, CaseClause cc) {
		id = FILTER_INSTRUCTION;
		instructionName = "Filter";
		sequence = seq;		
		caseClause = cc;
		removeDuplicates = false;
	}
	
	public void setRemoveDuplicates() {
		removeDuplicates = true;
	}
	public boolean isRemoveDuplicates () {
		return removeDuplicates;
	}
	
	
	public String toString () {
		String st = instructionName.toUpperCase() + " " + caseClause.toString();
		if (removeDuplicates)
			st += " REMOVE DUPLICATES";
		return st.trim() + ";";
	}

	public String toMultilineString () {
		String st = instructionName.toUpperCase() + " " + caseClause.toMultilineString(1);
		if (removeDuplicates)
			st += "\n\tREMOVE DUPLICATES";
		return st.trim() + ";\n";
	}

}
