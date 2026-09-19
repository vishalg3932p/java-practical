class Animal {
    void eat() {
        System.out.println("Animal eats.");
    }
}

// Single Inheritance
class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks.");
    }
}

// Multilevel Inheritance
class Puppy extends Dog {
    void play() {
        System.out.println("Puppy plays.");
    }
}

// Hierarchical Inheritance
class Cat extends Animal {
    void meow() {
        System.out.println("Cat meows.");
    }
}

// Hybrid Inheritance using class + interface
interface Friendly {
    void friendly();
}

class Pet extends Dog implements Friendly {
    public void friendly() {
        System.out.println("Pet is friendly.");
    }
}

public class Practical12 {
    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("Single Inheritance:");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        System.out.println("\nMultilevel Inheritance:");
        Puppy p = new Puppy();
        p.eat();
        p.bark();
        p.play();

        // Hierarchical Inheritance
        System.out.println("\nHierarchical Inheritance:");
        Cat c = new Cat();
        c.eat();
        c.meow();

        // Hybrid Inheritance
        System.out.println("\nHybrid Inheritance:");
        Pet pet = new Pet();
        pet.eat();
        pet.bark();
        pet.friendly();
    }
}