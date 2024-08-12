package EjercicioDos;

import java.util.function.Function;

public class Potencia {

    public static void main(String[] args) {
        Function<Integer, Double> potencia = e -> Math.pow(3, e);

        Integer exponente = 3;
        System.out.println(potencia.apply(exponente));

    }

}
