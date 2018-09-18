package com.tw.train.guessNumber_springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class GuessNumberGame {
    protected ProcessRule[] rules;


    @Autowired
    protected GuessNumberGame(ProcessRule ...rules){
        this.rules = rules;
    }

    public String process(String input){
        String[] numbersArray = input.split(" ");

        List<String> numbers = Arrays.asList(numbersArray);
        String result = "";


        for(ProcessRule rule:this.rules){
            result = String.join(" ",rule.processNumbers(numbers));
        }
//        return String.join(" ", result);
        return  result;
    }
}
