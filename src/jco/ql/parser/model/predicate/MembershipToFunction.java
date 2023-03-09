package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class MembershipToFunction extends SpecialFunctionFactor {
	public String membershipTo;
	
	public MembershipToFunction (String mt) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = MEMBERSHIP_TO_FUNCTION;
		membershipTo = mt;
	}
	
	public String getMemebershipOfFuzzyset () {
		return membershipTo;
	}


	public String toString () {
			return "MEMBERSHIP_TO (" + membershipTo + ")";

	}
}
