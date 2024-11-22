grammar Drawer;
/**
 origin is (100, 300); -- 设置原点的偏移量 rot is 0; -- 设置旋转角度(不旋转) scale is (1, 1); -- 设置横坐标和纵坐标的比例 for T
 from 0 to 200 step 1 draw (t, 0); -- 横坐标的轨迹（纵坐标为0） for T from 0 to 150 step 1 draw (0, -t); --
 纵坐标的轨迹（横坐标为0） for T from 0 to 120 step 1 draw (t, -t); -- 函数f(t)=t的轨迹 不区分大小写 源文件编码 utf-8
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
	| drawStat
	| pixsizeStat;
originStat: 'origin' 'is' '(' x = expr ',' y = expr ')';
rotStat: 'rot' 'is' expr;
scaleStat: 'scale' 'is' '(' x = expr ',' y = expr ')';
colorStat: 'color' 'is' color = colorLit;
pixsizeStat: ('pixsize' | 'pixelsize') 'is' expr;
forStat:
	('for' dec = ID)? 'from' start = expr 'to' end = expr 'step' step = expr 'draw' '(' x = expr ','
		y = expr ')';
drawStat: 'draw' '(' x = expr ',' y = expr ')';
colorLit:
	name = ID
	| ('"' | '\'') name = ID ('"' | '\'')
	| '(' red = expr ',' green = expr ',' blue = expr ')'
	| 'rgb' '(' red = expr ',' green = expr ',' blue = expr ')'
	| 'rgba' '(' red = expr ',' green = expr ',' blue = expr ',' alpha = expr ')'
	| 'hsl' '(' hue = expr ',' saturation = expr ',' lightness = expr ')'
	| 'hsla' '(' hue = expr ',' saturation = expr ',' lightness = expr ',' alpha = expr ')'
	| '#' HEX;
value: NUM | ID;
expr:
	valueExpr
	| wrappedExpr
	| funcCallExpr
	| sigExpr
	| expr op2 = ('*' | '/') expr
	| expr op1 = ('+' | '-') expr;
valueExpr: value;
wrappedExpr: '(' expr ')';
funcCallExpr: ID '(' expr ')'; // 函数调用
sigExpr: sig = ('+' | '-') expr;

ID: [a-z_]+ [a-z0-9_]*;
NUM: ([1-9][0-9]* | '0') ( '.' [0-9]+)?;
HEX:
	[0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f][0-9a-f]
	| [0-9a-f][0-9a-f][0-9a-f];
WS: [ \t\r\n]+ -> skip;
COM: ('//' | '--') .*? '\n' -> skip;
