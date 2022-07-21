package jco.ql.parser.model.condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class ConditionNot extends Condition {
	public Condition subCondition;

	public ConditionNot (Condition p) {
		super();
		subCondition = p;
		type = NOT_CONDITION;
	}
	
	
	public Condition getSubCondition () {
		return subCondition;
	}
	
	
	public String toString () {
		return "NOT " + subCondition.toString () + " ";
	}
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String st = tabs + "NOT " + subCondition.toMultilineString (level+1).trim() + " ";
		return st;
	}
}
