import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal numero = new BigDecimal("1935.94");

        // Redondear el número a dos decimales usando el método HALF_EVEN
        BigDecimal numeroRedondeado = numero.setScale(2, RoundingMode.HALF_EVEN);

        // Imprimir el número redondeado
        System.out.println(numeroRedondeado);
    }


}
