package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class MembershipOfFunction extends SpecialFunctionFactor {

	public String membershipOf;
	
	public MembershipOfFunction (String mo) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = MEMBERSHIP_OF_FUNCTION;
		membershipOf = mo;
	}
	
	public String getMemebershipOfFuzzyset () {
		return membershipOf;
	}


	public String toString () {
			return "MEMBERSHIP_OF (" + membershipOf + ")";

	}
}
