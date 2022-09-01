package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    @Override
    public String name() {
        return "Show all Items";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show All ====");
        Item[] item = tracker.findAll();
        for (Item value : item) {
            System.out.print(value.getId() + ". ");
            System.out.println(value.getName());
        }
        System.out.println();
        return  true;
    }
}
