package condition;
import java.util.Scanner;

public class swit{
    public static void main(String args[]){

        Scanner sc= new Scanner(System.in);
        System.out.println("eneter a day");
        String day =sc.nextLine();
        switch (day) {
            case "sunday":
                System.out.println("it is sun");
                break;

            case "monday":
                System.out.println("it is mon");
                break;

            case "tuesday":
                System.out.println("it is tue");
                break;    

            default:
                throw new AssertionError();
        }

    }
    }
