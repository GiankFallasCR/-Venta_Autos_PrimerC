package venta_autos;

import java.util.Scanner;
public class Presupuestos {//esta clase es para trabajar presupuestos

    Scanner leer = new Scanner(System.in);

    private double presupuesto = 0;
    double arrayPresupuesto[] = new double[1];//aqui se almacena el presupuesto para imprimirlo
    int opcion;

    public Presupuestos() {

    }//termina constructor

    Vehiculos_Stock vs2 = new Vehiculos_Stock();

    public void info_Presupuesto() {

        System.out.println("Desea ver todos los vehículos?");
        System.out.println("1. Si");
        System.out.println("2. No, deseo filtrar por presupuesto");
        opcion = leer.nextInt();
        if (opcion == 1) {

            vs2.InfoStock();

        } else {
            System.out.println("");
            System.out.println("Digite su presupuesto");

            presupuesto = leer.nextInt();

            if (presupuesto > 22000 && presupuesto <= 26.900) {
                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 22000 && presupuesto > 210000) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");
                System.out.println("Nissan Frontier - $35.000 ");
                System.out.println("Toyota Fortuner - $54.800 ");
                System.out.println("Lexus LC500 - $82.000 ");
                System.out.println("Toyota Tundra - $88.000");
                System.out.println("Lexus RX350 - $210.000");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 22000 && presupuesto > 88000) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");
                System.out.println("Nissan Frontier - $35.000 ");
                System.out.println("Toyota Fortuner - $54.800 ");
                System.out.println("Lexus LC500 - $82.000 ");
                System.out.println("Toyota Tundra - $88.000");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 22000 && presupuesto > 82000) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");
                System.out.println("Nissan Frontier - $35.000 ");
                System.out.println("Toyota Fortuner - $54.800 ");
                System.out.println("Lexus LC500 - $82.000 ");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 22000 && presupuesto > 54800) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");
                System.out.println("Nissan Frontier - $35.000 ");
                System.out.println("Toyota Fortuner - $54.800 ");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 25000 && presupuesto >35000) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");
                System.out.println("Nissan Frontier - $35.000 ");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto > 25000 && presupuesto >26900) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". A continuación se van a mostrar las opciones que se encuentran dentro de ese rango de presupuesto. (Precio no incluye IVA)");
                System.out.println(" ");

                System.out.println("Nissan Sentra - $22.000 ");
                System.out.println("Toyota Corolla - $26.900 ");

                System.out.println("");
                System.out.println("Gracias por su visita!");

            } else if (presupuesto < 22000) {

                System.out.println("");
                System.out.println("Gracias por la información. El valor que introdujo fue: " + presupuesto
                        + ". Desafortunadamente, en este momento no contamos con vehículos que se encuentren en ese rango de precio.");
                System.out.println(" ");
                System.out.println("Gracias por su visita!");

            }
//        public static void main(String[] args) {
//        Presupuestos h = new Presupuestos();
//        h.info_Presupuesto();     
//        
//}//termina clase
        } // fin del if principal 
//        else if (opc) {
//                
//                
//                } // fin del else if
    }
}
