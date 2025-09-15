package chapter7.Vehicle;

public class Car extends Vehile {
    @Override
    public void start() {
        System.out.println("Car start");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}
