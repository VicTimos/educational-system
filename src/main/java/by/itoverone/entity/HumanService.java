package by.itoverone.entity;

import java.util.Arrays;
import java.util.Scanner;

public class HumanService {

    public static Human[] getHumans(Scanner st) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Input number of Humans:");
        int numberHumans = scr.nextInt();
        Human[] humans = new Human[numberHumans];
        for (int i = 0; i < numberHumans; i++) {
            System.out.println("Input Name:");
            String name = scr.nextLine();
            humans[i] = new Human(name);
        }
        scr.close();
        return humans;
    }

    public static Human[] findByFirstLetter(Human[] humans, String letter) {
        Human[] newHumans = new Human[]{};
        for (Human human : humans) {
            if (human.getName().startsWith(letter)) {
                Human[] newHumansTemp = new Human[newHumans.length + 1];
                for (int i = 0; i < newHumans.length; i++) {
                    newHumansTemp[i] = newHumans[i];
                }
                newHumansTemp[newHumansTemp.length - 1] = human;
                newHumans = newHumansTemp;
            }
        }
        return newHumans;
    }

    public static Human[] sortingByName(Human[] humans) {
        for (int i = 0; i < humans.length; i++) {
            for (int j = i; j < humans.length - 1; j++) {
                if (humans[i].getName().compareTo(humans[j + 1].getName()) > 0) {
                    Human comp = humans[i];
                    humans[i] = humans[j + 1];
                    humans[j + 1] = comp;
                }
            }
        }
        return humans;
    }

}