package com.example.tdd;


import com.example.tdd.katas.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz kataOne;

    @BeforeEach
    public void before(){
        kataOne = new FizzBuzz();
    }

    @Test
    void givenNumberWhenIsNotNullThenOK(){
        //given
        Integer number = 1;
        //when
        String numberResult = kataOne.fizzBuzz(1);
        //then
        assertNotNull(numberResult);
    }

    @Test
    void givenInputNumberWhenIsNotNullThenOK(){
        String numberResult = kataOne.fizzBuzz(null);
        assertNotNull(numberResult);
    }

    @Test
    void givenNumberWhenFizzBuzzThenReturnNumber(){
        //given
        Integer number = 1;
        //when
        String result = kataOne.fizzBuzz(number);
        //then
        assertEquals(number.toString(),result);
    }

    @Test
    void givenNumberWhenMultipliesOfThreeThenReturnFizz(){
        //given
        Integer number = 3;
        //when
        String result = kataOne.fizzBuzz(number);
        //then
        assertEquals("fizz",result);
    }

    @Test
    void givenNumberWhenMultipleOfFiveThenReturnBuzz(){
        //given
        Integer number = 5;
        //when
        String result = kataOne.fizzBuzz(number);
        //then
        assertEquals("buzz",result);
    }




}
