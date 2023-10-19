
public class Principal {
    public static void main(String[] args) {
        Mamifero perro = new Mamifero();
        System.out.println(perro.comer());
        
        //Animal animal = new Animal(); error porque es clase abstracta
        String nombre = "Juan";
        
        EjemploInterface ei = new EjemploInterface();
        ei.grabar();
        ei.eliminar();
        
        double total = 1000 * IOperaciones.IVA;
        System.out.println("Tota a pagar:" + total);
        
        //Ejercicio:
        // 2.3.2 y 2.3.3
    }
}
