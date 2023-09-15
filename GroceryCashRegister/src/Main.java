import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {

        double pear = 2.14, apple = 3.67, tomatoes = 1.11, banana = 0.95, eggplant = 5;
        Scanner scan = new Scanner (System.in);
        System.out.print ("Please enter amount of pear as kilograms : ");
        double pearAmount = scan.nextDouble ();
        System.out.print ("Please enter amount of apple as kilograms : ");
        double appleAmount = scan.nextDouble ();
        System.out.print ("Please enter amount of tomatoes as kilograms : ");
        double tomatoesAmount = scan.nextDouble ();
        System.out.print ("Please enter amount of banana as kilograms : ");
        double bananaAmount = scan.nextDouble ();
        System.out.print ("Please enter amount of eggplant as kilograms : ");
        double eggplantAmount = scan.nextDouble ();
        double total =
                        pear * pearAmount +
                        apple * appleAmount +
                        tomatoes * tomatoesAmount +
                        banana * bananaAmount +
                        eggplant * eggplantAmount;
        System.out.println ("Total check :" + total);


    }
}
