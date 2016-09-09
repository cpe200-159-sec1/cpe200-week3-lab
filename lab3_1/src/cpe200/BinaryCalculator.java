package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;
/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal fo;
    private BigDecimal so;

    public BinaryCalculator()
    {
        fo = new BigDecimal(0);
        so = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        fo = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        so = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return fo.add(so).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return fo.subtract(so).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return fo.multiply(so).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(so.equals(0))throw new RuntimeException("Stack underflow");
        else return fo.divide(so,5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
