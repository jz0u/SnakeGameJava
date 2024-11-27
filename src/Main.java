import gameobjects.FoodObject;
import gameobjects.SnakeObject;
import res.Movement;
import board.GameBoard;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize game components
        Scanner scanner = new Scanner(System.in);
        final GameBoard snakeBoard = new GameBoard();
        final SnakeObject snake = new SnakeObject();
        final FoodObject food = new FoodObject(0,0);



        // Test snake movement
        snakeBoard.addFood(food);
        snakeBoard.refresh(snake);  // Initial position

        boolean running = true;
        while(running){

            System.out.println("Enter direction (UP/DOWN/LEFT/RIGHT) or 'quit' to exit:");
            String input = scanner.nextLine().toUpperCase();

            switch (input) {
                case "UP":
                    snake.move(Movement.UP);
                    break;
                case "DOWN":
                    snake.move(Movement.DOWN);
                    break;
                case "LEFT":
                    snake.move(Movement.LEFT);
                    break;
                case "RIGHT":
                    snake.move(Movement.RIGHT);
                    break;
                case "QUIT":
                    running = false;
                    break;
                default:
                    System.out.println("Invalid input! Use UP, DOWN, LEFT, RIGHT, or QUIT");
                    continue;
            }

            if (running) {
                snakeBoard.refresh(snake);
            }
        }
        scanner.close();
        System.out.println("Game Over!");

        }


    }
