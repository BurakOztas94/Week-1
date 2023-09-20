import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {
            Scanner scan=new Scanner ( System.in );
            System.out.print ("Please enter a number : ");
            byte number = scan.nextByte ();

            System.out.println ("This number "+ (double)number + " is double");
            System.out.println ("This number "+ (long)number + " is long");
            System.out.println ("This number "+ (float)number + " is float");
            System.out.println ("This number "+ (int)number + " is integer");
            System.out.println ("This number "+ (short)number + " is short");
            System.out.println ("This number "+ number + " is byte");

        }
}
