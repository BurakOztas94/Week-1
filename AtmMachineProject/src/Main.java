import java.util.Scanner;

public class Main {
    public static void main ( String[] args )
        {
            String userName,password;
            Scanner scan =new Scanner (System.in);
            int rights=3;
            int balance =1500;
            int select;
            while (rights>0)
            {
                System.out.print ("Please enter your user name : ");
                userName=scan.nextLine ();
                System.out.print ("Please enter your password name : ");
                password=scan.nextLine ();

                if(userName.equals ( "pat" )&& password.equals ( "dev" ))
                {
                    System.out.println ("Welcome to the Bank PELTE!");
                    do
                        {
                            System.out.println ( "Please select the operation you want!" );
                            System.out.println ( """
                                    1-Deposit
                                    2-Withdraw
                                    3-Balance
                                    4-Exit\s""" );
                            select = scan.nextInt ();

                            switch (select)
                                {
                                    case 1 ->
                                        {
                                            System.out.print ( "Deposit amount : " );
                                            int price = scan.nextInt ();
                                            balance += price;
                                        }
                                    case 2 ->
                                        {
                                            System.out.print ( "Withdraw amount : " );
                                            int price2 = scan.nextInt ();
                                            if ( price2 > balance )
                                                System.out.println ( "Balance insufficient!" );
                                            else

                                                balance -= price2;
                                        }
                                    case 3 -> System.out.println ( "Your balance : " + balance );
                                    default -> System.out.println ( "Wrong" );
                                }


                        } while(select!=4);
                    System.out.println ("We hope you come again!");
                    break;
                }
                else
                {
                    rights--;
                    System.out.println ("Wrong password or user name");
                    if(rights==0)
                    {
                        System.out.println ("Your account blocked.Please call the bank! ");
                    }
                    else
                    {

                        System.out.println ("Remaining rights : " + rights);
                    }

                }


            }




        }
}
