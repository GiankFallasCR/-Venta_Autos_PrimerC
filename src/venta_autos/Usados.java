package venta_autos;
import java.util.Scanner;

public class Usados {

    Scanner leer = new Scanner(System.in);

    private double opcion = 0;
    private int seleccion = 0;

    public Usados() {

    }//termina constructor

    public void Info_Usados() {
        double arrayUsados[] = new double[1];

        System.out.println("Actualmente estos son los vehiculos usados que tenemos disponibles.");

        System.out.println("1. BMW X6 = $70.000");
        System.out.println("2. Toyota Fortunner 2016 = $30.000");
        System.out.println("3. Susuki Grand Vitara 2018 = 17.000");

        System.out.println("Por favor seleccione un vehiculo: ");
        seleccion = leer.nextInt();
        if (seleccion == 1) {
            arrayUsados[0] = 70.000;
        }//termina if
        else if (seleccion == 2) {
            arrayUsados[0] = 30.000;
        }//termina else if
        else if (seleccion == 3) {
            arrayUsados[0] = 17.000;
        }//termina else if

    }//termina info usados 

}//termina clase usados
