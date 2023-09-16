import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            int n;
            int  total=0;
            Scanner scan=new Scanner ( System.in );
            //This is a comment line for nothing
            do
                {
                    System.out.print ("Please enter number :");
                    n=scan.nextInt ();
                    if(n%4==0){
                        total+=n;
                    }
                } while (n>0);
                    System.out.println ("Total    : "+total);
        }
}
