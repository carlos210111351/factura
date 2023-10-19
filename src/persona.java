public class persona {
    private String nombre;
    private String Ap;
    private String AM;
    public fecha fecha_de_nacimiento;

    persona(String nombre, String Ap, String AM, fecha fecha_de_nacimiento)
    {
        this.nombre = nombre;
        this.Ap = Ap;
        this.AM = AM;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
    }

    public String getAM() {
        return AM;
    }

    public String getAp() {
        return Ap;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAM(String AM) {
        this.AM = AM;
    }

    public void setAp(String ap) {
        Ap = ap;
    }
}
