package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseEachWordTest {


    //Class is instantiated
    ReverseEachWord obj;

    @Before
    public void setUp() throws Exception {
        obj = new ReverseEachWord();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test case  to reverse a string containing only one word
    @Test
    public void singleWord(){
        String result=obj.reverseWords("Satchidananda");
        assertEquals("adnanadihctaS ",result);
    }

    //test case to reversing a string containing multiple world
    @Test
    public void statement(){
        String result=obj.reverseWords("I am an employee of IBM");
        assertEquals("I ma na eeyolpme fo MBI ",result);
    }
    @Test
    public void statement1(){
        String result=obj.reverseWords("a quick brown fox jumps over the lazy dog");
        assertEquals("a kciuq nworb xof spmuj revo eht yzal god ",result);
    }

    //Test case for null string
    @Test
    public void noStatement(){
        String result=obj.reverseWords(" ");
        assertEquals("There is nothing to reverse",result);
    }

}