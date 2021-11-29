package by.itoverone.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Journal {

    private static Map<Integer, List<Double>> journal;

    public static List<Double> getGradesByStudentId(int id) {
        return journal.get(id);
    }

    public static void addGradeByStudentId(int id, double grade) {
        journal.get(id).add(grade);
    }

    public static void addGradesByStudentId(int id, double... grades) {
        List<Double> gradesByStudent = journal.get(id);

        if (gradesByStudent == null) {
            gradesByStudent = new ArrayList<>();
        }

        for (double grade : grades) {
            gradesByStudent.add(grade);
        }

        journal.put(id, gradesByStudent);
    }

    public static Map<Integer, List<Double>> getJournal() {
        return journal;
    }

    public static void setJournal(Map<Integer, List<Double>> journal) {
        Journal.journal = journal;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "Journal{" +
                "journal=" + journal +
                '}';
    }
}
