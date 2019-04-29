package com.stackroute.tdd;

public class StringUpper
{
    String name="dipali";

    public String stringDemo()
    {
        String name1=name.toUpperCase();

        return name1;
    }

    public boolean checkNull()
    {
        if(name.equals(" "))
        {
            System.out.println("Enter Some Input: ");
            return false;
        }
        else
        {
            return true;
        }
    }

}