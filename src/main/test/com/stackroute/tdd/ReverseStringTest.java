package com.stackroute.tdd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {

    ReverseString rs;

    @Before
    public void setUp() throws Exception {

        rs=new ReverseString();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void reverseStr()
    {
        String rev=rs.reverseStr();
        assertEquals("ilapiD", rev);
    }
}