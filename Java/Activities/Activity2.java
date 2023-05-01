package Activities;

public class Activity2 {
    public static void main(String[] args) {
        int count =0;
        int[] a = {10, 77, 10, 54, -11, 10};
        int iLength = a.length;
        System.out.println("Length of the array is : "+iLength);

        for (int i = 0; i<iLength; i++) {
            if (a[i] == 10) {
                count = count + a[i];
            }
        }
        if (count == 30) {
            System.out.println("Total value of count: " + count);

        }
    }
}
