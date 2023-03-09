package jco.ql.parser.model.fuzzy;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.Token;

import jco.ql.parser.model.predicate.Expression;

/**
 * 
 * @author Balicco
 *
 **/

public class FuzzyOperatorDefinition {

	public String type;
	public List<String> degrees;
	public List<Expression> expr;
	
	public FuzzyOperatorDefinition() {
		type = "null";
		degrees = new ArrayList<String>();
		expr = new ArrayList<Expression>();
	}
	
	public void addDegree(Token t1, Expression e) {
		degrees.add(t1.getText());
		expr.add(e);
	}
	
	
	public String toString() {
		String str ="OPERATOR ";
		str += type.toUpperCase() + " ";
		for (int i=0; i<degrees.size();i++) 
			str +="EVALUATE " + degrees.get(i) + " AS " + expr.get(i).toString().replace("@", ".") + " ";
		return str;
	}
	
	public String toMultilineString() {
		String str ="\tOPERATOR ";
		str += type.toUpperCase() + "\n";
		for (int i=0; i<degrees.size();i++) 
			str +="\t\tEVALUATE " + degrees.get(i) + " AS " + expr.get(i).toString().replace("@", ".") + "\n";//TODO
		return str;
	}
	
	
	
}
