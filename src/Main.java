import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter leg a: ");
            double a = scanner.nextDouble();
            System.out.print("Enter angle A (in degrees): ");
            double angleA = scanner.nextDouble();


            // Using IllegalArgumentException
            calcTriangleChecked(a, angleA);

            // Using Custom exception
            calcTriangleCustom(a, angleA);

        } catch (InvalidTriangleException e) {
            System.out.println("Custom exception: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static void calcTriangleCustom(double a, double angleA) throws InvalidTriangleException {
        if (a <= 0 || angleA <= 0 || angleA >= 90) {
            throw new InvalidTriangleException("Custom: Not a valid right triangle");
        }
        double b = a / Math.tan(Math.toRadians(angleA));
        double c = a / Math.sin(Math.toRadians(angleA));
        System.out.println("[Custom] a = " + a + " b = "+ b + " , c = " + c);
    }

    public static void calcTriangleChecked(double a, double angleA) throws IllegalArgumentException {
        if (a <= 0 || angleA <= 0 || angleA >= 90) {
            throw new IllegalArgumentException("Invalid triangle data");
        }
        double b = a / Math.tan(Math.toRadians(angleA));
        double c = a / Math.sin(Math.toRadians(angleA));
        System.out.println("[Checked] a = " + a + " b = " + b + ", c = " + c);
    }
}
