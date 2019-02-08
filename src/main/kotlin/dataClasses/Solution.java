package dataClasses;

public class Solution {

    public static Wine test1(String name, int year, String winery, int score) {
        return new Wine(name, year, winery, score);
    }

    public static Wine test2(Wine wine){
        wine.setName(wine.getName() + "wine");
        wine.setScore(wine.getScore() + 1);
        return wine;
    }
}
