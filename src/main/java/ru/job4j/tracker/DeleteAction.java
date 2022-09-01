package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ====");
        int id = Integer.parseInt(input.askStr("Enter Id: "));
        if (tracker.delete(id)) {
            System.out.println("Removal was successful");
        } else {
            System.out.println("Removal failed");
        }
        return true;
    }
}
