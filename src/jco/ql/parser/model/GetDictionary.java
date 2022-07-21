package jco.ql.parser.model;

import jco.ql.parser.model.util.DbCollection;

/**
 * 
 * @author Zunstraal
 *
 */
public class GetDictionary extends Instruction {
	public static int UNDEFINED  = -1;
	public static int DB_TYPE  = 0;
	public int type;
	public DbCollection collection;
	
	public GetDictionary (int seq, DbCollection cn) {
		id = GET_DICTIONARY;
		instructionName = "Get Dictionary";
		type = DB_TYPE;
		sequence = seq;
		collection = cn;
	}
	
	
	public String toString () {
		return instructionName.toUpperCase() + " " + collection.toString() + ";";
	}
	
	public String toMultilineString () {
		return toString() + "\n";
	}
}
