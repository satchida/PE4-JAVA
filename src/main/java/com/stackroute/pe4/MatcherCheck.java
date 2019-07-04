package com.stackroute.pe4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherCheck {
    public String checkPattern(String string,String pattern){

        //Checking whether the length of the target string is longer than the pattern not
        if(string.length() > pattern.length()) {//If target string is longer

            String result = "";//Initialising the result variable

            Pattern p = Pattern.compile(pattern);//Compiling the input pattern in the object of Pattern class
            Matcher m = p.matcher(string);

            //Finding the positions where the pattern found
            while (m.find()) {
                result = result + "Found at: ";
                result = result + m.start();
                result = result + "-";
                result = result + m.end();
                result = result + "\n";
            }
            result = result.trim();//Trimming the last distance of the statement

            //checking whether the pattern found or not
            if (result.length() > 0) {
                return result;//If pattern found
            } else {
                return "Not Available";//If the pattern not found
            }
        }
        else//If the pattern is longer than the target string
        {
            return "Inappropriate Length for Pattern";
        }

    }
}
