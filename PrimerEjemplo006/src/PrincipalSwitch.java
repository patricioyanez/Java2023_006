
import java.util.Scanner;
public class PrincipalSwitch {
    public static void main(String[] args) {
        Scanner leerTeclado = new Scanner(System.in);
        System.out.println("Ingrese su curso: ");
        int curso = leerTeclado.nextInt();
        
        switch(curso)
        {
            case 1:
                System.out.println("1ro Básico");
                break;
            case 2:
                System.out.println("2do Básico");
                break;
            case 3:
                System.out.println("3ro Básico");
                break;
            case 4:
                System.out.println("4to Básico");
                break;
            case 5:
                System.out.println("5to Básico");
                break;
            case 6:
                System.out.println("6to Básico");
                break;
            case 7:
                System.out.println("7mo Básico");
                break;
            case 8:
                System.out.println("8vo Básico");
                break;
            default:
                System.out.println("Nro no existe para la básica");
        }
    }
}
