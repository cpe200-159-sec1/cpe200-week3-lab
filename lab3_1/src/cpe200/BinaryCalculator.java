package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {

    /* your code here */
    public BigDecimal firstOperand;
    public BigDecimal secondOperand;

    public BinaryCalculator()
    {
        /* your code here */
        this.firstOperand = new BigDecimal(0);
        this.secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)
    {
        /* your code here */
        this.firstOperand = new BigDecimal(operand.operand);

    }


    public void setSecondOperand(Operand operand)
    {
        /* your code here */
        this.secondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        BigDecimal temp = firstOperand.add(secondOperand);
        temp = temp.stripTrailingZeros(); //จุดหาย
        return temp.toString();
    }

    public String subtract()
    {
        /* your code here */
        BigDecimal temp = firstOperand.subtract(secondOperand);
        temp = temp.stripTrailingZeros();
        return temp.toString();
    }

    public String multiply()
    {
        /* your code here */
        BigDecimal temp = firstOperand.multiply(secondOperand);
        temp = temp.stripTrailingZeros();
        return temp.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        BigDecimal temp = firstOperand.divide(secondOperand,5,3);
        temp = temp.stripTrailingZeros();
        return temp.toString();
    }


}
