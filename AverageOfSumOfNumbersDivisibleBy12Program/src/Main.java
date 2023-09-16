import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            int s, c = 0, count = 1, sum = 0;
            double average;

            Scanner scan = new Scanner ( System.in );
            System.out.print ( "Please enter number : " );
            s = scan.nextInt ();

            if ( s > 11 || s < -11 ) //We need to define above 12 and below 12 because 3 and 4 both only divided by 12
                {
                    if ( s > 0 ) //For positive numbers
                        {
                            for ( int i = 0;i <= s;i++ )    //We added increment because of positive numbers
                                {
                                    if ( i % 3 == 0 && i % 4 == 0 )
                                        {
                                            sum += i;   //Code that sums divisible  numbers which are 3 and 4
                                            count = c;  //Count is for how many number we get for using average
                                            ++c;    /*for count calculation purposes
                                             if c does not increase then count does not work*/
                                        }

                                }
                            average = (double) sum / count;
                            /*The average is calculated by summing the numbers and then
                             dividing the total by the count of relevant numbers.*/
                            System.out.println ( "Average of divisible numbers which are 3 and 4 :" + average );
                        }

                     if ( s < 0 )   //Same function logic for negative numbers similar above
                        {
                            for ( int i = 0;i >= s;i-- ) //We decrement because of negative numbers and sum them below
                                {
                                    if ( i % 3 == 0 && i % 4 == 0 )
                                        {
                                            sum += i;
                                            count = c;
                                            ++c;
                                        }

                                }
                            average = (double) sum / count;
                            /*The average is calculated by summing the numbers and then
                             dividing the total by the count of relevant numbers.This statement is for
                             negative numbers*/
                            System.out.println ( "Average of divisible numbers which are 3 and 4 :" + average );
                        }
                }
            else
                {
                    System.out.println ( "Given number is **NOT** divisible both 3 and 4 numbers " );
                }
        }
}



