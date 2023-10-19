import java.util.ArrayList;

public class factura {
    private int id;
    private double subtotal;
    private double iva;
    private double total;
    public fecha fecha_factura;
    public vendedor Vendedor;
    public ArrayList<productos> productos;

    factura(int id, double subtotal, double iva, double total, fecha fecha_factura, vendedor vend, ArrayList<productos> productos)
    {
        this.fecha_factura = fecha_factura;
        this.id = id;
        this.subtotal = subtotal;
        this.productos = productos;
        this.iva = iva;
        this.total = total;
        this.Vendedor = vend;
    }

    public int getId() {
        return id;
    }

    public ArrayList<productos> getProductos() {
        return productos;
    }

    public double getIva() {
        return iva;
    }

    public fecha getFecha_factura() {
        return fecha_factura;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTotal() {
        return total;
    }

    public vendedor getVendedor() {
        return Vendedor;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    public void setTotal(float total) {
        this.total = total;
    }



}
