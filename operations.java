import java.util.*;

class operation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers: ");
        int num_1=sc.nextInt();
        int num_2=sc.nextInt();
        System.out.println("addition:"+(num_1+num_2));
        System.out.println("substraction:"+(num_1-num_2));
        System.out.println("mult:"+(num_1*num_2));
        System.out.println("division:"+(num_1/num_2));
        sc.close();


    }
    
}
