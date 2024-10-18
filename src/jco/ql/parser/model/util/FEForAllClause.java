package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringJoiner;

import jco.ql.parser.model.predicate.Expression;

public class FEForAllClause extends FEInternalClause {
	
	public String var;
	public String idArray;
	public Expression firstIndex;
	public Expression lastIndex;
	public ArrayList<LocallyClause> locally;
	public ArrayList<AggregateClause> aggregate;
	public HashSet<String> namespace;

	
	public FEForAllClause(String var, String idArray){
		this.var = var;
		this.idArray = idArray;
		feicType = FOR_ALL_CLAUSE;
		firstIndex = null;
		lastIndex = null;
		locally = new ArrayList<LocallyClause>();
		aggregate = new ArrayList<AggregateClause>();
	}
	
	public boolean hasRange() {
		return firstIndex != null;
	}
	
	public boolean hasLocallyClause() {
		return !locally.isEmpty();
	}
	
	//Locally aliases are available only inside the for all
	public boolean isForAllParameter(String name) {
		if(name == null) 
			return false;

		if (name.equals(var))
			return true;
		
		for(LocallyClause l: locally) 
			if(l.alias.equals(name)) 
				return true;

		for(AggregateClause a: aggregate) 
			if(a.alias.equals(name)) 
				return true;
		
		return false;	
	}

	
	public String toString() {
		String str = "FOR ALL " + var + " IN " + idArray;
		if(firstIndex != null)
			str += " [" + firstIndex.toString() + ", " + lastIndex.toString() + "]";
		str += " ";

		if(locally != null) {
			if (locally.size() == 1)
				str += "LOCALLY " + locally.get(0).toString() + " ";
			else {
				StringJoiner sj = new StringJoiner(", ", "LOCALLY ", " ");
				for(LocallyClause lc : locally)
					sj.add(lc.toString());
				str += sj.toString();
			}
		}

		if(aggregate != null) {
			if (aggregate.size() == 1)
				str += "AGGREGATE " + aggregate.get(0).toString() + " ";
			else {
				StringJoiner sj = new StringJoiner(", ", "AGGREGATE ", " ");
				for(AggregateClause ac: aggregate)
					sj.add(ac.toString());
				str += sj.toString();
			}
		}

		return str;
	}
	

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";		
		String str = tabs + "FOR ALL " + var + " IN " + idArray;
		if(firstIndex != null)
			str += " [" + firstIndex.toString() + ", " + lastIndex.toString() + "]";
		
		tabs += "\t";
		
		if(locally != null) 
			if (locally.size() == 1)
				str += tabs + "LOCALLY " + locally.get(0).toString();
			else {
				StringJoiner sj = new StringJoiner(", " + tabs+"\t", tabs + "LOCALLY "+tabs+"\t", "");
				for(LocallyClause lc : locally)
					sj.add(lc.toString());
				str += sj.toString();
			}
		
		if(aggregate != null) 
			if (aggregate.size() == 1)
				str += tabs + "AGGREGATE " + aggregate.get(0).toString();
			else {
				StringJoiner sj = new StringJoiner(", " + tabs+"\t", tabs + "AGGREGATE "+tabs+"\t", "");
				for(AggregateClause ac: aggregate)
					sj.add(ac.toString());
				str += sj.toString();
			}

		return str;
	}
}
