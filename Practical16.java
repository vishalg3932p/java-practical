public class Practical16 {

    public static void main(String[] args) {

        try {

            int a = 10;
            int b = 0;

            System.out.println("Division = " + (a / b));

        } catch (ArithmeticException e) {

            System.out.println("Exception caught: Cannot divide by zero.");

        } finally {

            System.out.println("Finally block is always executed.");
        }

        System.out.println("Program continues normally.");
    }
}