package by.itoverone.entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HumanServiceTest {

    private Human[] testHumans;

    @BeforeEach
    public void setUp() {
        Human human1 = new Human("Paul");
        Human human2 = new Human("George");
        Human human3 = new Human("Andrew");
        testHumans = new Human[] {human1, human2, human3};
    }

    @Test
    public void testSortingbyname(){
        Human[] sortedHumans = HumanService.sortingByName(testHumans);
        assertEquals(3, sortedHumans.length);
        for (Human human : sortedHumans) {
            System.out.println(human.getName());
        }
    }

    @Test
    public void testFindByFirstLetter() {
        Human[] found = HumanService.findByFirstLetter(testHumans, "G");
        for (Human human : found) {
            System.out.println(human.getName());
        }
    }
}