package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;

import jco.ql.parser.model.fuzzy.AlphaCut;
import jco.ql.parser.model.fuzzy.FuzzySetDefinition;
import jco.ql.parser.model.fuzzy.KeepingDroppingFuzzySets;

public class GenerateSection {
	public GeometricOption geometricOption;
	public List<FuzzySetDefinition> fuzzySetDefinitions;
	public List<AlphaCut> alphaCuts;
	public BuildAction buildAction;
	public KeepingDroppingFuzzySets keepDropFuzzySets;

	private boolean empty;
	private boolean emptyFuzzyOptions;
	private boolean fuzzyOptionsAllowed;
	
	
	public GenerateSection (boolean fuzzyOptionsAllowed) {
		empty = true;
		emptyFuzzyOptions = true;
		geometricOption = null;
		fuzzySetDefinitions = new ArrayList<FuzzySetDefinition>();
		alphaCuts = new ArrayList<AlphaCut>();
		buildAction = null;
		keepDropFuzzySets = null;
		this.fuzzyOptionsAllowed = fuzzyOptionsAllowed;
	}

	
	public void addGeometricOption (GeometricOption geometricOption) {
		empty = false;
		this.geometricOption = geometricOption;
	}
	
	public void addFuzzySetDefinition (FuzzySetDefinition fuzzySetDefinition) {
		empty = false;
		emptyFuzzyOptions = false;
		this.fuzzySetDefinitions.add(fuzzySetDefinition);
	}	
	
	public void addAlphaCut (AlphaCut alphaCut) {
		empty = false;
		emptyFuzzyOptions = false;
		this.alphaCuts.add(alphaCut);
	}	
	
	public void addBuildAction (BuildAction buildAction) {
		empty = false;
		this.buildAction = buildAction;
	}	
	
	public void addKeepDropFuzzySets (KeepingDroppingFuzzySets keepDropFuzzySets) {
		empty = false;
		emptyFuzzyOptions = false;
		this.keepDropFuzzySets = keepDropFuzzySets;
	}	

	
	public boolean hasGeometricOption () {
		return (geometricOption != null);
	}

	public boolean hasFuzzyCheck () {
		return ((fuzzySetDefinitions != null) && (fuzzySetDefinitions.size() > 0));		
	}

	public boolean hasAlphaCut () {
		return ((alphaCuts != null) && (alphaCuts.size() > 0));		
	}

	public boolean hasBuildAction () {
		return (buildAction != null);
	}	
	
	public boolean hasKeepDropFuzzySets() {
		return (keepDropFuzzySets != null);		
	}
	
	public boolean isEmpty () {
		return 	empty;
	}
	public boolean checkFuzzyOptions () {
		return fuzzyOptionsAllowed || emptyFuzzyOptions;
	}
	
	
	public String toString () {
		String str = "GENERATE";
		if (hasGeometricOption())
			str += " " + geometricOption.toString();
		if (hasFuzzyCheck()) {
			str += " CHECK FOR " + fuzzySetDefinitions.get(0).toString();
			for (int i=1; i<fuzzySetDefinitions.size(); i++)
				str += ", " + fuzzySetDefinitions.get(i).toString();
			str += " ";
		}
		if (hasAlphaCut()) {
			str += " ALPHACUT " + alphaCuts.get(0).toString();
			for (int i=1; i<alphaCuts.size(); i++)
				str += ", " + alphaCuts.get(i).toString();
			str += " ";
		}
		if (hasBuildAction())
			str += " " + buildAction.toString();
		if (hasKeepDropFuzzySets())
			str += " " + keepDropFuzzySets.toString() + " ";

		return str;
	}
	
	
	public String toMultilineString (int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";

		String str = tabs + "GENERATE\t";
		tabs += "\t";

		if (hasGeometricOption())
			str += geometricOption.toMultilineString(level+1);
		if (hasFuzzyCheck()) {
			str += tabs + "CHECK FOR ";
			if (fuzzySetDefinitions.size() == 1)
				str += fuzzySetDefinitions.get(0).toString() + ", ";
			else
				for (int i=0; i<fuzzySetDefinitions.size(); i++)
					str += fuzzySetDefinitions.get(i).toMultilineString(level+2) + ", ";
			str += "xxx";
			str = str.replace(", xxx", "");
		}
		if (hasAlphaCut()) {
			str += tabs + "ALPHACUT ";
			if (alphaCuts.size() == 1)
				str += alphaCuts.get(0).toString() + ", ";
			else
				for (int i=0; i<alphaCuts.size(); i++)
					str += tabs + "\t" + alphaCuts.get(i).toString() + ", ";			
			str += "xxx";
			str = str.replace(", xxx", "");
		}
		if (hasBuildAction())
			str += buildAction.toMultilineString(level+1);
		if (hasKeepDropFuzzySets())
			str += tabs + keepDropFuzzySets.toString();

		return str;
	}
}
