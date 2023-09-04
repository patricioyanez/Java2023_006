
package Colaboracion;

import java.util.Scanner;


public class Principal {
    public static void main(String[] args) {
        
        Cancion cancion1 = new Cancion();
        cancion1.setNombre("Llueve Sobre La Ciudad");
        cancion1.setArtista("Los Bunkers");
        cancion1.setAlbum("Vida de perros");
        cancion1.setDuracion(250);
        cancion1.setGenero("rock");
        
        System.out.println("Nombre de canción: " + cancion1.getNombre() );
        
        Streaming spotify = new Streaming(cancion1, 100);
        
        System.out.println(spotify.imprimir());
        
        // Ejercicios:
        // crear un método mostrar cuantos segundos quedan de la canción
        System.out.println("Segundos faltantes: " + 
                            spotify.segundosFaltantes());
        
        
        // ejercicio 2:
        // Crear otra canción y reproducirla.
        // solicitar los datos por la consola. 
        // todos los datos son obligatorios.
        
        Cancion cancion2 = new Cancion();
        
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Nombre    : ");
        cancion2.setNombre(leerTeclado.next());
        System.out.print("Banda     : ");
        cancion2.setArtista(leerTeclado.next());
        System.out.print("Album     : ");
        cancion2.setAlbum(leerTeclado.next());
        System.out.print("Género    : ");
        cancion2.setGenero(leerTeclado.next());
        System.out.print("Duración  : ");
        cancion2.setDuracion(leerTeclado.nextInt());
        
        spotify.setCancion(cancion2);
        spotify.setSegundosReproducidos(50);
        System.out.println(spotify.imprimir());
    }
}
