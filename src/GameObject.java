public abstract class GameObject {
    private String name;
    public GameObject(){}

    public String getName(){
        return name;
    }
    public void setName(String name){
        if(name == null || name.trim().isEmpty()){
            throw GameExceptions.InvalidObjectException.emptyName();
        }
        this.name = name ;
    }

}
