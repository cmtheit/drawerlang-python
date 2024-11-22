import sys
from antlr4 import *
from Interpreter import Interpreter

async def main():
    # 检查命令行参数
    if len(sys.argv) < 2:
        print("使用方法: python script.py <input_file>")
        sys.exit(1)

    # 获取输入文件路径
    input_file = sys.argv[1]

    interpreter = Interpreter()

    with open(input_file, 'r') as f:
        src = f.read()
        await interpreter.run(src)

if __name__ == '__main__':
    import asyncio
    asyncio.run(main())
