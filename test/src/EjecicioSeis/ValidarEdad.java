package EjecicioSeis;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.BiPredicate;

public class ValidarEdad {

    public static void main(String[] args) {

        LocalDate fechaNacimiento = LocalDate.of(2000,7,2);

        //No aplico el bifunction ya que para el valor boleano de autilizarce un predicate
        BiPredicate<LocalDate,Integer > calcularEdad = (fecha, edad)->{
            int edadReal = Period.between(fecha,LocalDate.now()).getYears();
            return edad.compareTo(edadReal) == 0;
        };


        TriFunction<String,Integer, LocalDate,String> validarData = (nombre,edad,fecha) ->{
            if(Boolean.TRUE.equals(calcularEdad.test(fecha,edad))){
                return  String.format("La fecha de nacimiento de %s corresponde", nombre);
            }else{
               return String.format("La fecha de nacimiento de %s no corresponde a la edad ingresada", nombre);
            }

        };
        System.out.println(validarData.apply("Test",24,fechaNacimiento));



    }


    @FunctionalInterface
    interface TriFunction<T,U,V,R>{
        R apply(T t, U u, V v);
    }

}
