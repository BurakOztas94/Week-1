import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {
            Scanner scan = new Scanner ( System.in );
            int fibonacci =scan.nextInt ();         //Input for how many number we want to calculate

            int n1=0,n2=1,n3;
            System.out.print (n1 + " "+ n2);        //First two number of fibonacci
            for (int i=2;i<fibonacci;++i){          //Loop for calculating fibonacci i must be less than fibonacci
                n3=n2+n1;
                System.out.print (" " + n3);
                n1=n2;
                n2=n3;
            }

        }
}
