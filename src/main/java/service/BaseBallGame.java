package service;

import util.Input;
import domain.Number;
import view.View;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGame {
    public final static  Number ANSWER = new Number("456");
    private int strikeCount;
    private int ballCount;
    private List<String> RESULT = new ArrayList<>();

    public void gameStart() {
        Number inputNumber = new Number(Input.BufferInput());
        View.ResultView(getResults(inputNumber));
    }

    private List<String> getResults(Number inputNumber) {
        checkNumber(inputNumber);
        return this.RESULT;
    }

    private void checkNumber(Number inputNumber) {
        for(int index = 0; index < 3; index++) {

        }
    }
}
