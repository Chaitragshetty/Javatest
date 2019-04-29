package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUpperTest {

    StringUpper s;

    @Before
    public void setUp() throws Exception {

        s=new StringUpper();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void stringDemo() {

        //arrange


        //act
        String res = s.stringDemo();

        //assert
        assertEquals("DIPALI", res);

    }

    @Test
    public void checkNull()
    {
        boolean res=s.checkNull();
        assertEquals(true, res);
    }
}