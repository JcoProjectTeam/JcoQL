/* ****************************************
**** Parser JCo-QL Antlr Specification ****
**** V. 4.0.02 - 21.12.2023            ****
**************************************** */

grammar JCoQL;

/* ******************************
**** Syntax rules definition ****
****************************** */

start
	:
		(	getCollectionRule
		|	saveAsRule
		|	joinOfCollectionsRule
		|	filterRule
		|	groupRule
		|	expandRule
		|	mergeCollectionsRule
		|	intersectCollectionsRule
		|	subtractCollectionsRule
		|	useDbRule
		|	trajectoryMatchingRule
		|	createFuzzyOperatorRule
		|	createJavaScriptFunctionRule
		|	getDictionaryRule
		|	lookupFromWebRule
		|	createFuzzyAggregatorRule
		|	createFuzzySetModelRule
		|	createGenericFuzzySetOperatorRule
		|	createJavaFunctionRule
		)* 
		EOF
	;


collectionReferenceRule
	:
		ID (	AT ID	)? (	AS ID	)?
	;


fieldRefRule
	:
		(	FIELD_NAME	)+
	;


buildActionRule
	:
		BUILD objectStructureRule
	;


objectStructureRule
	:
		LBR outputFieldSpecRule (	COMMA outputFieldSpecRule	)* RBR
	;


outputFieldSpecRule
	:
		fieldRefRule (	COLON (	objectStructureRule
				|	factorRule	)	)?
	;


geometricOptionRule
	:
		KEEPING GEOMETRY
	|	SETTING GEOMETRY (	POINT LP fieldRefRule COMMA fieldRefRule RP
			|	AGGREGATE LP fieldRefRule RP
			|	fieldRefRule
			|	TO_POLYLINE LP fieldRefRule RP	)
	;


dropGeometryRule
	:
		DROPPING GEOMETRY
	;


caseClauseRule
	:
		(	CASES
		|	CASE	) (	whereCaseRule	)+ (	othersRule	)?
	;


othersRule
	:
		(	KEEP
		|	DROP	) OTHERS
	;


whereCaseRule
	:
		WHERE orConditionRule (	generateSectionRule	)?
	;


generateSectionRule
	:
		GENERATE (	geometricOptionRule	)? (	checkForFuzzySetRule	)? (	alphaCutRule	)? (	buildActionRule	)? (	keepDropFuzzySetsRule	)? (	dropGeometryRule	)?
	;


orConditionRule
	:
		andConditionRule (	OR andConditionRule	)*
	;


andConditionRule
	:
		notConditionRule (	AND notConditionRule	)*
	;


notConditionRule
	:
		(	NOT	)? predicateRule
	;


predicateRule
	:
		expressionRule (	compareRule
		|	inRangeRule	)?
	|	nullPredicateRule
	|	withPredicateRule
	|	withoutPredicateRule
	|	wukFuzzyPredicateRule
	;


compareRule
	:
		comparatorRule expressionRule
	;


inRangeRule
	:
		INRANGE (	LB
		|	LP	) numericRule COMMA numericRule (	RP
		|	RB	)
	;


nullPredicateRule
	:
		FIELD fieldRefRule (	ISNULL
		|	ISNOTNULL	)
	;


wukFuzzyPredicateRule
	:
		(	WITHIN
		|	KNOWN
		|	UNKNOWN	) FUZZY SETS ID (	COMMA ID	)*
	;


withoutPredicateRule
	:
		WITHOUT fieldRefRule (	COMMA fieldRefRule	)*
	;


withPredicateRule
	:
		WITH (	(	ID
				|	ARRAY
				|	GEOMETRY	)	)? fieldRefRule (	COMMA fieldRefRule	)*
	;


expressionRule
	:
		(	termRule
		|	(	ADD
				|	SUB	) termRule	) (	(	ADD
				|	SUB	) termRule	)*
	;


termRule
	:
		factorRule (	(	MUL
				|	DIV	) factorRule	)*
	;


factorRule
	:
		(	LP orConditionRule RP
		|	fieldRefRule
		|	valueRule
		|	ID LP (	functionParamsRule	)? RP
		|	LB factorRule (	COMMA factorRule	)* RB
		|	specialFunctionRule	) (	EXP factorRule	)?
	;


specialFunctionRule
	:
		MEMBERSHIP_TO LP ID RP
	|	EXTENT LP ID RP
	|	DEGREE LP ID FIELD_NAME? RP
	|	MEMBERSHIP_ARRAY LP (	ALL
			|	ID FROM_ARRAY fieldRefRule
			|	LB ID (	COMMA ID	)* RB	) RP
	|	EXTRACT_ARRAY LP fieldRefRule FROM_ARRAY fieldRefRule RP
	|	IF_ERROR LP restrictedExpressionRule COMMA valueRule RP
	|	TRANSLATE LP restrictedExpressionRule COMMA ID (	COMMA BOOLEAN (	COMMA (	APEX_VALUE
							|	QUOTED_VALUE	)	)?	)? RP
	|	arrayFunctionRule
	;


valueRule
	:
		INT
	|	FLOAT
	|	APEX_VALUE
	|	QUOTED_VALUE
	|	BOOLEAN
	;


arrayFunctionRule
	:
		(	ARRAY_FUNCTION	) LP (	fieldRefRule
		|	LB restrictedExpressionRule (	COMMA restrictedExpressionRule	)* RB	) COMMA ID (	COMMA (	fieldRefRule (	COMMA fieldRefRule	)*
				|	DOCUMENTS COMMA fieldRefRule (	COMMA fieldRefRule	)*	)	)? RP
	;


restrictedExpressionRule
	:
		(	restrictedTermRule
		|	(	ADD
				|	SUB	) restrictedTermRule	) (	(	ADD
				|	SUB	) restrictedTermRule	)*
	;


restrictedTermRule
	:
		restrictedFactorRule (	(	MUL
				|	DIV	) restrictedFactorRule	)*
	;


restrictedFactorRule
	:
		(	LP restrictedExpressionRule RP
		|	fieldRefRule
		|	valueRule
		|	ID LP (	functionParamsRule	)? RP
		|	LB restrictedFactorRule (	COMMA restrictedFactorRule	)* RB
		|	specialFunctionRule	) (	EXP restrictedFactorRule	)?
	;


functionParamsRule
	:
		restrictedExpressionRule (	COMMA restrictedExpressionRule	)*
	;


comparatorRule
	:
		(	EQ
		|	NEQ
		|	LT
		|	GT
		|	LE
		|	GE	)
	;


numericRule
	:
		(	ADD
		|	SUB	)? (	FLOAT
		|	INT	)
	;


checkForFuzzySetRule
	:
		CHECK_FOR ID? FUZZY SET ID USING usingOrConditionRule (	COMMA ID? FUZZY SET ID USING usingOrConditionRule	)*
	;


usingOrConditionRule
	:
		usingAndConditionRule (	OR usingAndConditionRule	)*
	;


usingAndConditionRule
	:
		usingNotConditionRule (	AND usingNotConditionRule	)*
	;


usingNotConditionRule
	:
		(	NOT	)? usingPredicateRule
	;


usingPredicateRule
	:
		LP usingOrConditionRule RP
	|	ID (	LP (	functionParamsRule	)? RP	)?
	|	IF_FAILS LP usingOrConditionRule COMMA numericRule RP
	;


alphaCutRule
	:
		ALPHACUT numericRule ON ID FIELD_NAME? (	COMMA numericRule ON ID FIELD_NAME?	)*
	;


keepDropFuzzySetsRule
	:
		DEFUZZIFY
	|	DROPPING ALL FUZZY SETS
	|	KEEPING ALL FUZZY SETS
	|	DROPPING FUZZY SETS ID (	COMMA ID	)*
	|	KEEPING FUZZY SETS ID (	COMMA ID	)*
	;


addFieldsRule
	:
		ADD_ST FIELDS LBR fieldRefRule COLON insertFieldRule (	COMMA fieldRefRule COLON insertFieldRule	)* RBR
	;


insertFieldRule
	:
		spatialFunctionRule
	|	restrictedFactorRule
	;


spatialFunctionRule
	:
		DISTANCE LP ID RP (	comparatorRule numericRule	)?
	|	ORIENTATION LP (	LEFT
			|	RIGHT	) (	COMMA ID COLON numericRule	)? RP
	|	INCLUDED LP (	LEFT
			|	RIGHT	) RP
	|	MEET
	|	INTERSECT
	;


setFuzzySetsRule
	:
		SET FUZZY SETS (	KEEP (	ALL (	resolvingRule	)?
				|	LEFT
				|	RIGHT	)
		|	addFuzzySetRule (	COMMA addFuzzySetRule	)* (	resolvingRule	)?	)
	;


resolvingRule
	:
		RESOLVING WITH (	AND
		|	OR
		|	FIRST
		|	LAST	)
	;


addFuzzySetRule
	:
		(	LEFT
		|	RIGHT	) (	ALL
		|	ID (	AS ID	)?	)
	|	HOWINCLUDE LP (	LEFT
			|	RIGHT	) RP AS ID
	|	HOWMEET LP (	LEFT
			|	RIGHT	) RP AS ID
	|	HOWINTERSECT LP RP AS ID
	;


getCollectionRule
	:
		GET COLLECTION (	ID (	AT ID	)?
		|	FROM_WEB (	APEX_VALUE
				|	QUOTED_VALUE	)	) SC
	;


getDictionaryRule
	:
		GET DICTIONARY ID AT ID AS ID SC
	;


saveAsRule
	:
		SAVE AS ID (	AT ID	)? SC
	;


lookupFromWebRule
	:
		LOOKUP FROM_WEB (	forEachRule	)+ SC
	;


forEachRule
	:
		FOR EACH orConditionRule CALL expressionRule
	;


joinOfCollectionsRule
	:
		JOIN OF COLLECTIONS collectionReferenceRule COMMA collectionReferenceRule (	ON GEOMETRY spatialFunctionRule	)? (	SET GEOMETRY (	INTERSECTION
				|	RIGHT
				|	LEFT
				|	ALL	)	)? (	addFieldsRule	)? (	setFuzzySetsRule	)? (	caseClauseRule
		|	generateSectionRule	)? (	REMOVE DUPLICATES	)? SC
	;


filterRule
	:
		FILTER (	caseClauseRule
		|	generateSectionRule	) (	REMOVE DUPLICATES	)? SC
	;


groupRule
	:
		GROUP (	groupPartitionRule	)+ (	othersRule	)? SC
	;


groupPartitionRule
	:
		PARTITION orConditionRule BY fieldRefRule (	COMMA fieldRefRule	)* INTO fieldRefRule (	DROP GROUPING FIELDS	)? (	ORDER BY sortingFieldRule (	COMMA sortingFieldRule	)* (	KEEP UNCOMPARABLE	)?	)? (	generateSectionRule	)?
	;


sortingFieldRule
	:
		fieldRefRule TYPE ID (	VERSUS	)?
	;


expandRule
	:
		EXPAND (	unpackRule	)+ (	othersRule	)? SC
	;


unpackRule
	:
		UNPACK orConditionRule ARRAY fieldRefRule TO fieldRefRule
	;


mergeCollectionsRule
	:
		MERGE COLLECTIONS collectionReferenceRule (	COMMA collectionReferenceRule	)+ (	REMOVE DUPLICATES	)? SC
	;


intersectCollectionsRule
	:
		INTERSECT COLLECTIONS collectionReferenceRule COMMA collectionReferenceRule SC
	;


subtractCollectionsRule
	:
		SUBTRACT COLLECTIONS collectionReferenceRule COMMA collectionReferenceRule SC
	;


useDbRule
	:
		USE DB (	ID
		|	APEX_VALUE	) (	AS (	ID
				|	APEX_VALUE	)	)? (	COMMA DB (	ID
				|	APEX_VALUE	) (	AS (	ID
						|	APEX_VALUE	)	)?	)* ON (	DEFAULT SERVER
		|	SERVER (	ID
				|	APEX_VALUE	) (	(	ID
						|	APEX_VALUE	)	)?	) SC
	;


trajectoryMatchingRule
	:
		TRAJECTORY MATCHING collectionReferenceRule COMMA collectionReferenceRule (	trajectoryPartitionRule	)+ (	othersRule	)? SC
	;


trajectoryPartitionRule
	:
		PARTITION orConditionRule (	partitionMatchingRule	)+
	;


partitionMatchingRule
	:
		MATCHING fieldRefRule WRT fieldRefRule THRESHOLD LP ID RP numericRule (	WHERE orConditionRule	)? INTO fieldRefRule (	ADDING fieldRefRule TO INPUT	)? (	MIN_SIMILARITY numericRule	)?
	;


parameterRule
	:
		ID TYPE ID
	;


createJavaScriptFunctionRule
	:
		CREATE JAVASCRIPT FUNCTION ID PARAMETERS parameterRule (	COMMA parameterRule	)* (	PRECONDITION jfOrConditionRule	)? BODY END_BODY SC
	;


createFuzzyOperatorRule
	:
		CREATE FUZZY OPERATOR ID PARAMETERS parameterRule (	COMMA parameterRule	)* (	PRECONDITION jfOrConditionRule	)? EVALUATE jfExpressionRule (	POLYLINE LB LP numericRule COMMA numericRule RP (	COMMA LP numericRule COMMA numericRule RP	)+ RB	)? SC
	;


createFuzzyAggregatorRule
	:
		CREATE FUZZY AGGREGATOR ID PARAMETERS faParameterRule (	COMMA faParameterRule	)* (	PRECONDITION jfOrConditionRule	)? (	faSortRule	)? (	faForAllRule
		|	faDeriveRule	)+ EVALUATE faExpressionRule (	POLYLINE LB LP numericRule COMMA numericRule RP (	COMMA LP numericRule COMMA numericRule RP	)+ RB	)? SC
	;


faForAllRule
	:
		FOR ALL ID IN ID (	LB faExpressionRule COMMA faExpressionRule RB	)? (	LOCALLY faExpressionRule AS ID (	COMMA faExpressionRule AS ID	)*	)? AGGREGATE aggSpecRule (	COMMA aggSpecRule	)*
	;


faDeriveRule
	:
		DERIVE faExpressionRule AS ID
	;


faSortRule
	:
		SORT faArraySortRule (	COMMA faArraySortRule	)*
	;


faArraySortRule
	:
		(	faArrayIndexRule BY faSortFieldRule (	COMMA faSortFieldRule	)* AS ID
		|	LP faArrayIndexRule (	COMMA faArrayIndexRule	)+ RP BY faSortFieldRule (	COMMA faSortFieldRule	)* AS LP ID (	COMMA ID	)+ RP	)
	;


faArrayIndexRule
	:
		ID IN ID
	;


faSortFieldRule
	:
		ID (	fieldRefRule	)? TYPE ID (	VERSUS	)?
	;


aggSpecRule
	:
		(	withSpec	)? faExpressionRule AS ID
	;


withSpec
	:
		WITH (	SUM
		|	PRODUCT
		|	MINIMUM
		|	MAXIMUM	)
	;


faParameterRule
	:
		ID TYPE (	ID
		|	ARRAY	)
	;


jfOrConditionRule
	:
		jfAndConditionRule (	OR jfAndConditionRule	)*
	;


jfAndConditionRule
	:
		jfNotConditionRule (	AND jfNotConditionRule	)*
	;


jfNotConditionRule
	:
		(	NOT	)? jsfPredicateRule
	;


jsfPredicateRule
	:
		jfExpressionRule (	jfCompareRule
		|	inRangeRule	)?
	;


jfCompareRule
	:
		comparatorRule jfExpressionRule
	;


jfExpressionRule
	:
		(	jfTermRule
		|	(	ADD
				|	SUB	) jfTermRule	) (	(	ADD
				|	SUB	) jfTermRule	)*
	;


jfTermRule
	:
		jfFactorRule (	(	MUL
				|	DIV	) jfFactorRule	)*
	;


jfFactorRule
	:
		(	LP jfOrConditionRule RP
		|	INT
		|	FLOAT
		|	APEX_VALUE
		|	QUOTED_VALUE
		|	ID (	LP (	jfFunctionParamsRule	)? RP	)?	) (	EXP jfFactorRule	)?
	;


jfFunctionParamsRule
	:
		jfExpressionRule (	COMMA jfExpressionRule	)*
	;


faExpressionRule
	:
		(	faTermRule
		|	(	ADD
				|	SUB	) faTermRule	) (	(	ADD
				|	SUB	) faTermRule	)*
	;


faTermRule
	:
		faFactorRule (	(	MUL
				|	DIV	) faFactorRule	)*
	;


faFactorRule
	:
		(	LP faExpressionRule RP
		|	INT
		|	FLOAT
		|	APEX_VALUE
		|	QUOTED_VALUE
		|	POS
		|	ID (	faArrayRefRule
				|	LP faFunctionParamsRule RP	)?	) (	EXP faFactorRule	)?
	;


faFunctionParamsRule
	:
		faExpressionRule (	COMMA faExpressionRule	)*
	;


faArrayRefRule
	:
		LB (	faExpressionRule	) RB (	fieldRefRule	)?
	;


createFuzzySetModelRule
	:
		CREATE FUZZY SET MODEL ID DEGREES ID (	COMMA ID	)* (	DERIVED DEGREES ID AS ftExpressionRule (	COMMA ID AS ftExpressionRule	)*	)? (	CONSTRAINT jfOrConditionRule	)? (	fuzzyOperatorDefinitionRule	)* SC
	;


fuzzyOperatorDefinitionRule
	:
		OPERATOR (	OR
		|	AND
		|	NOT	) (	EVALUATE ID AS ftConditionExpressionRule	)+
	;


createGenericFuzzySetOperatorRule
	:
		CREATE ID FUZZY OPERATOR ID PARAMETERS parameterRule (	COMMA parameterRule	)* (	PRECONDITION jfOrConditionRule	)? (	EVALUATE ID AS jfExpressionRule (	POLYLINE LB LP numericRule COMMA numericRule RP (	COMMA LP numericRule COMMA numericRule RP	)+ RB	)?	)+ SC
	;


ftExpressionRule
	:
		(	ftTermRule
		|	(	ADD
				|	SUB	) ftTermRule	) (	(	ADD
				|	SUB	) ftTermRule	)*
	;


ftTermRule
	:
		ftFactorRule (	(	MUL
				|	DIV	) ftFactorRule	)*
	;


ftFactorRule
	:
		LP ftExpressionRule RP
	|	ftValueRule
	|	ID
	|	ID LP (	ftFunctionParamsRule	)? RP
	|	specialFunctionRule
	;


ftValueRule
	:
		INT
	|	FLOAT
	;


ftFunctionParamsRule
	:
		ftExpressionRule (	COMMA ftExpressionRule	)*
	;


ftConditionExpressionRule
	:
		(	ftConditionTermRule
		|	(	ADD
				|	SUB	) ftConditionTermRule	) (	(	ADD
				|	SUB	) ftConditionTermRule	)*
	;


ftConditionTermRule
	:
		ftConditionFactorRule (	(	MUL
				|	DIV	) ftConditionFactorRule	)*
	;


ftConditionFactorRule
	:
		LP ftConditionExpressionRule RP
	|	ftConditionValueRule
	|	ID FIELD_NAME
	|	ID LP (	ftConditionFunctionParamsRule	)? RP
	|	specialFunctionRule
	;


ftConditionValueRule
	:
		INT
	|	FLOAT
	;


ftConditionFunctionParamsRule
	:
		ftConditionExpressionRule (	COMMA ftConditionExpressionRule	)*
	;


createJavaFunctionRule
	:
		CREATE JAVA FUNCTION ID PARAMETERS parameterRule (	COMMA parameterRule	)* (	PRECONDITION jfOrConditionRule	)? CLASS ID (	IMPORT QUOTED_VALUE	)? CLASS BODY END_BODY SC
	;



// ********************
// Token Defintion 
// ********************

fragment LETTER     :	 'A' . . 'Z' | 'a' . . 'z';
fragment DIGIT0     :	 '1' . . '9';
fragment DIGIT      :	 '0' . . '9';
fragment WS         :	 ( ' ' | '\t' | '\r' | '\n' )+;

AND             	:	 'AND';
OR              	:	 'OR';
NOT             	:	 'NOT';
ADDING          	:	 'ADDING';
ADD_ST          	:	 'ADD';
AGGREGATE       	:	 'AGGREGATE';
AGGREGATOR      	:	 'AGGREGATOR';
ALL             	:	 'ALL';
ALPHACUT        	:	 'ALPHACUT';
ARRAY           	:	 'ARRAY';
ARRAY_FUNCTION  	:	 ( 'MIN' | 'MAX' | 'AVG' | 'SUM' ) '_ARRAY';
AS              	:	 'AS';
BODY            	:	 'BODY';
END_BODY        	:	 'END' WS 'BODY';
BOOLEAN         	:	 'TRUE' | 'FALSE';
BUILD           	:	 'BUILD';
BY              	:	 'BY';
CALL            	:	 'CALL';
CASE            	:	 'CASE';
CASES           	:	 'CASES';
CHECK_FOR       	:	 'CHECK' WS 'FOR';
CLASS           	:	 'CLASS';
COLLECTION      	:	 'COLLECTION';
COLLECTIONS     	:	 'COLLECTIONS';
CONSTRAINT      	:	 'CONSTRAINT';
CREATE          	:	 'CREATE';
DB              	:	 'DB';
DEFAULT         	:	 'DEFAULT';
DEFUZZIFY       	:	 'DEFUZZIFY';
DEGREE          	:	 'DEGREE';
DEGREES         	:	 'DEGREES';
DERIVE          	:	 'DERIVE';
DERIVED         	:	 'DERIVED';
DICTIONARY      	:	 'DICTIONARY';
DIRECTION       	:	 'DIRECTION';
DISTANCE        	:	 'DISTANCE';
DOCUMENTS       	:	 'DOCUMENTS';
DROP            	:	 'DROP';
DROPPING        	:	 'DROPPING';
DUPLICATES      	:	 'DUPLICATES';
EACH            	:	 'EACH';
EXPAND          	:	 'EXPAND';
EXTENT          	:	 'EXTENT';
EXTRACT_ARRAY   	:	 'EXTRACT_ARRAY';
EVALUATE        	:	 'EVALUATE';
FIELD           	:	 'FIELD';
FIELDS          	:	 'FIELDS';
FILTER          	:	 'FILTER';
FIRST           	:	 'FIRST';
FOR             	:	 'FOR';
FROM_WEB        	:	 'FROM' WS 'WEB';
FROM_ARRAY      	:	 'FROM' WS 'ARRAY';
FUNCTION        	:	 'FUNCTION';
FUZZY           	:	 'FUZZY';
GENERATE        	:	 'GENERATE';
GEOMETRY        	:	 'GEOMETRY';
GET             	:	 'GET';
GROUP           	:	 'GROUP';
GROUPING        	:	 'GROUPING';
HOWINCLUDE      	:	 'HOW_INCLUDE';
HOWINTERSECT    	:	 'HOW_INTERSECT';
HOWMEET         	:	 'HOW_MEET';
IF_ERROR        	:	 'IF_ERROR';
IF_FAILS        	:	 'IF_FAILS';
IMPORT          	:	 'IMPORT';
INCLUDED        	:	 'INCLUDED';
INPUT           	:	 'INPUT';
INRANGE         	:	 'IN_RANGE';
INTERSECT       	:	 'INTERSECT';
INTERSECTION    	:	 'INTERSECTION';
IN              	:	 'IN';
INTO            	:	 'INTO';
ISNULL          	:	 'IS' WS 'NULL';
ISNOTNULL       	:	 'IS' WS 'NOT' WS 'NULL';
JOIN            	:	 'JOIN';
JAVA            	:	 'JAVA';
JAVASCRIPT      	:	 'JAVASCRIPT';
KEEP            	:	 'KEEP';
KEEPING         	:	 'KEEPING';
KNOWN           	:	 'KNOWN';
LAST            	:	 'LAST';
LEFT            	:	 'LEFT';
LOCALLY         	:	 'LOCALLY';
LOOKUP          	:	 'LOOKUP';
MATCHING        	:	 'MATCHING';
MAXIMUM         	:	 'MAXIMUM';
MEET            	:	 'MEET';
MEMBERSHIP_ARRAY	:	 'MEMBERSHIP_ARRAY';
MEMBERSHIP_TO   	:	 'MEMBERSHIP_TO' | 'MEMBERSHIP_OF';
MERGE           	:	 'MERGE';
MIN_SIMILARITY  	:	 'MIN' WS 'SIMILARITY';
MINIMUM         	:	 'MINIMUM';
MODEL           	:	 'MODEL';
OF              	:	 'OF';
ON              	:	 'ON';
OPERATOR        	:	 'OPERATOR';
ORIENTATION     	:	 'ORIENTATION';
OTHERS          	:	 'OTHERS';
ORDER           	:	 'ORDER' | 'SORTED';
PARAMETERS      	:	 'PARAMETERS';
PARTITION       	:	 'PARTITION';
POINT           	:	 'POINT';
POLYLINE        	:	 'POLYLINE';
POS             	:	 'POS';
PRECONDITION    	:	 'PRECONDITION';
PRODUCT         	:	 'PRODUCT';
RESOLVING       	:	 'RESOLVING';
RIGHT           	:	 'RIGHT';
REMOVE          	:	 'REMOVE';
SAVE            	:	 'SAVE';
SERVER          	:	 'SERVER';
SET             	:	 'SET';
SETS            	:	 'SETS';
SETTING         	:	 'SETTING';
SORT            	:	 'SORT';
SUBTRACT        	:	 'SUBTRACT';
SUM             	:	 'SUM';
TO              	:	 'TO';
TO_POLYLINE     	:	 'TO_POLYLINE';
THRESHOLD       	:	 'THRESHOLD';
TRANSLATE       	:	 'TRANSLATE';
TRAJECTORY      	:	 'TRAJECTORY';
TYPE            	:	 'TYPE';
UNCOMPARABLE    	:	 'UNCOMPARABLE';
UNKNOWN         	:	 'UNKNOWN';
UNPACK          	:	 'UNPACK';
USE             	:	 'USE';
USING           	:	 'USING';
VERSUS          	:	 'DESC' | 'ASC';
WHERE           	:	 'WHERE';
WITH            	:	 'WITH';
WITHIN          	:	 'WITHIN';
WITHOUT         	:	 'WITHOUT';
WRT             	:	 'WRT';

INT             	:	 '0' | DIGIT0 DIGIT*;
FLOAT           	:	 DIGIT0 DIGIT* DOT DIGIT+ | '0' DOT DIGIT+;
ID              	:	 LETTER ( LETTER | DIGIT | '_' )*;
FIELD_NAME      	:	 DOT ( LETTER | DIGIT | TILDE | '_' )+ | DOT '"' ( ~( '"' ) )* '"';

AT              	:	 '@';
EQ              	:	 '=';
NEQ             	:	 '!=';
LE              	:	 '<=';
GE              	:	 '>=';
LT              	:	 '<';
GT              	:	 '>';
DOT             	:	 '.';
ADD             	:	 '+';
SUB             	:	 '-';
MUL             	:	 '*';
DIV             	:	 '/';
EXP             	:	 '^';
COMMA           	:	 ',';
COLON           	:	 ':';
SC              	:	 ';';
LP              	:	 '(';
RP              	:	 ')';
LB              	:	 '[';
RB              	:	 ']';
LBR             	:	 '{';
RBR             	:	 '}';
APEX            	:	 '\'';
QUOTE           	:	 '"';
TILDE           	:	 '~';

WHITE_SPACES    	:	 WS 								{ $channel = HIDDEN; } ;
APEX_VALUE      	:	 '\'' ( ~( '\'' ) )* '\'';
QUOTED_VALUE    	:	 '"' ( ~( '"' ) )* '"';
COMMENT         	:	 '//' ~( '\n' | '\r' )* '\r'? '\n' 	{ $channel = HIDDEN; }
					| 	 '/*' ( options : . )* '*/'			{ $channel = HIDDEN; }
					;

SCAN_ERROR      	:	 .;

