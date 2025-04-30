package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.fuzzy.FuzzyPolyline;
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
	public FuzzyPolyline polyline;
	public boolean isFuzzyAggregator;
	
	//GB Gestione dei valutatori generici:
	public String fuzzyEvaluatorType;
	public List<Expression> genericEvaluate;
	public List<FuzzyPolyline> genericPolylines;
	public List<Parameter> genericDegrees;

	
	public FuzzyEvaluator (int seq, String fe)  {
		id = FUZZY_EVALUATOR_INSTRUCTION;
		instructionName = "CREATE FUZZY EVALUATOR";
		fuzzyEvaluatorName = fe;
		isFuzzyAggregator = false;
		sequence = seq;
		namespace = new Hashtable<String, Parameter> (101);
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		feInternalClauseList = new ArrayList<FEInternalClause>();
		evaluate = null;
		polyline = new FuzzyPolyline ();

		fuzzyEvaluatorType = null; 	// GB serve per diversificarlo dai generici
		genericEvaluate = null;		// GB
		genericPolylines = null;	// GB
		genericDegrees = null;
	}
	public FuzzyEvaluator (int seq, String fe, boolean isFA)  {
		this (seq, fe);
		if (isFA) {
			id = FUZZY_AGGREGATOR_INSTRUCTION;
			instructionName = "CREATE FUZZY AGGREGATOR";
			isFuzzyAggregator = isFA;
		}		
	}

	
	//GB costruttore per valutatore generico
	public FuzzyEvaluator(int seq, String gfe, String type) {
		id = FUZZY_GENERIC_EVALUATOR_INSTRUCTION;
		sequence = seq;
		instructionName = "CREATE " + type + " FUZZY EVALUATOR";
		
		fuzzyEvaluatorName = gfe;
		fuzzyEvaluatorType = type;
		
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		genericEvaluate = new ArrayList<Expression>();
		genericPolylines = new ArrayList<FuzzyPolyline>();
		genericDegrees = new ArrayList<Parameter>();
		isFuzzyAggregator = false;
		
		namespace = new Hashtable<String, Parameter> (101);
		feInternalClauseList = new ArrayList<FEInternalClause>();
		
		evaluate = null;
		polyline = null;
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
		polyline = new FuzzyPolyline();
	}
	

	public boolean hasDefaultPolyline() {
		return polyline.defaultPolyline;
	}
	
	
	public List<FEInternalClause> getForAllDeriveClauses() {
		return feInternalClauseList;
	}
	
		
	public String toString () {
		StringJoiner sj;
		String str = instructionName + " ";
		str += fuzzyEvaluatorName + " ";
		
		sj = new StringJoiner (", ", "PARAMETERS ", " ");
		for (int i=0; i<parameters.size(); i++)
			sj.add(parameters.get(i).toString());
		str += sj.toString();
		
		if (hasPrecondition())
			str += "PRECONDITION " + preCondition.toString() + " ";
		
		for (int i=0; i<feInternalClauseList.size();i++)
			str +=  feInternalClauseList.get(i).toString() + " ";	
		
		if(fuzzyEvaluatorType == null) {						// GB
			str +="EVALUATE " + evaluate.toString() + " ";
			
			if(!hasDefaultPolyline()) 
				polyline.toString();
		}
		else {
			for(int i = 0; i < genericDegrees.size(); i++) {
				str += "EVALUATE " + genericDegrees.get(i).name + " ";
				str += "AS " + genericEvaluate.get(i).toString();
				
				FuzzyPolyline fp = genericPolylines.get(i);
				if(!genericPolylines.get(i).hasDefaultPolyline()) 
					str += fp.toString();
			}
		}
		
		return str.trim() + ";";
	}


	@Override
	public String toMultilineString() {
		String str = instructionName + " ";
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

		// GB differenziazione tra valutatore classico e valutatore generico
		if(fuzzyEvaluatorType == null) {
			if(evaluate != null)
				str +="\n\tEVALUATE " + evaluate.toString();
			
			if(!hasDefaultPolyline()) 
				str += polyline.toMultilineString();
		}
		else {
			for(int i = 0; i < genericDegrees.size(); i++) {
				str += "\n\tEVALUATE " + genericDegrees.get(i).name;
				str += " AS " + genericEvaluate.get(i).toString();
				
				FuzzyPolyline fp = genericPolylines.get(i);
				if(!fp.hasDefaultPolyline()) 
					str += fp.toMultilineString();
			}
		}
		
		return str.trim() + ";\n";
	}

}
