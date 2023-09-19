import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ("Please enter number : ");
            int  number = scan.nextInt ();

            double harmonicSum=0.0;
            for(double i=1;i<=number;i++){
                harmonicSum+=(1/i);

            }
            System.out.println (harmonicSum);
        }
}
