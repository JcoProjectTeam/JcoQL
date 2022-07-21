package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class GeometricOption {
	public static final int UNDEFINED = -1;	
	public static final int KEEPING = 0;	
	public static final int DROPPING = 1;	
	public static final int POINT = 2;	
	public static final int AGGREGATE = 3;	
	public static final int FIELD_REF = 4;	
	public static final int TO_POLYLINE = 5;	

	int type;
	public Field latitude;
	public Field longitude;
	public Field fieldRef;
	

	public GeometricOption () {
  	type = UNDEFINED;
  	latitude = null;
  	longitude = null;
  	fieldRef = null;
  }
	
	public void setKeeping () { 
		type = KEEPING;
	}
	
	public void setDropping () {
		type = DROPPING;
	}
	  
	public void setPoint (Field lat, Field lon) { 
		type = POINT;  	
		latitude = lat;
		longitude = lon;
	}
	  
	public void setAggregate (Field afr) {
		type = AGGREGATE;  	  
		fieldRef = afr;
	}
	  
	public void setField (Field fr) {
		type = FIELD_REF;  	  	
		fieldRef= fr;
	}
	
	public void setPolyline (Field fr) {
		 type = TO_POLYLINE;  	  	
	  	fieldRef= fr;
	}
	  
	public int getType () {
		return type;
	}
	
	public String toString() {
		String str = "";
		if (type == KEEPING)
			str += "KEEPING GEOMETRY";
		else if (type == DROPPING)
			str += "DROPPING GEOMETRY";
		else if (type == POINT)
			str += "SETTING GEOMETRY POINT (" + latitude.toString() + ", " + longitude.toString() + ")";
		else if (type == AGGREGATE) 
			str += "SETTING GEOMETRY AGGREGATE (" + fieldRef.toString() + ")";
		else if (type == FIELD_REF)
			str += "SETTING GEOMETRY " + fieldRef.toString();
		else if (type == TO_POLYLINE)
			str += "SETTING GEOMETRY TO_POLYLINE (" + fieldRef.toString() + ")";
		return str;
	}

	public String toMultilineString(int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs;

		if (type == KEEPING)
			str += "KEEPING GEOMETRY";
		else if (type == DROPPING)
			str += "DROPPING GEOMETRY";
		else if (type == POINT)
			str += "SETTING GEOMETRY POINT (" + latitude.toString() + ", " + longitude.toString() + ")";
		else if (type == AGGREGATE) 
			str += "SETTING GEOMETRY AGGREGATE (" + fieldRef.toString() + ")";
		else if (type == FIELD_REF)
			str += "SETTING GEOMETRY " + fieldRef.toString();
		else if (type == TO_POLYLINE)
			str += "SETTING GEOMETRY TO_POLYLINE (" + fieldRef.toString() + ")";
		return str;
	}
  
}
