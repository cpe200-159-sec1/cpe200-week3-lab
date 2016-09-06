package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    private BigDecimal FirstOper,SecOper;

    public BinaryCalculator()
    {
        /* your code here */
    }

    public void setFirstOperand(Operand operand)
    {
        FirstOper = new BigDecimal (operand.operand);
    }


    public void setSecondOperand(Operand operand)
    {
        SecOper = new BigDecimal (operand.operand);
    }

    public String add()
    {
        return FirstOper.add(SecOper).stripTrailingZeros().toString();
    }

    public String subtract()
    {
        return FirstOper.subtract(SecOper).stripTrailingZeros().toString();
    }

    public String multiply()
    {
        return FirstOper.multiply(SecOper).stripTrailingZeros().toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        return FirstOper.divide(SecOper,5,RoundingMode.HALF_UP).stripTrailingZeros().toString();
    }


}
