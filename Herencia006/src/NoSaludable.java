
public class NoSaludable extends Comida{
    private int grasasTrans;
    public NoSaludable(){
        this.grasasTrans = grasasTrans;
    }
    public NoSaludable(int grasasTrans, int codigo, String nombre, int calorias, int sodio) {
        super(codigo, nombre, calorias, sodio);
        this.grasasTrans = grasasTrans;
    }

    public int getGrasasTrans() {
        return grasasTrans;
    }

    public void setGrasasTrans(int grasasTrans) {
        this.grasasTrans = grasasTrans;
    }

    public String imprimir() {
        return "NoSaludable{" + "grasasTrans=" + grasasTrans + '}';
    }
    
    
    
}
