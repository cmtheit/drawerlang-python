export CLASSPATH="/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar:."
antlr -o parser/test Drawer.g4
javac parser/test/*.java
cd parser/test
java org.antlr.v4.gui.TestRig Drawer prog -gui -tree $@ 
cd ../../