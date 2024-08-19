package EjercicioOcho;

public class Operaciones {

    public Operaciones suma(int op1, int op2) {
        int resultado = op1 + op2;
        System.out.println( String.format("Suma : %d  + %d  = %d", op1,op2,resultado ));
        return this;
    }
    public Operaciones resta(int op1, int op2) {
        int resultado = op1 - op2;
        System.out.println(String.format("Resta : %d  - %d  = %d", op1,op2,resultado ));
        return this;
    }

    public Operaciones multiplica(int op1, int op2) {
        int resultado = op1 * op2;
        System.out.println(String.format("multiplicacion : %d  * %d  = %d", op1,op2,resultado ));
        return this;
    }

    public Operaciones divide(int op1, int op2) {
        int resultado = op1 / op2;
        System.out.println(String.format("division : %d  / %d  = %d", op1,op2,resultado ));
        return this;
    }

}
