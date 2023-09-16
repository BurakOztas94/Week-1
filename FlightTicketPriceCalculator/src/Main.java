import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int distance,passengerAge,flightType;
        //Flight type 1 one way ticket
        //Flight type 2 round trip ticket
        double totalPrice, pricePerKm=0.10;
        Scanner scan = new Scanner (System.in);

        System.out.print ("Please enter distance ");
        distance = scan.nextInt ();

        if(distance>0) {
            //First we got distance and connected last else line for blocking 0 or below distances
            totalPrice=pricePerKm*distance; //Only total price calculation

            System.out.print ("Please enter your age ");
            passengerAge= scan.nextInt ();

            if(passengerAge>0) {
            //Second we got passenger age and controlled 0 or not condition
                System.out.print ("Please enter your flight type (1 = > One Way  , 2 = > Round Trip ) :");
                flightType = scan.nextInt ();

                if(flightType==1||flightType==2)
                {
                    //Lastly we got flight type and defined calculations below
                    if (flightType == 1)
                    {
                        /*For flight type there is no round trip discount so that you will not see any %20 discount
                        until flight type 2*/
                        System.out.println ("Selected flight type is : One Way");
                        System.out.println ("Normal price : "+totalPrice);
                        if(passengerAge<12)
                        {
                            //For passenger whose ages are below 12 we multiplied with %50 percent to get discount
                            System.out.println ("Discount  : "+totalPrice*0.5);
                            System.out.println ("Discounted price : "+totalPrice*0.5);
                        }
                        else if (passengerAge<24)
                        {
                            /*For passenger whose ages are below 24 and above 12 we
                            multiplied with %10 percent to get discount and %90 became discounted amount
                             */
                            System.out.println ("Discount : "+totalPrice*0.1);
                            System.out.println ("Discounted price : "+totalPrice*0.9);
                        }
                        else if (passengerAge>65)
                        {
                              /*For passenger whose ages are above 65 we
                            multiplied with %30 percent to get discount and %70 became discounted amount
                             */
                            System.out.println ("Discount : "+totalPrice*0.3);
                            System.out.println ("Discounted price : "+totalPrice*0.7);
                        }

                    }

                    if (flightType == 2)
                    {        /* Normal price shown in the first step for flight type 2
                             */
                        System.out.println ("Selected flight type is : Round Trip");
                        System.out.println ("Normal price : "+totalPrice*2);
                        if(passengerAge<12)
                        {
                            /*With same logic for passenger whose ages are below
                            12 we multiplied with %50 percent to get discount but this time
                            distance doubled and additional discount was applied.
                            For additional discount is applied on %20 for calculating discount and %80 is applied for final price
                            with same logic calculations were applied below
                             */
                            System.out.println ("Discount  : "+(2*totalPrice*0.5)*0.2);
                            System.out.println ("Discounted price : "+(2*totalPrice*0.5)*0.8);
                        }else if (passengerAge<24){
                            System.out.println ("Discount : "+(2*totalPrice*0.1)*0.2);
                            System.out.println ("Discounted price : "+(2*totalPrice*0.9)*0.8);
                        } else if (passengerAge>65) {
                            System.out.println ("Discount : "+(2*totalPrice*0.3)*0.2);
                            System.out.println ("Discounted price : "+(2*totalPrice*0.7)*0.8);
                        } else {
                            System.out.println ("Discount : "+2*totalPrice*0.2);
                            System.out.println ("Discounted price : "+2*totalPrice*0.8);
                        }

                    }

                }
                else
                {
                    //this line is for limitation purpose for flight type
                    System.out.print ("Please enter valid flight type ,flight type must be 1 or 2");
                }
            }
            else
            {
                //this line is for limitation purpose for age
                System.out.print ("Please enter valid age ,age must be over 0 ");
            }
        }
        else
        {
            //this line is for limitation purpose for distance
            System.out.print ("Please enter valid distance ,distance must be over 0 ");
        }

    }
}
