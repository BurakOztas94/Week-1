import java.util.Scanner;
public class Main {
    public static void main ( String[] args ) {
        int month, day;

        Scanner scan = new Scanner (System.in);
        System.out.print ("Birth month : ");
        month = scan.nextInt ();
        //Month value defined before if statement begins for priority purpose

        if (month >= 1 && month <= 12) {

            System.out.print ("Birth day : ");
            day = scan.nextInt ();
            //Before month value is not in range,day input do not run this is why we define here


            if (month == 1) {
                if (day>0 &&day < 22) {
                    System.out.println ("Your horoscope is Capricorn ");
                } else if(day>21&&day<32){
                    System.out.println ("Your horoscope is Aquarius ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }
            //Every if else block defined with 1 to 12 numbers are made
            // by same logic in defined ranges for horoscopes

            if (month == 2) {
                if (day>0 &&day < 23) {
                    System.out.println ("Your horoscope is Aquarius ");
                } else if(day>22&&day<30){
                    System.out.println ("Your horoscope is Pisces ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 29");
                }

            }
            if (month == 3) {
                if (day>0 &&day < 22) {
                    System.out.println ("Your horoscope is Pisces ");
                } else if(day>21&&day<32){
                    System.out.println ("Your horoscope is Aries ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }
            if (month == 4) {
                if (day>0 &&day < 21) {
                    System.out.println ("Your horoscope is Aries ");
                } else if(day>22&&day<31){
                    System.out.println ("Your horoscope is Taurus ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 30");
                }

            }

            if (month == 5) {
                if (day>0 &&day < 22) {
                    System.out.println ("Your horoscope is Taurus ");
                } else if(day>21&&day<32){
                    System.out.println ("Your horoscope is Gemini ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }
            if (month == 6) {
                if (day>0 &&day < 23) {
                    System.out.println ("Your horoscope is Gemini ");
                } else if(day>22&&day<31){
                    System.out.println ("Your horoscope is Cancer ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 30");
                }

            }
            if (month == 7) {
                if (day>0 &&day < 24) {
                    System.out.println ("Your horoscope is Cancer ");
                } else if(day>23&&day<32){
                    System.out.println ("Your horoscope is Leo ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }
            if (month == 8) {
                if (day>0 &&day < 24) {
                    System.out.println ("Your horoscope is Leo ");
                } else if(day>23&&day<32){
                    System.out.println ("Your horoscope is Virgo ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }
            if (month == 9) {
                if (day>0 &&day < 24) {
                    System.out.println ("Your horoscope is Virgo ");
                } else if(day>23&&day<32){
                    System.out.println ("Your horoscope is Libra ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 30");
                }

            }
            if (month == 10) {
                if (day>0 &&day < 23) {
                    System.out.println ("Your horoscope is Libra ");
                } else if(day>22&&day<32){
                    System.out.println ("Your horoscope is Scorpio ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }

            if (month == 11) {
                if (day>0 &&day < 22) {
                    System.out.println ("Your horoscope is Scorpio ");
                } else if(day>21&&day<31){
                    System.out.println ("Your horoscope is Sagittarius ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 30");
                }

            }

            if (month == 12) {
                if (day>0 &&day < 23) {
                    System.out.println ("Your horoscope is Sagittarius ");
                } else if(day>22&&day<32){
                    System.out.println ("Your horoscope is Capricorn ");
                }else {
                    System.out.println ("Your input is wrong and should be between 1 to 31");
                }

            }

        }else {
            System.out.println ("Your input must be between 1 to 12");
            // This line is for control of month input before day input is taken
        }

    }
    }

