package task3;

public class Plane extends Vehicle {
    private float height;
    private int capacity;


    public Plane(float price, float speed, int year, double x, double y, float height, int capacity) {
        super(price, speed, year, x, y);
        this.height = height;
        this.capacity = capacity;
    }

    public Plane(){
        super();
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Plane:" + super.toString() + ", height=" + height + ", capacity=" + capacity;
    }
}