//Check whether Entered String is Reversable or not
package com.stackroute.tdd;

//method to check enterd string is reversable or not
public class ReverseString{

    String reverse = "";
    public String reverse(String name) {
        checkReverse(name);
        int length = name.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + name.charAt(i);
        }

        return reverse;
    }
    public boolean checkReverse(String name)
    {
        if(name==reverse)
        {
            return true;
        }
        return false;
    }
    //check whether enterd input is negative
    public boolean checkNull(String name)
    {
        if(name==" ")
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    public boolean checkTab(String name)
    {
        if(name=="  ")
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}