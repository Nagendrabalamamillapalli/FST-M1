package Activities;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {
    public static void main(String[] args) {

        // Create a Scanner object for user input
        Scanner scan = new Scanner(System.in);

        // Create an ArrayList to store the numbers
        ArrayList<Integer> list = new ArrayList<Integer>();

        // Prompt the user to enter numbers until they enter a non-integer value
        System.out.println("Enter some numbers (non-integer to exit):");
        while (scan.hasNextInt()) {
            int num = scan.nextInt();
            list.add(num);
        }

        // Create a Random object to generate an index value
        Random indexGen = new Random();

        // Generate a random index value within the range of the ArrayList size
        int index = indexGen.nextInt(list.size());

        // Print the value in the ArrayList at the generated index value
        System.out.println("Random value at index " + index + ": " + list.get(index));
    }
}

