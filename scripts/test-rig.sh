export CLASSPATH="/opt/homebrew/Cellar/antlr/4.13.2/antlr-4.13.2-complete.jar:."
RIGROOT=tests/testrig
antlr -o $RIGROOT Drawer.g4
javac $RIGROOT/*.java
cd $RIGROOT
java org.antlr.v4.gui.TestRig Drawer prog -gui -tree $@
cd ../../
