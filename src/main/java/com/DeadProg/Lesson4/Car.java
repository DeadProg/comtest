package main.java.com.DeadProg.Lesson4;

public class Car {
    private int price;
    private int fuel;

    public Car(int price, int fuel) {
        this.price = price;
        this.fuel = fuel;
    }

    public Car() {
    }

    public int getPrice() {
        return price;
    }

    public int getFuel() {
        return fuel;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
