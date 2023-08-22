import java.util.Scanner;

public class Principal2 {
    // atajo 1: psvm + tab
    // atajo 2: main + tab
    public static void main(String[] args) {
        System.out.println("Main 2");
        
        Scanner leerTeclado = new Scanner(System.in);
        
        System.out.print("Ingrese su nombre: ");
        String nombre = leerTeclado.next();
        
        System.out.println("Hola " + nombre + ", ¿Cómo estás?");
        
        //Preguntar la edad
        System.out.print("Ingrese su edad:");
        int edad = leerTeclado.nextInt();
        
        System.out.println("Su edad es: " + edad);
        
        // "convertir", "castear", "parsear"
        
        System.out.print("Ingrese su sueldo: ");
        int sueldo = Integer.parseInt(leerTeclado.next());
        sueldo += 25000;
        
        System.out.println("Sueldo final: " + sueldo);
    }
}
