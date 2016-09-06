package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal nFirstOperand;
    private BigDecimal nSecondOperand;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        nFirstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        nSecondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return nFirstOperand.add(nSecondOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return nFirstOperand.subtract(nSecondOperand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return nFirstOperand.multiply(nSecondOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if (nSecondOperand.compareTo(BigDecimal.ZERO) == 0) throw new IllegalArgumentException("Argument 'divisor' is zero.");
        return nFirstOperand.divide(nSecondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


}
