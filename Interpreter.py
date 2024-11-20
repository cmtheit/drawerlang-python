from Drawer import Drawer

class Interpreter:
  def __init__(self):
    self.drawer = Drawer()

  def origin(self, x: float, y: float):
    self.drawer.originX = x
    self.drawer.originY = y
  
  def rotate(self, angle: float):
    self.drawer.rot = angle

  def scale(self, x: float, y: float):
    self.drawer.scaleX = x
    self.drawer.scaleY = y

  def color(self, color: str):
    self.drawer.color = color

  def draw(self, x: float, y: float):
    self.drawer.draw(x, y)

__all__ = ['Interpreter']