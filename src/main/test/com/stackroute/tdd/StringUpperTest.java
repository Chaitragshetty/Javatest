package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUpperTest {

    StringUpper object;

    @Before
    public void setUp() throws Exception {

        object=new StringUpper();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void TestGivenStringIsInUppercase() {

        //arrange


        //act


        //assert
        assertEquals("CHAITRA", object.stringDemo());

    }

    @Test
    public void TestEnteredInputNull()
    {

        assertEquals(true, object.checkNull());
    }
    @Test
    public void TestNegativeInput()

    {
        assertEquals(true, object.checkNumber());
    }
    @Test
    public void TestInputEnteredTab()

    {
        assertEquals(true, object.tab());
    }
}
