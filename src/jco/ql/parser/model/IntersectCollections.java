package jco.ql.parser.model;

import jco.ql.parser.model.util.DbCollection;

/**
 * 
 * @author Zunstraal
 *
 */
public class IntersectCollections extends Instruction  {
	public DbCollection collection1;
	public DbCollection collection2;
	
	public IntersectCollections (int seq, DbCollection coll1, DbCollection coll2) {
		id = INTERSECT_INSTRUCTION ;
		instructionName = "Intersect Collections";
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
