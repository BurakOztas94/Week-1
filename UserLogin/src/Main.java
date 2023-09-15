import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        String userName ,password;

        Scanner scan = new Scanner (System.in);
        System.out.print ("User Name : ");
        userName = scan.nextLine ();
        System.out.print ("Password : ");
        password = scan.nextLine ();
        //inputting information
        if (userName.equals ("Tombul")&&password.equals ("Kedi"))   //Username and password comparison
                System.out.println ("You joined the party Willkommen!");    //True enter
            else            System.out.println ("Your information is wrong please try again "); //Wrong try again
        }

    }


