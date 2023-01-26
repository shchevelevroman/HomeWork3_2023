import transport.Bus;
import transport.Car;

public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7,"Желтый",2015,"Россия",200,"МКПП","Седан", "A111AA134",5,5,"");
        System.out.println(car1);

        Car car2 = new Car("Audi","A8 50 L TDI quattro",3.0,"Черный",2020,"Германия",200,"АКПП", "седан", "В222ВВ147", 5,2,"");
        System.out.println(car2);

        Car car3 = new Car("BMW","Z8",3.0,"Черный",2021,"Германия", 200,"АКПП","хэтчбек", "С333СС147", 5, 1,"");
        System.out.println(car3);

        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4,"Красный",2018,"Южная Корея", 200,"АКПП", "Кроссовер", "У777УУ147", 5, 7,"");
        System.out.println(car4);

        Car car5 = new Car("Hyundai", "Avante",1.6,"Оранжевый",2016,"Южная Корея", 200,"АКПП", "седан", "К555КК147", 5,12,"");
        System.out.println(car5);

        Bus bus1 = new Bus("MAN", "Lion's City",2022, "Германия","Белый",200);
        System.out.println(bus1);

        Bus bus2 = new Bus("Hyundai", "Universe",2021,"Южная Корея","Красный",180);
        System.out.println(bus2);

        Bus bus3 = new Bus("Daewoo", "BH120F",2020,"Узбекистан","Серебристый",170);
        System.out.println(bus3);
    }
}