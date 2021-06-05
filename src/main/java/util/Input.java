package util;

import view.View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input {
    public static String BufferInput() {
        try {
            View.InputView();
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
            String str = bf.readLine();
            return str;
        } catch (IOException o) {
            throw new IllegalStateException("잘못된 입력 입니다.");
        }
    }
}
