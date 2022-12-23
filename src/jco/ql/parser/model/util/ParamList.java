package jco.ql.parser.model.util;

import java.util.List;

public class ParamList {
	public List<Parameter> parameters = null;
	
	public ParamList(List<Parameter> parameters) {
		this.parameters = parameters;
	}
	
	public boolean contains (String p){
		if (p == null)
			return false;
		if (parameters != null)
			for (int i=0; i<parameters.size();i++)
				if ((parameters.get(i) != null) && (p.equals(parameters.get(i).name)))
					return true;
		return false;
	}
	
	/*public Parameter getParameter(String param) {
		Parameter pa = null;
		if (param == null)
			return pa;
		if (parameters != null)
			for (int i=0; i<parameters.size();i++)
				if ((parameters.get(i) != null) && (param.equals(parameters.get(i).name)))
					return parameters.get(i);
		return pa;
	}*/
}
