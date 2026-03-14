class Main{
    public static void main(String[] args) {
        fnoverload d1= new fnoverload();

        System.out.println("Addition of two num:"+d1.sum(1,3));
        System.out.println("Addition of three nums:"+d1.sum(1,3,9));
        System.out.println("floating addition:" + d1.sum(1.0,9.0));
        
    }
}