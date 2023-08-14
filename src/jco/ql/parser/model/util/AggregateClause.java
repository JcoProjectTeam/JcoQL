package jco.ql.parser.model.util;

import java.util.Hashtable;

import jco.ql.parser.model.predicate.Expression;

public class AggregateClause {
	public static final int UNDEFINED = -1;	
	public static final int DEFAULT = 0;	
	public static final int SUM = 1;	
	public static final int PRODUCT = 2;	
	public static final int MINIMUM = 5;
	public static final int MAXIMUM = 6;
	
	public static final String SUM_STRING = "SUM";	
	public static final String PRODUCT_STRING = "PRODUCT";	
	public static final String MINIMUM_STRING = "MINIMUM";
	public static final String MAXIMUM_STRING = "MAXIMUM";
	
	public int withType;
	public String withString;
	public String alias;
	public Expression exp;
	private Hashtable <String, Integer> aggregateMap;
	
	public AggregateClause(String id) {
		withString = "";
		withType = DEFAULT;
		loadAggregateMap(); 
		this.alias = id;
	}
	
	public AggregateClause(String id, String withType) {
		this(id);
		withString = withType;
		Integer type = aggregateMap.get(withType);
		if (type != null)
			this.withType = type.intValue();
	}
	
	private void loadAggregateMap() {
		aggregateMap = new Hashtable<String, Integer>(23);
		aggregateMap.put("", DEFAULT);
		aggregateMap.put(SUM_STRING, SUM);
		aggregateMap.put(PRODUCT_STRING, PRODUCT);
		aggregateMap.put(MINIMUM_STRING, MINIMUM);
		aggregateMap.put(MAXIMUM_STRING, MAXIMUM);
	}
	
	
	public String toString() {
		String st = "";
		if (withType != DEFAULT)
			st = "WITH " + withString + " ";

		st += exp.toString();
		st += " AS " + alias;
		
		return st;
	}
	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + toString();

		
		return str;
	}

}
