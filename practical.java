import java.util.Scanner;

class intake{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  a number:");
        int num= sc.nextInt();
        System.out.println("the number given is :"+num);
        sc.close();
    }
}