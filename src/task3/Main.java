package task3;

public class Main {
    public static void main(String[] args) {
        Plane airbus = new Plane();
        airbus.setX(45.45);
        airbus.setY(22.15);
        airbus.setCapacity(180);
        airbus.setHeight(150.5f);
        airbus.setPrice(900000f);
        airbus.setSpeed(600f);
        airbus.setYear(2015);

        Ship avrora = new Ship();
        avrora.setX(26.63);
        avrora.setY(28.39);
        avrora.setPrice(6000000f);
        avrora.setSpeed(40f);
        avrora.setCapacity(3000);
        avrora.setPortname("Odessa");
        avrora.setYear(2010);

        Car audi = new Car();
        audi.setX(55.56);
        audi.setY(36.27);
        audi.setPrice(40000f);
        audi.setSpeed(120.5f);
        audi.setYear(2018);

        System.out.println(airbus.toString());
        System.out.println(avrora.toString());
        System.out.println(audi.toString());
    }
}
