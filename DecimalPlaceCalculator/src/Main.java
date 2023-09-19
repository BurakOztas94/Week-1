import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter a number for summing decimals : " );
            int number = scan.nextInt ();    //Defining input number

            int sum = 0, numberCounter = 0;  /*Unnecessary number counter definition.This is just an extra for calculation of
                                         how many decimal the number have */
            while (number != 0)
                {

                    numberCounter++;    //This code is counts numbers
                    sum += number % 10;     //This code is summing numbers that are divided by 10 digit by digit
                    number /= 10;         //This code is for while loop to evaluate and decrease number.

                }
            System.out.println ( "The number you entered has -" + numberCounter + "- digits. \nThe sum of digits is : " + sum );

        }
}
