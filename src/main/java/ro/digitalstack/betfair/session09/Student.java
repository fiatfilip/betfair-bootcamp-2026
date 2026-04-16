package ro.digitalstack.betfair.session09;

public class Student {
    private String name;
    private double grade;

    public Student (String name, double grade) {
        this.name = name;
        this.grade = grade;

    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getStatus() {
        return getGrade() >= 5.0 ? "Graduated" : "Rejected";
    }
}
