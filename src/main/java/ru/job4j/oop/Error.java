package ru.job4j.oop;

public class Error {
    boolean active;
    int status;
    String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public  void  info() {
        System.out.println(active);
        System.out.println(status);
        System.out.println(message);
    }

    public static void main(String[] args) {
        Error noError = new Error();
        Error criticalError = new Error(true, 1, "Critical error");
        noError.info();
        System.out.println();
        criticalError.info();

    }
}

