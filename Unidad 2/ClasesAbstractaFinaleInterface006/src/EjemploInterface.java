
public class EjemploInterface implements IOperaciones {

    @Override
    public int grabar() {
        System.out.println("ORdenando los datos....");
        System.out.println("Almacenando los datos....");
        System.out.println("Ejecución exitosa....");
        return 1;
    }

    @Override
    public int eliminar() {        
        System.out.println("Buscando los datos....");
        System.out.println("Eliminando los datos....");
        System.out.println("Ejecución exitosa....");
        return 1;
    }
    
}
