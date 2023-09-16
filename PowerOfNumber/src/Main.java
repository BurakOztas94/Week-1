import java.util.Scanner;

public class Main {
    public static void main( String[] args )
        {
            //This project is not well working project
            //Because of time limit completed quickly and not added bounds
            int n,m;
            Scanner scan = new Scanner ( System.in );
            System.out.print ("Enter first number : ");
            n=scan.nextInt ();
            System.out.print ("Enter first number : ");
            m=scan.nextInt ();
            int total =1;

            for(int i=0; i<=n;i++){
            total*=n;

            }
            System.out.println ("The answer to "+n+" to the power of "+m+" is : "+total);




        }
}
