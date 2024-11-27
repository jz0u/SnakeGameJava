package gameobjects;

import res.Constants;
import res.Movement;

public class SnakeObject extends GameObject {

    private Movement currentDirection;

    public SnakeObject(){
        super(Constants.SnakeStartingPosition.ROW, Constants.SnakeStartingPosition.COL);
        setName("Snake");
        currentDirection = Movement.UP;
    }

    public void move(Movement direction){
        if(!isOpposite(direction)){
            currentDirection = direction;
            setX(getX() + direction.getDeltaX());
            setY(getY() + direction.getDeltaY());
        }
       /* else{
            setX(getX() + currentDirection.getDeltaX());
            setY(getY() + currentDirection.getDeltaY());
        }*/
    }

    public String getSnakeCoordinates (){
        return "Snake coordinates:" + "(" + this.getX() + ","+ this.getY() + ")";
    }

    @Override
    public String toString(){

        return "S";
    }

    public boolean isOpposite(Movement movement){
        return(currentDirection == Movement.UP && movement == Movement.DOWN) ||
                (currentDirection == Movement.DOWN && movement == Movement.UP) ||
                (currentDirection == Movement.LEFT && movement == Movement.RIGHT) ||
                (currentDirection == Movement.RIGHT && movement == Movement.LEFT);
    }
}
