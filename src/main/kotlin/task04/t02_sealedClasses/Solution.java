package task04.t02_sealedClasses;

public class Solution {

    static class Result {}
    public static class Success extends Result {
        private final String message;
        public Success(String message) {
            this.message = message;
        }
        public String getMessage() {
            return message;
        }
    }

    public static class Error extends Result {
        private final Exception exception;
        public Error(Exception exception) {
            this.exception = exception;
        }
        public Exception getException() {
            return exception;
        }
    }

}