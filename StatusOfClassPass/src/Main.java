import java.util.Scanner;
public class Main {
    public static void main ( String[] args ) {

        int math,physics,english,chemistry,music;   //Defining exam result variables
        Scanner scan = new Scanner (System.in);
        System.out.print ("Math result : ");
        math=scan.nextInt ();
        System.out.print ("Physics result : ");
        physics=scan.nextInt ();
        System.out.print ("English result : ");
        english=scan.nextInt ();
        System.out.print ("Chemistry result : ");
        chemistry=scan.nextInt ();
        System.out.print ("Music result : ");
        music=scan.nextInt ();

        double average =(double)(math+physics+english+chemistry+music)/5;
        System.out.println ("Your average : " + average +"\n"
                +( average<=55?"You failed , next time! - Work harder!"
                :"Congratulations you have passed!"));
        //Ternary operator if average is not equal and greater than 55 , you failed else you passed


    }
}
