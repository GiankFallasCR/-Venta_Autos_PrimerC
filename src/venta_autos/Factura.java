package venta_autos;

import java.text.ParseException;
import java.util.Random;
import java.util.Scanner;
public class Factura {

    Venta_Autos va = new Venta_Autos();
    Vehiculos_Stock vS = new Vehiculos_Stock();
    Extras xtras = new Extras();
    Placa plca = new Placa();
    Mantenimiento mant = new Mantenimiento();
    Clientes client = new Clientes();

    Scanner leer = new Scanner(System.in);
    private int opcion;

    public void comprar() throws ParseException {
        vS.InfoStock();
//        va.limpiar_pantalla();//limpia la consola
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Desea seleccionar extras? ");
        System.out.println("1. Si");
        System.out.println("2. No");
                System.out.println(" ");

        opcion = leer.nextInt();

        if (opcion == 1) {
            xtras.Info_Extras();
//            System.out.println("Precio total por extras: $" + xtras.total);
        }

        va.limpiar_pantalla();//limpia la consola
        plca.Placa_Info();
//        System.out.println("Su placa sera: " + plca.placa);
        va.limpiar_pantalla();//limpia la consola
        mant.Info_Mante();
        va.limpiar_pantalla();//limpia la consola
        client.pedirDatos();

        va.limpiar_pantalla();//limpia la consola
        crear_factura();
    }

    private double calcular_IVA(double subtotal) {

        double total, impuestos, IVA;

        IVA = subtotal * 0.13; //obtiene el 13% del precio de vehiculo

        total = subtotal + IVA; // agrega el 13% de impuestos al precio del vehiculo

        return total;
    }

    private void crear_factura() {

        Random ran = new Random();
        double TotalV, TotalE,totalEsteSi;
       

        System.out.println("Numero de factura: " + Math.abs(ran.nextInt()));
                        System.out.println(" ");
                        System.out.println(" ");

        System.out.println("Datos del Cliente: ");
                System.out.println(" ");
        
        System.out.println("    Nombre: " + client.nombre + " " + client.apellidos);
        System.out.println("    Telefono:" + client.telefono);
        System.out.println("    Direccion:" + client.direccion);
        System.out.println("    Tipo de Pago:" + client.sTipoPago);
        System.out.println("    Tipo de Tarjeta:" + client.sTipoTarjeta);
        System.out.println(" ");

        System.out.println("Datos del Vehiculo: ");
        System.out.println("    Placa: " + plca.placa);
        System.out.println("    Vehiculo: " + vS.vehiculo);

                                System.out.println(" ");

        System.out.println("Subtotal Vehiculo (Sin IVA): " + vS.total+" USD");        
        TotalV = calcular_IVA(vS.total);  
        System.out.println("Total Vehiculo: (Con IVA)" + TotalV+" USD");
        
        System.out.println("Subtotal Extras: (Sin IVA) " + xtras.total+" USD");
        TotalE = calcular_IVA(xtras.total);
        System.out.println("Total Extras: (Con IVA) " + TotalE+" USD");
        totalEsteSi = TotalV+TotalE ; 
        System.out.println("Total: " + totalEsteSi+" USD");
    }
}