import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Camry", 2004, 10000);
        Car car2 = new Car("Tesla", "Model 3", 2020, 30000);

        car1.setPrice(11000);
        car2.setPrice(33333);

        System.out.println("Car 1 price: $" + car1.getPrice());
        System.out.println("Car 2 price: $" + car2.getPrice());
    }
}
