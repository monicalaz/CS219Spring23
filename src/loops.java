public class loops {

    public class Loopy {

        // Will detect an error in a single digit
        // of n.
        public static int checksum(int n) {
            int sum = 0;

            while (n > 0) {
                sum = sum + n % 10;
                n = n / 10;
            }
            return sum % 10;
        }

        public static void main(String[] args) {
            System.out.println(checksum(5793) == 4);
            System.out.println(checksum(0b100) == 4);

            // negative test
            System.out.println(checksum(5793) != 8);
        }

    }
}
