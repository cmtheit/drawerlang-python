from turtle import *
import math

class Drawer:
  def __init__(self):
    self.__origin = (0, 0)
    self.__rot = 0
    self.__scale = (1, 1)
    print('try init screen')
    self.__screen = Screen()
    print('init screen ok')
    self.__screen.setup(800, 800)
    self.__screen.bgcolor('white')
    self.__turtle = Turtle()
    print('init turtle ok')
    self.__turtle.speed(0)
    self.color = 'blue'
    print('drawer init')
  
  @property
  def originX(self):
    return self.__origin[0]
  
  @originX.setter
  def origin(self, value):
    self.originX = value

  @property
  def originY(self):
    return self.__origin[1]
  
  @originY.setter
  def origin(self, value):
    self.originY = value
  
  @property
  def rot(self):
    return self.__rot
  
  @rot.setter
  def rot(self, value):
    self.__rot = value

  @property
  def scaleX(self):
    return self.__scale[0]
  
  @scaleX.setter
  def scaleX(self, value):
    self.__scale[0] = value

  @property
  def scaleY(self):
    return self.__scale[1]
  
  @scaleY.setter
  def scaleY(self, value):
    self.__scale[1] = value

  @property
  def color(self):
    return self.__color
  
  @color.setter
  def color(self, value):
    self.__color = value
    self.__turtle.color(value)

  def draw(self, x, y):
    self.__turtle.goto(
      x * self.scaleX * math.cos(self.rot) + y * self.scaleY * math.sin(self.rot) + self.originX,
      -x * self.scaleX * math.sin(self.rot) + y * self.scaleY * math.cos(self.rot) + self.originY
    )
    self.__turtle.dot(1)
  