
package random ;
public class randomInt {
    public static void main(String[] args) {
   /*  Random r= new Random();
    int z= r.nextInt(10);
    System.out.println("random value :"+z);
    */

    /*  Random r= new Random();
    float z= r.nextFloat();
    System.out.println("random value :"+ z);
    */


    Random r = new Random();
    char z= (char)(r.nextInt(26)+'a');
    System.out.println("random value :"+ z);
    
   


    }
  
    
}
