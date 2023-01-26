package HW1;

public class Time {

    public static void main(String [] args) {
         int hour = 16;
         int minute = 43;
         int seconds = 25;
         int seconds_passed = hour * 3600 + minute * 60 + seconds;
         int seconds_leftover = 86400 - seconds_passed;
         int percent_elapsed = (seconds_passed * 100) / 86400;



        System.out.println("Homework 1");
        System.out.println(hour + ":" + minute + ":" + seconds + " is " + seconds_passed + " seconds since midnight." );
        System.out.println("There are " + seconds_leftover + " seconds remaining.");
        System.out.println( percent_elapsed +"% of the day has elapsed.");

    }
}

