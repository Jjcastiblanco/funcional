package EjercicioUno;

public class Main {
    public static void main(String[] args) {
        PersonaInmutable personaInmutable = new PersonaInmutable("Tets","Test",100);
        System.out.println("personaInmutable: " + personaInmutable);

        PersonaMutable personaMutable = new PersonaMutable("Tets","Test",100);
        personaMutable.setApellido("TestModificado");
        System.out.println("personaMutable: " + personaMutable);

    }
}
