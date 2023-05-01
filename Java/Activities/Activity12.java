package Activities;

public class Activity12 {
    public static void main(String[] args) {

        // Create two variables of type Addable
        Addable ad1 = (num1, num2) -> num1 + num2;
        Addable ad2 = (num1, num2) -> {
            int sum = num1 + num2;
            return sum;
        };

        // Call the add method on the two Addable variables
        int result1 = ad1.add(5, 10);
        int result2 = ad2.add(10, 15);

        // Print the results to the console
        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
    }
}
