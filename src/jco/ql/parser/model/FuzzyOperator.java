package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.fuzzy.FuzzyRange;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;


/**
 * 
 * @author Zunstraal
 *
 */
public class FuzzyOperator extends Instruction {
	public String fuzzyOperator;
	public List<Parameter> parameters;
	public Condition preCondition;
	public Expression evaluate;
	public FuzzyRange range;
	public List<FuzzyPoint> polyline;
	

	public FuzzyOperator (int seq, String fo)  {
		id = FUZZY_OPERATOR_INSTRUCTION;
		instructionName = "Create Fuzzy Operator";
		sequence = seq;		
		fuzzyOperator = fo;
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		evaluate = null;
		range = null;
		polyline = new ArrayList<FuzzyPoint>();
	}

	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
	}

	
	public boolean hasPrecondition () {
		return (preCondition != null);
	}
	

	public String toString () {
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyOperator + " ";
		str += "PARAMETERS ";
		for (int i=0; i<parameters.size()-1;i++)
			str += parameters.get(i).toString() + ", ";
		if (parameters.size() > 0)
			str += parameters.get(parameters.size()-1).toString() + " ";
		if (hasPrecondition())
			str +="PRECONDITION " + preCondition.toString() + " ";
		str +="EVALUATE " + evaluate.toString() + " ";
		str +="POLYLINE ";
		// by construction polyline contains at least one element
		str +="[ " + polyline.get(0).toString();				
		for (int i=1; i<polyline.size();i++)
			str += ", " + polyline.get(i).toString();
		str += " ]";
		
		return cleanString(str).trim() + ";";
	}

	public String toMultilineString () {
		String str = instructionName.toUpperCase() +" ";
		str += fuzzyOperator + "\n\t";
		str += "PARAMETERS\n";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\t\t" + parameters.get(i).toString() + ",\n";
		if (parameters.size() > 0)
			str += "\t\t" + parameters.get(parameters.size()-1).toString() + "\n";
		if (hasPrecondition())
			str +="\tPRECONDITION " + preCondition.toString() + "\n";
		str +="\tEVALUATE " + evaluate.toString() + "\n";
		str +="\tPOLYLINE\n";
		// by construction polyline contains at least one element
		str +="\t\t[\t" + polyline.get(0).toString();				
		for (int i=1; i<polyline.size();i++)
			str += ",\n\t\t\t" + polyline.get(i).toString();
		str += "\t]";
		str = cleanString(str);
		
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

