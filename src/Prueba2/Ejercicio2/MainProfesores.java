package Prueba2.Ejercicio2;

public class MainProfesores {
    public static void main(String[] args) {
        Enrique e = new Enrique();
        Bea b = new Bea();
        Galisteo g = new Galisteo();

        //Comprobacion toString
        System.out.println(e);
        System.out.println(b);
        System.out.println(g);
        System.out.println("==================================");
        //Comprobacion descansito
        System.out.println("Enrique: "+e.descansito());
        System.out.println("Bea: "+b.descansito());
        System.out.println("Galisteo: "+g.descansito());
        System.out.println("==================================");
        //Comprobacion frase
        System.out.println("Enrique: "+e.fraseCaracteristica());
        System.out.println("Bea: "+b.fraseCaracteristica());
        System.out.println("Galisteo: "+g.fraseCaracteristica());
        System.out.println("==================================");
        //Comprobacion hora de llegada
        System.out.println("Enrique: "+e.horaDeLlegada("Lunes"));
        System.out.println("Bea: "+b.horaDeLlegada("Lunes"));
        System.out.println("Galisteo: "+g.horaDeLlegada("Lunes"));
    }
}
