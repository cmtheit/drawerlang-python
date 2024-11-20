// Generated from Drawer.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DrawerParser}.
 */
public interface DrawerListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DrawerParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(DrawerParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(DrawerParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DrawerParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DrawerParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#originStat}.
	 * @param ctx the parse tree
	 */
	void enterOriginStat(DrawerParser.OriginStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#originStat}.
	 * @param ctx the parse tree
	 */
	void exitOriginStat(DrawerParser.OriginStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#rotStat}.
	 * @param ctx the parse tree
	 */
	void enterRotStat(DrawerParser.RotStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#rotStat}.
	 * @param ctx the parse tree
	 */
	void exitRotStat(DrawerParser.RotStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#scaleStat}.
	 * @param ctx the parse tree
	 */
	void enterScaleStat(DrawerParser.ScaleStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#scaleStat}.
	 * @param ctx the parse tree
	 */
	void exitScaleStat(DrawerParser.ScaleStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#forStat}.
	 * @param ctx the parse tree
	 */
	void enterForStat(DrawerParser.ForStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#forStat}.
	 * @param ctx the parse tree
	 */
	void exitForStat(DrawerParser.ForStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#drawStat}.
	 * @param ctx the parse tree
	 */
	void enterDrawStat(DrawerParser.DrawStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#drawStat}.
	 * @param ctx the parse tree
	 */
	void exitDrawStat(DrawerParser.DrawStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DrawerParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(DrawerParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DrawerParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(DrawerParser.ValueContext ctx);
}