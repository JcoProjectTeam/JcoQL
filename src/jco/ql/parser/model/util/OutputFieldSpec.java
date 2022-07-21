package jco.ql.parser.model.util;

import jco.ql.parser.model.predicate.ExpressionFactor;

/**
 * 
 * @author Zunstraal
 *
 */
public class OutputFieldSpec {
	public static final int UNDEFINED = -1;	
	public static final int FACTOR = 1;
	public static final int OBJECT_STRUCTURE = 2;	

	public Field fieldRef;
	public ExpressionFactor factor;
	public ObjectStructure valueObjectStructure;
	
	public int type;

	public OutputFieldSpec (Field fr) {
		type = FACTOR;
		fieldRef = fr;
		valueObjectStructure = null;
		factor = new ExpressionFactor(fr);
	}

	public void setFieldSpec (ObjectStructure os) {
		type = OBJECT_STRUCTURE;	
		valueObjectStructure = os;
		factor = null;
	}

	public void setFieldSpec(ExpressionFactor f) {
		type = FACTOR;
		valueObjectStructure = null;
		factor = f;
	}
	
	
	public int getType () {
		return type; 
	}
	
	
	public int fieldRefSize () {
		return fieldRef.size();
	}
		
		
	public String toString () {
		if (type == OBJECT_STRUCTURE)
			return fieldRef.toString() + ": " + valueObjectStructure.toString();
		if (type == FACTOR)
			return fieldRef.toString() + ": " + factor.toString();
		return "";
	}

/*	
	// added on 07.02.2022 to better handle GENERATE 
	public OutputFieldSpec cloneSuffix () {
		Field suffix = fieldRef.clone();
		if (suffix.size() == 0)
			return null;
		suffix.fields.remove(0);
		OutputFieldSpec ofs = new OutputFieldSpec(suffix);
		ofs.type = this.type;
		ofs.valueObjectStructure = this.valueObjectStructure;
		ofs.factor = this.factor;
		return  ofs;
	}

	// added on 07.02.2022 to better handle GENERATE 
	public OutputFieldSpec cloneWithNewFieldRef (Field fieldRef) {
		OutputFieldSpec ofs = new OutputFieldSpec(fieldRef);
		ofs.type = this.type;
		ofs.valueObjectStructure = this.valueObjectStructure;
		ofs.factor = this.factor;
		return  ofs;
	}
*/
}
