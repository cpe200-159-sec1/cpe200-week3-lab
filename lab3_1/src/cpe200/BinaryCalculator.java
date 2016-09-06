package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private BigDecimal firstO;
    private BigDecimal secondO;

    public BinaryCalculator()
    {
        /* your code here */
        firstO = new BigDecimal(0);
        secondO = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        firstO = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        secondO = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        return firstO.add(secondO).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        /* your code here */
        return firstO.subtract(secondO).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        /* your code here */
        return firstO.multiply(secondO).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        /*
        String test;
        test = secondO.toString();
        if (test=="0"){
            return ;
        }
        */



        return firstO.divide(secondO,5,BigDecimal.ROUND_UP).stripTrailingZeros().toString();
    }


}
