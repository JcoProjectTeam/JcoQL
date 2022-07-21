package jco.ql.parser.model.util;

import java.util.*;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class Partition {
	public Condition whereCondition;
	public List<Field> by;
	public Field into;
	public List<SortField> sortedBy;
	public GenerateSection generateSection;
	public boolean dropGroupingFields;
	public boolean keepUncomparable;
	
	public Partition (Condition wc) {
		whereCondition = wc;
		by = new ArrayList<Field>();
		into = null;
		sortedBy = new ArrayList<SortField>();
		generateSection = null;
		dropGroupingFields = false;
		keepUncomparable = false;
	}

	public void addByField(Field fr) {
		by.add(fr);
	}

	public void setInto(Field fr) {
		into = fr;		
	}


	public void setGenerateSection(GenerateSection gs) {
		generateSection = gs;
	}

	public boolean hasGenerateSection () {
		return (generateSection != null);
	}

	public void setDropGroupingFields () {
		dropGroupingFields = true;
	}

	public boolean hasDropGroupingFields () {
		return dropGroupingFields;
	}

	public void addSortingField(SortField sf) {
		sortedBy.add(sf);
	}

	public boolean hasSortedBy () {
		return (sortedBy.size() > 0);
	}

	public void setKeepUncomparable() {
		keepUncomparable = true;
	}
	public boolean hasKeepUncomparable() {
		return keepUncomparable;
	}



	public String toString () {
		String str = "PARTITION";
		str += " " + whereCondition.toString();
		str += " BY ";
		if (by.size()>0)
			str += by.get(0).toString();
		else 
			str += "ERROR : BY LIST EMPTY";
		for (int i=1; i<by.size(); i++)
			str += ", " + by.get(i).toString();
		str += " INTO " + into.toString();
		if (dropGroupingFields)
			str += " DROP GROUPING FIELDS";
		if (hasSortedBy()) {
			str += " SORTED BY " + sortedBy.get(0).toString();
			for (int i=1; i<sortedBy.size(); i++)
				str += ", " + sortedBy.get(i).toString();
			if (hasKeepUncomparable())
				str += " KEEP UNCOMPARABLE";
		}
		if (hasGenerateSection())
			str += " " + generateSection.toString();			
		return str;
	}
	
	public String toMultilineString (int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "PARTITION ";
		str += whereCondition.toString();
		tabs += "\t";
		str += tabs + "BY ";
		if (by.size()>0)
			str += by.get(0).toString();
		else 
			str += "ERROR : BY LIST EMPTY";
		for (int i=1; i<by.size(); i++)
			str += ", " + by.get(i).toString();
		str += tabs + "INTO " + into.toString();
		if (dropGroupingFields)
			str += tabs + "DROP GROUPING FIELDS";
		if (hasSortedBy()) {
			str += tabs + "SORTED BY " + sortedBy.get(0).toString();
			for (int i=1; i<sortedBy.size(); i++)
				str += ", " + sortedBy.get(i).toString();
			if (hasKeepUncomparable())
				str += tabs + "\tKEEP UNCOMPARABLE";
		}

		if (hasGenerateSection())
			str += " " + generateSection.toMultilineString(level+1);			
		return str;
	}

}
