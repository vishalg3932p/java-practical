class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Vishal";
        age = 20;
    }

    // Parameterized Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}

public class Practical10 {
    public static void main(String[] args) {

        // Object using default constructor
        Student s1 = new Student();

        System.out.println("Student 1 Details:");
        s1.display();

        // Object using parameterized constructor
        Student s2 = new Student("Rahul", 21);

        System.out.println("\nStudent 2 Details:");
        s2.display();
    }
}
