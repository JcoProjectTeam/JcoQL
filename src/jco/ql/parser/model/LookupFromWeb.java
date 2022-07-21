package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.util.ForEach;

/**
 * 
 * @author Zunstraal
 *
 */
public class LookupFromWeb extends Instruction {
	public List<ForEach> forEachList;
	
	public LookupFromWeb (int seq) {
		id = LOOKUP_FROM_WEB;
		instructionName = "LookUp From Web";
		sequence = seq;	
		forEachList = new ArrayList<ForEach>();
	}

	
	public void addForEach(ForEach fe) {
		forEachList.add(fe);
	}
	
	
	public List<ForEach> getForEachList () {
		return forEachList;
	}

	
	public int getForEachListSize () {
		return forEachList.size();
	}

	
	public String toString() {
		String str = instructionName.toUpperCase() + " ";
		StringJoiner sj = new StringJoiner(" ", str, ";");
		for (ForEach fe : forEachList)
			sj.add(fe.toString());
		return sj.toString();
	}

	
	public String toMultilineString() {
		String str = instructionName.toUpperCase() + "\n\t";
		StringJoiner sj = new StringJoiner("\n\t", str, ";\n");
		for (ForEach fe : forEachList)
			sj.add(fe.toMultilineString(1));
		return sj.toString();
	}


}
