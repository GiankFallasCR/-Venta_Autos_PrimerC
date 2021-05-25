package clase07;

import javax.swing.JOptionPane;

public class Rutina {
public void Rutina(){
    Operacion O = new Operacion();
    O.setNumero1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un numero: ")));
    O.setNumero2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite otro numero: ")));
    //////////////////////////////////////////////////////////////////////////////////////////
    JOptionPane.showMessageDialog(null,"La suma de los dos numeros es: "+O.Suma()+
            "\nLa resta de los dos numeros es: "+O.Resta()+"\nLa division de los dos numeros es: "+O.Division()
    +"\nLa multiplicacion de los dos numeros es : "+O.Multiplicacion());
}    
}
