package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubstituteCharacterTest {


    //The class is instantiated
    SubstituteCharacter obj;

    @Before
    public void setUp() throws Exception {
        obj=new SubstituteCharacter();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }


    //Test case for a null string
    @Test
    public void noWordStatement() {
        String result = obj.substituteSpecificCharacter("");
        assertEquals("No letters to substitute.", result);
    }

    //Test cases for substituting in string of specific length
    @Test
    public void twoWordStatement() {
        String result = obj.substituteSpecificCharacter("daily dry");
        assertEquals("faity fry", result);
    }
    @Test
    public void multipleWordStatement() {
        String result = obj.substituteSpecificCharacter("He is a faithfull guy");
        assertEquals("He is a faithfutt guy", result);
    }
}