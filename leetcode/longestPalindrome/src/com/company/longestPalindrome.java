package com.company;
import java.util.HashMap;
public class longestPalindrome
{
    public String checkPalindrome(String s)
    {
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        int length = s.length();

        int count = 0; // The counter to find which one is the longest
        int m = length /2; // take the character at the midle of the string
        int i = 0;

        if(length % 2 == 0) // the string has the even length
        {
            while(i < m)
            {
                if(s.charAt(m + i) == s.charAt(m - (i + 1)))
                {
                    count++;
                    i++;
                }
                else {
                    checkPalindrome(s.substring(0, m));
                    checkPalindrome(s.substring(m, length));
                    break;
                }
            }
            hm.put(s, count);
        }
        else // the string has the odd length
        {
            while(i < m)
            {
                if(s.charAt(m + (i + 1)) == s.charAt(m - (i + 1)))
                {
                    count++;
                    i++;
                }
                else
                {
                    if(s.length() > 3)
                    {
                        if(s.charAt(m) == s.charAt(m + 2) || s.charAt(m) == s.charAt(m - 2)) // this line has the bug with the length of string 3
                        {
                            count++;
                            checkPalindrome(s.substring(0, m));
                            checkPalindrome(s.substring(m, length));
                            break;
                        }
                    }
                    else{
                        checkPalindrome(s.substring(0, m));
                        checkPalindrome(s.substring(m, length));
                        break;
                    }
                }
            }
            hm.put(s, count);
        }
        System.out.println(hm);
        return s;
    }

    public static void main(String[] args)
    {
        longestPalindrome cp = new longestPalindrome();
        cp.checkPalindrome("ac");
    }
}
