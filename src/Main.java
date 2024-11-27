import gameobjects.SnakeObject;
import res.Movement;
import board.GameBoard;

public class Main {
    public static void main(String[] args) {
        // Initialize game components
        final GameBoard snakeBoard = new GameBoard();
        final SnakeObject snake = new SnakeObject();

        // Test snake movement
        snakeBoard.refresh(snake);  // Initial position

        snake.move(Movement.RIGHT);
        snakeBoard.refresh(snake);

        snake.move(Movement.LEFT);
        snakeBoard.refresh(snake);
    }
}