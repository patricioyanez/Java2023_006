
public class PrincipalCiclo {
    public static void main(String[] args) {
        int numero = 0;
        
        while(numero < 10)
        {
            numero++; // numero += 1
            // numero = numero + 1
            // ++numero 
            System.out.println("While número: " + numero);
        }
        int x = 0;
        System.out.println("Valor de X: " + x++);
        System.out.println("Valor de X: " + x);
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("For Valor i: " + i);
        }
        
        System.out.println("Valor : " + numero);
        // for(;;);
        int xx = 0;
        for(; xx++ < 10;)
        {
            System.out.println("For Valor 2: " + xx);
        }
        xx = 0;
        for(; xx < 10;)
        {
            System.out.println("For Valor 3: " + ++xx);
        }
        
        
    }
}
