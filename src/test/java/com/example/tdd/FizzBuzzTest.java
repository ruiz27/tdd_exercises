package com.example.tdd;


import com.example.tdd.katas.KataOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FizzBuzzTest {

    @Test
    public void givenNumberNullThenReturnNull(){
        KataOne kataOne = new KataOne();
        assertNotNull(kataOne.fizzBuzz(1));
    }

    @Test
    public void givenNumberNotNullThenReturnStringNumber(){
        KataOne kataOne = new KataOne();
        assertEquals("1",kataOne.fizzBuzz(1));
    }
}
