// comentario simple
/*
 comentario de más de una línea
*/
public class Principal {
    // método main ( entry point)
    public static void main(String args[])
    {  // ppt 1.2.1
        System.out.println("Hola Mundo!!!");
        // crear objeto
        Pizza pizza1 = new Pizza();
        Pizza pizza2 = new Pizza("Española", "Mediana", "Delgada", 8000);
        
        pizza1.calentar();
        
        // mostrar el tamaño de la pizza en la consola
        System.out.println("Tamaño Pizza 1: " + pizza1.getTamano());
        System.out.println("Tamaño Pizza 2: " + pizza2.getTamano());

        pizza1.setTamano("Familiar");
        System.out.println("Tamaño Pizza 1: " + pizza1.getTamano());
        
        
        System.out.println("\n****** Pizza 2 ******");
        System.out.println("Nombre      : " + pizza2.getNombre());
        System.out.println("Tamaño      : " + pizza2.getTamano());
        System.out.println("Masa        : " + pizza2.getMasa());
        System.out.println("Precio      : " + pizza2.getPrecio());
        
        // agregar datos a la pizza1 y mostrar en la consola
        pizza1.setNombre("Hawaii");
        pizza1.setMasa("Delgada");
        pizza1.setTamano("Mediana");
        pizza1.setPrecio(10000);
        
        System.out.println("\n****** Pizza 1 ******");
        System.out.println("Nombre      : " + pizza1.getNombre());
        System.out.println("Tamaño      : " + pizza1.getTamano());
        System.out.println("Masa        : " + pizza1.getMasa());
        System.out.println("Precio      : " + pizza1.getPrecio());
        
        
        System.out.println("\n\n****** Pizza 1 ******");
        System.out.println(pizza1.datos());
        System.out.println("\n\n****** Pizza 2 ******");
        System.out.println(pizza2.datos());
        
    }
    
}
