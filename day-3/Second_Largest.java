public class Second_Largest {
    public static void main(String[] args) {
        
        int[] arr={2,5,9,7,6,3,4,8};

        int large1=Integer.MIN_VALUE;
        int large2=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>large1){
                large2=large1;
                large1=arr[i];
            }
            else if(arr[i]>large2 && arr[i]!=large1){
                large2=arr[i];
            }
        }
        System.out.println(large2);
    }
    
}
