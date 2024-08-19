package EjecicioNueve;

import utilities.UtilitiesGeneric;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<String> nombres = UtilitiesGeneric.addArray("TestUno", "TestDos", "TestTres", "TestCuatro", "TestCinco");
        List<String> filtrados = filtrarNombres(nombres, "TestUno");
        imprimirNombres(filtrados);
    }


    static List<String> filtrarNombres(List<String> lista, String parametro) {
        return lista.stream().filter(nombre -> nombre.equals(parametro)).collect(Collectors.toList());
    }

    static void imprimirNombres(List<String> lista) {
        Optional.ofNullable(lista).ifPresent(l -> l.forEach(System.out::println));
    }

}

