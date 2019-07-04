package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParagraphSortTest {


    //Class is instantiated
    ParagraphSort obj;

    @Before
    public void setUp() throws Exception {
        obj = new ParagraphSort();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void sortString() {
        String result= obj.sortString("# is A mammal.");
        assertEquals("# A is mammal.",result);
    }
    @Test
    public void sortString2() {
        String result= obj.sortString("");
        assertEquals("invalid input",result);
    }
    @Test
    public void sortString3() {
        String result= obj.sortString("Cat is a mammal");
        assertEquals("a Cat is mammal",result);
    }
}