package domain;

public class Number {
    private String value;

    public Number(String value) {
        validateNumber(value);
        this.value = value;
    }

    public int checkContains(Number inputNumber, int index) {
        int count = 0;
        if (value.contains(Character.toString(inputNumber.value.charAt(index)))) {
            count++;
        }
        return count;
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


    public int numberPositionCheck(Number answer,int index) {
        int strikeCount = 0;
        if (answer.value.charAt(index) == value.charAt(index)) {
            strikeCount++;
            answer.value.replace(answer.value.charAt(index), ' ');
        }
        return strikeCount;
    }

    public String getValue() {
        return value;
    }
}
