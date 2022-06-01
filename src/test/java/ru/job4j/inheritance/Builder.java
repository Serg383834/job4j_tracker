package ru.job4j.inheritance;

public class Builder extends Engineer {

    private int buildingCount;

    public Builder(String name, String surname, String education, String birthday, String speciality, int buildingCount) {
        super(name, surname, education, birthday, speciality);
        this.buildingCount = buildingCount;
    }

    public String getname() {
        return super.getName();
    }

    public  void build() {
    }
}
