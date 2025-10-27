import java.util.*;
public class Train_SeatLogic {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int a=sc.nextInt();
            switch (a%8) {
                case 3, 6 -> System.out.println("Upper Berth...");
                case 2, 5 -> System.out.println("Middle Berth...");
                case 4, 1 -> System.out.println("Lower Berth...");
                case 7 -> System.out.println("Side Lower Berth...");
                case 0 -> System.out.println("Side Upper Berth...");
                // default -> {
                // }
            }


        }
    }
    
}
