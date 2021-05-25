package venta_autos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Mantenimiento {

    private int Dia;
    private final int Mes = 0;
    private final int Hora = 0;
    private final int contador = 1;
    String[] meses = {"Enero", "Febrero", "Marzo" , "Abril" , "Mayo", "Junio", "Julio", "Agosto" , "Setiembre", "Octubre", "Noviembre", "Diciembre"}; 

    public Mantenimiento() {

    }   //termina constructor
    public void Info_Mante() throws ParseException {

        Date fecha_actual = new Date(); // Sistema actual La fecha y la hora se asignan a objDate 

        String strDateFormat = "dd-MM-yyyy"; // El formato de fecha está especificado  
        SimpleDateFormat fecha_formato = new SimpleDateFormat(strDateFormat);
        String f =fecha_formato.format(fecha_actual);

        String[] mes = f.split("-");
        
//        System.out.println(mes[2]);
        int proxMant = Integer.parseInt(mes[1]) + 4; 

        System.out.println("Como cortesía por la compra, le obsequiamos un mantenimiento que podrá utilizar dentro de 4 meses. El mes en el que puede obtener su mantenimeinto es: "+meses[proxMant-1]);


    }//

    }

