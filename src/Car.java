public class Car {
    String brand;
    protected String model;
    public int year;
    private double price;
    static int carCounter = 0;

    public Car(String brand, String model, int year, double price) {
        carCounter++;

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Car(String brand, String model, int year) {
        carCounter++;

        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double newPrice) {
        this.price = (this.year < 2010) ? newPrice * 0.7 : newPrice;
    }
}
