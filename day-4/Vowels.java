import java.util.*;
public class Vowels {
    public static void main(String[] args) {
        try(Scanner sc =new Scanner(System.in)){
            System.out.print("Enter the String : ");
            String str=sc.nextLine();
            int vow_count=0,con_count=0;
            for(int i=0;i<str.length();i++){
                char c=Character.toLowerCase(str.charAt(i));
                // char[] ar={'a','e','i','o','u'};
                if(c=='a'||c=='e'|| c=='i'||c=='o'||c=='u'){
                    vow_count++;
                }
                else con_count++;
            }
            System.out.println("Vowels in the String "+str+" : "+vow_count);
            System.out.println("Consonants in the String "+str+" : "+con_count);
        }
    }
    
}
