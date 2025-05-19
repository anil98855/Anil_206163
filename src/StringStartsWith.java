
import java.util.*;
public class StringStartsWith {


    public static List<String> prefixmatch(String[] words, String prefix) {
        ArrayList<String> al=new ArrayList<>();
        int preflength= prefix.length();
        for(String word :words)
        {
            if(word.length() >=preflength)
            {
                boolean isMatch =true;
                for(int i=0;i<preflength;i++)
                {
                    if(word.charAt(i) !=prefix.charAt(i)){
                        isMatch =false;
                        break;
                    }
                }
                if(isMatch)
                {
                    al.add(word);
                }
            }


        }

        return al;
    }


    public static void main(String[] args) {
        String[] arr = {"apple", "applet", "bread", "aper"};
        String prefix = "app";

        List<String> matchedWords = prefixmatch(arr, prefix);
        System.out.println("Words starting with '" + prefix + "': " + matchedWords);

    }
}
