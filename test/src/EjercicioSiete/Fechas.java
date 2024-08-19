package EjercicioSiete;

import utilities.UtilitiesGeneric;

import java.time.LocalDate;
import java.util.List;

public class Fechas {

    public static void main(String[] args) {


        List<LocalDate> fechas = UtilitiesGeneric.addArray(LocalDate.now(),LocalDate.of(2022,7,2));
        fechas.forEach(Fechas::getDateStr);

    }



    static void getDateStr(LocalDate localDate){
        System.out.println(String.format("La fecha es %d de %s del %d%n", localDate.getDayOfMonth(), localDate.getMonth(), localDate.getYear()));
    }




}
