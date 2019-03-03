package task04.dataClasses;

public class Solution {

    public static JavaWine task1(String name, int year, String winery, int score) {
        return new JavaWine(name, year, winery, score);
    }

    public static JavaWine task2(JavaWine javaWine){
        javaWine.setName(javaWine.getName() + "wine");
        javaWine.setScore(javaWine.getScore() + 1);
        return javaWine;
    }

    public static void task3() {
        JavaWine wine1 = new JavaWine("The Wine", 1992, "The Winery", 10);
        JavaWine wine2 = new JavaWine("The Wine", 1992, "The Winery", 10);

        System.out.println(wine1.equals(wine2));
    }

    public static void task4() {
        // Not implemented
    }

    public static void task5() {
        JavaWine wine = new JavaWine("The Wine", 1992, "The Winery", 10);
        String name = wine.getName();
        int year = wine.getYear();
        String winery = wine.getWinery();
        int score = wine.getScore();

        System.out.println(name);
        System.out.println(year);
        System.out.println(winery);
        System.out.println(score);
    }
}
