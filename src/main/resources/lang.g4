grammar lang;

program     : 'begin' stat+ 'end' ;
stat        : assign | add | print | sub | div | mod | mul;
assign      : 'let' ID 'be' (ID | NUM) ;
add         : 'add' (NUM | ID) 'to' ID;
print       : 'print' (NUM | ID);
sub         : 'sub' (NUM | ID) 'from' ID;
div         : 'div' (NUM | ID) 'from' ID;
mod         : 'mod' (NUM | ID) 'from' ID;
mul         : 'mul' (NUM | ID) 'to' ID;

ID  :   [a-z]+ ;
NUM :   [0-9]+ ;
WS  :   [ \r\t\n]+ -> skip;


