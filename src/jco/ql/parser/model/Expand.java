package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.util.Unpack;

/**
 * 
 * @author Zunstraal
 *
 */
public class Expand extends Instruction {
	public static final int UNDEFINED = -1; 
	public static final int OTHERS_DEFAULT = 0;	
	public static final int OTHERS_KEEP = 1;	
	public static final int OTHERS_DROP = 2;
	

	public List<Unpack> unpacks;	
	public int othersType;
	String otherStr;

	public Expand (int seq) {
		id = EXPAND_INSTRUCTION;
		instructionName = "Expand";
		sequence = seq;		
		unpacks = new ArrayList<Unpack>();
		othersType = OTHERS_DEFAULT;
		otherStr = null;
	}
	
	public void addUnpack (Unpack u) {
		unpacks.add(u);
	}

	public void setOthers(String oth) {
		otherStr = oth;
		if (otherStr.equalsIgnoreCase("KEEP")) 
			othersType = OTHERS_KEEP;
		else 
			othersType = OTHERS_DROP;		
	}

	public boolean isKeepOthers () {
		return (othersType == OTHERS_KEEP);
	}

	
	public String toString () {
		String str = instructionName.toUpperCase();
		for (int i=0; i<unpacks.size(); i++) 
			str += " " + unpacks.get(i).toString();

		if (othersType != OTHERS_DEFAULT)
			str += " " + otherStr + " OTHERS";

		return str.trim() + ";";
	}

	
	public String toMultilineString () {
		String str = instructionName.toUpperCase();
		for (int i=0; i<unpacks.size(); i++)
			str += unpacks.get(i).toMultilineString(1);

		if (othersType != OTHERS_DEFAULT)
			str += "\n\t" + otherStr + " OTHERS";

		return str.trim() + ";\n";
	}

}
