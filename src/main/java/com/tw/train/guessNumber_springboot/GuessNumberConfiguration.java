package com.tw.train.guessNumber_springboot;

import com.tw.train.guessNumber_springboot.GuessNumberGame;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GuessNumberConfiguration implements ApplicationContextAware {
    private  ApplicationContext applicationContext;

    @Bean
    public GuessNumberGame guessNumberGame() {
        filterEvenAddone rule = applicationContext.getBean(filterEvenAddone.class);
        return new GuessNumberGame(rule);
    }

    @Bean
    public  filterEvenAddone filterEvenAddoneX() {
        return new filterEvenAddone();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
