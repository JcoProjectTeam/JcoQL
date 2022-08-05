package jco.ql.parser.model.util;


import jco.ql.parser.model.predicate.ComparisonPredicate;
import jco.ql.parser.model.predicate.EOrientation;

/**
 * 
 * @author Zunstraal
 *
 */
public class SpatialFunction {
	public static final String M_UNIT		= "M";
	public static final String KM_UNIT		= "KM";
	public static final String ML_UNIT		= "ML";

	public static final int	UNDEFINED		= -1;
	public static final int	DISTANCE		= 0;
	/* ZUN ERASE */
//	public static final int	AREA			= 1;
//	public static final int	LENGTH			= 2;
	public static final int	ORIENTATION		= 3;
	public static final int	INCLUDED		= 4;
	public static final int	INCLUDED_LEFT	= 5;
	public static final int	INCLUDED_RIGHT	= 6;
	public static final int	MEET			= 7;
	public static final int	INTERSECT		= 8;
	
	public int type;
	public String unit;
	public String comparator;
	public int comparatorType;
	public double area;
	public double distance;
	public double length;
	public String from;
	public String orientationStr;
	public EOrientation orientation;
	public double orientationAngle;
	public double delta;
	public String side;
	public boolean fullDetails;

	
	public SpatialFunction () {
		type = UNDEFINED;
		unit = null;
		comparator = null;
		comparatorType = UNDEFINED;
		distance = 0;
		area = 0;
		length = 0;
		from = null;
		orientationStr = null;
		delta = 0;
		side = null;		
		fullDetails = false;
	}

	public void setOrientationType(String f, String o, String d, boolean c) {
		fullDetails = c;
		type = ORIENTATION;
		from = f;
		if (o != null) {
			orientationStr = o;
			orientation = EOrientation.valueOf(o);
			orientationAngle = orientation.getAngle();
			if (d != null)
				delta = Double.parseDouble(d);			
		}		
	}
	public void setType(int t, String u, String cp, String n, boolean c) {
		fullDetails = c;
		type = t;
		if (type == DISTANCE) {
			unit = u;
			if (fullDetails) {
				comparator = cp;
				comparatorType = ComparisonPredicate.setComparator(cp);
				distance = Double.parseDouble(n);
			}
		}
		/* ZUN ERASE */
	/*	else if (type == AREA) {
			unit = u;
			if (fullDetails) {
				comparator = cp;
				comparatorType = ComparisonPredicate.setComparator(cp);
				area = Double.parseDouble(n);
			}
		}
		else if (type == LENGTH) {
			unit = u;
			if (fullDetails) {
				comparator = cp;
				comparatorType = ComparisonPredicate.setComparator(cp);
				length = Double.parseDouble(n);
			}
		}*/
	}

	public void setType(int t, String tk) {
		if (t == INCLUDED){
			side = tk;
			if (side.equals("LEFT")) 
				type = INCLUDED_LEFT;
			else
				type = INCLUDED_RIGHT;
		}
	}
	
	public void setType(int t) {
		type = t;
	}

	public String toString () {
		String str = "";
		if (type == DISTANCE && fullDetails)
			str += "DISTANCE(" + unit + ") " + comparator + " " + distance;
		else if (type == DISTANCE)
			str += "DISTANCE(" + unit + ") ";
		/* ZUN ERASE */
/*		else if (type == AREA && fullDetails)
			str += "AREA(" + unit + ") " + comparator + " " + area;
		else if (type == AREA)
			str += "AREA(" + unit + ")";
		else if (type == LENGTH && fullDetails)
			str += "LINE_LENGTH(" + unit + ") " + comparator + " " + length;
		else if (type == LENGTH)
			str += "LINE_LENGTH(" + unit + ")";
*/		else if (type == ORIENTATION && fullDetails)
			str += "ORIENTATION(" + from + ", " + orientationStr + ": " + delta + ")";
		else if (type == ORIENTATION)
			str += "ORIENTATION(" + from + ")";
		else if (type == INCLUDED_LEFT)
			str += "INCLUDED(LEFT)";
		else if (type == INCLUDED_RIGHT)
			str += "INCLUDED(RIGHT)";
		else if (type == MEET)
			str += "MEET";
		else if (type == INTERSECT)
			str += "INTERSECT";
		return str;				
	}

	public String toMultilineString (int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs;
		if (type == DISTANCE && fullDetails)
			str += "DISTANCE(" + unit + ") " + comparator + " " + distance;
		else if (type == DISTANCE)
			str += "DISTANCE(" + unit + ") ";
		/* ZUN ERASE */
/*		else if (type == AREA && fullDetails)
			str += "AREA(" + unit + ") " + comparator + " " + area;
		else if (type == AREA)
			str += "AREA(" + unit + ")";
		else if (type == LENGTH && fullDetails)
			str += "LINE_LENGTH(" + unit + ") " + comparator + " " + length;
		else if (type == LENGTH)
			str += "LINE_LENGTH(" + unit + ")";
*/		else if (type == ORIENTATION && fullDetails)
			str += "ORIENTATION(" + from + ", " + orientationStr + ": " + delta + ")";
		else if (type == ORIENTATION)
			str += "ORIENTATION(" + from + ")";
		else if (type == INCLUDED_LEFT)
			str += "INCLUDED(LEFT)";
		else if (type == INCLUDED_RIGHT)
			str += "INCLUDED(RIGHT)";
		else if (type == MEET)
			str += "MEET";
		else if (type == INTERSECT)
			str += "INTERSECT";
		return str;				
	}


	public static boolean checkUnit (String u) {
		return  M_UNIT.equals(u) || KM_UNIT.equals(u) || ML_UNIT.equals(u);
	}

	
	public static boolean checkDirection (String dir) {
		return 	EOrientation.checkDirection(dir);
	}
}

