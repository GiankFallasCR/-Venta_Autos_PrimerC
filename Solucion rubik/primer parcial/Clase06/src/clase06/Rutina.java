package clase06;

import javax.swing.JOptionPane;

public class Rutina {
 public void Rutina (){
    Mayor M = new Mayor();
    M.setNumero1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el número 1: ")));
    M.setNumero2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el numero 2: ")));
    /**************************************************************************************************/
    M.Valoracion();
}

}
