public class ReversingOnlyVowels {


        public static boolean isVowel(char ch)
        {
            String vowels = "aeiouAEIOU";
            return vowels.indexOf(ch) != -1;

        }
        public static void main(String[] args) {
            String str= "IceCream";


            System.out.println(reverseVowel(str));
        }
        private static String reverseVowel(String str) {
            char ch[]=str.toCharArray();
            int left=0;
            char temp=' ';
            int right=str.length()-1;

            while(left <right)
            {
                while(left<right && !isVowel(ch[left]))
                {
                    left ++;
                }
                while(left<right && !isVowel(ch[right]))
                {
                    right --;
                }
                temp= ch[left];
                ch[left]=ch[right];
                ch[right]=temp;
                left ++;
                right --;

            }


            return String.valueOf(ch);
        }
    }


