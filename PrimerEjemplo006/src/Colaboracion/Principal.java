
package Colaboracion;

public class Principal {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        cancion1.setNombre("Llueve Sobre La Ciudad");
        cancion1.setArtista("Los Bunkers");
        cancion1.setAlbum("Vida de perros");
        cancion1.setDuracion(200);
        cancion1.setGenero("rock");
        
        Streaming spotify = new Streaming(cancion1, 100);
        
        System.out.println(spotify.imprimir());
    }
}
