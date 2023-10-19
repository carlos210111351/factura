public class fecha {
    private int dia;
    private int mes;
    private int year;

    fecha(int dia, int mes, int year)
    {
        this.dia = dia;
        this.mes = mes;
        this.year = year;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public int getYear() {
        return year;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
