package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void checkGivenInputIsPalindrome()
    {

        Palindrome p = new Palindrome();

        int res = p.checkPalindrome();

        assertEquals(1, res);
        assertEquals(1, res);

    }

    @Test
    public void checkNUll() {
        assertEquals(true,p.checkNUll());

    }

    @Test
    public void checkNegative() {
        assertEquals(false,p.checkNegative)


    }
}