package task10.extensions;

class SimpleStringUtils {
    public static String removeWhiteSpace(String input) {
        return input.replaceAll(" ", "");
    }

    public static Boolean validate(String input) {
        return input.contains("42");
    }

    public static boolean isEmptyOrNull(String input) {
        return input == null || input.length() == 0;
    }

    public static int multiplyStringAndInt(String input, int multiplyWith) {
        return Integer.parseInt(input) * multiplyWith;
    }
}
