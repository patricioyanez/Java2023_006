import java.util.ArrayList;

/**
 *
 * @author patri
 * https://www.youtube.com/@canalparaprogramar/playlists
 */
public class Principal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Pez pez = new Pez();
        Ave ave = new Ave();
        
        System.out.println("Animal  : " + animal.mover());
        System.out.println("Pez     : " + pez.mover());
        System.out.println("Ave     : " + ave.mover());
        
        Animal pececito = new Pez();
        Animal pollo = new Ave();
        
        
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        
        zoo.add(ave);
        zoo.add(pez);
        zoo.add(pececito);
        zoo.add(pollo);
        zoo.add(new Animal());
        
        // Pez prueba = new Animal(); // error, obj no es subclase
        System.out.println("");
        System.out.println("\n*** ver movimiento de los animales ***");
        for (Animal animal1 : zoo) {
            System.out.println(animal1.mover());
        }
        
        System.out.println("\n");
        System.out.println("*** Conocer Clase de origen ***");
        int peces = 0;
        for (Animal animal1 : zoo) {
            if(animal1 instanceof Ave)
                System.out.println("Clase de origen: Ave");
            
            if(animal1.getClass() == Pez.class)
                peces++;
        }
        System.out.println("Cantidad de peces: " + peces);
        
        
        
    }
}
