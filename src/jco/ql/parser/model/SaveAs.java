package jco.ql.parser.model;

import jco.ql.parser.model.util.DbCollection;

/**
 * 
 * @author Zunstraal
 *
 */
public class SaveAs extends Instruction {
	public DbCollection collection;
	
	public SaveAs (int seq, DbCollection cn) {
		id = SAVE_INSTRUCTION;
		instructionName = "Save As";
		sequence = seq;
		collection = cn;
	}

	public String toString () {
		return instructionName.toUpperCase() + " " + collection.toString () + ";";
	}	
	
	public String toMultilineString () {
		return toString	() + "\n";
	}
}
