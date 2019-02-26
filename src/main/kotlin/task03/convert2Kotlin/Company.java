package task03.convert2Kotlin;

/**
 * Intellij lets us
 */

public class Company {
    String name;
    int established;
    String slogan;
    int numberOfEmployees;

    public Company(String name, int established, String slogan, int numberOfEmployees) {
        this.name = name;
        this.established = established;
        this.slogan = slogan;
        this.numberOfEmployees = numberOfEmployees;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
}
