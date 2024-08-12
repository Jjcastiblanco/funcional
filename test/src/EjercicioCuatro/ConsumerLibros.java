package EjercicioCuatro;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class ConsumerLibros {

    public static void main(String[] args) {

        ArrayList<Libro> libros = new ArrayList<>(3);
        libros.add(new Libro("libroUno", "Libro Uno", 7));
        libros.add(new Libro("libroDos", "Libro Dos", 5));
        libros.add(new Libro("libroTres", "Libro Tres", 8));

        libros(libros);

    }


    static void libros (List<Libro> libros){
        Consumer<List<Libro>>  listConsumer = libros1 -> {
            for (Libro libro : libros) {
                if (listPredicate(libro)){
                    UnaryOperator<String> libroRecomendado  = text -> "El libro recomendado es: " + text;
                    System.out.println(libroRecomendado.apply(libro.getTitulo()));
                }
            }

        };
        listConsumer.accept(libros);

    }

    static boolean listPredicate (Libro libro){
        Predicate<Libro> predicate = lib -> lib.getPuntaje() >= 7 ;
        return predicate.test(libro);
    }
}
