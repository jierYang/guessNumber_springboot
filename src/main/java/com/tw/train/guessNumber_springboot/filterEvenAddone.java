package com.tw.train.guessNumber_springboot;

import java.util.List;
import java.util.stream.Collectors;

public class filterEvenAddone implements ProcessRule {

    public List<String> processNumbers(List<String> input){
        List<String> processNumber = input.stream().map(s -> Integer.parseInt(s))
                .filter(integer -> integer % 2 != 0)
                .map(integer -> integer*2+1)
                .map(interger -> interger.toString())
                .collect(Collectors.toList());
        return processNumber;
    }
}
