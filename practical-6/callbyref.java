
class student{
    int marks;
}
public class callbyref {
    void  change( student s){
        s.marks=s.marks+10;
        System.out.println("inside method :"+s.marks);

    }

    public static void main(String[] args) {
        student s1= new student();
        callbyref c =new callbyref();
        s1.marks=50;
        System.out.println("before calling method:"+s1.marks);
        c.change(s1);
        System.out.println("After Calling  Method:"+s1.marks);
        }
}
