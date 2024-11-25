public enum Movement {
    UP(-1,0),
    Down(1,0),
    Left(0,-1),
    Right(0,1);

    private final int deltaX;
    private final int deltaY;

    Movement(int deltaX, int deltaY) {
        this.deltaX = deltaX;
        this.deltaY = deltaY;
    }

    public int getDeltaX() { return deltaX; }
    public int getDeltaY() { return deltaY; }
}

