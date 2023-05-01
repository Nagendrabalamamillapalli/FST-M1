package Activities;
import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        Map<Integer, String> colours = new HashMap<Integer, String>();

        // Adding colours to the Map
        colours.put(1, "Red");
        colours.put(2, "Blue");
        colours.put(3, "Green");
        colours.put(4, "Yellow");
        colours.put(5, "Purple");

        // Printing the Map
        System.out.println("The colours Map is: " + colours);

        // Removing a colour from the Map
        colours.remove(4);
        System.out.println("The colours Map after removing 4 is: " + colours);

        // Checking if the colour green exists in the Map using containsValue() method
        boolean containsGreen = colours.containsValue("Green");
        System.out.println("Does the colours Map contain the colour Green? " + containsGreen);

        // Printing the size of the Map using the size() method
        int size = colours.size();
        System.out.println("The size of the colours Map is: " + size);
    }
}




