package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal mFirstOperand;
    private BigDecimal mSecondOperand;

    public BinaryCalculator()
    {
        mFirstOperand = new BigDecimal(0);
        mSecondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        mFirstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        mSecondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return mFirstOperand.add(mSecondOperand)
                .stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return mFirstOperand.subtract(mSecondOperand)
                .stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return mFirstOperand.multiply(mSecondOperand)
                .stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if( mSecondOperand.compareTo(BigDecimal.ZERO) == 0 )
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        mSecondOperand = mFirstOperand.divide(mSecondOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros();
        return mSecondOperand.toString();
    }


}
