// moving zeros to the end

import java.util.Arrays;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 5, 0, 9, 0, 7};

        int si = arr.length;
        int index = 0;

        for (int i = 0; i < si; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (index < si) {
            arr[index++] = 0;
        }
        System.out.println(Arrays.toString(arr));

    }
}
