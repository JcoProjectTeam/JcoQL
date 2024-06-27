package jco.ql.parser.model.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

import jco.ql.parser.model.util.Field;

public class MembershipArray extends SpecialFunctionFactor {
	public static final int MA_ALL 			= 1001;
	public static final int MA_SELECTED		= 1002;
	public static final int MA_FROM_ARRAY	= 1003;

	
	public int membershipArrayType;
	public String fuzzySet;
	public Field arrayName;
	public List<String> fuzzySetsSelected;

	public MembershipArray() {
		type = SPECIAL_FUNCTION;
		specialFuntionType = MEMBERSHIP_ARRAY;
		membershipArrayType = MA_ALL;
		this.fuzzySet = null;
		this.arrayName = null;
		this.fuzzySetsSelected = new ArrayList<String>();		
	}
	public MembershipArray(String fuzzyset, Field array) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = MEMBERSHIP_ARRAY;
		membershipArrayType = MA_FROM_ARRAY;
		this.fuzzySet = fuzzyset;
		this.fuzzySetsSelected = new ArrayList<String>();
		this.arrayName = array;
	}
	public MembershipArray(String fuzzySet) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = MEMBERSHIP_ARRAY;
		membershipArrayType = MA_SELECTED;
		this.fuzzySet = null;
		this.arrayName = null;
		this.fuzzySetsSelected = new ArrayList<String>();
		addFuzzyset (fuzzySet);
	}
	public void addFuzzyset(String fuzzySet) {
		fuzzySetsSelected.add(fuzzySet);
	}

	public int getMembershipArrayType ( ) {
		return membershipArrayType;
	}

	
	public String toString () {
		String st = "MEMBERSHIP_ARRAY (";
		
		if (membershipArrayType == MA_ALL)
			st += "ALL";
		else if (membershipArrayType == MA_SELECTED) {
			StringJoiner sj = new StringJoiner(", ", "[", "]");
			for (String s: fuzzySetsSelected)
				sj.add(s);
			st += sj.toString();
		}
		else {
			st += fuzzySet + " FROM ARRAY " + arrayName.toString();
		}
		
		st += ")";
		return st;		
	}
	

}
