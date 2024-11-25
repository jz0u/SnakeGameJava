public class SnakeObject extends GameObject{

    public SnakeObject(){
        super(Constants.SnakeStartingPosition.ROW,Constants.SnakeStartingPosition.COL);
        setName("Snake");
    }

    public void move(Movement direction){
        setX(getX() + direction.getDeltaX());
        setY(getY() + direction.getDeltaY());
    }

    public String getSnakeCoordinates (){
        return "Snake coordinates:" + "(" + this.getX() + ","+ this.getY() + ")";
    }

    @Override
    public String toString(){

        return "S";
    }
}
