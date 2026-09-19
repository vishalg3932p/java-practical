import java.util.Arrays;
import java.util.Scanner;

class Practical7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================================
        // A) Maximum and Second Maximum in 1D Array
        // =========================================================

        System.out.print("Enter size of array: ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter array elements:");

        for (int i = 0; i < num; i++) {
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int secondMax = Integer.MIN_VALUE;

        for (int i = 1; i < num; i++) {

            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }

            else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Maximum value = " + max);

        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("Second Maximum does not exist");
        }
        else {
            System.out.println("Second Maximum value = " + secondMax);
        }


        // =========================================================
        // B) Sorting Names in Ascending Order
        // =========================================================

        System.out.print("\nEnter number of names: ");
        int size = sc.nextInt();

        String[] names = new String[size];

        System.out.println("Enter names:");

        for (int i = 0; i < size; i++) {
            names[i] = sc.next();
        }

        Arrays.sort(names);

        System.out.println("Names in ascending order:");

        for (int i = 0; i < size; i++) {
            System.out.println(names[i]);
        }


        // =========================================================
        // C) Addition of Two 2x2 Matrices
        // =========================================================

        int[][] a = new int[2][2];
        int[][] b = new int[2][2];
        int[][] sum = new int[2][2];

        System.out.println("\nEnter elements of first 2x2 matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second 2x2 matrix:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        System.out.println("Addition of matrices:");

        for (int i = 0; i < 2; i++) {

            for (int j = 0; j < 2; j++) {

                sum[i][j] = a[i][j] + b[i][j];

                System.out.print(sum[i][j] + " ");
            }

            System.out.println();
        }


        // =========================================================
        // D) Multiplication of 3x3 Matrices
        // =========================================================

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] result = new int[3][3];

        System.out.println("\nEnter first 3x3 matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second 3x3 matrix:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                for (int k = 0; k < 3; k++) {

                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Multiplication of matrices:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(result[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}