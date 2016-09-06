package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private  BigDecimal FirstOP;
    private  BigDecimal SecondOP;


    public BinaryCalculator()
    {
        FirstOP = new BigDecimal(0);
        SecondOP = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        FirstOP = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        SecondOP = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return FirstOP.add(SecondOP).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return FirstOP.subtract(SecondOP).stripTrailingZeros().toString();
    }

    public String multiply()
    {

        return FirstOP.multiply(SecondOP).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(SecondOP.equals(0)) {
            throw new ArithmeticException("ERROR");
        }
        return FirstOP.divide(SecondOP,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }
}
