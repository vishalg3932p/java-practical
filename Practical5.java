import java.util.Scanner;

class Practical5 {

    // Recursive method to find factorial
    static int factorial(int num) {
        // Base case
        if (num == 0 || num == 1) {
            return 1;
        }

        // Recursive case
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = factorial(num);

        System.out.println("Factorial of " + num + " = " + result);

        sc.close();
    }
}
