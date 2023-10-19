import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class main {

    static Scanner guardar = new Scanner(System.in);

    static ArrayList<factura> compras = new ArrayList<>();
    static ArrayList<productos> prod = new ArrayList<>();
    static ArrayList<vendedor> vend = new ArrayList<>();
    static ArrayList<productos> product = new ArrayList<>();

    public static String nombres;
    public static String Aps;
    public static String Ams;

    public static vendedor vdd;
    public static fecha f;

    public static void main(String args[])
    {

        File files = new File("C:\\Users\\HP\\Desktop\\productos.txt");
        File filevend = new File("C:\\Users\\HP\\Desktop\\vendedor.txt");

        int opr;
        //Scanner fich =  null;
                try{
                    FileReader sig = new FileReader(files);
                    BufferedReader linea = new BufferedReader(sig);

                    String lineas;
                    //fich = new Scanner(files);

                    String[] pro;
                    while(linea != null)
                    {
                        lineas = linea.readLine();
                        pro = lineas.split(",");

                        int id = Integer.parseInt(pro[0]);
                        String nam = pro[1];
                        double pr = Double.parseDouble(pro[2]);

                        prod.add( new productos(id, nam, pr));
                    }

                    if(linea == null)
                    {
                        linea.close();
                    }
                }catch (Exception io)
                {
                    System.out.println(io);
                }

                try{
                    FileReader sigv = new FileReader(filevend);
                    BufferedReader linev = new BufferedReader(sigv);

                    String[] guardarvendedor;
                    String linea;
                            while( linev != null)
                            {
                                linea = linev.readLine();
                                guardarvendedor = linea.split(",");

                                int id = Integer.parseInt(guardarvendedor[0]);
                                String area = guardarvendedor[1];
                                float porcentaje_comicion = Float.parseFloat(guardarvendedor[2]);
                                int sueldobase = Integer.parseInt(guardarvendedor[3]);
                                String nam = guardarvendedor[4];
                                String ap = guardarvendedor[5];
                                String am = guardarvendedor[6];
                                int din = Integer.parseInt(guardarvendedor[7]);
                                int men = Integer.parseInt(guardarvendedor[8]);
                                int yen = Integer.parseInt(guardarvendedor[9]);
                                f = new fecha(din,men,yen);

                                vend.add(new vendedor(id,area,porcentaje_comicion,sueldobase,nam,ap,am,f));
                            }
                            if(linev == null)
                            {
                                linev.close();
                            }

                }catch(Exception io)
                {
                    System.out.println(io);
                }



        fecha Fecha;
        ArrayList<cliente> client = new ArrayList<>();

        do {
            System.out.println("[1] Registrar cliente");
            System.out.println("[2] Registrar vendedor");
            System.out.println("[3] facturar");
            System.out.println("[4] listar ventas de vendedor");
            System.out.println("[ ] Opcion:");
            int Registro = guardar.nextInt();

            switch (Registro) {
                case 1:

                    System.out.println("RFC:");
                    String rf = guardar.nextLine();
                    System.out.println("Domicilio:");
                    String dmc = guardar.nextLine();

                    nombre();

                    System.out.println("Fecha de nacimiento:");
                    Fecha = fechas();
                    factura();

                    client.add(new cliente(rf, dmc, nombres, Aps, Ams, Fecha, compras));
                    break;

                case 2:

                    System.out.println("id:");
                    int ID = guardar.nextInt();
                    System.out.println("Area:");
                    String Ar = guardar.nextLine();
                    System.out.println("porcentaje de comicion:");
                    float PC = guardar.nextInt();
                    System.out.println("Sueldo base:");
                    int SB = guardar.nextInt();

                    nombre();
                    Fecha = fechas();

                    vend.add(new vendedor(ID, Ar, PC, SB, nombres, Aps, Ams, Fecha));

                    break;

                case 3:
                    //String nm;
                    for (cliente cl : client) {
                        //nm = cl.getNombre();
                        //if (nm == nn) {
                            for (factura f : compras) {
                                System.out.println(f.getFecha_factura().getDia() + " " + f.getFecha_factura().getMes() + " " + f.getFecha_factura().getYear());
                            }
                            System.out.println("Cliente: " + cl.getNombre());
                            System.out.println();

                            for (factura f : compras) {
                                System.out.println("Vendedor: " + f.getVendedor().getNombre());
                                System.out.println("Area: " + f.getVendedor().getArea());
                                System.out.println();
                            }


                            for (productos p : product) {
                                System.out.println("Id: " + p.getId() + "  Descripcion: " + p.getDescripcion() + "  Precio: " + p.getPrecio());
                            }

                            for (factura f : compras) {
                                System.out.println();
                                System.out.println("Subtotal: " + f.getSubtotal());
                                System.out.println("Total: " + f.getTotal());
                            }

                            break;
                        //}
                    }
                    break;
                case 4:
                    System.out.println("Ingresa el id del vendedor");
                    int idv = guardar.nextInt();

                    for (vendedor v : vend) {
                        if (v.getId() == idv) {
                            System.out.println("Vendedor: " + v.getNombre() + " comicion por ventas: " + v.getPorcentaje_comicion() + " Sueldo base:" + v.getSueldo_base());
                            break;
                        }
                    }
                    break;
            }
            System.out.println("Reiniciar programa?[1] Si [2]No");
            opr = guardar.nextInt();
        }while(opr == 1);
    }



    public static void nombre()
    {
        System.out.println("Nombre:");
        nombres = guardar.nextLine();
        System.out.println("Apellido paterno:");
        Aps = guardar.nextLine();
        System.out.println("Apellido materno:");
        Ams = guardar.nextLine();
    }

    public static fecha fechas()
    {
        System.out.println("Dia:");
        int dia = guardar.nextInt();
        System.out.println("Mes:");
        int mes = guardar.nextInt();
        System.out.println("año:");
        int year = guardar.nextInt();

        return new fecha(dia, mes, year);
    }

    public void agregarProducto()
    {
        System.out.println("Ingrese id del producto:");
        int id = guardar.nextInt();
        System.out.println("Ingrese descripcion del pruducto:");
        String descripcion = guardar.toString();
        System.out.println("Ingrese precio del pruducto:");
        float precio = guardar.nextInt();

        prod.add(new productos(id, descripcion, precio));
    }

    public static void factura()
    {
        System.out.println("Fecha de facturacion:");
        fecha f = fechas();

        int idfac = 0;
        idfac = idfac + 1;
        int op;
        float tot = 0;

        System.out.println("Listar productos?[1] Si[2] No:");
        int li = guardar.nextInt();

        if(li == 1)
        {
            for(productos p : prod)
            {
                System.out.println("ID: "+p.getId());
                System.out.println("Descripcio: "+p.getDescripcion());
                System.out.println("Precio: "+p.getPrecio());
                System.out.println();
            }
        }
        do {
            System.out.println("Ingrese id del producto:");
            int idprod = guardar.nextInt();

            for (productos pr : prod) {
                if (idprod == pr.getId()) {
                    tot += pr.getPrecio();
                    product.add(new productos(pr.getId(), pr.getDescripcion(), pr.getPrecio()));

                    break;
                }
            }

            System.out.println("Quieres agregar nuevo producto?[1] Si [2] No:");
            op = guardar.nextInt();
        }while(op == 1);

        double subtotal = tot;
        double iva = .16;
        double total = (subtotal * iva) + subtotal;

        System.out.println("Ingrese id del vendedor:");
        int idvend = guardar.nextInt();
        double pc = 0;

        for (vendedor vd : vend) {
            if(idvend == vd.getId())
            {

                vd.setPorcentaje_comicion(vd.getPorcentaje_comicion(), total);
                vdd = new vendedor(vd.getId(), vd.getArea(), vd.getPorcentaje_comicion(), vd.getSueldo_base(), vd.getNombre(), vd.getAp(), vd.getAM(), vd.fecha_de_nacimiento);
                break;
            }
        }
        compras.add(new factura(idfac, subtotal, iva, total, f, vdd, product));
    }
}


