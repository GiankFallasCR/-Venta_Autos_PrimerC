package interface01;

import javax.swing.JOptionPane;

public class main {
    public static void main(String[] args) {
Triangulo t = new Triangulo ();
    t.setBase(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite la base")));
    t.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la altura")));
    JOptionPane.showMessageDialog(null,"Area:"+t.calcularArea()+"\nPerimetro: "+t.calcularPerim());
    
    } 
    
}
