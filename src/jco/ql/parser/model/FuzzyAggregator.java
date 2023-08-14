package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.fuzzy.FuzzyPoint;
import jco.ql.parser.model.predicate.Expression;
import jco.ql.parser.model.util.ForAllDeriveElement;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;
import jco.ql.parser.model.util.SortFuzzyAggregatorElement;
import jco.ql.parser.model.condition.Condition;


public class FuzzyAggregator extends Instruction{
	public String fuzzyAggregator;
	public Hashtable<String, Parameter> namespace;
	public List<Parameter> parameters;
	public Condition preCondition;
	public List<SortFuzzyAggregatorElement> sortList;
	public List<ForAllDeriveElement> forAllDeriveList;
	public Expression evaluate;
	public List<FuzzyPoint> polyline;
	public boolean defaultPolyline;
	
	
	public FuzzyAggregator (int seq, String fa)  {
		id = FUZZY_AGGREGATOR_INSTRUCTION;
		instructionName = "Create Fuzzy Aggregator";
		fuzzyAggregator = fa;
		sequence = seq;
		namespace = new Hashtable<String, Parameter> (101);
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		sortList = new ArrayList<SortFuzzyAggregatorElement>();
		forAllDeriveList = new ArrayList<ForAllDeriveElement>();
		evaluate = null;
		polyline = new ArrayList<FuzzyPoint>();
		polyline.add(new FuzzyPoint ("0", "0"));
		polyline.add(new FuzzyPoint ("1", "1"));
		defaultPolyline = true;
	}
	
	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
	}
	
	
	public boolean inNamespace (String name) {
		return namespace.containsKey(name);
	}
	public boolean isUnavailable (String name) {
		return namespace.containsKey(name) || fuzzyAggregator.equals(name);
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
	
	
	public List<ForAllDeriveElement> getForAllDeriveClauses() {
		return forAllDeriveList;
	}
	
	
	public boolean hasSortList () {
		return sortList.size() > 0;
	}

	
	public String toString () {
		StringJoiner sj;
		String str = instructionName.toUpperCase() + " " + fuzzyAggregator + " ";
		
		sj = new StringJoiner (", ", "PARAMETERS ", " ");
		for (int i=0; i<parameters.size(); i++)
			sj.add(parameters.get(i).toString());
		str += sj.toString();
		
		if (hasPrecondition())
			str += "PRECONDITION " + preCondition.toString() + " ";
		
		if (hasSortList()) {
			sj = new StringJoiner (", ", "SORT ", " ");
			for (int i=0; i<sortList.size(); i++) 
				sj.add(sortList.get(i).toString());
			str += sj.toString();
		}
		
		for (int i=0; i<forAllDeriveList.size();i++)
			str +=  forAllDeriveList.get(i).toString() + " ";	
		
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
		StringJoiner sj;
		String str = instructionName.toUpperCase() + " ";
		str += fuzzyAggregator;
		str += "\n\tPARAMETERS";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\n\t\t" + parameters.get(i).toString() + ",";
		if (parameters.size() > 0)
			str += "\n\t\t" + parameters.get(parameters.size()-1).toString();

		if (hasPrecondition())
			str +="\n\tPRECONDITION " + preCondition.toString();

		if (hasSortList()) {
			sj = new StringJoiner (",\n\t\t", "\n\tSORT\n\t\t", "");
			for (int i=0; i<sortList.size(); i++) 
				sj.add(sortList.get(i).toString());
			str += sj.toString();
		}
		
		for (int i=0; i<forAllDeriveList.size();i++)
			str += forAllDeriveList.get(i).toMultilineString(1);

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
