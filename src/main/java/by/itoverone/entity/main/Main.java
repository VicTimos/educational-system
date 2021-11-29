package by.itoverone.entity.main;

import by.itoverone.entity.*;

import java.util.*;

public class Main {

    /*
    Human
    boolean lambda(String string);

    HumanImpl implements Human
    boolean lambda(String string) {
        string = string.toUpperCase(Locale.ROOT));
        return string.equals("VASYA");
    }

    ...
    Human human = new HumanImpl();
    boolean result = human.lambda(() -> {
        String string = "Va";
        String string2 = "sya";
        return string + string2;
    });
    */

    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Student[] students = StudentService.getStudents(st);
        Student[] printStudent = StudentService.printStudent(students);
        for (Student student : printStudent) {
            System.out.println(student.getAverageGrade());
        }

        Human[] humans = HumanService.getHumans(st);
        Human[] sort = HumanService.sortingByName(humans);

        Programmer[] programmers = ProgrammerService.getProgrammers(st);

        Human human1 = new Human("George");
        Human human2 = new Human("George");
        Human human3 = new Human("Paul");

        System.out.println("First and second human names are the same : " + human1.equals(human2) + " !");
        System.out.println();

        Student student1 = new Student(7);
        Student student2 = new Student(8);
        Student student3 = new Student(10);
        System.out.println();

        Programmer programmer1 = new Programmer("Java");
        Programmer programmer2 = new Programmer("Python");
        Programmer programmer3 = new Programmer("Java");
        programmer1.setAge(20);
        programmer3.setAge(20);
        System.out.println("Programming language of first and third programmist are the same: " + programmer1.equals(programmer3) + " !");
        System.out.println();
        List<Human>humanList = new ArrayList<>();
        Human a = new Human(1,"aaa","a",20);
        Human b = new Human(2,"bbb","b",25);
        Human c = new Human(3,"bbb","b",25);
        humanList.add(a);
        humanList.add(b);
        humanList.add(c);
        Human aFromList = humanList.get(0);
        Human bFromList = humanList.get(1);
        Human cFromList = humanList.get(2);
        System.out.println(aFromList);
        System.out.println(bFromList);
        System.out.println(cFromList);
    }
}