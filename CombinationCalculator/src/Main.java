import java.util.Scanner;

public class Main {
    public static void main( String[] args )
        {
        int N,R,factorialOfN=1,factorialOfR=1,factorialNMinusR=1;

            Scanner scan = new Scanner ( System.in);
            System.out.print ("Please enter number 1 :");
            N=scan.nextInt ();
            System.out.print ("Please enter number 2 :");
            R=scan.nextInt ();

            if(N>=R&&N>0&&R>0){

                for(int i=1;i<=N;i++){
                    factorialOfN *= i;

                }
                //Number N's factorial is calculated

                for(int j=1;j<=R;j++){
                    factorialOfR *= j;

                }
                //Number R's factorial is calculated

                for(int k=1;k<=(N-R);k++){
                    factorialNMinusR *= k;

                }
                //The subtraction of the factorial of N and the factorial of R is calculated.

                System.out.print ("The combination of " +N + " elements from a set of  " + R +" is :  " +(factorialOfN/(factorialOfR*factorialNMinusR)));


            }else {
                System.out.println ("First number should be equal or greater than second number! And please enter non zero values! ");
                //If undefined numbers entered than this else statement solves the error
            }

        }
}
