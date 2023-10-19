import java.util.ArrayList;

public class cliente extends persona{

    private String rfc;
    private String domicilio;
    public ArrayList<factura> compras;
    public factura venta;
    public vendedor v;

    cliente(String rfc, String domicilio, String nombre, String Ap, String AM, fecha fecha_de_nacimiento, ArrayList<factura> compras)
    {
        super(nombre, Ap, AM, fecha_de_nacimiento);
        this.rfc = rfc;
        this.domicilio = domicilio;
        this.compras = compras;
    }

    public factura getVenta() {
        return venta;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getRfc() {
        return rfc;
    }

    public ArrayList<factura> getCompras() {
        return compras;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }
}
