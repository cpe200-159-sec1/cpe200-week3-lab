package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
import java.math.BigDecimal;

public class BinaryCalculator {
    public BigDecimal firstOperand;
    public BigDecimal secondOperand;

    public BinaryCalculator()
    {
        firstOperand = new BigDecimal(0.0);
        secondOperand = new BigDecimal(0.0);
    }

    public void setFirstOperand(Operand operand)
    {
        firstOperand = new BigDecimal(operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        secondOperand = new BigDecimal(operand.operand);
    }

    public String add()
    {
        /* your code here */
        firstOperand = firstOperand.add(secondOperand);
        BigDecimal bigDecimal = firstOperand.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String subtract()
    {
        /* your code here */
        firstOperand = firstOperand.subtract(secondOperand);
        BigDecimal bigDecimal = firstOperand.stripTrailingZeros();
        return bigDecimal.toString();
    }

    public String multiply()
    {
        /* your code here */
        firstOperand = firstOperand.multiply(secondOperand);
        BigDecimal bigDecimal = firstOperand.stripTrailingZeros();
        return bigDecimal.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        /* your code here */
        firstOperand = firstOperand.divide(secondOperand,5,BigDecimal.ROUND_HALF_UP);
        BigDecimal bigDecimal = firstOperand.stripTrailingZeros();
        return bigDecimal.toString();
    }


}
