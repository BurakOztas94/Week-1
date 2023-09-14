import java.util.Scanner;
 public class Main {
    public static void main(String[] args) {
        double amount,taxRatioTo1000 = 0.18,taxRatioOver1000=0.08;
        Scanner scan= new Scanner(System.in);
        System.out.print("Please enter total price : ");
        amount = scan.nextDouble();
        double taxAmountTo1000=amount*taxRatioTo1000;
        double taxAmountOver1000=amount*taxRatioOver1000;
        double taxAddedAmountTo1000=amount+taxAmountTo1000;
        double taxAddedAmountOver1000=amount+taxAmountOver1000;
        System.out.println("Tax ratio : % "+ (amount<=1000 ?(100*taxRatioTo1000):(100*taxRatioOver1000)));
        System.out.println("Tax amount : "+(amount<=1000?taxAmountTo1000:taxAmountOver1000));
        System.out.println("Tax added amount : "+(amount<=1000?taxAddedAmountTo1000:taxAddedAmountOver1000));
    }
}
