package jco.ql.parser.model;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.condition.Condition;
import jco.ql.parser.model.util.ParamList;
import jco.ql.parser.model.util.Parameter;

/**
 * 
 * @author Zunstraal
 *
 */
public class JavascriptFunction extends Instruction {
	public static int NO_BEGIN = 0;
	public static int NO_END = 1;
	public static int WRONG_PAR = 2;
	public static int GOOD_END = 3;
	public static int BAD_END = 4;
	
	public String functionName;
	public List<Parameter> parameters;
	public Condition preCondition;
	public String body;
	
	int np;	// conta parentesi
	int nt;	// n. token
	boolean jsEnd;
		
	public JavascriptFunction (int seq, String fn)  {
		id = JAVASCRIPT_FUNCTION_INSTRUCTION;
		instructionName = "Create Javascript Function";
		sequence = seq;		
		functionName = fn;
		parameters = new ArrayList<Parameter>();
		preCondition = null;
		body = "";		
		np=0;
		nt=0;		
		jsEnd = false;
	}
	
	public void addJavascriptWS (String t) {
		body += t;		
	}
	public int addJavascriptChunck (String t) {
		nt++;
		body += t;
		jsEnd = false;

		if (t.equals("{")) 
			np++;
		if (t.equals("}")) 
			np--;

		if ((nt==1) && !t.equals("{"))
			return NO_BEGIN;

		if (!t.equals("}"))
			return NO_END;

		if (t.equals("}") && (np < 0))
			return WRONG_PAR;

		if (t.equals("}") && (np == 0)) {
			jsEnd = true;
			return GOOD_END;
		}

		return BAD_END;
	}
	
	
	public ParamList getParamList() {
		ParamList pl = new ParamList(parameters);
		return pl;
	}

	
	
	public boolean hasPrecondition () {
		return (preCondition != null);
	}
	

	
	public String toString () {
		String str = instructionName.toUpperCase() +" ";
		str += functionName + " ";
		str += "PARAMETERS ";
		for (int i=0; i<parameters.size()-1;i++)
			str += parameters.get(i).toString() + ", ";
		if (parameters.size() > 0)
			str += parameters.get(parameters.size()-1).toString() + " ";
		if (hasPrecondition())
			str +="PRECONDITION " + preCondition.toString() + " ";
		str +="BODY " + body + "END BODY;";
		return str;
	}
	
	public String toMultilineString () {
		String str = instructionName.toUpperCase() +" ";
		str += functionName + "\n\t";
		str += "PARAMETERS\n";
		for (int i=0; i<parameters.size()-1;i++)
			str += "\t\t" + parameters.get(i).toString() + ",\n";
		if (parameters.size() > 0)
			str += "\t\t" + parameters.get(parameters.size()-1).toString() + "\n";
		if (hasPrecondition())
			str +="\tPRECONDITION" + preCondition.toMultilineString(2) + "\n";
		str +="\tBODY\n\t" + body + "\n\tEND BODY;";

		return str + "\n";
	}

}
