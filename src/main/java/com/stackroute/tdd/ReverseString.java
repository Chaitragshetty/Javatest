package com.stackroute.tdd;

public class ReverseString
{
    public String reverseStr()
    {
        String str = "Dipali";
        String rev = "";

        int len = str.length();


        for (int i = len - 1; i >= 0; i--)
        {
            rev = rev + str.charAt(i);
        }

        return rev;
    }
}
