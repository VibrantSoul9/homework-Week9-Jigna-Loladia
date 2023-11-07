
package homework_week9;

import java.util.Arrays;


public class Programme3_ReverseArray {
    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        System.out.println("I wish my age could reverse like this Array :" + Arrays.toString(myArray));
        // Reverse the array using a two-pointer approach
        int low = 0;
        int high = myArray.length -1;

        while (low < high) {
            int temp = myArray[low];
            myArray[low] = myArray[high];
            myArray[high] = temp;
            low++;
            high--;
        }
        System.out.println("Reversed array : " + Arrays.toString(myArray));

        }
    }

