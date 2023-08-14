package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

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
	public static final int ARRAY					= 9; 	
	public static final int ARRAY_REF				= 10; 	//Fuzzy aggregation

	public int type;
	public String idName;
	public Condition subCondition;
	public Expression subExpression;
	public Field field;
	public Value value;
	public List<ExpressionFactor> array;	// PF 2023.08.08
	public ArrayReference reference; 		//	new
	public ExpressionFactor exp;			//	new	

	
	public ExpressionFactor () {
		type = UNDEFINED;
		idName = null;
		subCondition = null;
		subExpression = null;
		field = null;
		value = null;
		array = new ArrayList<ExpressionFactor> ();
		reference = null; 	// new
		exp = null;
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
	
	public ExpressionFactor(ExpressionFactor f) {
		this ();
		type = ARRAY;
		array.add(f);
	}
	public void addArrayValue(ExpressionFactor f) {
		array.add(f);
	}


	public void addExp(ExpressionFactor e) {
		exp = e;
	}

	public int getType () {
		return type;
	}
	
	public boolean hasExponent ( ) {
		return exp != null;
	}


	public String toString () {
		String str="";

		if (type == UNDEFINED)
			str = "*UNDEFINED FACTOR*";
		else if (type == SUB_CONDITION)
			str = "(" + subCondition.toString() + ")";
		else if (type == SUB_EXPRESSION)
			str = "(" + subExpression.toString() + ")";
		else if (type == VALUE)
			str = value.toString();
		else if (type == FIELDNAME)
			str = field.toString();
		else if (type == ID)
			str = idName;
		else if (type == ARRAY_REF)
			str = reference.toString();
		else if (type == ARRAY) {
			StringJoiner jf = new StringJoiner(", ", "[", "]");
			for (ExpressionFactor ef: array)
				jf.add(ef.toString());
			str = jf.toString();
		}

		if (hasExponent())
			str += "^" + exp.toString();

		return str;
	}

	
}
