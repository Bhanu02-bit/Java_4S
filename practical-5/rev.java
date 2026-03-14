
import java.util.Scanner;
public class rev{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.println("eneter a string:");
         String str=sc.nextLine();
        String rev=" ";
         

         for(int i= str.length()-1;i>=0;i--){
            rev=rev+str.charAt(i);
           
         }
          System.out.println("reverse of given:" + rev);

       
        
         

    }
}

