package clase02;

import javax.swing.JOptionPane;

public class vehiculoMotorizado {

    protected String Fabricante;
    protected String Modelo;
    protected int añoFabricacion;
    protected double Kilometraje;

    public void Seguridad() {
         
        int pasajeros=0;
    if(pasajeros>30){
        JOptionPane.showMessageDialog(null,"Sobrepasa el numero de pasajeros permitidos."); 
    }
    }
}
