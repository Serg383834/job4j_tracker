package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String programmLanguage;

    public Programmer(String name, String surname, String education, String birthday, String speciality) {
        super(name, surname, education, birthday, speciality);
        this.programmLanguage = programmLanguage;
    }

    public String getname() {
        return super.getName();
    }
}
