from threading import Thread
import asyncio
from cli.TurtleDrawer import TurtleDrawer
from drawer import drawer_parse

class Operate:
  pass

class Origin(Operate):
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

class Rotate(Operate):
    def __init__(self, angle: float):
        self.angle = angle

class Scale(Operate):
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

class Color(Operate):
    def __init__(self, color: tuple[int, int, int, int]):
        self.color = color

class Pixsize(Operate):
    def __init__(self, size: float):
        self.size = size

class Draw(Operate):
    def __init__(self, x: float, y: float):
        self.x = x
        self.y = y

class Interpreter:
    def __init__(self):
        self.operates = asyncio.Queue()
        self.drawerThread = Thread(target=asyncio.run, args=(self.start(),))
        self.drawerThread.start()

    async def run(self, code: str):
        operates = drawer_parse(code)
        for operate in operates:
            match operate[0]:
                case 'origin':
                    await self.origin(operate[1], operate[2])
                case 'rotate':
                    await self.rotate(operate[1])
                case 'scale':
                    await self.scale(operate[1], operate[2])
                case 'color':
                    await self.color(operate[1])
                case 'draw':
                    await self.draw(operate[1], operate[2])
                case 'pixsize':
                    await self.pixsize(operate[1])

    async def origin(self, x: float, y: float):
        await self.operates.put(Origin(x, y))

    async def rotate(self, angle: float):
        await self.operates.put(Rotate(angle))

    async def scale(self, x: float, y: float):
        await self.operates.put(Scale(x, y))

    async def color(self, color: str):
        await self.operates.put(Color(color))

    async def pixsize(self, size: float):
        await self.operates.put(Pixsize(size))

    async def draw(self, x: float, y: float):
        await self.operates.put(Draw(x, y))

    async def _end(self):
        await self.operates.put(None)

    async def start(self):
        drawer = TurtleDrawer()
        while True:
            operate = await self.operates.get()
            if isinstance(operate, Origin):
                drawer.origin = (operate.x, operate.y)
            elif isinstance(operate, Rotate):
                drawer.rot = operate.angle
            elif isinstance(operate, Scale):
                drawer.scale = (operate.x, operate.y)
            elif isinstance(operate, Color):
                drawer.color = operate.color
            elif isinstance(operate, Draw):
                drawer.draw(operate.x, operate.y)
            elif isinstance(operate, Pixsize):
                drawer.pixsize = operate.size
            elif operate is None:
                break

__all__ = ['Interpreter']
