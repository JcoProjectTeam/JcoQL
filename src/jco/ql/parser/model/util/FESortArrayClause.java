package jco.ql.parser.model.util;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class FESortArrayClause  extends FEInternalClause {
	public List<String> sourceArrayList;
	public List<String> indexList;
	public List<SortField> sortingFieldList;
	public List<String> targetArrayList;

	public FESortArrayClause () {
		feicType = SORT_CLAUSE;
		sourceArrayList = new ArrayList<String>() ;
		indexList= new ArrayList<String>() ;
		sortingFieldList = new ArrayList<SortField>() ;
		targetArrayList = new ArrayList<String>() ;
	}
	
	
	public int getSourceArrayNdx (String array) {
		if (array != null)
			for (int i=0; i< sourceArrayList.size(); i++)
				if (array.equals(sourceArrayList.get(i)))
					return i;
		return -1;
	}
	
	public boolean hasArray (String array) {
		return getIndex(array) != -1;
	}

	
	public int getIndex (String ndx) {
		if (ndx != null)
			for (int i=0; i< indexList.size(); i++)
				if (ndx.equals(indexList.get(i)))
					return i;
		return -1;
	}
	
	public boolean hasIndex (String ndx) {
		return getIndex(ndx) != -1;
	}
	public String getSourceArrayFromSortField (SortField sf) {
		String root = sf.field.head();
		int ndx = getIndex (root);
		return sourceArrayList.get(ndx);
	}
	public String getTargetArrayFromSortField (SortField sf) {
		String root = sf.field.head();
		int ndx = getIndex (root);
		return targetArrayList.get(ndx);
	}

	public void linkSourceToTargetArray () {
		for (SortField sf: sortingFieldList) {
			String ndx = sf.field.head();
			for (int i=0; i<indexList.size(); i++)
				if (indexList.get(i).equals(ndx)) {
					sf.sourceArray = sourceArrayList.get(i);
					sf.targetArray = targetArrayList.get(i);
				}
		}
	}
	
	public String toString () {
		StringJoiner sj;
		String str = "SORT ";
		if (sourceArrayList.size() == 1)
			str += indexList.get(0) + " IN " + sourceArrayList.get(0);
		else {
			sj = new StringJoiner(", ", "(", ")");
			for (int i=0; i<sourceArrayList.size(); i++)
				sj.add(indexList.get(i) + " IN " + sourceArrayList.get(i));
			str += sj.toString();
		}
		
		str += " BY ";
		sj = new StringJoiner(", ");
		for (int i=0; i<sortingFieldList.size(); i++) 
			sj.add(sortingFieldList.get(i).toString());

		str += sj.toString();
		
		if (targetArrayList.size() == 1)
			str += " AS " + targetArrayList.get(0);
		else {
			sj = new StringJoiner(", ", " AS (", ")");
			for (int i=0; i<targetArrayList.size(); i++)
				sj.add(targetArrayList.get(i));
			str += sj.toString();
		}
		
		return str;
	}


	@Override
	public String toMultilineString(int level) {
		String tabs = "\n";
		for (int i=0; i<level; i++)
			tabs += "\t";		
		String str = tabs + toString();
		return str;
	}

}
