package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class InRangePredicate extends Predicate {
	public Expression expr; 
	public String leftPar; 
	public double leftBound; 
	public double rightBound; 
	public String rightPar;
	
	
	public InRangePredicate(Expression expr, String leftPar, double leftBound, double rightBound, String rightPar) {
		type = IN_RANGE_PREDICATE;
		this.expr = expr;
		this.leftPar = leftPar;
		this.leftBound = leftBound;
		this.rightBound = rightBound;
		this.rightPar = rightPar;
	}

	public boolean includedLeft () {
		return "[".equals(leftPar);
	}
	
	public double getLeftBound () {
		return leftBound;
	}
	
	public double getRightBound () {
		return rightBound;
	}
	
	public boolean includedRight () {
		return "]".equals(rightPar);
	}
	

	public String toString () {
		String str = expr.toString() + " IN_RANGE " + leftPar + leftBound + ", " + rightBound + rightPar;
		return str;
	}


	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + expr.toString() + " IN_RANGE " + leftPar + leftBound + ", " + rightBound + rightPar;

		return str;
	}	
}
