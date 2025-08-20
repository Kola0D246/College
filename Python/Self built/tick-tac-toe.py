#Tick Tac Toe
import numpy as nd

class Game:
    '''Attribute and methods to set rules for the game'''
    def reset():
        global board
        board = nd.zeros((3,3), int)

    def __init__(self, mark, loop):
        self.loop = int(loop)   # num of times game is played
        self.win = 0            # num of games player win 
        
        if mark == 'O':
            self.player = 'O'
            self.bot = 'X'
        elif mark == 'X':
            self.player = 'X'
            self.bot = 'O'
        else:
            raise ValueError("'O' or 'X' only")
        
    def tPlayer(self):
        while True:
            print("Where will you mark your sign:\n\
                [[11 12 13]\n\
                 [21 22 23]\n\
                 [31 32 33]]")
            position = input("Enter the number corresponding to your desire position:")
            if board[position[0]][position[1]] == 0:
                board[position[0]][position[1]] = self.player
                break
            print("The position is already filled. Choose other")

    def tBot(self):
        while True:
            position1 = nd.random.randint(1, 4)
            position2 = nd.random.randint(1, 4)
            if board[position1][position2] == 0:
                board[position1][position2] = self.bot
                break
            print("The position is already filled. Choose other")

    def check():
        for row in board:
            if row[0] == row[1] ==

    def run(self):
        for game in range(self.loop):
            print("Game:", game+1)
            print("Board:\n", board)
            tPlayer()
            check()
            tBot()
            check()


    
    

class Bot:
    '''Opponent'''