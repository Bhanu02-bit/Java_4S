import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter x value:");
        double x =sc.nextDouble();
        System.out.println("enter y value:");
        double y =sc.nextDouble();

       
        double z;
        z=Math.sqrt(x*x+y*y);
         System.out.println("hypotenuse value:"+z);

        
    }
}
