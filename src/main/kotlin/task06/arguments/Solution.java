package task06.arguments;

public class Solution {

    static class JavaUser {
        private String name = "Vegard";
        private int age = 30;

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public JavaUser(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public JavaUser(String name) {
            this.name = name;
        }

        public JavaUser(int age) {
            this.age = age;
        }

        public JavaUser()  {
        }
    }

    public static class JavaCar {
        private String name;
        private int year;
        private String model;
        private int seats;

        public String getName() {
            return name;
        }

        public int getYear() {
            return year;
        }

        public String getModel() {
            return model;
        }

        public int getSeats() {
            return seats;
        }

        public static class Builder {
            private String name;
            private int year;
            private String model;
            private int seats;


            public Builder() { }

            public Builder withName(String name) {
                this.name = name;
                return this;
            }

            public Builder withYear(int year) {
                this.year = year;
                return this;
            }

            public Builder withModel(String model) {
                this.model = model;
                return this;
            }

            public Builder withSeats(int seats) {
                this.seats = seats;
                return this;
            }

            public JavaCar build() {
                JavaCar car = new JavaCar();
                car.name = this.name;
                car.year = this.year;
                car.model = this.model;
                car.seats = this.seats;
                return car;
            }
        }
    }

}
