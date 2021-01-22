package task3;

public class Car extends Vehicle {

    public Car(float price, float speed, int year, double x, double y) {
        super(price, speed, year, x, y);
    }

    public Car(){
        super();
    }

    @Override
    public String toString() {
        return "Car:" + super.toString();
    }
}
