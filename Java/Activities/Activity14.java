package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity14 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            ArrayList<Integer> list = new ArrayList<>();
            Random indexGen = new Random();

            System.out.println("Enter some integers: ");

            while (scan.hasNextInt()) {
                int num = scan.nextInt();
                list.add(num);
            }

            Integer nums[] = list.toArray(new Integer[0]);
            int index = indexGen.nextInt(nums.length);

            System.out.println("Generated index: " + index);
            System.out.println("Value at generated index: " + nums[index]);

            scan.close();
        }
    }


