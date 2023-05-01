package Activities;
import java.util.ArrayList;

public class Activity8 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<String>();

        // Adding names to the ArrayList
        myList.add("Alice");
        myList.add("Bob");
        myList.add("Charlie");
        myList.add("Dave");
        myList.add("Emily");

        // Printing all names in the ArrayList using a for loop
        for (String name : myList) {
            System.out.println(name);
        }

        // Retrieving the 3rd name in the ArrayList using the get() method
        String thirdName = myList.get(2);
        System.out.println("The 3rd name in the ArrayList is: " + thirdName);

        // Checking if a name exists in the ArrayList using the contains() method
        boolean nameExists = myList.contains("Alice");
        System.out.println("The name 'Alice' exists in the ArrayList: " + nameExists);

        // Printing the number of names in the ArrayList using the size() method
        int size = myList.size();
        System.out.println("The number of names in the ArrayList is: " + size);

        // Removing a name from the ArrayList using the remove() method
        myList.remove("Bob");
        size = myList.size();
        System.out.println("The number of names in the ArrayList after removing 'Bob' is: " + size);
    }
}



