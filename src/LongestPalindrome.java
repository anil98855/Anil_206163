public class LongestPalindrome {


        public static String longestPalindrome(String s) {
            String res = "";
            int maxLength =0;
            for(int i=0; i < s.length(); i++){
                // ODD
                int l=i, r=i;
                while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                    if(r - l +1 > maxLength){
                        maxLength = r - l +1;
                        res = s.substring(l, r+1);
                    }
                    l--;
                    r++;
                }

                // Even
                l=i; r=i+1;
                while(l>=0 && r < s.length() && s.charAt(l) == s.charAt(r)){
                    if(r - l +1 > maxLength){
                        maxLength = r - l +1;
                        res = s.substring(l, r+1);
                    }
                    l--;
                    r++;
                }

            }
            return res;
        }
        public static void main(String[] args)
        {
            String str="Geekforssrofkshele";
            System.out.println(longestPalindrome(str));
        }
    }


