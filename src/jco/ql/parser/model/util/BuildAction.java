package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

/**
 * 
 * @author Zunstraal
 *
 */
public class BuildAction {
	public static final int UNDEFINED 		= -1;	
	public static final int BUILD_ACTION 	= 1;	
	public static final int ADD_ACTION 		= 2;	
	public static final int REMOVE_ACTION 	= 3;	

	public ObjectStructure objectStructure;
	public List<Field> fieldsToRemove;
	int type;
	
	public BuildAction () {
		objectStructure = null;
		fieldsToRemove = new ArrayList<Field>();
		type = UNDEFINED;
		
	}
	public void setBuildObjectStructure (ObjectStructure os) {
		objectStructure = os;
		type = BUILD_ACTION;
	}
	public void setAddObjectStructure (ObjectStructure os) {
		objectStructure = os;
		type = ADD_ACTION;
	}
	public void setRemoveField(Field fr) {
		fieldsToRemove.add(fr);
		type = REMOVE_ACTION;		
	}


	public int getType ()	{
		return type;
	}
	
	public boolean hasObjectStructure () {
		return (objectStructure != null);
	}


	public String toString () {
		String str = "";
		if (type == BUILD_ACTION) {
			str += "BUILD";
			if (hasObjectStructure())
				str += " " + objectStructure.toString();
		}
		else if (type == ADD_ACTION) {
			str += "ADD FIELDS";
			if (hasObjectStructure())
				str += " " + objectStructure.toString();
		}
		else {
			StringJoiner sj = new StringJoiner(", ", "REMOVE FIELDS {", "}");
			for (Field f : fieldsToRemove)
				sj.add(f.toString());
			str += sj.toString();
		}
		return str;
	}

	public String toMultilineString (int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs;		
		if (type == BUILD_ACTION) {
			str += "BUILD";
			if (hasObjectStructure())
				str += objectStructure.toMultilineString(level);
		}
		else if (type == ADD_ACTION) {
			str += "ADD FIELDS";
			if (hasObjectStructure())
				str += objectStructure.toMultilineString(level);
		}
		else {
			StringJoiner sj = new StringJoiner(", ", "REMOVE FIELDS {", "}");
			for (Field f : fieldsToRemove)
				sj.add(f.toString());
			str += sj.toString();
		}
		
		return str;
	}
}
