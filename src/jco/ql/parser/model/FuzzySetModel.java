package jco.ql.parser.model;
import java.util.ArrayList;
import java.util.List;


import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.fuzzy.FuzzyOperatorDefinition;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;

/**
* 
* @author Balicco
* 
**/

public class FuzzySetModel extends Instruction  {
	public String fuzzySetModel;
	public List<Parameter> degrees;
	public List<String> derivedDegrees;
	public List<Expression> derivedExpr;
	public Condition constraint;
	public FuzzyOperatorDefinition defOr;
	public FuzzyOperatorDefinition defAnd;
	public FuzzyOperatorDefinition defNot;

	public FuzzySetModel (int seq, String fm)  {
		id = FUZZY_MODEL_INSTRUCTION;
		instructionName = "Create Fuzzy Set Model";
		sequence = seq;		
		fuzzySetModel = fm;
		degrees = new ArrayList<Parameter>();
		derivedDegrees = new ArrayList<String>();
		derivedExpr = new ArrayList<Expression>();
		constraint = null;
		defOr = null;
		defAnd = null;
		defNot = null;
	}
	
	
	public ParamList getDegreesList() {
		ParamList pl = new ParamList(degrees);
		return pl;
	}
	
	public ParamList getAllDegreesList() {
		ParamList pl = new ParamList( new ArrayList<Parameter>() );
		for (int i = 0; i < degrees.size(); i++) 
			pl.parameters.add( new Parameter(degrees.get(i).name, "DEGREE") );
		for (int i = 0; i < derivedDegrees.size(); i++) 
			pl.parameters.add( new Parameter(derivedDegrees.get(i), "DEGREE") );
		return pl;
	}
	
	

	public String toString () {
		String str = instructionName.toUpperCase() + " ";
		str += fuzzySetModel + " ";
		
		str += "DEGREES ";
		for (int i=0; i<degrees.size()-1;i++) 
			str += degrees.get(i).name + ", ";
		str += degrees.get(degrees.size()-1).name + " ";
		
		if (derivedDegrees.size() > 0)
			str += "DERIVED DEGREES ";
		for (int i=0; i<derivedDegrees.size()-1;i++) 
			str += derivedDegrees.get(i) + " AS " + derivedExpr.get(i) + ", ";
		if (derivedDegrees.size() > 0) {
			str += derivedDegrees.get(derivedDegrees.size()-1).toString() + " AS ";
			str += derivedExpr.get(derivedDegrees.size()-1).toString() + " ";	
		}
		
		if (constraint != null)
			str +="CONSTRAINT " + constraint.toString() + " ";
		str = cleanString(str);
		
		if(defNot != null)
			str += defNot;
		if(defAnd != null)
			str += defAnd;
		if(defOr != null)
			str += defOr;
			
		//return cleanString(str).trim() + ";";
		return str.trim() + ";";
	}
	
	
	
	public String toMultilineString () {
		String str = instructionName.toUpperCase() +" ";
		str += fuzzySetModel + "\n";
		
		str += "\tDEGREES\n";
		for (int i=0; i<degrees.size()-1;i++)
			str += "\t\t" + degrees.get(i).name + ",\n";
		if (degrees.size() > 0)
			str += "\t\t" + degrees.get(degrees.size()-1).name + "\n";
		
		if (derivedDegrees.size() > 0)
			str += "\tDERIVED DEGREES\n";
		for (int i=0; i<derivedDegrees.size()-1;i++) 
			str += "\t\t" + derivedDegrees.get(i).toString() + " AS " + derivedExpr.get(i).toString() + ",\n";
		if (derivedDegrees.size() > 0){
			str += "\t\t" + derivedDegrees.get(derivedDegrees.size()-1).toString() + " AS ";
			str += derivedExpr.get(derivedDegrees.size()-1).toString() + "\n";
		}
		if (constraint != null)
			str +="\tCONSTRAINT " + constraint.toString() + "\n";
		str = cleanString(str);
		
		if(defNot != null)
			str += defNot.toMultilineString();
		if(defAnd != null)
			str += defAnd.toMultilineString();
		if(defOr != null)
			str += defOr.toMultilineString();
		
		return str.trim() + ";\n";
	}

		
	private String cleanString (String str) {
		str = str.replace(".0", ";;;;0")
			.replace(".1", ";;;;1")
			.replace(".2", ";;;;2")
			.replace(".3", ";;;;3")
			.replace(".4", ";;;;4")
			.replace(".5", ";;;;5")
			.replace(".6", ";;;;6")
			.replace(".7", ";;;;7")
			.replace(".8", ";;;;8")
			.replace(".9", ";;;;9")
			.replace(".", "")
			.replace(";;;;", ".");				
		return str;
	}
	
}

