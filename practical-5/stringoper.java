
import java.util.Scanner;
public class stringoper {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
         System.out.println("eneter a string:");
         String str=sc.nextLine();
         System.out.println("to upper case:"+str.toUpperCase());
         System.out.println("to Lower case:"+str.toLowerCase());
         System.out.println("Length:"+str.length());
         System.out.println("Replace a to @"+str.replace("a", "@"));
         System.out.println("indexing value:"+str.charAt(2));
         
    sc.close();
    }
}
