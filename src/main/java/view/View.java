package view;

import util.Input;

import java.util.List;

public class View {
    private static final String INPUT_TEXT = "숫자를 입력해 주세요 : ";
    private static final String BALL = "볼 ";
    private static final String STRIKE = "스트라이트 ";

    private View() {};

    public static void InputView(){
        System.out.print(INPUT_TEXT);
    }
    public static void ResultView(int strikeCount, int ballCount) {
        if (strikeCount != 0) {
            System.out.print(strikeCount + STRIKE);
        }
        if (ballCount != 0) {
            System.out.print(ballCount + BALL);
        }
    }
    public static void finishTextView() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
    }
}
