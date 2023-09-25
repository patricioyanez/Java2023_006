
public class Pizza {
    // atributos
    private String nombre;
    private String tamano;
    private String masa;
    private int precio;
    // constructor
    public Pizza()
    {
        nombre = "";
        tamano = "personal";
        masa = "";
        precio = 0;
    }
    public Pizza(String nombre, String tamano, String masa, int precio)
    {
        this.nombre = nombre;
        this.tamano = tamano;
        this.masa = masa;
        this.precio = precio;
    }
    
    // getter and setter / accesador y mutador
    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    // métodos personalizado (customer)
    public void preparar()
    {
        System.out.println("La pizza se está preparando");
    }
    public void calentar()
    {
        System.out.println("La pizza se está calentando");
    }
    public String datos()
    {
        return "Nombre  : " + this.nombre+
               "\nTamaño  : " + this.tamano +
               "\nMasa    : " + this.masa +
               "\nPrecio  : " + this.precio; 
    }

}
