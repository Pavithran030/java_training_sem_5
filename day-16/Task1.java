// sort the array ,odd numbers in ascending and even number in descending

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 4, 9, 6, 3};

        System.out.println("Original array: " + Arrays.toString(arr));

        List<Integer> oddNumbers = new ArrayList<>();
        List<Integer> evenNumbers = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 != 0) {
                oddNumbers.add(num);
            } else {
                evenNumbers.add(num);
            }
        }

        // 2. Sort the odd numbers in ascending order
        Collections.sort(oddNumbers);

        // 3. Sort the even numbers in descending order
        Collections.sort(evenNumbers, Collections.reverseOrder());

        // 4. Put the sorted numbers back into the original array
        int index = 0;

        // Add sorted odd numbers first
        for (int oddNum : oddNumbers) {
            arr[index] = oddNum;
            index++;
        }

        // Add sorted even numbers after
        for (int evenNum : evenNumbers) {
            arr[index] = evenNum;
            index++;
        }

        System.out.println("Sorted array:   " + Arrays.toString(arr));
    }
}
