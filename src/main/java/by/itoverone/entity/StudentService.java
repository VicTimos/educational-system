package by.itoverone.entity;
    import java.util.*;
    import java.util.stream.Collectors;

public class StudentService {

        public static Student[] getStudents(Scanner st) {
            System.out.println("Input number of students: ");
            int number = st.nextInt();
            Student[] students = new Student[number];
            Journal.setJournal(new HashMap<>());
        for (int i = 0; i < number; i++) {
                System.out.println("Type in student name: ");
                String name = st.next();
                System.out.println( "Type in student age : ");
                int age = st.nextInt();
                System.out.println("Students Gender " + name + " : ");
                String gender = st.next();
                System.out.println("Students ID " + name + " : ");
                int id = st.nextInt();
                Journal.addGradesByStudentId(id, 5.0 + i * 0.1, 7.5 + i * 0.1, 2.4 + i * 0.1, 6.8 + i * 0.1, 8.7 + i * 0.1, 4.5 + i * 0.1);
                double averageGrade = Journal
                        .getGradesByStudentId(id)
                        .stream()
                        .mapToDouble(el -> el)
                        .sum()
                        / Journal.getGradesByStudentId(id).size();
                students[i] = new Student(id, name, gender, age, averageGrade);
            }
            for (int i = 0; i < number; i++) {
                System.out.println("I'm a student, my name is "
                        + students[i].getName() + " My Age is "
                        + students[i].getAge() + " years. My Gender: "
                        + students[i].getGender() + ". My ID: "
                        + students[i].getID() +"My average Grade is: "
                        + students[i].getAverageGrade());
            }
            return students;
        }

        public static Student[] printStudent(Student[] students) {
            System.out.println();
            System.out.println("Students with average grade above 7: ");
            for (Student student : students) {
                if (student.getAverageGrade() > 7) {
                    System.out.println(student.getName() + " " + student.getAverageGrade());
                }
            }
            return students;
        }
    }
