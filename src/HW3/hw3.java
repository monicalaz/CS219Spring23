package HW3;

public class hw3 {


        /**
         *   codingbat.com/java
         *   When squirrels get together for a party, they like to have cigars.
         *   A squirrel party is successful when the number of cigars is between
         *   40 and 60, inclusive. Unless it is the weekend, in which case there
         *   is no upper bound on the number of cigars. Return true if the
         *   party with the given values is successful, or false otherwise.
         *
         *       cigarParty(30, false) → false
         *       cigarParty(50, false) → true
         *       cigarParty(70, true) → true
         */

        public static boolean cigarParty(int cigars, boolean isWeekend) {

            return (40 <= cigars && cigars <= 60) ||
                    (isWeekend && cigars >= 40); // fill in function body
        }


        /**
         *  You are driving a little too fast, and a police officer stops you.
         *  Fill in function below to compute the result, encoded as an int
         *  value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is
         *  60 or less, the result is 0. If speed is between 61 and 80 inclusive,
         *  the result is 1. If speed is 81 or more, the result is 2.
         *  Unless it is your birthday -- on that day, your speed can be
         *  5 higher in all cases.
         *
         *  caughtSpeeding(60, false) → 0
         *  caughtSpeeding(65, false) → 1
         *  caughtSpeeding(65, true) → 0
         */

        public static int caughtSpeeding(int speed, boolean isBirthday) {
            int adjust = 0;

            if (isBirthday)
                adjust = 5;

            if (speed <= 60 + adjust)
                return 0;
            else if (speed <= 80 + adjust)
                return 1;
            else
                return 2;
        }

        /**
         * Return true if d1, d2, d3 are in either ascending or descending order.
         * Otherwise return false
         */
        public static boolean ordered(int d1, int d2, int d3) {
            if (d1 > d2 && d1 > d3 )
                return true;
            else if (d3>d2 && d2>d1)
                return true;

            return false; // fill in function body
        }



        /**
    * The number 6 is a truly great number. Given two int values,
         * a and b, return true if either one is 6. Or if their sum or
         * difference is 6. Note: the function Math.abs(num) computes the
         * absolute value of a number.
         */
        public static boolean love6(int a, int b) {
            int sum = a + b;
            int difference = Math.abs(a-b);
            int difference2 = Math.abs(b-a);

            if (a == 6 || b == 6)
                return true;
            else if (a+b == 6)
                return true;
            else if ( sum == 6)
                return true;
            else if (difference ==6)
                return true;
            else return difference2 == 6;
        }

        /**
         * You have a lottery ticket with integers a, b, and c, each of which is
         * 0, 1, or 2. If they are all 2, your winnings are $10. Otherwise, if
         * they are all the same, your winnings are $5. Otherwise, so long as both
         * b and c are different from a, the result is $1. Otherwise the result is $0.
         *
         * redTicket(2, 2, 2) → 10
         * redTicket(2, 2, 1) → 0
         * redTicket(0, 0, 0) → 5
         */
        public static int redTicket(int a, int b, int c){
        if(a==b&&b==c)
        {
            if(a==2) return 10;
            else return 5;
        }
        else if(b!=a&&c!=a) return 1;
        else return 0;
    }

        /**
         * You have a blue lottery ticket, with ints a, b, and c on it.
         * This makes three pairs, which we'll call ab, bc, and ac. Consider the
         * sum of the numbers in each pair. If any pair sums to exactly 10,
         * the result is 10. Otherwise, if the ab sum is exactly 10 more than either
         * bc or ac sums, the result is 5. Otherwise, the result is 0.
         *
         *  blueTicket(9, 1, 0) → 10
         *  blueTicket(9, 2, 0) → 0
         *  blueTicket(6, 1, 4) → 10
         */
        public static int blueTicket(int a, int b, int c) {
            if (a + b == 10 || b + c == 10 || c + a == 10){
                return 10;
            }
            if(a == c + 10 || b == c + 10){
                return 5;
            }
            return 0;
        }


        /**
         * Given two ints, each in the range 10..99, return true if there is a
         * digit that appears in both numbers, such as the 2 in 12 and 23.
         * Reminder: n/10, gives the left digit while the % "mod" n%10 gives
         * the right digit.
         *
         *
         *  shareDigit(12, 23) → true
         *  shareDigit(12, 43) → false
         *  shareDigit(12, 44) → false
         */
        public static boolean shareDigit(int x, int y) {
            if(x/10==y/10||x/10==y%10)
            {
                return true;
            }
            else if((x%10==y%10||x%10==y/10))
            {
                return true;
            }
            return false;

        }


        public static void main(String[] args) {

            System.out.println(cigarParty(30,false));
            System.out.println(cigarParty(50, false));
            System.out.println(cigarParty(70, true));



            System.out.println(caughtSpeeding(60, false) == 0);
            System.out.println(caughtSpeeding(65, false)==1);
            System.out.println(caughtSpeeding(65, true)==0);
            System.out.println(caughtSpeeding(81, false)==2);
            //
            // finish caughtSpeeding tests

            // write ordered tests
            System.out.println(ordered(1,2,3));
            System.out.println(ordered(3,2,1));
            System.out.println(!ordered(9,1,8));

            System.out.println(love6(13,7));
            System.out.println(love6(7, 13));
            System.out.println(love6(6,6));
            System.out.println(love6(2,5));

            System.out.println(redTicket(2, 2, 2) == 10);
            System.out.println(redTicket(2, 2, 1) == 0);
            System.out.println(redTicket(0, 0, 0) == 5);
            System.out.println(redTicket(0, 3, 4) == 1);

            System.out.println(blueTicket(9, 1, 0) == 10);
            System.out.println(blueTicket(9, 2, 0) == 0);
            System.out.println(blueTicket(6, 1, 4) == 10);
            System.out.println(blueTicket(14, 14, 4) == 5);

            System.out.println(shareDigit(12, 23));
            System.out.println(shareDigit(12, 43));
            System.out.println(shareDigit(12, 44));


        }

    }  // class LogicExercises

