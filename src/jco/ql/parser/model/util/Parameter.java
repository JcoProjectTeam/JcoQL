package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class Parameter {
	public String name;
	public String type;
	
	public Parameter (String n, String t) {
		name = n;
		type = t;
	}

	public String toString () {
		return name + " TYPE " + type;
	}

}
