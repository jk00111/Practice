package com.example.baseballremastered.position;

import com.example.baseballremastered.Ball;

import java.util.ArrayList;
import java.util.List;

public class Catcher {

    private int level;

    public Catcher(int level) {
        this.level = level;
    }

    public void textValidation(Ball ball){
        List<Character> testList = new ArrayList<>();
        String test = ball.ball;

        if(test.length() != level) {
            throw new IllegalArgumentException(String.format("%d자리 숫자를 입력해주세요", level));
        }

        for (int i=0; i < test.length(); i++){
            if (test.charAt(i) - 48 < 0 || test.charAt(i) - 48 > 9)
                throw new IllegalArgumentException(String.format("%d자리 숫자를 입력해주세요", level));
            testList.add(test.charAt(i));
        }

        if (testList.stream().distinct().toList().size() != level) {
            throw new IllegalArgumentException("중복되지 않는 숫자 0 ~ 9 로 이루어져야합니다");
        }
    }
}
