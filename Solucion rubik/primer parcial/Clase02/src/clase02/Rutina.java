package clase02;
import javax.swing.JOptionPane;
public class Rutina {
public Rutina(){
Motocicleta M=new Motocicleta();
Automovil A = new Automovil();
Camion C = new Camion();
 //*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//**//*
M.setAñoFabricacion(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite el año de fabricacion: ")));
}
}
