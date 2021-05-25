package venta_autos;

import java.util.Scanner;
public class Vehiculos_Stock {

    String[] carros = {"Lexus RX350", "Lexus LC500", "Nissan Sentra", "Nissan Frontier", "Toyota Corolla", "Toyota Tundra", "Toyota Fortuner"};
    double[] precios = {210000, 82000, 22000, 35000, 26900, 88000, 54800};

    Scanner leer = new Scanner(System.in);//scanner declarado

//
//    private int seleccion = 0;
//    private double SelecVehiculo = 0;
//    private int contador = 0;
//    
    double total;
    String vehiculo;
    int x;
//    double arrayStock[] = new double[1];

//    public Vehiculos_Stock() {//constructor
//
//    }//termina constructor
    public void InfoStock() {
        System.out.println(" ");
        System.out.println(" ");

        System.out.println("Vehiculos disponibles para entrega inmediata.");

        for (int i = 0; i <= carros.length - 1; i++) {

            System.out.println(i + " " + carros[i] + " $" + precios[i]);

        }
        System.out.println(" ");
        System.out.println("En caso de haber seleccionado inicialmente la opcion comprar, seleccione el vehiculo de su preferencia.");

        System.out.println(" ");

        System.out.println("Si seleccionó la opcion de ver los vehiculos disponibles, presione cualquier tecla para salir. ");
        x = leer.nextInt();
        vehiculo = carros[x];
        total = precios[x];

    }//fin del menu a desplegar
//public static void main(String[] args) {
//        Vehiculos_Stock s = new Vehiculos_Stock();
//        s.InfoStock();

//    }//termina main
}
