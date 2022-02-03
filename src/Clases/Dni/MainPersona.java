package Clases.Dni;

public class MainPersona {
    public static void main(String[] args) {
    Persona persona = new Persona("Alejandro", "Damas", "Villatoro", 28842458,68,1.69,24,"NB");
    persona.generarDNI();
        System.out.println(persona);
        System.out.println("====================================");
        System.out.println(persona.comprobarSexo("NB"));
        System.out.println("====================================");
        System.out.println(persona.obtenerClasificacionOMS());
        System.out.println("====================================");
        System.out.println(persona.esMayorDeEdad());
    }
}
