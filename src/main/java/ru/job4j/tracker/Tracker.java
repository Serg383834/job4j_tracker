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
        Item rsl = null;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
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

}