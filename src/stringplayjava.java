public class stringplayjava {

    public class StringPlay {

        // return true if every character appears twice
        public static boolean isDoubloon(String s) {

            for(int i = 0; i < s.length() - 1; i++) {
                for (int j = 0; j < s.length(); j++) {

                }
            }
            return true;
        }

        // Return true if the letters in s are in
        // alphabetical order
        public static boolean isAbecedarian(String s) {
            s = s.toLowerCase();
            for (int i =0; i < s.length() - 1; i++)
                if (s.charAt(i) >= s.charAt(i+1))
                    return false;
            return true;
        }

        public static int countVowels(String s) {
            s = s.toUpperCase();
            int cnt = 0;   // vowel counter

            // for i in range(len(s)):
            for (int i = 0; i < s.length() ; i++) {
                char ch = s.charAt(0);
                if (ch == 'A' || ch == 'E' || ch == 'I' ||
                        ch == 'O' || ch == 'U') {
                    cnt++;
                }
            }
            return cnt;
        } // countVowels

        public static void main(String[] args) {
            String s = "Hello";

            String t = "Hippopotomonstrosesquippedaliophobia";

            // a function declared on an object
            // is called a method. s is a String object
            // methods are called using the dot "." notation
            System.out.println(s.length());
            System.out.println(t.length());

            // Terminology: s and t are instances of the class
            // String.
            // An object is an instance of a class.

            System.out.println(s.toUpperCase());

            // Python syntax t[10]
            System.out.println(t.charAt(10));

            // countVowels is a function. We are not calling
            // it on an object using the dot notation
            System.out.println(countVowels(s));
            System.out.println(countVowels(t));
            System.out.println(isAbecedarian("bioPsy"));
            System.out.println(isAbecedarian("esophagographers"));

            for (char ch = 'a'; ch <= 'z'; ch++) {
                System.out.printf("%c = %d\n", ch, (int) ch);
            }

            for (char ch = 1; ch <= 'Z'; ch++) {
                System.out.printf("%c = %d\n", ch, (int) ch);
            }
        }

    }
}
