package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class View {
    private static final String INPUT_TEXT = "숫자를 입력해 주세요 : ";
    private static final String BALL = "볼";
    private static final String STRIKE = "스트라이트";

    private View() {};

    public static String InputView(){
        try {
            System.out.println(INPUT_TEXT);
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            return str;
        } catch (IOException e){
            throw new IllegalArgumentException("잘못된 입력입니다.");
        }
    }
}
