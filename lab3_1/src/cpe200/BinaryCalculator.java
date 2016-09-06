package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    public BigDecimal firstOperand;
    public BigDecimal secondOperand;


    public BinaryCalculator()
    {
        this.firstOperand = new BigDecimal(0);
        this.secondOperand = new BigDecimal(0);
    }

    public void setFirstOperand(Operand operand)

    {
        this.firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)

    {
        this.secondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        BigDecimal tmp = firstOperand.add(secondOperand);
        tmp = tmp.stripTrailingZeros();
        return tmp.toString();
    }

    public String subtract()
    {
        BigDecimal tmp = firstOperand.subtract(secondOperand);
        tmp = tmp.stripTrailingZeros();
        return tmp.toString();
    }

    public String multiply()
    {
        BigDecimal tmp = firstOperand.multiply(secondOperand);
        tmp = tmp.stripTrailingZeros();
        return tmp.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        if(secondOperand.toString() == "0" || secondOperand.toString() == "0.0") {
            throw new RuntimeException("The operation must raise an exception");
            //return null;
        }
        BigDecimal tmp = firstOperand.divide(secondOperand,5,5);

        tmp = tmp.stripTrailingZeros();

        return tmp.toString();
    }


}
