package view;

import util.Input;

import java.util.List;

public class View {
    private static final String INPUT_TEXT = "숫자를 입력해 주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이트";

    private View() {};

    public static void InputView(){
        System.out.println(INPUT_TEXT);
    }
    public static void ResultView(List<String> result) {

    }
}
