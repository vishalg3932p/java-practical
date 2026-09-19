import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Practical18 {

    public static void main(String[] args) {

        // ArrayList
        List<String> arrayList = new ArrayList<>();

        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("C++");

        System.out.println("ArrayList:");
        System.out.println(arrayList);

        // LinkedList
        List<String> linkedList = new LinkedList<>();

        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Mango");

        System.out.println("\nLinkedList:");
        System.out.println(linkedList);

        // Remove elements
        arrayList.remove("Python");
        linkedList.remove("Apple");

        System.out.println("\nAfter removing elements:");
        System.out.println("ArrayList: " + arrayList);
        System.out.println("LinkedList: " + linkedList);
    }
}