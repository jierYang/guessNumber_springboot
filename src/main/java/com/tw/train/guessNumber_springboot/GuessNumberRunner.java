package com.tw.train.guessNumber_springboot;

import com.google.common.base.Strings;
import com.google.common.io.LineReader;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.io.InputStreamReader;


@Component
public class GuessNumberRunner implements ApplicationRunner, ApplicationContextAware {

    @Autowired
    private GuessNumberGame guessNumberGame;

    @Override
    public void run(ApplicationArguments args) {
        System.out.println(guessNumberGame.process("1 2 3 4 5"));
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    }
}
