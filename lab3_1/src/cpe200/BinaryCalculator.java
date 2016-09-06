package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    private BigDecimal firOperand, secOperand;
    public BinaryCalculator()
    {

    }

    public void setFirstOperand(Operand operand)
    {
        firOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        secOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {

        return firOperand.add(secOperand).stripTrailingZeros().toString();
    }

    public String subtract()
    {

        return firOperand.subtract(secOperand).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return firOperand.multiply(secOperand).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(secOperand.compareTo(BigDecimal.ZERO)==0){
            throw new RuntimeException("ERROR");
        }
        return firOperand.divide(secOperand,5,BigDecimal.ROUND_HALF_UP).stripTrailingZeros().toString();
    }


}
