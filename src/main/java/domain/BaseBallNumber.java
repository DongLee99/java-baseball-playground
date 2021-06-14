package domain;

public class BaseBallNumber {
    private final int baseballNo;
    private final int position;

    public BaseBallNumber(int inputNumber, int position) {
        validationNumber(inputNumber);
        this.baseballNo = inputNumber;
        this.position = position;
    }

    public boolean validationNumber(int inputNumber) {
        if (1 <= inputNumber && inputNumber <= 9) {
            return true;
        }
        return false;
    }

    public BallStatus play(BaseBallNumber input) {
        if (this.equals(input)) {
            return BallStatus.STRIKE;
        }
        if (this.matchesBallNo(input)) {
            return BallStatus.BALL;
        }
        return BallStatus.NOTHING;
    }

    private boolean matchesBallNo(BaseBallNumber input) {
        if (this.baseballNo == input.baseballNo) {
            return true;
        }
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
