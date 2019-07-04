package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckAvailabilityTest {

    CheckAvailability obj;

    @Before
    public void setUp() throws Exception {
        obj=new CheckAvailability();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases where the word is available in the String
    @Test
    public void checkNameAvailable(){
        String result=obj.checkAvailabilityOfWord("Harry is a boy","Harry");
        assertEquals("Harry is available here.",result);
    }

    @Test
    public void checkNameAvailable1(){
        String result=obj.checkAvailabilityOfWord("Did James today came to office?","James");
        assertEquals("James is available here.",result);
    }


    //Test cases where the word is not available in the string
    @Test
    public void checkNameNotAvailable1(){
        String result=obj.checkAvailabilityOfWord("Did James today came to office?","Alfred");
        assertEquals("Alfred is not available here.",result);
    }

    //Test case where the netered string is a null string
    @Test
    public void emptyStatementNotAvailable(){
        String result=obj.checkAvailabilityOfWord(" ","Alfred");
        assertEquals("There is nothing to search.",result);
    }
}