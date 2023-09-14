import java.util.Scanner;

public class Main {
    public static void main ( String[] args ) {
        int a, b;
        double c;

        Scanner scan = new Scanner ( System.in );
        System.out.print ( "Please enter first edge : " );
        a = scan.nextInt ();
        System.out.print ( "Please enter second edge : " );
        b = scan.nextInt ();
        c = ( Math.sqrt ( Math.pow ( a , 2 ) + Math.pow ( b , 2 ) ) );
        double u = ( a + b + c ) / 2;
        double area = Math.sqrt ( ( u * ( u - a ) * ( u - b ) * ( u - c ) ) );
        System.out.println ( "Hipotenus of Triangle : " +
                c + "\n" + "Perimeter of Triangle : " +
                "" + u + "\n" + "Area of Triangle : " +
                "" + area );

    }
}
