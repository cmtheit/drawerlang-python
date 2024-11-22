GRAMMAR_FILE := Drawer.g4
SRC := src/drawer/*.py

parser:
	poetry run antlr4 -Dlanguage=Python3 -no-visitor -listener $(GRAMMAR_FILE) -o src/drawer/parser

tsparser:
	poetry run antlr4 -Dlanguage=TypeScript -no-visitor -listener $(GRAMMAR_FILE) -o src/drawer/parser/ts

app: parser
	nuitka --standalone src/cli/main.py

