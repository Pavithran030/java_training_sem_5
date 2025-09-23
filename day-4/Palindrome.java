public class Palindrome {
    public static void main(String[] args) {
        String str="malayalam";
        String temp="";
        for(int i=str.length()-1;i>=0;i--){
            temp+=str.charAt(i);
        }
        if(str.equals(temp)) System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
    
}
