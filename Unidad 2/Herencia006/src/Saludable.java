
public class Saludable extends Comida {
    private boolean esOrigenNatural;
    public Saludable()
    {
        this.esOrigenNatural = false;
    }
    public Saludable(boolean esOrigenNatural, int codigo, String nombre, int calorias, int sodio) {
        super(codigo, nombre, calorias, sodio);
        this.esOrigenNatural = esOrigenNatural;
    }

    public boolean isEsOrigenNatural() {
        return esOrigenNatural;
    }

    public void setEsOrigenNatural(boolean esOrigenNatural) {
        this.esOrigenNatural = esOrigenNatural;
    }

    public String imprimir() {
        return  " **** Comida Saludable ****" +
                "\nCodigo           : " + getCodigo() + 
                "\nNombre           : " + getNombre() + 
                "\nCalorias         : " + getCalorias() + 
                "\nSodio            : " + getSodio() +                 
                "\nEs Origen Natural: " + (esOrigenNatural?"Si":"No");
    }

    // sobre escritura: cambiar la funcionalidad original del metodo heredado
    @Override // notación
    public String tipoComida() {
        return "Esta comida es saludable"; 
    }

    @Override
    public String toString() {
        return "Saludable{" + "esOrigenNatural=" + esOrigenNatural + '}';
    }

    // sobre carga
    public String cocinar()
    {
        return "Cocinar por 15 minutos";
    }
    
    public String cocinar(int minutos)
    {
        return "Cocinar por " + minutos +"  minutos";
    }
    
    public String cocinar(int minutos, String tipoCoccion)
    {
        return "Cocinar por " + minutos + "  minutos." +
                " Tipo de cocción "  + tipoCoccion;
    }
    
    
    
    
}
