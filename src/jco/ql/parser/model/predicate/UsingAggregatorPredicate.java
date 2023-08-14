package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.util.Field;


public class UsingAggregatorPredicate extends UsingPredicate{
	public static final int SELECTED_FUZZY_SET_IN_DOCUMENT 		= 21;
	public static final int ALL_MEMBERSHIP_IN_DOCUMENT			= 22;
	public static final int SELECTED_FUZZY_SET_FROM_ARRAY		= 23;
	
	public ArrayList<String> fuzzySetsSelected;
	public Field arrayName;
	public String fuzzyAggregatorName;
	public List<Expression> parameters; 
	public int aggregatorType;
	
	public UsingAggregatorPredicate(String fuzzyAggregatorName) {
		usingType = USING_FUZZY_AGGREGATOR;
		aggregatorType = UNDEFINED;	
		arrayName = null;
		fuzzySetsSelected = new ArrayList<String>();
		parameters = new ArrayList<Expression>();
		if(fuzzyAggregatorName == null)
			this.fuzzyAggregatorName = "";
		else 
			this.fuzzyAggregatorName = fuzzyAggregatorName;
	}
	
	public boolean hasSelelectedFuzzySets() {
		return !fuzzySetsSelected.isEmpty();
	}
	
	public boolean hasOtherParameters() {
		return !parameters.isEmpty();
	}
	
	
	
	public String toString () {
		String str = "AGGREGATE THROUGH " + fuzzyAggregatorName + "(MEMBERSHIP_TO ";
		if(fuzzySetsSelected != null) {
			if(aggregatorType == SELECTED_FUZZY_SET_IN_DOCUMENT) {
				str += "[";
				for(int i=0; i<fuzzySetsSelected.size(); i++) {
					str += fuzzySetsSelected.get(i);
					if(i != fuzzySetsSelected.size() - 1)
						str += ", ";
				}
				str+="]";
			}
			else if(aggregatorType == SELECTED_FUZZY_SET_FROM_ARRAY) {
				str += fuzzySetsSelected.get(0);
				str += " FROM ARRAY " + arrayName.toString();
			}
		}
		if(aggregatorType == ALL_MEMBERSHIP_IN_DOCUMENT) {
			str += "ALL";
		}
		if(hasOtherParameters()) {
			StringJoiner sj = new StringJoiner (", ", ", ", "");
			for (Expression e: parameters)
				sj.add(e.toString());
			str += sj.toString();
		}
		
		str += ")";
		
		return str;
	}
	
	public String toMultiLineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + toString ();
		return str;
	}
}
