import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {

            Scanner scan=new Scanner ( System.in );
            System.out.print ("How many number are you entering  : ");
            int n=scan.nextInt ();

            if(n<0){
                System.out.println ("Wrong input");
            }else{



            //Update needed code next time
            int min=0;
            int max=0;
            int number;

            for(int i = 1; i<=n;i++){
                System.out.print ("Enter number " +i+". = ");
                number=scan.nextInt ();
                if(number<min||min==0){
                    min=number;

                }if(number>max){
                    max=number;

            }
            }

            System.out.println ("Max number is = " +max);
            System.out.println ("Min number is = " +min);

        } }
}
