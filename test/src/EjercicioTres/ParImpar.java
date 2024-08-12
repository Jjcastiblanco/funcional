package EjercicioTres;

import java.util.function.Function;
import java.util.function.Predicate;

public class ParImpar {

    public static void main(String[] args) {
        Function<Integer, Double> potencia = e -> Math.pow(2, e);

        Integer exponente = 2;
        Double resultado = potencia.apply(exponente);
        System.out.println(resultado);


        Predicate<Double> isPar = e -> e % 2 == 0;

        System.out.println(isPar.test(resultado));

    }
}
