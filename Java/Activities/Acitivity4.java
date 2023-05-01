package Activities;

import java.util.Arrays;

public class Acitivity4 {
      public static void ascendingSort(int array[]) {
            int iLength = array.length, i;

            for (i = 1; i < iLength; i++) {
                int key = array[i];
                int j = i - 1;

                while (j >= 0 && key < array[j]) {
                    array[j + 1] = array[j];
                    --j;
                }
                array[j + 1] = key;
            }
        }
    public static void main(String[] args){
        int y;
        int [] a = {10, 77, 12, 54, -11, 8};
        ascendingSort(a);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(a));

        }


    }

