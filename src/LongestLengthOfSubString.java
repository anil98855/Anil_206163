public class LongestLengthOfSubString {

        public static void main(String[] args) {
            String str = "aabbbbCCddd";
            findLongestSameCharSubstring(str);

        }

        public static void findLongestSameCharSubstring(String s) {
            if (s == null || s.isEmpty())
            {

                System.out.println("empty");
            }

            int maxLen = 1, currLen = 1;
            int maxStart = 0, currStart = 0;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) == s.charAt(i - 1)) {
                    currLen++;
                } else {
                    currLen = 1;
                    currStart = i;
                }

                if (currLen > maxLen) {
                    maxLen = currLen;
                    maxStart = currStart;
                }
            }

            // Output the result: maxLen and the longest substring
            System.out.println(maxStart+"    " +maxLen+"Longest substring: " + s.substring(maxStart, maxStart + maxLen));
        }
    }


