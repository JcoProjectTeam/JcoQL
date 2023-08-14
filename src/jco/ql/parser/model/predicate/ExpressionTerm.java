package jco.ql.parser.model.predicate;

import java.util.List;
import java.util.ArrayList;


/**
 * 
 * @author Zunstraal
 *
 */
public class ExpressionTerm {
	public List<ExpressionFactor> factors;
	public List<String> operators;
	
	public ExpressionTerm () {
		factors = new ArrayList<ExpressionFactor>();
		operators = new ArrayList<String>();
	}	
	public ExpressionTerm (ExpressionFactor f) {
		this();
		addFactor(f);
	}
	
	public ExpressionFactor getFactor (int ndx) {
		return factors.get(ndx);
	}

	
	public String getOperator (int ndx) {
		return operators.get(ndx);
	}

	
	public int getNFactors() {
		return factors.size();
	}
	

	public void addFactor (ExpressionFactor expr) {
		addFactor (expr, null);
	}
	public void addFactor (ExpressionFactor expr, String operator) {
		if (expr != null) {
			factors.add(expr);
			// for the first factor
			if (operator == null)
				operators.add("");
			else
				operators.add(operator);
		}
	}

	public String toString () {
		if (factors == null) 
			return "";
		if (factors.size() == 0)
			return "";

		String st = operators.get(0) + factors.get(0).toString();
		for (int i=1; i< factors.size(); i++)
			st += operators.get(i) + factors.get(i).toString();

		return st;
	}

}
