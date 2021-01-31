package com.titoacademy;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String myString = "Titus nangi";
        myString = myString.concat("\n");
        char[] myChar =  myString.toCharArray();
        int count = 0;
        int i = 0;
        while (myChar[i] != '\n'){
            count++;
            i++;

        }
     
        System.out.println("The length of the string is " + count);


    }
}
