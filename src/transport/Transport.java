package transport;
public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;

    public void goCar() {
        if ( engineVolume !=  0) {
            System.out.println("Автомобиль поехал");
        } else {
            System.out.println("Автомобиль приехал");
        }
    }



//    private int yearStart;
//    private String country;
//    private String color;
//    private int maxSpeed;

    public Transport(String brand, String model, double engineVolume) {
        this.brand = brand == null || brand.isEmpty() ? "default" : brand;
        this.model = model == null || model.isEmpty() ? "default" : model;
        this.engineVolume = engineVolume;
        this.goCar();
    }


    public double getEngineVolume() {
        return engineVolume;
    }
        public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

//    public int getYearStart() {
//        return yearStart;
//    }
//
//    public String getCountry() {
//        return country;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        if (color == null || color.isEmpty()){
//            color = "белый";
//        }
//        this.color = color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        if (maxSpeed <= 0){
//            maxSpeed = 120;
//        }
//        this.maxSpeed = maxSpeed;
//    }
    public String toString() {
        return brand + " " + model + ", мощьность двигателя - " + engineVolume;
    }
}
