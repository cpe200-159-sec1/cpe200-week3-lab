package cpe200;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    /* your code here */
    private BigDecimal firstOparand;
    private BigDecimal secondOparand;

    public BinaryCalculator()
    {
        /* your code here */
        firstOparand = new BigDecimal(0);
        secondOparand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        firstOparand = new BigDecimal(operand.operand);


    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        secondOparand= new BigDecimal(operand.operand);

    }

    public String add()
    {
        /* your code here */
        return firstOparand.add(secondOparand).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        /* your code here */

        return firstOparand.subtract(secondOparand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        /* your code here */

        return firstOparand.multiply(secondOparand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        if(secondOparand.equals(0)){
         throw new RuntimeException("divine by 0");
        }
        return firstOparand.divide(secondOparand,5, RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


}
