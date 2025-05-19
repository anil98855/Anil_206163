public class LongestSubString {



        public static int longestWordWithSubstring(String[] dict, String toSearch) {
            int maxlength=0;
            for(int i=0;i<dict.length;i++)
            {
                if(dict[i].contains(toSearch))
                {
                    int distance =dict[i].length();
                    if(distance >maxlength)
                    {
                        maxlength=distance;
                    }
                }
            }
            return maxlength;
        }

        public static void main(String[] args) {
            String[] dict = {"CODGE", "ODG", "LODGES", "SODG", "dodge", "mODJ", "LODGESSSS"};
            String toSearch = "ODG";

            int result = longestWordWithSubstring(dict, toSearch);
            System.out.println("Length of the longest word containing '" + toSearch + "': " + result);
        }
    }


