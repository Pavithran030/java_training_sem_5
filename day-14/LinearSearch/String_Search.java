public class String_Search{
    public static void main(String[] args) {
        String[] st={"Apple","Orange","Grapes","Pineapple"};
        String re="Grapes";

        for(int i=0;i<st.length;i++){
            if(re.equals(st[i])){
                System.out.println("The String Foind at the Position : "+i);
                return;
            }
        }
        System.out.println("The String is not found in the String array...");
    }
}