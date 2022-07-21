package jco.ql.parser.model;

import java.util.*;

import jco.ql.parser.model.util.Partition;

/**
 * 
 * @author Zunstraal
 *
 */
public class Group extends Instruction {
	public static final int UNDEFINED = -1; 
	public static final int OTHERS_DEFAULT = 0;	
	public static final int OTHERS_KEEP = 1;	
	public static final int OTHERS_DROP = 2;	
	
	public List<Partition> partitions;	
	public int othersType;
	String otherStr;
	
	
	public Group(int seq) {
		id = GROUP_INSTRUCTION;
		instructionName = "Group";
		sequence = seq;		
		partitions = new ArrayList<Partition>();
		othersType = OTHERS_DEFAULT;
		otherStr = null;	
	}

	
	public void addPartition(Partition p) {
		partitions.add(p);
	}

	
	public void setOthers(String oth) {
		otherStr = oth;

 		if (otherStr.equalsIgnoreCase("KEEP")) 
			othersType = OTHERS_KEEP;
		else 
			othersType = OTHERS_DROP;		
	}
	public boolean isKeepOthers ( ) {
		return (othersType == OTHERS_KEEP);
	}

	
	public String toString () {
		String str = instructionName.toUpperCase();
		for (int i=0; i<partitions.size(); i++) 
			str += " " + partitions.get(i).toString();

		if (othersType != OTHERS_DEFAULT)
			str += " " + otherStr + " OTHERS";

		return str.trim() + ";";
	}

	
	public String toMultilineString () {
		String str = instructionName.toUpperCase();
		for (int i=0; i<partitions.size(); i++)
			str += partitions.get(i).toMultilineString(1);

		if (othersType != OTHERS_DEFAULT)
			str += "\n\t" + otherStr + " OTHERS";

		return str.trim() + ";\n";
	}
	
}
