package by.itoverone.entity;

import java.util.Locale;
import java.util.Objects;

public class Human {

    private int id;
    private String name;
    private String gender;
    private int age;

    public Human (String name){
        this.name = name;
    }

    // Constructor Declaration of Class
    public Human(int id, String name, String gender, int age) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Human() {
    }

    // method 1
    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    // method 2
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // method 3
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // method 4
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getProgrammingLanguage() {
        return null;
    }

    @Override
    public boolean equals(Object o){
        if (this==o)
            return true;
        if (o==null|| getClass()!=o.getClass())
            return false;
        Human human = (Human) o;
        return id == human.id
                && gender == null || (gender.equals(human.gender)
                && age == human.age
                && name == null || name.equals(human.name));
    }

    @Override
    public int hashCode() {
        return 2548
                + this.id
                + (this.name == null ? 0 : this.name.hashCode())
                + (this.gender == null ? 0 : this.gender.hashCode())
                + this.age;
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + "\"" + // " and " - are delimiters for the string, but \" means that this is not a delimiter but the part of a string
                ", gender='" + gender + "\"" +
                ", age=" + age +
                '}';
    }
}