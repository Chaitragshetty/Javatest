//program to check entered input is palidrome or not
package com.stackroute.tdd;

//method to check enterd input is palindrome
public class Palindrome {
    public int checkPalindrome() {
        int number = 146898641;
        int reminder, result = 0, temp, sum = 0;

        temp = num;

        while (temp > 0) {
            reminder = temp % 10;
            result = (result * 10) + rem;
            temp = temp / 10;
        }

        if (number == result) {


            while (number > 0) {
                reminder = number % 10;
                if (rem % 2 == 0) {
                    sum = sum + reminder;
                }
                number = number / 10;
            }
//checking whether  given input is within range or not
            if (sum > 25) {
                return false
            } else {
                return true;
            }
        }
        return 1;
    }

    public boolean checkNegative(number) {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean ckeckNull() {
        if (number == 0) {
            return false;
        }
        return true;
    }

}
