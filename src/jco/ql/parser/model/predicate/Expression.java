package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Zunstraal
 *
 */
public class Expression extends Predicate {
	public static final String ADD = "+";
	public static final String SUB = "-";
	public static final String MUL = "*";
	public static final String DIV = "/";

	public List<ExpressionTerm> terms;
	public List<String> operators;
	
	public Expression () {
		type = EXPRESSION_PREDICATE;
		terms = new ArrayList<ExpressionTerm>();
		operators = new ArrayList<String>();
	}
	

	public ExpressionTerm getTerm (int ndx) {
		return terms.get(ndx);
	}

	
	public String getOperator (int ndx) {
		return operators.get(ndx);
	}

	
	public int getNTerms () {
		return terms.size();
	}
	

	public void addTerm (ExpressionTerm expr) {
		addTerm (expr, null);
	}
	public void addTerm (ExpressionTerm expr, String operator) {
		terms.add(expr);
		if (expr == null) 
			System.out.println("ERROR! This should never happen in addTerm!");
		
		// for the first term
		if (operator == null)
			operators.add("");
		else
			operators.add(operator);
	}

	public String toString () {
		if (terms == null) 
			return "";
		if (terms.size() == 0)
			return "";

		String st = operators.get(0) + terms.get(0).toString();
		for (int i=1; i< terms.size(); i++)
			st += operators.get(i) + terms.get(i).toString();

		return st;
	}
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + toString ();
		return str;
	}
}
