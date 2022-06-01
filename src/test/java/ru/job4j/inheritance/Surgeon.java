package ru.job4j.inheritance;

public class Surgeon extends Doctor {

    private int patientCount;

    public Surgeon(String name, String surname, String education, String birthday, String specialization, int patientCount) {
        super(name, surname, education, birthday, specialization);
        this.patientCount = patientCount;
    }

    public String getname() {
        return super.getName();
    }
}
