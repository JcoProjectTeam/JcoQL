package jco.ql.parser.model;


import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.fuzzy.FuzzyPolyline;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;

/**
 * 
 * @author Balicco
 *
 **/

public class GenericFuzzyOperator extends Instruction {
	public String genericFuzzyOperator;
	public List<Parameter> parameters;
	public Condition precondition;
	public List<Expression> evaluate;
	public List<FuzzyPolyline> polylines;
	public String fuzzyTypeName ;
	public List<Parameter> degrees;
	

	public GenericFuzzyOperator (int seq, String fgo, String ft)  {
		id = FUZZY_GENERAL_OPERATOR_INSTRUCTION;
		instructionName = "Create generic Fuzzy Operator";
		sequence = seq;		
		genericFuzzyOperator = fgo;
		parameters = new ArrayList<Parameter>();
		precondition = null;
		evaluate = new ArrayList<Expression>();
		polylines = new ArrayList<FuzzyPolyline>();
		fuzzyTypeName = ft;
		degrees = new ArrayList<Parameter>();
	}

	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
	}
	
	
	public boolean hasPrecondition () {
		return (precondition != null);
	}
	
	
	public ParamList getDegreesList () {
		ParamList pl = new ParamList(degrees);
		return pl;
	}


	public String toString () {
		String str = "CREATE ";
		str += fuzzyTypeName + " ";
		str += "FUZZY OPERATOR ";
		str += genericFuzzyOperator + " ";
		str += "PARAMETERS ";
		for (int i=0; i<parameters.size()-1;i++)
			str += parameters.get(i).toString() + ", ";
		if (parameters.size() > 0)
			str += parameters.get(parameters.size()-1).toString() + " ";
		if (hasPrecondition())
			str +="PRECONDITION " + precondition.toString() + " ";
		for (int i=0; i<degrees.size(); i++) {
			str +="EVALUATE " + degrees.get(i).name + " ";
			str +="AS " 	  + evaluate.get(i).toString() + " ";
			FuzzyPolyline fp = polylines.get(i);
			fp.toString();
		}
		return cleanString(str).trim() + ";";
	}

	public String toMultilineString () {

		String str = "CREATE ";
		str += fuzzyTypeName + " ";
		str += "FUZZY OPERATOR ";
		str += genericFuzzyOperator + "\n\t";
		str += "PARAMETERS\n";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\t\t" + parameters.get(i).toString() + ",\n";
		if (parameters.size() > 0)
			str += "\t\t" + parameters.get(parameters.size()-1).toString() + "\n";
		if (hasPrecondition())
			str +="\tPRECONDITION " + precondition.toString() ;
		for (int i=0; i<degrees.size(); i++) {
			str +="\n\tEVALUATE " + degrees.get(i).name + " ";
			str +="AS " 	  	+ evaluate.get(i).toString();
			FuzzyPolyline fp = polylines.get(i);
			str += fp.toMultilineString();
		}
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

