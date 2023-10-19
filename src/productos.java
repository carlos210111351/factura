public class productos
{
    private int id;
    private String descripcion;
    private double precio;

    productos(int id, String descripcion, double precio)
    {
        this.descripcion = descripcion;
        this.id = id;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
}
