package gameobjects;

import exception.GameExceptions;

public abstract class GameObject {
    // Basic properties for any game object
    private String name;
    private int x;
    private int y;

    public GameObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw GameExceptions.InvalidObjectException.emptyName();
        }
        this.name = name;
    }

    public int getX() { return x; }
    public int getY() { return y; }
    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
}