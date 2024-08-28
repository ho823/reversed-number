package com.project.domain;

public class NumberReverser {
    public String reverseNumber(int input)  {
       String inputToString =  Integer.toString(input);
        return new StringBuilder(inputToString).reverse().toString();
    }

}
