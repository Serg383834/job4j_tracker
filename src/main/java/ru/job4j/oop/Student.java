package ru.job4j.oop;

public class Student {

    public void music(int countMusic) {
        for (int i = 0; i < countMusic; i++) {
        System.out.println("Tra tra tra");
        }
    }

    public void song(int countSong) {
        for (int i = 0; i < countSong; i++) {
        System.out.println("I believe I can fly");
        }
    }

    public static void main(String[] args) {
        Student petya = new Student();
        petya.music(3);
        petya.song(3);
    }
}
