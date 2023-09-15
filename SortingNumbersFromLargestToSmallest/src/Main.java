import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int a,b,c;

        Scanner scan = new Scanner (System.in);

        System.out.print ("Please enter first number : ");
        a=scan.nextInt ();
        System.out.print ("Please enter first number : ");
        b=scan.nextInt ();
        System.out.print ("Please enter first number : ");
        c=scan.nextInt ();
        //this code is comparing without equal values  compares only largest to smallest without equalization
        if((a<b)&&(a<c)){
            if(b<c){
                System.out.println ("a < b < c");
            }
            else{
                System.out.println ("a < c < b");
            }
        }else if((b<a)&&(b<c)){
            if(a<c){
                System.out.println ("b < a < c");
            }else{
                System.out.println ("b < c < a");
            }
        }else if(a<b){
                System.out.println ("c < a < b");
            }else{
                System.out.println ("c < b < a");
            }


    }
}
