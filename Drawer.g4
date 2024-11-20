grammar Drawer;
/**
 origin is (100, 300); -- 设置原点的偏移量 rot is 0; -- 设置旋转角度(不旋转) scale is (1, 1); -- 设置横坐标和纵坐标的比例 for T
 from 0 to 200 step 1 draw (t, 0); -- 横坐标的轨迹（纵坐标为0） for T from 0 to 150 step 1 draw (0, -t); --
 纵坐标的轨迹（横坐标为0） for T from 0 to 120 step 1 draw (t, -t); -- 函数f(t)=t的轨迹 不区分大小写
 */

// parser rules

options {
	caseInsensitive = true;
}

prog: (stat ';')*;
stat:
	originStat
	| rotStat
	| scaleStat
	| colorStat
	| forStat
	| drawStat;
originStat: 'origin' 'is' '(' NUM ',' NUM ')';
rotStat: 'rot' 'is' NUM;
scaleStat: 'scale' 'is' '(' NUM ',' NUM ')';
colorStat: 'color' 'is' ID;
forStat:
	('for' ID)? 'from' expr 'to' expr 'step' expr 'draw' '(' expr ',' expr ')';
drawStat: 'draw' '(' expr ',' expr ')';
value: NUM | ID;
expr: nopExpr | op1Expr;
nopExpr: valueExpr | wrappedExpr | funcCallExpr | sigExpr;
valueExpr: value;
wrappedExpr: '(' expr ')';
funcCallExpr: ID '(' expr ')'; // 函数调用
sigExpr: SIG expr;
op1Expr: op1Expr OP1 op2Expr | op2Expr;
op2Expr: op2Expr OP2 nopExpr | nopExpr;

SIG: '+' | '-';
OP1: '+' | '-';
OP2: '*' | '/';
ID: [a-z_]+ [a-z0-9_]*;
NUM: ([1-9][0-9]* | '0') ( '.' [0-9]+)?;
WS: [ \t\r\n]+ -> skip;
COM: ('//' | '--') .*? '\n' -> skip;