package jco.ql.parser.model.util;

import java.util.ArrayList;

import jco.ql.parser.model.predicate.Expression;

public class ForAllClause {
	
	public String idArray;
	public Expression firstIndex;
	public Expression lastIndex;
	public ArrayList<LocallyClause> locally;
	public ArrayList<AggregateClause> aggregate;

	
	public ForAllClause(String idArray){
		this.idArray = idArray;
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
	public boolean hasParameterDefinedInForAll(String name) {
		if(name == null) return false;
		for(LocallyClause l: locally) {
			if(l.alias.equals(name)) return true;
		}
		for(AggregateClause a: aggregate) {
			if(a.alias.equals(name)) return true;
		}
		
		return false;	
	}
	
	public boolean hasParameterDefinedOutsideForAll(String name) {
		if(name == null) return false;
		for(AggregateClause a: aggregate) {
			
			if(a.alias.equals(name)) return true;
		}
		
		return false;	
	}
	
	public boolean hasArrayReferenceDefinedInForAll(String name) {
		if(name == null) return false;
		if(name.equals(idArray)) return true;
		for(LocallyClause l: locally) {
			if(l.alias.equals(name)) return true;
		}
		return false;
	}
	
	
	
	//TODO modify
	public String toString() {
		String str = "FOR ALL " + idArray;
		if(firstIndex != null)
			str += " IN (" + firstIndex.toString() + lastIndex.toString() + ")";
		str += " ";
		if(locally != null) {
			for(LocallyClause lc : locally)
				str += lc.toString() + " ";
		}
		str += " ";
		if(aggregate != null) {
			for(AggregateClause ac: aggregate)
				str += ac.toString() + " ";
		}
		
		return str;
	}
	
	//TODO modify
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";		
		String str = tabs + "FOR ALL " + idArray;
		if(firstIndex != null)
			str += " IN (" + firstIndex.toString() + ", " + lastIndex.toString() + ")";
		
		tabs += "\t";
		
		if(locally != null) {
			for(LocallyClause lc : locally)
				str += tabs + lc.toString() ;
		}
		
		if(aggregate != null) {
			for(AggregateClause ac: aggregate)
				str += tabs + ac.toString();
		}
		
		return str;
	}
}
