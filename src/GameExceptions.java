public class GameExceptions {

    public static class GameException extends RuntimeException {
        public GameException(String message) {
            super(message);
        }
    }


    public static class InvalidObjectException extends GameException {
        public InvalidObjectException(String message) {
            super(message);
        }

        public static InvalidObjectException emptyName() {
            return new InvalidObjectException("Object name cannot be empty or null");
        }
    }
}