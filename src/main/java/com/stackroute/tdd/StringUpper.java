//converting given string to uppercase
package com.stackroute.tdd;

//Method which convert given input to upper case
public class StringUpper {
    int number;
    String name = "chaitra";

    public String stringDemo() {
        String name1 = name.toUpperCase();

        return name1;
    }

    //Method to check for null input
    public boolean checkNull() {
        if (name.equals(" ")) {

            return false;
        } else {
            return true;
        }
    }

    //method to check entered input is number
    public boolean checkNumber() {
        if (number < 0) {
            return false;
        } else {
            return true;
        }
    }

    //check whether entered input is tab
    public boolean tab() {
        if (name.equals("   ")) {
            return false;
        } else {
            return true;
        }
    }
}
