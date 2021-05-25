
package herencia01;

import javax.swing.JOptionPane;

public class Rutina {
    public void procesar (){
        Trabajador t=new Trabajador();
        t.setNombre(JOptionPane.showInputDialog(null,"Digite su nombre"));
        t.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Digite la edad")));
        t.setSalario(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el salario")));
        JOptionPane.showMessageDialog(null,t.getNombre()+" \n Tiene "+t.getEdad()+" \n Recibe un salario de "
                +t.getSalario()+"\n Sus deducciones semanales son "+t.getDeduc()+"\n Su salario es "+t.getSalario());
        t.mostrarMensaje();//la herencia ayuda a reducir codigo
                
    }
}
