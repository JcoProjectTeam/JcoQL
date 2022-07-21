package jco.ql.parser.model.fuzzy;

// aggiunta il 14.07.2021
public class FuzzySetDefinitionElement {
	public String function;
	public String side;
	public String sourceFuzzySet;
	public String newFuzzySet;
	
	
	public FuzzySetDefinitionElement (String function, String side, String sourceFuzzySet, String newFuzzySet) {
		this.function = function;
		this.side = side;
		this.sourceFuzzySet = sourceFuzzySet;
		this.newFuzzySet = newFuzzySet;		
	}
	
	
	public boolean isFunction () {
		return function != null;
	}
	public boolean isHowMeetFunction () {
		return "HOW_MEET".equals(function);
	}
	/*	public boolean isOverlapFunction () {
	return "OVERLAP".equals(function);
}
public boolean isInsideFunction () {
	return "INSIDE".equals(function);
}
*/
	// MODIFIED ON 2022.03.30
	public boolean isHowIntersectFunction () {
		return "HOW_INTERSECT".equals(function);
	}
	public boolean isHowIncludeFunction () {
		return "HOW_INCLUDE".equals(function);
	}
	public boolean isRight () {
		return "RIGHT".equals(side);
	}
	public boolean isLeft () {
		return "LEFT".equals(side);
	}
	public boolean allSide () {
		return "ALL".equals(sourceFuzzySet);
	}
	public boolean hasNewName () {
		return newFuzzySet != null;
	}

	public String toString () {
		String st = "";
		if (isFunction ()) {
			st = function + " ";
			if (side == null)
				st += "() ";
			else
				st += "(" + side + ") ";
			st += "AS " + newFuzzySet + " ";			
		}
		else {
			st += side + " " + sourceFuzzySet + " ";
			if (hasNewName())
				st += "AS " + newFuzzySet + " ";
		}			
		return st.trim();
	}
	
}
