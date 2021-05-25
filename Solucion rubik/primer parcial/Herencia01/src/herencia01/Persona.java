package herencia01;

import javax.swing.JOptionPane;

public class Persona {
    protected  String nombre;
    protected byte edad;
    protected double salarioNeto;
    
    public Persona (){
        this.nombre=" ";
        this.edad=0;
        this.salarioNeto=0.00;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }
    public void mostrarMensaje(){
        JOptionPane.showMessageDialog(null, " Se han realizado los calculos correctamente!");
    }
}
