package jco.ql.parser.model.condition;

import java.util.List;
import java.util.StringJoiner;
import java.util.ArrayList;

/**
 * 
 * @author Zunstraal
 *
 */
public class ConditionOr extends Condition {
	public List<Condition> subConditions;

	public ConditionOr (Condition condition) {
		super();
		subConditions = new ArrayList<Condition>();
		subConditions.add(condition);
		type = OR_CONDITION;
	}

	
	public List<Condition> getSubConditions () {
		return subConditions;
	}

	
	public void addCondition (Condition condition) {
		subConditions.add(condition);
	}

	
	public String toString () {
		if (subConditions == null)
			return "";
		
		String st = " " + subConditions.get(0).toString();
		for (int i=1; i< subConditions.size(); i++)
			st += " OR " + subConditions.get(i).toString();
		st += " ";

		return st;
	}
	public String toMultilineString (int level) {
		if (subConditions == null)
			return "";

		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		StringJoiner sj = new StringJoiner (tabs + "OR\t");
		for (Condition c : subConditions)
			sj.add(c.toMultilineString(level+1));
		return sj.toString()+" ";	
	}
}
