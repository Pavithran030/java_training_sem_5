public class Linear_Search {

    static int linear(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) return i;
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr={2,3,8,6,9,5};
        int key=5;
        if(linear(arr, key)!=-1)
            System.out.println("Element Found at the position -> "+linear(arr, key));
        else System.err.println("Element not found in the array...");
    }
}
