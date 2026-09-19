class Practical17 {

    public static void main(String[] args) {

        try {

            int[] numbers = {10, 20, 30};

            System.out.println(
                "Element: " + numbers[5]
            );

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(
                "Exception caught: Invalid array index."
            );

        } finally {

            System.out.println(
                "Finally block is always executed."
            );
        }

        System.out.println(
            "Program continues normally."
        );
    }
}