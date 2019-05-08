package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString reverse;

    @Before
    public void setUp() throws Exception {

        reverse=new ReverseString();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestEnteredInputReversable()
    {
        assertEquals("true", reverse.checkReverse(" "));
    }
    @Test
    public void TestEnteredInputIsNegativeShouldReturnFalse()
    {
        assertEquals("true", reverse.checkNull(" "));
    }
    @Test
    public void TestEnteredInputIsTabShouldReturnFalse()
    {
        assertEquals("true", reverse.checktab(" "));
    }
}
