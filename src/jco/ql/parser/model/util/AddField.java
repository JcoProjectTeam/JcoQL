package jco.ql.parser.model.util;

import jco.ql.parser.model.predicate.ExpressionFactor;

/**
 * 
 * @author Zunstraal
 *
 */
public class AddField {
	public static int UNDEFINED_FIELD = -1;
	public static int FACTOR_FIELD = 0;
	public static int SPATIAL_FUNTION_FIELD = 1;
	
	public int type;
	public Field field;
	public ExpressionFactor factor;
	public SpatialFunction spatialFuncion;
	
	
	public AddField(Field field, ExpressionFactor factor) {
		type = FACTOR_FIELD;
		this.field = field;
		this.factor = factor;
		this.spatialFuncion = null;
	}

	
	public AddField(Field field, SpatialFunction spatialFuncion) {
		type = FACTOR_FIELD;
		this.field = field;
		this.factor = null;
		this.spatialFuncion = spatialFuncion;
	}

	
	public int getType () {
		return type;
	}

	
	public ExpressionFactor getFactor () {
		return factor;
	}

	
	public SpatialFunction getSpatialFunction () {
		return spatialFuncion;
	}

	
	public String toString ( ) {
		String str = field.toString() + " : ";
		if (type == FACTOR_FIELD)
			str += factor.toString();
		else if (type == SPATIAL_FUNTION_FIELD)
			str += spatialFuncion.toString();
		return str;
	}
}
