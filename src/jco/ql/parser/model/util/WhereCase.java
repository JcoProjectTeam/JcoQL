package jco.ql.parser.model.util;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class WhereCase {
	public Condition condition;
	public GenerateSection generateSection;

	public WhereCase () {
		condition = null;

	}
	public WhereCase (Condition c) {
		this ();
		condition = c;
	}	

	public void setGenerateSection(GenerateSection gs) {
		generateSection = gs;
	}

	public boolean hasGenerateSection () {
		return (generateSection != null);
	}

	
	public Condition getCondition ( ) {
		return condition;
	}

	
	public String toString () {
		String str = "WHERE ";

		str += condition.toString();
		if (hasGenerateSection())
			str += " " + generateSection.toString();			

		return str;
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String str = tabs + "WHERE\t";
		str += condition.toMultilineString(level+2);

		tabs += "\t";
		if (hasGenerateSection())
			str += " " + generateSection.toMultilineString(level+1);			
		
		return str;
		}

}
