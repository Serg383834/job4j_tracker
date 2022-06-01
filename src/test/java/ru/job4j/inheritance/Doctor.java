package ru.job4j.inheritance;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String name, String surname, String education, String birthday, String specialization) {
        this.specialization = specialization;
    }

    public String getname() {
        return super.getName();
    }
}
