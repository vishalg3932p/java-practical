class Student {

    // Private members
    private String name;
    private int age;

    // Default access specifier
    String course = "B.Tech CSE";

    // Protected access specifier
    protected int rollNo = 101;

    // Public access specifier
    public String university = "Parul University";

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class Practical11 {

    public static void main(String[] args) {

        Student s = new Student();

        // Updating private data using setter
        s.setName("vishal");
        s.setAge(20);

        // Accessing data using getter methods
        System.out.println("Student Details:");
        System.out.println("Name : " + s.getName());
        System.out.println("Roll No : " + s.rollNo);
        System.out.println("Age : " + s.getAge());
        System.out.println("Course : " + s.course);
        System.out.println("University : " + s.university);

        // Updating age using setter
        s.setAge(21);

        System.out.println("Updated Age : " + s.getAge());
        System.out.println("Data is accessed through public getter and setter methods.");
    }
}