package board;

import gameobjects.EmptyTile;
import gameobjects.GameObject;
import res.Constants;

public class GameBoard {
    private final GameObject[][] board = new GameObject[Constants.BoardSize.ROW][Constants.BoardSize.COL];

    public GameBoard() {
        // Initialize board with empty tiles
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new EmptyTile();
            }
        }
    }

    // Update the game board with new snake position
    public void refresh(GameObject snake) {
        // Clear the board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                board[i][j] = new EmptyTile();
            }
        }

        // Place the snake in its new position
        board[snake.getX()][snake.getY()] = snake;

        // Display the updated board
        printBoard();
    }

    // Print the current state of the board
    public void printBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
