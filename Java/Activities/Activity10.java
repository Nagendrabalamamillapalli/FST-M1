package Activities;
import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();

        // Adding objects to the HashSet
        hs.add("Apple");
        hs.add("Banana");
        hs.add("Cherry");
        hs.add("Durian");
        hs.add("Elderberry");
        hs.add("Fig");

        // Printing the size of the HashSet
        System.out.println("The size of the HashSet is: " + hs.size());

        // Removing an element from the HashSet
        boolean isRemoved = hs.remove("Durian");
        System.out.println("Was 'Durian' removed from the HashSet? " + isRemoved);

        // Removing an element that is not present in the HashSet
        isRemoved = hs.remove("Grape");
        System.out.println("Was 'Grape' removed from the HashSet? " + isRemoved);

        // Checking if an item is in the HashSet using contains() method
        boolean hasApple = hs.contains("Apple");
        System.out.println("Does the HashSet contain 'Apple'? " + hasApple);

        // Printing the updated HashSet
        System.out.println("The updated HashSet is: " + hs);
    }
}

