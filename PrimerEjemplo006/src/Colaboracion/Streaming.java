
package Colaboracion;

public class Streaming {
    // 1.- atributos
    // 2.- constructores    
    // 3.- getter and setter    
    // 4.- métodos customer
    private Cancion cancion;
    private int segundosReproducidos;

    public Streaming() {
        this.cancion = null; // new Cancion();
        this.segundosReproducidos = segundosReproducidos;
    }
    public Streaming(Cancion cancion, int segundosReproducidos) {
        this.cancion = cancion;
        this.segundosReproducidos = segundosReproducidos;
    }

    public int getSegundosReproducidos() {
        return segundosReproducidos;
    }

    public void setSegundosReproducidos(int segundosReproducidos) {
        this.segundosReproducidos = segundosReproducidos;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    public String imprimir() {
        return "cancion\n" + cancion.imprimir() + 
     "\nsegundosReproducidos=" + segundosReproducidos;
    }
    
    
    
}
