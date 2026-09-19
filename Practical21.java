import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class Practical21 {

    public static void main(String[] args) {

        // HashMap
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(1, "A");
        hashMap.put(2, "B");
        hashMap.put(3, "C");

        // LinkedHashMap
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put(3, "C");
        linkedHashMap.put(1, "A");
        linkedHashMap.put(2, "B");

        System.out.println("HashMap:");
        System.out.println(hashMap);

        System.out.println("LinkedHashMap:");
        System.out.println(linkedHashMap);

        System.out.println(
            "HashMap does not guarantee insertion order."
        );

        System.out.println(
            "LinkedHashMap maintains insertion order."
        );
    }
}