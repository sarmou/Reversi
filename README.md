# Reversi
This project involves the implementation of the game Reversi, played by two players: one human and one computer. The computer's behavior is based on key strategies and algorithms to optimize its (AI's) performance.

# Description 
The Reversi game we developed involves two players, one of whom is a human and the other a machine. Each time, the former decides their moves based on their judgment, while the latter uses the MiniMax algorithm. The MiniMax algorithm works by simulating all possible moves and their consequences, using a decision tree where each node represents a possible game state. The machine player tries to maximize its gain while minimizing the opponent's potential moves. The tree is evaluated by recursively applying the MiniMax function, which alternates between maximizing and minimizing based on whose turn it is. The algorithm also considers the difficulty level, which corresponds to the depth of the decision tree, thereby influencing the AI's foresight and decision-making process. The MiniMax algorithm evaluates each final state based on a utility function that applies to each final state. This function corresponds to the result of executing all available moves, placing them in the tree leaves. The tree is created to serve the algorithm, and with the cost function, it evaluates the state that each move brings about, that is, the leaves. The cost function was formed based on the available information on the internet regarding advantageous strategies that someone should follow to win, assigning each of these the corresponding weight, meaning that the better the move, the higher the number the utility function will assign (keeping in mind that the min scores/points are evaluated with negative numbers).

# How to play 
After downloading the folder ReversiGame compile and run the project:
- Open CMD
- 'cd "path of the folder you just downloaded" '
- 'javac *.java'
- 'java Main.java'

    
The game begins by asking what type of pieces you would like to choose, with the other color being automatically assigned to the computer. Keep in mind that the **max function** is assigned on our implementation to the **black** pieces. The next step is to choose the difficulty of the game and finally you start playing by choosing from your keyboard one of the possible moves until someone wins.  
