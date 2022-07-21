package jco.ql.parser.model;

import jco.ql.parser.model.util.DbCollection;

/**
 * 
 * @author Zunstraal
 *
 */
public class GetCollection extends Instruction {
	public static int UNDEFINED  = -1;
	public static int DB_TYPE  = 0;
	public static int URL_QUOTED_TYPE  = 1;
	public static int URL_APEX_TYPE  = 2;
	public int type;
	public DbCollection collection;
	public String urlString;
	
	public GetCollection (int seq, DbCollection cn) {
		id = GET_INSTRUCTION;
		instructionName = "Get Collection";
		type = DB_TYPE;
		sequence = seq;
		collection = cn;
		urlString = null;
	}
	
	public GetCollection(int seq, String url) {
		id = GET_INSTRUCTION;
		instructionName = "Get Collection";
		if (url.startsWith("'"))
			type = URL_APEX_TYPE;
		else
			type = URL_QUOTED_TYPE;
		sequence = seq;
		collection = null;
		urlString = url.substring(1, url.length()-1);
	}

	public String toString () {
		if (type == URL_QUOTED_TYPE)
			return instructionName.toUpperCase() + " FROM WEB \"" + urlString + "\";";
		if (type == URL_APEX_TYPE)
			return instructionName.toUpperCase() + " FROM WEB '" + urlString + "';";
		return instructionName.toUpperCase() + " " + collection.toString() + ";";
	}
	
	public String toMultilineString () {
		return toString() + "\n";
	}
}
