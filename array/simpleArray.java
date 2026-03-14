public class simpleArray{
    public static void main(String[] args) {
       /*  String[] cars={"a","b"."c"};
        System.out.println(""cars[0]);
        */

        String[][] cars =new String[4][4];
        cars[0][0]="a";
        cars[0][1]="b";
       cars[0][2]="c";
        cars[1][0]="d";
        cars[1][1]="e";
        cars[1][2]="f";

        for(int i=0;i<cars.length;i++){
            System.out.println(" ");
            for(int j=0;j<=cars[i].length;j++){
                System.out.println(cars[i][j]);
            }
        }

    }
}