package domain;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class BaseBallNumberTest {

    @Test
    public void 숫자_검증() {
        BaseBallNumber baseBallNumber = new BaseBallNumber(1,1);
        assertThat(baseBallNumber.validationNumber(1)).isTrue();
    }
    @Test
    public void 여러숫자_검증() {
        BaseBallNumber baseBallNumber1 = new BaseBallNumber(1,1);
        BaseBallNumber baseBallNumber2 = new BaseBallNumber(2,2);
        BaseBallNumber baseBallNumber3 = new BaseBallNumber(3,3);
        BaseBallNumber baseBallNumber4 = new BaseBallNumber(4,4);
        BaseBallNumbers baseBallNumbers;
        //assertThat(baseBallNumbers.validationSize(Arrays.asList(baseBallNumber1,baseBallNumber2,baseBallNumber3,baseBallNumber4))).isTrue();
    }
    @Test
    public void 숫자_중복_검증() {
        BaseBallNumber baseBallNumber1 = new BaseBallNumber(1,1);
        BaseBallNumber baseBallNumber2 = new BaseBallNumber(2,2);
        BaseBallNumber baseBallNumber3 = new BaseBallNumber(3,3);
        BaseBallNumber baseBallNumber4 = new BaseBallNumber(4,4);
        BaseBallNumbers baseBallNumbers = new BaseBallNumbers(Arrays.asList(baseBallNumber1,baseBallNumber2,baseBallNumber3,baseBallNumber4));
        //assertThat(baseBallNumbers.validationDuplications(Arrays.asList(baseBallNumber1,baseBallNumber2,baseBallNumber3,baseBallNumber4))).isTrue();
    }

    @Test
    public void 스트라이크() {
        BaseBallNumber baseBallNumber1 = new BaseBallNumber(1,1);
        BaseBallNumber inputBaseBallNumber = new BaseBallNumber(1,1);
        BallStatus ballStatus = baseBallNumber1.play(inputBaseBallNumber);
        assertThat(ballStatus).isEqualTo(BallStatus.STRIKE);
    }
    @Test
    public void 볼() {
        BaseBallNumber baseBallNumber1 = new BaseBallNumber(1,1);
        BaseBallNumber inputBaseBallNumber = new BaseBallNumber(1,2);
        BallStatus ballStatus = baseBallNumber1.play(inputBaseBallNumber);
        assertThat(ballStatus).isEqualTo(BallStatus.BALL);
    }
    @Test
    public void 낫띵() {
        BaseBallNumber baseBallNumber1 = new BaseBallNumber(1,1);
        BaseBallNumber inputBaseBallNumber = new BaseBallNumber(2,4);
        BallStatus ballStatus = baseBallNumber1.play(inputBaseBallNumber);
        assertThat(ballStatus).isEqualTo(BallStatus.NOTHING);
    }
}
