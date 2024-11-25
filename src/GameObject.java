public abstract class GameObject {
    private String name;
    private int x;
    private int y;
    public GameObject(){

    }
    public GameObject(int x,int y){
        this.x = x;
        this.y = y;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw GameExceptions.InvalidObjectException.emptyName();
        }
        this.name = name ;
    }

    public int getX(){
        return this.x;

    }
    public int getY(){
        return this.y;

    }
    public void setX(int x){
        this.x = x;

    }
    public void setY(int y){
        this.y = y;

    }

}
