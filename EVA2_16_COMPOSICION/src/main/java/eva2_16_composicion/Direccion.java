package eva2_16_composicion;

/**
 *
 * @author alexi
 */
public class Direccion {
    private String estado;
    private String ciudad;
    private String colonia;
    private String calle;
    private int NumeroCasa;
    
        public Direccion() {
        this.estado = "";
        this.ciudad = "";
        this.colonia = "";
        this.calle = "";
        this.NumeroCasa = 0;
    }

    public Direccion(String estado, String ciudad, String colonia, String calle, int NumeroCasa) {
        this.estado = estado;
        this.ciudad = ciudad;
        this.colonia = colonia;
        this.calle = calle;
        this.NumeroCasa = NumeroCasa;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getColonia() {
        return colonia;
    }

    public void setColonia(String colonia) {
        this.colonia = colonia;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(int NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }
    
    
    
}
