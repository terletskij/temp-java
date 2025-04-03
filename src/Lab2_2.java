import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        initArr(arr);
        System.out.println("Matrix:");
        printArr(arr);

        System.out.println("Quantity Of Square Numbers: " + quantityOfSquareNumbers(arr));
        System.out.println("Sum Of Square Numbers: " + sumOfSquareNumbers(arr));

        System.out.println("Sorted arr by row avg: ");
        arr = sortArrByRowAverage(arr);
        printArr(arr);

    }

    private static int quantityOfSquareNumbers(int[][] arr) {
        int counter = 0;
        System.out.println("Square Numbers: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isSquareNumber(arr[i][j])) {
                    counter++;
                    System.out.print(arr[i][j] + "\t");
                }
            }
        }
        System.out.println();
        return counter;
    }

    private static int sumOfSquareNumbers(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (isSquareNumber(arr[i][j])) sum += arr[i][j];            }
        }
        return sum;
    }

    private static int[][] sortArrByRowAverage(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int[] temp;
                if (countArrRowAverage(arr[j]) > countArrRowAverage(arr[j + 1])) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static double countArrRowAverage(int[] arr) {
        double avg = 0;
        for (int i = 0; i < arr.length; i++) {
            avg += arr[i];
        }
        avg = avg / arr.length;
        return avg;
    }



    private static boolean isSquareNumber(int number) {
        return Math.sqrt(number) % 1 == 0;
    }

    private static void printArr(int[][] arr) {
        for (int[] row : arr) {
            for (int el : row) {
                System.out.printf("%4d ", el);
            }
            System.out.println();
        }
    }

    private static int[][] initArr(int[][] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(-100,101);
            }
        }
        return arr;
    }
}