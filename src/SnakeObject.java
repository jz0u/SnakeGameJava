public class SnakeObject extends GameObject{

    public SnakeObject(){
        super(Constants.SnakeStartingPosition.ROW,Constants.SnakeStartingPosition.COL);
        setName("Snake");
    }
    @Override
    public String toString(){
        return "S";
    }
}
