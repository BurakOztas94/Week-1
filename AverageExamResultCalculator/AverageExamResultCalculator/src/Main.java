import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter your Math score : ");
        int math = scan.nextInt();
        System.out.print("Please enter your Physics score : ");
        int physics = scan.nextInt();
        System.out.print("Please enter your Chemistry score : ");
        int chemistry = scan.nextInt();
        System.out.print("Please enter your Turkish score : ");
        int turkish = scan.nextInt();
        System.out.print("Please enter your history score : ");
        int history = scan.nextInt();
        System.out.print("Please enter your music score : ");
        int music = scan.nextInt();
        //Bu kısma kadar tüm ders girdilerini scanner komutu ile istedik
        double result = (double) (math + physics + chemistry + turkish + history + music) / 6;
        /*Double kısmında tüm integer aldığımız değerleri double olarak hesaplattık eşitliğin sağ tarafına double
         koymamızın nedeni integer sayılar topluluğunda yuvarlama akybı olmasın diye topladıktan sonra double a
         çevirsin program anlasın diye ardından 6 ders olduğundan 6 ya bölerek aritmetik ortalamasını aldık*/
        System.out.println("Average result = "+Math.round(result) + (result >= 60 ? " --> Passed :) " : " --> Failed :( "));
        /*Round kullanarak virgülden sonraki basamakları yuvarlayarak tek sonuç görsün ardından sonuç eğer
        60 a eşit ve büyükse sınama yapsın bütükse geçsin 60 tan küçükse kalsın şeklinde yazdırdık*/
    }
}
