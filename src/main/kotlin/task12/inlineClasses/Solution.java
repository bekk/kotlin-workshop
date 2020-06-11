package task12.inlineClasses;

public class Solution {


    /**
     * Task 1
     *
     * Java does not have inline classes. Therefore we only show an approximation.
     */
    public static final int Minutes(int value) {
        return value;
    }

    /**
     * Task 2
     */
    private static int toMinutes(int hours) {
        return hours * 60;
    }

    /**
     * Task 3
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

    /**
     * Task 4
     */
    class Days {
        int days;

        Days(int days) {
            this.days = days;
        }
    }

    private static int toHours(Days days) {
        return days.days * 24;
    }

    public int registration(String newCustomer) {
        String message = "Welcome, " + newCustomer;
        return new MailScheduler().sendEmail(message, toMinutes(toHours(new Days(4))));
    }


    /**
     * Just for show purposes
     */
    static class MailScheduler {

        public int sendEmail(String message, int delay) {
            System.out.println(message);
            return delay;
        }
    }
}
