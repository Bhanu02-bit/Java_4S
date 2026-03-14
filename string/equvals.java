public class equvals{
    public static void main(String[] args){
        String name="bha";
        // boolean result=name.equals("bha"); //these is case sensitive so ignore case
        boolean result=name.equalsIgnorecase("BHA"); 

        System.out.println(result);
    }
}