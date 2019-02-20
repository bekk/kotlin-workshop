package dataClasses;

public class Solution {

    public static JavaWine task1(String name, int year, String winery, int score) {
        return new JavaWine(name, year, winery, score);
    }

    public static JavaWine task2(JavaWine javaWine){
        javaWine.setName(javaWine.getName() + "wine");
        javaWine.setScore(javaWine.getScore() + 1);
        return javaWine;
    }
}
