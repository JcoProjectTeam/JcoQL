package jco.ql.parser.model.predicate;

/**
 * 
 * @author Zunstraal
 *
 */
public class TranslateFunction extends SpecialFunctionFactor {
	public Expression expression2translate;
	public String dictionary;
	public boolean dictionaryCaseSensitive;
	public String dictionaryTranslateDefault;

	public TranslateFunction(Expression expr, String dict) {
		type = SPECIAL_FUNCTION;
		specialFuntionType = TRANSLATE_FUNCTION;

		expression2translate = expr;
		dictionary = dict;
		dictionaryCaseSensitive = true;
		dictionaryTranslateDefault = null;
	}

	
	public void setCaseSensitive (String caseSensitive) {
		dictionaryCaseSensitive = "true".equalsIgnoreCase(caseSensitive);
	}

	
	public void setDefault (String defaultString) {
		dictionaryTranslateDefault = defaultString;
	}
	
	
	public String toString () {
		String st = "TRANSLATE (" + expression2translate.toString() + ", " + dictionary;
		if (dictionaryCaseSensitive)
			st += ", TRUE";
		else
			st += ", FALSE";
			
		if (dictionaryTranslateDefault != null)
			st += ", " + dictionaryTranslateDefault;
		st += ")";	
		return st;		
	}
}
