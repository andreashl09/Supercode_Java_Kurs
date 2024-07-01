# SchereSteinPapierDuell

## Overview
**SchereSteinPapierDuell** is a console-based implementation of the classic game Rock-Paper-Scissors (Schere-Stein-Papier in German) where a user competes against the computer. The game includes score tracking, bonus points, and cheering messages to enhance the gaming experience.

## How to Play
1. Run the program.
2. You will be prompted to choose between "Schere" (Scissors), "Stein" (Rock), and "Papier" (Paper) by entering `0`, `1`, or `2` respectively.
3. Enter `3` to end the game.
4. The computer will randomly choose its move.
5. The game will display both choices and determine the winner of the round.
6. Scores are updated and displayed after each round.
7. The game includes bonus points for winning three times in a row.
8. Cheering messages will be displayed after each round, especially when a player is on a winning streak.
9. When you decide to end the game, the final score is displayed, and the winner is announced.

## Code Explanation

### Constants
- `SCHERE`, `STEIN`, `PAPIER`, `BEENDEN`: Represent the possible moves and the option to end the game.
- `USER`, `COMPUTER`, `DRAWN`: Represent the possible outcomes of a round.

### Global Variables
- `userScore`, `computerScore`: Track the scores of the user and computer.
- `counterMoves`: Counts the total number of moves made.
- `bonusPointUser`, `bonusPointComputer`: Track the consecutive wins for the user and computer.
- `drawnPoint`: Tracks the number of drawn rounds.

### Main Method
- Initiates the game and handles user input.
- Manages the game loop which continues until the user chooses to end the game.
- Calls methods to process the user's input, generate the computer's move, and update scores.

### Methods
- `userInput(Scanner scanner)`: Reads and returns the user's input.
- `intIsInRange(int userInt)`: Checks if the user's input is valid.
- `computerRandomInt()`: Generates a random move for the computer.
- `stonePaperScissorSelect(int choiceInt)`: Converts move integers to their string representations.
- `determineTheStatus(int userInt, int computerInt)`: Determines the outcome of a round.
- `countScores(int status)`: Updates scores based on the round's outcome.
- `checkForBonusPoint()`: Checks and awards bonus points for consecutive wins.
- `cheeringSlogan()`: Returns a cheering message, especially when the user is on a winning streak.
- `ClearConsole()`: Clears the console screen using ANSI escape codes.
- `scoreBoard()`: Returns a string representing the current scores.

## Requirements
- Java Development Kit (JDK) installed.
- A console or terminal to run the Java program.

## Running the Program
1. Save the code in a file named `SchereSteinPapierDuell.java`.
2. Open a terminal and navigate to the directory containing the file.
3. Compile the program using `javac SchereSteinPapierDuell.java`.
4. Run the program using `java SchereSteinPapierDuell`.

Enjoy playing SchereSteinPapierDuell and have fun competing against the computer!
