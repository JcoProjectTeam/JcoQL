package jco.ql.parser.model.util;

import java.util.List;
import java.util.ArrayList;

/**
 * 
 * Field as a couple (FieldNames, Value)
 *
 */
public class Field {
	public List<String> fields;
	public Value value;

	public Field () {
		fields = new ArrayList<String>();
		value = null;
	}
	
// vengono eliminati gli eventuali doppi apici iniziali	
	public void addField (String field) {
		fields.add(field.replace("\"", ""));
	}
	
	public void addHeadField (String field) {
		fields.add(0, field.replace("\"", ""));
	}
	
	public void setValue (Value v) {
		value = v;
	}
	
	public boolean hasValue () {
		return value != null;
	}

	public int size ( ) {
		if (fields == null)
			return 0;
		return fields.size();
	}

	// hanno gli stessi campi
	public boolean sameTo (Field fn) {
		if (fn == null)
			return false;
		if (fn.fields.size() != fields.size())
			return false;
		
		for (int i=0; i<fields.size(); i++)
			if (!fields.get(i).equals(fn.fields.get(i)))
				return false;
			
		return true;
	}

	// hanno gli stessi campi e lo stesso valore
	public boolean equals (Field fn) {
		if (fn == null)
			return false;
		
		if (fn.value == null)
			return false; 
		
		if (fn.fields.size() != fields.size())
			return false;
		
		if (value == null)
			return false;

		if (value.type != fn.value.type)
			return false;
		
		for (int i=0; i<fields.size(); i++)
			if (!fields.get(i).equals(fn.fields.get(i)))
				return false;
			
		if (!value.value.equals(fn.value.value))
			return false;
		
		return true;
	}
	
	public boolean contains (Field fn) {
		if (fn == null)
			return false;
				
		if (fields.size() >= fn.fields.size())
			return false;

		for (int i=0; i<fields.size(); i++)
			if (!fields.get(i).equals(fn.fields.get(i)))
				return false;

		return true;
	}

	public boolean isContained (Field fn) {
		if (fn == null)
			return false;
				
		if (fields.size() < fn.fields.size())
			return false;

		for (int i=0; i<fn.fields.size(); i++)
			if (!fields.get(i).equals(fn.fields.get(i)))
				return false;

		return true;
	}
	
	public String toString () {
		String st = "";

		for (int i=0; i<fields.size();i++)
			st += fields.get(i);
		
		if (hasValue())
			st += "=" + value.toString();
		return st;
	}

	// creato per risolvere problema con la GENERATE
	public Field clone () {
		Field fr = new Field ();
		if (fields != null)
			for (int i=0; i<fields.size(); i++)
				fr.addField(fields.get(i));
		return fr;
	}

	// creato per risolvere problema con la GENERATE
	public Field cloneSuffix () {
		Field fr = new Field ();
		if (fields != null)
			for (int i=1; i<fields.size(); i++)
				fr.addField(fields.get(i));
		return fr;
	}
	
	public String head () {
		if (fields.size() > 0)
			return fields.get(0);
		return null;
	}
	public String tail () {
		if (fields.size() > 0)
			return fields.get(fields.size()-1);
		return null;
	}
}

