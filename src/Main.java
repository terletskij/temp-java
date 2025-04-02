import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[25];

        System.out.println("Init array:");
        arr = initArr(arr);
        printArr(arr);

        System.out.println();

        System.out.println("Sorted array:");
        arr = sort(arr);
        printArr(arr);

        System.out.println();
        System.out.println("Quantity of positive even numbers: " + calcQuantity(arr));
        System.out.println("Summary of positive even numbers: " + summaryOfNums(arr));

        System.out.println("Modified array where positive even numbers = 0: ");
        arr = swapElems(arr);
        printArr(arr);

    }

    /**
     * Changes positive even numbers of given array to zero
     * @param arr given array of integer numbers
     * @return arr where all positive even numbers are swapped to zero
     */
    private static int[] swapElems(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0 && arr[i] % 2 == 0) arr[i] = 0;
        }
        return arr;
    }

    /**
     * This method calculates summary of positive even numbers
     * @param arr given array of int numbers
     * @return summary of positive even numbers
     */
    private static int summaryOfNums(int[] arr) {
        int sum = 0;
        for (int el : arr) {
            if (el > 0 && el % 2 == 0) sum += el;
        }
        return sum;
    }

    /**
     * This method calculates quantity of positive even numbers
     * @param arr given array of int numbers
     * @return quantity of positive even numbers
     */
    private static int calcQuantity(int[] arr) {
        int counter = 0;
        for (int el : arr) {
            if (el > 0 && el % 2 == 0) counter++;
        }
        return counter;
    }

    /**
     * This method sorts given array in ascending order
     * @param arr given array of integer numbers
     * @return sorted in ascending order array
     */
    private static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] initArr(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) arr[i] = random.nextInt(-20, 30);
        return arr;
    }

    private static void printArr(int[] arr) {
        for (int el : arr) System.out.print(" " + el);
        System.out.println();
    }

}