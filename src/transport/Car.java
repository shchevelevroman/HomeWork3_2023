package transport;
public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String bodyType;
    private String registrationNumber;
    private final int numberOfSeats;
    private String seasonTires;
    private int currentMonth;

    private boolean seasonTiresTest() {
        if (currentMonth >= 3 && currentMonth <= 10) {
            seasonTires = "Летняя резина";
        } else {
            seasonTires = "Зимняя резина";
        }
        return true;
    }
    public Car(String brand, String model, double engineVolume, String color, int yearStart, String country, int maxSpeed, String transmission, String bodyType, String registrationNumber, int numberOfSeats, int currentMonth, String seasonTires) {
        super(brand, model, yearStart, country, color, maxSpeed);
        this.getBrand();
        this.getModel();
        this.engineVolume = engineVolume <= 0 ? engineVolume : 1.5;
        this.getColor();
        this.getYearStart();
        this.getCountry();
        this.transmission = transmission == null || transmission.isEmpty() ? "default" : transmission;
        this.bodyType = bodyType == null || bodyType.isEmpty() ? "default" : bodyType;
        this.registrationNumber = registrationNumber == null || registrationNumber.isEmpty() ? "default" : registrationNumber;
        this.numberOfSeats = numberOfSeats <= 0 ? numberOfSeats : 5;
        this.currentMonth = currentMonth;
        this.seasonTires = seasonTires;
        seasonTiresTest();
    }


    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }


    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String isSeasonTires() {
        return seasonTires;
    }

    public void setSeasonTires(String seasonTires) {
        this.seasonTires = seasonTires;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + "Объем двигателя в литрах  " + engineVolume + ", КПП " + transmission + ", тип кузова " + bodyType + ", регистрационный знак - " + registrationNumber + ", количество мест - " + numberOfSeats + ", сезонность резины " + seasonTires;
    }

}