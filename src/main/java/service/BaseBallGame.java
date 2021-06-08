package service;

import util.Input;
import domain.Number;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    private Number ANSWER = new Number("456");
    private int strikeCount;
    private int ballCount;
    private List<String> RESULT = new ArrayList<>();

    public void gameStart() {
        Number inputNumber = new Number(Input.BufferInput());
        strikeCount = 0;
        ballCount = 0;
        checkStrike(inputNumber, ANSWER);
        checkBall(inputNumber,ANSWER);
        View.ResultView(strikeCount, ballCount);
    }

    private void checkStrike(Number inputNumber, Number temp) {
        for(int index = 0; index < 3; index++) {
            strikeCount = strikeCount + inputNumber.numberPositionCheck(temp, index);
        }
    }

    private void checkBall(Number inputNumber, Number temp) {
        for(int index = 0; index < temp.getValue().length(); index++) {
            ballCount = ballCount + inputNumber.checkContains(temp, index);
        }
        ballCount = ballCount - strikeCount;
    }
}
