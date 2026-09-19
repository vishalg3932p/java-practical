import java.util.Arrays;
import java.util.Scanner;

class Practical6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // One-Dimensional Array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] num = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // Display Array
        System.out.println("\nArray Elements:");
        System.out.println(Arrays.toString(num));

        // Sum, Maximum, Minimum
        int sum = 0;
        int max = num[0];
        int min = num[0];

        for (int i = 0; i < num.length; i++) {
            sum += num[i];

            if (num[i] > max)
                max = num[i];

            if (num[i] < min)
                min = num[i];
        }

        double average = (double) sum / num.length;

        System.out.println("Sum = " + sum);
        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        System.out.println("Average = " + average);

        // Sort Array
        Arrays.sort(num);

        System.out.println("\nSorted Array:");
        System.out.println(Arrays.toString(num));

        // Reverse Array
        System.out.print("Reverse Array: ");

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }

        // Search
        System.out.print("\n\nEnter element to search: ");
        int search = sc.nextInt();

        int position = Arrays.binarySearch(num, search);

        if (position >= 0) {
            System.out.println(
                "Element " + search + " found at index " + position
            );
        } else {
            System.out.println("Element " + search + " not found.");
        }

        // Multi-Dimensional Array
        System.out.print("\nEnter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Display Matrix and Calculate Sum
        int total = 0;

        System.out.println("\nMatrix:");

        for (int i = 0; i < rows; i++) {
            System.out.println(Arrays.toString(matrix[i]));

            for (int j = 0; j < cols; j++) {
                total += matrix[i][j];
            }
        }

        System.out.println("Sum of Matrix Elements = " + total);

        // Transpose
        System.out.println("\nTranspose of Matrix:");

        for (int i = 0; i < cols; i++) {

            int[] transposeRow = new int[rows];

            for (int j = 0; j < rows; j++) {
                transposeRow[j] = matrix[j][i];
            }

            System.out.println(Arrays.toString(transposeRow));
        }

        sc.close();
    }
}
