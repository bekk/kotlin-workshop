package task04.dataClasses;

import java.util.Objects;

public class JavaWine {

    private String name;
    private int year;
    private String winery;
    private int score;

    public JavaWine(String name, int year, String winery, int score) {
        this.name = name;
        this.year = year;
        this.winery = winery;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getWinery() {
        return winery;
    }

    public void setWinery(String winery) {
        this.winery = winery;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (winery != null ?
                winery.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + score;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        JavaWine that = (JavaWine) obj;

        if (score != that.score)
            return false;
        if (year != that.year)
            return false;
        if (!Objects.equals(name, that.name)) {
            return false;
        }
        return Objects.equals(winery, that.winery);

    }

    @Override
    public String toString() {
        return "JavaWine{" +
                "name='" + name + '\'' +
                ", winery='" + winery + '\'' +
                ", year='" + year + '\'' +
                ", score=" + score +
                '}';
    }
}