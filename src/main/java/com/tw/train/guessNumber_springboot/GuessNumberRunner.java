package com.tw.train.guessNumber_springboot;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class GuessNumberRunner implements ApplicationRunner, ApplicationContextAware {
    @Autowired
    private GuessNumberGame guessNumberGame;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(guessNumberGame.process("1 2 3 4 5"));
        guessNumberGame.process("1 2 3 4 5");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }
}