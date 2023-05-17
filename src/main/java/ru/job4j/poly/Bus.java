package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void move() {
        System.out.println("Bus");
    }

    @Override
    public void passengers() {
        System.out.println("35 passengers");
    }

    @Override
    public double fuelFul(double price, double fuel) {
        return price / fuel;
    }

    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.move();
        bus.passengers();
        System.out.println(bus.fuelFul(11.0, 3.0));
    }
}
