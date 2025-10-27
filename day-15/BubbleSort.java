import java.util.*;

public class BubbleSort {

    /*
    public static void main(String[] args) {
        int[] arr={2,6,9,4,3,8};
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
        
            for(int j=i+1;j<len-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    count++;
                }
            }

        }
        System.out.println(Arrays.toString(arr)+"  "+count);
    }
 
    */

    // Improved Version of the Code...

    public static void main(String[] args) {
        int[] arr={2,6,9,4,3,8};
        int len=arr.length;
        int count=0;
        for(int i=0;i<len;i++){
            boolean c=false;
            for(int j=0;j<len-1;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    c=true;
                    count++;
                }
            }
            if(c==false) break;            

        }
        System.out.println(Arrays.toString(arr)+"  "+count);
    }


}



