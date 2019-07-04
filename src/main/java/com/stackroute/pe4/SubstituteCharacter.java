package com.stackroute.pe4;

public class SubstituteCharacter {

    //This method takes the string and substitutes specific characters and then returns the string
    public String substituteSpecificCharacter(String string){

        String result="";//It is the output string
        int length=string.length();//Length of the string

        //Checking for null string
        if(length>0) {

            char[] stringArray = new char[length - 1];//Dynamically initializing the array

            stringArray = string.toCharArray();//Putting the string in a character array

            for (int i = 0; i < length; i++) {

                //Substituting d by f
                if (stringArray[i] == 'd') {
                    stringArray[i] = 'f';
                }

                //Substituting l by t
                if (stringArray[i] == 'l') {
                    stringArray[i] = 't';
                }

                result = new String(stringArray);
            }
            return result;
        }
        else
        {
            return "No letters to substitute.";
        }
    }
}
