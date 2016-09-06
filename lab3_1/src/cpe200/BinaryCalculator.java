package cpe200;

import java.math.BigDecimal;
import java.security.PrivateKey;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal num1;
    private BigDecimal num2;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        num1=new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        num2=new BigDecimal(operand.operand);
    }

    public String add()
    {
        BigDecimal sent=num1.add(num2);
        return sent.stripTrailingZeros().toString();
    }

    public String subtract()
    {
        BigDecimal sent=num1.subtract(num2);
        return sent.stripTrailingZeros().toString();
    }

    public String multiply()
    {
        BigDecimal sent=num1.multiply(num2);
        return sent.stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(num2.toString()=="0")
        {
            System.out.println("ERROR because number 2 is zero");
            return null;
        }
        else
        {
            BigDecimal sent=num1.divide(num2, 5 , BigDecimal.ROUND_HALF_UP);
            return sent.stripTrailingZeros().toString();
        }
    }


}
