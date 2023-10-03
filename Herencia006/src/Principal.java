
public class Principal {
    public static void main(String[] args) {
        Saludable manzana = new Saludable();
        
        manzana.setCalorias(100);
        manzana.setCodigo(78000000);
        manzana.setEsOrigenNatural(true);
        manzana.setNombre("Manzana");
        manzana.setSodio(50);
        //Ejercicio 1: imprimir todos los datos
        // de la manzana
        System.out.println(manzana.imprimir());
        
    }
}
