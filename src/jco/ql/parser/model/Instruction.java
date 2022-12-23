package jco.ql.parser.model;

/**
 * 
 * @author Zunstraal
 *
 */
public abstract class Instruction {
	public static final int UNDEFINED = -1;	
	public static final int GET_INSTRUCTION = 1;	
	public static final int SET_INTERMEDIATE_INSTRUCTION = 2;	
	public static final int SAVE_INSTRUCTION = 3;	
	public static final int JOIN_INSTRUCTION = 4;	
	public static final int OLD_JOIN_INSTRUCTION = 5;	
	public static final int FILTER_INSTRUCTION = 6;	
	public static final int GROUP_INSTRUCTION = 7;	
	public static final int EXPAND_INSTRUCTION = 8;	
	public static final int MERGE_INSTRUCTION = 9;	
	public static final int INTERSECT_INSTRUCTION = 10;	
	public static final int SUBTRACT_INSTRUCTION = 11;	
	public static final int USEDB_INSTRUCTION = 12;	
	public static final int TRAJECTORY_MATCHING_INSTRUCTION = 13;	
	public static final int FUZZY_OPERATOR_INSTRUCTION = 14;
	public static final int JAVASCRIPT_FUNCTION_INSTRUCTION = 15;
	public static final int GET_DICTIONARY = 16;
	public static final int LOOKUP_FROM_WEB = 17;
	public static final int FUZZY_AGGREGATOR_INSTRUCTION = 18; //!! Aggiunta Invernici
	
	int id;
	int sequence;
	String instructionName;
	
	public Instruction (int seq, String name) {
		id = UNDEFINED;
		sequence = seq;
		instructionName = name;				
	}

	public Instruction (int seq) {
		id = UNDEFINED;
		sequence = seq;
		instructionName = "generic instruction";		
	}
	
	public Instruction () {
		this (0);
	}

	public int getId() {
		return id;
	}

	public int getSeguence() {
		return sequence;
	}

	public String getInstructionName() {
		return instructionName;
	}

	public String toString () {
		return instructionName.toUpperCase();
	}

	abstract public String toMultilineString ();

}
