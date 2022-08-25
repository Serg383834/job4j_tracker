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
      Причем вызов indexOf должен быть один.
    1. Найти индекс ячейки по id.
    2. Проставить id с item. При замене нужно сохранять старый id.
    3. Записать в ячейку с найденным индексом объект item. Это входящий параметр.
    4. Вернуть true, если замена произведена или false, если index по id не найден.*/
    public boolean replace(int id, Item item) {
        item.setId(id);
        items[indexOf(id)] = item;
        return  true;
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