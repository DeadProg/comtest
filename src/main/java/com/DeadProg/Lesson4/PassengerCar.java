package main.java.com.DeadProg.Lesson4;

public class PassengerCar extends Car {
    private String type;

    public PassengerCar(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
