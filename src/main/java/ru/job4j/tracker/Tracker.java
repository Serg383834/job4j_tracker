package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    /*добавляет заявку, переданную в аргументах в массив заявок items.
В методе add нужно проставить уникальный ключ в объект Item item.
Это нужно сделать через метод setId*/
    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    /*проверяет в цикле все элементы массива items, сравнивая id с аргументом int id
и возвращает найденный Item. Если Item не найден - возвращает null.*/
    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
    }

    // возвращает копию массива items без null элементов (без пустых ячеек).
    public Item[] findAll() {
        return  Arrays.copyOf(items, size);
    }

    /*проверяет в цикле все элементы массива items, сравнивая name (используя метод
getName класса Item) с аргументом метода String key. Элементы, у которых совпадает name,
копирует в результирующий массив и возвращает его. Алгоритм этого метода аналогичен методу findAll.*/
    public Item[] findByName(String key) {
        Item[] itemsWithoutNull = Arrays.copyOf(items, size);
        int size = 0;
        for (int i = 0; i < itemsWithoutNull.length; i++) {
            if (itemsWithoutNull[i].getName().equals(key)) {
                itemsWithoutNull[size] = itemsWithoutNull[i];
                size++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, size);
    }

    /*Реализуйте метод Tracker.replace, используя метод indexOf.
      Причем вызов indexOf должен быть один.*/
    public boolean replace(int id, Item item) {
    /*Первоначально нужно найти ячейку с id приходящем в параметре.
      Мы уже реализовали методы для поиска по id,
      но этот метод возвращает объект Item, а не index.
      Давайте создадим новый метод, который будет возвращать index по id.*/
        //indexOf(id);
        boolean bul = false;
        if (findById(id) != null) {
            items[indexOf(id)] = item;
            //items[indexOf(id)].setId(id);
            bul = true;
        }

        return bul;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

}