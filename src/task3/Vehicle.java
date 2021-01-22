package task3;

public class Vehicle {
    private float price;
    private float speed;
    private int year;
    private double x;
    private double y;

    public Vehicle(float price, float speed, int year, double x, double y) {
        this.price = price;
        this.speed = speed;
        this.year = year;
        this.x = x;
        this.y = y;
    }

    public Vehicle(){

    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return " price=" + price + ", speed=" + speed + ", year=" + year + ", x=" + x + ", y=" + y;
    }
}