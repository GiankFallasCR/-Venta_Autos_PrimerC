package interface03;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int Dato=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite un valor entero: "));
        Calculo c = new Calculo();
        c.setDato(Dato);
        JOptionPane.showMessageDialog(null,"Area "+c.calcularArea()+"\nPerimetro: "+c.calcularPerim());
        c.mostrarMensaje();
        JOptionPane.showMessageDialog(null,"Area del circulo: "+c.calcularAreaC()+"\nPerimetro del circulo: "+c.calcularPeriC());
    }
    
}
