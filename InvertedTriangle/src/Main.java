
import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter number for your star diamond size : ");
            int number = scan.nextInt ();


            for (int i = number ;i >= 0;i--)
                {
                    for (int j = 1;j <= (number - i);j++)
                        {
                            System.out.print (" "); //This line is for adjusting triangle shape
                        }

                    for (int k = 1;k <= 2 * i - 1;k++)
                        {
                            System.out.print ("*"); //Print stars to create an inverted triangle shape
                        }
                    System.out.println ();  //This line is for jumping next line to create a shape
                }

        }
}