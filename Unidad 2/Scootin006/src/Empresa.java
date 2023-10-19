
import java.util.ArrayList;

// new empresa()
public class Empresa {
    //ArrayList<Empleado> empleados = new ArrayList<Empleado>();
    
    ArrayList<Empleado> empleados;
    
    public Empresa()
    {
        empleados = new ArrayList<Empleado>();
    }
    // continuar con ejercicio ppt
    public boolean agregarEmpleado(Empleado empleado)
    {
        // evitar que se agregue 2 veces el mismo rut
        return empleados.add(empleado);
    }
    
    public boolean buscarEmpleado(String rut)
    {
        //recorrer la colección
        for (Empleado aux : empleados) {
            if(aux.getRut().equals(rut))
                return true;
        }
        return false;
    }
    public void listarEmpleados()
    {
        System.out.println("**** Listado de empleados *****");
        for (Empleado empleado : empleados) {
            System.out.println(empleado.imprimir());
        }
    }
    public boolean eliminarEmpleado(String rut)
    {
        //recorrer la colección para eliminar
        for (Empleado aux : empleados) {
            if(aux.getRut().equals(rut))
                return empleados.remove(aux);
        }
        return false;
    }
}
