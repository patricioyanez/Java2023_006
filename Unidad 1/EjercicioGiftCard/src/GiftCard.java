
import java.sql.Date;

public class GiftCard {
    private long codigo;
    private int clave;
    private int monto;
    private Date vigencia;
    private Trabajador trabajador;

    public GiftCard() {
        this.codigo = 0;
        this.clave = 0;
        this.monto = 0;
        this.vigencia = null;
        this.trabajador = null;
    }
    
    public GiftCard(long codigo, int clave, int monto, Date vigencia, Trabajador trabajador) {
        this.codigo = codigo;
        this.clave = clave;
        this.monto = monto;
        this.vigencia = vigencia;
        this.trabajador = trabajador;
    }

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Date getVigencia() {
        return vigencia;
    }

    public void setVigencia(Date vigencia) {
        this.vigencia = vigencia;
    }

    public String imprimir() {
        return "Codigo          = " + codigo + 
                "\nClave        = " + clave + 
                "\nMonto        = " + monto + 
                "\nVigencia     = " + vigencia + 
                "\n**** Trabajador ***\n" + trabajador.imprimir();
    }
    
    public boolean validarClave()
    {
        // obtiene los 4 primeros digitos del rut
        String rutTemporal = this.trabajador.getRut().
                                replace(".","").
                                substring(0, 4);
        // convertir a numero
        int rutClave = Integer.parseInt(rutTemporal);
        if(rutClave == this.clave)
            return true;
        else
            return false;
    }
    
    public boolean validarCompra(int valorCompra)
    {
        if(this.monto >= valorCompra)
            return true;
        else
            return false;
    }
}
