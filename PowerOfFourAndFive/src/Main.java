import java.util.Scanner;

public class Main {
    public static void main( String[] args )
        {
            int n;
            Scanner scan = new Scanner ( System.in );
            n = scan.nextInt ();

            System.out.println ( "Fourth power\tFifth power " ); //Header

            for ( int i = 1;i <= n;i++ )
                {

                    System.out.println ( (int) Math.pow ( i , 4 ) + "\t\t\t\t\t" + (int) Math.pow ( i , 5 ) );
                    //Printing power of given number

                }

        }
}
