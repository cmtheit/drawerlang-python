from turtle import *
import math

class TurtleDrawer:
    def __init__(self, on_close = None):
        self.__origin = (0, 0)
        self.__pos = (0, 0)
        self.__rot = 0
        self.__scale = (1, 1)
        self.__pixsize = 1
        height = 800
        width = 800
        screen = Screen()
        screen.setup(width, height)
        screen.setworldcoordinates(0, height, width, 0)
        if on_close is None:
            on_close = screen.bye
        root = screen.getcanvas().winfo_toplevel()
        root.protocol("WM_DELETE_WINDOW", on_close)
        self.__screen = screen
        self.__screen.bgcolor('white')
        turtle = Turtle()
        turtle.speed(1)
        self.__turtle = turtle
        self.color = (200, 0, 0)

    @property
    def originX(self):
        return self.__origin[0]

    @property
    def originY(self):
        return self.__origin[1]

    @property
    def origin(self):
        return self.__origin

    @origin.setter
    def origin(self, value):
        self.__origin = value

    @property
    def pos(self):
        return self.__pos

    @pos.setter
    def pos(self, value):
        self.__turtle.penup()
        self.__turtle.setposition(value[0], value[1])
        self.__turtle.pendown()
        self.__pos = value

    @property
    def rot(self):
        return self.__rot

    @rot.setter
    def rot(self, value):
        self.__rot = value

    @property
    def scaleX(self):
        return self.__scale[0]

    @property
    def scaleY(self):
        return self.__scale[1]

    @property
    def scale(self):
        return self.__scale

    @scale.setter
    def scale(self, value):
        self.__scale = value

    @property
    def color(self):
        return self.__color

    @property
    def pixsize(self):
        return self.__pixsize

    @pixsize.setter
    def pixsize(self, value):
        self.__pixsize = value

    @color.setter
    def color(self, value):
        self.__color = (value[0] / 255, value[1] / 255, value[2] / 255)
        self.__turtle.color(self.__color)

    def draw(self, x, y):
        self.pos = (
            x * self.scaleX * math.cos(self.rot) + y * self.scaleY * math.sin(self.rot) + self.originX,
            -x * self.scaleX * math.sin(self.rot) + y * self.scaleY * math.cos(self.rot) + self.originY
        )
        self.__turtle.dot(self.pixsize)

