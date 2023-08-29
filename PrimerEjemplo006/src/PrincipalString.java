
public class PrincipalString {
    public static void main(String[] args) {
        String nombre1 = "Ana";
        String nombre2 = "Pedro";
        String texto = "          hola mundo     ";
        String aux = "Ana";
        System.out.println("Length : " + nombre1.length() );
        
        if(nombre1 == aux)
        {
            System.out.println("son Iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
        if(nombre1.equals("Ana"))
        {
            System.out.println("son Iguales");
        }
        else
        {
            System.out.println("No son iguales");
        }
        System.out.println("TRIM: " + texto + ".");
        System.out.println("TRIM: " + texto.trim() + ".");
        
        System.out.println("Mayúscula: " + nombre1.toUpperCase());
        System.out.println("Minúscula: " + nombre1.toLowerCase());
        
        System.out.println("replace: " + 
                texto.replace("hola", "chao"));
        System.out.println(texto);
        System.out.println("metodos encadenados: " + 
                texto.replace("hola", "chao").trim() );
        
        System.out.println("Rut: " + "21200200K".substring(0, 8) );
        String rut = "21200200K";
        
        System.out.println("rut: " + rut.substring(0, 2));
        System.out.println("rut: " + rut.substring(2, 5));
        
        System.out.println("Hola Ana".substring(0, 4));        
        System.out.println("Hola Ana".substring(5));

        System.out.println("index of espacio: " + 
                                "abc de".indexOf(" "));
        
        // Ejercicios:
        // mostrar el primer nombre de: 
        //juan carlos
        //Patricio alejandro
        //Ana Maria
        String nombre = "Ana Maria";
        System.out.println(nombre.substring(0, nombre.indexOf(" ")));
        
        
        
    }
}
