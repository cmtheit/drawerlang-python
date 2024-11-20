import sys
from antlr4 import *
from Interpreter import Interpreter
from parser.DrawerLexer import DrawerLexer
from parser.DrawerParser import DrawerParser
from DrawerListener import DrawerListener

def parse_drawer_file(file_path):
    # 创建输入流
    input_stream = FileStream(file_path)
    
    # 创建词法分析器
    lexer = DrawerLexer(input_stream)
    
    # 创建词标记流
    stream = CommonTokenStream(lexer)
    
    # 创建语法解析器
    parser = DrawerParser(stream)
    
    # 创建解析树
    tree = parser.prog()
    
    return tree

def main():
    # 检查命令行参数
    if len(sys.argv) < 2:
        print("使用方法: python script.py <input_file>")
        sys.exit(1)
    
    # 获取输入文件路径
    input_file = sys.argv[1]
    
    try:
        # 解析文件
        parse_tree = parse_drawer_file(input_file)

        walker = ParseTreeWalker()
        
        walker.walk(DrawerListener(Interpreter()), parse_tree)

        print('walk end')
    
    except Exception as e:
        print(f"解析出错: {e}")

if __name__ == '__main__':
    main()