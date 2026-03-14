
public class callbyvalue {
    void chang(int x){
        x=x+10;
        System.out.println("after using function callby value:"+x);
    }

    public static void main(String[] args) {
        callbyvalue ob=new callbyvalue();
        int num=50;
        System.out.println("before calling function:"+num);
        ob.chang(num);
        System.out.println("after calling the function the num:"+num);


    }

}