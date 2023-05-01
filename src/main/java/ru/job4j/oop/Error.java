package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error() {
    }

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.message = message;
        this.status = status;
    }

    public void printInfo() {
        System.out.println("Состояние " + active);
        System.out.println("Сообщение " + message);
        System.out.println("Статус " + status);
    }

    public static void main(String[] args) {
        Error error = new Error(true, 10, "Hello");
        Error a = new Error(false, 3, "Good");
        Error b = new Error(true, 4, "Bye");
        error.printInfo();
        a.printInfo();
        b.printInfo();
    }
}
