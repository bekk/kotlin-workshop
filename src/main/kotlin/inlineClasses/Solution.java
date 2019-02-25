package inlineClasses;

public class Solution {


    /**
     * Task 1
     *
     * Java does not have inline classes. Therefore we only show an approximation.
     */
    public static final int toMinutes(int value) {
        return value * 60;
    }

    /**
     * Task 2
     *
     * Yes, we know, this class can only be called from inside the Solution class.
     */
    class Name {

        String name;
        int length;

        public Name(String name) {
            this.name = name;
            this.length = name.length();
        }

        String greet() {
            return "Hello, " + name;
        }

    }


}
