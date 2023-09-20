import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {
            Scanner scan=new Scanner ( System.in );
            System.out.print ("How many number are you entering? : ");
            int n=scan.nextInt ();

            int i=1;
            while (n!=0){

                System.out.print (i+". number = ");
                int number=scan.nextInt ();

                for(int j =0;j<number;j++){
                    if(j<number){
                        System.out.println (j +" is maximum number");
                    }else if(j>number){
                        System.out.println (j+" is minimum number");
                    }else {
                        System.out.println ("All of the numbers are equal ");
                    }


                }

                n--;
                i++;

            }

        }
}
