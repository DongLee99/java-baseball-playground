package domain;

public class Number {
    private String value;

    public Number(String value) {
        validateNumber(value);
        this.value = value;
    }

    private void validateNumber(String value) {
        try {
            Integer.parseInt(value);
            validatePositionalNumber(value);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 숫자여야 한다.");
        }
    }

    private void validatePositionalNumber(String value) {
        if (value.length() > 3) {
            throw new IllegalArgumentException("[ERROR] 자리수가 3이 넘으면 안됨.");
        }
    }
}
