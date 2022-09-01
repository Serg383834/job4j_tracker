package ru.job4j.tracker;

public class FindByNameAction implements UserAction {
    @Override
    public String name() {
        return "Find Item by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find by name ====");
        Item[] item = tracker.findByName(input.askStr("Enter name: "));
        if (item.length != 0) {
            for (Item value : item) {
                System.out.println(value.toString());
            }
        } else {
            System.out.println("No application found");
        }
        return true;
    }
}
