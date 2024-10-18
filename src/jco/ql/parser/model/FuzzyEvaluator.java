package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.FEInternalClause;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;
import jco.ql.parser.model.condition.Condition;


public class FuzzyEvaluator extends Instruction{
	public String fuzzyEvaluatorName;
	public Hashtable<String, Parameter> namespace;
	public List<Parameter> parameters;
	public Condition preCondition;
	public List<FEInternalClause> feInternalClauseList;
	public Expression evaluate;
	public List<FuzzyPoint> polyline;
	public boolean defaultPolyline; 
	public boolean isFuzzyAggregator;
	
	
	public FuzzyEvaluator (int seq, String fe)  {
		id = FUZZY_EVALUATOR_INSTRUCTION;
		instructionName = "Create Fuzzy Evaluator";
		fuzzyEvaluatorName = fe;
		isFuzzyAggregator = false;
		sequence = seq;
		namespace = new Hashtable<String, Parameter> (101);
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		feInternalClauseList = new ArrayList<FEInternalClause>();
		evaluate = null;
		polyline = new ArrayList<FuzzyPoint>();
		polyline.add(new FuzzyPoint ("0", "0"));
		polyline.add(new FuzzyPoint ("1", "1"));
		defaultPolyline = true;
	}
	public FuzzyEvaluator (int seq, String fe, boolean isFA)  {
		this (seq, fe);
		if (isFA) {
			id = FUZZY_AGGREGATOR_INSTRUCTION;
			instructionName = "Create Fuzzy Aggregator";
			isFuzzyAggregator = isFA;
		}		
	}
	
	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
	}
	
	
	public boolean inNamespace (String name) {
		return namespace.containsKey(name);
	}
	public boolean isUnavailable (String name) {
		return namespace.containsKey(name) || fuzzyEvaluatorName.equals(name);
	}


	public boolean hasPrecondition () {
		return (preCondition != null);
	}
	
	
	public void resetPolyline() {
		defaultPolyline = false;
		polyline = new ArrayList<FuzzyPoint>();
	}
	

	public boolean hasDefaultPolyline() {
		return defaultPolyline;
	}
	
	
	public List<FEInternalClause> getForAllDeriveClauses() {
		return feInternalClauseList;
	}
	
		
	public String toString () {
		StringJoiner sj;
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyEvaluatorName + " ";
		
		sj = new StringJoiner (", ", "PARAMETERS ", " ");
		for (int i=0; i<parameters.size(); i++)
			sj.add(parameters.get(i).toString());
		str += sj.toString();
		
		if (hasPrecondition())
			str += "PRECONDITION " + preCondition.toString() + " ";
		
		for (int i=0; i<feInternalClauseList.size();i++)
			str +=  feInternalClauseList.get(i).toString() + " ";	
		
		str +="EVALUATE " + evaluate.toString() + " ";
		if(!hasDefaultPolyline()) {
			str +="POLYLINE ";
			str +="[ " + polyline.get(0).toString();				
			for (int i=1; i<polyline.size();i++)
				str += ", " + polyline.get(i).toString();
			str += " ]";
		}
		
		return str.trim() + ";";
	}


	@Override
	public String toMultilineString() {
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyEvaluatorName;
		str += "\n\tPARAMETERS";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\n\t\t" + parameters.get(i).toString() + ",";
		if (parameters.size() > 0)
			str += "\n\t\t" + parameters.get(parameters.size()-1).toString();

		if (hasPrecondition())
			str +="\n\tPRECONDITION " + preCondition.toString();

		for (int i=0; i<feInternalClauseList.size();i++)
			str += feInternalClauseList.get(i).toMultilineString(1);

		if(evaluate != null)
			str +="\n\tEVALUATE " + evaluate.toString();

		if(!hasDefaultPolyline()) {
			str +="\n\tPOLYLINE ";
			str +="\t\t[\t" + polyline.get(0).toString();				
			for (int i=1; i<polyline.size();i++)
				str += ",\n\t\t\t" + polyline.get(i).toString();
			str += "\t]";
		}
		
		return str.trim() + ";\n";
	}

}
