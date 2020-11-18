grammar IsiLang;

prog: 'programa' declara? bloco FDP;

declara: 'declare' ID (',' ID)* FIM;

bloco: cmd+;

cmd: cmdLeitura
    |cmdEscrita
    |cmdExpr
    |cmdIf
    |cmdEnq
    ;
cmdLeitura: 'leia' AP ID FP FIM;

cmdEscrita: escreveID
          | escreveTexto
          ;

escreveID: 'escreva' AP ID FP FIM;

escreveTexto: 'escreva' AP TEXTO FP FIM;

cmdIf: SE AP compara FP
       ENTAO  AC ifBody=bloco FC
       (SENAO AC elseBody=bloco FC)?
     ;

cmdEnq: ENQ AP compara FP
        FACA AC bloco FC
      ;

cmdExpr: ID ATTR expr FIM;

compara: left=expr OP_REL right=expr;

expr: termo in_termo*;

in_termo: OP_SS termo;

termo: fator in_fator*;

in_fator: OP_DM fator;

fator: NUM | ID | AP expr FP;

SE: 'se';

ENTAO: 'entao';

SENAO: 'senao';

ENQ: 'enquanto';

FACA: 'faça';

FDP: 'fimprog.';

FIM: '.';

ATTR: ':=';

AP: '(';

FP: ')';

AC: '{';

FC: '}';

OP_SS: '+' | '-';

OP_DM: '/' | '*';

OP_REL: '<' | '>' | '<=' | '>=' | '!=' | '==';

TEXTO: '"' [a-zA-Z0-9' ]+ '"';

NUM: '-'?[0-9]+('.'[0-9]+)?;

ID: [a-zA-Z_][a-zA-Z_0-9]*;

WS: [ \t\r\n]+ -> skip;

