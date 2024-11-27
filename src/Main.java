import gameobjects.SnakeObject;
import res.Movement;
import board.GameBoard;

public class Main {
    public static void main(String[] args) {

       final GameBoard snakeBoard = new GameBoard();
       final SnakeObject snake = new SnakeObject();

        snakeBoard.refresh(snake);

        snake.move(Movement.RIGHT);
        snakeBoard.refresh(snake);

        snake.move(Movement.LEFT);
        snakeBoard.refresh(snake);



    }
}