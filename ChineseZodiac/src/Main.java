import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        Scanner scan =new Scanner (System.in);
        System.out.print ("Please enter your 4 digit year of birth : ");
        int birthYear=scan.nextInt ();
        int modeOfBirthYear=birthYear%12;
        //I am tired of adding comment lines i guess this one is obvious :D
        switch (modeOfBirthYear) {
            case 0 -> System.out.println ("Monkey");
            case 1 -> System.out.println ("Rooster");
            case 2 -> System.out.println ("Dog");
            case 3 -> System.out.println ("Pig");
            case 4 -> System.out.println ("Rat");
            case 5 -> System.out.println ("Ox");
            case 6 -> System.out.println ("Tiger");
            case 7 -> System.out.println ("Rabbit");
            case 8 -> System.out.println ("Dragon");
            case 9 -> System.out.println ("Snake");
            case 10 -> System.out.println ("Horse");
            case 11 -> System.out.println ("Goat");
            default -> System.out.println ("Something Wrong please only enter 4 digit year");
        }
    }
}
