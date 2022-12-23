package jco.ql.parser.model.predicate;

import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.util.Field;
import jco.ql.parser.model.util.Value;

/**
 * 
 * @author Zunstraal
 *
 */
public class ExpressionFactor {
	public static final int UNDEFINED 				= -1;
	public static final int SUB_CONDITION 			= 1;
	public static final int SUB_EXPRESSION 			= 2;
	public static final int VALUE 					= 3;
	public static final int ID 						= 4;
	public static final int FIELDNAME 				= 5;
	public static final int FUNCTION 				= 6;
	public static final int SPECIAL_FUNCTION 		= 7;
	public static final int ARRAY_REF				= 8; //Fuzzy aggregation

	public int type;
	public String idName;
	public Condition subCondition;
	public Expression subExpression;
	public Field field;
	public Value value;
	public ArrayReference reference; //new

	
	public ExpressionFactor () {
		type = UNDEFINED;
		idName = null;
		subCondition = null;
		subExpression = null;
		field = null;
		value = null;
		reference = null; // new
	}

	public ExpressionFactor (Condition p) {
		this ();
		type = SUB_CONDITION;
		subCondition = p;
	}

	public ExpressionFactor (Expression e) {
		this ();
		type = SUB_EXPRESSION;
		subExpression = e;
	}

	public ExpressionFactor (Value v) {
		this ();
		type = VALUE;
		value = v;
	}

	public ExpressionFactor (Field f) {
		this ();
		type = FIELDNAME;
		field = f;
	}

	
	public ExpressionFactor (String name) {
		this ();
		type = ID;
		idName = name;
	}
	
	public ExpressionFactor (ArrayReference ref) {
		this ();
		type = ARRAY_REF;
		reference = ref;
	}
	
	public int getType () {
		return type;
	}


	public String toString () {
		if (type == UNDEFINED)
			return "*UNDEFINED FACTOR*";
					
		if (type == SUB_CONDITION)
			return "(" + subCondition.toString() + ")";
					
		if (type == SUB_EXPRESSION)
			return "(" + subExpression.toString() + ")";

		if (type == VALUE)
			return value.toString();

		if (type == FIELDNAME)
			return field.toString();
		
		if (type == ID)
			return idName;
		
		if (type == ARRAY_REF)
			return reference.toString();

		return "XXXXXX";
	}

	
}
