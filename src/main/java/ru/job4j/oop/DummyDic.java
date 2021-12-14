package ru.job4j.oop;

public class DummyDic {

    public String engToRus(String eng) {
        String translate = "Неизвестное слово. ";
        return translate + eng;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        System.out.println(dummyDic.engToRus("Hello"));
    }
}
