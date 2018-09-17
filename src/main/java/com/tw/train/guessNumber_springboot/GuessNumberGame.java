package com.tw.train.guessNumber_springboot;

import java.util.Arrays;
import java.util.List;

public class GuessNumberGame {
    protected ProcessRule[] rules;

    protected GuessNumberGame(ProcessRule ...rules){
        this.rules = rules;
    }


    public String process(String input){
        String[] numbersArray = input.split(" ");

        List<String> numbers = Arrays.asList(numbersArray);
        List<String> result = null;
        for(ProcessRule rule:this.rules){
            result =rule.processNumbers(numbers);
        }
        return String.join(" ", result);
    }
}
