package com.stackroute.tdd;

public class EvenOdd
{
    int num = 22;

    public String checkEvenOdd()
    {
        if(num >= 20 && num <= 30)
        {
            if(num % 2 == 0)
            {
                 return "Jerry";
            }
        }
        return "Tom";
    }

    public String checkRange()
    {
        if(num<20 || num>30)
        {
            return "False";
        }
        else
        {
            return "True";
        }
    }

    public boolean checkNull()
    {
        if(num==' ')
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
