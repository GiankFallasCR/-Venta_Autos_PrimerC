package clase02;
import javax.swing.JOptionPane;
public class Camion extends vehiculoMotorizado {
    private int ejes;

    public Camion() {
        super();
        this.ejes = 0;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
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

    public void seguridad() {
        int pasajeros = 0;
        if (pasajeros > 30) {
            JOptionPane.showMessageDialog(null, "Sobrepasa el numero de pasajeros permitidos.");
        }
    }
}
