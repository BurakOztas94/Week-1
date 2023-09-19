import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter number for your star diamond size : ");
            int number = scan.nextInt ();

            //The diamond's triangle's upper side
            for (int i = 1;i <= number;i++)
                {
                    for (int j = 1;j <= (number - i);j++)
                        {
                            System.out.print (" ");
                        }

                    for (int k = 1;k <= (2 * i) - 1;k++)
                        {
                            System.out.print ("*");
                        }
                    System.out.println ();
                }
            //The underside of the diamond's triangle
            for (int i = number - 1;i >= 0;i--)
                {
                    for (int j = 1;j <= (number - i);j++)
                        {
                            System.out.print (" ");
                        }

                    for (int k = 1;k <= 2 * i - 1;k++)
                        {
                            System.out.print ("*");
                        }
                    System.out.println ();
                }

        }
}
