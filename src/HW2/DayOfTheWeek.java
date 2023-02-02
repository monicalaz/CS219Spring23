package HW2;
import java.util.Scanner;

public class DayOfTheWeek {
    public static int dayoftheweek( int month, int day, int year){
            int y0 = year - (14- month)/12;
            int x = y0 +y0 / 4 -y0/ 100 +y0/ 400;
            int m0 = month + 12 * ((14 - month) / 12) -2;
            int d0 = ( day + x + (31 * m0) /12) % 7;

            return d0;

        }

    public static void main(String [] args){

            Scanner kbd = new Scanner(System.in);

            System.out.print("Enter a month in integer form: ");
            int month = kbd.nextInt();
            System.out.print("Enter a day in integer form: ");
            int day = kbd.nextInt();
            System.out.print("Enter a year in integer form: ");
            int year = kbd.nextInt();


            System.out.println(dayoftheweek (month, day, year));
        }
    }

