public class Binary {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};

        int st=0;
        int ed=arr.length-1;
        int key=4;
        while(st<=ed){
            int mid=(st+ed)/2;
            if(arr[mid]==key){
                System.out.println("Index found : "+mid);
                return;
            }
            else if(arr[mid]<key) ed=mid-1;
            else st=mid+1;
        }
        System.out.println("Element not found....");



    }
    
}
