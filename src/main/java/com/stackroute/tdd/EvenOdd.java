//check given number is even or odd
package com.stackroute.tdd;

public class EvenOdd {
    int number = 22;

    //method to check given number is even or not
    public String checkEvenOdd() {
        if (number >= 20 && number <= 30) {
            if (number % 2 == 0) {
                return "Jerry";
            }
        }
        return "Tom";
    }

    //method to check range
    public String checkRange() {
        if (number < 20 || number > 30) {
            return "False";
        } else {
            return "True";
        }
    }

    //method to check input is entered or not
    public boolean checkNull() {
        if (number == ' ') {

            return false;
        } else {
            return true;
        }
    }

    //method to check entered value is negative or not
    public boolean checkNegative() {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }

}
