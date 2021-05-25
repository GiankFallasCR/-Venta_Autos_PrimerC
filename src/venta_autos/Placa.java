package venta_autos;

import java.util.Scanner;
public class Placa {//aqui se selecciona el numero de placa para un vehiculo nuevo

    private String letras;
    private int num;
    String placa = "";

    public Placa() {

    }//termina constructor

    public void Placa_Info() {
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite las 3 letras que desea colocar en su placa: ");
        letras = leer.next();

        for (int i = 0; i <= 2; i++) {
            if (Character.isLetter(letras.toUpperCase().charAt(i))) {
                placa = placa + letras.toUpperCase().charAt(i);
            } else {
                System.out.println("El valor que se introdujo, no es una letra.\n Intentelo de nuevo.");
                Placa p = new Placa();
                p.Placa_Info();
            }
        }//fin for

        System.out.println("Digite los 3 numeros que desea colocar en su placa: ");
        num = leer.nextInt();

        if (num <= 999 || num >= 100) {
            placa = placa + "-";
            String nums = Integer.toString(num);
            placa = placa + nums;
            
        } else {
            System.out.println("Deber ser un numero de 3 digitos... \n ");
            Placa plca = new Placa();
            plca.Placa_Info();
        }
    }//termina Placa
}