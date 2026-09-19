import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

class Practical19 {

    public static void main(String[] args) {

        Set<Integer> hashSet = new HashSet<>();

        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(10);

        Set<Integer> treeSet = new TreeSet<>();

        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(10);

        System.out.println("HashSet:");
        System.out.println(hashSet);

        System.out.println("TreeSet:");
        System.out.println(treeSet);

        System.out.println(
            "Duplicate value 10 is stored only once."
        );
    }
}