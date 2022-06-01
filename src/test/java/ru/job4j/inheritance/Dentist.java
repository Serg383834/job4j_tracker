package ru.job4j.inheritance;

public class Dentist extends Doctor {

    private int inspectedTeethCount;

    public Dentist(String name, String surname, String education, String birthday, String specialization, int inspectedTeethCount) {
        super(name, surname, education, birthday, specialization);
        this.inspectedTeethCount = inspectedTeethCount;
    }

    public String getname() {
        return super.getName();
    }
}
