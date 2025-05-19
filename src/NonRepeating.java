public class NonRepeating {


        public static char firstNonRepeatingChar(String str) {
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                    return ch;
                }
            }
            return '_'; // Return _ if there's no non-repeating character
        }

        public static void main(String[] args) {
            System.out.println(firstNonRepeatingChar("12345")); // Output: 1
            System.out.println(firstNonRepeatingChar("abbacd")); // Output: c
        }
    }

