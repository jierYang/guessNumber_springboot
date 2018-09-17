package com.tw.train.guessNumber_springboot;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.hamcrest.CoreMatchers.is;


@SpringBootTest
@RunWith(SpringRunner.class)
public class GuessNumberGameTest {
    @Autowired
    private GuessNumberGame guessNumberGame;

    @Test
    public void shouldRunTest(){
        String result = guessNumberGame.process("1 2 3 4 5");
//        assertThat(result).isEqualTo("3 7 11");
        Assert.assertThat(result,is("1 2\\n1 3 5\\n3 5 7\\n3 7 11\\n"));
    }
}
