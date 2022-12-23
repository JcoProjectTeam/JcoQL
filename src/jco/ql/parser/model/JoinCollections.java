package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.fuzzy.SetFuzzySets;
import jco.ql.parser.model.util.*;

/**
 * 
 * @author Zunstraal
 *
 */
public class JoinCollections extends Instruction {
	public static int GEOMETRY_UNDEFINED	= -1;
	public static int GEOMETRY_DEFAULT		= 0;
	public static int GEOMETRY_ALL 			= 1;
	public static int GEOMETRY_RIGHT 		= 2;
	public static int GEOMETRY_LEFT 		= 3;
	public static int GEOMETRY_INTERSECTION = 4;
	
	public DbCollection collection1;
	public DbCollection collection2;
	public SpatialFunction on;
	public int setGeometry;
	String setGeometryStr;
	public CaseClause caseClause;
	public SetFuzzySets setFuzzySets;
	public List<AddField> addFields;
	public boolean removeDuplicates;
	
	
	public JoinCollections (int seq, DbCollection c1, DbCollection c2) {
		id = JOIN_INSTRUCTION;
		instructionName = "Join Of Collections";
		sequence = seq;		
		collection1 = c1;
		collection2 = c2;
		on = null;
		setGeometry = GEOMETRY_UNDEFINED;
		setGeometryStr = "";
		caseClause = null;
		setFuzzySets = null;
		addFields = new ArrayList<AddField>();
		removeDuplicates = false;
	}

	public void setSetGeometry (String g) {
		setGeometryStr = g;
		if (setGeometryStr.equalsIgnoreCase("ALL"))
			setGeometry = GEOMETRY_ALL;
		else if (setGeometryStr.equalsIgnoreCase("LEFT"))
			setGeometry = GEOMETRY_LEFT;
		else if (setGeometryStr.equalsIgnoreCase("RIGHT"))
			setGeometry = GEOMETRY_RIGHT;
		else if (setGeometryStr.equalsIgnoreCase("INTERSECTION"))
			setGeometry = GEOMETRY_INTERSECTION;
	}
	
	public boolean hasSetGeometry () {
		return setGeometry != UNDEFINED;
	}
	
	public void setCondition (SpatialFunction sf) {
		on = sf;
	} 

	public boolean hasOnCondition () {
		return on != null;
	}

	public void setCaseClause (CaseClause cc) {
		caseClause = cc;
	} 
	
	public boolean hasCaseClause () {
		return caseClause != null;
	}

	public void addAddField(AddField af) {
		addFields.add(af);
	}
	public boolean hasAddFields () {
		return (addFields.size() > 0);
	}
	
	public void setSetFuzzySets(SetFuzzySets sfs) {
		setFuzzySets = sfs;
	}
	public boolean hasSetFuzzySets() {
		return (setFuzzySets != null);
	}

	public void setRemoveDuplicates() {
		removeDuplicates = true;
	}
	public boolean isRemoveDuplicates () {
		return removeDuplicates;
	}
	

	public String toString () {
		String str = instructionName.toUpperCase();
		str += " " + collection1.toString() + ", " +  collection2.toString();
		if (hasOnCondition())
			str += " ON GEOMETRY " + on.toString();
		if (hasSetGeometry())
			str += " SET GEOMETRY " + setGeometryStr + " ";
		if (hasAddFields()) {
			str += " ADD FIELDS { " + addFields.get(0).toString ();
			for (int i=1; i<addFields.size(); i++)
				str += ", " + addFields.get(i).toString();			
			str += " }";
		}
		if (hasSetFuzzySets())
			str += " " + setFuzzySets.toString();
		if (hasCaseClause())
			str += " " + caseClause.toString();
		if (removeDuplicates)
			str += " REMOVE DUPLICATES";
		
		return str.trim() + ";";
	}

	public String toMultilineString () {
		String str = instructionName.toUpperCase();
		str += "\n\t\t" + collection1.toString() + ", " +  collection2.toString();
		if (hasOnCondition())
			str += "\n\tON GEOMETRY " + on.toString();
		if (hasSetGeometry())
			str += "\n\tSET GEOMETRY " + setGeometryStr;
		if (hasAddFields()) {
			str += "\n\tADD FIELDS {";
			str += "\n\t\t" + addFields.get(0).toString ();
			if (addFields.size() > 1)
				for (int i=1; i<addFields.size(); i++)
					str += ",\n\t\t" + addFields.get(i).toString();
			str += "\t}";	
		}
		if (hasSetFuzzySets())
			str += setFuzzySets.toMultilineString(1);
		if (hasCaseClause())
			str += caseClause.toMultilineString(1);
		if (removeDuplicates)
			str += "\n\tREMOVE DUPLICATES";

		return str.trim() + ";\n";
	}

}
