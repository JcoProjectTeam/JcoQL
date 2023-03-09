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
	public String degree;		//added by Balicco
	
	public AlphaCut(String alphacut, String on) {
		this.alphacut = alphacut;
		this.on = on;
		this.degree = null;		//added by Balicco
		alphacutValue = Double.parseDouble(alphacut);
	}

	
	// added by Balicco
	public AlphaCut(String alphacut, String on, String d) {
		this.alphacut = alphacut;
		this.on = on;
		alphacutValue = Double.parseDouble(alphacut);
		this.degree = d;
	}	
	
	
	public String toString () {
		String str = alphacut + " ON " + on;
		if(degree != null)		//added by Balicco
			str += degree;		
		return str;
	}

}
