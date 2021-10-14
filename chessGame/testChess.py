import chess

class main:

    def initialize():
        op = 0
        print(board)
        while True:
            if op == 0:
                op = 1
                moveW = input("\nCall the move (whites): ")
                #El movimiento se escribe asi (e2e4) siendo los primeros 2 caracteres la casilla de origen y los ultimos 2 la de destino
                main.moveWhite(moveW)
                
                
            elif op == 1:
                op = 0
                moveB = input("\nCall the move (blacks): ")
                #El movimiento se escribe asi (c7c5) siendo los primeros 2 caracteres la casilla de origen y los ultimos 2 la de destino
                main.moveBlack(moveB)
                
    def moveWhite(coords):
        try:
            board.push_san(coords)
            print(board)
        except:
            print("Illegal Move, try again.")
        
        

    def moveBlack(coords):
        try:
            board.push_san(coords)
            print(board)
        except:
            print("Illegal Move, try again.")
        
board = chess.Board()
main.initialize()