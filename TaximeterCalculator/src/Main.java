import java.util.Scanner;
public class Main {
    public static void main (String[]args){

        double perKm =2.20,total ,startPrice=10;

        Scanner scan=new Scanner ( System.in );
        System.out.print ("Enter distances as a form of kilometer : ");
        int km = scan.nextInt ();
        total=km*perKm+10;
        System.out.print ("You should pay : " + (total>20 ?total : 20));

    }
}
