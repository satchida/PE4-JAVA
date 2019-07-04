package com.stackroute.pe4;

public class CharacterOcurrance {

    //This method reads the string and the character returns the frequency
    public String ocurranceOfASpecificCharacter(String string,char character)
    {
        String result="";//Output string is initialized

        String Chara=String.valueOf(character);//Character is converted to string for replacement
        int length=string.length();//length of the string

        String replacedString=string.replace(Chara, "");//The character is getting deleted
        int replacedStringLength=replacedString.length();//After replacement the string length

        int frequency=length-replacedStringLength;//Frequency of the character

        //Checking for the feasibility
        if(frequency>0 && length>0) {
            result = result + frequency;
            return result;
        }else if(length==0)
        {
            return "There is no statement to check";
        }
        else
        {
            return "It not available here in this statement";
        }
    }
}
