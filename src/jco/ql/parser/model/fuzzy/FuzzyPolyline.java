package jco.ql.parser.model.fuzzy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Balicco
 *
 **/

public class FuzzyPolyline {
	
	public List<FuzzyPoint> polyline;
	public boolean defaultPolyline;
	
	public FuzzyPolyline() {
		polyline = new ArrayList<FuzzyPoint>();
		polyline.add(new FuzzyPoint ("0", "0"));
		polyline.add(new FuzzyPoint ("1", "1"));
		defaultPolyline = true;
	}
	
	
	
	public void resetPolyline() {
		defaultPolyline = false;
		polyline = new ArrayList<FuzzyPoint>();
	}
	
	public boolean hasDefaultPolyline() {
		return defaultPolyline;
	}
	
	
	public int getSize () {
		return polyline.size();
	}

	public String toString () {
		String str = " POLYLINE [";
		str += " " + polyline.get(0).toString();
		for (int i=1; i<polyline.size();i++)
			str += ", " + polyline.get(i).toString();
		str += " ] ";
		return str;
	}
	
	
	public String toMultilineString () {
		String str = "\n\t\tPOLYLINE [\n";
		str += "\t\t\t" + polyline.get(0).toString();
		for (int i=1; i<polyline.size();i++)
			str += ",\n\t\t\t" + polyline.get(i).toString();
		str += "\t]";
		return str;
	}
}
