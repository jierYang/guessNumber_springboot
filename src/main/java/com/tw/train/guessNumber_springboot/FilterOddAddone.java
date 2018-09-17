package com.tw.train.guessNumber_springboot;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class FilterOddAddone implements ProcessRule {

    public List<String> processNumbers(List<String> input){
        List<String> processNumber = input.stream().map(s -> Integer.parseInt(s))
                .filter(integer -> integer % 2 != 0)
                .map(integer -> integer*2+1)
                .map(interger -> interger.toString())
                .collect(Collectors.toList());
        return processNumber;
    }
}
