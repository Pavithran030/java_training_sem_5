import java.util.*;
public class MergeSort {

    public static void mergeSort(int[] arr,int le,int ri ){
        if(le<ri){
            int mid=(le+ri)/2;
            
            // split the array....
            mergeSort(arr,le,mid );  // 1st halves
            mergeSort(arr,mid+1,ri); // 2nd halves

            //merge the splitted Array....
            merge(arr,le,mid,ri);
        }

    }

    public static void merge(int[] arr,int le,int mid,int ri){

        // to get the size of the each array 

        int s1=mid-le+1;
        int s2=ri-mid;

        // left and right array to merge the splitted elements

        int[] lfar=new int[s1];
        int[] riar=new int[s2];

        // copy the elements to the array

        for(int i=0;i<s1;i++){
            lfar[i]=arr[le+i];
        }

        for(int j=0;j<s2;j++){
            riar[j]=arr[mid+1+j];
        }

        // value to access the array elements

        int i=0,j=0;

        // it for main array index
        int k=le;

        // Meerging process starts here

        while(i<s1 && j<s2){

            if(lfar[i]<riar[j]){
                arr[k]=lfar[i];
                i++;
            }

            else {
                arr[k]=riar[j];
                j++;
            }
            k++;
        }

        // to add the remaining elements after comparsion to the main array from the divided array
        // left part
        while(i<s1){
            arr[k]=lfar[i];
            i++;
            k++;

        }

        //right part
        while(j<s2){
            arr[k]=riar[j];
            j++;
            k++;

        }
    }

    public static void main(String[] args) {
        int[] arr = {2,6,3,4,9,7,1};
        System.out.println("Original array: " + Arrays.toString(arr)+"\n");

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
