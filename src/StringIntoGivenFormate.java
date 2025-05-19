public class StringIntoGivenFormate {


        public static String convertString(String input) {
            StringBuilder result = new StringBuilder();
            int count = 1;

            // Loop through the string starting from the second character
            for (int i = 1; i < input.length(); i++) {
                if (input.charAt(i) == input.charAt(i - 1)) {
                    count++;
                } else {
                    result.append(input.charAt(i - 1)).append(count);
                    count = 1;  // Reset count for the new character
                }
            }

            // Add the last character and its count
            result.append(input.charAt(input.length() - 1)).append(count);

            return result.toString();
        }

        public static void main(String[] args) {
            System.out.println(convertString("aabbb"));  // Output: a2b3
            System.out.println(convertString("aaaa"));   // Output: a4
            System.out.println(convertString("a"));      // Output: a1
        }
    }

