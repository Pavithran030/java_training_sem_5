public class Array_Large_Small {
    public static void main(String[] args) {
        int[] lar={2,5,7,9,3,4,6,20};
        int large=lar[0],small=lar[0];
        for(int i=0;i<lar.length;i++){
            if(large<lar[i]) large=lar[i];
            if(small>lar[i]) small=lar[i];
        }
        System.out.println("Largest number is: " + large);
        System.out.println("Smallest number is: " + small);
    }
    
}
