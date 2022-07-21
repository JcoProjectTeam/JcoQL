package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class TrajectoryPartition {
	public Condition selectionCondition;
	public List<PartitionMatching> matchings;

	public TrajectoryPartition(Condition c) {
		selectionCondition = c;
		matchings = new ArrayList<PartitionMatching>();
	}

	public void addPartitionMatching(PartitionMatching tpm) {
		matchings.add(tpm);		
	}

	public String toString () {
		String str = " PARTITION ";
		str += selectionCondition.toString() + " ";
		for (int i=0; i<matchings.size(); i++)
			str += matchings.get(i).toString();
		return str;
	}

	public String toMultilineString(int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "PARTITION";
		tabs += "\t";
		str += selectionCondition.toMultilineString(level+1);
		for (int i=0; i<matchings.size(); i++)
			str += matchings.get(i).toMultilineString(level+1);
		return str;
	}

}
