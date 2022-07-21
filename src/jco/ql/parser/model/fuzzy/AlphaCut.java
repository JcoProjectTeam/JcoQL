package jco.ql.parser.model.fuzzy;

/**
 * 
 * @author Zunstraal
 *
 */
public class AlphaCut {
	public double alphacutValue;
	public String alphacut;
	public String on;

	
	public AlphaCut(String alphacut, String on) {
		this.alphacut = alphacut;
		this.on = on;
		alphacutValue = Double.parseDouble(alphacut);
	}

	public String toString () {
		String str = alphacut + " ON " + on;
		return str;
	}

}
