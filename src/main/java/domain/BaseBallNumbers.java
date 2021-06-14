package domain;

import java.util.ArrayList;
import java.util.List;

public class BaseBallNumbers {
    private final List<BaseBallNumber> BallNumbers;


    public BaseBallNumbers(List<BaseBallNumber> ballNumbers) {
        validationSize(ballNumbers);
        validationDuplications(ballNumbers);
        this.BallNumbers = ballNumbers;
    }

    public void validationSize(List<BaseBallNumber> ballNumbers) {
        if (ballNumbers.size() > 3) {
            throw new IllegalArgumentException("세자리수 초과");
        }
    }

    public void validationDuplications(List<BaseBallNumber> ballNumbers) {
        int count = (int) ballNumbers.stream()
                .distinct()
                .count();
        if (count != ballNumbers.size()) {
            throw new IllegalArgumentException("중복 발생");
        }
    }
}
