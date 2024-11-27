package gameobjects;

public class EmptyTile extends GameObject {
    public EmptyTile() {
        super(0, 0);  // Position doesn't matter for empty tiles
    }

    @Override
    public String toString() {
        return ".";
    }
}