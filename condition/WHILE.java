package condition;
import java.util.Scanner;

public class WHILE {
    public static void main(String[] args) {
   
    Scanner sc= new Scanner(System.in);
    String name="" ;

    do {
        System.out.println("enter ur name");
        name=sc.nextLine();
    }
    while(name.isBlank());


    System.out.println("hello:"+name);

    sc.close();
}
}

