package jco.ql.parser.model.util;

/**
 * 
 * @author Zunstraal
 *
 */
public class BuildAction {
	public static final int UNDEFINED = -1;	
	public static final int BUILD_ACTION = 1;	

	public ObjectStructure objectStructure;
	int type;
	
	public BuildAction () {
		objectStructure = null;
		type = UNDEFINED;
		
	}
	public void setObjectStructure (ObjectStructure os) {
		objectStructure = os;
		type = BUILD_ACTION;
	}


	public int getType ()	{
		return type;
	}
	
	public boolean hasObjectStructure () {
		return (objectStructure != null);
	}


	public String toString () {
		String str = "BUILD";
		if (hasObjectStructure())
			str += " " + objectStructure.toString();
		return str;
	}

	public String toMultilineString (int level) {
		String tabs ="\n";
		for (int i=0; i<level; i++)
			tabs += "\t";
		String str = tabs + "BUILD";
		if (hasObjectStructure())
			str += objectStructure.toMultilineString(level);
		return str;
	}

}
