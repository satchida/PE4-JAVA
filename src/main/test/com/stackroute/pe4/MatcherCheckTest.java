package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatcherCheckTest {

    //Instanciating the class for testcases
    MatcherCheck obj;

    @Before
    public void setUp() throws Exception {
        obj = new MatcherCheck();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases where the pattern are available in the sentence
    @Test
    public void checkForPatternAvailable(){
        String result=obj.checkPattern("She sells seashells by the seashore","se");
        assertEquals("Found at: 4-6\n" +
                "Found at: 10-12\n" +
                "Found at: 27-29",result);
    }

    @Test
    public void checkForPatternAvailable1(){
        String result=obj.checkPattern("As Ram suffering for hepatitis, So he is taking medicines.","he");
        assertEquals("Found at: 21-23\n" +
                "Found at: 35-37",result);
    }

    //Test cases where the string is not available in the statement
    @Test
    public void checkForPatternNotAvailable(){
        String result=obj.checkPattern("As Ram suffering for hepatitis, So he is taking medicines.","ke");
        assertEquals("Not Available",result);
    }

    //Test cases where the length of the pattern is more than the length of the string or sentence entered
    @Test
    public void checkForPatternOfInappropriateLength(){
        String result=obj.checkPattern("Alex","Alexander");
        assertEquals("Inappropriate Length for Pattern",result);
    }
}