import java.util.Scanner;

public class Main{
    public static void main ( String[] args )
        {
            Scanner scan=new Scanner ( System.in );
            System.out.print ("Please enter a number :");
            int number=scan.nextInt ();
            int sum=0;
            for(int i=1; 1<number/i;i++){       //Calculates all dividable number
                if(number%i==0){
                    sum+=i;                     //this line sums all divisible number
                }
                }
            if (sum==number){                   //Compares sum and number
                    System.out.println (number + " is a perfect number");
                }else {
                    System.out.println (number + " is **NOT** a perfect number");
                }


        }
}
