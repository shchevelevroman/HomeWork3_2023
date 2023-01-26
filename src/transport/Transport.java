package transport;
public class Transport {
    private final String brand;
    private final String model;
    private int yearStart;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearStart, String country, String color, int maxSpeed) {
        this.brand = brand == null || brand.isEmpty() ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.yearStart = yearStart <= 0? 2000 : yearStart;
        this.country = country;
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearStart() {
        return yearStart;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color == null || color.isEmpty()){
            color = "белый";
        }
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed <= 0){
            maxSpeed = 120;
        }
        this.maxSpeed = maxSpeed;
    }
    public String toString() {
        return brand + " " + model + " " + yearStart + " года выпуска, " + " сборка - " + country + ", цвет кузова - " + color + ", максимальная скорость " + maxSpeed;
    }
}
