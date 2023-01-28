import transport.Bus;
import transport.Car;
import transport.Truck;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7);
        System.out.println(car1);

        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0);
        System.out.println(car2);

        Car car3 = new Car("BMW","Z8",3.0);
        System.out.println(car3);

        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4);
        System.out.println(car4);

        Bus bus1 = new Bus("MAN", "Lion's City",3.0);
        System.out.println(bus1);

        Bus bus2 = new Bus("Hyundai", "Universe",3.5);
        System.out.println(bus2);

        Bus bus3 = new Bus("Daewoo", "BH120F",3.6);
        System.out.println(bus3);

        Bus bus4 = new Bus("Volvo", "Bus",3.6);
        System.out.println(bus4);

        Truck truck1 = new Truck("Renault", "Magnum",3.6);
        System.out.println(truck1);

        Truck truck2 = new Truck("Scania", "Truck",4.0);
        System.out.println(truck2);

        Truck truck3 = new Truck("Volvo", "Bigcar",3.0);
        System.out.println(truck3);

        Truck truck4 = new Truck("КАМаз", "3220",3.7);
        System.out.println(truck4);
    }
}