package task3;

public class Ship extends Vehicle {
    private int capacity;
    private String portname;

    public Ship(float price, float speed, int year, double x, double y, int capacity, String portname) {
        super(price, speed, year, x, y);
        this.capacity = capacity;
        this.portname = portname;
    }

    public Ship(){
        super();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname;
    }

    @Override
    public String toString() {
        return "Ship:" + super.toString() + ", capacity=" + capacity +
                ", portname= " + portname;
    }
}
