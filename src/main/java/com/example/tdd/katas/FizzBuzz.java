package com.example.tdd.katas;

//@Service
public class FizzBuzz {


    public String fizzBuzz(Integer number){
        String result = null;

        if(number==null){
            return "";
        }
        if(number%3==0){
            result = "fizz";
        }
        if(number%5==0){
            result = "buzz";
        }
        return result==null ? String.valueOf(number) : result ;
    }

}
