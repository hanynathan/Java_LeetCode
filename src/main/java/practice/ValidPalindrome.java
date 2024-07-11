package practice;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValidPalindrome
{
    Logger logger = Logger.getLogger(getClass().getName());
    public boolean isPalindrome(String s) {
        boolean isPalindrome = true;

        s = s.toLowerCase().replaceAll("[^a-z0-9]","");

        int length = 0;
        if(s.length() % 2 == 0)
        {
            length = s.length() / 2;
        }else
        {
            length = (s.length() - 1) / 2;
        }
        for (int i = 0; i < length; i++)
        {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i))
            {
                isPalindrome = false;
                break;
            }
        }
        logger.log(Level.INFO, "s is: {0} {1} {2}", new Object[] {s, s.length(), isPalindrome} );
        return isPalindrome;
    }

    public static void main(String[] args)
    {
        ValidPalindrome validPalindrome = new ValidPalindrome();

//        String s = "A man, a plan, a canal: Panama"; //true
//        String s = "race a car"; //false
        String s = " "; //true
        validPalindrome.isPalindrome(s);
    }
}
