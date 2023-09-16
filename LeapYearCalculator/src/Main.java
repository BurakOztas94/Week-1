import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner (System.in);
            System.out.print ("Please enter year : ");
            int year = scan.nextInt ();

            if (year % 4 == 0)
                {
                    if (year % 100 == 0)
                        {
                            if (year % 400 == 0)
                                {
                                    System.out.println (year + " is a Leap year"); //Divided by 400,100 and 4
                                }
                            else
                                {
                                    System.out.println (year + " is not a leap year");// Divided by only 100 and 4
                                }
                        }
                    else
                        {
                            System.out.println (year + " is a leap year");  //Divided by only 4
                        }

                }
            else
                {
                    System.out.println (year + " is not a leap year");  //Except defined conditions
                }


        }
}
