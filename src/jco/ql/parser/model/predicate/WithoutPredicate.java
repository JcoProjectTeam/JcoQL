package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.util.Field;

/**
 * 
 * @author Zunstraal
 *
 */
public class WithoutPredicate extends Predicate {
	public List<Field> fieldRefs;

	public WithoutPredicate () {	
		type = WITHOUT_PREDICATE;
		fieldRefs = new ArrayList<Field>();
	}
	
	
	public List<Field> getFieldsList () {
		return fieldRefs;
	}
	
	
	public void addField (Field f) {
		fieldRefs.add(f);
	}

	public String toString () {
		String str = "WITHOUT ";
		
		if (fieldRefs.size() > 0)
			str += fieldRefs.get(0).toString();
		else 
			str += " *** ERROR WITHOUT LIST EMPTY";
		for (int i=1; i<fieldRefs.size(); i++)
			str += ", " + fieldRefs.get(i).toString();
		return str;
	}

	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String str = tabs + "WITHOUT ";
		
		if (fieldRefs.size() > 0)
			str += fieldRefs.get(0).toString();
		else 
			str += " *** ERROR WITHOUT LIST EMPTY";
		for (int i=1; i<fieldRefs.size(); i++)
			str += ", " + fieldRefs.get(i).toString();
		return str;
	}

}
