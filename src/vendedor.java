public class vendedor extends persona{
    private int id;
    private String area;
    private double porcentaje_comicion;
    private int sueldo_base;

    vendedor(int id, String area, double porcentaje_comicion, int sueldo_base,String nombre, String Ap, String AM, fecha fecha_de_nacimiento)
    {
        super(nombre, Ap, AM, fecha_de_nacimiento);
        this.id = id;
        this.area = area;
        this.porcentaje_comicion = porcentaje_comicion;
        this.sueldo_base = sueldo_base;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public double getPorcentaje_comicion() {
        return porcentaje_comicion;
    }

    public int getSueldo_base() {
        return sueldo_base;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setPorcentaje_comicion(double porcentaje_comicion, double total) {
        this.porcentaje_comicion += porcentaje_comicion * total;
    }

    public void setSueldo_base(int sueldo_base) {
        this.sueldo_base = sueldo_base;
    }


}
