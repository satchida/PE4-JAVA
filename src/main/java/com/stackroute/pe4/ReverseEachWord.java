package com.stackroute.pe4;

public class ReverseEachWord {
    public String reverseWords(String string) {

        /*Initialising and spliting the entered string

        *Each word placed as an element in the string type array

         */
        String[] stringArray = string.split(" ");

        int length = stringArray.length;//Number of words available in the string

        //Checking for null String
        if (length > 0) {//If any word available then only it will be reversed

            String result = "";
            for (int i = 0; i < length; i++) {

                StringBuffer input = new StringBuffer(stringArray[i]);
                input = input.reverse();
                String reverse = input.toString();
                result = result + reverse;
                result = result + " ";

            }
            return result;
        }
        else {
                return "There is nothing to reverse";
        }
    }
}
