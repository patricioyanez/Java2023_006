
public class Principal {
    public static void main(String[] args) {
        // 2.1.1
        // Ejercicio 2: 
        // crear 2 puestos y 2 empleados
        // agregarlo a la empresa (crear)
                Puesto p1 = new Puesto(1, "Gerente");
        Puesto p2 = new Puesto(2, "Ejecutivo");

        Empleado e1 = new Empleado("1-9", "Jhon", "M", 10, 50, p1);
        Empleado e2 = new Empleado("2-7", "Jaztine", "F", 3, 40, p2);   
        Empleado e3 = new Empleado("3-5", "Luffy", "F", 3, 15, p2);   
        Empleado e4 = new Empleado("4-3", "Nami", "F", 3, 20, p2);   
 
        Empresa scootin = new Empresa();
        scootin.agregarEmpleado(e1);
        scootin.agregarEmpleado(e2);
        scootin.agregarEmpleado(e3);
        scootin.agregarEmpleado(e4);
        
        System.out.println("**** Buscar Rut ****");
        boolean existe = scootin.buscarEmpleado("3-5");
        if(existe)
            System.out.println("El rut si existe");
        else
            System.out.println("El Rut NO existe");
        
        System.out.println("**** Listado de empleados *****");
        scootin.listarEmpleados();
        
        System.out.println("\nEliminar rut");
        if(scootin.eliminarEmpleado("4-3"))
            System.out.println("Empleado Eliminado");
        else
            System.out.println("Empleado no Eliminado");
        
        System.out.println("**** Listado de empleados *****");
        scootin.listarEmpleados();
        //Ejercicio 3
        // Crear un menu con la opciones:
        // - Ingresar empleado, buscar si existe, 
        // - Listar todo, 
        // - Listar por puesto (seleccionar que puesto), 
        // - Eliminar por rut y salir.
    }
}
