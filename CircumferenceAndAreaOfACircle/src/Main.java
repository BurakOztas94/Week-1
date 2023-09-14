import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print ("Please enter perimeter of circle : ");
        double r = input.nextDouble ();
        double circumference = 2*r*Math.PI;
        double area=Math.PI*Math.pow ( r,2 );
        System.out.println ("Circumference of Circle is : "+circumference + "\n"+"Area of Circle is :"+ area);

    }
}
