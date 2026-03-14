 class bufandbuild
 {
public static void main(String[] args) {
StringBuffer br = new StringBuffer("hello");    //thread safe (allowly only one entry at a time),synchronized,slower
br.append("world");//2
System.out.println("output for string buffer:"+br);

StringBuilder bul= new StringBuilder("Hello"); // not thread safe (allowly multiple  entry at a time), not synchronized,slower
bul.append("world");
System.out.println("output of string bulider="+bul);

}
    
}

// string :is immutable ,changes creates another obj
// string buffer:is mutable ,changes will not creates another obj like 2 comment