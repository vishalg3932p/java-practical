class Calculator {

    // Method Overloading
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Shape {
    void draw() {
        System.out.println("Drawing a shape.");
    }
}

class Circle extends Shape {

    // Method Overriding
    @Override
    void draw() {
        System.out.println("Drawing a circle.");
    }
}

class Practical14 {
    public static void main(String[] args) {

        // Method Overloading
        Calculator c = new Calculator();

        System.out.println("Method Overloading:");
        System.out.println("add(10, 20) = " + c.add(10, 20));
        System.out.println("add(10.5, 20.5) = " + c.add(10.5, 20.5));

        // Method Overriding
        System.out.println("\nMethod Overriding:");
        Shape s = new Circle();
        s.draw();
    }
}
