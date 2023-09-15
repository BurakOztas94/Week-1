import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        //Defining input numbers

        double n1,n2;
        //Defining selection numbers
        int select;

        Scanner scan=new Scanner (System.in);
        //importing scanner class
        System.out.print ("Please enter first number : ");
        n1=scan.nextInt ();
        //importing number 1
        System.out.print ("Please enter second number : ");
        n2=scan.nextInt ();
        //importing number 2

        System.out.print ("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n");
        //Selection message
        System.out.print ("Your selection : ");
        //
        select = scan.nextInt ();
        //importing selection number

        switch (select) {
            case 1 -> System.out.println ("Addition result : " + ( n1 + n2 ));
            case 2 -> System.out.println ("Subtraction result : "+ ( n1 - n2 ));
            case 3 -> System.out.println ("Multiplication result : "+ ( n1 * n2 ));
            case 4 -> System.out.println ("Division result : "+ ( n1 / n2 ));
            default -> System.out.println ("Wrong selection !");
        }
    }
}