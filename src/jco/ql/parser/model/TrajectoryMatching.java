package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.util.DbCollection;
import jco.ql.parser.model.util.TrajectoryPartition;

/**
 * 
 * @author Zunstraal
 *
 */
public class TrajectoryMatching extends Instruction {
	public static int UNDEFINED = -1; 
	public static final int OTHERS_DEFAULT = 0;	
	public static final int OTHERS_KEEP = 1;	
	public static final int OTHERS_DROP = 2;

	public DbCollection collection1;
	public DbCollection collection2;
	public List<TrajectoryPartition> partitions;	
	public int othersType;	
	String otherStr;

	public TrajectoryMatching(int seq, DbCollection coll1, DbCollection coll2) {
		id = TRAJECTORY_MATCHING_INSTRUCTION;
		instructionName = "Trajectory Matching";
		sequence = seq;		
		collection1 = coll1;
		collection2 = coll2;
		partitions = new ArrayList<TrajectoryPartition>();
		othersType = OTHERS_DEFAULT;
		otherStr = null;
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

	public void addPartition(TrajectoryPartition tp) {
		partitions.add(tp);	
	}

	public String toString () {
		String str = instructionName.toUpperCase();
		str += " " + collection1.toString () + ", " + collection2.toString ();
		for (int i=0; i<partitions.size(); i++) 
			str += " " + partitions.get(i).toString();

		if (othersType != OTHERS_DEFAULT)
			str += " " + otherStr + " OTHERS";

		return str.trim() + ";";
	}

	
	public String toMultilineString () {
		String str = instructionName.toUpperCase();
		str += " " + collection1.toString () + ", " + collection2.toString ();
		for (int i=0; i<partitions.size(); i++)
			str += partitions.get(i).toMultilineString(1);

		if (othersType != OTHERS_DEFAULT)
			str += "\n\t" + otherStr + " OTHERS";

		return str.trim() + ";\n";
	}

}
