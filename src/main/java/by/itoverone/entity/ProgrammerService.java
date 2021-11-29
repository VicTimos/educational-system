package by.itoverone.entity;

import java.util.Scanner;

public class ProgrammerService {

    public static Programmer[] getProgrammer() {
        Scanner scr = new Scanner(System.in);
        System.out.println("Введите количество программистов: ");
        int numProgrammers = scr.nextInt();
        Programmer[] programmers = new Programmer[numProgrammers];

        scr.nextLine();

        for (int i = 0; i < numProgrammers; i++) {
            System.out.println("Укажите имя: ");
            String name = scr.next();
            programmers[i] = new Programmer(name);
        }
        scr.close();
        return programmers;
    }

    public static Programmer[] languageJava(Programmer[] programmers) {
        Programmer[] newProgrammers = new Programmer[programmers.length];
        int language = 0;
        for (int i = 0; i < getProgrammer().length; i++) {
            if (programmers[i].getProgrammingLanguage().equals("Java")) {
                System.out.println(programmers[i].getName());
            }
        }
        return newProgrammers;
    }

    public static Programmer[] getProgrammers(Scanner st) {
        return new Programmer[0];
    }
}
