package venta_autos;

import java.util.Scanner;
public class Clientes {

    Scanner leer = new Scanner(System.in);

    String nombre = "", apellidos, direccion, sTipoPago, sTipoTarjeta;
    int telefono;
    private int tipoPago, tipoTarjeta;

    public void pedirDatos() {

        System.out.println("Para continuar con el proceso, requerimos sus datos. Para iniciar, digite su nombre: ");
        nombre = leer.nextLine();

        System.out.println("Digite sus apellidos: ");
        apellidos = leer.nextLine();

        System.out.println("Digite su dirección: ");
        direccion = leer.nextLine();

        System.out.println("Digite su numero de telefono: ");
        telefono = leer.nextInt();

        System.out.println("Seleccione su tipo de pago:  ");
        System.out.println("1: Efectivo");
        System.out.println("2: Tarjeta");
        tipoPago = leer.nextInt();

        if (tipoPago == 1) {
            sTipoPago = "Efectivo";
            sTipoTarjeta = "---";
        } else {
            sTipoPago = "Tarjeta";

            System.out.println("Seleccione su tipo de tarjeta:  ");
            System.out.println("1: Credito");
            System.out.println("2: Debito");

            if (tipoPago == 1) {
                sTipoTarjeta = "Credito";
            } else {
                sTipoTarjeta = "Debito";
            }
        }
    }
}