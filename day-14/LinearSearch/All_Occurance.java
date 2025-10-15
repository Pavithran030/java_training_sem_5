public class All_Occurance {
    static void linear(int arr[],int key){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key) {
                c++;
                if(c==1) System.out.println("The Element "+key+" found at the Position : ");
                System.out.print(i+" ");
            }
        }
        if(c==0) System.out.println("No Such Element are found");
    }


    public static void main(String[] args) {
        int[] arr={2,3,8,6,9,5,3,8,9,3};
        int key=3;
        linear(arr, key);
    }
}
