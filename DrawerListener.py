from Interpreter import Interpreter
from SymbolTable import SymbolTable
from parser.DrawerListener import DrawerListener as DrawerBaseListener
import math

from parser.DrawerParser import DrawerParser

class DrawerListener(DrawerBaseListener):
  def __init__(self, interpreter: Interpreter):
    super().__init__()
    self.interpreter = interpreter

  def enterProg(self, ctx):
    ctx.table = SymbolTable({
      'pi': math.pi,
      'cos': math.cos,
      'sin': math.sin,
      'abs': abs,
      'log': math.log,
      'exp': math.exp,
      'sqrt': math.sqrt,
      'tan': math.tan,
    })

  def enterEveryRule(self, ctx):
    print('enter', ctx.getText())
    return super().enterEveryRule(ctx)
  
  def exitExpr(self, ctx):
    ctx.getValue = lambda: ctx.getChild(0).getValue()
  
  def exitNopExpr(self, ctx):
    ctx.getValue = lambda: ctx.getChild(0).getValue()
  
  def exitValueExpr(self, ctx):
    ctx.getValue = lambda: ctx.value().getValue()

  def exitWrappedExpr(self, ctx):
    ctx.value = ctx.expr().value
  
  def exitFuncCallExpr(self, ctx):
    ctx.value = ctx.table[ctx.ID().getText()](ctx.expr().value)
  
  def exitSigExpr(self, ctx):
    ctx.value = ctx.expr().value if ctx.SIG().getText() == '+' else -ctx.expr().value
  
  def exitForStat(self, ctx):
    initValue = ctx.expr(0).value
    endValue = ctx.expr(1).value
    step = ctx.expr(2).value
    hasVariable = ctx.ID().getText()
    if hasVariable:
      # 这里的 ctx.table 能直接访问到 enterProg 中的 ctx.table
      ctx.table.push()
      ctx.table[ctx.ID().getText()] = initValue
    while initValue < endValue:
      xValue = ctx.expr(3).getValue()
      yValue = ctx.expr(4).getValue()
      self.interpreter.draw(xValue, yValue) 
      ctx.table[ctx.ID().getText()] = initValue
      initValue += step

  def exitOp1Expr(self, ctx):
    ctx.value = ctx.op2Expr().value
    match (ctx.OP1().getText()):
      case '+':
        ctx.value += ctx.op2Expr().value
      case '-':
        ctx.value -= ctx.op2Expr().value
  
  def exitOp2Expr(self, ctx):
    ctx.value = ctx.op2Expr().value
    match (ctx.OP2().getText()):
      case '*':
        ctx.value *= ctx.nopExpr().value
      case '/':
        ctx.value /= ctx.nopExpr().value
  
  def exitValue(self, ctx):
    ctx.getValue = lambda: float(ctx.NUM().getText()) if ctx.NUM() else ctx.table[ctx.ID().getText()]

  def exitColorStat(self, ctx):
    self.interpreter.color(ctx.color().getText())

  def exitScaleStat(self, ctx):
    self.interpreter.scale(ctx.x, ctx.y)

  def exitDrawStat(self, ctx):
    self.interpreter.draw(ctx.x, ctx.y)

  def exitOriginStat(self, ctx):
    self.interpreter.origin(ctx.x, ctx.y)

  def exitRotStat(self, ctx):
    self.interpreter.rotate(ctx.angle)
  
  def exitProg(self, ctx):
    print(ctx.a)
  
__all__ = ['DrawerListener']