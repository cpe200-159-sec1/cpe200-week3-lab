package cpe200;

/**
 * Created by pruet on 5/9/2559.
 */
import java.math.BigDecimal;
import java.math.RoundingMode;

public class BinaryCalculator {
    /* your code here */
    private Operand first;
    private Operand second;
    public BinaryCalculator()
    {
        //this.first.operand = "";
       // this.second.operand = "";
    }

    public void setFirstOperand(Operand operand)
    {
        this.first = operand;
    }


    public void setSecondOperand(Operand operand)
    {
        this.second = operand;
    }

    public String add()
    {
        BigDecimal temp1 = new BigDecimal(this.first.operand);
        BigDecimal temp2 =temp1.add(new BigDecimal(this.second.operand)).stripTrailingZeros();

        return temp2.toString();
    }

    public String subtract()
    {
        BigDecimal temp1 = new BigDecimal(this.first.operand);
        BigDecimal temp2 =temp1.subtract(new BigDecimal(this.second.operand)).stripTrailingZeros();
        return temp2.toString();
    }

    public String multiply()
    {
        BigDecimal temp1 = new BigDecimal(this.first.operand);
        BigDecimal temp2 =  temp1.multiply(new BigDecimal(this.second.operand)).stripTrailingZeros();
        return temp2.toString();
    }

    /* This method should throw an exception when divide by zero */
    public String division()
    {
        BigDecimal temp1 = new BigDecimal(this.first.operand);
        BigDecimal temp2 = new BigDecimal(this.second.operand);
        if(temp2.compareTo(BigDecimal.ZERO)==0)
        throw new IllegalArgumentException("Argument 'divisor' is 0");
        temp2 = temp1.divide(temp2,5, RoundingMode.HALF_UP).stripTrailingZeros();
        return temp2.toString();
    }


}
