import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar={2,8,3,4,9};
        for(int i=0;i<ar.length-1;i++){ // if i<ar.length  leads to error
            int min=i;

            for(int j=i+1;j<ar.length;j++){  // if i<ar.length-1  leads to error
                if(ar[j]<ar[min])
                    min=j;
            }

            int temp=ar[min];
            ar[min]=ar[i];
            ar[i]=temp;
        }

        System.out.println(Arrays.toString(ar));
    }
    
}
