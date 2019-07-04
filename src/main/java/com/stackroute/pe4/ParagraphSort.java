package com.stackroute.pe4;

import java.util.Arrays;

public class ParagraphSort {


    public static String sortString(String inputString)
    {
        if(inputString.equals(""))
            return "invalid input"; //For null paragraph entered

        String[] inputstringarray=inputString.split(" ");//String is converted to char array

        String output="";
        Arrays.sort(inputstringarray,String.CASE_INSENSITIVE_ORDER);//array is sorted but ignores the case of the letter
        for(String a:inputstringarray)
        {
            output=output.concat(a).concat(" ");

        }
        System.out.print(output);//output is returned
        return output.trim();
    }
}
