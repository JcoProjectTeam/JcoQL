package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;


/**
 * 
 * @author Zunstraal
 *
 */
public class CaseClause {
	public static final int UNDEFINED = -1;	
	public static final int OTHERS_DEFAULT = 0;	
	public static final int OTHERS_KEEP = 1;	
	public static final int OTHERS_DROP = 2;	
	public static final String KEEP = "KEEP";	
	public static final String DROP = "DROP";		

	public List<WhereCase> whereList;
	public String others;
	public int othersType;
	
	
	public CaseClause () {
		whereList = new ArrayList<WhereCase>();
		others = null;
		othersType = OTHERS_DEFAULT;
		
	}

	
	public void addWhereCase (WhereCase wc) {
		whereList.add(wc);
	}

	
	public void setOthers (String oth) {
		others = oth;

		if (others.equalsIgnoreCase(KEEP))
			othersType = OTHERS_KEEP;
		else
			othersType = OTHERS_DROP;
	}
	
	
	public String toString () {
		String str = "CASE";

		for (int i=0; i<whereList.size(); i++)
			str += " " + whereList.get(i).toString();

		if (othersType != OTHERS_DEFAULT)
			str += " " + others + " OTHERS";
	
		return str;
	}

	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "CASE";
		tabs += "\t";

		for (int i=0; i<whereList.size(); i++)
			str += whereList.get(i).toMultilineString(level+1);

		if (othersType != OTHERS_DEFAULT)
			str += tabs + others + " OTHERS";
	
		return str;
	}

}
