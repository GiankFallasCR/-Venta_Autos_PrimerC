package empresa;

import java.util.Set;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Caja c = new Caja();
        Plataforma p = new Plataforma();
    p.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre: "));
    p.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite su salario:")));
    c.setNombre(JOptionPane.showInputDialog(null, "Digite su nombre: "));
    c.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite su salario:")));
        
             JOptionPane.showMessageDialog(null, "Informe:\n"+"nombre: "+p.digitaNombre()+"\nsalario: "+p.calculaSalario()
            +"\n Nombre del cajero: "+c.digitaNombre()+"\nSalario del cajero: "+c.calculaSalario(), "Calculadora de salario", 0);
        
    }
    
}
