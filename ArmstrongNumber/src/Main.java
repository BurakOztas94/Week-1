import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter a number for summing decimals : " );
            int number = scan.nextInt ();    //Defining input number
            int number1 = number;
            int number2 = number;

            int digit1 ,  sum = 0, numberCounter = 0;

            while (number != 0)
                {
                    numberCounter++;
                    number /= 10;
                }

            while (number1 != 0)
                {
                    digit1 = number1 % 10;
                    sum += (int) Math.pow ( digit1 , numberCounter );
                    number1 /= 10;
                }
            if ( number2 == sum )
                {
                    System.out.println ( number2 + " = " + sum + " is an Armstrong Number" );
                }
            else
                {
                    System.out.println ( "Not an Armstrong Number" );
                }

        }
}