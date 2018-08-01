package main.java.com.DeadProg.Lesson4;

public class FreightCar extends Car{
    private int carrying;

    public FreightCar(int carrying) {
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }
}
