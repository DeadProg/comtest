package main.java.com.DeadProg.Lesson4;

public class Main {
    public static void main(String[] args) {
        PassengerCar pasCar = new PassengerCar("Test");
        pasCar.setPrice(200);
        FreightCar freiCar = new FreightCar(200);
        freiCar.setPrice(350);
        System.out.println(Taxopark.getSumOfPrices(pasCar,freiCar));
        System.out.println(pasCar.getType());
    }
}
