package clase02;

import javax.swing.JOptionPane;

public class Automovil extends vehiculoMotorizado {
    private String Estilo;
    
    public Automovil(){
        super();
        this.Estilo=" ";
    }

    public String getEstilo() {
        return Estilo;
    }

    public void setEstilo(String Estilo) {
        this.Estilo = Estilo;
    }

    public String getFabricante() {
        return Fabricante;
    }

    public void setFabricante(String Fabricante) {
        this.Fabricante = Fabricante;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public double getKilometraje() {
        return Kilometraje;
    }

    public void setKilometraje(double Kilometraje) {
        this.Kilometraje = Kilometraje;
    }
    
    public void seguridad(){  
        int pasajeros=0;
    if(pasajeros>30){
        JOptionPane.showMessageDialog(null,"Sobrepasa el numero de pasajeros permitidos."); 
    }
    }
}
