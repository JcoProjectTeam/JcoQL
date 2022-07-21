package jco.ql.parser.model.predicate;

public enum EOrientation {
	E(0),
	ENE(22.5),
	NE(45),
	NNE(67.5),
	N(90),
	NNW(112.5),
	NW(135),
	WNW(157.5),
	W(180),
	WSW(202.5),
	SW(225),
	SSW(247.5),
	S(270),
	SSE(292.5),
	SE(315),
	ESE(337.5);

	private double orientation;
	
	private EOrientation(double orientation){
		this.orientation = orientation;
	}
	
	public double getAngle(){
		return orientation;
	}
	public boolean closeAngle (double angle, double delta) {
		double angleDiff = (getAngle() - angle + 180 + 360) % 360 - 180;
		delta = Math.abs(delta);

		return (angleDiff >= -delta && angleDiff <= delta);		
	}

	
	public static boolean checkDirection (String dir) {
		return 	N.toString().equals(dir) 	|| S.toString().equals(dir) 	|| W.toString().equals(dir) 	|| E.toString().equals(dir) 	|| 
				NE.toString().equals(dir) 	|| NW.toString().equals(dir) 	|| SE.toString().equals(dir) 	|| SW.toString().equals(dir) 	|| 
				NNE.toString().equals(dir)	|| NNW.toString().equals(dir) 	|| SSE.toString().equals(dir) 	|| SSW.toString().equals(dir) 	|| 
				ENE.toString().equals(dir)	|| ESE.toString().equals(dir) 	|| WNW.toString().equals(dir) 	|| WSW.toString().equals(dir);
	}
	

	public static EOrientation getOrientationFromAngle (double angle) {
		double emiDelta  = (N.getAngle()-E.getAngle()) / 8; // 11.25;
		angle = ((angle % 360) + 360) % 360;
		if (angle-emiDelta <= E.getAngle() || angle-emiDelta > ESE.getAngle()) 
            return E;
		if (angle-emiDelta <= ENE.getAngle() && angle+emiDelta > ENE.getAngle()) 
            return ENE;
		if (angle-emiDelta <= NE.getAngle() && angle+emiDelta > NE.getAngle()) 
            return NE;
		if (angle-emiDelta <= NNE.getAngle() && angle+emiDelta > NNE.getAngle()) 
            return NNE;
		if (angle-emiDelta <= N.getAngle() && angle+emiDelta > N.getAngle()) 
            return N;
		if (angle-emiDelta <= NNW.getAngle() && angle+emiDelta > NNW.getAngle()) 
            return NNW;
		if (angle-emiDelta <= NW.getAngle() && angle+emiDelta > NW.getAngle()) 
            return NW;
		if (angle-emiDelta <= WNW.getAngle() && angle+emiDelta > WNW.getAngle()) 
            return WNW;
		if (angle-emiDelta <= W.getAngle() && angle+emiDelta > W.getAngle()) 
            return W;
		if (angle-emiDelta <= WSW.getAngle() && angle+emiDelta > WSW.getAngle()) 
            return WSW;
		if (angle-emiDelta <= SW.getAngle() && angle+emiDelta > SW.getAngle()) 
            return SW;
		if (angle-emiDelta <= SSW.getAngle() && angle+emiDelta > SSW.getAngle()) 
            return SSW;
		if (angle-emiDelta <= S.getAngle() && angle+emiDelta > S.getAngle()) 
            return S;
		if (angle-emiDelta <= SSE.getAngle() && angle+emiDelta > SSE.getAngle()) 
            return SSE;
		if (angle-emiDelta <= SE.getAngle() && angle+emiDelta > SE.getAngle()) 
            return SE;
		if (angle-emiDelta <= ESE.getAngle() && angle+emiDelta > ESE.getAngle()) 
            return ESE;

		return null;
	}
		
}
