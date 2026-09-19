class Parent {

    String name = "Parent";

    void show() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {

    String name = "Child";

    Child() {
        super();
    }

    void display() {

        // Using this keyword
        System.out.println("Using this.name : " + this.name);

        // Using super keyword
        System.out.println("Using super.name : " + super.name);

        // Local variable
        String name = "Local";
        System.out.println("Local name : " + name);

        // Calling methods using this and super
        this.show();
        super.show();
    }
}

public class Practical13 {

    public static void main(String[] args) {

        Child c = new Child();

        c.display();
    }
}