package EjercicioOcho;

public class Main {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 3;
        Operaciones operaciones = new Operaciones();
        operaciones.suma(num1, num2).resta(num1, num2).multiplica(num1, num2).divide(num1,num2);
    }
}
