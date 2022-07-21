package jco.ql.parser.model;

import jco.ql.parser.model.util.DbCollection;

/**
 * 
 * @author Zunstraal
 *
 */
public class SubtractCollections extends Instruction {
	public DbCollection collection1;
	public DbCollection collection2;
	
	public SubtractCollections (int seq, DbCollection coll1, DbCollection coll2) {
		id = SUBTRACT_INSTRUCTION;
		instructionName = "Subtract Collections";
		sequence = seq;
		collection1 = coll1;
		collection2 = coll2;
	}

	public String toString () {
		return instructionName.toUpperCase() + " " +
						collection1.toString () + ", " + collection2.toString () + ";";
	}	

	public String toMultilineString () {
		return toString	() + "\n";
	}

}
