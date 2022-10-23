package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Zunstraal
 *
 */
public class ObjectStructure {
	public List<OutputFieldSpec> outputList;
	
	public ObjectStructure () {
		outputList = new ArrayList<OutputFieldSpec>();
	}

	
	public ObjectStructure (OutputFieldSpec ofs) {
		outputList = new ArrayList<OutputFieldSpec>();
		addOutputFieldSpec (ofs);
	}

	
	public boolean addOutputFieldSpec (OutputFieldSpec ofs) {
		outputList.add (ofs);
		
		return true;
	}

	
	public String toString() {
		String str = "{ " ;
		if (outputList.size() > 0)
			str += outputList.get(0).toString();
		else
			str += "*** ERROR: Empty Object Structure ***";
		for (int i=1; i<outputList.size();i++)
			str += ", " + outputList.get(i).toString();
		str += " }";
		return str;
	}


	public String toMultilineString(int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = "\t{" ;
		tabs += "\t";
		if (outputList.size() > 0) {
			for (int i=0; i<outputList.size();i++)
				str += tabs + outputList.get(i).toString() + ", ";
			str += "xxx";
			str = str.replace(", xxx", "");
		}
		else
			str += "*** ERROR: Empty Object Structure ***";
		str += "\t}";
		return str;
	}
}
