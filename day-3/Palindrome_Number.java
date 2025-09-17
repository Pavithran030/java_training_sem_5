public class Palindrome_Number {
    public static void main(String[] args) {
        int[] arr={5,2,5};
        
        /*
        // Norrmal using a for loop

        int count=0;
        int len=arr.length;
        int temp=len-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[temp]){
                count++;
            }
            temp--;
        }
        if(count==len) System.out.println("The Array is Palindrome");
        else System.out.println("Array is not a Palindrome");
        */

        //Uisng a 2 pointers

        int start=0;
        int end=arr.length-1;

        while(start<end){
            if(arr[start]!=arr[end]) {
                System.out.println("The Array is Not a Palindrome");
                break;
            }
            start++;
            end--;
        }
        System.out.println("The Array is Palindrome");

    }
    
}
