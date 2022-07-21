package jco.ql.parser.model.fuzzy;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Zunstraal
 *
 */
public class KeepingDroppingFuzzySets {
	public static final int UNDEFINED = -1;
	public static final int DEFUZZIFY = 0;
	public static final int DROPPING_ALL = 1;  //2
	public static final int KEEPING_ALL = 2;   //3
	public static final int DROPPING = 3;    //0
	public static final int KEEPING = 4;	 //1
			
	public List<String> fuzzySets;
	public int type;
	public String typeString;

	
	public void setDefuzzify() {
		type = DEFUZZIFY;
		typeString = "DEFUZZIFY ";
		fuzzySets = null;
	}

	public void setDroppingAll() {
		type = DROPPING_ALL;
		typeString = "DROPPING ALL FUZZY SETS ";
		fuzzySets = null;
	}

	public void setKeepingAll() {
		type = KEEPING_ALL;
		typeString = "KEEPING ALL FUZZY SETS ";
		fuzzySets = null;
	}

	public void setKeeping(String fs) {
		type = KEEPING;
		typeString = "KEEPING FUZZY SETS ";
		fuzzySets = new ArrayList<String>();
		fuzzySets.add(fs);
	}

	public void setDropping(String fs) {
		type = DROPPING;
		typeString = "DROPPING FUZZY SETS ";
		fuzzySets = new ArrayList<String>();
		fuzzySets.add(fs);
	}

	public void addFuzzySet(String fs) {
		fuzzySets.add(fs);
	}
	
	public String toString () {
		String str = typeString;
		if (fuzzySets != null) {
			for (int i = 0; i < fuzzySets.size()-1; i++) {
				str += fuzzySets.get(i) + ", ";
			}
			if (fuzzySets.size() > 0)
				str += fuzzySets.get(fuzzySets.size()-1) + " ";
		}
		return str;
	}

}
