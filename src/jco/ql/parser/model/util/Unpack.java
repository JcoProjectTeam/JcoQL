package jco.ql.parser.model.util;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class Unpack {

	public Condition unpackCondition;
	public Field array;
	public Field to;

	public Unpack (Condition uc, Field fr1, Field fr2) {
		unpackCondition = uc;
		array = fr1;
		to = fr2;
	}

	public Condition getCondition () {
		return unpackCondition;
	}

	public Field getArryField () {
		return array;
	}

	public Field getToField() {
		return to;
	}

	public String toString () {
		String str = 	"UNPACK " + unpackCondition.toString() + 
									" ARRAY " + array.toString() + 
									" TO " + to.toString();
		return str;
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		
		String str = tabs + "UNPACK";
		str += unpackCondition.toMultilineString(level+2);
		str += tabs + "\tARRAY " + array.toString();
		str += tabs + "\tTO " + to.toString();
		return str;
	}
	
}
