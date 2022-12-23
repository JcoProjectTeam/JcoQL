package jco.ql.parser.model;

import java.util.ArrayList;


import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.predicate.ArrayReference;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.ForAllClause;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;
import jco.ql.parser.model.condition.Condition;

public class FuzzyAggregator extends Instruction{
	public static int DEFAULT = 0;
	public static int ASCENDING = 1;
	public static int DESCENDING = 2;
	
	public String fuzzyAggregator;
	public ArrayList<Parameter> parameters;
	public Condition preCondition;
	public int versus;
	public ArrayList<ForAllClause> forAll;
	public Expression evaluate;
	public ArrayList<FuzzyPoint> polyline;

	public boolean defaultPolyline;
	
	
	public FuzzyAggregator (int seq, String fa)  {
		id = FUZZY_AGGREGATOR_INSTRUCTION;
		instructionName = "Create Fuzzy Aggregator";
		fuzzyAggregator = fa;
		sequence = seq;
		versus = DEFAULT;
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		evaluate = null;
		forAll = new ArrayList<ForAllClause>();
		polyline = new ArrayList<FuzzyPoint>();
		polyline.add(new FuzzyPoint ("0", "0"));
		polyline.add(new FuzzyPoint ("1", "1"));
		defaultPolyline = true;
	}
	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
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
	
	public ArrayList<ForAllClause> getForAllClauses() {
		return forAll;
	}
	
	
	public boolean hasParameterDefined(String name) {
		if(name == null) return false;
		if(parameters != null) {
			for(Parameter p: parameters)
				if(p.name.equals(name)) return true;
		}
		if(forAll != null && !forAll.isEmpty()) {
			for(ForAllClause clause : forAll) {
				if(clause.hasParameterDefinedOutsideForAll(name)) return true;
			}
		}
		
		return false;
	}
	
	public boolean hasParameterDefinedInCurrentForAll(String name, ForAllClause currentForAll) {
		if(name == null) return false;
		if(parameters != null) {
			for(Parameter p: parameters)
				if(p.name.equals(name)) return true;
		}
		if(forAll != null && !forAll.isEmpty()) {
			for(ForAllClause clause : forAll)
				clause.hasParameterDefinedOutsideForAll(name);
		}
		if(currentForAll != null) {
		  currentForAll.hasParameterDefinedInForAll(name);
		}
		return false;
	}
	
	//TODO check
	public boolean hasArrayReferenceDefined(String name) {
		if(name == null) return false;
		if(parameters != null && !parameters.isEmpty()) {
			for(Parameter p: parameters ) {
				if(p.name.equals(name) && p.type.equals(ArrayReference.ARRAY_STRING)) return true;
			}
		}
		
		return false;
	}
	
	
	public String toString () {
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyAggregator + " ";
		str += "PARAMETERS ";
		for (int i=0; i<parameters.size()-1;i++)
			str += parameters.get(i).toString() + ", ";
		if (parameters.size() > 0)
			str += parameters.get(parameters.size()-1).toString() + " ";
		if (hasPrecondition())
			str +="PRECONDITION " + preCondition.toString() + " ";
		str += versusTypeString();
		for (int i=0; i<forAll.size();i++)
			str +=  forAll.get(i).toString() + " ";
		
		
		str +="EVALUATE " + evaluate.toString() + " ";
		if(!hasDefaultPolyline()) {
			str +="POLYLINE ";
			str +="[ " + polyline.get(0).toString();				
			for (int i=1; i<polyline.size();i++)
				str += ", " + polyline.get(i).toString();
			str += " ]";
		}
		
		return str + ";";
	}
	
	public String versusTypeString() {
		if(versus == ASCENDING)
			return "\n\tSORT ASC";
		else if (versus == DESCENDING)
			return "\n\tSORT DESC";
		else return "";
	}
	
	@Override
	public String toMultilineString() {
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyAggregator + "\n\t";
		str += "PARAMETERS\n";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\t\t" + parameters.get(i).toString() + ",\n";
		if (parameters.size() > 0)
			str += "\t\t" + parameters.get(parameters.size()-1).toString() + "\n";
		if (hasPrecondition())
			str +="\tPRECONDITION " + preCondition.toString();
		str +=  versusTypeString();
		for (int i=0; i<forAll.size();i++)
			str += "\t" + forAll.get(i).toMultilineString(1);

		
		if(evaluate != null)
			str +="\n\tEVALUATE " + evaluate.toString() + "\n";
		if(!hasDefaultPolyline()) {
			str +="\tPOLYLINE ";
			str +="\t\t[\t" + polyline.get(0).toString();				
			for (int i=1; i<polyline.size();i++)
				str += ",\n\t\t\t" + polyline.get(i).toString();
			str += "\t]";
		}
		
		return str + ";\n";
	}

}
