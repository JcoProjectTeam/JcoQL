package jco.ql.parser.model.util;

import java.util.Hashtable;
import java.util.Map;


import jco.ql.parser.model.predicate.Expression;

public class AggregateClause {
	public static final int UNDEFINED = -1;	
	public static final int SUM = 0;	
	public static final int PRODUCT = 1;	
	public static final int DIVISION = 2;
	public static final int SUBTRACTION = 3;	
	public static final int MINIMUM = 4;
	public static final int MAXIMUM = 5;
	
	public static final String SUM_STRING = "SUM";	
	public static final String PRODUCT_STRING = "PRODUCT";	
	public static final String DIVISION_STRING = "DIVISION";
	public static final String SUBTRACTION_STRING = "SUBTRACTION";	
	public static final String MINIMUM_STRING = "MINIMUM";
	public static final String MAXIMUM_STRING = "MAXIMUM";
	
	public int withType;
	public String alias;
	public Expression exp;
	private static Hashtable <String, Integer> aggregateMap;
	
	public AggregateClause(String id) {
		withType = SUM;
		loadAggregateMap(); 
		this.alias = id;
	}
	
	public AggregateClause(String id, String withType) {
		this(id);
		Integer type = aggregateMap.get(withType);
		if (type!=null)
			this.withType = type.intValue();
	}
	
	private void loadAggregateMap() {
		aggregateMap = new Hashtable<String, Integer>(10);
		aggregateMap.put(SUM_STRING, SUM);
		aggregateMap.put(PRODUCT_STRING, PRODUCT );
		aggregateMap.put(DIVISION_STRING, DIVISION);
		aggregateMap.put(SUBTRACTION_STRING, SUBTRACTION);
		aggregateMap.put(MINIMUM_STRING, MINIMUM);
		aggregateMap.put(MAXIMUM_STRING, MAXIMUM);
		}
	
	
	public String toString() {
		String withTypeString = "";
		for(Map.Entry<String, Integer> entry: aggregateMap.entrySet()){
            if(withType == entry.getValue().intValue()){
            	withTypeString = entry.getKey();
                break; 
            }
        }


		String str = "AGGREGATE WITH " + withTypeString + " " + exp.toString();
		str += " AS " + alias;
		
		return str;
	}
	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + toString();

		
		return str;
	}

}
