package com.stackroute.pe4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterOcurranceTest {


    //Object of the class is instantiated
    CharacterOcurrance obj;

    @Before
    public void setUp() throws Exception {
        obj=new CharacterOcurrance();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    //Test cases for calculating the frequency of the character in a word
    @Test
    public  void ocurranceInWord()
    {
        String result=obj.ocurranceOfASpecificCharacter("anasthesia",'a');
        assertEquals("3",result);
    }

    //Test cases for calculating the frequency of the character in a statement
    @Test
    public  void ocurranceInStatemet()
    {
        String result=obj.ocurranceOfASpecificCharacter("Java is java again java again count number of occurrence of a in the given",'a');
        assertEquals("11",result);
    }

    //Test cases where the character is not available in the string
    @Test
    public  void noOcurranceInStatemet()
    {
        String result=obj.ocurranceOfASpecificCharacter("Java is java again java again count number of occurrence of a in the given",'z');
        assertEquals("It not available here in this statement",result);
    }


    //Test cases where null string is entered to check the character
    @Test
    public  void nullStatemet()
    {
        String result=obj.ocurranceOfASpecificCharacter("",'z');
        assertEquals("There is no statement to check",result);
    }
}