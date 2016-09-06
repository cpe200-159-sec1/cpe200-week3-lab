package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal firstopereand;
    private BigDecimal secondoperand;

    public BinaryCalculator() {
        firstopereand = new BigDecimal(0);
        secondoperand = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand) {
        firstopereand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        secondoperand = new BigDecimal(operand.operand);
    }

    public String add() {
        return firstopereand.add(secondoperand).stripTrailingZeros().toString();

    }

    public String subtract() {
        return firstopereand.subtract(secondoperand).stripTrailingZeros().toString();
    }

    public String multiply() {
        return firstopereand.multiply(secondoperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division() {
        if (secondoperand.compareTo(BigDecimal.ZERO) == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        secondoperand = firstopereand.divide(secondoperand, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();

        return secondoperand.toString();
    }
}



