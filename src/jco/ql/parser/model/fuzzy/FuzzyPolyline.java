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
	
}
