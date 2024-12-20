grammar Uml;

@parser::header {
    package myCompilerPackage;
}

@lexer::header {
    package myCompilerPackage;
}

@members {
    SemanticHandler h = new SemanticHandler();

    public SemanticHandler getHandler() {
        return h;
    }

    @Override
    public void displayRecognitionError(String[] tokenNames, RecognitionException e) {
        // in tokenNames c'è la lista dei token che si sarebbe voluto trovare
        // token che genera l'errore
        Token tk = _input.LT(1); // Modifica per ANTLR 4: usa _input anziché input
        // header e corpo dell'errore gestito automaticamente da ANTLR
        String hdr = getErrorHeader(e);
        String msg = getErrorMessage(e, tokenNames);
        
        // passo tutto all'handler
        h.handleError(tokenNames, tk, e, hdr, msg);
    }
}

/* ***********************************************
            Syntactic Rule definition starts here
************************************************** */ 

start
    : classDefinitionRule* relationsDefinitionRule?
    ;

classDefinitionRule
    : ABSTRACT? CLASS c=ID { h.manageClassName($c.getText()); }
      classCodeRule { h.setClass($c.getText()); }
    ;

relationsDefinitionRule
    : RELATIONS DP LBR relationCodeRule* RBR
    ;

classCodeRule
    : LBR ( (ATTRIBUTE DP attributeDeclarationRule)
          | (OPERATION DP operationDeclarationRule) )* RBR
    ;

relationCodeRule
    : nameRelation=ID nameClass1=ID multiplicityRule relationTypeRule
      nameClass2=ID multiplicityRule (UNDREL infoClass=ID)?
    ;

attributeDeclarationRule
    : v=visibilityRule arrayTypeRule? t=typeRule a=ID d=ID? multiplicityRule? READONLY? SC
      //{ h.attDeclaration(v, $arrayTypeRule.getText(), t, $a.getText(), $d != null ? $d.getText() : null); }
    ;

visibilityRule
    : ( PUBLIC | PROTECTED | PRIVATE | PACKAGE )
    ;

arrayTypeRule
    : ( SET | MULTISET | LIST | ORDEREDSET )
    ;

typeRule
    : ( INT_TYPE | FLOAT_TYPE | LONG_TYPE | DOUBLE_TYPE | BOOLEAN_TYPE | CHAR_TYPE | STRING_TYPE | ID )
    ;

relationTypeRule
    : UNDREL | SXREL | DXREL | INHERITS | SHARED | COMPOSED
    ;

multiplicityRule
    : (MIN n=ID MAX m=ID)
    ;

operationDeclarationRule
    : v=visibilityRule t=typeRule a=ID LP (typeRule ID)* RP
    ;

/* ***********************************************
            Tokens definition part starts here
************************************************** */ 

EQ : '=';
COMP : '==';
NEQ : '!=';
SXREL : '<';
DXREL : '>';
LTE : '<=';
GTE : '>=';
MOD : '%';
ADD : '+';
UNDREL : '-';
MUL : '*';
DIV : '/';
AADD : '++';
SSUB : '--';

DP : ':';
SC : ';';
DOT : '.';
COMMA : ',';
LP : '(';
RP : ')';
LBR : '{';
RBR : '}';
LB : '[';
RB : ']';

ABSTRACT : 'abstract';
BOOLEAN_TYPE : 'boolean';
BYTE : 'byte';
CHAR_TYPE : 'char';
CLASS : 'class';
CONST : 'const';
DOUBLE_TYPE : 'double';
ENUM : 'enum';
EXTENDS : 'extends';
FALSE : 'false';
FINAL : 'final';
FLOAT_TYPE : 'float';
IMPLEMENTS : 'implements';
INHERITS : 'inherits';
INT_TYPE : 'int';
INTERFACE : 'interface';
LONG_TYPE : 'long';
NONUNIQUE : 'non-unique';
NULL : 'null';
ORDER : 'ordered';
PRIVATE : 'private';
PROTECTED : 'protected';
PUBLIC : 'public';
PACKAGE : 'package';
READONLY : 'readOnly';
SET : 'Set';
MULTISET : 'Multi-set';
ORDEREDSET : 'Ordered-set';
LIST : 'List';
SHORT : 'short';
STATIC : 'static';
THROWS : 'throws';
STRING_TYPE : 'String';
TRUE : 'true';
UNIQUE : 'unique';
UNORDERED : 'unordered';
VOID : 'void';
SHARED : 'shared';
COMPOSED : 'composed';
ATTRIBUTE : 'attribute';
RELATIONS : 'relations';
OPERATION : 'operation';
MIN : 'min';
MAX : 'max';

ID : [a-zA-Z_] [a-zA-Z0-9_]*;
INT : [0-9]+;
FLOAT : [0-9]+ '.' [0-9]* EXPONENT? | '.' [0-9]+ EXPONENT? | [0-9]+ EXPONENT;

COMMENT
    :   ( '//' ~[\r\n]* '\r'? '\n'
        | '/*' .*? '*/'
        ) -> channel(HIDDEN)
    ;
WS : [ \t\r\n]+ -> skip;

STRING : '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
CHAR : '\'' ( ESC_SEQ | ~('\''|'\\') ) '\'';

fragment EXPONENT : [eE] [+-]? [0-9]+;
fragment HEX_DIGIT : [0-9a-fA-F];
fragment ESC_SEQ
    : '\\' [btnfr"'\\]
    | UNICODE_ESC
    | OCTAL_ESC
    ;

fragment OCTAL_ESC
    : '\\' [0-3] [0-7] [0-7]
    | '\\' [0-7] [0-7]?
    ;

fragment UNICODE_ESC
    : '\\' 'u' HEX_DIGIT HEX_DIGIT HEX_DIGIT HEX_DIGIT
    ;
