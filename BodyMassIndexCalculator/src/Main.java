import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {

        Scanner scan=new Scanner ( System.in );
        System.out.print ("Please enter your height as meter format with using comma : ");
        double height = scan.nextDouble ();
        System.out.print ("Please enter your weight as kilograms format  : ");
        int weight = scan.nextInt ();
        System.out.print ("Your BMI : " + (weight/(Math.pow ( height,2 ))));

    }
}
