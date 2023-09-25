import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> nombres;
        nombres = new ArrayList<String>();
        
        nombres.add("Lyffy");
        nombres.add("Zoro");
        nombres.add("Nami");
        
        System.out.println("Personajes de One Piece");
        System.out.println("- " + nombres.get(0));
        System.out.println("- " + nombres.get(1));
        System.out.println("- " + nombres.get(2));
        
        System.out.println("Cantidad de elementos");
        System.out.println("Cant.: " + nombres.size());
        
        ArrayList<Integer> numeros = new ArrayList<>();
        System.out.println("Cantidad de elementos numeros:");
        System.out.println(numeros.size());
        
        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        
        System.out.println("Cantidad de elementos numeros:");
        System.out.println(numeros.size());
        
        nombres.add("Robin");
        nombres.add("Usopp");
        for(String nombre: nombres)
        {
            System.out.println("nombre: " + nombre);
        }
        
        // metodos adicionales:
        int indice = nombres.indexOf("Nami");
        
        if(indice >= 0)
            System.out.println("Existe");
        else
            System.out.println("No existe");
        
        boolean existe = nombres.contains("Nami");
        
        if(existe)
            System.out.println("Está Nami");
        else
            System.out.println("No está Nami");
        
        System.out.println("*** Eliminar elementos ****");
        boolean fueEliminado = nombres.remove("Zoro");
        if(fueEliminado)
            System.out.println("Zoro fue eliminado");
        else
            System.out.println("Zoro no fue eliminado");
        
        String personaje = nombres.remove(1);
        System.out.println("El personaje eliminado es: " + personaje);
        
        System.out.println("*** Clear ***");
        System.out.println("Cant. Elementos: " + nombres.size());
        nombres.clear();
        System.out.println("Cant. Elementos: " + nombres.size());
        
        
        
        
    }
}
