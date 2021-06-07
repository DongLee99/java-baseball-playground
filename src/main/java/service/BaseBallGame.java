package service;

import util.Input;
import domain.Number;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    public final static  Number ANSWER = new Number("456");
    private int strikeCount = 0;
    private int ballCount = 0;
    private List<String> RESULT = new ArrayList<>();

    public void gameStart() {
        Number inputNumber = new Number(Input.BufferInput());
        strikeCount = 0;
        ballCount = 0;
        Number temp = ANSWER;
        checkStrike(inputNumber, temp);
        checkBall(inputNumber,temp);
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
    }
}
