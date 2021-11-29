package by.itoverone.entity;

import java.util.Objects;

public class Programmer extends Human {

    private String languageProgramming; // variables are start with the lower case letter

    public Programmer(String name) {
        super(name);
    }

    public Programmer(int id, String name, String gender, int age, String LanguageProgramming) {
        super(id, name, gender, age);
        this.languageProgramming = LanguageProgramming;
    }

    public String getLanguageProgramming() {
        return languageProgramming;
    }

    public void setLanguageProgramming(String languageProgramming) {
        this.languageProgramming = languageProgramming;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Programmer that = (Programmer) o;
        return Objects.equals(languageProgramming, that.languageProgramming);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), languageProgramming);
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "languageProgramming='" + languageProgramming + '\'' +
                '}';
    }
}
