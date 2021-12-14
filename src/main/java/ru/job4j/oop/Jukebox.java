package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("""
                    Пусть бегут неуклюже\s
                    Пешеходы по лужам,\s
                    А вода по асфальту рекой.\s
                    И не ясно прохожим\s
                    В этот день непогожий\s
                    Почему я весёлый такой.""");
            System.out.println();
        } else if (position == 2) {
            System.out.println("""
                    Спят усталые игрушки, книжки спят,\s
                    Одеяла и подушки ждут ребят.\s
                    Даже сказка спать ложится,\s
                    Чтобы ночью нам присниться.\s
                    Ты ей пожелай: «Баю-бай!»""");
            System.out.println();
        } else {
            System.out.println("Песня не найдена");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(0);
        jukebox.music(1);
        jukebox.music(2);
    }
}
