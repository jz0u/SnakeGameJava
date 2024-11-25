import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       final GameBoard snakeBoard = new GameBoard();
       final SnakeObject snake = new SnakeObject();

        System.out.println(snake.getSnakeCoordinates());
        snakeBoard.placeGameObject(snake);
        snakeBoard.printBoard();

        ////////////////////////////////////////////////

        snake.move(Movement.Right);

        System.out.println(snake.getSnakeCoordinates());
        snakeBoard.placeGameObject(snake);
        snakeBoard.printBoard();


    }
}