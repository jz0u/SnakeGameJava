import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       final GameBoard snakeBoard = new GameBoard();
       final SnakeObject snake = new SnakeObject();


        System.out.println("Snake coordinates: X (row)=" + snake.getX() + ", Y (col)=" + snake.getY());
        snakeBoard.placeGameObject(snake);
        snakeBoard.printBoard();



    }
}