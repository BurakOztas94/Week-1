import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int heat;
        Scanner scan =new Scanner (System.in);
        System.out.print ("Enter air temperature : ");
        heat =scan.nextInt ();

        if(heat<5){
            System.out.println ("You should go Skiing ");
        }else if (heat<=25){
            if(heat<=15){
                System.out.println ("You should go to Cinema ");
            }if(heat<=10){
                System.out.println ("You should  go to Picnic ");
            }
            else {
                System.out.println ("You should go Swimming ");
            }
        }


    }
}
