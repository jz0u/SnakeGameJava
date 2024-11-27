package gameobjects;

import res.Constants;
import res.Movement;

public class SnakeObject extends GameObject {
    // Current direction of snake movement
    private Movement currentDirection;

    public SnakeObject() {
        super(Constants.SnakeStartingPosition.ROW, Constants.SnakeStartingPosition.COL);
        setName("Snake");
        currentDirection = Movement.UP;  // Snake starts moving upward
    }

    public void move(Movement newDirection) {
        // Only change direction if it's not opposite to current direction
        if (!isOpposite(newDirection)) {
            currentDirection = newDirection;
            // Update position based on direction
            setX(getX() + newDirection.getDeltaX());
            setY(getY() + newDirection.getDeltaY());
        }
    }

    // Check if new direction is opposite to current direction
    private boolean isOpposite(Movement movement) {
        return (currentDirection == Movement.UP && movement == Movement.DOWN) ||
                (currentDirection == Movement.DOWN && movement == Movement.UP) ||
                (currentDirection == Movement.LEFT && movement == Movement.RIGHT) ||
                (currentDirection == Movement.RIGHT && movement == Movement.LEFT);
    }

    @Override
    public String toString() {
        return "S";  // Snake representation on the board
    }
}