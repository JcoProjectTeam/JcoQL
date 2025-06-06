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
	public List<BuildAction> buildActions;
	public KeepingDroppingFuzzySets keepDropFuzzySets;
	public boolean dropGeometry;

	private boolean empty;
	private boolean emptyFuzzyOptions;
	private boolean fuzzyOptionsAllowed;
	
	
	public GenerateSection (boolean fuzzyOptionsAllowed) {
		empty = true;
		emptyFuzzyOptions = true;
		geometricOption = null;
		fuzzySetDefinitions = new ArrayList<FuzzySetDefinition>();
		alphaCuts = new ArrayList<AlphaCut>();
		buildActions = new ArrayList<BuildAction>();
		keepDropFuzzySets = null;
		this.fuzzyOptionsAllowed = fuzzyOptionsAllowed;
		dropGeometry = false;
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
		buildActions.add(buildAction);
	}	
	
	public void addKeepDropFuzzySets (KeepingDroppingFuzzySets keepDropFuzzySets) {
		empty = false;
		emptyFuzzyOptions = false;
		this.keepDropFuzzySets = keepDropFuzzySets;
	}	

	public void addDropGeometry() {
		empty = false;
		dropGeometry = true;
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
		return (buildActions.size() > 0);
	}	
	
	public boolean hasKeepDropFuzzySets() {
		return (keepDropFuzzySets != null);		
	}
	
	public boolean hasDropGeometry () {
		return dropGeometry;
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
			for (int i=0; i<buildActions.size(); i++)
				str += " " + buildActions.get(i).toString();
		if (hasKeepDropFuzzySets())
			str += " " + keepDropFuzzySets.toString() + " ";
		if (hasDropGeometry())
			str += " DROPPING GEOMETRY ";

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
			for (int i=0; i<buildActions.size(); i++)
				str += buildActions.get(i).toMultilineString(level+1);
		if (hasKeepDropFuzzySets())
			str += tabs + keepDropFuzzySets.toString();
		if (hasDropGeometry())
			str += tabs + "DROPPING GEOMETRY";

		return str;
	}


}
