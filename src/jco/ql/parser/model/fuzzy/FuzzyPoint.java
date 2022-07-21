package jco.ql.parser.model.fuzzy;

/**
 * 
 * @author Zunstraal
 *
 */
public class FuzzyPoint {
	public String x;
	public String y;

	public FuzzyPoint (String xt1, String xt2) {
		x = xt1;
		y = xt2;
	}
	
	public double getXvalue () {
		if (x == null)
			return 0.0;
		return Double.parseDouble(x);
	}

	public double getYvalue () {
		if (y == null)
			return 0.0;
		return Double.parseDouble(y);
	}

	public String toString () {
		return "(" + x +", " + y + ")";
	}

}
