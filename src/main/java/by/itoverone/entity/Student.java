package by.itoverone.entity;

import java.util.Objects;

public class Student extends Human {

    // 1 - fields
    // 2 - constructors
    // 3 - methods
    // 4 - equals, hashcode, toString

    private double averageGrade;

    public Student(int name, String id, String gender, int age, double averageGrade) {
        super(name, id, gender, age);
        this.averageGrade = averageGrade;
    }

    public Student(double averageGrade) {
        super();
        this.averageGrade = averageGrade;
    }

    public double getAverageGrade() {
        return averageGrade;
    }
    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Student student = (Student) o;
        return Double.compare(student.averageGrade, averageGrade) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), averageGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "averageGrade=" + averageGrade +
                '}';
    }
}