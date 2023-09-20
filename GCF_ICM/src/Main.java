import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Enter number 1 : " );
            int n1 = scan.nextInt ();

            System.out.print ( "Enter number 2 : " );
            int n2 = scan.nextInt ();
            int gcf; //Greatest common factor

            int i = n1;
            while (1 <= i)
                {                       //Greatest common factor finder loop
                    if ( n1 % i == 0 && n2 % i == 0 )
                        {
                            System.out.println ( "Greatest common factor of " + n1 + " and " + n2 + " = " + i );
                            gcf = i;
                            break;
                        }
                    i--;
                }

            System.out.println ( "**********************************" );

            int j = 1;
            while (j <= (n1 * n2))
                {
                    if ( j % n1 == 0 && j % n2 == 0 )
                        {
                            System.out.println ( "Least common multiple of " + n1 + " and " + n2 + " = " + j );
                            break;
                        }

                    j++;
                }


        }
}
