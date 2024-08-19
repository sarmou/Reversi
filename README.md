# Reversi
This project involves the implementation of the game Reversi, played by two players: one human and one computer. The computer's behavior is based on key strategies and algorithms to optimize its performance.

# Description 
The Reversi game we developed involves two players: one human and one machine. The human player decides their moves based on their judgment, while the machine uses the MiniMax algorithm. The MiniMax algorithm works by simulating all possible moves and their consequences, using a decision tree where each node represents a possible game state. The machine player tries to maximize its gain while minimizing the opponent's potential moves. The tree is evaluated by recursively applying the MiniMax function, which alternates between maximizing and minimizing based on whose turn it is. The algorithm also considers the difficulty level, which corresponds to the depth of the decision tree, thereby influencing the AI's foresight and decision-making process. The MiniMax algorithm evaluates each final state based on a utility function that applies to each final state. This function corresponds to the result of executing all available moves, placing them in the tree leaves. The tree is created to serve the algorithm, and with the cost function, it evaluates the state that each move brings about, that is, the leaves. The cost function was developed based on available information regarding advantageous strategies for winning, assigning each strategy a corresponding weight. The better the move, the higher the number the utility function will assign, keeping in mind that the Min scores/points are evaluated with negative numbers.

# How to play 
After downloading the ReversiGame folder, compile and run the project as follows:
- Open CMD
- Navigate to the downloaded folder by typing:'cd "path of the folder you just downloaded" '
- Compile the code: 'javac *.java'
- Run the program: 'java Main.java'

    
The game begins by asking you to choose the color of your pieces, with the other color being automatically assigned to the computer. In our implementation, the **max function** is assigned to the **black** pieces. Next, you will choose the difficulty of the game. After that, the game board will be displayed. If you start first, you'll see the available moves and can choose your preferred one. If the computer starts first, it will make the initial move, and then it will be your turn to choose from the available moves. The game will end when one color occupies the entire board or when one of the players has no available moves for two consecutive rounds.
