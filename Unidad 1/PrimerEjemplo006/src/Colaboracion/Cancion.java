package Colaboracion;

public class Cancion {
    // 1.- atributos
    // 2.- constructores    
    // 3.- getter and setter    
    // 4.- métodos customer
    private String nombre;
    private String album;
    private String artista;
    private String genero;
    private int duracion;

    public Cancion() {
        this.nombre = "";
        this.album = "";
        this.artista = "";
        this.genero = "";
        this.duracion = 0;
    }
    
    public Cancion(String nombre, String album, String artista, String genero, int duracion) {
        this.nombre = nombre;
        this.album = album;
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    
    public String imprimir() {
        return    "Nombre   = " + nombre + 
                "\nAlbum    = " + album + 
                "\nArtista  = " + artista + 
                "\nGenero   = " + genero + 
                "\nDuracion = " + duracion;
    }
    
    
    
}
