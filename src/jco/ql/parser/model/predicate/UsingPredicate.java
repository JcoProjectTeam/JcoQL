package jco.ql.parser.model.predicate;

import java.util.ArrayList;

import jco.ql.parser.model.condition.Condition;

/**
 * 
 * @author Zunstraal
 *
 */
public class UsingPredicate extends Predicate {
	public static final int USING_SUB_CONDITION = 1;
	public static final int USING_FUZZY_SET 	= 2;
	public static final int USING_FUNCTION		= 3;
	public static final int USING_IF_FAILS		= 4;

	public int usingType;
	public Condition subUsingCondition;
	public String defaultValue;
	public String fuzzySet;
	public String fuzzyFunction;
	public ArrayList<Expression> fuzzyFunctionParameters;

	public UsingPredicate () {
		type = USING_PREDICATE;
		usingType = UNDEFINED;		
		defaultValue = null;
		subUsingCondition = null;
		fuzzySet = null;
		fuzzyFunction = null;
		fuzzyFunctionParameters = null;
	}

	
	public UsingPredicate(Condition c) {
		this ();
		usingType = USING_SUB_CONDITION;
		subUsingCondition = c;		
	}


	public UsingPredicate(String fName, ArrayList<Expression> parameters) {
		this();
		if (parameters == null) {
			usingType = USING_FUZZY_SET;
			fuzzySet = fName;
		}
		else {
			usingType = USING_FUNCTION;			
			fuzzyFunction = fName;
			fuzzyFunctionParameters = parameters;
		}
	}


	public UsingPredicate(Condition c, String n) {
		this();
		usingType = USING_IF_FAILS;
		subUsingCondition = c;
		defaultValue = n;
	}
	public double getDefaultValue () {
		if (defaultValue != null)
			return Double.parseDouble(defaultValue);
		return 0.0;
	}


	public int getUsingType ( ) {
		return usingType;
	}
	
	
	public String toString () {
		String str = "";
		if (usingType == USING_SUB_CONDITION)
			str = subUsingCondition.toString();
		else if (usingType == USING_IF_FAILS)
			str = "IF_FAILS (" + subUsingCondition.toString() + ", " + defaultValue + ")";
		else if (usingType == USING_FUZZY_SET)
			str = fuzzySet;
		else if (usingType == USING_FUNCTION) {
			str = fuzzyFunction + "(";
			for (Expression e : fuzzyFunctionParameters)
				str += e.toString() + ", ";
			str += "###)";
			str = str.replace(", ###)", ")");
		}
		return str;
	}

	
	public String toMultiLineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs;
		if (usingType == USING_SUB_CONDITION)
			str = tabs + subUsingCondition.toString();
		else if (usingType == USING_IF_FAILS)
			str = tabs + "IF_FAILS (" + subUsingCondition.toString() + ", " + defaultValue + ")";
		else if (usingType == USING_FUZZY_SET)
			str = tabs + fuzzySet;
		else if (usingType == USING_FUNCTION) {
			str = tabs + fuzzyFunction + "(";
			for (Expression e : fuzzyFunctionParameters)
				str += e.toString() + ", ";
			str += "###)";
			str = str.replace(", ###)", ")");
		}
		return str;
	}
}
