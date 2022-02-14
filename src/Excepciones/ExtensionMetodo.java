package Excepciones;

public class ExtensionMetodo {
    public void metodo() throws ExtensionExcepcion {
        boolean hola= false;
        //2.Aqui va el codigo del metodo
        if(hola) {
            throw new ExtensionExcepcion("Error creado(este es el mensaje)");
        }
    }
}
