package cpe200;

import java.math.BigDecimal;

/**
 * Created by pruet on 5/9/2559.
 */

public class BinaryCalculator {
    String FirstO , SecondO ;

    public BinaryCalculator()
    {
    }

    public void setFirstOperand(Operand operand)
    {
        this.FirstO = operand.operand;
    }


    public void setSecondOperand(Operand operand)
    {

        this.SecondO = operand.operand;
    }

    public String add()
    {
        BigDecimal a = new BigDecimal(this.FirstO);
        BigDecimal b = a.add(new BigDecimal(this.SecondO)).stripTrailingZeros();
        return b.toString();
    }

    public String subtract()
    {
        BigDecimal a = new BigDecimal(this.FirstO);
        BigDecimal b = a.subtract(new BigDecimal(this.SecondO)).stripTrailingZeros();
        return b.toString();
    }

    public String multiply()
    {
        BigDecimal a = new BigDecimal(this.FirstO);
        BigDecimal b = a.multiply(new BigDecimal(this.SecondO)).stripTrailingZeros();
        return b.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal a = new BigDecimal(this.FirstO);
        BigDecimal b = new BigDecimal(this.SecondO);
        if (b.compareTo(BigDecimal.ZERO) == 0)
            throw new IllegalArgumentException("Argument 'divisor' is 0");
        b = a.divide(b, 5, BigDecimal.ROUND_HALF_UP).stripTrailingZeros();

        return b.toString();
    }


}
