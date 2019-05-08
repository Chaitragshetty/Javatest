package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenOddTest {

    EvenOdd object;

    @Before
    public void setUp() throws Exception {

        object=new EvenOdd();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestGivenNumberEvenOdd()
    {

        assertEquals("Jerry", object.checkEvenOdd());
    }

    @Test
    public void TestcheckRangeShouldReturnTrue()
    {

        assertEquals("True", object.checkRange());
    }

    @Test
    public void TestcheckNullShouldReturnTrue()
    {

        assertEquals(true, object.checkNull());
    }
    @Test
    public void TestcheckNegativeInput()
    {

        assertEquals(true, object.checkNegative());
    }

}