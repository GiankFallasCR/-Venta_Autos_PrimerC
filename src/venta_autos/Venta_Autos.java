package venta_autos;

import java.text.ParseException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Venta_Autos {
    public void menu() throws ParseException {
        Scanner leer = new Scanner(System.in);
        int Seleccion = 0;
        int opcion = 0;

        JOptionPane.showMessageDialog(null,"¡Bienvenido a nuestro Programa!");
        System.out.println("Digite la opcion de preferencia.");
        System.out.println("1. Comprar vehiculo \n2. Ver vehiculos disponibles \n3. Salir");//alt+92
        System.out.println(" ");
        System.out.println(" ");

        Seleccion = leer.nextInt();

        switch (Seleccion) {
            case 1:
                Factura fac = new Factura();
                fac.comprar();
                break;
            case 2:
                Presupuestos pre = new Presupuestos();
                pre.info_Presupuesto();
                break;
            case 3:
                System.out.println("Gracias por su visita.");
                System.exit(1);
                break;
            default:
                limpiar_pantalla();
                System.out.println("Opción invalida...\n");
                Venta_Autos va = new Venta_Autos();
                va.menu();
        }//termina switch
    }

    public void limpiar_pantalla() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("");
        }
    }

    public static void main(String[] args) throws ParseException {
        Venta_Autos va = new Venta_Autos();
        va.menu();
    }//termina main
}//termina clase venta_Autos
