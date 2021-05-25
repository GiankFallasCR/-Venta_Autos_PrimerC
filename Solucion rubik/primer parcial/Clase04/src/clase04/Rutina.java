package clase04;

import javax.swing.JOptionPane;

public class Rutina {
    public void  Rutina (){
       Trapecio T = new Trapecio();
       Rectangulo R = new Rectangulo();
       Cuadrado C = new Cuadrado ();
       //*********************************************************************************************
       T.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la base mayor del trapecio: ")));
       T.setBaseMenor(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la base menor del trapecio: ")));
       T.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la altura del trapecio: ")));
       T.setLado1(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 1 del trapecio: ")));
       T.setLado2(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 2 del trapecio: ")));
       T.setLado3(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 3 del trapecio: ")));
       T.setLado4(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado 4 del trapecio: ")));
       //*********************************************************************************************
       R.setBase(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la base del rectangulo: ")));
       R.setAltura(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la altura del rectangulo: ")));
       //*********************************************************************************************
       C.setLado(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el lado del cuadrado: ")));
       //*********************************************************************************************
       JOptionPane.showMessageDialog(null,"El area del Trapecio es: "+T.getArea()+"El perimetro del trapecio es: "+T.getPerimetro()
       );
       JOptionPane.showMessageDialog(null,"El area del cuadrado es: "+C.getArea()+"El perimetro del cuadrado es: "+C.getPerimetro()
       );
       JOptionPane.showMessageDialog(null,"El area del rectangulo es: "+R.getArea()+"El perimetro del cuadrado es: "+C.getPerimetro());
    }
}
