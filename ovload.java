public class ovload{
    int id;
    String name;

    ovload(int i){
        id=i;
        name="bha";
        
    }

    ovload(String n){
        id=1;
        name=n;
        
    }

    ovload(int i,String n){
        id=i;
        name=n;
    }

    void display(){
        System.out.println("Name =" +name +"\n"+"id="+id);
    }
}

     class Main{
    public static void main(String[] args) {
        ovload d1=new ovload(1);
        ovload d2=new ovload("bha");
        ovload d3=new ovload(9,"bha");

        d1.display();
        d2.display();
        d3.display();

    }

}

