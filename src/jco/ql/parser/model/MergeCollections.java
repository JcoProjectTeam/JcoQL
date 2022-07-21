package jco.ql.parser.model;

import java.util.List;

import jco.ql.parser.model.util.*;

import java.util.ArrayList;

/**
 * 
 * @author Zunstraal
 *
 */
public class MergeCollections extends Instruction {
	public List <DbCollection> collectionList;
	public boolean removeDuplicates;

	public MergeCollections  (int seq, DbCollection collection) {
		id = MERGE_INSTRUCTION;
		instructionName = "Merge Collections";
		sequence = seq;
		removeDuplicates = false;
		collectionList = new ArrayList<DbCollection> ();
		addCollection (collection);
	}

	public void addCollection (DbCollection collection) {
		collectionList.add(collection);
	}

	public boolean isRemoveDuplicates () {
		return removeDuplicates;
	}
	
	public void setRemoveDuplicates() {
		removeDuplicates = true;
	}
	
	public String toString () {
		String st = instructionName.toUpperCase() + " " + collectionList.get(0).toString();
		for (int i=1; i<collectionList.size(); i++)
			st += ", " + collectionList.get(i).toString();
		if (removeDuplicates)
			st += " REMOVE DUPLICATES";
		
		return st.trim()+ ";";
	}
	
	public String toMultilineString () {
		String st = instructionName.toUpperCase() + " " + collectionList.get(0).toString();
		for (int i=1; i<collectionList.size(); i++)
			st += ",\n\t" + collectionList.get(i).toString();
		if (removeDuplicates)
			st += "\n\tREMOVE DUPLICATES";
		
		return st.trim() + ";\n";
	}

}
