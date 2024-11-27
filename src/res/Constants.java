package res;

public final class Constants {
    private Constants() {
        throw new AssertionError("Constants class should not be instantiated");
    }

    public static final class BoardSize {
        public static final int ROW = 10;
        public static final int COL = 10;
    }

    public static final class SnakeStartingPosition {
        public static final int ROW = BoardSize.ROW / 2;
        public static final int COL = BoardSize.COL / 2;
    }
}
