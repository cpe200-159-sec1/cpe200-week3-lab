package cpe200;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal FirstOperand;
    private BigDecimal SecondOperand;


    public BinaryCalculator()
    {
        FirstOperand = new BigDecimal(0);
        SecondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
       FirstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand) {
        SecondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        return FirstOperand.add(SecondOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return FirstOperand.subtract(SecondOperand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return FirstOperand.multiply(SecondOperand).stripTrailingZeros().toString();
    }

    public String division()
    {
        if(SecondOperand.equals(0) )
        {
            throw new RuntimeException("Devide by zero");
        }
        return FirstOperand.divide(SecondOperand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();

    }


}
