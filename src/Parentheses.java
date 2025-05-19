import java.util.*;
public class Parentheses {
    public static boolean valid( String s)
    {
        Stack<Character> stack=new Stack<>();
        for (char ch : s.toCharArray()){


            if (ch=='(' || ch=='{' || ch=='[')
            {
                stack.push(ch);

            }

            else if (ch==')' && !stack.isEmpty() && stack.peek()=='(')
            {

                stack.pop();
            }
            else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{')

            {
                stack.pop();
            }
            else if(ch==']' && !stack.isEmpty() && stack.peek()=='[')
            {
                stack.pop();
            }
            else
            {
                return false;

            }
        }
        return stack.isEmpty();

    }
    public static void main(String args[])
    {
        String s="{[";
        System.out.println(valid(s));
    }

}

