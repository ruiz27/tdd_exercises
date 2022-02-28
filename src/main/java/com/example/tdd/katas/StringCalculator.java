package com.example.tdd.katas;

import java.util.Arrays;

public class StringCalculator {
    public Integer add(String s) {
        Integer result = 0;
        if (!s.isEmpty()){
            String[] listNumbers = s.split(",");
            result =  Arrays.stream(listNumbers)
                    .mapToInt(Integer::parseInt)
                    .sum();
        }
        return result;
    }
}
