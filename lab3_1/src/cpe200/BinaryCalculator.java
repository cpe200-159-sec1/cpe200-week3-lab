package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private BigDecimal x;
    private BigDecimal y;

    public BinaryCalculator()
    {
        /* your code here */
        x = new BigDecimal(0);
        y = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        x = new BigDecimal(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        y = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        return x.add(y).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        /* your code here */
        return x.subtract(y).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        /* your code here */
        return x.multiply(y).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        if(y.equals(0))throw new ArithmeticException("Not Divided by zero");
        else
            return x.divide(y,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }


}
