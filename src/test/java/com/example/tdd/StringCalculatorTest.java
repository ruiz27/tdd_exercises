package com.example.tdd;

import com.example.tdd.katas.StringCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    StringCalculator stringCalculator;

    @BeforeEach
    void before(){
        stringCalculator = new StringCalculator();
    }

    @Test
    void givenStringWhenSumThenReturn0(){
        //given
        String nums = "";
        //when
        Integer result = stringCalculator.add(nums);
        //then
        Assertions.assertEquals(0,result);
    }

    @Test
    void givenOneAndTwoWhenSumThenReturnThree(){
        String nums = "1,2";
        //when
        Integer result = stringCalculator.add(nums);
        //then
        Assertions.assertEquals(3,result);
    }

    @Test
    void givenNumbersWithNewLineSeparatorWhenAddTheReturnSumOK(){
        String nums = "1,2\\n3";
        //when
        Integer result = stringCalculator.add(nums);
        //then
        Assertions.assertEquals(6,result);
    }

    @Test
    void givenNumbersWithWrongLineSeparatorWhenAddThenError(){
        String nums = "2,\\n3";
        //when
        //then
        Assertions.assertThrows(NumberFormatException.class, () -> {
            stringCalculator.add(nums);
        });
    }


}
