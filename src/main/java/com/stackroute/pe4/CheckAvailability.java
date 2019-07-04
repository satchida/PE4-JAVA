package com.stackroute.pe4;

public class CheckAvailability {

    //This method take the word and the statement and checks whether it is available or not
    public String checkAvailabilityOfWord(String string,String word){

        int flag=0;

        //String is stored in a string array
        String[] stringArray=string.split(" ");

        //Number of words in the string
        int length=stringArray.length;

        //Checking for each word
        if(length>0) {
            for (int i = 0; i < length; i++) {
                if (stringArray[i].equals(word)) {
                    flag = 1;
                    break;
                }
            }

            //Checking for availability as well as for null string
            if (flag == 1) {
                return word + " is available here.";
            } else {
                return word + " is not available here.";
            }
        }
        else{
            return "There is nothing to search.";
        }
    }
}
