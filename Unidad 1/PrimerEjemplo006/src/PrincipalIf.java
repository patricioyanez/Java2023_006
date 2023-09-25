
import java.util.Scanner;


public class PrincipalIf {
    public static void main(String[] args) {
        System.out.println("Sentencia IF");
        
        if(1 == 1)
            System.out.println("1 es igual a 1");
        
        if(2 == 2)
        {
            System.out.println("1ra linea");
            System.out.println("2da linea");
            System.out.println("x lineas...");
        }
        
        if(3 > 10)
        {
            System.out.println("3 es mayor a 10");
        }
        else
        {
            System.out.println("3 no es mayor que 10");
        }
        
        int numero = 8;        
        if(numero < 10)
        {
            System.out.println("Tienen solo Unidad");
        }
        else if(numero < 100)
        {
            System.out.println("Tiene Decena");
        }
        else if(numero < 1000)
        {
            System.out.println("Tiene centena");
        }
        else
        {
            System.out.println("Es un numero grande");
        }
        // ejercicio: solicitar la edad al usuario 
        // y clasificarlo por su generación
        int edad = 0;
        
        Scanner leerTeclado = new Scanner(System.in);
        System.out.print("Escriba su edad: ");        
        edad = leerTeclado.nextInt();
        // && -> and   || -> or
        if(edad > 11 && edad <= 23) // 12... 23
        {
            System.out.println("Ud. es la generación de Z");
        }
        else if(edad > 23 && edad < 43)
        {
            System.out.println("Ud. es la generación millennials");
        }
        else if(edad > 42 && edad < 55)
        {
            System.out.println("Ud. es la generación x");
        }
        else
        {
            System.out.println("Ud. es un boomers");
        }
        
    }
}
