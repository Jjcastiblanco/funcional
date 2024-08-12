package EjercicioCinco;

import java.math.BigDecimal;
import java.util.function.BinaryOperator;

public class BinaryOperatorDiv {
    public static void main(String[] args) {

        BinaryOperator<BigDecimal> binaryOperator = BigDecimal::divide;

        System.out.println(binaryOperator.apply(new BigDecimal(5),new BigDecimal(2)));
    }
}
