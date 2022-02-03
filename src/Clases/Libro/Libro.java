package Clases.Libro;
//-Tiene ISBN
//-Tiene titulo,
//-Tiene autor
//-Tiene numero paginas
//-Tiene categoria
//-Tiene año publicacion
//-Tiene editorial

//-Puede estar prestado o no prestado(Disponible)
//-Metodo Prestar/Prestamo mira en que estado se encuentra y lo cambia
//-Metodo que compare un libro con otro y diga cual tiene mas paginas
//-Sobrecargar la funcion toString para que imprima la info del libro
public class Libro {
//==============================VARIABLES==================================
    private String isbn="";
    private String titulo="";
    private String autor="";
    private String editorial="";
    private String categoria="";
    private int numPag=0;
    private int anoPub;

    private boolean prestado =false;

//=============================CONSTRUCTOR==================================

    public Libro(String isbn, String titulo, String autor, String editorial, String categoria, int numPag, int anoPub) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.numPag = numPag;
        this.anoPub = anoPub;
    }

    public Libro(String titulo, String autor, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPag = numPag;
    }

    public Libro(String titulo, String autor, String editorial, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.numPag = numPag;
    }

    public Libro(String titulo, String autor, String editorial, String categoria, int numPag) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.numPag = numPag;
    }

    public Libro(String isbn, String titulo, String autor, String editorial, String categoria, int numPag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.categoria = categoria;
        this.numPag = numPag;
    }

    //==========================GETTER Y SETTER=================================

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }
    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNumPag() {
        return numPag;
    }
    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public int getAnoPub() {
        return anoPub;
    }
    public void setAnoPub(int anoPub) {
        this.anoPub = anoPub;
    }

    //==============================METODOS=====================================

    public boolean isPrestado() {
        return prestado;
    }
    public void prestar(){
        if(!this.prestado){
            prestado =true;
        }
    }
    public void devolver(){
        if(this.prestado){
            prestado =false;
        }
    }
    public String comparePagMayor(Libro libro2){
        String mayor ="Iguales";

        if(this.numPag > libro2.numPag){
            mayor=this.titulo;
        }else if(this.numPag< libro2.numPag){
            mayor=this.titulo;
        }
        return mayor;
    }
    public String comparePagMenor(Libro libro2){
        String menor="Iguales";
        if(this.numPag > libro2.numPag){
            menor=libro2.titulo;
        }else if(this.numPag< libro2.numPag){
            menor=libro2.titulo;
        }
        return menor;
    }

    @Override
    public String toString() {
        return "Libro:" +
                "\nTitulo='" + titulo + '\'' +
                "\nAutor='" + autor + '\'' +
                "\nEditorial='" + editorial + '\'' +
                "\nISBN='" + isbn + '\'' +
                "\nCategoria='" + categoria + '\'' +
                "\nNumero Pagina= " + numPag +
                "\nAño Publicacion= " + anoPub +
                "\nPrestado= " + prestado;
    }
}
