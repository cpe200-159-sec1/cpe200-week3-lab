package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal myOrandfist;
    private BigDecimal myOrandsecond;

    public BinaryCalculator()
    {
        /* your code here */
        myOrandfist = new BigDecimal(0);
        myOrandsecond = new BigDecimal(0);

    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        myOrandfist = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        myOrandsecond = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        return myOrandfist.add(myOrandsecond).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        /* your code here */
        return myOrandfist.subtract(myOrandsecond).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        /* your code here */
        return myOrandfist.multiply(myOrandsecond).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        return myOrandfist.divide(myOrandsecond,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
