package venta_autos;

import java.util.Scanner;
public class Extras {

    int total = 0;
    private int seleccion;

    public Extras() {

    }//termina constructor

    public void Info_Extras() {

        Scanner leer = new Scanner(System.in);

        System.out.println("Puede seleccionar maximo 4 extras\n");

        int arrayExtras[] = new int[4];
        for (int i = 0; i < arrayExtras.length; i++) {

            System.out.println("Seleccione la extra que desea, extra numero " + (i+1) + ": ");
                    System.out.println(" ");

            System.out.println("1 . Tapiz de cuero=$1000 \n 2. Camara de reversa=$400 \n 3. Sun roof=$500 \n 4. Aros de lujo=$650 "
                    + "\n 5. Sensor de punto ciego=$725 \n 6. Spoilers deportivos=$1200\n 7. Halogenos=$125 \n 8. Control crucero=$375");

            seleccion = leer.nextInt();

            switch (seleccion) {
                case 1:
                    total = total + 1000;
                    break;

                case 2:
                    total = total + 400;
                    break;

                case 3:
                    total = total + 500;
                    break;

                case 4:
                    total = total + 650;
                    break;

                case 5:
                    total = total + 25;
                    break;

                case 6:
                    total = total + 1200;
                    break;

                case 7:
                    total = total + 125;
                    break;

                case 8:
                    total = total + 75;
                    break;

                default:

                    System.out.println("Seleccione una opcion valida\n");
                    Extras xtras = new Extras();
                    xtras.Info_Extras();
                    break;
                    
                    
            }
            
                    System.out.println(" ");

        }
    }//termina Info_Extras*/
}//termina clase