package ru.job4j.inheritance;
public class Profession {

    private String name, surname, education, birthday;

    public Profession(String name, String surname, String education, String birthday) {
        this.name = name;
        this.surname = surname;
        this.education = education;
        this.birthday = birthday;
    }

    public Profession() {
    }

    public String getName() {
        return name;
    }
}

