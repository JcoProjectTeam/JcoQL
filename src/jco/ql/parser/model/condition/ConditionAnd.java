package jco.ql.parser.model.condition;

import java.util.List;
import java.util.StringJoiner;
import java.util.ArrayList;

/**
 * 
 * @author Zunstraal
 *
 */
public class  ConditionAnd extends  Condition {
	public List< Condition> subConditions;

	public  ConditionAnd (Condition condition) {
		super();
		subConditions = new ArrayList< Condition>();
		subConditions.add(condition);
		type = AND_CONDITION;
	}


	public void addCondition (Condition condition) {
		subConditions.add(condition);
	}


	public List< Condition> getSubConditions () {
		return subConditions;
	}

	
	public String toString () {
		if (subConditions == null)
			return null; 
		String st = " " + subConditions.get(0).toString();
		for (int i=1; i< subConditions.size(); i++)
			st += " AND " + subConditions.get(i).toString();
		st += " ";

		return st;
	}


	public String toMultilineString (int level) {
		if (subConditions == null)
			return null;

		String tabs = "";
		for (int i=0; i<level; i++)
			tabs += "\t";

		StringJoiner sj = new StringJoiner ("\n" + tabs + "AND\t");
		for (Condition c : subConditions)
			sj.add(c.toMultilineString(level+1));
		return sj.toString()+" ";
	}
}
