package jco.ql.parser.model.util;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class PartitionMatching {

	public Field matching;
	public Field wrt;
	public String unit;
	public double value;
	public Condition whereCondition;
	public Field into;
	public Field pathToInput;
	public double similarity;
	boolean boolSimilarity;
	
	
	public PartitionMatching(Field fr1, Field fr2, String u, String v) {
		matching = fr1;
		wrt = fr2;
		unit = u;
		value = Double.parseDouble(v);
		whereCondition = null;
		into = null;
		pathToInput = null;
		boolSimilarity = false;
		similarity = 0;
	}

	public void setInto(Field fr3) {
		into = fr3;		
	}

	public void setWhereCondition(Condition wc) {
		whereCondition = wc;
	}

	public boolean hasWhereCondition () {
		return (whereCondition != null);
	}

	public void setPathToInput(Field fr4) {
		pathToInput = fr4;
	}

	public boolean hasPathToInput () {
		return (pathToInput != null);
	}

	public void setMinSimilarity(String n) {
		boolSimilarity = true;
		similarity = Double.parseDouble(n);		
	}

	public boolean hasSimilarity () {
		return boolSimilarity;
	}

	public String toString () {
		String str = " MATCHING " + matching + " WRT " + wrt;
		str += " THRESHOLD (" + unit + ") " + value + " ";
		if (hasWhereCondition())
			str += "WHERE " + whereCondition.toString();
		str += " INTO " + into;
		if (hasPathToInput ())
			str += " ADDING " + pathToInput.toString() + " TO INPUT";
		if (boolSimilarity)
			str += " MIN SIMILARITY " + value;
		return str;
	}

	public String toMultilineString(int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "MATCHING " + matching + " WRT " + wrt;
		str += tabs + " TRESHOLD (" + unit + ") " + value ;
		if (hasWhereCondition())
			str += tabs + "WHERE " + whereCondition.toMultilineString(level+1);
		str += tabs + "INTO " + into;
		if (hasPathToInput ())
			str += tabs + " ADDING " + pathToInput.toString() + " TO INPUT";
		if (boolSimilarity)
			str += tabs + "MIN SIMILARITY " + value;
		return str;
	}

}
